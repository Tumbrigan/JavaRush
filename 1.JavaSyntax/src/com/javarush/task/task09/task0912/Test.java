package com.javarush.task.task09.task0912;

public class Test {
    public static void main(String[] args) {
        try
        {
            System.out.println("Before method1 calling.");
            int a = 1/0;
            System.out.println("After method1 calling. Never will be shown.");
        }
        catch (Exception e)
        {
            System.out.println("Any other errors. Exception has been caught.");
        }
//        catch (NullPointerException e)
//        {
//            System.out.println("Reference is null. Exception has been caught.");
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println("Divided by zero. Exception has been caught.");
//        }
    }
}
