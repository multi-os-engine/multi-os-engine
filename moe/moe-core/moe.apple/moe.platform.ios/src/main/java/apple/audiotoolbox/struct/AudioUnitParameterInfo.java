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
import org.jetbrains.annotations.Nullable;

@Generated
@Structure()
public final class AudioUnitParameterInfo extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public AudioUnitParameterInfo() {
        super(AudioUnitParameterInfo.class);
    }

    @Generated
    protected AudioUnitParameterInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 52)
    public native byte name(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 52)
    public native void setName(byte value, int field_idx);

    @Nullable
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native CFStringRef unitName();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setUnitName(@Nullable CFStringRef value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int clumpID();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setClumpID(int value);

    @Nullable
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native CFStringRef cfNameString();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setCfNameString(@Nullable CFStringRef value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int unit();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setUnit(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native float minValue();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMinValue(float value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native float maxValue();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setMaxValue(float value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native float defaultValue();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setDefaultValue(float value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int flags();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setFlags(int value);
}
