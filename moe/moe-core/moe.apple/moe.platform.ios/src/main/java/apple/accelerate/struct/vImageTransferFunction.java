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

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NFloat;

@Generated
@Structure()
public final class vImageTransferFunction extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public vImageTransferFunction() {
        super(vImageTransferFunction.class);
    }

    @Generated
    protected vImageTransferFunction(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NFloat
    public native double c0();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setC0(@NFloat double value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NFloat
    public native double c1();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setC1(@NFloat double value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @NFloat
    public native double c2();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setC2(@NFloat double value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @NFloat
    public native double c3();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setC3(@NFloat double value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @NFloat
    public native double gamma();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setGamma(@NFloat double value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    @NFloat
    public native double cutoff();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setCutoff(@NFloat double value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    @NFloat
    public native double c4();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setC4(@NFloat double value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    @NFloat
    public native double c5();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setC5(@NFloat double value);
}
