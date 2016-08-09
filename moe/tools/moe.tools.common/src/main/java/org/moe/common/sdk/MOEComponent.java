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
import java.nio.file.InvalidPathException;
import java.util.HashMap;
import java.util.Map;

public abstract class MOEComponent implements IMOEComponent {

    HashMap<String, File> mapEntries;

    public MOEComponent(String sdkPath) {

        mapEntries = new HashMap<String, File>();
        String entryDir = sdkPath + File.separator + getRootDir();

        for (String entryName : getListOfEntries()) {
            File entryFile = new File(entryDir, entryName);
            mapEntries.put(entryName, entryFile);
        }

        validate(sdkPath);
    }

    void validate(String sdkPath) {
        for (Map.Entry<String, File> entry : mapEntries.entrySet()) {
            File entryFile = entry.getValue();
            if (!entryFile.exists()) {
                String errorMessage = sdkPath + " is not a valid MOE install directory. \nMissing or is not valid file/directory";
                System.err.println("\nError: " + errorMessage + ": " + entryFile.getAbsolutePath());
                throw new InvalidPathException(entryFile.getAbsolutePath(), errorMessage);
            }
        }
    }

    HashMap<String, File> entries() {
        return mapEntries;
    }
}
