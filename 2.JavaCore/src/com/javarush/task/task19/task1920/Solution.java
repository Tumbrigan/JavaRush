package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            Map<String, Double> map = new TreeMap<>();
            double max = 0.0;

            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.length() > 0) {
                    String[] prop = line.split(" ");
                    String lastName = prop[0];
                    double salary = Double.parseDouble(prop[1]);
                    if (map.get(lastName) != null) {
                        map.put(lastName, salary + map.get(lastName));
                    } else {
                        map.put(lastName, salary);
                    }
                    max = Math.max(map.get(lastName), max);
                }
            }

            for (Map.Entry<String, Double> entry : map.entrySet()) {
                if (entry.getValue().compareTo(max) == 0)
                    System.out.println(entry.getKey());
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
