package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<>();
        map.put("cat1", new Cat("Bar"));
        map.put("cat2", new Cat("Car"));
        map.put("cat3", new Cat("John"));
        map.put("cat4", new Cat("Marta"));
        map.put("cat5", new Cat("Sui"));
        map.put("cat6", new Cat("Bob"));
        map.put("cat7", new Cat("Crab"));
        map.put("cat8", new Cat("Pig"));
        map.put("cat9", new Cat("Owl"));
        map.put("cat10", new Cat("Deer"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<>();
        for (Map.Entry<String, Cat> entry: map.entrySet()) {
            set.add(entry.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
