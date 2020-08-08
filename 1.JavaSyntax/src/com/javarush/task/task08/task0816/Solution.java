package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Коломбо", dateFormat.parse("MAY 1 2013"));
        map.put("Силли", dateFormat.parse("JUL 5 2014"));
        map.put("Капоне", dateFormat.parse("AUG 7 2015"));
        map.put("Шварц", dateFormat.parse("SEP 5 2016"));
        map.put("Курт", dateFormat.parse("OCT 7 2017"));
        map.put("Курц", dateFormat.parse("NOV 10 2018"));
        map.put("Байер", dateFormat.parse("DEC 15 2019"));
        map.put("Хенкель", dateFormat.parse("JUL 16 2020"));
        map.put("Петляков", dateFormat.parse("MAR 23 2021"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        map.entrySet().removeIf(pair -> pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8);
    }
    public static void main(String[] args) throws ParseException { // удалить исключение
        // удалить все методы из мэйн
        Map<String, Date> map = Solution.createMap();
        removeAllSummerPeople(map);


    }
}
