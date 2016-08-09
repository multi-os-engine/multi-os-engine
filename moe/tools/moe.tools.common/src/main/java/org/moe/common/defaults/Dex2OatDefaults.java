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

package org.moe.common.defaults;

import org.moe.common.constants.ArchFamily;
import org.moe.common.variant.ArchitectureVariant;

public class Dex2OatDefaults {

    public static final long UNDEFINED_BASE_DEFAULT = -1L;

    public static long getDefaultBaseForArchFamily(ArchitectureVariant archVariant) {
        if (archVariant == null) {
            return UNDEFINED_BASE_DEFAULT;
        }

        // Return defaults
        if (archVariant.getFamilyName() == ArchFamily.ARM) {
            return 0x10000000L;
        }
        if (archVariant.getFamilyName() == ArchFamily.ARM64) {
            return 0x10000000L;
        }
        if (archVariant.getFamilyName() == ArchFamily.X86) {
            return 0x40000000L;
        }
        if (archVariant.getFamilyName() == ArchFamily.X86_64) {
            return 0x40000000L;
        }

        // Undefined
        return UNDEFINED_BASE_DEFAULT;
    }

    public static long getDefaultBaseForArchFamily(String archName) {
        // Find architecture
        ArchitectureVariant var = ArchitectureVariant.getByFamilyName(archName);
        if (var == null) {
            return UNDEFINED_BASE_DEFAULT;
        }

        return getDefaultBaseForArchFamily(var);
    }

    public static String getArchitectureFamilyByName(String name) throws Exception {
        if (getDefaultBaseForArchFamily(name) == UNDEFINED_BASE_DEFAULT) {
            // Fail on unsupported element
            throw new Exception("Unsupported architecture family '" + name + "'");
        }
        return name;
    }
}
