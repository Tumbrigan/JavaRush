package com.javarush.task.task34.task3411;

/* 
Ханойские башни
*/

public class Solution {
    public static void main(String[] args) {
        int numRings = 3;
        moveRing('A', 'B', 'C', numRings);
    }

    public static void moveRing(char a, char b, char c, int numRings) {
        //напишите тут ваш код
        /*
        char a - имя стержня, на котором в начале находятся все кольца;
char b - имя стержня, на который нужно перенести все кольца;
char c - имя вспомогательного стержня;
int numRings - общее количество колец, которые необходимо перенести.
        * */

        if (numRings == 1) {
            System.out.println("from " + a + " to " + b);
        } else {
            moveRing(a, c, b, (numRings - 1));
            System.out.println("from " + a + " to " + b);
            moveRing(c, b, a, (numRings - 1));
        }
    }
}