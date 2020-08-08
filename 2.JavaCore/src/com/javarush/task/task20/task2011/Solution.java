package com.javarush.task.task20.task2011;

import java.io.*;

/*
Externalizable для апартаментов
*/
public class Solution {

    public static class Apartment implements Externalizable {

        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() { super(); }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }

        /**
         * Prints out the fields used for testing!
         */
        public String toString() {
            return("Address: " + address + "\n" + "Year: " + year);
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(address);
            out.writeInt(year);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            address = (String) in.readObject();
            year = in.readInt();
        }
    }

    public static void main(String[] args) throws Exception {
        Apartment a1 = new Apartment("flat", 3);

        FileOutputStream fos = new FileOutputStream("D:\\flat.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(a1);

        FileInputStream fis = new FileInputStream("D:\\flat.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Apartment a2 =  (Apartment) ois.readObject();

        System.out.println(a2.toString());
    }
}
