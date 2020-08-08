package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        FileInputStream fis = null;
        String fileName = "";
        String line;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        } catch (IOException exc) {
            System.out.println("Exception");
        }
        BufferedReader reader;
        try {
            FileInputStream fuck = new FileInputStream(fileName);
            reader = new BufferedReader(new InputStreamReader(fuck));
            try  {
                do {
                    line = reader.readLine();
                    if (line != null) {
                        System.out.println(line);
                    }
                } while (line != null);
            } catch (IOException exc) {
                System.out.println("Exception again");
            }
        try {
            fuck.close();
        } catch (IOException exc) {
            System.out.println("Yep");
        }
        } catch (FileNotFoundException exc) {
            System.out.println("File is not found");
        }
    }
}