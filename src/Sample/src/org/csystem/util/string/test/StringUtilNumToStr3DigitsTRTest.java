package org.csystem.util.string.test;

import org.csystem.util.string.StringUtil;

public class StringUtilNumToStr3DigitsTRTest {
    public static void run()
    {
        int a = 1;
        String expectedA = "bir";
        int b = 100;
        String expectedB = "yüz";
        int c = 102;
        String expectedC = "yüziki";
        int d = 110;
        String expectedD = "yüzon";
        int e = 497;
        String expectedE = "dörtyüzdoksanyedi";

        System.out.println(StringUtil.numToStr3DigitsTR(a).equals(expectedA));
        System.out.println(StringUtil.numToStr3DigitsTR(b).equals(expectedB));
        System.out.println(StringUtil.numToStr3DigitsTR(c).equals(expectedC));
        System.out.println(StringUtil.numToStr3DigitsTR(d).equals(expectedD));
        System.out.println(StringUtil.numToStr3DigitsTR(e).equals(expectedE));
    }

    public static void main(String[] args)
    {
        run();
    }
}
