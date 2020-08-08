package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String URL = br.readLine();

            URL = URL.substring(URL.indexOf("?") + 1);
//            System.out.println(URL);

            String[] params = URL.split("&");

            for (String p : params) {
                if (p.contains("=")) {
                    System.out.print(p.substring(0, p.indexOf("=")) + " ");
                } else {
                    System.out.print(p + " ");
                }
            }

            System.out.println();

            for (String p : params) {
                if (p.contains("obj")) {
                    try {
                        double d = Double.parseDouble(p.substring(p.indexOf("=") + 1));
                        alert(d);
                    } catch (NumberFormatException e) {
                        alert(p.substring(p.indexOf("=") + 1));
                    }
                }
            }
        } catch (
                IOException e) {
            e.getMessage();
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
