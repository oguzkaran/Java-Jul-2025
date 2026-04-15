package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

import static org.csystem.util.array.ArrayUtil.partitionByGreater;

public class ArrayUtilPartitionByGreaterTest {
    public static void run()
    {
        int [] a = {3, 9, -5, 6, 7, -4, 2, 6, 9, 11, -56, 17, 11, 2};
        int [] expected = {9, 7, 9, 11, 17, 11, 2, 6, -5, 6, -56, 3, -4, 2};
        int expectedIndex = 6;

        int pi = partitionByGreater(a, 6);

        System.out.println(pi == expectedIndex);
        System.out.println(ArrayUtil.equals(a,  expected));
    }

    public static void main()
    {
        run();
    }
}
