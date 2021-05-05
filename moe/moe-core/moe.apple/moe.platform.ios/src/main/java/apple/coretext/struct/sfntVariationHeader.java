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

package apple.coretext.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class sfntVariationHeader extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public sfntVariationHeader() {
        super(sfntVariationHeader.class);
    }

    @Generated
    protected sfntVariationHeader(Pointer peer) {
        super(peer);
    }

    /**
     * 1.0 Fixed
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int version();

    /**
     * 1.0 Fixed
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setVersion(int value);

    /**
     * to first axis = 16
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native char offsetToData();

    /**
     * to first axis = 16
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setOffsetToData(char value);

    /**
     * axis+inst = 2
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native char countSizePairs();

    /**
     * axis+inst = 2
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setCountSizePairs(char value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native char axisCount();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setAxisCount(char value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native char axisSize();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setAxisSize(char value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native char instanceCount();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setInstanceCount(char value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native char instanceSize();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setInstanceSize(char value);

    /**
     * [axisCount]
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    @ByValue
    public native sfntVariationAxis axis();

    /**
     * [axisCount]
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setAxis(@ByValue sfntVariationAxis value);

    /**
     * [instanceCount]  …other arrays of data
     */
    @Generated
    @StructureField(order = 8, isGetter = true)
    @ByValue
    public native sfntInstance instance();

    /**
     * [instanceCount]  …other arrays of data
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setInstance(@ByValue sfntInstance value);
}
