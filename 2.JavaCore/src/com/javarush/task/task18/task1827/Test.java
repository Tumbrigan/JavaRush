package com.javarush.task.task18.task1827;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception {
        String line = "19846   Шорты пляжные";
        int ID = Integer.parseInt(line.substring(0, 8));

        System.out.println(++ID);
    }
}
