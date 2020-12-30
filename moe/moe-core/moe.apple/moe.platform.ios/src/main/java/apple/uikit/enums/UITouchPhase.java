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

package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UITouchPhase {
    /**
     * whenever a finger touches the surface.
     */
    @Generated @NInt public static final long Began = 0x0000000000000000L;
    /**
     * whenever a finger moves on the surface.
     */
    @Generated @NInt public static final long Moved = 0x0000000000000001L;
    /**
     * whenever a finger is touching the surface but hasn't moved since the previous event.
     */
    @Generated @NInt public static final long Stationary = 0x0000000000000002L;
    /**
     * whenever a finger leaves the surface.
     */
    @Generated @NInt public static final long Ended = 0x0000000000000003L;
    /**
     * whenever a touch doesn't end but we need to stop tracking (e.g. putting device to face)
     */
    @Generated @NInt public static final long Cancelled = 0x0000000000000004L;

    @Generated
    private UITouchPhase() {
    }

    /**
     * whenever a touch is entering the region of a user interface
     */
    @Generated @NInt public static final long RegionEntered = 0x0000000000000005L;
    /**
     * when a touch is inside the region of a user interface, but hasn’t yet made contact or left the region
     */
    @Generated @NInt public static final long RegionMoved = 0x0000000000000006L;
    /**
     * when a touch is exiting the region of a user interface
     */
    @Generated @NInt public static final long RegionExited = 0x0000000000000007L;
}
