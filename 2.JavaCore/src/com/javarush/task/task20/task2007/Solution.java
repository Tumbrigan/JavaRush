package com.javarush.task.task20.task2007;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Как сериализовать JavaRush?
*/
public class Solution {
    public static class JavaRush implements Serializable {
        public List<User> users = new ArrayList<>();
    }

    public static void main(String[] args) throws Exception {
        JavaRush jr = new JavaRush();

        jr.users.add(new User());
        jr.users.add(new User());

        jr.users.get(0).setFirstName("Bob");
        jr.users.get(0).setLastName("Journey");
        jr.users.get(0).setBirthDate(new Date());
        jr.users.get(0).setMale(true);
        jr.users.get(0).setCountry(User.Country.UKRAINE);

        jr.users.get(1).setFirstName("Roy");
        jr.users.get(1).setLastName("Coffee");
        jr.users.get(1).setBirthDate(new Date());
        jr.users.get(1).setMale(true);
        jr.users.get(1).setCountry(User.Country.RUSSIA);

        FileOutputStream fos = new FileOutputStream("D:\\static.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(jr);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("D:\\static.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        JavaRush jr1 = (JavaRush) ois.readObject();

        System.out.println(jr1.users.get(1).getFirstName());
    }
}
