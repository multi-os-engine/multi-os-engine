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

package apple.audiotoolbox.struct;

import apple.corefoundation.opaque.CFStringRef;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure()
public final class AudioFileMarker extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public AudioFileMarker() {
        super(AudioFileMarker.class);
    }

    @Generated
    protected AudioFileMarker(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native double mFramePosition();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMFramePosition(double value);

    @Nullable
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native CFStringRef mName();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMName(@Nullable CFStringRef value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int mMarkerID();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMMarkerID(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native AudioFile_SMPTE_Time mSMPTETime();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMSMPTETime(@ByValue AudioFile_SMPTE_Time value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int mType();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setMType(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native char mReserved();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMReserved(char value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native char mChannel();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setMChannel(char value);
}
