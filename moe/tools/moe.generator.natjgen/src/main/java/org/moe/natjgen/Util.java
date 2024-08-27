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

package org.moe.natjgen;

import java.util.ArrayList;

public class Util {

    private Util() {

    }

    public static void addProblem(String msg, ArrayList<String> dst) {
        if (dst == null) {
            return;
        }

        dst.add(msg);
    }

    public static void transferProblems(String msg, ArrayList<String> src, ArrayList<String> dst) {
        if (dst == null) {
            return;
        }

        for (String smsg : src) {
            dst.add(msg + " [" + smsg + "]");
        }
    }

    public static String nameOfVariadic(IParameterizedCallable callable) {
        String name = "varargs";
        boolean success = false;
        while (!success) {
            success = true;
            for (CalleeArgument arg : callable.getArguments()) {
                if (name.equals(arg.getName())) {
                    name = "_" + name;
                    success = false;
                    break;
                }
            }
        }
        return name;
    }
}
