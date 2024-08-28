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

package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class fstore extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public fstore() {
        super(fstore.class);
    }

    @Generated
    protected fstore(Pointer peer) {
        super(peer);
    }

    /**
     * IN: flags word
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int fst_flags();

    /**
     * IN: flags word
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFst_flags(int value);

    /**
     * IN: indicates use of offset field
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int fst_posmode();

    /**
     * IN: indicates use of offset field
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setFst_posmode(int value);

    /**
     * IN: start of the region
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long fst_offset();

    /**
     * IN: start of the region
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setFst_offset(long value);

    /**
     * IN: size of the region
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long fst_length();

    /**
     * IN: size of the region
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setFst_length(long value);

    /**
     * OUT: number of bytes allocated
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native long fst_bytesalloc();

    /**
     * OUT: number of bytes allocated
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setFst_bytesalloc(long value);
}
