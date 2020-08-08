package com.javarush.task.task20.task2013;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Externalizable Person
*/
public class Solution {
    public static class Person implements Externalizable {
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person() {
        }

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(mother);
            out.writeObject(father);
            out.writeObject(firstName);
            out.writeObject(lastName);
            out.writeInt(age);
            out.writeObject(children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            mother = (Person) in.readObject();
            father = (Person) in.readObject();
            firstName = (String) in.readObject();
            lastName = (String) in.readObject();
            age = in.readInt();
            children = (List<Person>) in.readObject();
        }
    }

    public static void main(String[] args) throws Exception {
        Person p = new Person("Vasya", "Pupkin", 35);
        Person mother = new Person("Masha", "Kasha", 55);
        Person father = new Person("Ivan", "Kasha", 57);
        Person child1 = new Person("Ch1", "ChCh1", 10);
        Person child2 = new Person("Ch2", "ChCh2", 15);

        List<Person> list = new ArrayList<>();
        list.add(child1);
        list.add(child2);
        p.setChildren(list);
        p.setFather(father);
        p.setMother(mother);

        FileOutputStream fos = new FileOutputStream("D:\\person.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(p);


        FileInputStream fis = new FileInputStream("D:\\person.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Person p2 = (Person) ois.readObject();

        System.out.println(p2.age);
        System.out.println(p2.toString());
        System.out.println(p2.lastName);
    }
}
