package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int quantity = 20;
        ArrayList<Integer> whole = new ArrayList<>();
        ArrayList<Integer> divisibleByThree = new ArrayList<>();
        ArrayList<Integer> divisibleByTwo = new ArrayList<>();
        ArrayList<Integer> reduce = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
                int n = Integer.parseInt(reader.readLine());
                whole.add(n);
                if (n % 3 == 0 && n % 2 == 0){
                    divisibleByThree.add(n);
                    divisibleByTwo.add(n);
                } else if (n % 3 == 0) {
                    divisibleByThree.add(n);
                } else if (n % 2 == 0) {
                    divisibleByTwo.add(n);
                } else {
                    reduce.add(n);
                }
        }
        printList(divisibleByThree);
        printList(divisibleByTwo);
        printList(reduce);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int n : list) {
            System.out.println(n);
        }
    }
}
