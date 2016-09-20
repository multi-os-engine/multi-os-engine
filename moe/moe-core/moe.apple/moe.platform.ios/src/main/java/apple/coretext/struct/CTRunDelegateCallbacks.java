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

package apple.coretext.struct;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class CTRunDelegateCallbacks extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CTRunDelegateCallbacks() {
        super(CTRunDelegateCallbacks.class);
    }

    @Generated
    protected CTRunDelegateCallbacks(Pointer peer) {
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
    @StructureField(order = 1, isGetter = false)
    public native void setDealloc(@FunctionPtr(name = "call_dealloc") Function_dealloc value);

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setGetAscent(@FunctionPtr(name = "call_getAscent") Function_getAscent value);

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setGetDescent(@FunctionPtr(name = "call_getDescent") Function_getDescent value);

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setGetWidth(@FunctionPtr(name = "call_getWidth") Function_getWidth value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @FunctionPtr(name = "call_dealloc")
    public native Function_dealloc dealloc();

    @Generated
    @StructureField(order = 2, isGetter = true)
    @FunctionPtr(name = "call_getAscent")
    public native Function_getAscent getAscent();

    @Generated
    @StructureField(order = 3, isGetter = true)
    @FunctionPtr(name = "call_getDescent")
    public native Function_getDescent getDescent();

    @Generated
    @StructureField(order = 4, isGetter = true)
    @FunctionPtr(name = "call_getWidth")
    public native Function_getWidth getWidth();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_dealloc {
        @Generated
        void call_dealloc(VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_getAscent {
        @Generated
        @NFloat
        double call_getAscent(VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_getDescent {
        @Generated
        @NFloat
        double call_getDescent(VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_getWidth {
        @Generated
        @NFloat
        double call_getWidth(VoidPtr arg0);
    }
}
