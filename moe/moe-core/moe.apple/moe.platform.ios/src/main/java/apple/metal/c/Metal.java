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
import apple.metal.struct.MTLIndirectCommandBufferExecutionRange;
import apple.metal.struct.MTLOrigin;
import apple.metal.struct.MTLPackedFloat3;
import apple.metal.struct.MTLRegion;
import apple.metal.struct.MTLSamplePosition;
import apple.metal.struct.MTLSize;
import apple.metal.struct.MTLTextureSwizzleChannels;
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

    /**
     * Returns a reference to the preferred system default Metal device.
     * <p>
     * On Mac OS X systems that support automatic graphics switching, calling
     * this API to get a Metal device will cause the system to switch to the high power
     * GPU.  On other systems that support more than one GPU it will return the GPU that
     * is associated with the main display.
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object MTLCreateSystemDefaultDevice();

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MTLClearColor MTLClearColorMake(double red, double green, double blue, double alpha);

    /**
     * [@constant] MTLLibraryErrorDomain
     * <p>
     * NSErrors raised when creating a library.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLLibraryErrorDomain();

    /**
     * [@constant] MTLCommandBufferErrorDomain
     * <p>
     * An error domain for NSError objects produced by MTLCommandBuffer
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommandBufferErrorDomain();

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MTLSamplePosition MTLSamplePositionMake(float x, float y);

    /**
     * [@function] MTLCoordinate2DMake
     * <p>
     * Convenience function to create a 2D coordinate from 2 values.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MTLSamplePosition MTLCoordinate2DMake(float x, float y);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MTLTextureSwizzleChannels MTLTextureSwizzleChannelsMake(byte r, byte g, byte b, byte a);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MTLIndirectCommandBufferExecutionRange MTLIndirectCommandBufferExecutionRangeMake(int location,
            int length);

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCaptureErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterTimestamp();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterTessellationInputPatches();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterVertexInvocations();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterPostTessellationVertexInvocations();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterClipperInvocations();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterClipperPrimitivesOut();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterFragmentInvocations();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterFragmentsPassed();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterComputeKernelInvocations();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterTotalCycles();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterVertexCycles();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterTessellationCycles();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterPostTessellationVertexCycles();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterFragmentCycles();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterRenderTargetWriteCycles();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterSetTimestamp();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterSetStageUtilization();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterSetStatistic();

    /**
     * [@constant] MTLCounterErrorDomain
     * <p>
     * NSErrors raised when creating a counter sample buffer.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCounterErrorDomain();

    /**
     * Key in the userInfo for MTLCommandBufferError NSErrors. Value is an NSArray of MTLCommandBufferEncoderInfo objects in recorded order if an appropriate MTLCommandBufferErrorOption was set, otherwise the key will not exist in the userInfo dictionary.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommandBufferEncoderInfoErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLDynamicLibraryDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLBinaryArchiveDomain();

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MTLPackedFloat3 MTLPackedFloat3Make(float x, float y, float z);
}
