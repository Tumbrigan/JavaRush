package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String filePathOne = bufferedReader.readLine();
            String filePathTwo = bufferedReader.readLine();

            try (BufferedReader fileReader1 = new BufferedReader(new FileReader(filePathOne));
                 BufferedReader fileReader2 = new BufferedReader(new FileReader(filePathTwo));
                 BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filePathOne))) {

                char[] charsFileOne = new char[new FileInputStream(filePathOne).available()];
                char[] charsFileTwo = new char[new FileInputStream(filePathTwo).available()];
                fileReader1.read(charsFileOne);
                fileReader2.read(charsFileTwo);

                fileWriter.write(charsFileTwo);
                fileWriter.write(charsFileOne);
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
