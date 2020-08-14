package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Waiter;

public class Restaurant {
    public static void main(String[] args) {
        Tablet tablet = new Tablet(5);
        Cook cook = new Cook("Alex");
        Waiter waiter = new Waiter();
        cook.addObserver(waiter);
        tablet.addObserver(cook);

        Tablet tablet2 = new Tablet(3);
        Cook cook2 = new Cook("Vasya");
        Waiter waiter2 = new Waiter();
        cook2.addObserver(waiter2);
        tablet2.addObserver(cook2);
//
        tablet.createOrder();
        tablet2.createOrder();
        tablet.createOrder();
        tablet.createOrder();
        tablet.createOrder();

        DirectorTablet directorTablet = new DirectorTablet();
        directorTablet.printAdvertisementProfit();
        directorTablet.printCookWorkloading();
        directorTablet.printActiveVideoSet();
        directorTablet.printArchivedVideoSet();
    }
}