package org.csystem.util.string.test;

import org.csystem.util.string.StringUtil;

public class StringUtilLettersTest {
    public static void run()
    {
        String s = "ankara06istanbul34";
        String expected = "ankaraistanbul";

        System.out.println(StringUtil.letters(s).equals(expected));
    }

    public static void main(String[] args)
    {
        run();
    }
}
