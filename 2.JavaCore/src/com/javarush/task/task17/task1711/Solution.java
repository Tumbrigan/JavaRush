package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        //start here - начни тут
        if (args.length != 0) {
            switch (args[0]) {
                case "-c":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i += 3)
                            createInstance(args[i], args[i + 1], args[i + 2]);
                    }
                    break;
                case "-u":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i += 4)
                            updateInstance(args[i], args[i + 1], args[i + 2], args[i + 3]);
                    }
                    break;
                case "-d":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++)
                            deleteInstance(args[i]);
                    }
                    break;
                case "-i":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++)
                            printInstance(args[i]);
                    }
                    break;
            }
        }
    }

    public static void createInstance(String name, String sex, String bd) throws Exception {

        Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(bd);
        if (sex.equals("м")) {
            allPeople.add(Person.createMale(name, date));
        } else if (sex.equals("ж")) {
            allPeople.add(Person.createFemale(name, date));
        }
        System.out.println(allPeople.size() - 1);
    }

    public static void updateInstance(String ID, String name, String sex, String bd) throws Exception {
        int id = Integer.parseInt(ID);

        Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(bd);
        Person person = allPeople.get(id);
        person.setName(name);
        if (sex.equals("м")) {
            person.setSex(Sex.MALE);
        } else if (sex.equals("ж")) {
            person.setSex(Sex.FEMALE);
        }
        person.setBirthDate(date);
        allPeople.set(id, person);
    }


    public static void deleteInstance(String ID) throws Exception {
        int id = Integer.parseInt(ID);
        Person person = allPeople.get(id);
        person.setName(null);
        person.setSex(null);
        person.setBirthDate(null);
        allPeople.set(id, person);
    }

    public static void printInstance(String ID) throws Exception {
        int id = Integer.parseInt(ID);
        Person person = allPeople.get(id);
        String date = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(person.getBirthDate());
        String sex = person.getSex() == Sex.MALE ? "м" : "ж";
        System.out.println(person.getName() + " " + sex + " " + date);
    }

}
