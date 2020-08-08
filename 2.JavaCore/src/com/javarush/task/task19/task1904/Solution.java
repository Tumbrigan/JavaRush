package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {
//        try {
//            Scanner scanner = new Scanner(new File("D:\\filee.txt"));
//            PersonScannerAdapter adapter = new PersonScannerAdapter(scanner);
//            Person person = adapter.read();
//            System.out.println(person.toString());
//        } catch (Exception e) {
//            e.getStackTrace();
//        }
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            Person person = null;
            if (fileScanner.hasNextLine()) {
                String personInfo = fileScanner.nextLine();
//                System.out.println(personInfo);
                Scanner scanner = new Scanner(personInfo).useDelimiter("\\s");
                String lastName = scanner.next();
                String firstName = scanner.next();
                String middleName = scanner.next();
                int day = scanner.nextInt();
                int month = scanner.nextInt();
                int year = scanner.nextInt();

                Date dateOfBirthday = new Date(year - 1900, month - 1, day);
                person = new Person(firstName, middleName, lastName, dateOfBirthday);
            }
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
