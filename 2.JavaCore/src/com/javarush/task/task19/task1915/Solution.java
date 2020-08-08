package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = bufferedReader.readLine();
//        String filePath = "D:\\output.txt";
        bufferedReader.close();

        FileOutputStream fileOutputStream = new FileOutputStream(filePath);

        PrintStream originalSystemOut = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream fakeSystemOut = new PrintStream(byteArrayOutputStream);

        System.setOut(fakeSystemOut);

        testString.printSomething();

        String result = byteArrayOutputStream.toString();

        fileOutputStream.write(result.getBytes());
        fileOutputStream.close();

        System.setOut(originalSystemOut);

        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

