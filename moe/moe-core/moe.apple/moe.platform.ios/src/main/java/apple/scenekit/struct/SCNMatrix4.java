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

package apple.scenekit.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class SCNMatrix4 extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public SCNMatrix4() {
        super(SCNMatrix4.class);
    }

    @Generated
    protected SCNMatrix4(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native float m11();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setM11(float value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native float m12();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setM12(float value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native float m13();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setM13(float value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native float m14();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setM14(float value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native float m21();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setM21(float value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native float m22();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setM22(float value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native float m23();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setM23(float value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native float m24();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setM24(float value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native float m31();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setM31(float value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native float m32();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setM32(float value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    public native float m33();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setM33(float value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    public native float m34();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setM34(float value);

    @Generated
    @StructureField(order = 12, isGetter = true)
    public native float m41();

    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setM41(float value);

    @Generated
    @StructureField(order = 13, isGetter = true)
    public native float m42();

    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void setM42(float value);

    @Generated
    @StructureField(order = 14, isGetter = true)
    public native float m43();

    @Generated
    @StructureField(order = 14, isGetter = false)
    public native void setM43(float value);

    @Generated
    @StructureField(order = 15, isGetter = true)
    public native float m44();

    @Generated
    @StructureField(order = 15, isGetter = false)
    public native void setM44(float value);
}
