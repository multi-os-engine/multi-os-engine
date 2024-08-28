/*
 * Copyright 2016 Migeran
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.moe;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class MOE {
    private MOE() {}

    static {
        System.loadLibrary("moe");
    }

    /**
     * App build info.
     * This provides build information about not only the MOE framework, but also about
     * the application.
     *
     * The values in this class are initialized during the GraalVM Native Image build time, by using the option
     * `--initialize-at-build-time=org.moe.MOE$Build`.
     *
     * So these values will effectively be const values, thus allow the Native Image compiler to optimise the code
     * that uses these values and remove unnecessary runtime checks. For example, for code like:
     ** <pre>{@code
     *     if (MOE.Build.DEBUG) {
     *         // do some extra stuff
     *     }
     * }</pre>
     * this condition check could be removed by Native Image compiler, thus no runtime overhead.
     */
    public static class Build {
        private Build() {
        }

        /**
         * Whether the app is built with DEBUG macro set
         */
        public static final boolean DEBUG;

        /**
         * The platform name.
         * Possible values are:
         * - iphoneos
         * - iphonesimulator
         */
        public static final String PLATFORM_NAME;

        /**
         * Whether it's running inside a simulator
         */
        public static final boolean IS_SIMULATOR;

        static {
            DEBUG = "true".equals(System.getProperty("moe.debug", "false"));
            PLATFORM_NAME = Objects.requireNonNull(System.getProperty("moe.platform.name"), "moe.platform.name not defined!");

            switch (PLATFORM_NAME) {
                case "iphoneos":
                    IS_SIMULATOR = false;
                    break;
                case "iphonesimulator":
                    IS_SIMULATOR = true;
                    break;
                default:
                    throw new IllegalStateException("Unknown platform " + PLATFORM_NAME);
            }
        }
    }

    public static void init() {
        // Run some native startup code, including class preregister
        handleStartup();
    }

    /**
     * The MOE main entrance
     */
    public static void launchMain(String[] args) throws Throwable {
        // Get main class
        String mainClass = getUserMainClassName();
        if (mainClass == null) {
            throw new RuntimeException("mainClass is missing!");
        }

        // Invoke main method
        Method mainMethod;
        try {
            Class<?> c = Class.forName(mainClass);
            mainMethod = c.getDeclaredMethod("main", String[].class);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            throw new RuntimeException("Cannot execute main method from class " + mainClass, e);
        }
        try {
            mainMethod.invoke(null, (Object) args);
        } catch (InvocationTargetException e) {
            // Thrown out the wrapped exception instead
            throw e.getCause();
        }
    }

    private native static void handleStartup();

    private native static String getUserMainClassName();
}
