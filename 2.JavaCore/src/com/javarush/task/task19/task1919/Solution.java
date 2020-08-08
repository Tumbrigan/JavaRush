package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            Map<String, Double> map = new TreeMap<>();

            String line;

            while ((line = fileReader.readLine())!= null) {
                if (line.length() > 0) {
                    String lastName = line.trim().substring(0, line.indexOf(" "));
                    double salary = Double.parseDouble(line.substring(line.indexOf(" ") + 1));
                    if (map.get(lastName) != null) {
                        double d = map.get(lastName) + salary;
                        map.put(lastName, d);
                    } else {
                        map.put(lastName, salary);
                    }
                }
            }

            for (Map.Entry<String, Double> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
