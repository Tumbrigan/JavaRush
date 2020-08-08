package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        int n = 5;
        for (int i = 0; i < n; i++) {
            String str = reader.readLine();
            strings.add(str);
        }
        int maxSize = 0;

        for (String s : strings) {
            if (s.length() > maxSize) {
                maxSize = s.length();
            }
        }

        for (String s : strings) {
            if (s.length() == maxSize) {
                System.out.println(s);
            }
        }
    }
}
