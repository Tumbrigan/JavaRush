package com.javarush.task.task07.task0701;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int counter = 0;
        while (counter < 15) {
            list.add(counter);
            counter++;
        }
    }
}
