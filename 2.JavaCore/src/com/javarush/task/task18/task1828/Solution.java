package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        if (args.length > 0) {
            try (BufferedReader pathToFileReader = new BufferedReader(new InputStreamReader(System.in))) {
                String pathToFile = pathToFileReader.readLine();

                String command = args[0];
                String id = args[1];
                int ID = Integer.parseInt(id);

                List<String> list = new ArrayList<>();
                String line;

                try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile));
                     BufferedWriter writer = new BufferedWriter(new FileWriter(pathToFile))) {

                    if (command.equals("-u")) {
                        String productName = args[2];
                        String price = args[3];
                        String quantity = args[4];


                        while ((line = reader.readLine()) != null) {
                            if (ID == Integer.parseInt(line.substring(0, 8).trim())) {
                                line = String.format("%-8s%-30s%-8s%-4s", ID, productName, price, quantity);
                            }
                            list.add(line);
                        }

                        for (String s : list) {
                            writer.write(s + "\n");
                        }


                    } else if (command.equals("-d")) {
                        while ((line = reader.readLine()) != null) {
                            if (ID != Integer.parseInt(line.substring(0, 8).trim())) {
                                list.add(line);
                            }
                        }
                        for (String s : list) {
                            writer.write(s + "\n");
                        }
                    }
                }
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }
}