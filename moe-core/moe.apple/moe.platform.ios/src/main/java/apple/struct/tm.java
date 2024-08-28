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

package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.BytePtr;

@Generated
@Structure()
public final class tm extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public tm() {
        super(tm.class);
    }

    @Generated
    protected tm(Pointer peer) {
        super(peer);
    }

    /**
     * seconds after the minute [0-60]
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int tm_sec();

    /**
     * seconds after the minute [0-60]
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTm_sec(int value);

    /**
     * minutes after the hour [0-59]
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int tm_min();

    /**
     * minutes after the hour [0-59]
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setTm_min(int value);

    /**
     * hours since midnight [0-23]
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int tm_hour();

    /**
     * hours since midnight [0-23]
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setTm_hour(int value);

    /**
     * day of the month [1-31]
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int tm_mday();

    /**
     * day of the month [1-31]
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setTm_mday(int value);

    /**
     * months since January [0-11]
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int tm_mon();

    /**
     * months since January [0-11]
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setTm_mon(int value);

    /**
     * years since 1900
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int tm_year();

    /**
     * years since 1900
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setTm_year(int value);

    /**
     * days since Sunday [0-6]
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int tm_wday();

    /**
     * days since Sunday [0-6]
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setTm_wday(int value);

    /**
     * days since January 1 [0-365]
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int tm_yday();

    /**
     * days since January 1 [0-365]
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setTm_yday(int value);

    /**
     * Daylight Savings Time flag
     */
    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int tm_isdst();

    /**
     * Daylight Savings Time flag
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setTm_isdst(int value);

    /**
     * offset from UTC in seconds
     */
    @Generated
    @StructureField(order = 9, isGetter = true)
    @NInt
    public native long tm_gmtoff();

    /**
     * offset from UTC in seconds
     */
    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setTm_gmtoff(@NInt long value);

    /**
     * timezone abbreviation
     */
    @Generated
    @StructureField(order = 10, isGetter = true)
    public native BytePtr tm_zone();

    /**
     * timezone abbreviation
     */
    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setTm_zone(BytePtr value);
}
