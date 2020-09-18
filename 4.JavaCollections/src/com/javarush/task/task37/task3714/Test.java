package com.javarush.task.task37.task3714;

import org.junit.Assert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a roman number to be converted to decimal: ");
        String romanString = bufferedReader.readLine();
        System.out.println("Conversion result equals " + roman2Decimal(romanString));
    }

    public static int roman2Decimal(String roman) {
        int sum = 0;
        int[] decimals = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] literals = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < decimals.length; i++) {
            while (roman.indexOf(literals[i]) == 0) {
                sum += decimals[i];
                roman = roman.substring(literals[i].length());
            }
        }
        return sum;
    }

    @org.junit.Test
    public void test() {
        Assert.assertEquals(roman2Decimal("IV"), 4);
        Assert.assertEquals(roman2Decimal("VI"), 6);
        Assert.assertEquals(roman2Decimal("VIII"), 8);
        Assert.assertEquals(roman2Decimal("IX"), 9);
        Assert.assertEquals(roman2Decimal("XV"), 15);
        Assert.assertEquals(roman2Decimal("XIX"), 19);
        Assert.assertEquals(roman2Decimal("XL"), 40);
        Assert.assertEquals(roman2Decimal("XLII"), 42);
        Assert.assertEquals(roman2Decimal("LX"), 60);
        Assert.assertEquals(roman2Decimal("LXXX"), 80);
        Assert.assertEquals(roman2Decimal("LXXXIII"), 83);
        Assert.assertEquals(roman2Decimal("XCIV"), 94);
        Assert.assertEquals(roman2Decimal("XC"), 90);
//        Assert.assertEquals(roman2Decimal("CL"), 150);
//        Assert.assertEquals(roman2Decimal("CCLXXXIII"), 283);
//        Assert.assertEquals(roman2Decimal("DCCC"), 800);
//        Assert.assertEquals(roman2Decimal("MCMLXXXVIII"), 1988);
//        Assert.assertEquals(roman2Decimal("MMDCLXXXIII"), 2683);
//        Assert.assertEquals(roman2Decimal("MMDDCCLLXXVVII"), 3332);
//        Assert.assertEquals(roman2Decimal("MMMD"), 3500);
    }
}
