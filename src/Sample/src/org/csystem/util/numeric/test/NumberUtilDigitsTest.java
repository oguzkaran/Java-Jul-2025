package org.csystem.util.numeric.test;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.numeric.NumberUtil;

public class NumberUtilDigitsTest {
    public static void run()
    {
        long a = 12345678912L;
        long b = 0;
        long c = -12345678912L;
        int [] expectedDigitsAC = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2};
        int [] expectedDigitsB = {0};

        System.out.println(ArrayUtil.equals(NumberUtil.digits(a), expectedDigitsAC));
        System.out.println(ArrayUtil.equals(NumberUtil.digits(c), expectedDigitsAC));
        System.out.println(ArrayUtil.equals(NumberUtil.digits(b), expectedDigitsB));
    }

    public static void main(String[] args)
    {
        run();
    }
}
