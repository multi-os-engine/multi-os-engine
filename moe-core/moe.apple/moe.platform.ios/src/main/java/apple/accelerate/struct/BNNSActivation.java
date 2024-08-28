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
import org.moe.natj.general.ptr.ConstIntPtr;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure()
public final class BNNSActivation extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public BNNSActivation() {
        super(BNNSActivation.class);
    }

    @Generated
    protected BNNSActivation(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int function();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFunction(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native float alpha();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setAlpha(float value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native float beta();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setBeta(float value);

    /**
     * The following fields are available in macOS 10.13, iOS 11, tvOS 11, watchOS 4
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int iscale();

    /**
     * The following fields are available in macOS 10.13, iOS 11, tvOS 11, watchOS 4
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setIscale(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int ioffset();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setIoffset(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int ishift();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setIshift(int value);

    @Nullable
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native ConstIntPtr iscale_per_channel();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setIscale_per_channel(@Nullable ConstIntPtr value);

    @Nullable
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native ConstIntPtr ioffset_per_channel();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setIoffset_per_channel(@Nullable ConstIntPtr value);

    @Nullable
    @Generated
    @StructureField(order = 8, isGetter = true)
    public native ConstIntPtr ishift_per_channel();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setIshift_per_channel(@Nullable ConstIntPtr value);
}
