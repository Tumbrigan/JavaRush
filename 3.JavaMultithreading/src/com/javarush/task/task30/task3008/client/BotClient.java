package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BotClient extends Client {
    public class BotSocketThread extends SocketThread {
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. " +
                    "Понимаю команды: дата, день, месяц, год," +
                    " время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
            if (message.contains(":")) {
                String name = message.substring(0, message.indexOf(":"));
                String command = message.substring(message.indexOf(":") + 2);
                String dateFormat = null;
                Calendar date = new GregorianCalendar();
                switch (command) {
                    case "дата":
                        dateFormat = "d.MM.YYYY";
                        break;
                    case "день":
                        dateFormat = "d";
                        break;
                    case "месяц":
                        dateFormat = "MMMM";
                        break;
                    case "год":
                        dateFormat = "YYYY";
                        break;
                    case "время":
                        dateFormat = "H:mm:ss";
                        break;
                    case "час":
                        dateFormat = "H";
                        break;
                    case "минуты":
                        dateFormat = "m";
                        break;
                    case "секунды":
                        dateFormat = "s";
                        break;
                    default:
                        return;
                }
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
                    sendTextMessage("Информация для " + name + ": " + simpleDateFormat.format(date.getTime()));
            }
        }
    }

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected String getUserName() {
        return "date_bot_" + (int) (Math.random() * 100);
    }

    public static void main(String[] args) {
        BotClient botClient = new BotClient();
        botClient.run();
    }
}
