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

package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.metal.protocol.MTLBuffer;
import apple.metal.protocol.MTLRasterizationRateMap;
import apple.metal.struct.MTLSamplePosition;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MTLRenderPassDescriptor
 * 
 * MTLRenderPassDescriptor represents a collection of attachments to be used to create a concrete render command encoder
 * 
 * API-Since: 8.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLRenderPassDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLRenderPassDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLRenderPassDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTLRenderPassDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MTLRenderPassDescriptor new_objc();

    /**
     * renderPassDescriptor
     * 
     * Create an autoreleased default frame buffer descriptor
     */
    @NotNull
    @Generated
    @Selector("renderPassDescriptor")
    public static native MTLRenderPassDescriptor renderPassDescriptor();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @NotNull
    @Generated
    @Selector("colorAttachments")
    public native MTLRenderPassColorAttachmentDescriptorArray colorAttachments();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("depthAttachment")
    public native MTLRenderPassDepthAttachmentDescriptor depthAttachment();

    @Generated
    @Selector("init")
    public native MTLRenderPassDescriptor init();

    @Generated
    @Selector("setDepthAttachment:")
    public native void setDepthAttachment(MTLRenderPassDepthAttachmentDescriptor value);

    @Generated
    @Selector("setStencilAttachment:")
    public native void setStencilAttachment(MTLRenderPassStencilAttachmentDescriptor value);

    /**
     * [@property] visibilityResultBuffer:
     * 
     * Buffer into which samples passing the depth and stencil tests are counted.
     */
    @Generated
    @Selector("setVisibilityResultBuffer:")
    public native void setVisibilityResultBuffer(@Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer value);

    @Generated
    @Selector("stencilAttachment")
    public native MTLRenderPassStencilAttachmentDescriptor stencilAttachment();

    /**
     * [@property] visibilityResultBuffer:
     * 
     * Buffer into which samples passing the depth and stencil tests are counted.
     */
    @Nullable
    @Generated
    @Selector("visibilityResultBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer visibilityResultBuffer();

    /**
     * [@property] defaultRasterSampleCount:
     * 
     * The raster sample count for the render pass when no attachments are given.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("defaultRasterSampleCount")
    @NUInt
    public native long defaultRasterSampleCount();

    /**
     * getSamplePositions:count:
     * 
     * Retrieve the previously configured custom sample positions. The positions input array will only be modified when
     * count specifies a length sufficient for the number of previously configured positions.
     * 
     * @param positions The destination array for custom sample position data.
     * @param count     Specifies the length of the positions array, which must be large enough to hold all configured
     *                  sample positions.
     * @return The number of previously configured custom sample positions.
     * 
     *         API-Since: 11.0
     */
    @Generated
    @Selector("getSamplePositions:count:")
    @NUInt
    public native long getSamplePositionsCount(
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") MTLSamplePosition positions,
            @NUInt long count);

    /**
     * [@property] imageblockSampleLength:
     * 
     * The per sample size in bytes of the largest explicit imageblock layout in the renderPass.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("imageblockSampleLength")
    @NUInt
    public native long imageblockSampleLength();

    /**
     * [@property] renderTargetHeight:
     * 
     * The height in pixels to constrain the render target to.
     * 
     * Defaults to 0. If non-zero the value must be smaller than or equal to the minimum height of all attachments.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("renderTargetHeight")
    @NUInt
    public native long renderTargetHeight();

    /**
     * [@property] renderTargetWidth:
     * 
     * The width in pixels to constrain the render target to.
     * 
     * Defaults to 0. If non-zero the value must be smaller than or equal to the minimum width of all attachments.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("renderTargetWidth")
    @NUInt
    public native long renderTargetWidth();

    /**
     * [@property] defaultRasterSampleCount:
     * 
     * The raster sample count for the render pass when no attachments are given.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setDefaultRasterSampleCount:")
    public native void setDefaultRasterSampleCount(@NUInt long value);

    /**
     * [@property] imageblockSampleLength:
     * 
     * The per sample size in bytes of the largest explicit imageblock layout in the renderPass.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setImageblockSampleLength:")
    public native void setImageblockSampleLength(@NUInt long value);

    /**
     * [@property] renderTargetHeight:
     * 
     * The height in pixels to constrain the render target to.
     * 
     * Defaults to 0. If non-zero the value must be smaller than or equal to the minimum height of all attachments.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setRenderTargetHeight:")
    public native void setRenderTargetHeight(@NUInt long value);

    /**
     * [@property] renderTargetWidth:
     * 
     * The width in pixels to constrain the render target to.
     * 
     * Defaults to 0. If non-zero the value must be smaller than or equal to the minimum width of all attachments.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setRenderTargetWidth:")
    public native void setRenderTargetWidth(@NUInt long value);

    /**
     * setSamplePositions:count:
     * 
     * Configure the custom sample positions, to be used in MSAA rendering (i.e. when sample count > 1).
     * 
     * @param positions The source array for custom sample position data.
     * @param count     Specifies the length of the positions array, and must be a valid sample count or 0 (to disable
     *                  custom sample positions).
     * 
     *                  API-Since: 11.0
     */
    @Generated
    @Selector("setSamplePositions:count:")
    public native void setSamplePositionsCount(
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") MTLSamplePosition positions,
            @NUInt long count);

    /**
     * [@property] threadgroupMemoryLength:
     * 
     * The per tile size in bytes of the persistent threadgroup memory allocation.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setThreadgroupMemoryLength:")
    public native void setThreadgroupMemoryLength(@NUInt long value);

    /**
     * [@property] tileHeight:
     * 
     * The height in pixels of the tile.
     * 
     * Defaults to 0. Zero means Metal chooses a height that fits within the local memory.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setTileHeight:")
    public native void setTileHeight(@NUInt long value);

    /**
     * [@property] tileWidth:
     * 
     * The width in pixels of the tile.
     * 
     * Defaults to 0. Zero means Metal chooses a width that fits within the local memory.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setTileWidth:")
    public native void setTileWidth(@NUInt long value);

    /**
     * [@property] threadgroupMemoryLength:
     * 
     * The per tile size in bytes of the persistent threadgroup memory allocation.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("threadgroupMemoryLength")
    @NUInt
    public native long threadgroupMemoryLength();

    /**
     * [@property] tileHeight:
     * 
     * The height in pixels of the tile.
     * 
     * Defaults to 0. Zero means Metal chooses a height that fits within the local memory.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("tileHeight")
    @NUInt
    public native long tileHeight();

    /**
     * [@property] tileWidth:
     * 
     * The width in pixels of the tile.
     * 
     * Defaults to 0. Zero means Metal chooses a width that fits within the local memory.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("tileWidth")
    @NUInt
    public native long tileWidth();

    /**
     * [@property] rasterizationRateMap
     * 
     * The variable rasterization rate map to use when rendering this pass, or nil to not use variable rasterization
     * rate.
     * 
     * The default value is nil. Enabling variable rasterization rate allows for decreasing the rasterization rate in
     * unimportant regions of screen space.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("rasterizationRateMap")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLRasterizationRateMap rasterizationRateMap();

    /**
     * [@property] renderTargetArrayLength:
     * 
     * The number of active layers
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("renderTargetArrayLength")
    @NUInt
    public native long renderTargetArrayLength();

    /**
     * [@property] rasterizationRateMap
     * 
     * The variable rasterization rate map to use when rendering this pass, or nil to not use variable rasterization
     * rate.
     * 
     * The default value is nil. Enabling variable rasterization rate allows for decreasing the rasterization rate in
     * unimportant regions of screen space.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setRasterizationRateMap:")
    public native void setRasterizationRateMap(@Nullable @Mapped(ObjCObjectMapper.class) MTLRasterizationRateMap value);

    /**
     * [@property] renderTargetArrayLength:
     * 
     * The number of active layers
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setRenderTargetArrayLength:")
    public native void setRenderTargetArrayLength(@NUInt long value);

    /**
     * [@property] sampleBufferAttachments
     * 
     * An array of sample buffers and associated sample indices.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("sampleBufferAttachments")
    public native MTLRenderPassSampleBufferAttachmentDescriptorArray sampleBufferAttachments();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
