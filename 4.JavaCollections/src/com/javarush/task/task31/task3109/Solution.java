package com.javarush.task.task31.task3109;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;

/* 
Читаем конфиги
*/
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Properties properties =
                solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/properties.xml");
        properties.list(System.out);

        properties =
                solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/properties.txt");
        properties.list(System.out);

        properties =
                solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/notExists");
        properties.list(System.out);
    }

    public Properties getProperties(String fileName) {
        Properties properties = new Properties();
        try {
            properties.loadFromXML(new FileInputStream(new File(fileName)));
            return properties;
        } catch
        (IOException e) {
            try {
                properties.load(new FileInputStream(new File(fileName)));
                return properties;
            } catch (IOException ex) {
                return properties;
            }
        }
    }
}
