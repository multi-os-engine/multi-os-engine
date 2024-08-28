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


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure()
public final class NG_ISPtr_Struct extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public NG_ISPtr_Struct() {
        super(NG_ISPtr_Struct.class);
    }

    @Generated
    protected NG_ISPtr_Struct(Pointer peer) {
        super(peer);
    }

    @Generated
    public NG_ISPtr_Struct(
            @UncertainArgument("Options: reference, array Fallback: reference") NG_I_Struct p) {
        super(NG_ISPtr_Struct.class);
        setP(p);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native NG_I_Struct p();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setP(
            @UncertainArgument("Options: reference, array Fallback: reference") NG_I_Struct value);
}
