package com.javarush.task.task18.task1801;

import java.io.*;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream stream = new FileInputStream(fileName);

        int i;
        int max = -1;
        while ((i = stream.read()) != -1) {
            max = Math.max(max, i);
        }
        reader.close();
        stream.close();

        System.out.println(max);
    }
}
