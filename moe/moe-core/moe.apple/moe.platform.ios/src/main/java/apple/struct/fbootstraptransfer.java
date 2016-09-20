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
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class fbootstraptransfer extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public fbootstraptransfer() {
        super(fbootstraptransfer.class);
    }

    @Generated
    protected fbootstraptransfer(Pointer peer) {
        super(peer);
    }

    @Generated
    public fbootstraptransfer(long fbt_offset, @NUInt long fbt_length, VoidPtr fbt_buffer) {
        super(fbootstraptransfer.class);
        setFbt_offset(fbt_offset);
        setFbt_length(fbt_length);
        setFbt_buffer(fbt_buffer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long fbt_offset();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFbt_offset(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long fbt_length();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setFbt_length(@NUInt long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native VoidPtr fbt_buffer();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setFbt_buffer(VoidPtr value);
}
