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

package apple.audiotoolbox.struct;

import apple.coreaudiotypes.struct.AudioChannelLayout;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.jetbrains.annotations.NotNull;

@Generated
@Structure()
public final class AudioBalanceFade extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public AudioBalanceFade() {
        super(AudioBalanceFade.class);
    }

    @Generated
    protected AudioBalanceFade(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioBalanceFade(float mLeftRightBalance, float mBackFrontFade, int mType,
            @NotNull AudioChannelLayout mChannelLayout) {
        super(AudioBalanceFade.class);
        setMLeftRightBalance(mLeftRightBalance);
        setMBackFrontFade(mBackFrontFade);
        setMType(mType);
        setMChannelLayout(mChannelLayout);
    }

    /**
     * -1 is full left, 0 is center, +1 is full right
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native float mLeftRightBalance();

    /**
     * -1 is full left, 0 is center, +1 is full right
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMLeftRightBalance(float value);

    /**
     * -1 is full rear, 0 is center, +1 is full front
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native float mBackFrontFade();

    /**
     * -1 is full rear, 0 is center, +1 is full front
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMBackFrontFade(float value);

    /**
     * max unity gain, or equal power.
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int mType();

    /**
     * max unity gain, or equal power.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMType(int value);

    @NotNull
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native AudioChannelLayout mChannelLayout();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMChannelLayout(@NotNull AudioChannelLayout value);
}
