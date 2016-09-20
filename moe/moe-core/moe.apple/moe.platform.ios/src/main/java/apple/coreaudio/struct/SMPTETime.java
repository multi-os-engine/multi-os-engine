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

package apple.coreaudio.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class SMPTETime extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public SMPTETime() {
        super(SMPTETime.class);
    }

    @Generated
    protected SMPTETime(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native short mSubframes();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMSubframes(short value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native short mSubframeDivisor();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMSubframeDivisor(short value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int mCounter();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMCounter(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int mType();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMType(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int mFlags();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setMFlags(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native short mHours();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMHours(short value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native short mMinutes();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setMMinutes(short value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native short mSeconds();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setMSeconds(short value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native short mFrames();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setMFrames(short value);
}
