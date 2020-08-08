package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name = null;
    int age = 5;
    int weight = 5;
    String address = null;
    String color = "black";

    public void initialize(String name) {
        this.name = name;
        int age = this.age;
        int weight = this.weight;
        String color = this.color;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        int weight = this.weight;
        String color = this.color;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        String color = this.color;
    }

    public void initialize(int weight, String color) {
        int age = this.age;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        int age = this.age;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
