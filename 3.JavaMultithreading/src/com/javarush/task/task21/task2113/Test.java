package com.javarush.task.task21.task2113;

public class Test {
    public static Inner getInnerClass() {
        return new Test().new Inner();
    }

    public class Inner {

    }
}
