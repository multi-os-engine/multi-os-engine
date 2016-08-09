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

package org.moe.common.sdk;

import java.io.File;
import java.util.List;

public class MOEToolsMacOs extends MOEToolsBase {

    private static final String DEX2OAT = "dex2oat";
    private static final String PRELOADED_CLASSES = "preloaded-classes";
    private static final String LIBCLANG_DYLIB = "macosx/x86_64/libclang.dylib";
    private static final String LIBMOBILEDEVICE_DYLIB = "macosx/x86_64/libimobiledevice.dylib";
    private static final String LIBNATJ_DYLIB = "macosx/x86_64/libnatj.dylib";

    MOEToolsMacOs(String sdkPath) {
        super(sdkPath);

        dxExec = DX;
    }

    @Override
    public List<String> getListOfEntries() {
        List<String> baseList = super.getListOfEntries();
        baseList.add(DX);
        baseList.add(DEX2OAT);
        baseList.add(PRELOADED_CLASSES);
        baseList.add(LIBCLANG_DYLIB);
        baseList.add(LIBMOBILEDEVICE_DYLIB);
        baseList.add(LIBNATJ_DYLIB);

        return baseList;
    }

    @Override
    public File dex2OatExec() {
        return entries().get(DEX2OAT);
    }

    @Override
    public File preloadedClasses() {
        return entries().get(PRELOADED_CLASSES);
    }
}
