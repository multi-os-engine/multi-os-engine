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
public final class rusage_info_v0 extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public rusage_info_v0() {
        super(rusage_info_v0.class);
    }

    @Generated
    protected rusage_info_v0(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 16)
    public native byte ri_uuid(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 16)
    public native void setRi_uuid(byte value, int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long ri_user_time();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setRi_user_time(long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long ri_system_time();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRi_system_time(long value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long ri_pkg_idle_wkups();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setRi_pkg_idle_wkups(long value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native long ri_interrupt_wkups();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setRi_interrupt_wkups(long value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native long ri_pageins();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setRi_pageins(long value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native long ri_wired_size();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setRi_wired_size(long value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native long ri_resident_size();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setRi_resident_size(long value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native long ri_phys_footprint();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setRi_phys_footprint(long value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native long ri_proc_start_abstime();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setRi_proc_start_abstime(long value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    public native long ri_proc_exit_abstime();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setRi_proc_exit_abstime(long value);
}
