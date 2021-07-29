package org.moe;

import org.moe.natj.objc.ObjCRuntime;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * A launcher class that allows us run extra code before running the actual application.
 *
 * This is mainly used for registering the crash hook on main thread.
 */
public class IOSLauncher {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        // Register the crash hook for main thread
        ObjCRuntime.crashAppWhenExceptionUncaught();

        // Get the user main class
        String mainClassName = args[0];

        // Args that need to be passed to user main
        String[] realArgs = Arrays.copyOfRange(args, 1, args.length);

        // Invoke main method
        Method mainMethod;
        try {
            Class<?> c = Class.forName(mainClassName);
            mainMethod = c.getDeclaredMethod("main", String[].class);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            throw new RuntimeException("Cannot execute main method from class " + mainClassName, e);
        }
        mainMethod.invoke(null, (Object) realArgs);
    }
}
