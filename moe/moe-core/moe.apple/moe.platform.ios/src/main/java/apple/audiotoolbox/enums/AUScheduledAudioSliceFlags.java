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

package apple.audiotoolbox.enums;

import org.moe.natj.general.ann.Generated;

/**
 * @enum           ScheduledAudioSlice
 * @abstract           bits in ScheduledAudioSlice.mFlags
 * 
 * @constant       kScheduledAudioSliceFlag_Complete
 * 		            Set if the unit is done with this slice
 * @constant       kScheduledAudioSliceFlag_BeganToRender
 * 		            Set if any portion of the buffer has been played
 * @constant       kScheduledAudioSliceFlag_BeganToRenderLate
 * 		            Set if any portion of the buffer was not played because it was scheduled late
 * @constant       kScheduledAudioSliceFlag_Loop
 * 		            specifies that the buffer should loop indefinitely
 * @constant       kScheduledAudioSliceFlag_Interrupt
 * 		            specifies that the buffer should interrupt any previously scheduled buffer
 *                     (by default, buffers following a playing buffer are not played until the
 *                     playing buffer has completed).
 * @constant       kScheduledAudioSliceFlag_InterruptAtLoop
 * 		            specifies that the buffer should interrupt any previously scheduled buffer,
 *                     but only at a loop point in that buffer.
 */
@Generated
public final class AUScheduledAudioSliceFlags {
    @Generated public static final int Complete = 0x00000001;
    @Generated public static final int BeganToRender = 0x00000002;
    @Generated public static final int BeganToRenderLate = 0x00000004;
    /**
     * new for OS X 10.10 and iOS 8.0
     */
    @Generated public static final int Loop = 0x00000008;
    /**
     * new for OS X 10.10 and iOS 8.0
     */
    @Generated public static final int Interrupt = 0x00000010;
    /**
     * new for OS X 10.10 and iOS 8.0
     */
    @Generated public static final int InterruptAtLoop = 0x00000020;

    @Generated
    private AUScheduledAudioSliceFlags() {
    }
}
