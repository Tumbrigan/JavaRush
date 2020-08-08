package com.javarush.task.task03.task0325;

import java.io.*;

public class Test {
    public static void main(String[] args) {

        String outputFileName = "file.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
                String line;
                while (!(line = reader.readLine()).equals("exit")) { // Прерывание цикла при написании строки exit
                    writter.write(line + "\n");
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
