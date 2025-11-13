package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.metal.protocol.MTLBuffer;
import apple.metal.protocol.MTLRasterizationRateMap;
import apple.metal.struct.MTLSamplePosition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * Describes a render pass.
 * 
 * You use render pass descriptors to create instances of ``MTL4RenderCommandEncoder`` and encode draw
 * commands into instances of ``MTL4CommandBuffer``.
 * 
 * To create render command encoders, you typically call ``MTL4CommandBuffer/renderCommandEncoderWithDescriptor:``.
 * The ``MTL4CommandBuffer/renderCommandEncoderWithDescriptor:options:`` variant of this method allows you to specify
 * additional options to encode a render pass in parallel from multiple CPU cores by creating *suspending* and
 * *resuming*
 * render passes.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTL4RenderPassDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTL4RenderPassDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTL4RenderPassDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTL4RenderPassDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    /**
     * Accesses the array of state information for render attachments that store color data.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("colorAttachments")
    @NotNull
    public native MTLRenderPassColorAttachmentDescriptorArray colorAttachments();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Sets the default raster sample count for the render pass when it references no attachments.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("defaultRasterSampleCount")
    @NUInt
    public native long defaultRasterSampleCount();

    /**
     * Accesses state information for a render attachment that stores depth data.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("depthAttachment")
    public native MTLRenderPassDepthAttachmentDescriptor depthAttachment();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Retrieves the previously-configured custom sample positions.
     * 
     * This method stores the app's last set custom sample positions into an output array. Metal only modifies the array
     * when the `count` parameter consists of a length sufficient to store the number of sample positions.
     * 
     * - Parameters:
     * - positions: The destination array where Metal stores ``MTLSamplePosition`` instances.
     * - count: Number of ``MTLSamplePosition`` instances in the array. This array
     * needs to be large enough to store all sample positions.
     * 
     * - Returns: The number of previously-configured custom sample positions.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("getSamplePositions:count:")
    @NUInt
    public native long getSamplePositionsCount(
            @UncertainArgument("Options: reference, array Fallback: reference") @Nullable MTLSamplePosition positions,
            @NUInt long count);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Assigns the per-sample size, in bytes, of the largest explicit imageblock layout in the render pass.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("imageblockSampleLength")
    @NUInt
    public native long imageblockSampleLength();

    @Generated
    @Selector("init")
    public native MTL4RenderPassDescriptor init();

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MTL4RenderPassDescriptor new_objc();

    /**
     * Assigns an optional variable rasterization rate map that Metal uses in the render pass.
     * 
     * Enabling variable rasterization rate allows Metal to decrease the rasterization rate, typically in unimportant
     * regions of color attachments, to accelerate processing.
     * 
     * When set to `nil`, the default, Metal doesn't use variable rasterization rate.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("rasterizationRateMap")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MTLRasterizationRateMap rasterizationRateMap();

    /**
     * Assigns the number of layers that all attachments this descriptor references have.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("renderTargetArrayLength")
    @NUInt
    public native long renderTargetArrayLength();

    /**
     * Sets the height, in pixels, to which Metal constrains the render target.
     * 
     * When this value is non-zero, you need to assign it to be smaller than or equal to the minimum height of all
     * attachments.
     * 
     * The default value of this property is `0`.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("renderTargetHeight")
    @NUInt
    public native long renderTargetHeight();

    /**
     * Sets the width, in pixels, to which Metal constrains the render target.
     * 
     * When this value is non-zero, you need to assign it to be smaller than or equal to the minimum width of all
     * attachments.
     * 
     * The default value of this property is `0`.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("renderTargetWidth")
    @NUInt
    public native long renderTargetWidth();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Sets the default raster sample count for the render pass when it references no attachments.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDefaultRasterSampleCount:")
    public native void setDefaultRasterSampleCount(@NUInt long value);

    /**
     * Accesses state information for a render attachment that stores depth data.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDepthAttachment:")
    public native void setDepthAttachment(MTLRenderPassDepthAttachmentDescriptor value);

    /**
     * Assigns the per-sample size, in bytes, of the largest explicit imageblock layout in the render pass.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setImageblockSampleLength:")
    public native void setImageblockSampleLength(@NUInt long value);

    /**
     * Assigns an optional variable rasterization rate map that Metal uses in the render pass.
     * 
     * Enabling variable rasterization rate allows Metal to decrease the rasterization rate, typically in unimportant
     * regions of color attachments, to accelerate processing.
     * 
     * When set to `nil`, the default, Metal doesn't use variable rasterization rate.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRasterizationRateMap:")
    public native void setRasterizationRateMap(@Mapped(ObjCObjectMapper.class) @Nullable MTLRasterizationRateMap value);

    /**
     * Assigns the number of layers that all attachments this descriptor references have.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRenderTargetArrayLength:")
    public native void setRenderTargetArrayLength(@NUInt long value);

    /**
     * Sets the height, in pixels, to which Metal constrains the render target.
     * 
     * When this value is non-zero, you need to assign it to be smaller than or equal to the minimum height of all
     * attachments.
     * 
     * The default value of this property is `0`.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRenderTargetHeight:")
    public native void setRenderTargetHeight(@NUInt long value);

    /**
     * Sets the width, in pixels, to which Metal constrains the render target.
     * 
     * When this value is non-zero, you need to assign it to be smaller than or equal to the minimum width of all
     * attachments.
     * 
     * The default value of this property is `0`.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRenderTargetWidth:")
    public native void setRenderTargetWidth(@NUInt long value);

    /**
     * Configures the custom sample positions to use in MSAA rendering.
     * 
     * - Parameters:
     * - positions: Array of ``MTLSamplePosition`` instances.
     * - count: Number of ``MTLSamplePosition`` instances in the array. This value
     * needs to be a valid sample count, or `0` to disable custom sample positions.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSamplePositions:count:")
    public native void setSamplePositionsCount(
            @UncertainArgument("Options: reference, array Fallback: reference") @Nullable MTLSamplePosition positions,
            @NUInt long count);

    /**
     * Accesses state information for a render attachment that stores stencil data.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setStencilAttachment:")
    public native void setStencilAttachment(MTLRenderPassStencilAttachmentDescriptor value);

    /**
     * Controls if the render pass supports color attachment mapping.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSupportColorAttachmentMapping:")
    public native void setSupportColorAttachmentMapping(boolean value);

    /**
     * Assigns the per-tile size, in bytes, of the persistent threadgroup memory allocation of this render pass.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setThreadgroupMemoryLength:")
    public native void setThreadgroupMemoryLength(@NUInt long value);

    /**
     * The height of the tiles, in pixels, a render pass you create with this descriptor applies to its attachments.
     * 
     * For tile-based rendering, Metal divides each render attachment into smaller regions, or _tiles_.
     * The property's default is `0`, which tells Metal to select a size that fits in tile memory.
     * 
     * See <doc:tailor-your-apps-for-apple-gpus-and-tile-based-deferred-rendering>
     * for more information about tiles, tile memory, and deferred rendering.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTileHeight:")
    public native void setTileHeight(@NUInt long value);

    /**
     * The width of the tiles, in pixels, a render pass you create with this descriptor applies to its attachments.
     * 
     * For tile-based rendering, Metal divides each render attachment into smaller regions, or _tiles_.
     * The property's default is `0`, which tells Metal to select a size that fits in tile memory.
     * 
     * See <doc:tailor-your-apps-for-apple-gpus-and-tile-based-deferred-rendering>
     * for more information about tiles, tile memory, and deferred rendering.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTileWidth:")
    public native void setTileWidth(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Configures a buffer into which Metal writes counts of fragments (pixels) passing the depth and stencil tests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setVisibilityResultBuffer:")
    public native void setVisibilityResultBuffer(@Mapped(ObjCObjectMapper.class) @Nullable MTLBuffer value);

    /**
     * Determines if Metal accumulates visibility results between render encoders or resets them.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setVisibilityResultType:")
    public native void setVisibilityResultType(@NInt long value);

    /**
     * Accesses state information for a render attachment that stores stencil data.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("stencilAttachment")
    public native MTLRenderPassStencilAttachmentDescriptor stencilAttachment();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Controls if the render pass supports color attachment mapping.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportColorAttachmentMapping")
    public native boolean supportColorAttachmentMapping();

    /**
     * Assigns the per-tile size, in bytes, of the persistent threadgroup memory allocation of this render pass.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("threadgroupMemoryLength")
    @NUInt
    public native long threadgroupMemoryLength();

    /**
     * The height of the tiles, in pixels, a render pass you create with this descriptor applies to its attachments.
     * 
     * For tile-based rendering, Metal divides each render attachment into smaller regions, or _tiles_.
     * The property's default is `0`, which tells Metal to select a size that fits in tile memory.
     * 
     * See <doc:tailor-your-apps-for-apple-gpus-and-tile-based-deferred-rendering>
     * for more information about tiles, tile memory, and deferred rendering.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("tileHeight")
    @NUInt
    public native long tileHeight();

    /**
     * The width of the tiles, in pixels, a render pass you create with this descriptor applies to its attachments.
     * 
     * For tile-based rendering, Metal divides each render attachment into smaller regions, or _tiles_.
     * The property's default is `0`, which tells Metal to select a size that fits in tile memory.
     * 
     * See <doc:tailor-your-apps-for-apple-gpus-and-tile-based-deferred-rendering>
     * for more information about tiles, tile memory, and deferred rendering.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("tileWidth")
    @NUInt
    public native long tileWidth();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Configures a buffer into which Metal writes counts of fragments (pixels) passing the depth and stencil tests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("visibilityResultBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MTLBuffer visibilityResultBuffer();

    /**
     * Determines if Metal accumulates visibility results between render encoders or resets them.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("visibilityResultType")
    @NInt
    public native long visibilityResultType();
}