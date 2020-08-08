package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
//        String str = "2013-08-18";
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date parsingDate = ft.parse(str);
        SimpleDateFormat ft1 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);


        System.out.println(ft1.format(parsingDate).toUpperCase());
    }
}