package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String [] args)
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);

        System.out.print("Input count:");
        int n = kb.nextInt();
        int [] a = new int[n];

        a[6] = 30;

        for (int i = 0; i < a.length; ++i)
            System.out.printf("%d ", a[i]);
        System.out.println();
    }
}