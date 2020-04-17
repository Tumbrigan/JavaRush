package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String path = reader.readLine();
//            String path = "D:\\file.txt";

            StringBuilder stringBuilder = new StringBuilder();
            HashMap<String, String> map = new LinkedHashMap<>();

            try (BufferedReader fileReader = new BufferedReader(new FileReader(path))) {
                String str;
                while ((str = fileReader.readLine()) != null) {
                    stringBuilder.append(str).append(" ");
                }

                String[] strings = stringBuilder.toString().split(" ");

                for (int i = 0; i < strings.length - 1; i++) {
                    for (int j = i + 1; j < strings.length; j++) {
                        String first = strings[i];
                        String second = new StringBuilder(strings[j]).reverse().toString();
                        if (first.equals(second)) {
                            map.put(first, strings[j]);
                        }
                    }
                }

                for (Map.Entry<String, String> entry : map.entrySet()) {
                    Pair pair = new Pair();
                    pair.first = entry.getKey();
                    pair.second = entry.getValue();
                    result.add(pair);
                }

                for (Pair p : result) {
                    System.out.println(p.first + " " + p.second);
                }
            }
        } catch (IOException e) {
            e.getMessage();
        }

    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
