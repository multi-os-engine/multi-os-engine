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

package apple.metal.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure()
public final class MTLScissorRect extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public MTLScissorRect() {
        super(MTLScissorRect.class);
    }

    @Generated
    protected MTLScissorRect(Pointer peer) {
        super(peer);
    }

    @Generated
    public MTLScissorRect(@NUInt long x, @NUInt long y, @NUInt long width, @NUInt long height) {
        super(MTLScissorRect.class);
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long x();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setX(@NUInt long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long y();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setY(@NUInt long value);

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
    public native long height();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setHeight(@NUInt long value);
}
