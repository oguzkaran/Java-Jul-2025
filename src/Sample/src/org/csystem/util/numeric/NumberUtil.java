package org.csystem.util.numeric;

/**
 * Utility class for numeric operations
 * @author Java-Jul-2025 Group 
 */
public class NumberUtil {
    public static int getDigitsPowSum(int a) 
    {
        int n = countDigits(a);
        int total = 0;
        while (a != 0) {
            total += (int)Math.pow(a % 10, n);
            a /= 10;
        }
        return total;
    }

    public static int [] digits(long a)
    {
        int [] d = new int[countDigits(a)];

        a = Math.abs(a);
        for (int i = d.length - 1; a != 0; d[i--] = (int)(a % 10), a /= 10)
            ;

        return d;
    }

    public static int countDigits(int a)
    {
        return countDigits((long)a);
    }

    public static int countDigits(long a) 
    {
        return a != 0 ? (int)Math.log10(Math.abs(a)) + 1 : 1;
    }

    public static int factorial(int n) 
    {
        int result = 1;

        for (; n >= 1; --n)
            result *= n;

        return result;
    }

    public static int fibonacciNumber(int n) 
    {
        if (n <= 2)
            return n - 1;

        int prev1 = 1, prev2, result = 1;

        for (int i = 3; i < n; ++i) {
            prev2 = prev1;
            prev1 = result;
            result = prev1 + prev2;
        }

        return result;
    }
    

    public static boolean isArmstrong(int a) 
    {
        return a >= 0 && getDigitsPowSum(a) == a;
    }

    public static boolean isEven(int a) 
    {
        return a % 2 == 0;
    }

    public static boolean isOdd(int a) 
    {
        return !isEven(a);
    }

    public static boolean isPalindrome(int a) 
    {
        return a == reverse(a);
    }

    public static boolean isPrime(long a) 
    {
        if (a <= 1)
            return false;

        if (a % 2 == 0)
            return a == 2;

        if (a % 3 == 0)
            return a == 3;

        if (a % 5 == 0)
            return a == 5;

        if (a % 7 == 0)
            return a == 7;

        for (long i = 11; i * i <= a; i += 2)
            if (a % i == 0)
                return false;

        return true;
    }

    public static int nextFibonacciNumber(int a) 
    {
        if (a < 0)
            return 0;

        int prev1 = 1, prev2 = 0, next;

        while (true) {
            next = prev1 + prev2;
            if (next > a)
                return next;

            prev2 = prev1;
            prev1 = next;
        }
    }

    public static long nextPrime(int a) 
    {
        long i;

        for (i = a + 1; !isPrime(i); ++i)
            ;

        return i;
    }

    public static long nthPrime(int n) 
    {
        long result = 2;
        int count = 0;

        for (long i = 2; count < n; ++i)
            if (isPrime(i)) {
                ++count;
                result = i;
            }

        return result;
    }

    public static int reverse(int a) 
    {
        int result = 0;

        while (a != 0) {
            result = result * 10 + a % 10;
            a /= 10;
        }

        return result;
    }

    public static int square(int a) 
    {
        return a * a;
    }

    public static int sumDigits(int a) 
    {
        return sumDigits((long)a);
    }

    public static int sumDigits(long a) 
    {
        int total = 0;

        while (a != 0) {
            total += a % 10;
            a /= 10;
        }

        return Math.abs(total);
    }
}