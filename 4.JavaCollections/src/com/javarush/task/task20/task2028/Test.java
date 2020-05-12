package com.javarush.task.task20.task2028;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(10);
        for (int i = 0; i < 15; i++) {
            list.add(String.valueOf(i));
        }
        System.out.println(list.size());

        list.remove(5);
        System.out.println(list.size());
    }
}
