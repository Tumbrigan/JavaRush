package com.javarush.task.task25.task2511;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        String threadName = thread.getName();
        String finalS = threadName.replaceAll(".", "*");
        System.out.println(threadName);
        System.out.println(finalS);
        try {
            throw new IOException("Hello");
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
