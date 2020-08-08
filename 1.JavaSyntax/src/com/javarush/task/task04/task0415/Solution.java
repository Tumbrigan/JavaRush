package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String aSide = br.readLine();
        String bSide = br.readLine();
        String cSide = br.readLine();

        int a = Integer.parseInt(aSide);
        int b = Integer.parseInt(bSide);
        int c = Integer.parseInt(cSide);

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }

    }
}