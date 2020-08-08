package com.javarush.task.task20.task2009;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
Как сериализовать static?
*/
public class Solution {
    public static class ClassWithStatic implements Serializable {
        public static String staticString = "This is a static test string";
        public int i;
        public int j;
    }

    public static void main(String[] args) throws IOException {
        ClassWithStatic cl = new ClassWithStatic();

        FileOutputStream fos = new FileOutputStream("D:\\static.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(cl);
    }
}
