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
 * [@enum] SCNBufferFrequency
 * 
 * The frequency at which the custom program input should be updated.
 * 
 * When the frequency is set to SCNBufferFrequencyPerFrame, the binding block is invoked once per frame.
 * When the frequency is set to SCNBufferFrequencyPerNode, the binding block is invoked once per SCNNode.
 * When the frequency is set to SCNBufferFrequencyPerShadable, the binding block is invoked once per SCNMaterial or
 * SCNGeometry (depending on the object that owns the SCNProgram).
 * 
 * API-Since: 9.0
 */
@Generated
public final class SCNBufferFrequency {
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Frame = 0x0000000000000000L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Node = 0x0000000000000001L;
    /**
     * SCNMaterial or SCNGeometry
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Shadable = 0x0000000000000002L;

    @Generated
    private SCNBufferFrequency() {
    }
}
