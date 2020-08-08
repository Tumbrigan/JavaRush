package com.javarush.task.task19.task1921;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    private Date birthDate;

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    // закомментировать
//    @Override
//    public String toString() {
//        SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
//        return name + " " + format.format(birthDate);
//    }
}
