package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

/* 
Генератор паролей
*/
public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        Random rand = new Random();
        String password = rand.ints(48, 123)
                .filter(i -> (i <= 57 || (i >= 65 && i <= 90) || i >= 97))
                .limit(8)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        if (password.matches(".*[a-z]+") && password.matches(".*[A-Z]+.*") && password.matches(".*[0-9]+.*")) {
            try {
                outputStream.write(password.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            outputStream = getPassword();
        }
        return outputStream;
    }
}