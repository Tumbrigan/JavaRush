package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String filePathOne = bufferedReader.readLine();
            String filePathTwo = bufferedReader.readLine();
            String filePathThree = bufferedReader.readLine();

            char[] charsFileTwo = new char[new FileInputStream(filePathTwo).available()];
            char[] charsFileThree = new char[new FileInputStream(filePathThree).available()];

            try (BufferedReader readerFromFileTwo = new BufferedReader(new FileReader(filePathTwo));
                 BufferedReader readerFromFileThree = new BufferedReader(new FileReader(filePathThree));
                 BufferedWriter writerToFileOne = new BufferedWriter(new FileWriter(filePathOne, true), 64)) {

               readerFromFileTwo.read(charsFileTwo);
               readerFromFileThree.read(charsFileThree);

               writerToFileOne.write(charsFileTwo);
               writerToFileOne.write(charsFileThree);

            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
