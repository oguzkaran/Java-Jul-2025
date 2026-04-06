package org.csystem.app.lottery;

import org.csystem.generator.random.lottery.NumericLottery;
import org.csystem.util.array.ArrayUtil;

import java.util.Scanner;

public class NumericLotteryApp {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Input count:");
        int count = kb.nextInt();
        NumericLottery lottery = new NumericLottery();

        for (int i = 0; i <= count; ++i)
            ArrayUtil.print(lottery.numbers(), 2);
    }
}
