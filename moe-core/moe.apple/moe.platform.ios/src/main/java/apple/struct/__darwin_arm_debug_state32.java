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
public final class __darwin_arm_debug_state32 extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public __darwin_arm_debug_state32() {
        super(__darwin_arm_debug_state32.class);
    }

    @Generated
    protected __darwin_arm_debug_state32(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 16)
    public native int __bvr(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 16)
    public native void set__bvr(int value, int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = true, count = 16)
    public native int __bcr(int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = false, count = 16)
    public native void set__bcr(int value, int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = true, count = 16)
    public native int __wvr(int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = false, count = 16)
    public native void set__wvr(int value, int field_idx);

    @Generated
    @StructureField(order = 3, isGetter = true, count = 16)
    public native int __wcr(int field_idx);

    @Generated
    @StructureField(order = 3, isGetter = false, count = 16)
    public native void set__wcr(int value, int field_idx);

    /**
     * Bit 0 is SS (Hardware Single Step)
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native long __mdscr_el1();

    /**
     * Bit 0 is SS (Hardware Single Step)
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void set__mdscr_el1(long value);
}
