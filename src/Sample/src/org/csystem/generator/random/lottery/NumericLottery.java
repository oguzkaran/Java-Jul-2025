package org.csystem.generator.random.lottery;

import java.util.Random;

public class NumericLottery {
    public Random random;

    public static int [] numbers(boolean [] flags)
    {
        int [] a = new int[6];
        int idx = 0;

        for (int i = 1; i < flags.length; ++i)
            if (flags[i])
                a[idx++] = i;

        return a;
    }

    public boolean[] getFlags()
    {
        boolean[] flags = new boolean[50];

        for(int i = 0; i < 6; ++i) {
            int val;

            while (true) {
                val = random.nextInt(1, 50);
                if (!flags[val])
                    break;
            }

            flags[val] = true;
        }

        return flags;
    }

    public NumericLottery()
    {
        random = new Random();
    }

    public int [] numbers()
    {
        return numbers(getFlags());
    }
}
