package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int year = Integer.parseInt(str);
        int leapYear = 366;
        int ordinaryYear = 365;

        if (year % 400 == 0 && year % 100 == 0) {
            System.out.println("количество дней в году: " + leapYear);
//            System.out.println("да");
        } else if (year % 100 != 0 && year % 4 == 0) {
            System.out.println("количество дней в году: " + leapYear);
//            System.out.println("да 2");
        } else {
            System.out.println("количество дней в году: " + ordinaryYear);
//            System.out.println("нет");
        }
    }
}