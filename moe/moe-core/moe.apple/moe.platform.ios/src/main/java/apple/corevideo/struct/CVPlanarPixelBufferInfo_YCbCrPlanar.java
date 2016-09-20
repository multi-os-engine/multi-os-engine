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
public final class CVPlanarPixelBufferInfo_YCbCrPlanar extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CVPlanarPixelBufferInfo_YCbCrPlanar() {
        super(CVPlanarPixelBufferInfo_YCbCrPlanar.class);
    }

    @Generated
    protected CVPlanarPixelBufferInfo_YCbCrPlanar(Pointer peer) {
        super(peer);
    }

    @Generated
    public CVPlanarPixelBufferInfo_YCbCrPlanar(@ByValue CVPlanarComponentInfo componentInfoY,
            @ByValue CVPlanarComponentInfo componentInfoCb, @ByValue CVPlanarComponentInfo componentInfoCr) {
        super(CVPlanarPixelBufferInfo_YCbCrPlanar.class);
        setComponentInfoY(componentInfoY);
        setComponentInfoCb(componentInfoCb);
        setComponentInfoCr(componentInfoCr);
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
    public native CVPlanarComponentInfo componentInfoCb();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setComponentInfoCb(@ByValue CVPlanarComponentInfo value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native CVPlanarComponentInfo componentInfoCr();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setComponentInfoCr(@ByValue CVPlanarComponentInfo value);
}
