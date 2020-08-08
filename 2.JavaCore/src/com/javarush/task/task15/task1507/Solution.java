package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(String str) {
        System.out.println(str);
    }

    public static void printMatrix(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    public static void printMatrix() {
        System.out.println("Hi there");
    }

    public static void printMatrix(double d, int i) {
        System.out.println(d + " " + i);
    }

    public static void printMatrix(int i, double d) {
        System.out.println(i + " " + d);
    }

    public static void printMatrix(Object o) {
        Object a = o;
        System.out.println(a);
    }

    public static void printMatrix(String str1, String str2) {
        System.out.println(str1);
        System.out.println(str2);
    }

    public static void printMatrix(String str, double d) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(d);
        }
    }
}