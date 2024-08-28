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

package c.binding.struct;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;

@Generated
@Structure()
public final class NG_FnPtr_Struct extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public NG_FnPtr_Struct() {
        super(NG_FnPtr_Struct.class);
    }

    @Generated
    protected NG_FnPtr_Struct(Pointer peer) {
        super(peer);
    }

    @Generated
    public NG_FnPtr_Struct(@FunctionPtr(name = "call_cb1") Function_cb1 cb1,
                           @FunctionPtr(name = "call_cb2") Function_cb2 cb2) {
        super(NG_FnPtr_Struct.class);
        setCb1(cb1);
        setCb2(cb2);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @FunctionPtr(name = "call_cb1")
    public native Function_cb1 cb1();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_cb1 {
        @Generated
        void call_cb1(int arg0);
    }

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCb1(@FunctionPtr(name = "call_cb1") Function_cb1 value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @FunctionPtr(name = "call_cb2")
    public native Function_cb2 cb2();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_cb2 {
        @Generated
        void call_cb2(float arg0);
    }

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCb2(@FunctionPtr(name = "call_cb2") Function_cb2 value);
}
