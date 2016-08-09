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

import org.moe.common.constants.ArchFamily;
import org.moe.common.constants.MOEManifestConstants;
import org.moe.common.defaults.Dex2OatDefaults;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// TODO: @EqualsAndHashCode and @Input annotations are not supported after migration from Groovy to Java
//import groovy.transform.EqualsAndHashCode
//import org.gradle.api.tasks.Input
//@EqualsAndHashCode

public class ArchitectureVariant implements java.io.Serializable {

    /*
    Predefined architecture names.
     */
    public static final String ARMV7_NAME = "armv7";
    public static final String ARM64_NAME = "arm64";
    public static final String I386_NAME = "i386";
    public static final String X86_64_NAME = "x86_64";

    /*
    Predefined variants.
     */
    private static final ArchitectureVariant ARMV7 = new ArchitectureVariant(ArchFamily.ARM, ARMV7_NAME, MOEManifestConstants.LIBRARIES_PATHS.MOE_ThirdpartyFramework_armv7);
    private static final ArchitectureVariant ARM64 = new ArchitectureVariant(ArchFamily.ARM64, ARM64_NAME, MOEManifestConstants.LIBRARIES_PATHS.MOE_ThirdpartyFramework_arm64);
    private static final ArchitectureVariant I386 = new ArchitectureVariant(ArchFamily.X86, I386_NAME, MOEManifestConstants.LIBRARIES_PATHS.MOE_ThirdpartyFramework_i386);
    private static final ArchitectureVariant X86_64 = new ArchitectureVariant(ArchFamily.X86_64, X86_64_NAME, MOEManifestConstants.LIBRARIES_PATHS.MOE_ThirdpartyFramework_x86_64);

    /**
     * Collection of predefined architectures.
     */
    private static final List<ArchitectureVariant> VARIANTS = new ArrayList<ArchitectureVariant>() {{
        add(ARMV7);
        add(ARM64);
        add(I386);
        add(X86_64);
    }};


    /**
     * Returns a list of all available ArchitectureVariant.
     *
     * @return list of all available ArchitectureVariant
     */
    public static List<ArchitectureVariant> getAll() {
        return new ArrayList<ArchitectureVariant>(VARIANTS);
    }

    /**
     * Get variant by family name.
     *
     * @param name family name
     * @return variant or null
     */
    public static ArchitectureVariant getByFamilyName(String name) {
        for (ArchitectureVariant variant : VARIANTS) {
            if (variant.familyName.equalsIgnoreCase(name)) {
                return variant;
            }
        }
        return null;
    }

    /**
     * Get variant by architecture name.
     *
     * @param name architecture name
     * @return variant or null
     */
    public static ArchitectureVariant getByArchName(String name) {
        for (ArchitectureVariant variant : VARIANTS) {
            if (variant.archName.equalsIgnoreCase(name)) {
                return variant;
            }
        }
        return null;
    }

    /**
     * Get variant by manifest property.
     *
     * @param property manifest property
     * @return variant or null
     */
    public static ArchitectureVariant getByManifestProperty(MOEManifestConstants.LIBRARIES_PATHS property) {
        for (ArchitectureVariant variant : VARIANTS) {
            if (variant.manifestProperty == property) {
                return variant;
            }
        }
        return null;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getArchName() {
        return archName;
    }

    public MOEManifestConstants.LIBRARIES_PATHS getManifestProperty() {
        return manifestProperty;
    }

    /**
     * Architecture family name.
     */
    //@Input
    final String familyName;

    /**
     * Architecture name.
     */
    //@Input
    final String archName;

    /**
     * Manifest property name.
     */
    //@Input
    final MOEManifestConstants.LIBRARIES_PATHS manifestProperty;

    /**
     * Creates a new ${ArchitectureVariant} instance.
     *
     * @param familyName        family name
     * @param archName          architecture name
     * @param manifestProperty  manifest property
     */
    private ArchitectureVariant(String familyName, String archName, MOEManifestConstants.LIBRARIES_PATHS manifestProperty) {
        if ((familyName == null) || familyName.equals("") || (archName == null) || archName.equals("") ||
                (manifestProperty == null)) {
            throw new NullPointerException();
        }
        this.familyName = familyName;
        this.archName = archName;
        this.manifestProperty = manifestProperty;
    }

    public static ArchitectureVariant getArchitectureVariantByName(String name) throws Exception {
        ArchitectureVariant archVariant = getByArchName(name);
        if (archVariant == null) {
            // Fail on unsupported element
            throw new Exception("Invalid ArchitectureVariant :'" + name + "'");
        }
        long base = Dex2OatDefaults.getDefaultBaseForArchFamily(archVariant);
        if (base == Dex2OatDefaults.UNDEFINED_BASE_DEFAULT) {
            // Fail on unsupported element
            throw new Exception("Unsupported ArchitectureVariant :'" + name + "'");
        }
        return archVariant;
    }

    public static Collection<ArchitectureVariant> getSupportedArchitectureVariants(TargetVariant targetVariant) {

        Collection<ArchitectureVariant> supported = new ArrayList<ArchitectureVariant>();

        for (ArchitectureVariant current : targetVariant.getArchitectureVariants()) {
            String family = current.familyName;
            if (Dex2OatDefaults.getDefaultBaseForArchFamily(family) != Dex2OatDefaults.UNDEFINED_BASE_DEFAULT) {
                supported.add(current);
            }
        }
        return supported;
    }

    @Override
    public String toString() {
        return "{ familyName=" + familyName + "; archName=" + archName + " }";
    }
}
