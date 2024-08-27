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

package apple.coremotion.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CMRotationMatrix extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CMRotationMatrix() {
        super(CMRotationMatrix.class);
    }

    @Generated
    protected CMRotationMatrix(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native double m11();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setM11(double value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native double m12();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setM12(double value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native double m13();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setM13(double value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native double m21();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setM21(double value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native double m22();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setM22(double value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native double m23();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setM23(double value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native double m31();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setM31(double value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native double m32();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setM32(double value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native double m33();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setM33(double value);
}
