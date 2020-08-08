package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        String pathToFile;

        try (BufferedReader pathToFileReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (!(pathToFile = pathToFileReader.readLine()).equals("exit")) {
                Thread readThread = new ReadThread(pathToFile);
                readThread.start();
                readThread.join();
            }
        } catch (IOException e) {
            e.getMessage();
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут
        @Override
        public void run() {
            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
                int[] ints = new int[256];
                while (fileReader.ready()) {
                    int temp = fileReader.read();
                    ints[temp]++;
                }
                int max = 0;
                int index = 0;
                for (int i = 0; i < ints.length; i++) {
                    if (max < ints[i]) {
                        max = ints[i];
                        index = i;
                    }
                }
                resultMap.put(fileName, index);
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }
}