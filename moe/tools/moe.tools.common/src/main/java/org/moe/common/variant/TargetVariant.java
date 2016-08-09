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

package org.moe.common.variant;

import org.moe.common.constants.MOEManifestConstants;
import org.moe.common.constants.PLATFORM;
import org.moe.common.defaults.Dex2OatDefaults;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TargetVariant {

    /*
    Predefined target names.
     */
    public static final String IOS_DEVICE_NAME = "ios-device";
    public static final String IOS_SIMULATOR_NAME = "ios-simulator";
    public static final String TVOS_DEVICE_NAME = "tvos-device";
    public static final String TVOS_SIMULATOR_NAME = "tvos-simulator";
    public static final String OSX_NAME = "osx";

    /*
    Predefined platform names.
     */
    public static final String IOS_DEVICE_PLATFORM_NAME = "iphoneos";
    public static final String IOS_SIMULATOR_PLATFORM_NAME = "iphonesimulator";
    public static final String TVOS_DEVICE_PLATFORM_NAME = "appletvos";
    public static final String TVOS_SIMULATOR_PLATFORM_NAME = "appletvsimulator";

    /*
    Predefined variants.
     */

    private static final TargetVariant IOS_DEVICE;
    private static final TargetVariant IOS_SIMULATOR;
    private static final TargetVariant TVOS_DEVICE;
    private static final TargetVariant TVOS_SIMULATOR;
    private static final TargetVariant OSX;
    private static final List<TargetVariant> VARIANTS;

    static {
        // iOS device support
        IOS_DEVICE = new TargetVariant(IOS_DEVICE_NAME, PLATFORM.iphoneos, MOEManifestConstants.LIBRARIES_PATHS.MOE_ThirdpartyFramework_ios_device);
        IOS_DEVICE.getArchitectureVariants().add(ArchitectureVariant.getByArchName(ArchitectureVariant.ARMV7_NAME));
        IOS_DEVICE.getArchitectureVariants().add(ArchitectureVariant.getByArchName(ArchitectureVariant.ARM64_NAME));

        // iOS Simulator support
        IOS_SIMULATOR = new TargetVariant(IOS_SIMULATOR_NAME, PLATFORM.iphonesimulator, MOEManifestConstants.LIBRARIES_PATHS.MOE_ThirdpartyFramework_ios_simulator);
        IOS_SIMULATOR.getArchitectureVariants().add(ArchitectureVariant.getByArchName(ArchitectureVariant.I386_NAME));
        IOS_SIMULATOR.getArchitectureVariants().add(ArchitectureVariant.getByArchName(ArchitectureVariant.X86_64_NAME));

        // tvOS device support
        TVOS_DEVICE = new TargetVariant(TVOS_DEVICE_NAME, PLATFORM.appletvos, MOEManifestConstants.LIBRARIES_PATHS.MOE_ThirdpartyFramework_tvos_device);
        TVOS_DEVICE.getArchitectureVariants().add(ArchitectureVariant.getByArchName(ArchitectureVariant.ARM64_NAME));

        // tvOS Simulator support
        TVOS_SIMULATOR = new TargetVariant(TVOS_SIMULATOR_NAME, PLATFORM.appletvsimulator, MOEManifestConstants.LIBRARIES_PATHS.MOE_ThirdpartyFramework_tvos_simulator);
        TVOS_SIMULATOR.getArchitectureVariants().add(ArchitectureVariant.getByArchName(ArchitectureVariant.X86_64_NAME));

        // OS X support
        OSX = new TargetVariant(OSX_NAME, PLATFORM.macosx, MOEManifestConstants.LIBRARIES_PATHS.MOE_ThirdpartyFramework_osx);
        OSX.getArchitectureVariants().add(ArchitectureVariant.getByArchName(ArchitectureVariant.I386_NAME));
        OSX.getArchitectureVariants().add(ArchitectureVariant.getByArchName(ArchitectureVariant.X86_64_NAME));

        // Collected container
        VARIANTS = new ArrayList<TargetVariant>() {{
            add(IOS_DEVICE);
            add(IOS_SIMULATOR);
//            not supported yet
//            add(TVOS_DEVICE);
//            add(TVOS_SIMULATOR);
//            add(OSX);
        }};
    }

    /**
     * Returns a list of all available TargetVariant.
     *
     * @return list of all available TargetVariant
     */
    public static List<TargetVariant> getAll() {
        return new ArrayList<TargetVariant>(VARIANTS);
    }

    public String getName() {
        return name;
    }

    public String getPlatformName() {
        return platform.name();
    }

    public MOEManifestConstants.LIBRARIES_PATHS getManifestProperty() {
        return manifestProperty;
    }

    public List<ArchitectureVariant> getArchitectureVariants() {
        return architectureVariants;
    }

    /**
     * Get variant by name.
     *
     * @param name target name
     * @return variant or null
     */
    public static TargetVariant getByName(String name) {
        for (TargetVariant variant : VARIANTS) {
            if (variant.getName().equalsIgnoreCase(name)) {
                return variant;
            }
        }
        return null;
    }

    /**
     * Get variant by platform name.
     *
     * @param name platform name
     * @return variant or null
     */
    public static TargetVariant getByPlatformName(String name) {
        for (TargetVariant variant : VARIANTS) {
            if (variant.getPlatformName().equalsIgnoreCase(name)) {
                return variant;
            }
        }
        return null;
    }

    /**
     * Get variant by platform.
     *
     * @param paltform platform name
     * @return variant or null
     */
    public static TargetVariant getByPlatform(PLATFORM paltform) {
        for (TargetVariant variant : VARIANTS) {
            if (variant.platform == paltform) {
                return variant;
            }
        }
        return null;
    }

    /**
     * Get variant by manifest property.
     *
     * @param property manifest property
     * @return property or null
     */
    public static TargetVariant getByManifestProperty(MOEManifestConstants.LIBRARIES_PATHS property) {
        for (TargetVariant variant : VARIANTS) {
            if (variant.manifestProperty == property) {
                return variant;
            }
        }
        return null;
    }

    /**
     * Target name.
     */
    final String name;

    /**
     * Platform type.
     */
    final PLATFORM platform;

    /**
     * Platform name.
     */
    final MOEManifestConstants.LIBRARIES_PATHS manifestProperty;

    /**
     * List of supported architectures.
     */
    final List<ArchitectureVariant> architectureVariants = new ArrayList<ArchitectureVariant>();

    /**
     * Creates a new ${TargetVariant} instance.
     *
     * @param name         target name
     * @param platform platform name
     */
    private TargetVariant(String name, PLATFORM platform, MOEManifestConstants.LIBRARIES_PATHS manifestProperty) {
        this.name = name;
        this.platform = platform;
        this.manifestProperty = manifestProperty;
    }

    public static TargetVariant getTargetVariantByPlatformName(String name) throws Exception {
        TargetVariant targetVariant = getByPlatformName(name);
        if (targetVariant == null) {
            // Fail on unsupported element
            throw new Exception("Invalid TargetVariant '" + name + "'");
        }
        return targetVariant;
    }

    public static List<TargetVariant> getSupportedTargetVariants(ArchitectureVariant archVariant) {

        List<TargetVariant> supported = new ArrayList<TargetVariant>();

        for (TargetVariant currentTarget : VARIANTS) {
            for (ArchitectureVariant currentArch : currentTarget.architectureVariants) {
                if (archVariant == currentArch) {
                    supported.add(currentTarget);
                }
            }
        }
        return supported;
    }

}
