package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        List<String> words = new ArrayList<>();
        List<String> longWords = new ArrayList<>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String line : lines) {
            words.addAll(Arrays.asList(line.split(" ")));
        }

        for (String word : words) {
            if (word.length() > 6) longWords.add(word);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {
            for (int i = 0; i < longWords.size() - 1; i++) {
                writer.write(longWords.get(i) + ",");
            }
            writer.write(longWords.get(longWords.size() - 1));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
