package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private int one;
        private int two;
        private String oneS;
        private String twoS;
        private boolean oneB;
        private boolean twoB;

        public Human(int one) {
            this.one = one;
        }

        public Human(int one, String oneS) {
            this.one = one;
            this.oneS = oneS;
        }
        public Human(String oneS, int one, boolean oneB) {
            this.one = one;
            this.oneS = oneS;
            this.oneB = oneB;
        }

        public Human(boolean twoB) {
            this.twoB = twoB;
        }

        public Human(boolean twoB, String twoS) {
            this.twoB = twoB;
            this.twoS = twoS;
        }
        public Human(int one, String oneS, boolean oneB) {
            this.one = one;
            this.oneS = oneS;
            this.oneB = oneB;
        }

        public Human(int one, boolean oneB) {
            this.one = one;
            this.oneB = oneB;
        }

        public Human(boolean oneB, int one) {
            this.one = one;
            this.oneB = oneB;
        }

        public Human(boolean oneB, String oneS, int one) {
            this.oneB = oneB;
            this.one = one;
            this.oneS = oneS;
        }

        public Human(boolean oneB, String oneS, String twoS, int one) {
            this.oneB = oneB;
            this.one = one;
            this.oneS = oneS;
            this.twoS = twoS;
        }
    }
}
