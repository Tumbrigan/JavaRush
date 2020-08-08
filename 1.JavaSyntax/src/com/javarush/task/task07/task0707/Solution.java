package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> array = new ArrayList<>();
        array.add("Hi");
        array.add("My name is Paul Corney");
        array.add("I am a traveler");
        array.add("The weather is good");
        array.add("How are you?");

        System.out.println(array.size());
        for (String str : array) {
            System.out.println(str);
        }
    }
}
