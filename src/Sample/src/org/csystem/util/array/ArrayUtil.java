package org.csystem.util.array;

import java.util.Random;

/**
 * Utility class for string operations
 * @author Java-Jul-2025 Group
 */
public class ArrayUtil {
    public static double average(int [] a)
    {
        return (double)sum(a) / a.length;
    }

    public static boolean equals(int [] a, int [] b)
    {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i])
                return false;

        return true;
    }

    public static int max(int [] a)
    {
        int result = a[0];

        for (int i = 1; i < a.length; ++i)
            result = Math.max(result, a[i]);

        return result;
    }

    public static int min(int [] a)
    {
        int result = a[0];

        for (int i = 1; i < a.length; ++i)
            result = Math.min(result, a[i]);

        return result;
    }

    public static void print(int [] a)
    {
        print(a, " ", "\n");
    }

    public static void print(int [] a, String sep, String end)
    {
        for (int i = 0; i < a.length; ++i)
            System.out.printf("%d%s", a[i], sep);

        System.out.print(end);
    }

    public static int [] randomArray(Random random, int n, int origin, int bound)
    {
        int [] a = new int [n];

        for (int i = 0; i < n; ++i)
            a[i] = random.nextInt(origin, bound);

        return a;
    }

    public static void reverse(int[] a)
    {

    }

    public static int [] reversed(int[] a)
    {

    }

    public static long sum(int [] a)
    {
        long total = 0;

        for (int i = 0; i < a.length; ++i)
            total += a[i];

        return total;
    }
}
