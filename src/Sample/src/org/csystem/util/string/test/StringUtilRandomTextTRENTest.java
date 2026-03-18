package org.csystem.util.string.test;

import org.csystem.util.string.StringUtil;

import java.util.*;

public class StringUtilRandomTextTRENTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Input count:");
        int count = kb.nextInt();

        System.out.println(StringUtil.randomTextTR(r, count));
        System.out.println(StringUtil.randomTextEN(r, count));
    }

    public static void main(String[] args)
    {
        run();
    }
}
