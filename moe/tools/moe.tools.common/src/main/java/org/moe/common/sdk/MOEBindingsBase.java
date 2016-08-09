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

public class MOEBindingsBase extends MOEComponent {

    public static final String ROOT_DIR = "sdk";

    public static final String CORE_JAR = "moe-core.jar";
    public static final String IOS_JAR = "moe-ios.jar";
    public static final String IOS_JUNIT = "moe-ios-junit.jar";

    MOEBindingsBase(String sdkPath) {
        super(sdkPath);
    }

    @Override
    public String getRootDir() {
        return ROOT_DIR;
    }

    @Override
    public List<String> getListOfEntries() {
        return new ArrayList<String>() {
            {
                add(CORE_JAR);
                add(IOS_JAR);
//                add(IOS_JUNIT);
            }
        };
    }

    File coreJar() {
        return entries().get(CORE_JAR);
    }

    File iosJar() {
        return entries().get(IOS_JAR);
    }

    File iosJunitJar() {
        return entries().get(IOS_JUNIT);
    }

    File coreDex() {
        return null;
    }

    File iosRetroDex() {
        return null;
    }

    public List<File> getMainDexFiles() {
        return new ArrayList<File>();
    }
}
