package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код

        //grandfathers
        Human john = new Human("John", true, 60);
        Human paul = new Human("Paul", true, 63);

        //grandfathers
        Human marta = new Human("Marta", false, 58);
        Human sara = new Human("Sara", false, 61);

        //father
        Human bob = new Human("Bob", true, 40, john, marta);
        //mother
        Human luisa = new Human("Luisa", false, 41, paul, sara);

        //children
        Human joshua = new Human("Joshua", true, 20, bob, luisa);
        Human masha = new Human("Masha", false, 25, bob, luisa);
        Human richard = new Human("Richard", true, 15, bob, luisa);

    }

    public static class Human {
        // напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;

            System.out.println(toString());
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;

            System.out.println(toString());
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}