package com.javarush.task.task02.task0211;

/* 
Самое нужное число
*/
public class Solution {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        y = y + 3 * x;  // 3
//        x = x * 2;  // 2
        x = x * 16; // 32
//        y = y + 2 * x;  // 65
        y = y + x;  // 97

        System.out.println(y);
    }
}
