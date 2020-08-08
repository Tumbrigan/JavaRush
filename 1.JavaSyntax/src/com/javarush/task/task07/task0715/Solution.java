package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("мама");
        arrayList.add("мыла");
        arrayList.add("раму");

        String str = "именно";

        arrayList.add(arrayList.indexOf("мама") + 1, str);
        arrayList.add(arrayList.indexOf("мыла") + 1, str);
        arrayList.add(arrayList.indexOf("раму") + 1, str);

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
