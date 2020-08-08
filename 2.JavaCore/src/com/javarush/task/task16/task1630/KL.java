package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class KL {
    public static void main(String[] args) throws IOException {
        String s;
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\iKucher\\Desktop\\Coding\\file1.txt"));
        while ((s = reader.readLine()) != null) {
            System.out.println(s);
        }

    }
}
