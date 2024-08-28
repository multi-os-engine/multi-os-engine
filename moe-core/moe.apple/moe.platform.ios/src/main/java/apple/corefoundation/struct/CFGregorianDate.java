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

package apple.corefoundation.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CFGregorianDate extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CFGregorianDate() {
        super(CFGregorianDate.class);
    }

    @Generated
    protected CFGregorianDate(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int year();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setYear(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte month();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMonth(byte value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native byte day();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setDay(byte value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native byte hour();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setHour(byte value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native byte minute();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setMinute(byte value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native double second();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setSecond(double value);
}
