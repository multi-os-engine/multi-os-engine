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

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class __darwin_pthread_handler_rec extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public __darwin_pthread_handler_rec() {
        super(__darwin_pthread_handler_rec.class);
    }

    @Generated
    protected __darwin_pthread_handler_rec(Pointer peer) {
        super(peer);
    }

    @Generated
    public __darwin_pthread_handler_rec(@FunctionPtr(name = "call___routine") Function___routine __routine,
            VoidPtr __arg,
            @UncertainArgument("Options: reference, array Fallback: reference") __darwin_pthread_handler_rec __next) {
        super(__darwin_pthread_handler_rec.class);
        set__routine(__routine);
        set__arg(__arg);
        set__next(__next);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @FunctionPtr(name = "call___routine")
    public native Function___routine __routine();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void set__routine(@FunctionPtr(name = "call___routine") Function___routine value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native VoidPtr __arg();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void set__arg(VoidPtr value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native __darwin_pthread_handler_rec __next();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void set__next(
            @UncertainArgument("Options: reference, array Fallback: reference") __darwin_pthread_handler_rec value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function___routine {
        @Generated
        void call___routine(VoidPtr arg0);
    }
}
