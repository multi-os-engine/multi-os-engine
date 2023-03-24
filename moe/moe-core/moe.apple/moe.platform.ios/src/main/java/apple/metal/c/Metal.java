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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
     * 
     * On Mac OS X systems that support automatic graphics switching, calling
     * this API to get a Metal device will cause the system to switch to the high power
     * GPU. On other systems that support more than one GPU it will return the GPU that
     * is associated with the main display.
     * 
     * API-Since: 8.0
     */
    @Nullable
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
     * 
     * NSErrors raised when creating a library.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLLibraryErrorDomain();

    /**
     * [@constant] MTLCommandBufferErrorDomain
     * 
     * An error domain for NSError objects produced by MTLCommandBuffer
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommandBufferErrorDomain();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MTLSamplePosition MTLSamplePositionMake(float x, float y);

    /**
     * [@function] MTLCoordinate2DMake
     * 
     * Convenience function to create a 2D coordinate from 2 values.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MTLSamplePosition MTLCoordinate2DMake(float x, float y);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MTLTextureSwizzleChannels MTLTextureSwizzleChannelsMake(byte r, byte g, byte b, byte a);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MTLIndirectCommandBufferExecutionRange MTLIndirectCommandBufferExecutionRangeMake(int location,
            int length);

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCaptureErrorDomain();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterTimestamp();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterTessellationInputPatches();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterVertexInvocations();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterPostTessellationVertexInvocations();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterClipperInvocations();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterClipperPrimitivesOut();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterFragmentInvocations();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterFragmentsPassed();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterComputeKernelInvocations();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterTotalCycles();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterVertexCycles();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterTessellationCycles();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterPostTessellationVertexCycles();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterFragmentCycles();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterRenderTargetWriteCycles();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterSetTimestamp();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterSetStageUtilization();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommonCounterSetStatistic();

    /**
     * [@constant] MTLCounterErrorDomain
     * 
     * NSErrors raised when creating a counter sample buffer.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCounterErrorDomain();

    /**
     * Key in the userInfo for MTLCommandBufferError NSErrors. Value is an NSArray of MTLCommandBufferEncoderInfo
     * objects in recorded order if an appropriate MTLCommandBufferErrorOption was set, otherwise the key will not exist
     * in the userInfo dictionary.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLCommandBufferEncoderInfoErrorKey();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLDynamicLibraryDomain();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLBinaryArchiveDomain();

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MTLPackedFloat3 MTLPackedFloat3Make(float x, float y, float z);

    /**
     * [@function] MTLIOCompressionContextDefaultChunkSize
     * 
     * The default chunk size to use for a compression context.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long MTLIOCompressionContextDefaultChunkSize();

    /**
     * [@function] MTLIOCreateCompressionContext
     * 
     * used to create a context that writes a stream of data to
     * a path using a given codec and chunk size.
     * 
     * An invalid type will cause a nil to be returned. If path is
     * invalid or fails to open a nil will be returned and errno will be set.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native VoidPtr MTLIOCreateCompressionContext(
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path,
            @NInt long type, @NUInt long chunkSize);

    /**
     * [@function] MTLIOCompressionContextAppendData
     * 
     * append data to a compression context.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native void MTLIOCompressionContextAppendData(@NotNull VoidPtr context, @NotNull ConstVoidPtr data,
            @NUInt long size);

    /**
     * [@function] MTLIOFlushAndDestroyCompressionContext
     * 
     * close the compression context and write the pack file.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long MTLIOFlushAndDestroyCompressionContext(@NotNull VoidPtr context);

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTLIOErrorDomain();

    @Generated public static final double MTLResourceCPUCacheModeShift = 0.0;
    @Generated public static final double MTLResourceStorageModeShift = 4.0;
    @Generated public static final double MTLResourceHazardTrackingModeShift = 8.0;
}
