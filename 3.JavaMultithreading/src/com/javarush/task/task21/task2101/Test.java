package com.javarush.task.task21.task2101;

public class Test {
    public static void main(String[] args) {
        byte x = (byte)192;
        String value = Integer.toString(x, 16);

        System.out.println(x&0b11111111);
    }
}