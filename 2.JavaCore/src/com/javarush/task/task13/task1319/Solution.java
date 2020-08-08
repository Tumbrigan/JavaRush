package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

// D:\Tests\src\friday\Second.txt

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        String fileName = "";


        try {
            fileName = reader.readLine();
            String toList;
            do {
                toList = reader.readLine();
                list.add(toList);
            } while (!toList.equals("exit"));

        } catch (IOException exc) {
            System.out.println(exc.toString());
        } finally {
            try {
                reader.close();
            } catch (IOException exc) {
                System.out.println("Can't close \"reader\"");
            }
        }

        if (!fileName.isEmpty()) {
            try (BufferedWriter bufWriter = new BufferedWriter(new FileWriter(fileName))) {
                for (String str : list) {
                    bufWriter.write(str);
                    bufWriter.newLine();
                }
            } catch (IOException exc) {
                System.out.println("Can't write");
            }
        }
    }
}
