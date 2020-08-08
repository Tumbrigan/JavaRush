package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();

        int iterations = 5;
        for (int i = 0; i < iterations; i++) {
                arrayList.add(reader.readLine());
        }

        arrayList.remove(2);

        int n = arrayList.size();
        for (int i = n - 1; i >= 0; i--) {
                System.out.println(arrayList.get(i));
        }
    }
}
