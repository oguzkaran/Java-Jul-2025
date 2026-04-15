package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

import static org.csystem.util.array.ArrayUtil.partitionByEven;

public class ArrayUtilPartitionByEvenTest {
    public static void run()
    {
        int [] a = {3, 9, -5, 6, 7, -4, 2, 6, 9, 11, -56, 17, 11, 2};
        int [] expected = {6, -4, 2, 6, -56, 2, -5, 3, 9, 11, 7, 17, 11, 9};
        int expectedIndex = 6;

        int pi = partitionByEven(a);

        System.out.println(pi == expectedIndex);
        System.out.println(ArrayUtil.equals(a,  expected));
    }

    public static void main()
    {
        run();
    }
}
