package com.javarush.task.task15.task1529;

public class Plane implements CanFly {
    @Override
    public void fly() {}

    public Plane(int n) {
        System.out.println("This is a plane. It can fly up and lend. It contains " + n + " passengers.");
    }
}
