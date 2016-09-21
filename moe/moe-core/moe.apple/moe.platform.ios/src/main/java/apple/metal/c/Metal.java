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

package apple.metal.c;

import apple.metal.struct.MTLClearColor;
import apple.metal.struct.MTLOrigin;
import apple.metal.struct.MTLRegion;
import apple.metal.struct.MTLSize;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("Metal")
@Runtime(CRuntime.class)
public final class Metal {
    static {
        NatJ.register();
    }

    @Generated
    private Metal() {
    }

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MTLOrigin MTLOriginMake(@NUInt long x, @NUInt long y, @NUInt long z);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MTLSize MTLSizeMake(@NUInt long width, @NUInt long height, @NUInt long depth);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MTLRegion MTLRegionMake1D(@NUInt long x, @NUInt long width);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MTLRegion MTLRegionMake2D(@NUInt long x, @NUInt long y, @NUInt long width, @NUInt long height);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MTLRegion MTLRegionMake3D(@NUInt long x, @NUInt long y, @NUInt long z, @NUInt long width,
            @NUInt long height, @NUInt long depth);

    @Generated
    @CFunction
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object MTLCreateSystemDefaultDevice();

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MTLClearColor MTLClearColorMake(double red, double green, double blue, double alpha);

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommandBufferErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLLibraryErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLRenderPipelineErrorDomain();
}
