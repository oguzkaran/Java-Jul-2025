package org.csystem.util.string.test;

import org.csystem.util.string.StringUtil;
import java.util.Random;
import java.util.Scanner;

public class StringUtilRandomTextsTRENTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Input count:");
        int count = kb.nextInt();

        String [] strEN = StringUtil.randomTextsEN(r, count, 5, 15);
        String [] strTR = StringUtil.randomTextsTR(r, count, 5, 15);

        System.out.println("English Texts:");
        for (int i = 0; i < strEN.length; ++i)
            System.out.println(strEN[i]);

        System.out.println("Turkish Texts:");
        for (int i = 0; i < strTR.length; ++i)
            System.out.println(strTR[i]);
    }

    public static void main(String[] args)
    {
        run();
    }
}
