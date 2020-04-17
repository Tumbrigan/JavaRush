package com.javarush.task.task22.task2201;

public class Test {
    public static void main(String[] args) {
        String string = "A\tB\tC\tD\tE\tF\tG\tH\tI";
        do {
            System.out.println(string.substring(string.indexOf("\t"), string.lastIndexOf("\t")));
        } while (true);

    }
}
