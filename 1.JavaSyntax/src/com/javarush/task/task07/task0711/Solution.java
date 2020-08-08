package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = 5;
        int iterations = 13;

        for (int i = 0; i < arraySize; i++) {
            arrayList.add(reader.readLine());
        }

        for (int i = 0; i < iterations; i++) {
            arrayList.add(0, arrayList.remove(arrayList.size() - 1));
        }

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
