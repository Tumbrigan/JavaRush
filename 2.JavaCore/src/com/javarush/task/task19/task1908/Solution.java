package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileForReading = bufferedReader.readLine();
//        String fileForReading = "D:\\file1.txt";

        String fileForWriting = bufferedReader.readLine();
//        String fileForWriting = "D:\\file2.txt";

        bufferedReader.close();

        FileReader fileReader = new FileReader(fileForReading);
        BufferedReader bufferedFileReader = new BufferedReader(fileReader);
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileForWriting));

        String str;

        while ((str = bufferedFileReader.readLine()) != null) {
            String[] strings = str.split("\\s");       // .12 text var2 14 8ю 1
            for (String s : strings) {
                if (s.matches("\\b\\d+\\b")) {
                    fileWriter.write(s + " ");
                }
            }
        }

        fileReader.close();
        bufferedFileReader.close();
        fileWriter.close();
    }
}
