package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

import static org.csystem.util.array.ArrayUtil.partitionByLess;

public class ArrayUtilPartitionByLessTest {
    public static void run()
    {
        int [] a = {3, 9, -5, 6, 7, -4, 2, 6, 9, 11, -56, 17, 11, 2};
        int [] expected = {3, -5, -4, 2, -56, 2, 6, 6, 9, 11, 7, 17, 11, 9};
        int expectedIndex = 6;

        int pi = partitionByLess(a, 6);

        System.out.println(pi == expectedIndex);
        System.out.println(ArrayUtil.equals(a,  expected));
    }

    public static void main()
    {
        run();
    }
}
