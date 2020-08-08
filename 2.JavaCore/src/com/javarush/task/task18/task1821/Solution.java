package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {

        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(args[0]))) {
//        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("D:\\file1.txt"))) {
            Map<Integer, Integer> map = new TreeMap<>();

            while (inputStream.available() > 0) {
                int i = inputStream.read();
                if (!map.containsKey(i)) {
                    map.put(i, 1);
                } else {
                    int n = map.get(i);
                    map.put(i, ++n);
                }
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.println( (char)(int)entry.getKey() + " " + entry.getValue());
            }

        } catch (IOException e) {
            e.getMessage();
        }
    }
}
