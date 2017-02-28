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

package apple.corefoundation.struct;

import apple.corefoundation.opaque.CFStringRef;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class CFAllocatorContext extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CFAllocatorContext() {
        super(CFAllocatorContext.class);
    }

    @Generated
    protected CFAllocatorContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NInt
    public native long version();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setVersion(@NInt long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native VoidPtr info();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setInfo(VoidPtr value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @FunctionPtr(name = "call_retain")
    public native Function_retain retain();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRetain(@FunctionPtr(name = "call_retain") Function_retain value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @FunctionPtr(name = "call_release")
    public native Function_release release();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setRelease(@FunctionPtr(name = "call_release") Function_release value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @FunctionPtr(name = "call_copyDescription")
    public native Function_copyDescription copyDescription();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setCopyDescription(@FunctionPtr(name = "call_copyDescription") Function_copyDescription value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    @FunctionPtr(name = "call_allocate")
    public native Function_allocate allocate();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setAllocate(@FunctionPtr(name = "call_allocate") Function_allocate value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    @FunctionPtr(name = "call_reallocate")
    public native Function_reallocate reallocate();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setReallocate(@FunctionPtr(name = "call_reallocate") Function_reallocate value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    @FunctionPtr(name = "call_deallocate")
    public native Function_deallocate deallocate();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setDeallocate(@FunctionPtr(name = "call_deallocate") Function_deallocate value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    @FunctionPtr(name = "call_preferredSize")
    public native Function_preferredSize preferredSize();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setPreferredSize(@FunctionPtr(name = "call_preferredSize") Function_preferredSize value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_retain {
        @Generated
        ConstVoidPtr call_retain(ConstVoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_release {
        @Generated
        void call_release(ConstVoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_copyDescription {
        @Generated
        CFStringRef call_copyDescription(ConstVoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_allocate {
        @Generated
        VoidPtr call_allocate(@NInt long arg0, @NUInt long arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_reallocate {
        @Generated
        VoidPtr call_reallocate(VoidPtr arg0, @NInt long arg1, @NUInt long arg2, VoidPtr arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_deallocate {
        @Generated
        void call_deallocate(VoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_preferredSize {
        @Generated
        @NInt
        long call_preferredSize(@NInt long arg0, @NUInt long arg1, VoidPtr arg2);
    }
}
