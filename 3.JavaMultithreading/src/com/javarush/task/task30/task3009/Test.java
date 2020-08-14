package com.javarush.task.task30.task3009;

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        String s = "12AS08z".toLowerCase();

        for (int i = 2; i < 37; i++) {
            System.out.print("Iteration " + i + ": ");
            try {
                new BigInteger(s);
                return;
            } catch (NumberFormatException e) {
                System.out.print("incorrect");
            }
            System.out.println();
        }
    }
}
