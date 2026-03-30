package org.csystem.app;

import java.util.Random;

import static org.csystem.util.array.ArrayUtil.print;
import static org.csystem.util.array.ArrayUtil.randomArray;

class App {
    public static void main(String [] args)
    {
        Random random = new Random();
        int [] a = randomArray(random, 10, 0, 100);

        print(a);
    }
}