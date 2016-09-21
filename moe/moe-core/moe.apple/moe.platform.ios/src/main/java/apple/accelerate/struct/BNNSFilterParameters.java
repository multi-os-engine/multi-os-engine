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

package apple.accelerate.struct;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class BNNSFilterParameters extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public BNNSFilterParameters() {
        super(BNNSFilterParameters.class);
    }

    @Generated
    protected BNNSFilterParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    public BNNSFilterParameters(int flags, @NUInt long n_threads,
            @FunctionPtr(name = "call_alloc_memory") Function_alloc_memory alloc_memory,
            @FunctionPtr(name = "call_free_memory") Function_free_memory free_memory) {
        super(BNNSFilterParameters.class);
        setFlags(flags);
        setN_threads(n_threads);
        setAlloc_memory(alloc_memory);
        setFree_memory(free_memory);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int flags();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFlags(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long n_threads();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setN_threads(@NUInt long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @FunctionPtr(name = "call_alloc_memory")
    public native Function_alloc_memory alloc_memory();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setAlloc_memory(@FunctionPtr(name = "call_alloc_memory") Function_alloc_memory value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @FunctionPtr(name = "call_free_memory")
    public native Function_free_memory free_memory();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setFree_memory(@FunctionPtr(name = "call_free_memory") Function_free_memory value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_alloc_memory {
        @Generated
        int call_alloc_memory(@ReferenceInfo(type = Void.class, depth = 2) Ptr<VoidPtr> arg0, @NUInt long arg1,
                @NUInt long arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_free_memory {
        @Generated
        void call_free_memory(VoidPtr arg0);
    }
}
