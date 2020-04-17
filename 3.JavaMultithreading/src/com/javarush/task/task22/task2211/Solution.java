package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Charset utf8 = StandardCharsets.UTF_8;
        Charset windows1251 = Charset.forName("Windows-1251");

        FileInputStream fileInputStream = new FileInputStream(args[0]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[1]);

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        byte[] bytes = new byte[fileInputStream.available()];
        bufferedInputStream.read(bytes);



        String s = new String(bytes, windows1251);
        byte[] bytes1 = s.getBytes(utf8);
        bufferedOutputStream.write(bytes1);

        bufferedInputStream.close();
        bufferedOutputStream.close();



//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0], "Windows-1251")));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]));
//
//        char[] chars = new char[0];
//        bufferedReader.read(chars);
//
//        String s = new String(chars, "Windows-1251");
    }
}
