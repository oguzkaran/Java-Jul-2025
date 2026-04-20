package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

public class ArrayUtilBubbleSortAscendingTest {
    public static void run()
    {
        int [] a = {4, -5, 7, -4, 3, 8, 6, 9, 5, -6, 5};
        int [] expected = {-6, -5, -4, 3, 4, 5, 5, 6, 7, 8, 9};

        ArrayUtil.bubbleSort(a);

        System.out.println(ArrayUtil.equals(a,  expected));
    }

    public static void main()
    {
        run();
    }
}
