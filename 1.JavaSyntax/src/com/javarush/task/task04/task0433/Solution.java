package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 0;
        int j = 0;

        String string = "S";
        String str = "";

        while (i < 10) {
            while (j < 10) {
                str += string;
                j++;
            }
            System.out.println(str);
            i++;
        }

    }
}
