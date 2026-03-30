package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

public class ArrayUtilMaxTest {
    public static void run()
    {
        int [] a = {1, 2, 3, 4, -2, 10, 5, 6};
        long expected = 10;

        System.out.println(ArrayUtil.max(a) == expected);
    }

    public static void main()
    {
        run();
    }
}
