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

import apple.audiounit.struct.MusicDeviceNoteParams;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class ExtendedNoteOnEvent extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public ExtendedNoteOnEvent() {
        super(ExtendedNoteOnEvent.class);
    }

    @Generated
    protected ExtendedNoteOnEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    public ExtendedNoteOnEvent(int instrumentID, int groupID, float duration,
            @ByValue MusicDeviceNoteParams extendedParams) {
        super(ExtendedNoteOnEvent.class);
        setInstrumentID(instrumentID);
        setGroupID(groupID);
        setDuration(duration);
        setExtendedParams(extendedParams);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int instrumentID();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setInstrumentID(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int groupID();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setGroupID(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native float duration();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setDuration(float value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native MusicDeviceNoteParams extendedParams();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setExtendedParams(@ByValue MusicDeviceNoteParams value);
}
