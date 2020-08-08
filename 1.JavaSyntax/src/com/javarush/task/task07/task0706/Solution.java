package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] numbers = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int occupantsOddSide = 0;
        int occupantsEvenSide = 0;

        for (int i = 0; i < numbers.length; i++) {
            int n = Integer.parseInt(reader.readLine());
            numbers[i] = n;
            if (i % 2 == 0 || i == 0) {
                occupantsEvenSide += n;
            } else {
                occupantsOddSide += n;
            }

        }
        if (occupantsEvenSide > occupantsOddSide) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
