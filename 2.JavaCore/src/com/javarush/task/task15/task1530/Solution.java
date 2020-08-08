package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        LatteMaker lm = new LatteMaker();
        TeaMaker tm = new TeaMaker();

        lm.makeDrink();
        tm.makeDrink();
    }
}
