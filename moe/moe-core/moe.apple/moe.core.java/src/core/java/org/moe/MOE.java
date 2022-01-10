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

import dalvik.system.VMStack;

import java.util.Objects;

public class MOE {
    private MOE() {}

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

    /**
     * Loads staticly linked code.
     *
     * @param      filename   the file to load.
     * @exception  SecurityException  if a security manager exists and its
     *             <code>checkLink</code> method doesn't allow
     *             loading of the specified dynamic library
     * @exception  NullPointerException if <code>filename</code> is
     *             <code>null</code>
     * @see        java.lang.Runtime#load(java.lang.String)
     * @see        java.lang.SecurityManager#checkLink(java.lang.String)
     */
    public static void loadStatic(String filename) {
        Runtime.getRuntime().load(filename, VMStack.getCallingClassLoader());
    }
}
