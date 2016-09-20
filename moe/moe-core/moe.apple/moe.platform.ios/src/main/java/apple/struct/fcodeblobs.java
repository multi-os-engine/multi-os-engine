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
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class fcodeblobs extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public fcodeblobs() {
        super(fcodeblobs.class);
    }

    @Generated
    protected fcodeblobs(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native VoidPtr f_cd_hash();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setF_cd_hash(VoidPtr value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long f_hash_size();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setF_hash_size(@NUInt long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native VoidPtr f_cd_buffer();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setF_cd_buffer(VoidPtr value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @NUInt
    public native long f_cd_size();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setF_cd_size(@NUInt long value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native IntPtr f_out_size();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setF_out_size(IntPtr value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int f_arch();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setF_arch(int value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int __padding();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void set__padding(int value);
}
