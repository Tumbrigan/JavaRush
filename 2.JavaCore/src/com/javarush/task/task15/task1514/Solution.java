package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static {
        labels.put(5.0, "five");
        labels.put(4.0, "four");
        labels.put(3.0, "three");
        labels.put(2.0, "two");
        labels.put(1.0, "one");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
