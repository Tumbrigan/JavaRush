package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String ... args) {
        // напишите тут ваш код
        String fileName = "";
        String line;
        int i;
        ArrayList<Integer> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        } catch (IOException exc) {
            System.out.println("Can't read file's name");
        }

        try (BufferedReader bufferedReader =
                     new BufferedReader(
                             new InputStreamReader(
                                     new FileInputStream(fileName)))) {
            do {
                line = bufferedReader.readLine();
                if (line != null) {
                    i = Integer.parseInt(line);
                    if (i % 2 == 0)
                    list.add(i);
                }
//                if (i % 2 == 0) {
//                    System.out.println((char) i);
//                }
            } while (line != null);
        } catch (IOException exc) {
            System.out.println("Can't read");
        }

        Collections.sort(list);

        for (int str : list) {
            System.out.println(str);
        }
    }
}

// D:\Tests\src\friday\Numbers.txt