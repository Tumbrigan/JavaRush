package com.javarush.task.task33.task3303;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
Десериализация JSON объекта
*/
public class Solution {
    public static <T> T convertFromJsonToNormal(String fileName, Class<T> clazz) throws IOException {
        File file = new File(fileName);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(file, clazz);
    }

    public static void main(String[] args) {
        String fileName = "D:\\Test\\json.java";
        try (BufferedOutputStream ous = new BufferedOutputStream(new FileOutputStream(fileName))) {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(ous, new Cat(1, "Richard"));
            Cat cat = convertFromJsonToNormal(fileName, Cat.class);
            System.out.println(cat.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
