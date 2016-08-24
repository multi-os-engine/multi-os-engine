/*
Copyright (C) 2016 Migeran

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

package org.moe.gradle.utils;

import org.gradle.api.GradleException;
import org.moe.common.constants.MOEManifestConstants;
import org.moe.gradle.anns.NotNull;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Arch {
    @NotNull
    public final String name;

    @NotNull
    public final String family;

    private Arch(@NotNull String name, @NotNull String family) {
        this.name = Require.nonNull(name);
        this.family = Require.nonNull(family);
    }

    public static final String ARCH_ARMV7 = "armv7";
    public static final String ARCH_ARMV7S = "armv7s";
    public static final String ARCH_ARMV7K = "armv7k";
    public static final String ARCH_ARM64 = "arm64";
    public static final String ARCH_I386 = "i386";
    public static final String ARCH_X86_64 = "x86_64";

    public static final String FAMILY_ARM = "arm";
    public static final String FAMILY_ARM64 = "arm64";
    public static final String FAMILY_X86 = "x86";
    public static final String FAMILY_X86_64 = "x86_64";
    public static final String[] ALL_FAMILIES = new String[]{FAMILY_ARM, FAMILY_ARM64, FAMILY_X86, FAMILY_X86_64};

    public static final Arch ARMV7 = new Arch(ARCH_ARMV7, FAMILY_ARM);
    public static final Arch ARMV7S = new Arch(ARCH_ARMV7S, FAMILY_ARM);
    public static final Arch ARMV7K = new Arch(ARCH_ARMV7K, FAMILY_ARM);
    public static final Arch ARM64 = new Arch(ARCH_ARM64, FAMILY_ARM64);
    public static final Arch I386 = new Arch(ARCH_I386, FAMILY_X86);
    public static final Arch X86_64 = new Arch(ARCH_X86_64, FAMILY_X86_64);
    public static final Arch[] ALL_ARCHS = new Arch[]{ARMV7, ARMV7S, ARMV7K, ARM64, I386, X86_64};

    @NotNull
    public static Arch getForName(@NotNull String name) {
        Require.nonNull(name);

        for (Arch arch : ALL_ARCHS) {
            if (arch.name.equalsIgnoreCase(name)) {
                return arch;
            }
        }
        throw new GradleException("Unknown architecture '" + name + "', supported: " +
                Arrays.stream(ALL_ARCHS).map(x -> x.name).collect(Collectors.toList()));
    }

    @NotNull
    public static String validateArchFamily(@NotNull String name) {
        Require.nonNull(name);

        for (String family : ALL_FAMILIES) {
            if (family.equalsIgnoreCase(name)) {
                return family;
            }
        }
        throw new GradleException("Unknown architecture family '" + name + "', supported: " +
                Arrays.stream(ALL_ARCHS).map(x -> x.name).collect(Collectors.toList()));
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     * Get variant by manifest property.
     *
     * @param property manifest property
     * @return variant or null
     */
    public static Arch getByManifestProperty(MOEManifestConstants.LIBRARIES_PATHS property) {
        if (property == MOEManifestConstants.LIBRARIES_PATHS.MOE_ThirdpartyFramework_armv7) {
            return ARMV7;
        }
        if (property == MOEManifestConstants.LIBRARIES_PATHS.MOE_ThirdpartyFramework_armv7s) {
            return ARMV7S;
        }
        if (property == MOEManifestConstants.LIBRARIES_PATHS.MOE_ThirdpartyFramework_arm64) {
            return ARM64;
        }
        if (property == MOEManifestConstants.LIBRARIES_PATHS.MOE_ThirdpartyFramework_i386) {
            return I386;
        }
        if (property == MOEManifestConstants.LIBRARIES_PATHS.MOE_ThirdpartyFramework_x86_64) {
            return X86_64;
        }
        return null;
    }

}
