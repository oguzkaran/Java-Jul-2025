package org.csystem.util.console.commandline;

/**
 * Utility class for command line operations
 * @author Java-Jul-2025 Group
 */
public class CommandLineArgsUtil {
    public static void checkLengthEquals(int length, int argsLength, String errMessage)
    {
        checkLengthEquals(length, argsLength, errMessage, 1);
    }

    public static void checkLengthEquals(int length, int argsLength, String errMessage, int exitCode)
    {
        if (length != argsLength) {
            System.err.println(errMessage);
            System.exit(exitCode);
        }
    }

    public static void checkLengthGreater(int length, int argsLength, String errMessage)
    {
        checkLengthGreater(length, argsLength, errMessage, 1);
    }

    public static void checkLengthGreater(int length, int argsLength, String errMessage, int exitCode)
    {
        if (argsLength <= length) {
            System.err.println(errMessage);
            System.exit(exitCode);
        }
    }

    //...
}
