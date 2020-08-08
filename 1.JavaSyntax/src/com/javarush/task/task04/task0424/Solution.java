package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(br.readLine());
        int two = Integer.parseInt(br.readLine());
        int three = Integer.parseInt(br.readLine());

        if (one != two && two == three) {
            System.out.println(1);
        } else if (one == three && two != three) {
            System.out.println(2);
        } if (one == two && two != three) {
            System.out.println(3);
        }
    }
}
