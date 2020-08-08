package com.javarush.task.task19.task1918;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();
            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
                StringBuilder builder = new StringBuilder();
                String line;
                while ((line = fileReader.readLine()) != null) {
                    builder.append(line);
                }

                String mainLine = builder.toString();
                Document document = Jsoup.parse(mainLine,  "", Parser.xmlParser());
                Elements elements = document.select(args[0]);

                for (Element e : elements)
                    System.out.println(e);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
