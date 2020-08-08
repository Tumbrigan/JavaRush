package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 16 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        int day = date1.getDate();
        int month = date1.getMonth();
        int year = date1.getYear() + 1900;

        Calendar calendar = new GregorianCalendar(year, month, day);
        int now = calendar.get(GregorianCalendar.DAY_OF_YEAR);

        boolean amount = (now - 1) % 2 == 0;
        return amount;
    }
}
