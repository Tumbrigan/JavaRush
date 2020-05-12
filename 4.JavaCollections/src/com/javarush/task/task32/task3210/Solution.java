package com.javarush.task.task32.task3210;

/* 
Используем RandomAccessFile
*/

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class Solution {
    public static void main(String... args) {
        try (RandomAccessFile raf = new RandomAccessFile(args[0], "rw")) {
//        try (RandomAccessFile raf = new RandomAccessFile("D:\\Test\\test.txt", "rw")) {
            long number = Long.parseLong(args[1]);
//            long number = Long.parseLong("20");
            raf.seek(number);
            String text = args[2];
//            String text = "three";
            byte[] bytes = new byte[text.length()];
            raf.read(bytes, 0, text.length());
            String read = new String(bytes);
            raf.seek(raf.length());
            if (read.equals(text))
                raf.write("true".getBytes());
            else
                raf.write("false".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
