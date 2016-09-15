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
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class ucontext_t extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public ucontext_t() {
        super(ucontext_t.class);
    }

    @Generated
    protected ucontext_t(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int uc_onstack();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setUc_onstack(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int uc_sigmask();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setUc_sigmask(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native stack_t uc_stack();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setUc_stack(@ByValue stack_t value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native ucontext_t uc_link();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setUc_link(@UncertainArgument("Options: reference, array Fallback: reference") ucontext_t value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @NUInt
    public native long uc_mcsize();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setUc_mcsize(@NUInt long value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native VoidPtr uc_mcontext();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setUc_mcontext(VoidPtr value);
}
