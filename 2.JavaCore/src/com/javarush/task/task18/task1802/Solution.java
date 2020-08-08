package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        FileInputStream inputStream=new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int min,i;
        min = Integer.MAX_VALUE;
        if(inputStream.available()>0)
            min=inputStream.read();
        while(inputStream.available()>0)
            if((i=inputStream.read())<min)
                min=i;
        inputStream.close();
        System.out.println(min);

        /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();

        FileInputStream stream = new FileInputStream(filePath);
        int i;
        int min = Integer.MAX_VALUE;

        while ((i = stream.read()) != -1) {
            min = Math.min(min, i);
        }
        System.out.println(min);

        stream.close();
        reader.close();

         */

    }
}