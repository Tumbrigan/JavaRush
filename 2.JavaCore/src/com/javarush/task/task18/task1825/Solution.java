package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader pathToFileReader = new BufferedReader(new InputStreamReader(System.in))) {
            String pathToFile;
            Map<String, String> map = new TreeMap<>();

            while (!(pathToFile = pathToFileReader.readLine()).equals("end")) {
                map.put(pathToFile.substring(pathToFile.lastIndexOf(".") + 1), pathToFile);
            }

            for (Map.Entry<String, String> entry : map.entrySet()) {
                String path = entry.getValue();
                String pathToWrite = path.substring(0, path.lastIndexOf("."));
                char[] symbols = new char[new FileInputStream(path).available()];
                try (BufferedReader fileReader = new BufferedReader(new FileReader(path));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathToWrite, true))) {
                    fileReader.read(symbols);
                    bufferedWriter.write(symbols);
                }
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
