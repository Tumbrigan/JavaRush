package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] bigArray = new int[20];
        int[] firstSmallArray = new int[10];
        int[] secondSmallArray = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < bigArray.length; i++) {
                bigArray[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < firstSmallArray.length; i++) {
                firstSmallArray[i] = bigArray[i];
        }

        for (int i = secondSmallArray.length; i < bigArray.length; i++) {
                secondSmallArray[i - secondSmallArray.length] = bigArray[i];
        }

        for (int i : secondSmallArray) {
            System.out.println(i);
        }



    }
}
