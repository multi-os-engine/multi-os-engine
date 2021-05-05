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
public final class KerxSimpleArrayHeader extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public KerxSimpleArrayHeader() {
        super(KerxSimpleArrayHeader.class);
    }

    @Generated
    protected KerxSimpleArrayHeader(Pointer peer) {
        super(peer);
    }

    /**
     * width, in bytes, of a row in the table
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int rowWidth();

    /**
     * width, in bytes, of a row in the table
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setRowWidth(int value);

    /**
     * offset to left-hand offset table
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int leftOffsetTable();

    /**
     * offset to left-hand offset table
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setLeftOffsetTable(int value);

    /**
     * offset to right-hand offset table
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int rightOffsetTable();

    /**
     * offset to right-hand offset table
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRightOffsetTable(int value);

    /**
     * offset to start of kerning array
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int theArray();

    /**
     * offset to start of kerning array
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setTheArray(int value);

    /**
     * first offset table starts here...
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int firstTable();

    /**
     * first offset table starts here...
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setFirstTable(int value);
}
