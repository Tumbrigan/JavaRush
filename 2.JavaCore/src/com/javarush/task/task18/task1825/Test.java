package com.javarush.task.task18.task1825;

public class Test {
    public static void main(String[] args) {
        String path = "Lion.avi.part37";
//        String pathToWrite = path.substring(0, path.lastIndexOf("."));
        String pathToWrite = path.substring(path.lastIndexOf(".")+1);
        System.out.println(pathToWrite);
    }
}
