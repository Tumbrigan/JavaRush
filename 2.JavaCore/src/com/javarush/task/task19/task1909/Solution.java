package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader filePathReader = new BufferedReader(new InputStreamReader(System.in));

        String fileForReading = filePathReader.readLine();
//        String fileForReading = "D:\\file1.txt";

        String fileForWriting = filePathReader.readLine();
//        String fileForWriting = "D:\\file2.txt";



        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileForReading));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileForWriting));


        String temp;
        while ((temp = bufferedReader.readLine()) != null) {
            bufferedWriter.write(temp.replaceAll("\\.", "!"));
        }

        filePathReader.close();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
