package com.javarush.task.task26.task2611;

import java.util.concurrent.ConcurrentHashMap;

public class Producer implements Runnable {
    private ConcurrentHashMap<String, String> map;
    private int count;

    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        while (true) {
            try {
                map.put("" + ++count, "Some text for " + count);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread() + " thread was terminated");
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
