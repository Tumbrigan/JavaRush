package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        int iterations = 10;
        for (int i = 0; i < iterations; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int maxIterations = 0;
        int iteration = 0;
        if (!list.isEmpty()) {
            for (int i = 0; i < (iterations - 1); i++) {

                if (list.get(i).equals(list.get(i + 1))) {
                    iteration++;
                } else {
                    iteration = 0;
                }

                if (iteration + 1 > maxIterations) {
                    maxIterations = iteration + 1;
                }
            }
            System.out.println(maxIterations);
        }
    }
}