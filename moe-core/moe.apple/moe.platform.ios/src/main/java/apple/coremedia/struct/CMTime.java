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

package apple.coremedia.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 4)
public final class CMTime extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CMTime() {
        super(CMTime.class);
    }

    @Generated
    protected CMTime(Pointer peer) {
        super(peer);
    }

    @Generated
    public CMTime(long value, int timescale, int flags, long epoch) {
        super(CMTime.class);
        setValue(value);
        setTimescale(timescale);
        setFlags(flags);
        setEpoch(epoch);
    }

    /**
     * < The value of the CMTime. value/timescale = seconds
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long value();

    /**
     * < The value of the CMTime. value/timescale = seconds
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setValue(long value);

    /**
     * < The timescale of the CMTime. value/timescale = seconds.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int timescale();

    /**
     * < The timescale of the CMTime. value/timescale = seconds.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setTimescale(int value);

    /**
     * < The flags, eg. kCMTimeFlags_Valid, kCMTimeFlags_PositiveInfinity, etc.
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int flags();

    /**
     * < The flags, eg. kCMTimeFlags_Valid, kCMTimeFlags_PositiveInfinity, etc.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setFlags(int value);

    /**
     * < Differentiates between equal timestamps that are actually different because
     * of looping, multi-item sequencing, etc.
     * Will be used during comparison: greater epochs happen after lesser ones.
     * Additions/subtraction is only possible within a single epoch,
     * however, since epoch length may be unknown/variable
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long epoch();

    /**
     * < Differentiates between equal timestamps that are actually different because
     * of looping, multi-item sequencing, etc.
     * Will be used during comparison: greater epochs happen after lesser ones.
     * Additions/subtraction is only possible within a single epoch,
     * however, since epoch length may be unknown/variable
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setEpoch(long value);
}
