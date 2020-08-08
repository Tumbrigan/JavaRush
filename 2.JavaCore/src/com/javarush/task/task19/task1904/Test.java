package com.javarush.task.task19.task1904;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String str = "Иванов Иван Иванович 31 12 1950";

        Scanner scanner = new Scanner(str).useDelimiter("\\s");

        String lastName = scanner.next();
        String firstName = scanner.next();
        String middleName = scanner.next();
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        System.out.println(lastName);
        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);


        Date date = new Date(year-1900, month - 1, day);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println(dateFormat.format(date));
    }
}
