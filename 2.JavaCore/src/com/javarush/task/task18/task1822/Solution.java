package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader pathToFileReader = new BufferedReader(new InputStreamReader(System.in))) {
            String pathToFile = pathToFileReader.readLine();

            try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
                List<String> lines = new ArrayList<>();
                String str;
                while ((str = reader.readLine()) != null) {
                    lines.add(str);
                }

                Map<String, String> map = new HashMap<>();

                for (String s : lines) {
                    map.put(s.substring(0, s.indexOf(" ")), s);
                }

                System.out.println(map.get(args[0]));
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
