package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        int quantity = 10;

        for (int i = 0; i < quantity; i++) {
                arrayList.add(reader.readLine());
        }

        int min = arrayList.get(0).length();
        int max = 0;
        int minIndex = 0;
        int maxIndex = 0;

        for (String s : arrayList) {
            if (s.length() > max) {
                max = s.length();
                maxIndex = arrayList.indexOf(s);
            }

            if (s.length() < min) {
                min = s.length();
                minIndex = arrayList.indexOf(s);
            }
        }

        for (String s : arrayList) {
                if (arrayList.indexOf(s) == minIndex || arrayList.indexOf(s) == maxIndex) {
                    System.out.println(s);
                    break;
                }
        }
    }
}