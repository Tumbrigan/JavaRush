package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        /*InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
*/
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //System.out.print("Enter a number please: ");
        String sAge = bufferedReader.readLine(); // enter a number using the keyboard
        int nAge = Integer.parseInt(sAge);

        //System.out.print("Enter his name please: ");
        String name = bufferedReader.readLine(); // enter a name using the keyboard
        /*String year;
        int years = nAge % 10;
        switch (years) {
            case (1):
                year = "год";
                break;
            case (2):
            case (3):
            case (4):
                year = "года";
                break;
            default:
                year = "лет";
        }*/

        //System.out.println(name + " захватит мир через " + sAge + " " + year + ". Му-ха-ха!"); //Вася захватит мир через 8 лет. Му-ха-ха!
        System.out.println(name + " захватит мир через " + sAge + " лет. Му-ха-ха!"); //Вася захватит мир через 8 лет. Му-ха-ха!

    }
}
