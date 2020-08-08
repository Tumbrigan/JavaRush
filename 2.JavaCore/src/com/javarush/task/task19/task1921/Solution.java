package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
            while (reader.ready()) {
                String line = reader.readLine();
                String name = line.replaceAll("\\d", "").trim();
                String date = line.replace(name, "").trim();
                PEOPLE.add(new Person(name, sdf.parse(date))); }
        } catch (Exception e) {
            e.printStackTrace();
        }
//
//        for (Person p : PEOPLE) {
//            System.out.println(p);
//        }
    }
}
