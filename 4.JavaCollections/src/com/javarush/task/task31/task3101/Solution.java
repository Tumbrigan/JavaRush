package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

/*
Проход по дереву файлов
*/
public class Solution {
    //    private List<String> filesList = new ArrayList<>();
    private Map<String, String> filesList = new TreeMap<>();
    private File path;
    private File resultFileAbsolutePath;

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.path = new File(args[0]);      // путь к директории, откуда нужно копировать файлы
        solution.resultFileAbsolutePath = new File(args[1]);    // полный путь существующего файла

        File newResultFile = solution.renameFile(
                solution.resultFileAbsolutePath, "allFilesContent.txt");
        if (solution.path.listFiles() != null)
            solution.addAddressToList(solution.path.listFiles());

        solution.addInfoToFile(newResultFile);
    }


    // add String values of file names into TreeMap
    public void addAddressToList(File[] files) {
        for (File f : files) {
            if (f.isDirectory())
                addAddressToList(f.listFiles());
            else if (f.isFile() & (f.length() <= 50)) {
                filesList.put(f.getName(), f.getParent());
            }
        }
    }

    public void addInfoToFile(File destinationFile) {
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(destinationFile))) {
            for (Map.Entry<String, String> entry : filesList.entrySet()) {
                File currentFileToRead = new File(entry.getValue() + "/" + entry.getKey());
                try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(currentFileToRead))) {
                    while (inputStream.available() > 0) {
                        outputStream.write(inputStream.read());
                    }
                }
                outputStream.write("\n".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public File renameFile(File source, String newName) {
        String pathToFileDestination = source.getParent() + "/" + newName;
        File fileDestination = new File(pathToFileDestination);
        FileUtils.renameFile(source, fileDestination);
        return fileDestination;
    }
}