package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;
import java.util.Date;

public class Solution {
    public static void main(String[] args) throws Exception {
//        Date start = new Date();
        BufferedReader filePathReader = new BufferedReader(new InputStreamReader(System.in));

        String fileForReading = filePathReader.readLine();
//        String fileForReading = "D:\\file1.txt";
        String fileForWriting = filePathReader.readLine();
//        String fileForWriting = "D:\\file2.txt";



        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileForReading));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileForWriting));


        String temp;
        while ((temp = bufferedReader.readLine()) != null) {
            bufferedWriter.write(temp.replaceAll("\\p{Punct}", ""));
        }

        filePathReader.close();
        bufferedReader.close();
        bufferedWriter.close();
//        Date finish = new Date();

//        System.out.println(finish.getTime() - start.getTime() + " ms");

    }
}
