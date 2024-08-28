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
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] SCNDebugOptions
 * 
 * Debug options.
 * 
 * API-Since: 9.0
 */
@Generated
public final class SCNDebugOptions {
    /**
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * show physics shape
     * 
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long ShowPhysicsShapes = 0x0000000000000001L;
    /**
     * show object bounding boxes
     * 
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long ShowBoundingBoxes = 0x0000000000000002L;
    /**
     * show objects's light influences
     * 
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long ShowLightInfluences = 0x0000000000000004L;
    /**
     * show light extents
     * 
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long ShowLightExtents = 0x0000000000000008L;
    /**
     * show SCNPhysicsFields forces and extents
     * 
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long ShowPhysicsFields = 0x0000000000000010L;
    /**
     * show wireframe on top of objects
     * 
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long ShowWireframe = 0x0000000000000020L;

    @Generated
    private SCNDebugOptions() {
    }

    /**
     * render objects as wireframe
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long RenderAsWireframe = 0x0000000000000040L;
    /**
     * show skinning bones
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long ShowSkeletons = 0x0000000000000080L;
    /**
     * show subdivision creases
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long ShowCreases = 0x0000000000000100L;
    /**
     * show slider constraint
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long ShowConstraints = 0x0000000000000200L;
    /**
     * show cameras
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long ShowCameras = 0x0000000000000400L;
}
