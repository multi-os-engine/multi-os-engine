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

package apple.coremidi.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MIDIThruConnectionParams extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public MIDIThruConnectionParams() {
        super(MIDIThruConnectionParams.class);
    }

    @Generated
    protected MIDIThruConnectionParams(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int version();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setVersion(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int numSources();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setNumSources(int value);

    @Generated
    @StructureField(order = 2, isGetter = true, count = 8)
    @ByValue
    public native MIDIThruConnectionEndpoint sources(int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = false, count = 8)
    public native void setSources(@ByValue MIDIThruConnectionEndpoint value, int field_idx);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int numDestinations();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setNumDestinations(int value);

    @Generated
    @StructureField(order = 4, isGetter = true, count = 8)
    @ByValue
    public native MIDIThruConnectionEndpoint destinations(int field_idx);

    @Generated
    @StructureField(order = 4, isGetter = false, count = 8)
    public native void setDestinations(@ByValue MIDIThruConnectionEndpoint value, int field_idx);

    @Generated
    @StructureField(order = 5, isGetter = true, count = 16)
    public native byte channelMap(int field_idx);

    @Generated
    @StructureField(order = 5, isGetter = false, count = 16)
    public native void setChannelMap(byte value, int field_idx);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native byte lowVelocity();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setLowVelocity(byte value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native byte highVelocity();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setHighVelocity(byte value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native byte lowNote();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setLowNote(byte value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native byte highNote();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setHighNote(byte value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    @ByValue
    public native MIDITransform noteNumber();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setNoteNumber(@ByValue MIDITransform value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    @ByValue
    public native MIDITransform velocity();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setVelocity(@ByValue MIDITransform value);

    @Generated
    @StructureField(order = 12, isGetter = true)
    @ByValue
    public native MIDITransform keyPressure();

    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setKeyPressure(@ByValue MIDITransform value);

    @Generated
    @StructureField(order = 13, isGetter = true)
    @ByValue
    public native MIDITransform channelPressure();

    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void setChannelPressure(@ByValue MIDITransform value);

    @Generated
    @StructureField(order = 14, isGetter = true)
    @ByValue
    public native MIDITransform programChange();

    @Generated
    @StructureField(order = 14, isGetter = false)
    public native void setProgramChange(@ByValue MIDITransform value);

    @Generated
    @StructureField(order = 15, isGetter = true)
    @ByValue
    public native MIDITransform pitchBend();

    @Generated
    @StructureField(order = 15, isGetter = false)
    public native void setPitchBend(@ByValue MIDITransform value);

    @Generated
    @StructureField(order = 16, isGetter = true)
    public native byte filterOutSysEx();

    @Generated
    @StructureField(order = 16, isGetter = false)
    public native void setFilterOutSysEx(byte value);

    @Generated
    @StructureField(order = 17, isGetter = true)
    public native byte filterOutMTC();

    @Generated
    @StructureField(order = 17, isGetter = false)
    public native void setFilterOutMTC(byte value);

    @Generated
    @StructureField(order = 18, isGetter = true)
    public native byte filterOutBeatClock();

    @Generated
    @StructureField(order = 18, isGetter = false)
    public native void setFilterOutBeatClock(byte value);

    @Generated
    @StructureField(order = 19, isGetter = true)
    public native byte filterOutTuneRequest();

    @Generated
    @StructureField(order = 19, isGetter = false)
    public native void setFilterOutTuneRequest(byte value);

    @Generated
    @StructureField(order = 20, isGetter = true, count = 3)
    public native byte reserved2(int field_idx);

    @Generated
    @StructureField(order = 20, isGetter = false, count = 3)
    public native void setReserved2(byte value, int field_idx);

    @Generated
    @StructureField(order = 21, isGetter = true)
    public native byte filterOutAllControls();

    @Generated
    @StructureField(order = 21, isGetter = false)
    public native void setFilterOutAllControls(byte value);

    @Generated
    @StructureField(order = 22, isGetter = true)
    public native char numControlTransforms();

    @Generated
    @StructureField(order = 22, isGetter = false)
    public native void setNumControlTransforms(char value);

    @Generated
    @StructureField(order = 23, isGetter = true)
    public native char numMaps();

    @Generated
    @StructureField(order = 23, isGetter = false)
    public native void setNumMaps(char value);

    @Generated
    @StructureField(order = 24, isGetter = true, count = 4)
    public native char reserved3(int field_idx);

    @Generated
    @StructureField(order = 24, isGetter = false, count = 4)
    public native void setReserved3(char value, int field_idx);
}
