package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

public class ArrayUtilSumTest {
    public static void run()
    {
        int [] a = {1, 2, 3, 4, 5, 6, 7};
        long expected = 28;

        System.out.println(ArrayUtil.sum(a) == expected);
    }

    public static void main()
    {
        run();
    }
}
