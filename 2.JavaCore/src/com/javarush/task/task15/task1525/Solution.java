package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        List<String> lines = new ArrayList<>();
        BufferedReader br = null;
        String s;
        try {
            br = new BufferedReader(new FileReader(Statics.FILE_NAME));
            while ((s = br.readLine()) != null) {
                Solution.lines.add(s);
            }
        } catch (IOException exc) {
            System.out.println(exc.toString());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException exc) {
                    System.out.println(exc.toString());
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}