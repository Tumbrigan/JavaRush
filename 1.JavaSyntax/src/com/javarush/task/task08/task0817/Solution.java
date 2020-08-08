package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();

        map.put("Kucher1", "Ihor1");
        map.put("Kucher2", "Ihor2");
        map.put("Kucher3", "Ihor3");
        map.put("Kucher4", "Ihor1");
        map.put("Kucher5", "Ihor4");
        map.put("Kucher6", "Ihor5");
        map.put("Kucher7", "Ihor3");
        map.put("Kucher8", "Ihor7");
        map.put("Kucher9", "Ihor8");
        map.put("Kucher10", "Ihor9");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>(map.values());
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    removeItemFromMapByValue(map, list.get(j));
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
