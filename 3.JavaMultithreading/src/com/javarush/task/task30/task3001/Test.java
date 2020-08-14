package com.javarush.task.task30.task3001;

public class Test {
    public static void main(String[] args) {
        String s = "0x16";
        int x = Integer.valueOf(s, 16);
        System.out.println(x);

        int i = 0x16;
    }
}
