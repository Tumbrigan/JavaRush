package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String filePath = args[0];
//        String filePath = "D:\\file1.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            char[] chars = new char[new FileInputStream(filePath).available()];
            int sum = bufferedReader.read(chars);
            int count = 0;

            for (char ch : chars) {
                if (String.valueOf(ch).matches(" "))
                    count++;
            }

            if (count != 0)
                System.out.printf("%.2f",(double) count / sum * 100);
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
