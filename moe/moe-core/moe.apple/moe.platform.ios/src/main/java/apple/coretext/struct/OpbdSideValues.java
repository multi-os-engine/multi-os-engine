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
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class OpbdSideValues extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public OpbdSideValues() {
        super(OpbdSideValues.class);
    }

    @Generated
    protected OpbdSideValues(Pointer peer) {
        super(peer);
    }

    @Generated
    public OpbdSideValues(short leftSideShift, short topSideShift, short rightSideShift, short bottomSideShift) {
        super(OpbdSideValues.class);
        setLeftSideShift(leftSideShift);
        setTopSideShift(topSideShift);
        setRightSideShift(rightSideShift);
        setBottomSideShift(bottomSideShift);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native short leftSideShift();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setLeftSideShift(short value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native short topSideShift();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setTopSideShift(short value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native short rightSideShift();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRightSideShift(short value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native short bottomSideShift();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setBottomSideShift(short value);
}
