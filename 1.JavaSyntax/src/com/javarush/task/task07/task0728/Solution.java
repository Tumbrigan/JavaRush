package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        boolean repeat = true;
        int endOfList = array.length -1;
        while (repeat) {
            repeat = false;

            for (int i = 0;  i < endOfList; i++) {
                if (array[i] < array[i + 1]) {
                    swap(array, i, i + 1);
                    repeat = true;
                }
            }
            endOfList--;
        }
    }

    public static int[] swap(int[] array, int first, int second){
        int dummy = array[first];
        array[first] = array[second];
        array[second] = dummy;
        return array;

    }
}
