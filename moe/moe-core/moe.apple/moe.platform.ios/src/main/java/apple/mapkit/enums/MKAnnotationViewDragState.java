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

package apple.mapkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MKAnnotationViewDragState {
    /**
     * View is at rest, sitting on the map.
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * View is beginning to drag (e.g. pin lift)
     */
    @Generated @NUInt public static final long Starting = 0x0000000000000001L;
    /**
     * View is dragging ("lift" animations are complete)
     */
    @Generated @NUInt public static final long Dragging = 0x0000000000000002L;
    /**
     * View was not dragged and should return to its starting position (e.g. pin drop)
     */
    @Generated @NUInt public static final long Canceling = 0x0000000000000003L;
    /**
     * View was dragged, new coordinate is set and view should return to resting position (e.g. pin drop)
     */
    @Generated @NUInt public static final long Ending = 0x0000000000000004L;

    @Generated
    private MKAnnotationViewDragState() {
    }
}
