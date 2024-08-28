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

package apple.videotoolbox.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] VTDecodeInfoFlags
 * 
 * Informational status for decoding -- non-error flags
 * 
 * [@constant] kVTDecodeInfo_Asynchronous
 * The kVTDecodeInfo_Asynchronous bit may be set if the decode ran asynchronously.
 * [@constant] kVTDecodeInfo_FrameDropped
 * The kVTDecodeInfo_FrameDropped bit may be set if the frame was dropped.
 * [@constant] kVTDecodeInfo_ImageBufferModifiable
 * If the kVTDecodeInfo_ImageBufferModifiable bit is set, it is safe for the client to modify the imageBuffer.
 * [@constant] kVTDecodeInfo_SkippedLeadingFrameDropped
 * The kVTDecodeInfo_SkippedLeadingFrameDropped may be set if a leading frame after a sync frame is dropped.
 * This can happen when a seek to a sync frame is initiated and, due to frame reordering, there are leading
 * frames following the sync frame that cannot be decoded due to missing references. Dropping these frames
 * has no impact to playback since the non-decodeable frames will not be rendered.
 * If kVTDecodeInfo_SkippedLeadingFrameDropped is set, kVTDecodeInfo_FrameDropped will also be set.
 */
@Generated
public final class VTDecodeInfoFlags {
    @Generated public static final int Asynchronous = 0x00000001;
    @Generated public static final int FrameDropped = 0x00000002;
    @Generated public static final int ImageBufferModifiable = 0x00000004;

    @Generated
    private VTDecodeInfoFlags() {
    }

    @Generated public static final int SkippedLeadingFrameDropped = 0x00000008;
}
