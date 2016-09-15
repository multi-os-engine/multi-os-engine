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

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class _RuneLocale extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public _RuneLocale() {
        super(_RuneLocale.class);
    }

    @Generated
    protected _RuneLocale(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 8)
    public native byte __magic(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 8)
    public native void set__magic(byte value, int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = true, count = 32)
    public native byte __encoding(int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = false, count = 32)
    public native void set__encoding(byte value, int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void set__sgetrune(@FunctionPtr(name = "call___sgetrune") Function___sgetrune value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function___sgetrune {
        @Generated
        int call___sgetrune(
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg0,
                @NUInt long arg1, @ReferenceInfo(type = Byte.class, depth = 2) Ptr<ConstBytePtr> arg2);
    }

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void set__sputrune(@FunctionPtr(name = "call___sputrune") Function___sputrune value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function___sputrune {
        @Generated
        int call___sputrune(int arg0, BytePtr arg1, @NUInt long arg2,
                @ReferenceInfo(type = Byte.class, depth = 2) Ptr<BytePtr> arg3);
    }

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int __invalid_rune();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void set__invalid_rune(int value);

    @Generated
    @StructureField(order = 5, isGetter = true, count = 256)
    public native int __runetype(int field_idx);

    @Generated
    @StructureField(order = 5, isGetter = false, count = 256)
    public native void set__runetype(int value, int field_idx);

    @Generated
    @StructureField(order = 6, isGetter = true, count = 256)
    public native int __maplower(int field_idx);

    @Generated
    @StructureField(order = 6, isGetter = false, count = 256)
    public native void set__maplower(int value, int field_idx);

    @Generated
    @StructureField(order = 7, isGetter = true, count = 256)
    public native int __mapupper(int field_idx);

    @Generated
    @StructureField(order = 7, isGetter = false, count = 256)
    public native void set__mapupper(int value, int field_idx);

    @Generated
    @StructureField(order = 8, isGetter = true)
    @ByValue
    public native _RuneRange __runetype_ext();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void set__runetype_ext(@ByValue _RuneRange value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    @ByValue
    public native _RuneRange __maplower_ext();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void set__maplower_ext(@ByValue _RuneRange value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    @ByValue
    public native _RuneRange __mapupper_ext();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void set__mapupper_ext(@ByValue _RuneRange value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    public native VoidPtr __variable();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void set__variable(VoidPtr value);

    @Generated
    @StructureField(order = 12, isGetter = true)
    public native int __variable_len();

    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void set__variable_len(int value);

    @Generated
    @StructureField(order = 13, isGetter = true)
    public native int __ncharclasses();

    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void set__ncharclasses(int value);

    @Generated
    @StructureField(order = 14, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native _RuneCharClass __charclasses();

    @Generated
    @StructureField(order = 14, isGetter = false)
    public native void set__charclasses(
            @UncertainArgument("Options: reference, array Fallback: reference") _RuneCharClass value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @FunctionPtr(name = "call___sgetrune")
    public native Function___sgetrune __sgetrune();

    @Generated
    @StructureField(order = 3, isGetter = true)
    @FunctionPtr(name = "call___sputrune")
    public native Function___sputrune __sputrune();
}
