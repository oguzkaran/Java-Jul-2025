package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

public class ArrayUtilAverageTest {
    public static void run()
    {
        int [] a = {1, 2, 3, 4};
        double expected = 2.5;
        double delta = 0.00001;

        System.out.println(ArrayUtil.average(a) - expected < delta);
    }

    public static void main()
    {
        run();
    }
}
