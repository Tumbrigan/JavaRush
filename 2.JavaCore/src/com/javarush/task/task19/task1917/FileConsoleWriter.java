package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.*;
import java.util.Arrays;

public class FileConsoleWriter {

    private FileWriter fileWriter;


    public static void main(String[] args) throws Exception {
        char[] chars = {'a' , 'b', 'c', 'q', 'w', 'e', 't'};

        FileConsoleWriter fcw = new FileConsoleWriter("D:\\file.txt");
        fcw.write(chars, 1, 3);

        fcw.close();
    }

    ////////////////////////////////////
    public FileConsoleWriter(File file) throws IOException{
        this.fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException{
        this.fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter(FileDescriptor fd) throws IOException{
        this.fileWriter = new FileWriter(fd);
    }

    public FileConsoleWriter(String fileName) throws IOException{
        this.fileWriter = new FileWriter(fileName);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException{
        this.fileWriter = new FileWriter(fileName, append);
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        this.fileWriter.write(cbuf, off, len);
        char[] chars = Arrays.copyOfRange(cbuf, off, off + len);
        System.out.println(chars);
    }

    public void write(int c) throws IOException {
        this.fileWriter.write(c);
        System.out.println(c);
    }

    public void write(String str) throws IOException {
        this.fileWriter.write(str);
        System.out.println(str);
    }

    public void write(String str, int off, int len) throws IOException {
        this.fileWriter.write(str, off, len);
        System.out.println(str.substring(off, off + len));

    }

    public void write(char[] cbuf) throws IOException {
        this.fileWriter.write(cbuf);
        System.out.println(cbuf);
    }

    public void close() throws IOException {
        this.fileWriter.close();
    }
}
