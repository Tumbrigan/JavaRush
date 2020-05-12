package com.javarush.task.task31.task3106;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.zip.ZipInputStream;

/*
Разархивируем файл
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        // создаём Vector, который понадобится нам для создания Enumeration
        List<String> fileNames = Arrays.asList(args).subList(1, args.length);
        fileNames.sort(Comparator.naturalOrder());
        Vector<InputStream> vector = new Vector<>();
        for (String fileName : fileNames) {
            vector.add(new FileInputStream(fileName));
        }

        // создаём Enumeration, который нам понадобится для создания SequenceInputStream
        Enumeration<InputStream> enumeration = vector.elements();

        // создаём SequenceInputStream, который последовательно считает файлы
        ZipInputStream zis = new ZipInputStream(new SequenceInputStream(enumeration));
        FileOutputStream fos = new FileOutputStream(new File(args[0]));

        byte[] bytes = new byte[1024 * 1024];
        while (zis.getNextEntry() != null) {
            int count;
            while ((count = zis.read(bytes)) != -1) {
                fos.write(bytes, 0, count);
            }
        }
        try {
            zis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}