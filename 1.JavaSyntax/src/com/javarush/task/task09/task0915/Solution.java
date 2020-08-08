package com.javarush.task.task09.task0915;

import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/* 
Перехват выборочных исключений
*/

public class Solution {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {
        try {
            handleExceptions();
//        } catch (FileSystemException exc) {
//            BEAN.log(exc);
        } catch (FileSystemException | FileNotFoundException exc) {
            BEAN.log(exc);
        }
    }

    public static void handleExceptions() throws FileNotFoundException, FileSystemException { //должен вызывать метод BEAN.methodThrowExceptions и обрабатывать исключения
        try {
            BEAN.methodThrowExceptions();
        } catch (FileSystemException exc) {
            BEAN.log(exc);
            throw exc;
        } catch (CharConversionException exc) {
            BEAN.log(exc);
        } catch (IOException exc) {
            BEAN.log(exc);
        }
    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0) {
                throw new CharConversionException();
            } else if (i == 1) {
                throw new FileSystemException("");
            } else if (i == 2) {
                throw new IOException();
            }
        }
    }
}