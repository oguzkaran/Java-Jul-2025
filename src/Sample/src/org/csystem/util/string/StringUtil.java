package org.csystem.util.string;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;

/**
 * Utility class for string operations
 * @author Java-Jul-2025 Group 
 */
public class StringUtil {
    public static String [] ones = {"", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};
    public static String [] tens = {"", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};

    public static String numToStr3DigitsTR(int val)
    {
        int a = val / 100;
        int b = val / 10 % 10;
        int c = val % 10;

        StringBuilder sb = new StringBuilder();

        if (a != 1)
            sb.append(ones[a]);

        if (a != 0)
            sb.append("yüz");

        sb.append(tens[b]);
        sb.append(ones[c]);

        return sb.toString();
    }

    public static String capitalize(String s)
    {
        return s.isEmpty() ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }

    public static String changeCase(String s) 
    {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); ++i) {
            char c = sb.charAt(i);

            sb.setCharAt(i, Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
        }

        return sb.toString();
    }

    public static int countString(String s1, String s2) 
    {
        int count = 0;

        for (int idx = -1; (idx = s1.indexOf(s2, idx + 1)) != -1; ++count)
            ;

        return count;
    }

    public static String digits(String s) 
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            if (Character.isDigit(c))
                sb.append(c);
        }

        return sb.toString();
    }



    public static boolean isPalindrome(String s) 
    {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char cLeft = s.charAt(left);

            if (!Character.isLetter(cLeft)) {
                ++left;
                continue;
            }
            char cRight = s.charAt(right);

            if (!Character.isLetter(cRight)) {
                --right;
                continue;
            }
            if (Character.toLowerCase(cLeft) != Character.toLowerCase(cRight))
                return false;

            ++left;
            --right;
        }

        return true;
    }

    public static boolean isPangram(String s, String alphabet)
    {
        for (int i = 0; i < alphabet.length(); ++i)
            if (!s.contains(String.valueOf(alphabet.charAt(i))))
                return false;

        return true;
    }

    public static boolean isPangramEN(String s) {
        return isPangram(s.toLowerCase(), "abcdefghijklmnopqrstuwxvyz");
    }

    public static boolean isPangramTR(String s) 
    {
        return isPangram(s.toLowerCase(), "abcçdefgğhıijklmnoöprsştuüvyz");
    }

    public static String join(String [] s)
    {
        return join(s, "");
    }

    public static String join(String [] s, String delimiter)
    {
        return join(s, delimiter, false);
    }

    public static String join(String [] s,  char delimiter)
    {
        return join(s, String.valueOf(delimiter));
    }

    public static String join(String [] s, boolean ignoreBlanks)
    {
        return join(s, "",  ignoreBlanks);
    }

    public static String join(String [] s, String delimiter, boolean ignoreBlanks)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length; ++i) {
            if (ignoreBlanks && s[i].isBlank())
                continue;

            sb.append(s[i]).append(delimiter);
        }

        return sb.substring(0, sb.length() - delimiter.length());
    }

    public static String join(String [] s, char delimiter, boolean ignoreBlanks)
    {
        return join(s, String.valueOf(delimiter), ignoreBlanks);
    }

    public static String letters(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            if (Character.isLetter(c))
                sb.append(c);
        }

        return sb.toString();
    }

    public static String padLeading(String s, int n) 
    {
        return padLeading(s, n, ' ');
    }

    public static String padLeading(String s, int n, char ch) 
    {
        int len = s.length();

        return len < n ? String.valueOf(ch).repeat(n - len) + s : s;
    }

    public static String padTrailing(String s, int n) 
    {
        return padTrailing(s, n, ' ');
    }

    public static String padTrailing(String s, int n, char ch) 
    {
        int len = s.length();

        return len < n ? s + String.valueOf(ch).repeat(n - len) : s;
    }

    public static String randomText(Random random, int count, String source)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; ++i)
            sb.append(source.charAt(random.nextInt(source.length())));

        return sb.toString();
    }

    public static String randomTextTR(Random random, int count)
    {
        return randomText(random, count, "abcçdefgğhıijklmnoöprsştuüvyzABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ");
    }

    public static String randomTextEN(Random random, int count)
    {
        return randomText(random, count, "abcdefghijklmnopqrstuwxvyzABCDEFGHIKLMNOPQRSTUWXYZ");
    }

    public static String [] randomTexts(Random random, int n, int origin, int bound, String source)
    {
        String [] str = new String[n];

        for (int i = 0; i < n; ++i)
            str[i] = randomText(random, random.nextInt(origin, bound), source);

        return str;
    }

    public static String [] randomTextsEN(Random random, int n, int origin, int bound)
    {
        return randomTexts(random, n, origin, bound, "abcdefghijklmnopqrstuwxvyzABCDEFGHIKLMNOPQRSTUWXYZ");
    }

    public static String [] randomTextsTR(Random random, int n, int origin, int bound)
    {
        return randomTexts(random, n, origin, bound, "abcçdefgğhıijklmnoöprsştuüvyzABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ");
    }

    public static String removeWhitespaces(String s)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            if (!Character.isWhitespace(c))
                sb.append(c);
        }
        return sb.toString();
    }

    public static String reverse(String s)
    {
        return new StringBuilder(s).reverse().toString();
    }
}