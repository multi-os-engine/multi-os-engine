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

import apple.coreaudio.struct.AudioStreamPacketDescription;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class AudioQueueBuffer extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AudioQueueBuffer() {
        super(AudioQueueBuffer.class);
    }

    @Generated
    protected AudioQueueBuffer(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int mAudioDataBytesCapacity();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMAudioDataBytesCapacity(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native VoidPtr mAudioData();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMAudioData(VoidPtr value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int mAudioDataByteSize();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMAudioDataByteSize(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native VoidPtr mUserData();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMUserData(VoidPtr value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int mPacketDescriptionCapacity();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setMPacketDescriptionCapacity(int value);

    @ReferenceInfo(type = AudioStreamPacketDescription.class)
    @Generated
    @StructureField(order = 5, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native Ptr<AudioStreamPacketDescription> mPacketDescriptions();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMPacketDescriptions(Ptr<AudioStreamPacketDescription> value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int mPacketDescriptionCount();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setMPacketDescriptionCount(int value);
}
