package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(100, 0.95));
        System.out.println(convertEurToUsd(200, 0.89));

    }

    public static double convertEurToUsd(int eur, double course) {
        double converted = eur * course;
        return converted;
        //напишите тут ваш код

    }
}
