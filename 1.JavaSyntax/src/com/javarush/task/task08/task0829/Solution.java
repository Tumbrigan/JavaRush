package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> listCity = new ArrayList<>();
        List<String> listFamily = new ArrayList<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            } else {
                String family = reader.readLine();
                listCity.add(city);
                listFamily.add(family);
            }
        }

        // Read the house number
        String city = reader.readLine();

        int index = listCity.indexOf(city);
        System.out.println(listFamily.get(index));
    }
}
