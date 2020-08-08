package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws DownloadException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            FileInputStream stream = null;
            try {
                stream = new FileInputStream(reader.readLine());
                if (stream.available() < 1_000) throw new DownloadException();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } finally {
                if (stream != null) {
                    try {
                        stream.close();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }

    }

    public static class DownloadException extends Exception {

    }
}
