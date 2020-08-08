package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        int id;
        String name;
        String idS;

        do {
            idS = reader.readLine();
            if (!idS.isEmpty()) {
            id = Integer.parseInt(idS);
            name = reader.readLine();

            map.put(name, id);
            }
        } while (!idS.isEmpty());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
