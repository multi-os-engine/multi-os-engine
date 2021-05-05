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

package apple.mediatoolbox.c;

import apple.coreaudiotypes.struct.AudioBufferList;
import apple.corefoundation.opaque.CFAllocatorRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.coremedia.struct.CMTimeRange;
import apple.mediatoolbox.opaque.MTAudioProcessingTapRef;
import apple.mediatoolbox.struct.MTAudioProcessingTapCallbacks;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Library("MediaToolbox")
@Runtime(CRuntime.class)
public final class MediaToolbox {
    static {
        NatJ.register();
    }

    @Generated
    private MediaToolbox() {
    }

    @Generated
    @CFunction
    @NUInt
    public static native long MTAudioProcessingTapGetTypeID();

    /**
     * [@function]	MTAudioProcessingTapCreate
     * 
     * Create a new processing tap.
     * 
     * This function creates a processing tap.
     * 			The processing tap will then be used to process decoded data.
     * 			The processing is performed on audio either before or after any effects or other
     * 			processing (varispeed, etc) is applied by the audio queue.
     * 
     * @param		allocator
     * 			The allocator to use to allocate memory for the new tap. Pass NULL or kCFAllocatorDefault to use the current default allocator.
     * @param		callbacks
     * 			Callbacks struct.  MTAudioProcessingTap will make a copy of this struct.
     * @param		flags
     * 			Flags that are used to control aspects of the processing tap.
     * 			Valid flags are:
     * 			- kMTAudioProcessingTapCreationFlag_PreEffects:
     * 				processing is done before any further effects are applied by the audio queue to the audio.
     * 			- kMTAudioProcessingTapCreationFlag_PostEffects:
     * 				processing is done after all processing is done, including that of other taps.
     * @param		tapOut
     * 			The processing tap object.
     * 
     *    @return     An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MTAudioProcessingTapCreate(CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") MTAudioProcessingTapCallbacks callbacks,
            int flags, Ptr<MTAudioProcessingTapRef> tapOut);

    /**
     * [@function]	MTAudioProcessingTapGetStorage
     * 
     * Used by a processing tap to retrieve a custom storage pointer.
     * 
     * @param		tap
     * 			The processing tap.
     * 
     * @return		The tapStorage returned by the init callback.
     */
    @Generated
    @CFunction
    public static native VoidPtr MTAudioProcessingTapGetStorage(MTAudioProcessingTapRef tap);

    /**
     * [@function]	MTAudioProcessingTapGetSourceAudio
     * 
     * Used by a processing tap to retrieve source audio.
     * 
     * This function may only be called from the processing tap's callback.
     * 
     * @param		tap
     * 			The processing tap.
     * @param		numberFrames
     * 			The number of frames the processing tap requires for its processing.
     * @param		bufferListInOut
     * 			The audio buffer list which will contain the source data.
     * 			On input, all fields except for the buffer pointers must be filled in.
     * 			If the buffer pointers are NULL (recommended), non-NULL pointers will be
     * 			returned and system owns the source buffers; these buffers are only applicable
     * 			for the duration of the processing tap callback.
     * 			If the buffer pointers are non-NULL, then they must be big enough to hold
     * 			numberFrames, and the source data will be copied into these buffers.
     * @param		flagsOut
     * 			Flags to describe state about the input requested, e.g., discontinuity/complete. Can be NULL.
     * @param		timeRangeOut
     * 			The asset time range corresponding to the provided source audio frames. Can be NULL.
     * @param		numberFramesOut
     * 			The number of source frames that have been provided. Can be NULL.
     * 			This can be less than the number of requested frames specified in numberFrames.
     * 
     * @return		An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int MTAudioProcessingTapGetSourceAudio(MTAudioProcessingTapRef tap, @NInt long numberFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList bufferListInOut,
            IntPtr flagsOut,
            @UncertainArgument("Options: reference, array Fallback: reference") CMTimeRange timeRangeOut,
            NIntPtr numberFramesOut);

    @Generated
    @CFunction
    public static native CFStringRef MTCopyLocalizedNameForMediaType(int mediaType);

    @Generated
    @CFunction
    public static native CFStringRef MTCopyLocalizedNameForMediaSubType(int mediaType, int mediaSubType);
}
