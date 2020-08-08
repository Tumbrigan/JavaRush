package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        String str4 = br.readLine();

        int number1 = Integer.parseInt(str1);
        int number2 = Integer.parseInt(str2);
        int number3 = Integer.parseInt(str3);
        int number4 = Integer.parseInt(str4);

        int maxValue = Integer.max(Integer.max(number1, number2), Integer.max(number3, number4));

        System.out.println(maxValue);


    }
}
