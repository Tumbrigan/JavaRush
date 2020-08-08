package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();

        map.put("Иванов", "Иван");
        map.put("Авраменко", "Ярослав");
        map.put("Барабанов", "Стас");
        map.put("Ипатенков", "Юорий");
        map.put("Спесивцев", "Стас");
        map.put("Коваленко", "Марина");
        map.put("Исаков", "Никита");
        map.put("Кучер", "Иван");
        map.put("Столяров", "Виктор");
        map.put("Федоров", "Юрий");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int counter = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) {
                counter++;
            }
        }
        return counter;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int counter = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) {
                counter ++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

    }
}
