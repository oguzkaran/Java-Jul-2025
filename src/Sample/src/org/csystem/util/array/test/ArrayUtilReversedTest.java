package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

public class ArrayUtilReversedTest {
    public static void run()
    {
        int [] a = {1, 2, 3, 4, 5};
        int [] b = {1, 2, 3, 4};
        int [] expected1 = {1, 2, 3, 4, 5};
        int [] expected2 = {1, 2, 3, 4};
        int [] expectedReversed1 = {5, 4, 3, 2, 1};
        int [] expectedReversed2 = {4, 3, 2, 1};

        int [] ar = ArrayUtil.reversed(a);
        int [] br = ArrayUtil.reversed(b);

        System.out.println(ArrayUtil.equals(a, expected1));
        System.out.println(ArrayUtil.equals(b, expected2));
        System.out.println(ArrayUtil.equals(ar, expectedReversed1));
        System.out.println(ArrayUtil.equals(br, expectedReversed2));
    }

    public static void main()
    {
        run();
    }
}
