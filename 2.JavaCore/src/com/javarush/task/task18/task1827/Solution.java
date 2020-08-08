package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args){
        try (BufferedReader pathToFileReader = new BufferedReader(new InputStreamReader(System.in))) {
            String pathToFile = pathToFileReader.readLine();
//            String pathToFile = "D:\\file1.txt";

            if (args.length > 0) {
                String productName = String.format("%-" + 30 + "s", args[1]);
                String price = String.format("%-" + 8 + "s", args[2]);
                String quantity = String.format("%-" + 4 + "s", args[3]);

                int maxID = 0;

                try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile));
                     BufferedWriter writer = new BufferedWriter(new FileWriter(pathToFile, true))) {
                    String line;

                    while ((line = reader.readLine()) != null) {
                        String toID = line.substring(0, 8).trim().replaceAll("\\W", "");
                        int ID = Integer.parseInt(toID);
                        maxID = Math.max(maxID, ID);
                    }

                    String itemID = String.format("%-" + 8 + "d", maxID + 1);
                    writer.write("\n" + itemID + productName + price + quantity);
                }
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}