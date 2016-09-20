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
@Structure(alignment = 1)
public final class ntsid_t extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public ntsid_t() {
        super(ntsid_t.class);
    }

    @Generated
    protected ntsid_t(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native byte sid_kind();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSid_kind(byte value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte sid_authcount();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSid_authcount(byte value);

    @Generated
    @StructureField(order = 2, isGetter = true, count = 6)
    public native byte sid_authority(int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = false, count = 6)
    public native void setSid_authority(byte value, int field_idx);

    @Generated
    @StructureField(order = 3, isGetter = true, count = 16)
    public native int sid_authorities(int field_idx);

    @Generated
    @StructureField(order = 3, isGetter = false, count = 16)
    public native void setSid_authorities(int value, int field_idx);
}
