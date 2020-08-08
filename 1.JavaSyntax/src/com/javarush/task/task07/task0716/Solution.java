package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("упор");
        strings.add("вода");
        strings.add("мир");
        strings.add("лоза");
        strings.add("лор");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        String del = "р";
        String add = "л";
        for (int i = 0; i < strings.size(); ) {
            if (strings.get(i).contains(del) ^ strings.get(i).contains(add)) {
                if (strings.get(i).contains(del)) {
                    strings.remove(strings.get(i));
                } else {
                    strings.add(i+1, strings.get(i));
                    i += 2;
                }
            } else {
                i++;
            }
        }
        return strings;
    }
}