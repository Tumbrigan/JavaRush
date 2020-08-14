package com.javarush.task.task34.task3411;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(8));
        int i = 1;
         i <<= 4;
        System.out.println(Integer.toBinaryString(i | 8));


    }

    public void someMethod() throws IOException {

    }

    class Test2 extends Test {
        @Override
        public void someMethod() throws FileNotFoundException {
            System.out.println(100/0);
        }
    }
}
