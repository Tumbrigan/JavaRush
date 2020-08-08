package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        int m2 = min(a, b);
        if (m2 < c & m2 < d){
            return m2;
        }   
        if (c < m2 & c < d) {
        return c;
        }
        if (d < c & d < m2) {
            return d;}
        return m2; 
        
        
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        int two = (a < b ? a : b);
        return two;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}