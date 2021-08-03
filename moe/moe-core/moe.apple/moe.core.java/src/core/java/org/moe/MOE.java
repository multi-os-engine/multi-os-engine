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

public class MOE {
    static {
        System.loadLibrary("moe");

        // Register classes
        for (String c : getPreregisterClasses()) {
            System.out.println("Load preregistered class " + c);
            try {
                Class.forName(c, true, MOE.class.getClassLoader());
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Unable to load preregistered class " + c, e);
            }
        }
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

    private native static String[] getPreregisterClasses();

    private native static String getUserMainClassName();
}
