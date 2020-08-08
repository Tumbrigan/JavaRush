package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int sum = 0;
        while (true) {
            i = Integer.parseInt(br.readLine());
            sum += i;
            if (i == -1) break;
        }
        System.out.println(sum);
    }
}
