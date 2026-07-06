package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

import java.util.Scanner;

class App {
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Input a number:");
        int a =  kb.nextInt();

        int n = a != 0 ? (int)(Math.log10(Math.abs(a)) / 3) + 1 : 1;

        System.out.printf("n = %d", n);
    }
}
