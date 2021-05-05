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
 * Particle Event
 */
@Generated
public final class SCNParticleEvent {
    /**
     * Event triggered when a new particle spawns.
     */
    @Generated @NInt public static final long Birth = 0x0000000000000000L;
    /**
     * Event triggered when a particle dies.
     */
    @Generated @NInt public static final long Death = 0x0000000000000001L;
    /**
     * Event triggered when a particle collides with a collider node.
     */
    @Generated @NInt public static final long Collision = 0x0000000000000002L;

    @Generated
    private SCNParticleEvent() {
    }
}
