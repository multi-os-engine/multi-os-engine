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
import org.moe.natj.general.ann.Generated;
import org.jetbrains.annotations.NotNull;

@Generated
@Structure()
public final class AudioQueueChannelAssignment extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public AudioQueueChannelAssignment() {
        super(AudioQueueChannelAssignment.class);
    }

    @Generated
    protected AudioQueueChannelAssignment(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioQueueChannelAssignment(@NotNull CFStringRef mDeviceUID, int mChannelNumber) {
        super(AudioQueueChannelAssignment.class);
        setMDeviceUID(mDeviceUID);
        setMChannelNumber(mChannelNumber);
    }

    @NotNull
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native CFStringRef mDeviceUID();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMDeviceUID(@NotNull CFStringRef value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int mChannelNumber();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMChannelNumber(int value);
}
