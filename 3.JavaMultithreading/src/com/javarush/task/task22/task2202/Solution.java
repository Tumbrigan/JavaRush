package com.javarush.task.task22.task2202;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("Амиго и Диего лучшие друзья!"));
    }

    public static String getPartOfString(String string) {
        if (string == null)
            throw new TooShortStringException();
        String[] strings = string.split(" ");
        String s = "";
        try {
            for (int i = 1; i < 5; i++) {
                s = s + strings[i] + " ";
            }
            return s.trim();
        } catch (IndexOutOfBoundsException e) {
            throw new TooShortStringException(e);
        }
    }

    public static class TooShortStringException extends RuntimeException {
        public TooShortStringException() {
        }

        public TooShortStringException(Throwable cause) {
            super(cause);
        }
    }
}
