package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            boolean t = true;
            String name = null;
            while (t) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message message = connection.receive();
                if (message.getType() == MessageType.USER_NAME && message.getData() != null && message.getData() != "") {
                    if (!connectionMap.containsKey(message.getData())) {
                        name = message.getData();
                        connectionMap.put(name, connection);
                        connection.send(new Message(MessageType.NAME_ACCEPTED));
                        ConsoleHelper.writeMessage(message.getData() + " принято");
                        t = false;
                    }
                }
            }
            return name;
        }

        private void notifyUsers(Connection connection, String userName) throws IOException {
            for (Map.Entry<String, Connection> entry : connectionMap.entrySet()) {
                if (!userName.equals(entry.getKey()))
                    connection.send(new Message(MessageType.USER_ADDED, entry.getKey()));
            }
        }

        // Чат (10)
        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message.getType() == MessageType.TEXT) {
                    String messageText = userName + ": " + message.getData();
                    sendBroadcastMessage(new Message(MessageType.TEXT, messageText));
                } else {
                    ConsoleHelper.writeMessage("The message is incorrect");
                }
            }
        }
        
        // Чат (11)
        @Override
        public void run() {
            ConsoleHelper.writeMessage("connection established: " + socket.getRemoteSocketAddress().toString());
            try {
                Connection connection = new Connection(socket);
                String userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                notifyUsers(connection, userName);
                serverMainLoop(connection, userName);
                connectionMap.remove(userName);
                sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
                ConsoleHelper.writeMessage("Connection is closed");
            } catch (IOException e) {
                ConsoleHelper.writeMessage("IOException");
            } catch (ClassNotFoundException ex) {
                ConsoleHelper.writeMessage("ClassNotFoundException");
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void sendBroadcastMessage(Message message) {
        for (Connection c : connectionMap.values()) {
            try {
                c.send(message);
            } catch (IOException e) {
                System.out.println("Cannot send the message" + message.getType() + message.getData());
            }
        }
    }

    public static void main(String[] args) {
        int socketID = ConsoleHelper.readInt();

        try (ServerSocket serverSocket = new ServerSocket(socketID)) {
            System.out.println("Server started");
            while (true) {
                Socket socket = serverSocket.accept();
                new Server.Handler(socket).start();
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
