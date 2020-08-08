package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int victories = 0;
        boolean b = false;

        if (this.age > anotherCat.age) victories ++;
        else if (this.age < anotherCat.age) victories --;

        if (this.weight > anotherCat.weight) victories ++;
        else if (this.weight < anotherCat.weight) victories --;

        if (this.strength > anotherCat.strength)  victories ++;
        else if (this.strength < anotherCat.strength) victories --;

        if (victories > 0) b = true;
        return b;
        }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 7;
        cat1.weight = 10;
        cat1.strength = 50;

        Cat cat2 = new Cat();
        cat1.age = 6;
        cat1.weight = 8;
        cat1.strength = 55;

        cat1.fight(cat2);
    }
}
