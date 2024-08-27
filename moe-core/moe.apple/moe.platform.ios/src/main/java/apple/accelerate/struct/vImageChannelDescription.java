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
import org.moe.natj.general.ann.NFloat;

@Generated
@Structure()
public final class vImageChannelDescription extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public vImageChannelDescription() {
        super(vImageChannelDescription.class);
    }

    @Generated
    protected vImageChannelDescription(Pointer peer) {
        super(peer);
    }

    @Generated
    public vImageChannelDescription(@NFloat double min, @NFloat double zero, @NFloat double full, @NFloat double max) {
        super(vImageChannelDescription.class);
        setMin(min);
        setZero(zero);
        setFull(full);
        setMax(max);
    }

    /**
     * e.g. Minimum allowed value for format. e.g. {16, 16, 16, 0} for {Y', Cb, Cr, A} 8-bit video range
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @NFloat
    public native double min();

    /**
     * e.g. Minimum allowed value for format. e.g. {16, 16, 16, 0} for {Y', Cb, Cr, A} 8-bit video range
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMin(@NFloat double value);

    /**
     * e.g. Encoded value for 0.0 e.g. {0, 128, 128, 0} for {Y', Cb, Cr, A} 8-bit video range
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @NFloat
    public native double zero();

    /**
     * e.g. Encoded value for 0.0 e.g. {0, 128, 128, 0} for {Y', Cb, Cr, A} 8-bit video range
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setZero(@NFloat double value);

    /**
     * e.g. Encoded value for 1.0, (0.5 for Chroma). e.g. {235, 240, 240, 255} for {Y', Cb, Cr, A} 8-bit video range,
     * full range alpha
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @NFloat
    public native double full();

    /**
     * e.g. Encoded value for 1.0, (0.5 for Chroma). e.g. {235, 240, 240, 255} for {Y', Cb, Cr, A} 8-bit video range,
     * full range alpha
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setFull(@NFloat double value);

    /**
     * e.g. Maximum allowed value for format. e,g, {235, 240, 240, 255} to clamp to {Y', Cb, Cr, A} 8-bit video range,
     * full range alpha
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    @NFloat
    public native double max();

    /**
     * e.g. Maximum allowed value for format. e,g, {235, 240, 240, 255} to clamp to {Y', Cb, Cr, A} 8-bit video range,
     * full range alpha
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMax(@NFloat double value);
}
