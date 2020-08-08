package com.javarush.task.task21.task2107;

public class Car
{
    public class Door
    {

    }
}

class LamborghiniDoor extends Car.Door
{
    LamborghiniDoor(Car car)
    {
        car.super();
    }
}