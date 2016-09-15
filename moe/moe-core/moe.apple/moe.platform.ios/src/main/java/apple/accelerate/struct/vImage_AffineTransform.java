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

@Generated
@Structure()
public final class vImage_AffineTransform extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public vImage_AffineTransform() {
        super(vImage_AffineTransform.class);
    }

    @Generated
    protected vImage_AffineTransform(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native float a();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setA(float value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native float b();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setB(float value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native float c();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setC(float value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native float d();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setD(float value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native float tx();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setTx(float value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native float ty();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setTy(float value);
}
