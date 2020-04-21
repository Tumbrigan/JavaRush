package com.javarush.task.task26.task2610;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String s = queue.take();
                System.out.println(s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
