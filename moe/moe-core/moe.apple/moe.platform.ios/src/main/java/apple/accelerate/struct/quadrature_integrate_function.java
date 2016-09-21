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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstDoublePtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class quadrature_integrate_function extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public quadrature_integrate_function() {
        super(quadrature_integrate_function.class);
    }

    @Generated
    protected quadrature_integrate_function(Pointer peer) {
        super(peer);
    }

    @Generated
    public quadrature_integrate_function(@FunctionPtr(name = "call_fun") Function_fun fun, VoidPtr fun_arg) {
        super(quadrature_integrate_function.class);
        setFun(fun);
        setFun_arg(fun_arg);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @FunctionPtr(name = "call_fun")
    public native Function_fun fun();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFun(@FunctionPtr(name = "call_fun") Function_fun value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native VoidPtr fun_arg();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setFun_arg(VoidPtr value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_fun {
        @Generated
        void call_fun(VoidPtr arg0, @NUInt long arg1, ConstDoublePtr arg2, DoublePtr arg3);
    }
}
