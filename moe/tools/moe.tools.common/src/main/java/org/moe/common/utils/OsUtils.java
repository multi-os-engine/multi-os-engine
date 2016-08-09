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

public class OsUtils {

    public static String getOsName() {
        return System.getProperty("os.name");
    }

    public static boolean isWindows() {
        return getOsName().startsWith("Windows");
    }

    public static boolean isMac() {
        return getOsName().startsWith("Mac");
    }

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
