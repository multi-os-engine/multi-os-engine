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

package c.binding.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ptr.*;

@Generated
@Structure()
public final class NG_PPtrPtrMulti_Struct extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public NG_PPtrPtrMulti_Struct() {
        super(NG_PPtrPtrMulti_Struct.class);
    }

    @Generated
    protected NG_PPtrPtrMulti_Struct(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ReferenceInfo(type = Boolean.class, depth = 2)
    public native Ptr<BoolPtr> _bool();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void set_bool(Ptr<BoolPtr> value);

    @Generated
    @StructureField(order = 1, isGetter = true, count = 2)
    @ReferenceInfo(type = Byte.class, depth = 2)
    public native Ptr<BytePtr> _byte(int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = false, count = 2)
    public native void set_byte(Ptr<BytePtr> value, int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = true, count = 3)
    @ReferenceInfo(type = Short.class, depth = 2)
    public native Ptr<ShortPtr> _short(int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = false, count = 3)
    public native void set_short(Ptr<ShortPtr> value, int field_idx);

    @Generated
    @StructureField(order = 3, isGetter = true, count = 4)
    @ReferenceInfo(type = Character.class, depth = 2)
    public native Ptr<CharPtr> _char(int field_idx);

    @Generated
    @StructureField(order = 3, isGetter = false, count = 4)
    public native void set_char(Ptr<CharPtr> value, int field_idx);

    @Generated
    @StructureField(order = 4, isGetter = true, count = 5)
    @ReferenceInfo(type = Integer.class, depth = 2)
    public native Ptr<IntPtr> _int(int field_idx);

    @Generated
    @StructureField(order = 4, isGetter = false, count = 5)
    public native void set_int(Ptr<IntPtr> value, int field_idx);

    @Generated
    @StructureField(order = 5, isGetter = true, count = 6)
    @ReferenceInfo(type = Long.class, depth = 2)
    public native Ptr<LongPtr> _long(int field_idx);

    @Generated
    @StructureField(order = 5, isGetter = false, count = 6)
    public native void set_long(Ptr<LongPtr> value, int field_idx);

    @Generated
    @StructureField(order = 6, isGetter = true, count = 7)
    @ReferenceInfo(type = Float.class, depth = 2)
    public native Ptr<FloatPtr> _float(int field_idx);

    @Generated
    @StructureField(order = 6, isGetter = false, count = 7)
    public native void set_float(Ptr<FloatPtr> value, int field_idx);

    @Generated
    @StructureField(order = 7, isGetter = true, count = 8)
    @ReferenceInfo(type = Double.class, depth = 2)
    public native Ptr<DoublePtr> _double(int field_idx);

    @Generated
    @StructureField(order = 7, isGetter = false, count = 8)
    public native void set_double(Ptr<DoublePtr> value, int field_idx);
}
