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
public final class mach_msg_header_t extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public mach_msg_header_t() {
        super(mach_msg_header_t.class);
    }

    @Generated
    protected mach_msg_header_t(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int msgh_bits();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMsgh_bits(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int msgh_size();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMsgh_size(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int msgh_remote_port();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMsgh_remote_port(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int msgh_local_port();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMsgh_local_port(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int msgh_voucher_port();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setMsgh_voucher_port(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int msgh_id();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMsgh_id(int value);
}
