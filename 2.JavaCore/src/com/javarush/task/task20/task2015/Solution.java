package com.javarush.task.task20.task2015;

import java.io.*;

/* 
Переопределение сериализации
*/
public class Solution implements Serializable, Runnable {
    private transient Thread runner;
    private int speed;

    public Solution(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public void run() {
        // do something here, doesn't matter what
        System.out.println("Hello");
        System.out.println("I'm Paul Corney");
        System.out.println(this.speed);
    }

    /**
     Переопределяем сериализацию.
     Для этого необходимо объявить методы:
     private void writeObject(ObjectOutputStream out) throws IOException
     private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     Теперь сериализация/десериализация пойдет по нашему сценарию :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        System.out.println("I'm writing the object");
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        new Thread(this).start();
        System.out.println("I'm reading the object");

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("D:\\data.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Solution s = new Solution(50);
        oos.writeObject(s);
        fos.close();

        FileInputStream fis = new FileInputStream("D:\\data.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Solution s2 = (Solution) ois.readObject();
    }
}
