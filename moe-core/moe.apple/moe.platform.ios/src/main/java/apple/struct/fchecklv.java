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
public final class fchecklv extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public fchecklv() {
        super(fchecklv.class);
    }

    @Generated
    protected fchecklv(Pointer peer) {
        super(peer);
    }

    @Generated
    public fchecklv(long lv_file_start, @NUInt long lv_error_message_size, VoidPtr lv_error_message) {
        super(fchecklv.class);
        setLv_file_start(lv_file_start);
        setLv_error_message_size(lv_error_message_size);
        setLv_error_message(lv_error_message);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long lv_file_start();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setLv_file_start(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long lv_error_message_size();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setLv_error_message_size(@NUInt long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native VoidPtr lv_error_message();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setLv_error_message(VoidPtr value);
}
