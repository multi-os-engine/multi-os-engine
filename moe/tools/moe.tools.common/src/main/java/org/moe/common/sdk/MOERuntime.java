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

class MOERuntime extends MOEComponent {

    public static final String ROOT_DIR = "sdk";

    public static final String FRAMEWORK = "MOE.framework";
    public static final String IPHONEOS = "iphoneos" + File.separator + FRAMEWORK;
    public static final String IPHONESIMULATOR = "iphonesimulator" + File.separator + FRAMEWORK;


    MOERuntime(String sdkPath) {
        super(sdkPath);
    }

    File iphoneos() {
        return entries().get(IPHONEOS);
    }

    File iphonesimulator() {
        return entries().get(IPHONESIMULATOR);
    }

    @Override
    public String getRootDir() {
        return ROOT_DIR;
    }

    @Override
    public List<String> getListOfEntries() {
        return new ArrayList<String>() {
            {
                add(IPHONEOS);
                add(IPHONESIMULATOR);
            }
        };
    }
}
