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

package apple.corevideo.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CVPlanarPixelBufferInfo_YCbCrBiPlanar extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public CVPlanarPixelBufferInfo_YCbCrBiPlanar() {
        super(CVPlanarPixelBufferInfo_YCbCrBiPlanar.class);
    }

    @Generated
    protected CVPlanarPixelBufferInfo_YCbCrBiPlanar(Pointer peer) {
        super(peer);
    }

    @Generated
    public CVPlanarPixelBufferInfo_YCbCrBiPlanar(@ByValue CVPlanarComponentInfo componentInfoY,
            @ByValue CVPlanarComponentInfo componentInfoCbCr) {
        super(CVPlanarPixelBufferInfo_YCbCrBiPlanar.class);
        setComponentInfoY(componentInfoY);
        setComponentInfoCbCr(componentInfoCbCr);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native CVPlanarComponentInfo componentInfoY();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setComponentInfoY(@ByValue CVPlanarComponentInfo value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native CVPlanarComponentInfo componentInfoCbCr();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setComponentInfoCbCr(@ByValue CVPlanarComponentInfo value);
}
