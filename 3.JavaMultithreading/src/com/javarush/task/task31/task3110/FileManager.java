package com.javarush.task.task31.task3110;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileManager {
    private Path rootPath;
    private List<Path> fileList;


    public List<Path> getFileList() {
        return Collections.unmodifiableList(fileList);
    }

    public FileManager(Path rootPath) throws IOException {
        this.rootPath = rootPath;
        this.fileList = new ArrayList<>();
        collectFileList(rootPath);
    }

    private void collectFileList(Path path) throws IOException {
        if (Files.isRegularFile(path))
            fileList.add(rootPath.relativize(path));
        else if (Files.isDirectory(path)) {
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
                for (Path p : stream) {
                    collectFileList(p);
                }
            }
        }
    }
}