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
public final class KernSimpleArrayHeader extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public KernSimpleArrayHeader() {
        super(KernSimpleArrayHeader.class);
    }

    @Generated
    protected KernSimpleArrayHeader(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native char rowWidth();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setRowWidth(char value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native char leftOffsetTable();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setLeftOffsetTable(char value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native char rightOffsetTable();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRightOffsetTable(char value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native char theArray();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setTheArray(char value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native char firstTable();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setFirstTable(char value);
}
