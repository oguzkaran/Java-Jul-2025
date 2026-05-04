package org.csystem.util.string.test;

import org.csystem.util.string.StringUtil;

public class StringUtilJoinTest {
    public static void run()
    {
        String [] str = {"ankara", "istanbul", "izmir", "  ", "zonguldak"};

        System.out.println(StringUtil.join(str, "--", true).equals("ankara--istanbul--izmir--zonguldak"));
        System.out.println(StringUtil.join(str, "--", false).equals("ankara--istanbul--izmir--  --zonguldak"));
        System.out.println(StringUtil.join(str, "--").equals("ankara--istanbul--izmir--  --zonguldak"));
    }

    public static void main(String[] args)
    {
        run();
    }
}
