package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {
    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        writeMessage(Dish.allDishesToString());
        List<Dish> dishes = new ArrayList<>();
        String input;
//        writeMessage("Введите желаемое блюдо: ");
        while (!(input = readString()).equals("exit")) {
            try {
                dishes.add(Dish.valueOf(input));
            } catch (IllegalArgumentException e) {
                writeMessage("Вы ввели неправильное блюдо");
            }
        }
        return dishes;
    }
}
