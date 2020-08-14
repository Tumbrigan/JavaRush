package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.CookedOrderEventDataRow;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Cook extends Observable implements Observer {
    private final String name;

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void update(Observable o, Object arg) {
        ConsoleHelper.writeMessage(arg.toString());
        ConsoleHelper.writeMessage("Start cooking - " + arg.toString());
        setChanged();
        notifyObservers(arg);

        // (14)
        Order order = (Order) arg;
        String tabletNumber = order.getTablet().getNumber() + "";
        List<Dish> dishes = order.getDishes();
        int cookingTime = order.getTotalCookingTime();
        StatisticManager.getInstance()
                .register(new CookedOrderEventDataRow(tabletNumber, name,
                        cookingTime, dishes));
    }
}
