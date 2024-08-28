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
public final class STXHeader extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public STXHeader() {
        super(STXHeader.class);
    }

    @Generated
    protected STXHeader(Pointer peer) {
        super(peer);
    }

    @Generated
    public STXHeader(int nClasses, int classTableOffset, int stateArrayOffset, int entryTableOffset) {
        super(STXHeader.class);
        setNClasses(nClasses);
        setClassTableOffset(classTableOffset);
        setStateArrayOffset(stateArrayOffset);
        setEntryTableOffset(entryTableOffset);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int nClasses();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setNClasses(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int classTableOffset();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setClassTableOffset(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int stateArrayOffset();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setStateArrayOffset(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int entryTableOffset();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setEntryTableOffset(int value);
}
