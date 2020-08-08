package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        //start here - начни тут
        if (args.length != 0) {
            switch (args[0]) {
                case "-c":
                    createInstance(args[1], args[2], args[3]);
                    break;
                case "-u":
                    updateInstance(args[1], args[2], args[3], args[4]);
                    break;
                case "-d":
                    deleteInstance(args[1]);
                    break;
                case "-i":
                    printInstance(args[1]);
                    break;
            }
        }
    }

    public static void createInstance(String name, String sex, String bd) throws Exception {
        Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(bd);
        Person person = null;
        if (sex.equals("м")) {
            person = Person.createMale(name, date);

        } else if (sex.equals("ж")) {
            person = Person.createFemale(name, date);
        }
        allPeople.add(person);
        System.out.println(allPeople.indexOf(person));
    }

    public static void updateInstance(String id, String name, String sex, String bd) throws Exception {
        int updateID = Integer.parseInt(id);
        Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(bd);
        Person person = allPeople.get(updateID);
        person.setName(name);
        if (sex.equals("м")) {
            person.setSex(Sex.MALE);
        } else if (sex.equals("ж")) {
            person.setSex(Sex.FEMALE);
        }
        person.setBirthDate(date);
        allPeople.set(updateID, person);
    }

    public static void deleteInstance(String id) throws Exception {
        int updateID = Integer.parseInt(id);
        Person person = allPeople.get(updateID);
        person.setName(null);
        person.setSex(null);
        person.setBirthDate(null);
        allPeople.set(updateID, person);
    }

    public static void printInstance(String id) throws Exception {
        Person person = allPeople.get(Integer.parseInt(id));
        String date = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(person.getBirthDate());
        String sex = person.getSex() == Sex.MALE ? "м" : "ж";
        System.out.println(person.getName() + " " + sex + " " + date);
    }
}