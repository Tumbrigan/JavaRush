package com.javarush.task.task13.task1301;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.method();

        Animal dog = new Dog();
        dog.method();
    }

    public static class Animal {
        public static void method() {
            System.out.println("Animal");
        }
    }

    public static class Dog extends Animal {
//        @Override
        public static void method() {
            System.out.println("Dog");
        }
    }
}
