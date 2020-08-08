package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String key = args[0];
//        String key = "-d";

        String pathToFile = args[1];
//        String pathToFile = "D:\\file1.txt";

        String pathToOutputFile = args[2];
//        String pathToOutputFile = "D:\\file2.txt";

        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(pathToFile));
             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(pathToOutputFile))) {
            if (key.equals("-e")) {
                while (inputStream.available() > 0) {
                    int i = inputStream.read();
                    outputStream.write(i ^ 0b11111111);
                }
            } else if (key.equals("-d")) {
                while (inputStream.available() > 0) {
                    int i = inputStream.read();
                    outputStream.write(i ^ 0b11111111);
                }
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
