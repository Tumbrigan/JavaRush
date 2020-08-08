package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        String s = Integer.toString(num);

        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            if (digits[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.printf("Even: %d Odd: %d", even, odd);
    }
}
