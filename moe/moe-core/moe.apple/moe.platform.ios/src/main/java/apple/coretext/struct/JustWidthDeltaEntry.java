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
@Structure(alignment = 2)
public final class JustWidthDeltaEntry extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public JustWidthDeltaEntry() {
        super(JustWidthDeltaEntry.class);
    }

    @Generated
    protected JustWidthDeltaEntry(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int justClass();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setJustClass(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int beforeGrowLimit();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setBeforeGrowLimit(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int beforeShrinkLimit();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setBeforeShrinkLimit(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int afterGrowLimit();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setAfterGrowLimit(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int afterShrinkLimit();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setAfterShrinkLimit(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native char growFlags();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setGrowFlags(char value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native char shrinkFlags();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setShrinkFlags(char value);
}
