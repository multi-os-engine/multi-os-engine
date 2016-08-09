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

import java.util.ArrayList;
import java.util.List;

public class ModeVariant implements java.io.Serializable {

    /*
    Predefined mode names.
     */
    public static final String RELEASE_NAME = "Release";
    public static final String DEBUG_NAME = "Debug";

    /*
    Predefined modes.
     */
    private static final ModeVariant RELEASE = new ModeVariant(RELEASE_NAME, false);
    private static final ModeVariant DEBUG = new ModeVariant(DEBUG_NAME, true);

    private static final List<ModeVariant> VARIANTS = new ArrayList<ModeVariant>() {{
        add(RELEASE);
        add(DEBUG);
    }};

    /**
     * Returns a list of all available ModeVariants.
     *
     * @return list of all available ModeVariants
     */
    public static List<ModeVariant> getAll() {
        return new ArrayList<ModeVariant>(VARIANTS);
    }

    /**
     * Get a variant by name.
     *
     * @param name variant name
     * @return variant or null
     */
    public static ModeVariant getByName(String name) {
        for (ModeVariant variant : VARIANTS) {
            if (variant.getName().equalsIgnoreCase(name)) {
                return variant;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public boolean isDebug() {
        return isDebug;
    }

    /**
     * Mode name.
     */
    final String name;

    /**
     * Debug mode enabled.
     */
    final boolean isDebug;

    /**
     * Creates a new ${ModeVariant} instance.
     *
     * @param name    mode name
     * @param isDebug debug mode enabled
     */
    private ModeVariant(String name, boolean isDebug) {
        this.name = name;
        this.isDebug = isDebug;
    }

    public static ModeVariant getModeVariant(String name) throws Exception {
        ModeVariant modeVariant = getByName(name);
        if (modeVariant == null) {
            // Fail on unsupported element
            throw new Exception("Invalid ModeVariant '" + name + "'");
        }
        return modeVariant;
    }
}
