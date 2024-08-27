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
 * [@enum] SCNShadowMode
 * 
 * The different modes available to compute shadows.
 * 
 * When the shadow mode is set to SCNShadowModeForward, shadows are computed while computing the lighting. In this mode
 * only the alpha component of the shadow color is used to alter the lighting contribution.
 * When the shadow mode is set to SCNShadowModeDeferred shadows are applied as a post process. Shadows are blend over
 * the final image and can therefor be of any arbitrary color. However it is most of the time less efficient than
 * SCNShadowModeForward, except when a scene has a lot of overdraw.
 * When the shadow mode is set to SCNShadowModeModulated the light doesn't illuminate the scene anymore, it only casts
 * shadows. Therefore setting the light color has no effect. In this mode gobos act as a shadow projector: the gobo
 * image is modulated with the shadow receiver's fragments. The typical usage is to use an image of a radial gradient
 * (black to white) that is projected under a character (and use the categoryBitMask of the light and nodes to exclude
 * the character from the shadow receiver).
 */
@Generated
public final class SCNShadowMode {
    @Generated @NInt public static final long Forward = 0x0000000000000000L;
    @Generated @NInt public static final long Deferred = 0x0000000000000001L;
    @Generated @NInt public static final long Modulated = 0x0000000000000002L;

    @Generated
    private SCNShadowMode() {
    }
}
