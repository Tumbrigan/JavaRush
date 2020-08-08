package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        List<String> allLines = new ArrayList<String>();

        String filePath1 = "D:\\file1.txt";

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(filePath1));

        allLines = Files.readAllLines(Paths.get(bufferedReader1.readLine()));

        System.out.println(allLines);
    }
}
