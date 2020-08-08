package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        String[] array = string.split(" ");
        String newString = "";

        for (int i = 0; i < array.length; i++) {
            if (!array[i].isEmpty()) {
                String str = array[i].substring(0, 1).toUpperCase() + array[i].substring(1);
                newString += str + " ";
            }
        }
        newString = newString.substring(0, newString.length()-1);

        System.out.println(newString);


        //напишите тут ваш код
    }
}
