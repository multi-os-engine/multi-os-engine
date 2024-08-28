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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class KerxControlPointHeader extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public KerxControlPointHeader() {
        super(KerxControlPointHeader.class);
    }

    @Generated
    protected KerxControlPointHeader(Pointer peer) {
        super(peer);
    }

    @Generated
    public KerxControlPointHeader(@ByValue STXHeader header, int flags, byte firstTable) {
        super(KerxControlPointHeader.class);
        setHeader(header);
        setFlags(flags);
        setFirstTable(firstTable);
    }

    /**
     * state table header
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native STXHeader header();

    /**
     * state table header
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setHeader(@ByValue STXHeader value);

    /**
     * flags
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int flags();

    /**
     * flags
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setFlags(int value);

    /**
     * first table starts here
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native byte firstTable();

    /**
     * first table starts here
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setFirstTable(byte value);
}
