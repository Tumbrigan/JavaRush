package com.javarush.task.task19.task1906;

/* 
Четные символы
*/


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String file1 = bufferedReader.readLine();
            String file2 = bufferedReader.readLine();
            FileReader reader = new FileReader(file1);
            FileWriter writer = new FileWriter(file2);

            List<Integer> list = new ArrayList<>();

//            reader.read(list);

            while (reader.ready()) {
                int ch = reader.read();
                list.add(ch);
            }

            for (int i = 0; i < list.size(); i++) {
                if (i % 2 != 0) {
                    int ch = list.get(i);
                    writer.write(ch);
                }
            }

            reader.close();
            writer.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

//D:\\filee.txt