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
public final class KerxIndexArrayHeader extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public KerxIndexArrayHeader() {
        super(KerxIndexArrayHeader.class);
    }

    @Generated
    protected KerxIndexArrayHeader(Pointer peer) {
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
    public native char kernValueCount();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setKernValueCount(char value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native char leftClassCount();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setLeftClassCount(char value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native char rightClassCount();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setRightClassCount(char value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native char flags();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setFlags(char value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native short kernValue();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setKernValue(short value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native char leftClass();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setLeftClass(char value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native char rightClass();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setRightClass(char value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native char kernIndex();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setKernIndex(char value);
}
