package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int[] numbers = {a, b, c};
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                counter += 1;
            }
        }
        System.out.println(counter);

    }
}
