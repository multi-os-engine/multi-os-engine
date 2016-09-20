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

package apple.javascriptcore.struct;

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
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class JSStaticFunction extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public JSStaticFunction() {
        super(JSStaticFunction.class);
    }

    @Generated
    protected JSStaticFunction(Pointer peer) {
        super(peer);
    }

    @Generated
    public JSStaticFunction(String name,
            @FunctionPtr(name = "call_callAsFunction") Function_callAsFunction callAsFunction, int attributes) {
        super(JSStaticFunction.class);
        setName(name);
        setCallAsFunction(callAsFunction);
        setAttributes(attributes);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public native String name();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setName(String value);

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCallAsFunction(@FunctionPtr(name = "call_callAsFunction") Function_callAsFunction value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int attributes();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setAttributes(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @FunctionPtr(name = "call_callAsFunction")
    public native Function_callAsFunction callAsFunction();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_callAsFunction {
        @Generated
        VoidPtr call_callAsFunction(VoidPtr arg0, VoidPtr arg1, VoidPtr arg2, @NUInt long arg3,
                @ReferenceInfo(type = Void.class, depth = 2) ConstPtr<VoidPtr> arg4,
                @ReferenceInfo(type = Void.class, depth = 2) Ptr<VoidPtr> arg5);
    }
}
