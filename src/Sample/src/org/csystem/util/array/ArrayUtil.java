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

    public static boolean hasLength(int [] a)
    {
        return !isEmpty(a);
    }

    public static int [] histogramData(int [] a, int n)
    {
        int [] counts = new int[n + 1];

        for (int i = 0; i < a.length; ++i)
            ++counts[a[i]];

        return counts;
    }

    public static boolean isEmpty(int [] a)
    {
        return a.length == 0;
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
    public static int partitionByLess(int [] a, int threshold)
    {
        int pi = 0;

        while (pi != a.length && a[pi] < threshold)
            ++pi;

        if (pi == a.length)
            return pi;

        for (int i = pi + 1; i < a.length; ++i)
            if (a[i] < threshold)
                swap(a, i, pi++);

        return pi;
    }

    public static int partitionByGreater(int [] a, int threshold)
    {
        int pi = 0;

        while (pi != a.length && threshold < a[pi])
            ++pi;

        if (pi == a.length)
            return pi;

        for (int i = pi + 1; i < a.length; ++i)
            if (threshold < a[i])
                swap(a, i, pi++);

        return pi;
    }

    public static int partitionByEven(int [] a)
    {
        int pi = 0;

        while (pi != a.length && a[pi] % 2 == 0)
            ++pi;

        if (pi == a.length)
            return pi;

        for (int i = pi + 1; i < a.length; ++i)
            if (a[i] % 2 == 0)
                swap(a, i, pi++);

        return pi;
    }

    public static void print(int [] a)
    {
        print(a, " ", "\n");
    }

    public static void print(int [] a, int n)
    {
        print(a, n, " ", "\n");
    }

    public static void print(int [] a, int n, String sep, String end)
    {
        String fmt = "%%0%dd%s".formatted(n, sep);

        for (int i = 0; i < a.length; ++i)
            System.out.printf(fmt, a[i], sep);

        System.out.print(end);
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
        int first = 0;
        int last = a.length - 1;

        while (first < last)
            swap(a, first++, last--);
    }

    public static int [] reversed(int[] a)
    {
        int [] result = new int [a.length];

        for (int i = a.length - 1; i >= 0; --i)
            result[result.length - 1 - i] = a[i];

        return result;
    }

    public static long sum(int [] a)
    {
        long total = 0;

        for (int i = 0; i < a.length; ++i)
            total += a[i];

        return total;
    }

    public static void swap(long [] a, int i, int k)
    {
        long temp = a[i];

        a[i] = a[k];
        a[k] = temp;
    }

    public static void swap(int [] a, int i, int k)
    {
        int temp = a[i];

        a[i] = a[k];
        a[k] = temp;
    }

    public static void swap(double [] a, int i, int k)
    {
        double temp = a[i];

        a[i] = a[k];
        a[k] = temp;
    }
}
