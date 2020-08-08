package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n >= 1 && n <= 999) {
            if (n >= 100) {
                if (n % 2 == 0) System.out.println("четное трехзначное число");
                else System.out.println("нечетное трехзначное число");
            }
            if (n >= 10 && n < 100) {
                if (n % 2 == 0) System.out.println("четное двузначное число");
                else System.out.println("нечетное двузначное число");
            }
            if (n < 10) {
                if (n % 2 == 0) System.out.println("четное однозначное число");
                else System.out.println("нечетное однозначное число");
            }
        }

    }
}
