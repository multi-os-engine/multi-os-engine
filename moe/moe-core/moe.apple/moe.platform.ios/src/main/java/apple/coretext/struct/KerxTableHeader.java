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
public final class KerxTableHeader extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public KerxTableHeader() {
        super(KerxTableHeader.class);
    }

    @Generated
    protected KerxTableHeader(Pointer peer) {
        super(peer);
    }

    @Generated
    public KerxTableHeader(int version, int nTables, int firstSubtable) {
        super(KerxTableHeader.class);
        setVersion(version);
        setNTables(nTables);
        setFirstSubtable(firstSubtable);
    }

    /**
     * font version number (currently 1.0)
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int version();

    /**
     * font version number (currently 1.0)
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setVersion(int value);

    /**
     * number of subtables present
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int nTables();

    /**
     * number of subtables present
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setNTables(int value);

    /**
     * first subtable starts here
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int firstSubtable();

    /**
     * first subtable starts here
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setFirstSubtable(int value);
}
