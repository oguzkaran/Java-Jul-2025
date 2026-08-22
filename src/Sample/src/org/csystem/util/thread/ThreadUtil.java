package org.csystem.util.thread;


/**
 * Utility class for thread operations
 * Last Update: 7th September 2025
 * @author Java-Jul-2025 Group
 */
public final class ThreadUtil {
    private ThreadUtil()
    {
    }

    public static void sleep(long ms)
    {
        try {
            Thread.sleep(ms);
        }
        catch (InterruptedException ignore) {

        }
    }
}
