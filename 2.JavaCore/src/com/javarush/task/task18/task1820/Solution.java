package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader filePathReader = new BufferedReader(new InputStreamReader(System.in))) {
            String pathToFirstFile = filePathReader.readLine();
            String pathToSecondFile = filePathReader.readLine();

            try (BufferedReader fileReader = new BufferedReader(new FileReader(pathToFirstFile));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(pathToSecondFile))) {
                String readLine;

                while ((readLine = fileReader.readLine()) != null) {
                    String[] doubles = readLine.split(" ");
                    for (String s : doubles)
                        fileWriter.write((int)Math.round(Double.parseDouble(s)) + " ");
                }
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
