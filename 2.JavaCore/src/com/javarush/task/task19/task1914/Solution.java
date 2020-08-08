package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream originalSystemOut = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream fakeSystemOut = new PrintStream(byteArrayOutputStream);

        System.setOut(fakeSystemOut);

        testString.printSomething();

        String[] strings = byteArrayOutputStream.toString().split(" ");

        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[2]);

        String result = null;

        switch (strings[1]) {
            case "-":
                result = strings[0] + " - " + strings[2] + " = " + (a - b);
                break;
            case "+":
                result = strings[0] + " + " + strings[2] + " = " + (a + b);
                break;
            case "*":
                result = strings[0] + " * " + strings[2] + " = " + (a * b);
                break;
        }

        System.setOut(originalSystemOut);

        if (result != null)
            System.out.println(result);
    }


    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

