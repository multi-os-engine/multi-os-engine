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

import apple.coreaudio.struct.AudioBufferList;
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

    @Generated
    @CFunction
    public static native int MTAudioProcessingTapCreate(CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") MTAudioProcessingTapCallbacks callbacks,
            int flags, Ptr<MTAudioProcessingTapRef> tapOut);

    @Generated
    @CFunction
    public static native VoidPtr MTAudioProcessingTapGetStorage(MTAudioProcessingTapRef tap);

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
