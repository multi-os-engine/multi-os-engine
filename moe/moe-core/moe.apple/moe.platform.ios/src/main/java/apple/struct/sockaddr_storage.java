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
public final class sockaddr_storage extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public sockaddr_storage() {
        super(sockaddr_storage.class);
    }

    @Generated
    protected sockaddr_storage(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native byte ss_len();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSs_len(byte value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte ss_family();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSs_family(byte value);

    @Generated
    @StructureField(order = 2, isGetter = true, count = 6)
    public native byte __ss_pad1(int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = false, count = 6)
    public native void set__ss_pad1(byte value, int field_idx);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long __ss_align();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void set__ss_align(long value);

    @Generated
    @StructureField(order = 4, isGetter = true, count = 112)
    public native byte __ss_pad2(int field_idx);

    @Generated
    @StructureField(order = 4, isGetter = false, count = 112)
    public native void set__ss_pad2(byte value, int field_idx);
}
