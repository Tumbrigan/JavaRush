package com.javarush.task.task37.task3714;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Древний Рим
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a roman number to be converted to decimal: ");
        String romanString = bufferedReader.readLine();
        System.out.println("Conversion result equals " + romanToInteger(romanString));
    }

    public static int romanToInteger(String romanNumber) {
        int decimal = 0;
        int lastNumber = 0;
        String romanNumeral = romanNumber.toUpperCase();
        /* operation to be performed on upper cases even if user
           enters roman values in lower case chars */
        for (int x = romanNumeral.length() - 1; x >= 0 ; x--) {
            char convertToDecimal = romanNumeral.charAt(x);

            switch (convertToDecimal) {
                case 'M':
                    decimal = processDecimal(1000, lastNumber, decimal);
                    lastNumber = 1000;
                    break;

                case 'D':
                    decimal = processDecimal(500, lastNumber, decimal);
                    lastNumber = 500;
                    break;

                case 'C':
                    decimal = processDecimal(100, lastNumber, decimal);
                    lastNumber = 100;
                    break;

                case 'L':
                    decimal = processDecimal(50, lastNumber, decimal);
                    lastNumber = 50;
                    break;

                case 'X':
                    decimal = processDecimal(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;

                case 'V':
                    decimal = processDecimal(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;

                case 'I':
                    decimal = processDecimal(1, lastNumber, decimal);
                    lastNumber = 1;
                    break;
            }
        }
        return decimal;
    }

    public static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
        if (lastNumber > decimal) {
            return lastDecimal - decimal;
        } else {
            return lastDecimal + decimal;
        }
    }

    @Test
    public void test() {
        Assert.assertEquals(romanToInteger("IV"), 4);
        Assert.assertEquals(romanToInteger("VI"), 6);
        Assert.assertEquals(romanToInteger("VIII"), 8);
        Assert.assertEquals(romanToInteger("IX"), 9);
        Assert.assertEquals(romanToInteger("XV"), 15);
        Assert.assertEquals(romanToInteger("XIX"), 19);
        Assert.assertEquals(romanToInteger("XL"), 40);
        Assert.assertEquals(romanToInteger("XLII"), 42);
        Assert.assertEquals(romanToInteger("LX"), 60);
        Assert.assertEquals(romanToInteger("LXXX"), 80);
        Assert.assertEquals(romanToInteger("LXXXIII"), 83);
        Assert.assertEquals(romanToInteger("XCIV"), 94);
        Assert.assertEquals(romanToInteger("XC"), 90);
        Assert.assertEquals(romanToInteger("CL"), 150);
        Assert.assertEquals(romanToInteger("CCLXXXIII"), 283);
        Assert.assertEquals(romanToInteger("DCCC"), 800);
        Assert.assertEquals(romanToInteger("MCMLXXXVIII"), 1988);
        Assert.assertEquals(romanToInteger("MMDCLXXXIII"), 2683);
        Assert.assertEquals(romanToInteger("MMDDCCLLXXVVII"), 3332);
        Assert.assertEquals(romanToInteger("MMMD"), 3500);
    }
}
