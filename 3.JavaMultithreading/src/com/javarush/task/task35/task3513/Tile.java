package com.javarush.task.task35.task3513;

import java.awt.*;

public class Tile {
    int value;

    public Tile(int value) {
        this.value = value;
    }

    public Tile() {
    }

    public boolean isEmpty() {
        return value == 0;
    }

    public Color getFontColor() {
        if (value < 16)
            return new Color(0x776e65);
        return new Color(0xf9f6f2);
    }

    public Color getTileColor() {
        int valueForColor;
        switch (value) {
            case 0:
                valueForColor = 0xcdc1b4;
                break;
            case 2:
                valueForColor = 0xeee4da;
                break;
            case 4:
                valueForColor = 0xede0c8;
                break;
            case 8:
                valueForColor = 0xf2b179;
                break;
            case 16:
                valueForColor = 0xf59563;
                break;
            case 32:
                valueForColor = 0xf67c5f;
                break;
            case 64:
                valueForColor = 0xf65e3b;
                break;
            case 128:
                valueForColor = 0xedcf72;
                break;
            case 256:
                valueForColor = 0xedcc61;
                break;
            case 512:
                valueForColor = 0xedc850;
                break;
            case 1024:
                valueForColor = 0xedc53f;
                break;
            case 2048:
                valueForColor = 0xedc22e;
                break;
            default:
                valueForColor = 0xff0000;
        }
        return new Color(valueForColor);
    }
}
