package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, b;
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        if (a <= 0 || b <= 0) {
            throw new Exception();
        } else {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            System.out.println(a);
        }
    }
}
