package com.javarush.task.task03.task0322;

/* 
Большая и чистая
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name1 = bufferedReader.readLine(); //
        String name2 = bufferedReader.readLine(); //
        String name3 = bufferedReader.readLine(); //

        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!"); //Вася + Ева + Анжелика = Чистая любовь, да-да!

    }
}