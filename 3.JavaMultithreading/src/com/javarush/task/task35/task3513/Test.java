package com.javarush.task.task35.task3513;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int randomInt = new Random().nextInt(50);
            System.out.println(randomInt);
        }
    }
}
