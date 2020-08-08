package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream stream = new FileInputStream(fileName);
        int i;
        int[] arr = new int[256];

        while (stream.available() > 0) {
            i = stream.read();
            arr[i] = arr[i] + 1;
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 1)
                System.out.print(j + " ");
        }

        reader.close();
        stream.close();
    }
}
