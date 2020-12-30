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
 * @enum		VTDecodeFrameFlags
 * @abstract	Directives for the decompression session and the video decoder, passed into
 * 			decodeFlags parameter of VTDecompressionSessionDecodeFrame.
 * 
 * @constant	kVTDecodeFrame_EnableAsynchronousDecompression
 * 	With the kVTDecodeFrame_EnableAsynchronousDecompression bit clear, the video decoder 
 * 	is compelled to emit every frame before it returns.  With the bit set, the decoder may 
 * 	process frames asynchronously, but it is not compelled to do so.  
 * @constant	kVTDecodeFrame_DoNotOutputFrame
 * 	A hint to the decompression session and video decoder that a CVImageBuffer should not
 * 	be emitted for this frame.  NULL will be returned instead. 
 * @constant	kVTDecodeFrame_1xRealTimePlayback
 * 	A hint to the video decoder that it would be OK to use a low-power mode that can not decode faster than 1x realtime.
 * @constant	kVTDecodeFrame_EnableTemporalProcessing
 * 	With the kVTDecodeFrame_EnableTemporalProcessing bit clear, the video decoder should emit 
 * 	every frame once that frame's decoding is done -- frames may not be delayed indefinitely.  With 
 * 	the bit set, it is legal for the decoder to delay frames indefinitely -- at least 
 * 	until VTDecompressionSessionFinishDelayedFrames or VTDecompressionSessionInvalidate is called.
 */
@Generated
public final class VTDecodeFrameFlags {
    @Generated public static final int _EnableAsynchronousDecompression = 0x00000001;
    @Generated public static final int _DoNotOutputFrame = 0x00000002;
    @Generated public static final int _1xRealTimePlayback = 0x00000004;
    @Generated public static final int _EnableTemporalProcessing = 0x00000008;

    @Generated
    private VTDecodeFrameFlags() {
    }
}
