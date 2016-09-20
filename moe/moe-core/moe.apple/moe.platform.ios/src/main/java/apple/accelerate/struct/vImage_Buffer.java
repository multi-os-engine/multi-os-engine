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
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class vImage_Buffer extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public vImage_Buffer() {
        super(vImage_Buffer.class);
    }

    @Generated
    protected vImage_Buffer(Pointer peer) {
        super(peer);
    }

    @Generated
    public vImage_Buffer(VoidPtr data, @NUInt long height, @NUInt long width, @NUInt long rowBytes) {
        super(vImage_Buffer.class);
        setData(data);
        setHeight(height);
        setWidth(width);
        setRowBytes(rowBytes);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native VoidPtr data();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setData(VoidPtr value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long height();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setHeight(@NUInt long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @NUInt
    public native long width();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setWidth(@NUInt long value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @NUInt
    public native long rowBytes();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setRowBytes(@NUInt long value);
}
