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
@Structure(alignment = 4)
public final class log2phys extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public log2phys() {
        super(log2phys.class);
    }

    @Generated
    protected log2phys(Pointer peer) {
        super(peer);
    }

    @Generated
    public log2phys(int l2p_flags, long l2p_contigbytes, long l2p_devoffset) {
        super(log2phys.class);
        setL2p_flags(l2p_flags);
        setL2p_contigbytes(l2p_contigbytes);
        setL2p_devoffset(l2p_devoffset);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int l2p_flags();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setL2p_flags(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long l2p_contigbytes();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setL2p_contigbytes(long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long l2p_devoffset();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setL2p_devoffset(long value);
}
