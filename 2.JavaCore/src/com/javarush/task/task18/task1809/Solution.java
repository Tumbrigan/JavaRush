package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {

            inputStream = new FileInputStream(reader.readLine());
            outputStream = new FileOutputStream(reader.readLine());

            byte[] bytes = new byte[inputStream.available()];
            while (inputStream.available() > 0) {
                inputStream.read(bytes);
            }

            byte[] reverseBytes = new byte[bytes.length];
            
            for (int i = 0; i < reverseBytes.length; i++) {
                    reverseBytes[i] = (byte)(bytes[reverseBytes.length - i - 1] & 0b11111111);
            }

            outputStream.write(reverseBytes);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



        if (inputStream != null & outputStream != null) {
            try {
                reader.close();
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
