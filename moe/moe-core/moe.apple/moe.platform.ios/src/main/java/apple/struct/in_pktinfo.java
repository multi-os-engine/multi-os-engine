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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class in_pktinfo extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public in_pktinfo() {
        super(in_pktinfo.class);
    }

    @Generated
    protected in_pktinfo(Pointer peer) {
        super(peer);
    }

    @Generated
    public in_pktinfo(int ipi_ifindex, @ByValue in_addr ipi_spec_dst, @ByValue in_addr ipi_addr) {
        super(in_pktinfo.class);
        setIpi_ifindex(ipi_ifindex);
        setIpi_spec_dst(ipi_spec_dst);
        setIpi_addr(ipi_addr);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int ipi_ifindex();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setIpi_ifindex(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native in_addr ipi_spec_dst();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setIpi_spec_dst(@ByValue in_addr value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native in_addr ipi_addr();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setIpi_addr(@ByValue in_addr value);
}
