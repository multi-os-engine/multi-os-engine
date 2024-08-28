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
public final class KernIndexArrayHeader extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public KernIndexArrayHeader() {
        super(KernIndexArrayHeader.class);
    }

    @Generated
    protected KernIndexArrayHeader(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native char glyphCount();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setGlyphCount(char value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte kernValueCount();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setKernValueCount(byte value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native byte leftClassCount();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setLeftClassCount(byte value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native byte rightClassCount();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setRightClassCount(byte value);

    /**
     * set to 0 for now
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native byte flags();

    /**
     * set to 0 for now
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setFlags(byte value);

    /**
     * actual kerning values reference by index in kernIndex
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native short kernValue();

    /**
     * actual kerning values reference by index in kernIndex
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setKernValue(short value);

    /**
     * maps left glyph to offset into kern index
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native byte leftClass();

    /**
     * maps left glyph to offset into kern index
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setLeftClass(byte value);

    /**
     * maps right glyph to offset into kern index
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native byte rightClass();

    /**
     * maps right glyph to offset into kern index
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setRightClass(byte value);

    /**
     * contains indicies into kernValue
     */
    @Generated
    @StructureField(order = 8, isGetter = true)
    public native byte kernIndex();

    /**
     * contains indicies into kernValue
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setKernIndex(byte value);
}
