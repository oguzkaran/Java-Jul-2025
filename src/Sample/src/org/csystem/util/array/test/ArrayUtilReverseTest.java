package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

public class ArrayUtilReverseTest {
    public static void run()
    {
        int [] a = {1, 2, 3, 4, 5};
        int [] b = {1, 2, 3, 4};
        int [] expected1 = {5, 4, 3, 2, 1};
        int [] expected2 = {4, 3, 2, 1};

        ArrayUtil.reverse(a);
        ArrayUtil.reverse(b);

        System.out.println(ArrayUtil.equals(a, expected1));
        System.out.println(ArrayUtil.equals(b, expected2));
    }

    public static void main()
    {
        run();
    }
}
