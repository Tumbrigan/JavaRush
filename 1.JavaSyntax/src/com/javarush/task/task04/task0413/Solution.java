package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        int n = Integer.parseInt(str);
        if (n < 1 || n > 7) {
            System.out.println("такого дня недели не существует");
        } else {
            n--;
            String[] strArray = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
            System.out.println(strArray[n]);
        }
    }
}