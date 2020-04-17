package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void move() {
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }
    }

    public Horse getWinner() {
        double maxDistance = 0;
        int count = 0;

        for (int i = 0; i < horses.size(); i++) {
            if (maxDistance < horses.get(i).getDistance())
            maxDistance = horses.get(i).getDistance();
            count = i;
        }
        return getHorses().get(count);
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) {
        game = new Hippodrome(new ArrayList<>());

        Horse white = new Horse("White", 3, 0);
        Horse black = new Horse("Black", 3, 0);
        Horse grey = new Horse("Gray", 3, 0);

        game.horses.add(white);
        game.horses.add(black);
        game.horses.add(grey);

        game.run();

        game.printWinner();

    }
}
