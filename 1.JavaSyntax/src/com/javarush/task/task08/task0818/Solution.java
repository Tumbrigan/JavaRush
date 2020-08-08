package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();

        map.put("Ihor0", 450);
        map.put("Ihor1", 750);
        map.put("Ihor2", 1000);
        map.put("Ihor3", 1200);
        map.put("Ihor4", 1400);
        map.put("Ihor5", 1500);
        map.put("Ihor6", 2000);
        map.put("Ihor7", 2500);
        map.put("Ihor8", 2750);
        map.put("Ihor9", 3000);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        
    }
}