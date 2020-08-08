package com.javarush.task.task19.task1908;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\b\\d+\\b");
        Matcher m = p.matcher("12 text var2 14 8ю 1");

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
