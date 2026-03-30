package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

public class ArrayUtilMinTest {
    public static void run()
    {
        int [] a = {1, 2, 3, 4, -2, 10, 5, 6};
        long expected = -2;

        System.out.println(ArrayUtil.min(a) == expected);
    }

    public static void main()
    {
        run();
    }
}
