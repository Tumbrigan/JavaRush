package com.javarush.task.task27.task2712.ad;

public class Advertisement {
    private Object content; // сам рекламный ролик
    private String name; // имя/название
    private long initialAmount; // начальная сумма, стоимость рекламы в копейках
    private int hits; // количество оплаченный показов
    private int duration; // продолжительность в секундах одного ролика(?)
    private long amountPerOneDisplaying; // стоимость одного показа рекламного объявления в копейках

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public long getAmountPerOneDisplaying() {
        return amountPerOneDisplaying;
    }

    public Advertisement(Object content, String name, long initialAmount, int hits, int duration) {
        this.content = content;
        this.name = name;
        this.initialAmount = initialAmount;
        this.hits = hits;
        this.duration = duration;
        this.amountPerOneDisplaying = hits > 0 ? initialAmount / hits : 0;
    }

    public void revalidate() {
        if (hits > 0)
            hits--;
        else
            throw new UnsupportedOperationException();
    }

    public int getHits() {
        return hits;
    }

    @Override
    public String toString() {
        return name + " is displaying... "
                + amountPerOneDisplaying + ", "
                + getAmountPerOneDisplaying() * 1000 / duration;
    }
}
