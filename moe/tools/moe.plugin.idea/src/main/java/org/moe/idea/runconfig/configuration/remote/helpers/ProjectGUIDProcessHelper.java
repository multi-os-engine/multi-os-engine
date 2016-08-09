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

package org.moe.idea.runconfig.configuration.remote.helpers;

import java.util.UUID;
import java.util.zip.CRC32;

public class ProjectGUIDProcessHelper {

    public static String GenerateProjectGUID(String rootProjectName) {
        String currentTime = String.valueOf(System.currentTimeMillis());

        CRC32 localCRC32Generator = new CRC32();

        localCRC32Generator.update(rootProjectName.getBytes());
        Long tempRootProjectChecksum = localCRC32Generator.getValue();

        localCRC32Generator.update(currentTime.getBytes());
        Long tempXCodeProjectChecksum = localCRC32Generator.getValue();
        localCRC32Generator.reset();

        Long tempMSBits = tempRootProjectChecksum * tempXCodeProjectChecksum;
        Long tempLSBits = tempXCodeProjectChecksum * tempXCodeProjectChecksum;

        return new UUID(tempMSBits, tempLSBits).toString();
    }
}
