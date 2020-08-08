package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int i;
        int z = 1;
        for(i = 1; i <= 10; i++ ) {
            z *= i;
            //System.out.println(z);
        }
        System.out.println(z);
    }
}
