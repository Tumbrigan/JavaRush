package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        Thread thread1 = new Thread(new SpecialThread());
        Thread thread2 = new Thread(new SpecialThread());
        Thread thread3 = new Thread(new SpecialThread());
        Thread thread4 = new Thread(new SpecialThread());
        Thread thread5 = new Thread(new SpecialThread());

        list.add(thread1);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);
        list.add(thread5);



//        Runnable thread1 = new SpecialThread();
//        Runnable thread2 = new SpecialThread();
//        Runnable thread3 = new SpecialThread();
//        Runnable thread4 = new SpecialThread();
//        Runnable thread5 = new SpecialThread();

//        list.add(new Thread(thread1));
//        list.add(new Thread(thread2));
//        list.add(new Thread(thread3));
//        list.add(new Thread(thread4));
//        list.add(new Thread(thread5));

//        for (int i = 0; i < list.size(); i++) {
//            list.get(i).start();
//            System.out.println(list.get(i).getName());
//        }
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
