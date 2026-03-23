package org.csystem.util.string;

import java.util.Random;

/**
 * Utility class for string operations
 * @author Java-Jul-2025 Group 
 */
public class StringUtil {
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
}