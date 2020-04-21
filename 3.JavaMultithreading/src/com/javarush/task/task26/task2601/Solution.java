package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Comparator;

/*
Почитать в инете про медиану выборки
*/
public class Solution {
    private static int mediana;

    public static void main(String[] args) {
    }

    public static Integer[] sort(Integer[] array) {
        //implement logic here
        Arrays.sort(array);
        if (array.length % 2 == 0)
            mediana = (array[(array.length / 2 - 1)] + array[(array.length / 2)]) / 2;
        else
            mediana = array[(array.length / 2)];
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                double res = Math.abs(o1 - mediana) - Math.abs(o2 - mediana);
                if (res == 0) return o1 - o2;
                else return (int) res;
            }
        };
        Arrays.sort(array, comparator);
        return array;
    }


}
