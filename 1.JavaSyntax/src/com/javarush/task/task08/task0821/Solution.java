package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();

        map.put("Иванов", "Вася");
        map.put("Федоров", "Юра");
        map.put("Курч", "Саша");
        map.put("Федорина", "Евдокия");
        map.put("Курч", "Буч");
        map.put("Буч", "Курс");
        map.put("Минин", "Саша");
        map.put("Сашин", "Вася");
        map.put("Иванов", "Глаша");
        map.put("Федоров", "Яша");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
