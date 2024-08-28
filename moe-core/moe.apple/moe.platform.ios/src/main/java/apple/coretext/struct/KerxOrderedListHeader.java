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
@Structure(alignment = 2)
public final class KerxOrderedListHeader extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public KerxOrderedListHeader() {
        super(KerxOrderedListHeader.class);
    }

    @Generated
    protected KerxOrderedListHeader(Pointer peer) {
        super(peer);
    }

    /**
     * number of kerning pairs in table
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int nPairs();

    /**
     * number of kerning pairs in table
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setNPairs(int value);

    /**
     * (largest power of two <= nPairs) * entry size
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int searchRange();

    /**
     * (largest power of two <= nPairs) * entry size
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSearchRange(int value);

    /**
     * log2 (largest power of two <= nPairs)
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int entrySelector();

    /**
     * log2 (largest power of two <= nPairs)
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setEntrySelector(int value);

    /**
     * (nPairs - largest power of two <= nPairs) * entry size
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int rangeShift();

    /**
     * (nPairs - largest power of two <= nPairs) * entry size
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setRangeShift(int value);

    /**
     * entries are first glyph, second glyph, and value
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int table();

    /**
     * entries are first glyph, second glyph, and value
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setTable(int value);
}
