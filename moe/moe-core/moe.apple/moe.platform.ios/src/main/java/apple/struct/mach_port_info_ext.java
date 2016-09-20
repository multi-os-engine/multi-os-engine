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
public final class mach_port_info_ext extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public mach_port_info_ext() {
        super(mach_port_info_ext.class);
    }

    @Generated
    protected mach_port_info_ext(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native mach_port_status mpie_status();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMpie_status(@ByValue mach_port_status value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int mpie_boost_cnt();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMpie_boost_cnt(int value);

    @Generated
    @StructureField(order = 2, isGetter = true, count = 6)
    public native int reserved(int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = false, count = 6)
    public native void setReserved(int value, int field_idx);
}
