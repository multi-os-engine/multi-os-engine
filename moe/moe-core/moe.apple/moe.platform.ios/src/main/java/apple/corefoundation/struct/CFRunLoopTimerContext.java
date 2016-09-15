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

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class CFRunLoopTimerContext extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public CFRunLoopTimerContext() {
        super(CFRunLoopTimerContext.class);
    }

    @Generated
    protected CFRunLoopTimerContext(Pointer peer) {
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
    @StructureField(order = 2, isGetter = false)
    public native void setRetain(@FunctionPtr(name = "call_retain") Function_retain value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_retain {
        @Generated
        ConstVoidPtr call_retain(ConstVoidPtr arg0);
    }

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setRelease(@FunctionPtr(name = "call_release") Function_release value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_release {
        @Generated
        void call_release(ConstVoidPtr arg0);
    }

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setCopyDescription(@FunctionPtr(name = "call_copyDescription") Function_copyDescription value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_copyDescription {
        @Generated
        VoidPtr call_copyDescription(ConstVoidPtr arg0);
    }

    @Generated
    @StructureField(order = 2, isGetter = true)
    @FunctionPtr(name = "call_retain")
    public native Function_retain retain();

    @Generated
    @StructureField(order = 3, isGetter = true)
    @FunctionPtr(name = "call_release")
    public native Function_release release();

    @Generated
    @StructureField(order = 4, isGetter = true)
    @FunctionPtr(name = "call_copyDescription")
    public native Function_copyDescription copyDescription();
}
