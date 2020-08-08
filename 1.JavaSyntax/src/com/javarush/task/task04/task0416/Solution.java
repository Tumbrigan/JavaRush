package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        System.out.println("Write here");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        double doub = Double.parseDouble(str);
        double d = doub % 5;
        if (d >= 4) {
            System.out.println("красный");
        } else if (d < 3) {
            System.out.println("зелёный");
        } else {
            System.out.println("жёлтый");
        }
    }
}