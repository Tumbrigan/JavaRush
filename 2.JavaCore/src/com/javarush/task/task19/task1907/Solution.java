package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = bufReader.readLine();
//        String filePath = "D:\\worlds.txt";
        bufReader.close();

        FileReader fileReader = new FileReader(filePath);
        Scanner scanner = new Scanner(fileReader);

        int count = 0;

        while (scanner.hasNextLine()) {
            String[] words = scanner.next().split("\\W");
            for (String s : words) {
//                if (s.matches("(.*?world.*?)*"))
                if (s.equals("world"))
                    count++;
            }
        }

        fileReader.close();
        scanner.close();

        System.out.println(count);
    }
}
