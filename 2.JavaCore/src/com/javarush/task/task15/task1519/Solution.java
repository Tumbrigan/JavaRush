package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        do {
            str = reader.readLine();
            if (!str.equals("exit")) {
                if (str.contains(".")) {
                    try {
                        print(Double.parseDouble(str));
                    } catch (NumberFormatException exc) {
                        print(str);
                    }
                } else {
                        try {
                            int i = Integer.parseInt(str);
                            System.out.println("i = " + i);
                            if (i <= 0 || i >= 128) print(i);
                            else print((short)i);
                        } catch (NumberFormatException exc) {
                            print(str);
                        }
                    }
                }
            } while (!str.equals("exit")) ;
        }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
