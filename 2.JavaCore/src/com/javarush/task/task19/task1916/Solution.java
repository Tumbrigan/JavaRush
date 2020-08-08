package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
        List<String> linesFile1 = new ArrayList<>();
        List<String> linesFile2 = new ArrayList<>();

        try (BufferedReader pathToFileReader = new BufferedReader(new InputStreamReader(System.in))) {
            String path1 = pathToFileReader.readLine();
//            String path1 = "D:\\test1.txt";
            String path2 = pathToFileReader.readLine();
//            String path2 = "D:\\test2.txt";

            try (BufferedReader fileReader1 = new BufferedReader(new FileReader(path1));
                 BufferedReader fileReader2 = new BufferedReader(new FileReader(path2))) {
                while (fileReader1.ready()) {
                    linesFile1.add(fileReader1.readLine());
                }

                while (fileReader2.ready()) {
                    linesFile2.add(fileReader2.readLine());
                }

                int i = 0, j = 0;
                while (i < linesFile1.size() &&
                        j < linesFile2.size() - 1 ) {
                    if (linesFile1.get(i).equals(linesFile2.get(j))) {
                        lines.add(new LineItem(Type.SAME, linesFile1.get(i)));
                        i++;
                        j++;

                    } else if (linesFile1.get(i).equals(linesFile2.get(j + 1))) {
                        lines.add(new LineItem(Type.ADDED, linesFile2.get(j)));
                        j++;

                    } else {
                        lines.add(new LineItem(Type.REMOVED, linesFile1.get(i)));
                        i++;
                    }
                }

                if (i < linesFile1.size())
                    for (int n = i; n < linesFile1.size(); n++)
                        lines.add(new LineItem(Type.REMOVED, linesFile1.get(n)));
                else if (j < linesFile2.size())
                    for (int m = j; m < linesFile2.size(); m++)
                        lines.add(new LineItem(Type.ADDED, linesFile2.get(m)));
            }
        } catch (IOException e) {
            e.getMessage();
        }
        for (LineItem item : lines) {
            System.out.println(item.type + " " + item.line);
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
