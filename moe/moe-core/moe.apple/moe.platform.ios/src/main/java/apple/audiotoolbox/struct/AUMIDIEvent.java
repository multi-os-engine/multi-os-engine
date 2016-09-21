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

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure(alignment = 4)
public final class AUMIDIEvent extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public AUMIDIEvent() {
        super(AUMIDIEvent.class);
    }

    @Generated
    protected AUMIDIEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native VoidPtr next();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setNext(VoidPtr value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long eventSampleTime();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setEventSampleTime(long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native byte eventType();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setEventType(byte value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native byte reserved();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setReserved(byte value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native char length();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setLength(char value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native byte cable();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setCable(byte value);

    @Generated
    @StructureField(order = 6, isGetter = true, count = 3)
    public native byte data(int field_idx);

    @Generated
    @StructureField(order = 6, isGetter = false, count = 3)
    public native void setData(byte value, int field_idx);
}
