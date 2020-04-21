package com.javarush.task.task24.task2407;

public class Test {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("мяу");
        int index = stringBuilder.lastIndexOf("я");

        for (int i = 0; i < 3; i++) {
            stringBuilder.insert(index, "я");
        }
        System.out.println(stringBuilder.toString());
    }
}
