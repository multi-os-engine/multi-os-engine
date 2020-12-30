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

package apple.coretext.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class SFNTLookupBinarySearchHeader extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public SFNTLookupBinarySearchHeader() {
        super(SFNTLookupBinarySearchHeader.class);
    }

    @Generated
    protected SFNTLookupBinarySearchHeader(Pointer peer) {
        super(peer);
    }

    /**
     * size of a unit in bytes
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native char unitSize();

    /**
     * size of a unit in bytes
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setUnitSize(char value);

    /**
     * number of units in table
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native char nUnits();

    /**
     * number of units in table
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setNUnits(char value);

    /**
     * (largest power of two <= nUnits) * unitSize
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native char searchRange();

    /**
     * (largest power of two <= nUnits) * unitSize
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setSearchRange(char value);

    /**
     * log2 (largest power of two <= nUnits)
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native char entrySelector();

    /**
     * log2 (largest power of two <= nUnits)
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setEntrySelector(char value);

    /**
     * (nUnits - largest power of two <= nUnits) * unitSize
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native char rangeShift();

    /**
     * (nUnits - largest power of two <= nUnits) * unitSize
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setRangeShift(char value);
}
