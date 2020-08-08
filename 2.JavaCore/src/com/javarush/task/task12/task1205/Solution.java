package com.javarush.task.task12.task1205;

/* 
Определимся с животным
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //Напишите тут ваше решение
        String str = o.getClass().getSimpleName();
//        System.out.println(str);
        String animal = "";
        switch (str) {
            case "Cow":
                animal = "Корова";
                break;
            case "Dog":
                animal = "Собака";
                break;
            case "Whale":
                animal = "Кит";
                break;
            default:
                animal = "Неизвестное животное";
                break;
        }
        return animal;
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
