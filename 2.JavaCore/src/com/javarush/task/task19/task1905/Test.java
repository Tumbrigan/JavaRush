package com.javarush.task.task19.task1905;

public class Test {
    public static void main(String[] args) {
        String phoneNumber = "+38(050)123-45-67";
        phoneNumber = phoneNumber.replaceAll("[^0-9]", "");
        System.out.println("callto://+"  + phoneNumber);
//        System.out.println(str.split(",\\s")[0]);
//        System.out.println(str.split("\\s")[1]);
    }
}
