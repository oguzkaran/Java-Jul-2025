package org.csystem.app;

import org.csystem.util.string.StringUtil;

import java.util.Random;

import static org.csystem.util.console.commandline.CommandLineArgsUtil.checkLengthEquals;

class App {
    public static void main(String [] args)
    {
        checkLengthEquals(3, args.length, "usage: java org.csystem.app.App <count> <origin> <bound>");
        Random random = new Random();
        long count = Long.parseLong(args[0]);
        int origin = Integer.parseInt(args[1]);
        int bound = Integer.parseInt(args[2]);

        while (count-- > 0)
            System.out.println(StringUtil.randomTextEN(random, random.nextInt(origin, bound)));
    }
}
