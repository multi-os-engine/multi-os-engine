package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.struct.MTLSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Groups together properties you use to create a tile render pipeline state object.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTL4TileRenderPipelineDescriptor extends MTL4PipelineDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MTL4TileRenderPipelineDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTL4TileRenderPipelineDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTL4TileRenderPipelineDescriptor allocWithZone(VoidPtr zone);

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
     * Access an array of descriptors that configure the properties of each color attachment in the tile render
     * pipeline.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("colorAttachments")
    @NotNull
    public native MTLTileRenderPipelineColorAttachmentDescriptorArray colorAttachments();

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
    @Selector("init")
    public native MTL4TileRenderPipelineDescriptor init();

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

    /**
     * Sets the maximum number of threads that the GPU can execute simultaneously within a single threadgroup in
     * the tile render pipeline.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("maxTotalThreadsPerThreadgroup")
    @NUInt
    public native long maxTotalThreadsPerThreadgroup();

    @Generated
    @Owned
    @Selector("new")
    public static native MTL4TileRenderPipelineDescriptor new_objc();

    /**
     * Configures the number of samples per pixel used for multisampling.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("rasterSampleCount")
    @NUInt
    public native long rasterSampleCount();

    /**
     * Sets the required number of threads per threadgroup for tile dispatches.
     * 
     * This value is typically optional, except in the cases where the tile function that ``tileFunctionDescriptor``
     * references uses `CooperativeTensors`. In this case, you need to provide a non-zero value to this property.
     * 
     * Additionally, when you set this value, the `threadsPerTile` argument of any tile dispatch needs to match it.
     * 
     * Setting this value to a size of 0 in every dimension disables this property.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("requiredThreadsPerThreadgroup")
    @ByValue
    public native MTLSize requiredThreadsPerThreadgroup();

    /**
     * Resets the descriptor to the default state.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("reset")
    public native void reset();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Sets the maximum number of threads that the GPU can execute simultaneously within a single threadgroup in
     * the tile render pipeline.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMaxTotalThreadsPerThreadgroup:")
    public native void setMaxTotalThreadsPerThreadgroup(@NUInt long value);

    /**
     * Configures the number of samples per pixel used for multisampling.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRasterSampleCount:")
    public native void setRasterSampleCount(@NUInt long value);

    /**
     * Sets the required number of threads per threadgroup for tile dispatches.
     * 
     * This value is typically optional, except in the cases where the tile function that ``tileFunctionDescriptor``
     * references uses `CooperativeTensors`. In this case, you need to provide a non-zero value to this property.
     * 
     * Additionally, when you set this value, the `threadsPerTile` argument of any tile dispatch needs to match it.
     * 
     * Setting this value to a size of 0 in every dimension disables this property.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRequiredThreadsPerThreadgroup:")
    public native void setRequiredThreadsPerThreadgroup(@ByValue MTLSize value);

    /**
     * Configures an object that contains information about functions to link to the tile render pipeline
     * when Metal builds it.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setStaticLinkingDescriptor:")
    public native void setStaticLinkingDescriptor(MTL4StaticLinkingDescriptor value);

    /**
     * Indicates whether the pipeline supports linking binary functions.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSupportBinaryLinking:")
    public native void setSupportBinaryLinking(boolean value);

    /**
     * Indicating whether the size of the threadgroup matches the size of a tile in the render pipeline.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setThreadgroupSizeMatchesTileSize:")
    public native void setThreadgroupSizeMatchesTileSize(boolean value);

    /**
     * Configures the tile function that the render pipeline executes for each tile in the tile shader stage.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTileFunctionDescriptor:")
    public native void setTileFunctionDescriptor(@Nullable MTL4FunctionDescriptor value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Configures an object that contains information about functions to link to the tile render pipeline
     * when Metal builds it.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("staticLinkingDescriptor")
    public native MTL4StaticLinkingDescriptor staticLinkingDescriptor();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Indicates whether the pipeline supports linking binary functions.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportBinaryLinking")
    public native boolean supportBinaryLinking();

    /**
     * Indicating whether the size of the threadgroup matches the size of a tile in the render pipeline.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("threadgroupSizeMatchesTileSize")
    public native boolean threadgroupSizeMatchesTileSize();

    /**
     * Configures the tile function that the render pipeline executes for each tile in the tile shader stage.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("tileFunctionDescriptor")
    @Nullable
    public native MTL4FunctionDescriptor tileFunctionDescriptor();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}