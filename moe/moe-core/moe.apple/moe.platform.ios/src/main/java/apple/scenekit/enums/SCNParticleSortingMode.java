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

package apple.scenekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Particle Sorting Mode
 */
@Generated
public final class SCNParticleSortingMode {
    /**
     * particles are not sorted
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * particles are sorted by depth (far rendered first)
     */
    @Generated @NInt public static final long ProjectedDepth = 0x0000000000000001L;
    /**
     * particles are sorted by distance from the point of view
     */
    @Generated @NInt public static final long Distance = 0x0000000000000002L;
    /**
     * particles are sorted by birth date - oldest first
     */
    @Generated @NInt public static final long OldestFirst = 0x0000000000000003L;
    /**
     * particles are sorted by birth date - yougest first
     */
    @Generated @NInt public static final long YoungestFirst = 0x0000000000000004L;

    @Generated
    private SCNParticleSortingMode() {
    }
}
