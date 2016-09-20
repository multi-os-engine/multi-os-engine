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

package apple.quartzcore.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NFloat;

@Generated
@Structure()
public final class CATransform3D extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CATransform3D() {
        super(CATransform3D.class);
    }

    @Generated
    protected CATransform3D(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NFloat
    public native double m11();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setM11(@NFloat double value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NFloat
    public native double m12();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setM12(@NFloat double value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @NFloat
    public native double m13();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setM13(@NFloat double value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @NFloat
    public native double m14();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setM14(@NFloat double value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @NFloat
    public native double m21();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setM21(@NFloat double value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    @NFloat
    public native double m22();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setM22(@NFloat double value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    @NFloat
    public native double m23();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setM23(@NFloat double value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    @NFloat
    public native double m24();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setM24(@NFloat double value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    @NFloat
    public native double m31();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setM31(@NFloat double value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    @NFloat
    public native double m32();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setM32(@NFloat double value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    @NFloat
    public native double m33();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setM33(@NFloat double value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    @NFloat
    public native double m34();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setM34(@NFloat double value);

    @Generated
    @StructureField(order = 12, isGetter = true)
    @NFloat
    public native double m41();

    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setM41(@NFloat double value);

    @Generated
    @StructureField(order = 13, isGetter = true)
    @NFloat
    public native double m42();

    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void setM42(@NFloat double value);

    @Generated
    @StructureField(order = 14, isGetter = true)
    @NFloat
    public native double m43();

    @Generated
    @StructureField(order = 14, isGetter = false)
    public native void setM43(@NFloat double value);

    @Generated
    @StructureField(order = 15, isGetter = true)
    @NFloat
    public native double m44();

    @Generated
    @StructureField(order = 15, isGetter = false)
    public native void setM44(@NFloat double value);
}
