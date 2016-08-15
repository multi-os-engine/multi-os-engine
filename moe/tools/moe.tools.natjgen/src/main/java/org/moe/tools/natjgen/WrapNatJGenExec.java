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

package org.moe.tools.natjgen;

import org.moe.common.exec.AbstractExec;

import java.io.File;

public class WrapNatJGenExec extends AbstractExec {

    private static File sdkToolsPath;

    public WrapNatJGenExec(File sdkToolsPath) {
        super("java", sdkToolsPath);

        WrapNatJGenExec.sdkToolsPath = sdkToolsPath;

        getArguments().add("-jar");
        getArguments().add(getWrapNatJGenPath());
    }

    @Override
    protected String lookupExec() {
        return null;
    }

    private static String getWrapNatJGenPath() {
        return sdkToolsPath + File.separator + "wrapnatjgen.jar";
    }

    public static boolean isNatJGenExist() {
        File file = new File(getWrapNatJGenPath());
        return file.exists();
    }
}
