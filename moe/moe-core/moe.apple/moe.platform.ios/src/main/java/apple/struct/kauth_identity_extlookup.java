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
public final class kauth_identity_extlookup extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public kauth_identity_extlookup() {
        super(kauth_identity_extlookup.class);
    }

    @Generated
    protected kauth_identity_extlookup(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int el_seqno();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setEl_seqno(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int el_result();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setEl_result(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int el_flags();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setEl_flags(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int el_info_pid();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setEl_info_pid(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native long el_extend();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setEl_extend(long value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int el_info_reserved_1();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setEl_info_reserved_1(int value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int el_uid();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setEl_uid(int value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    @ByValue
    public native guid_t el_uguid();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setEl_uguid(@ByValue guid_t value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int el_uguid_valid();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setEl_uguid_valid(int value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    @ByValue
    public native ntsid_t el_usid();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setEl_usid(@ByValue ntsid_t value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    public native int el_usid_valid();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setEl_usid_valid(int value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    public native int el_gid();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setEl_gid(int value);

    @Generated
    @StructureField(order = 12, isGetter = true)
    @ByValue
    public native guid_t el_gguid();

    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setEl_gguid(@ByValue guid_t value);

    @Generated
    @StructureField(order = 13, isGetter = true)
    public native int el_gguid_valid();

    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void setEl_gguid_valid(int value);

    @Generated
    @StructureField(order = 14, isGetter = true)
    @ByValue
    public native ntsid_t el_gsid();

    @Generated
    @StructureField(order = 14, isGetter = false)
    public native void setEl_gsid(@ByValue ntsid_t value);

    @Generated
    @StructureField(order = 15, isGetter = true)
    public native int el_gsid_valid();

    @Generated
    @StructureField(order = 15, isGetter = false)
    public native void setEl_gsid_valid(int value);

    @Generated
    @StructureField(order = 16, isGetter = true)
    public native int el_member_valid();

    @Generated
    @StructureField(order = 16, isGetter = false)
    public native void setEl_member_valid(int value);

    @Generated
    @StructureField(order = 17, isGetter = true)
    public native int el_sup_grp_cnt();

    @Generated
    @StructureField(order = 17, isGetter = false)
    public native void setEl_sup_grp_cnt(int value);

    @Generated
    @StructureField(order = 18, isGetter = true, count = 16)
    public native int el_sup_groups(int field_idx);

    @Generated
    @StructureField(order = 18, isGetter = false, count = 16)
    public native void setEl_sup_groups(int value, int field_idx);
}
