package com.javarush.task.task08.task0807;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

/* 
LinkedList и ArrayList
*/

public class Solution {
    public static Object createArrayList() {
        //напишите тут ваш код
        return new ArrayList<>();

    }

    public static Object createLinkedList() {
        //напишите тут ваш код
        return new LinkedList<>();
    }

    public static void main(String[] args) {
            Date yearStartTime = new Date();
            yearStartTime.setHours(0);
            yearStartTime.setMinutes(0);
            yearStartTime.setSeconds(0);

            yearStartTime.setDate(1);      // первое число
            yearStartTime.setMonth(0);     // месяц январь, нумерация для месяцев 0-11

            Date currentTime = new Date();
            long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
            long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

            int dayCount = (int) (msTimeDistance/msDay); //количество целых дней
            System.out.println("Days from start of year: " + dayCount);

        System.out.println(yearStartTime.getYear());
        System.out.println(currentTime.getYear());
    }
}
