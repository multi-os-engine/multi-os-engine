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

@Generated
public final class SCNTransparencyMode {
    /**
     * Takes the transparency information from the alpha channel. The value 1.0 is opaque.
     */
    @Generated @NInt public static final long AOne = 0x0000000000000000L;
    /**
     * Ignores the alpha channel and takes the transparency information from the luminance of the red, green, and blue
     * channels. The value 0.0 is opaque.
     */
    @Generated @NInt public static final long RGBZero = 0x0000000000000001L;

    @Generated
    private SCNTransparencyMode() {
    }

    /**
     * Ensures that one layer of transparency is drawn correctly.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long SingleLayer = 0x0000000000000002L;
    /**
     * Ensures that two layers of transparency are ordered and drawn correctly. This should be used for transparent
     * convex objects like cubes and spheres, when you want to see both front and back faces.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long DualLayer = 0x0000000000000003L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Default = 0x0000000000000000L;
}
