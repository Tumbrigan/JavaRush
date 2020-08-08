package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //System.out.println("Enter your code here: ");

        String str1 = br.readLine();
        String str2 = br.readLine();

        int x1 = Integer.parseInt(str1);
        int x2 = Integer.parseInt(str2);

        int min = Integer.min(x1, x2);
        System.out.println(min);


    }
}