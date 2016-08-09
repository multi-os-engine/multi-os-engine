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

package org.moe.common.constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MOEManifestConstants {

    public static final String MOE_TYPE = "MOE_TYPE";

    public enum LIBRARIES_PATHS {
        MOE_ThirdpartyFramework_universal,
        MOE_ThirdpartyFramework_ios_simulator,
        MOE_ThirdpartyFramework_ios_device,
        MOE_ThirdpartyFramework_tvos_simulator,
        MOE_ThirdpartyFramework_tvos_device,
        MOE_ThirdpartyFramework_osx,
        MOE_ThirdpartyFramework_armv7,
        MOE_ThirdpartyFramework_armv7s,
        MOE_ThirdpartyFramework_arm64,
        MOE_ThirdpartyFramework_i386,
        MOE_ThirdpartyFramework_x86_64;

        private static final HashMap<String, LIBRARIES_PATHS> nameMap = new HashMap<String, LIBRARIES_PATHS>();

        static {
            for (LIBRARIES_PATHS val : LIBRARIES_PATHS.values()) {
                nameMap.put(val.name(), val);
            }
        }

        public static boolean contains(String name) {
            return nameMap.containsKey(name);
        }

        public static LIBRARIES_PATHS getByName(String name) {
            return nameMap.get(name);
        }
    }

    public enum BUNDLE_RESOURCES {
        MOE_BUNDLE_FOLDER_RESOURCES,
        MOE_BUNDLE_FILE_RESOURCES
    }

    public enum LINKER_FLAGS {
        MOE_CUSTOM_LINKER_FLAGS,
        MOE_FRAMEWORKS
    }

    public static final List<Enum> allProperties;
    static {
        allProperties = new ArrayList<Enum>();
        allProperties.addAll(Arrays.asList(LIBRARIES_PATHS.values()));
        allProperties.addAll(Arrays.asList(BUNDLE_RESOURCES.values()));
        allProperties.addAll(Arrays.asList(LINKER_FLAGS.values()));
    }
}
