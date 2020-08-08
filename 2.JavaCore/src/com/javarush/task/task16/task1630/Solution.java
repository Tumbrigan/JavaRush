package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {

        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();   //---------------------------------------------------------------
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String filePath;
        private String content = "";

        @Override
        public void setFileName(String fullFileName) {
            this.filePath = fullFileName;
        }

        @Override
        public void run() {
            String s;
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                while ((s = reader.readLine()) != null) {
                    content += s + " ";
                }
            } catch (FileNotFoundException e) {
                System.out.println("File is not found");
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }

        @Override
        public String getFileContent() {
            return content.trim();
        }
    }
}
