package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;
import java.util.Date;

public class Solution {

    private static FileInputStream inputStream;
    private static FileOutputStream outputStream1;
    private static FileOutputStream outputStream2;

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        long date1 = new Date().getTime();

        try {
            inputStream = new FileInputStream(reader.readLine()); // "D:\\Coding\\Temporary\\file1.txt"
            outputStream1 = new FileOutputStream(reader.readLine()); //"D:\\Coding\\Temporary\\file2.txt"
            outputStream2 = new FileOutputStream(reader.readLine()); //"D:\\Coding\\Temporary\\file3.txt"

            int availableBytes = inputStream.available();
            int to1stFile = availableBytes % 2 == 1 ? availableBytes / 2 + 1 : availableBytes / 2;
            int to2ndFile = availableBytes - to1stFile;

            byte[] byteArr = new byte[availableBytes];

            while (inputStream.available() > 0) {
                inputStream.read(byteArr);
                outputStream1.write(byteArr, 0, to1stFile);
                outputStream2.write(byteArr, to1stFile, to2ndFile);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

//        long date2 = new Date().getTime();


        try {
            inputStream.close();
            outputStream1.close();
            outputStream2.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

//        System.out.println("Time is " + (date2 - date2) + " ms");
    }
}