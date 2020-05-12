package com.javarush.task.task28.task2805;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {
    private static final AtomicInteger threadPriority = new AtomicInteger(Thread.MIN_PRIORITY);

    {
        int currentThreadPriority = threadPriority.getAndIncrement();
        if (threadPriority.get() > Thread.MAX_PRIORITY)
            threadPriority.set(Thread.MIN_PRIORITY);
        if (currentThreadPriority > getThreadGroup().getMaxPriority())
            currentThreadPriority = getThreadGroup().getMaxPriority();
        setPriority(currentThreadPriority);
    }

    public MyThread() {
    }

    public MyThread(Runnable target) {
        super(target);
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
    }

    public MyThread(String name) {
        super(name);
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
    }
}
