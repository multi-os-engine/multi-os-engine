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

    /**
     * MTLOriginMake</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLFunctions_Ref/index.html#//apple_ref/c/func/MTLOriginMake">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MTLOrigin MTLOriginMake(@NUInt long x, @NUInt long y, @NUInt long z);

    /**
     * MTLSizeMake</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLFunctions_Ref/index.html#//apple_ref/c/func/MTLSizeMake">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MTLSize MTLSizeMake(@NUInt long width, @NUInt long height, @NUInt long depth);

    /**
     * MTLRegionMake1D</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLFunctions_Ref/index.html#//apple_ref/c/func/MTLRegionMake1D">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MTLRegion MTLRegionMake1D(@NUInt long x, @NUInt long width);

    /**
     * MTLRegionMake2D</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLFunctions_Ref/index.html#//apple_ref/c/func/MTLRegionMake2D">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MTLRegion MTLRegionMake2D(@NUInt long x, @NUInt long y, @NUInt long width, @NUInt long height);

    /**
     * MTLRegionMake3D</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLFunctions_Ref/index.html#//apple_ref/c/func/MTLRegionMake3D">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MTLRegion MTLRegionMake3D(@NUInt long x, @NUInt long y, @NUInt long z, @NUInt long width,
            @NUInt long height, @NUInt long depth);

    /**
     * MTLCreateSystemDefaultDevice</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLFunctions_Ref/index.html#//apple_ref/c/func/MTLCreateSystemDefaultDevice">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object MTLCreateSystemDefaultDevice();

    /**
     * MTLClearColorMake</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLFunctions_Ref/index.html#//apple_ref/c/func/MTLClearColorMake">iOS Dev Center</a>
     */
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
