/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.common.utils;

import java.io.File;

/**
 * Utility class for OS information.
 */
public class OsUtils {

    /**
     * Returns the 'os.name' System property.
     *
     * @return 'os.name' System property
     */
    public static String getOsName() {
        return System.getProperty("os.name");
    }

    /**
     * Tells whether or not the host is Windows or not.
     *
     * @return True iff the host is Windows
     */
    public static boolean isWindows() {
        return getOsName().startsWith("Windows");
    }

    /**
     * Tells whether or not the host is Mac or not.
     *
     * @return True iff the host is Mac
     */
    public static boolean isMac() {
        return getOsName().startsWith("Mac");
    }

    /**
     * Tells whether or not the host is Linux or not.
     *
     * @return True if the host is Linux
     */
    public static boolean isLinux() {
        return getOsName().startsWith("Linux");
    }

    /**
     * Returns the name and version of the host OS.
     *
     * @return name and version of the host OS
     */
    public static String osNameAndVersion() {
        return System.getProperty("os.name") + " " + System.getProperty("os.version");
    }

    public static String concatenateToLocalPath(char[]... args) {
        StringBuffer buff = new StringBuffer(128);

        char[] arg;
        int cmp = args.length - 1;
        for (int i = 0; i < args.length; i++) {
            arg = args[i];
            if (arg == null) {
                continue;
            }

            char lastChar = arg[arg.length - 1];

            if (lastChar == File.separatorChar) {
                buff.append(arg);
            } else if ((lastChar == '/') || (lastChar == '\\')) {
                buff.append(arg, 0, arg.length - 1);
                buff.append(File.separatorChar);
            } else {
                buff.append(arg);
                if (i != cmp) {
                    buff.append(File.separatorChar);
                }
            }
        }

        return buff.toString();
    }

    public static String concatenateToLocalPath(String... args) {
        char[][] chArgs = new char[args.length][];
        int i = 0;
        for (String arg : args) {
            if (arg == null) {
                continue;
            }
            chArgs[i++] = arg.toCharArray();
        }

        return concatenateToLocalPath(chArgs);
    }
}
