package org.csystem.util.string.test;

import org.csystem.util.string.StringUtil;
import java.util.Random;
import java.util.Scanner;

public class StringUtilReverseTest {
    public static void run()
    {
        String s = "ankara";
        String expected = "arakna";

        System.out.println(StringUtil.reverse(s).equals(expected));
    }

    public static void main(String[] args)
    {
        run();
    }
}
