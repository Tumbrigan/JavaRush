package com.javarush.task.task15.task1529;

public class Helicopter implements CanFly {
    @Override
    public void fly() {
        System.out.println("This is a helicopter. It can fly up and lend. It contains no passengers, only two pilots.");
    }
}
