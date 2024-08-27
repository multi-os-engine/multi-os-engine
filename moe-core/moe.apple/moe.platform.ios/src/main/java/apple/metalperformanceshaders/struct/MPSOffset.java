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

package apple.metalperformanceshaders.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
@Structure()
public final class MPSOffset extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public MPSOffset() {
        super(MPSOffset.class);
    }

    @Generated
    protected MPSOffset(Pointer peer) {
        super(peer);
    }

    @Generated
    public MPSOffset(@NInt long x, @NInt long y, @NInt long z) {
        super(MPSOffset.class);
        setX(x);
        setY(y);
        setZ(z);
    }

    /**
     * < The horizontal component of the offset. Units: pixels
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @NInt
    public native long x();

    /**
     * < The horizontal component of the offset. Units: pixels
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setX(@NInt long value);

    /**
     * < The vertical component of the offset. Units: pixels
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @NInt
    public native long y();

    /**
     * < The vertical component of the offset. Units: pixels
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setY(@NInt long value);

    /**
     * < The depth component of the offset. Units: pixels
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @NInt
    public native long z();

    /**
     * < The depth component of the offset. Units: pixels
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setZ(@NInt long value);
}
