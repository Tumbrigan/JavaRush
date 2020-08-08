package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes img) {
        if (img == null) throw new IllegalArgumentException("Неизвестный тип картинки");
        ImageReader reader;
        switch (img) {
            case BMP:
                reader = new BmpReader();
                break;
            case JPG:
                reader = new JpgReader();
                break;
            case PNG:
                reader = new PngReader();
                break;
            default:
                throw new IllegalStateException("Неизвестный тип картинки");
        }
        return reader;
    }
}
