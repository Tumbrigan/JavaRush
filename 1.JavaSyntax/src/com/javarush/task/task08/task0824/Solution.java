package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> ch = new ArrayList<>();
        Human son1 = new Human("Ivan", true, 9, ch);
        Human son2 = new Human("Alex", true, 14, ch);
        Human daughter = new Human("Nadya", false, 12, ch);

        ArrayList<Human> children = new ArrayList<>();
        children.add(son1);
        children.add(son2);
        children.add(daughter);
        Human father = new Human("Gregory", true, 47, children);
        Human mother = new Human("Olga", false, 51, children);

        ArrayList<Human> childFather = new ArrayList<>();
        childFather.add(father);
        Human grandFather1 = new Human("Tolya", true, 81, childFather);
        Human grandMother1 = new Human("Nina", false, 81, childFather);

        ArrayList<Human> childMother = new ArrayList<>();
        childMother.add(mother);
        Human grandFather2 = new Human("Vasya", true, 82, childMother);
        Human grandMother2 = new Human("Nina", false, 82, childMother);

        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(daughter.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(grandFather1.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother2.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

/*        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }*/

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
