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

@Generated
@Structure()
public final class MPSSize extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public MPSSize() {
        super(MPSSize.class);
    }

    @Generated
    protected MPSSize(Pointer peer) {
        super(peer);
    }

    @Generated
    public MPSSize(double width, double height, double depth) {
        super(MPSSize.class);
        setWidth(width);
        setHeight(height);
        setDepth(depth);
    }

    /**
     * < The width of the region
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native double width();

    /**
     * < The width of the region
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setWidth(double value);

    /**
     * < The height of the region
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native double height();

    /**
     * < The height of the region
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setHeight(double value);

    /**
     * < The depth of the region
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native double depth();

    /**
     * < The depth of the region
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setDepth(double value);
}
