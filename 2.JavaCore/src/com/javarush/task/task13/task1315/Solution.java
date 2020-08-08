package com.javarush.task.task13.task1315;

/* 
Том, Джерри и Спайк
*/

public class Solution {
    public static void main(String[] args) {
/*
        Dog dog = new Dog();
        Cat cat = new Cat();
        Mouse mouse = new Mouse();

        dog.move();
        dog.eat();
        System.out.println();

        cat.move();
        cat.eat();
        cat.beEaten();
        System.out.println();


        mouse.move();
        mouse.beEaten();
        System.out.println();
*/

    }
    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    static class Dog implements Movable, Eat {
        @Override
        public void move(){
            System.out.println("Собакен потыгыдыкал!");
        }

        @Override
        public void eat() {
            System.out.println("Ам! Собакен доволен!");
        }
    }

    static class Cat implements Movable, Eat, Edible {
        @Override
        public void move(){
            System.out.println("Котыч тыгыдык!");
        }

        @Override
        public void eat() {
            System.out.println("Ам! Котофан доволен!");
        }

        @Override
        public void beEaten() {
            System.out.println("Собакен, не ешь котофана!");
        }
    }

    static class Mouse implements Movable, Edible {
        @Override
        public void move(){
            System.out.println("Мышич побёг!");
        }

        @Override
        public void beEaten() {
            System.out.println("Собакен, не ешь мышича!");
        }
    }
}