package org.moe.ios;

import apple.foundation.NSLocale;
import apple.foundation.NSTimeZone;
import org.moe.core.MOE;
import org.moe.natj.objc.ObjCRuntime;

import java.util.Locale;
import java.util.TimeZone;

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

        TimeZone.setDefault(TimeZone.getTimeZone(NSTimeZone.localTimeZone().name()));

        // Invoke main method
        MOE.launchMain(args);
    }
}
