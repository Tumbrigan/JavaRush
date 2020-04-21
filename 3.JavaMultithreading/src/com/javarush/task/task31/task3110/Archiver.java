package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.command.ExitCommand;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            ZipFileManager zipFileManager = new ZipFileManager(Paths.get(reader.readLine()));
//            ZipFileManager zipFileManager =
//                    new ZipFileManager(Paths.get("D:\\Test\\Test.zip"));

            zipFileManager.createZip(Paths.get(reader.readLine()));
//            zipFileManager.createZip(Paths.get("D:\\Test\\ZipArchive\\FileToArchive.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        ExitCommand exitCommand = new ExitCommand();
        try {
            exitCommand.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
