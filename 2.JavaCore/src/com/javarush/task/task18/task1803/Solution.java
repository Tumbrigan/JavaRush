package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream stream = new FileInputStream(fileName);

        int i;
        int[] arr = new int[256];
        int temp;

        while (stream.available() > 0) {
            i = stream.read();
            temp = arr[i];
            arr[i] = ++temp;
        }

        Set<Integer> set = new HashSet<>();

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 2) {
                set.add(j);
            }
        }

        for (int n: set) {
            System.out.print(n + " ");
        }

        reader.close();
        stream.close();
    }
}
