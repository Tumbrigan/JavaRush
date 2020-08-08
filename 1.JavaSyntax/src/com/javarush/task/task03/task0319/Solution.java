package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        String int1In = bufferedReader.readLine();
        String int2In = bufferedReader.readLine();

        int int1 = Integer.parseInt(int1In);
        int int2 = Integer.parseInt(int2In);

        System.out.println(name + " получает " + int1 + " через " + int2 + " лет."); // Коля получает 3000 через 5 лет.

    }
}
