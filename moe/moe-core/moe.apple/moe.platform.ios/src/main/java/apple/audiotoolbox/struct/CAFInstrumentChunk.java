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

@Generated
@Structure(alignment = 1)
public final class CAFInstrumentChunk extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public CAFInstrumentChunk() {
        super(CAFInstrumentChunk.class);
    }

    @Generated
    protected CAFInstrumentChunk(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native float mBaseNote();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMBaseNote(float value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte mMIDILowNote();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMMIDILowNote(byte value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native byte mMIDIHighNote();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMMIDIHighNote(byte value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native byte mMIDILowVelocity();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMMIDILowVelocity(byte value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native byte mMIDIHighVelocity();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setMMIDIHighVelocity(byte value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native float mdBGain();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMdBGain(float value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int mStartRegionID();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setMStartRegionID(int value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int mSustainRegionID();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setMSustainRegionID(int value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int mReleaseRegionID();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setMReleaseRegionID(int value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native int mInstrumentID();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setMInstrumentID(int value);
}
