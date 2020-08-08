package com.javarush.task.task17.task1721;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {


        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String filePath1 = bufferedReader.readLine();
//            String filePath1 = "D:\\file1.txt";
            String filePath2 = bufferedReader.readLine();
//            String filePath2 = "D:\\file2.txt";

            try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader(filePath1));
                 BufferedReader bufferedReader2 = new BufferedReader(new FileReader(filePath2))) {
                String lineFromFileN1;
                while ((lineFromFileN1 = bufferedReader1.readLine()) != null) {
                    allLines.add(lineFromFileN1);
                }

                String lineFromFileN2;
                while ((lineFromFileN2 = bufferedReader2.readLine()) != null) {
                    forRemoveLines.add(lineFromFileN2);
                }
            } catch (FileNotFoundException e) {
                e.getMessage();
            }
        } catch (IOException e) {
            e.getMessage();
        }

        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            System.out.println("From custom Exc");
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
