package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        String pathToFile = null;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                pathToFile = bufferedReader.readLine();
                try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {

                }
            }
        } catch (IOException e) {
            if (pathToFile != null)
                System.out.println(pathToFile);
        }
    }
}
