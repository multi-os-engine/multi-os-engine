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

package apple.audiounit.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MusicDeviceNoteParams extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public MusicDeviceNoteParams() {
        super(MusicDeviceNoteParams.class);
    }

    @Generated
    protected MusicDeviceNoteParams(Pointer peer) {
        super(peer);
    }

    @Generated
    public MusicDeviceNoteParams(int argCount, float mPitch, float mVelocity,
            @ByValue NoteParamsControlValue mControls) {
        super(MusicDeviceNoteParams.class);
        setArgCount(argCount);
        setMPitch(mPitch);
        setMVelocity(mVelocity);
        setMControls(mControls);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int argCount();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setArgCount(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native float mPitch();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMPitch(float value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native float mVelocity();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMVelocity(float value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native NoteParamsControlValue mControls();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMControls(@ByValue NoteParamsControlValue value);
}
