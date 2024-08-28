package org.moe;

import apple.foundation.NSLocale;
import org.moe.natj.objc.ObjCRuntime;

import java.util.Locale;

/**
 * A launcher class that allows us run extra code before running the actual application.
 *
 * This is mainly used for registering the crash hook on main thread.
 */
public class IOSLauncher {
    public static void main(String[] args) throws Throwable {
        // Register the crash hook for main thread
        ObjCRuntime.crashAppWhenExceptionUncaught();

        MOE.init();

        // Update default locale
        String localeTag = NSLocale.currentLocale().localeIdentifier().replace('_', '-');
        Locale.setDefault(Locale.forLanguageTag(localeTag));

        // Invoke main method
        MOE.launchMain(args);
    }
}
