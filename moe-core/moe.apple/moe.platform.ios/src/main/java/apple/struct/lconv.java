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
import org.moe.natj.general.ptr.BytePtr;

@Generated
@Structure()
public final class lconv extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public lconv() {
        super(lconv.class);
    }

    @Generated
    protected lconv(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native BytePtr decimal_point();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setDecimal_point(BytePtr value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native BytePtr thousands_sep();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setThousands_sep(BytePtr value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native BytePtr grouping();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setGrouping(BytePtr value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native BytePtr int_curr_symbol();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setInt_curr_symbol(BytePtr value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native BytePtr currency_symbol();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setCurrency_symbol(BytePtr value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native BytePtr mon_decimal_point();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMon_decimal_point(BytePtr value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native BytePtr mon_thousands_sep();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setMon_thousands_sep(BytePtr value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native BytePtr mon_grouping();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setMon_grouping(BytePtr value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native BytePtr positive_sign();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setPositive_sign(BytePtr value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native BytePtr negative_sign();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setNegative_sign(BytePtr value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    public native byte int_frac_digits();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setInt_frac_digits(byte value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    public native byte frac_digits();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setFrac_digits(byte value);

    @Generated
    @StructureField(order = 12, isGetter = true)
    public native byte p_cs_precedes();

    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setP_cs_precedes(byte value);

    @Generated
    @StructureField(order = 13, isGetter = true)
    public native byte p_sep_by_space();

    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void setP_sep_by_space(byte value);

    @Generated
    @StructureField(order = 14, isGetter = true)
    public native byte n_cs_precedes();

    @Generated
    @StructureField(order = 14, isGetter = false)
    public native void setN_cs_precedes(byte value);

    @Generated
    @StructureField(order = 15, isGetter = true)
    public native byte n_sep_by_space();

    @Generated
    @StructureField(order = 15, isGetter = false)
    public native void setN_sep_by_space(byte value);

    @Generated
    @StructureField(order = 16, isGetter = true)
    public native byte p_sign_posn();

    @Generated
    @StructureField(order = 16, isGetter = false)
    public native void setP_sign_posn(byte value);

    @Generated
    @StructureField(order = 17, isGetter = true)
    public native byte n_sign_posn();

    @Generated
    @StructureField(order = 17, isGetter = false)
    public native void setN_sign_posn(byte value);

    @Generated
    @StructureField(order = 18, isGetter = true)
    public native byte int_p_cs_precedes();

    @Generated
    @StructureField(order = 18, isGetter = false)
    public native void setInt_p_cs_precedes(byte value);

    @Generated
    @StructureField(order = 19, isGetter = true)
    public native byte int_n_cs_precedes();

    @Generated
    @StructureField(order = 19, isGetter = false)
    public native void setInt_n_cs_precedes(byte value);

    @Generated
    @StructureField(order = 20, isGetter = true)
    public native byte int_p_sep_by_space();

    @Generated
    @StructureField(order = 20, isGetter = false)
    public native void setInt_p_sep_by_space(byte value);

    @Generated
    @StructureField(order = 21, isGetter = true)
    public native byte int_n_sep_by_space();

    @Generated
    @StructureField(order = 21, isGetter = false)
    public native void setInt_n_sep_by_space(byte value);

    @Generated
    @StructureField(order = 22, isGetter = true)
    public native byte int_p_sign_posn();

    @Generated
    @StructureField(order = 22, isGetter = false)
    public native void setInt_p_sign_posn(byte value);

    @Generated
    @StructureField(order = 23, isGetter = true)
    public native byte int_n_sign_posn();

    @Generated
    @StructureField(order = 23, isGetter = false)
    public native void setInt_n_sign_posn(byte value);
}
