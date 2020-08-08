package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n > 0) {
            if (n % 2 != 0) System.out.println("положительное нечетное число");
            else System.out.println("положительное четное число");
        } else if (n < 0) {
            if (n % 2 != 0) System.out.println("отрицательное нечетное число");
            else System.out.println("отрицательное четное число");
        } else System.out.println("ноль");
    }
}
