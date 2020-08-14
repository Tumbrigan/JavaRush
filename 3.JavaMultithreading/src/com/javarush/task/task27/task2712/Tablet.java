package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.ad.AdvertisementManager;
import com.javarush.task.task27.task2712.ad.NoVideoAvailableException;
import com.javarush.task.task27.task2712.kitchen.Order;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.NoAvailableVideoEventDataRow;

import java.io.IOException;
import java.util.Observable;
import java.util.logging.Logger;

public class Tablet extends Observable {
    private final int number;
    private Logger logger = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number) {
        this.number = number;
    }

    public Order createOrder() {
        try {
            Order order = new Order(this);
            if (!order.isEmpty()) {
                AdvertisementManager manager = new AdvertisementManager(order.getTotalCookingTime() * 60);
                callProcessingVideos(manager, order);
                setChanged();
                notifyObservers(order);
                return order;
            }
        } catch (IOException e) {
            logger.severe("Console is unavailable.");
        }
        return null;
    }

    private void callProcessingVideos(AdvertisementManager manager, Order order) {
        try {
            manager.processVideos();
        } catch (NoVideoAvailableException ex) {
            StatisticManager.getInstance().register(new NoAvailableVideoEventDataRow(order.getTotalCookingTime() * 60));
            logger.info("No video is available for the order " + order);
        }
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "number=" + number +
                '}';
    }
}
