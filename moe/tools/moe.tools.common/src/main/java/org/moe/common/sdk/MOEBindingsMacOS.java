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
import java.util.ArrayList;
import java.util.List;

class MOEBindingsMacOS extends MOEBindingsBase {

    public static final String CORE_DEX = "moe-core.dex";
    public static final String IOS_RETRO_DEX = "moe-ios-retro.jar";

    MOEBindingsMacOS(String sdkPath) {
        super(sdkPath);
    }

    @Override
    public List<String> getListOfEntries() {
        List<String> baseList = super.getListOfEntries();
        baseList.add(CORE_DEX);
        baseList.add(IOS_RETRO_DEX);

        return baseList;
    }

    @Override
    File coreDex() {
        return entries().get(CORE_DEX);
    }

    @Override
    File iosRetroDex() {
        return entries().get(IOS_RETRO_DEX);
    }

    @Override
    public List<File> getMainDexFiles() {
        List<File> fileList = new ArrayList<File>();
        fileList.add(coreDex());
        fileList.add(iosRetroDex());
        return fileList;
    }
}
