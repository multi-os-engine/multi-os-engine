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

package org.moe.gradle;

import org.gradle.api.GradleException;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.utils.Arch;
import org.moe.gradle.utils.Require;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MoePlatform {
    @NotNull
    public final String displayName;

    @NotNull
    public final String platformName;

    @NotNull
    public final List<Arch> archs;

    @Nullable
    public final MoePlatform simulatorPlatform;

    private MoePlatform(@NotNull String displayName, @NotNull String platformName, @NotNull Arch[] archs,
                        @Nullable MoePlatform simulatorPlatform) {
        this.displayName = Require.nonNull(displayName);
        this.platformName = Require.nonNull(platformName);
        this.archs = Collections.unmodifiableList(Arrays.asList(Require.sizeGT(archs, 0)));
        this.simulatorPlatform = simulatorPlatform;
    }

    /* NOTE: Unsupported but may be in the future
    public static final MoePlatform MACOS =
            new MoePlatform("macOS", "macosx", new Arch[]{Arch.X86_64}, null);
            */

    private static final MoePlatform IOS_SIMULATOR =
            new MoePlatform("iOS Simulator", "iphonesimulator", new Arch[]{Arch.X86_64}, null);
    public static final MoePlatform IOS =
            new MoePlatform("iOS", "iphoneos", new Arch[]{Arch.ARMV7, Arch.ARMV7S, Arch.ARM64}, IOS_SIMULATOR);

    /* NOTE: Unsupported but may be in the future
    private static final MoePlatform TVOS_SIMULATOR =
            new MoePlatform("tvOS Simulator", "appletvsimulator", new Arch[]{Arch.X86_64}, null);
    public static final MoePlatform TVOS =
            new MoePlatform("tvOS", "appletvos", new Arch[]{Arch.ARM64}, TVOS_SIMULATOR);

    private static final MoePlatform WATCHOS_SIMULATOR =
            new MoePlatform("watchOS Simulator", "watchsimulator", new Arch[]{Arch.I386}, null);
    public static final MoePlatform WATCHOS =
            new MoePlatform("watchOS", "watchos", new Arch[]{Arch.ARMV7K}, WATCHOS_SIMULATOR);
            */

    private static final MoePlatform[] ROOT_PLATFORMS = new MoePlatform[]{
            /* NOTE: Unsupported but may be in the future
            MACOS,
            */
            IOS,
            /* NOTE: Unsupported but may be in the future
            TVOS,
            WATCHOS,
            */
    };

    public static final MoePlatform[] ALL_PLATFORMS = new MoePlatform[]{
            /* NOTE: Unsupported but may be in the future
            MACOS,
            */
            IOS,
            IOS_SIMULATOR,
            /* NOTE: Unsupported but may be in the future
            TVOS,
            TVOS_SIMULATOR,
            WATCHOS,
            WATCHOS_SIMULATOR,
            */
    };

    @NotNull
    public static MoePlatform getForDisplayName(@NotNull final String name) {
        Require.nonNull(name);

        for (MoePlatform platform : ROOT_PLATFORMS) {
            if (platform.displayName.equalsIgnoreCase(name)) {
                return platform;
            }
            if (platform.simulatorPlatform != null && platform.simulatorPlatform.displayName.equalsIgnoreCase(name)) {
                return platform.simulatorPlatform;
            }
        }
        throw new GradleException("Unknown platform '" + name + "', supported platforms are: " +
                Arrays.stream(ROOT_PLATFORMS).map(x -> x.displayName).collect(Collectors.toList()));
    }

    @NotNull
    public static MoePlatform getForPlatformName(@NotNull final String name) {
        Require.nonNull(name);

        for (MoePlatform platform : ROOT_PLATFORMS) {
            if (platform.platformName.equalsIgnoreCase(name)) {
                return platform;
            }
            if (platform.simulatorPlatform != null && platform.simulatorPlatform.platformName.equalsIgnoreCase(name)) {
                return platform.simulatorPlatform;
            }
        }
        throw new GradleException("Unknown SDK name '" + name + "', supported platforms are: " +
                Arrays.stream(ROOT_PLATFORMS).map(x -> x.platformName).collect(Collectors.toList()));
    }

    public boolean mainPlatformsHasSimulatorPair() {
        return /* this == MACOS ? false : */ true;
    }

    @Override
    public String toString() {
        return platformName;
    }

    public static List<MoePlatform> getSupportedTargetVariants(Arch archVariant) {
        List<MoePlatform> supported = new ArrayList<MoePlatform>();
        for (MoePlatform currentTarget : ALL_PLATFORMS) {
            for (Arch currentArch : currentTarget.archs) {
                if (archVariant == currentArch) {
                    supported.add(currentTarget);
                }
            }
        }
        return supported;
    }
}
