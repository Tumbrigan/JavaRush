package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arrayList = new ArrayList<>();
        int iterations = 10;

        for (int i = 0; i < iterations; i++) {
            arrayList.add(0, reader.readLine());
        }

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
