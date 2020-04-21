package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    Thread target;
    Thread.State state;
    Thread.State lastState;

    public LoggingStateThread(Thread thread) {
        this.target = thread;
    }

    @Override
    public void run() {

        do {
            state = target.getState();
            if (state != lastState) {
                System.out.println(target.getState());
                lastState = state;
            }
        } while (state != State.TERMINATED);
        interrupt();
    }
}
