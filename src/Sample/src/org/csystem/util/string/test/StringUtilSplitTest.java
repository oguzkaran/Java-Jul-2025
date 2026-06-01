package org.csystem.util.string.test;

import org.csystem.util.string.StringUtil;

import java.util.Arrays;

public class StringUtilSplitTest {
    public static void runTestRemoveEmpties1()
    {
        String s = "Bugün hava çok  güzel. Bu güzel havada denize mi gitsek?";
        String [] expected = {"Bugün", "hava", "çok", "güzel", "Bu", "güzel", "havada", "denize", "mi", "gitsek?"};
        String separators = " .";

        System.out.println(Arrays.equals(StringUtil.split(s, separators, true), expected));
    }

    public static void runTestRemoveEmpties2()
    {
        String s = "Bugün hava [çok] güzel. Bu [güzel] havada denize mi gitsek?";
        String [] expected = {"Bugün", "hava", "çok", "güzel", "Bu", "güzel", "havada", "denize", "mi", "gitsek?"};
        String separators = " ][.";

        System.out.println(Arrays.equals(StringUtil.split(s, separators, true), expected));
    }

    public static void runTestNotRemoveEmpties1()
    {
        String s = "Bugün hava çok  güzel. Bu güzel havada denize mi gitsek?";
        String [] expected = {"Bugün", "hava", "çok","", "güzel", "", "Bu", "güzel", "havada", "denize", "mi", "gitsek?"};
        String separators = " .";

        System.out.println(Arrays.equals(StringUtil.split(s, separators), expected));
    }

    public static void runTestNotRemoveEmpties2()
    {
        String s = "Bugün hava [çok] güzel. Bu [güzel] havada denize mi gitsek?";
        String [] expected = {"Bugün", "hava", "", "çok", "", "güzel", "", "Bu", "", "güzel", "", "havada", "denize", "mi", "gitsek?"};
        String separators = " ][.";

        System.out.println(Arrays.equals(StringUtil.split(s, separators), expected));
    }

    public static void main(String[] args)
    {
        runTestRemoveEmpties1();
        runTestRemoveEmpties2();
        runTestNotRemoveEmpties1();
        runTestNotRemoveEmpties2();
    }
}
