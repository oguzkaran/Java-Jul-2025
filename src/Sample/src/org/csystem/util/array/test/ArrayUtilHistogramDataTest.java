package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

import static org.csystem.util.array.ArrayUtil.histogramData;

public class ArrayUtilHistogramDataTest {
    public static void run()
    {
        int [] a = {2, 3, 2, 1, 5, 5, 1, 3, 0, 2, 5, 1, 5, 3, 0, 3, 2};
        int [] expected = {2, 3, 4, 4, 0, 4};

        System.out.println(ArrayUtil.equals(histogramData(a, 5),  expected));
    }

    public static void main()
    {
        run();
    }
}
