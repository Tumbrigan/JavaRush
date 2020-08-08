package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
             FileInputStream inputStream = new FileInputStream(args[0])) {
            int count = 0;
            char[] chars = new char[inputStream.available()];
            bufferedReader.read(chars);
            for (char ch : chars) {
                if (String.valueOf(ch).matches("[a-zA-Z]"))
                    count++;
            }
            System.out.println(count);
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
