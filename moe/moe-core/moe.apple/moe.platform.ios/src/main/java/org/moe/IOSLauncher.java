package org.moe;

import org.moe.natj.objc.ObjCRuntime;

/**
 * A launcher class that allows us run extra code before running the actual application.
 *
 * This is mainly used for registering the crash hook on main thread.
 */
public class IOSLauncher {
    public static void main(String[] args) throws Throwable {
        // Register the crash hook for main thread
        ObjCRuntime.crashAppWhenExceptionUncaught();

        // Invoke main method
        MOE.launchMain(args);
    }
}
