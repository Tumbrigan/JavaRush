package com.javarush.task.task31.task3101;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\iKucher\\Desktop\\Test");
        File[] files = file.listFiles();



//        for(File f : files) {
//            if (f.getName().equals("test.txt")) {
//                f.renameTo(new File("C:\\Users\\iKucher\\Desktop\\Test\\newTest.txt"));
//            }
//        }

        for (File f : files) {
            if (f.isDirectory())
                System.out.println("It's directory " + f.getAbsolutePath());
            else
//                System.out.println("It's a file " + f.getName());
                System.out.println("It's a file " + f.getParent() + " " + f.getName());
        }
    }
}


/*
1. Переименовать файл:
    - получить путь

 */