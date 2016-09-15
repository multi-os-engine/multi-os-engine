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

import apple.coregraphics.opaque.CGColorSpaceRef;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.ConstNFloatPtr;

@Generated
@Structure()
public final class vImage_CGImageFormat extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public vImage_CGImageFormat() {
        super(vImage_CGImageFormat.class);
    }

    @Generated
    protected vImage_CGImageFormat(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int bitsPerComponent();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setBitsPerComponent(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int bitsPerPixel();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setBitsPerPixel(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native CGColorSpaceRef colorSpace();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setColorSpace(CGColorSpaceRef value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int bitmapInfo();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setBitmapInfo(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int version();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setVersion(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native ConstNFloatPtr decode();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setDecode(ConstNFloatPtr value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int renderingIntent();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setRenderingIntent(int value);
}
