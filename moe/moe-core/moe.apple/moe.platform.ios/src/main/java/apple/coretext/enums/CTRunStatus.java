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

package apple.coretext.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum]       CTRunStatus
 * 
 * A bitfield passed back by CTRunGetStatus that is used to
 *             indicate the disposition of the run.
 * 
 * [@constant]   kCTRunStatusNoStatus
 *             The run has no special attributes.
 * 
 * [@constant]   kCTRunStatusRightToLeft
 *             When set, the run is right to left.
 * 
 * [@constant]   kCTRunStatusNonMonotonic
 *             When set, the run has been reordered in some way such that
 *             the string indices associated with the glyphs are no longer
 *             strictly increasing (for left to right runs) or decreasing
 *             (for right to left runs).
 * 
 * [@constant]   kCTRunStatusHasNonIdentityMatrix
 *             When set, the run requires a specific text matrix to be set
 *             in the current CG context for proper drawing.
 */
@Generated
public final class CTRunStatus {
    @Generated public static final int NoStatus = 0x00000000;
    @Generated public static final int RightToLeft = 0x00000001;
    @Generated public static final int NonMonotonic = 0x00000002;
    @Generated public static final int HasNonIdentityMatrix = 0x00000004;

    @Generated
    private CTRunStatus() {
    }
}
