package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/* 
Что внутри папки?
*/
/*
Напиши программу, которая будет считать подробную информацию о папке
и выводить ее на консоль.
 */
public class Solution {

    public static void main(String[] args) throws IOException {
//  Первым делом считай путь к папке с консоли.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Path mainFolder = Paths.get(reader.readLine());

//  Если введенный путь не является директорией - выведи "[полный путь] - не папка"
//  и заверши работу.
        if (!Files.isDirectory(mainFolder)) {
            System.out.println(mainFolder.toString() + " - не папка");
            return;
        }

//  Затем посчитай и выведи следующую информацию:
        Solution.MyFileVisitor fileVisitor = new Solution.MyFileVisitor(); // можно и без Solution. поскольку вызов из внешнего класса
        Files.walkFileTree(mainFolder, fileVisitor);

//  Всего папок - [количество папок в директории и поддиректориях]
        fileVisitor.printFoldersCount();

//  Всего файлов - [количество файлов в директории и поддиректориях]
        fileVisitor.printFilesCount();

//  Общий размер - [общее количество байт, которое хранится в директории]
        fileVisitor.printSizeCount();

/*  Используй только классы и методы из пакета java.nio.
    Квадратные скобки [ ] выводить на экран не нужно.
    */
    }

    private static class MyFileVisitor extends SimpleFileVisitor<Path> {
        private int foldersCounter;
        private int filesCounter;
        private long sizeCounter;


        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            this.foldersCounter++;
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            this.sizeCounter += Files.size(file);
            this.filesCounter++;
            return FileVisitResult.CONTINUE;
        }

        public void printFoldersCount() {
            System.out.println("Всего папок - " + (foldersCounter - 1)); // поскольку внешняя папка тоже считается, то отнимаем её от общего числа
        }

        public void printFilesCount() {
            System.out.println("Всего файлов - " + (filesCounter));
        }

        public void printSizeCount() {
            System.out.println("Общий размер - " + (sizeCounter));
        }
    }
}
