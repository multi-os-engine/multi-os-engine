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
 * Particle Birth Location
 */
@Generated
public final class SCNParticleBirthLocation {
    /**
     * particles are emitted on the surface of the emitter shape.
     */
    @Generated @NInt public static final long Surface = 0x0000000000000000L;
    /**
     * particles are emitted inside the volume of the emitter shape.
     */
    @Generated @NInt public static final long Volume = 0x0000000000000001L;
    /**
     * particles are emitted on the vertices of the emitter shape.
     */
    @Generated @NInt public static final long Vertex = 0x0000000000000002L;

    @Generated
    private SCNParticleBirthLocation() {
    }
}
