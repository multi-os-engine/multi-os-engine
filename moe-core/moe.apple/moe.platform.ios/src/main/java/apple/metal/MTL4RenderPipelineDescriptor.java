package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
 * Groups together properties to create a render pipeline state object.
 * 
 * Compared to ``MTLRenderPipelineDescriptor``, this interface doesn't offer a mechanism to hint to Metal mutability of
 * vertex and fragment buffers. Additionally, using this descriptor, you don't specify binary archives.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTL4RenderPipelineDescriptor extends MTL4PipelineDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MTL4RenderPipelineDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTL4RenderPipelineDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTL4RenderPipelineDescriptor allocWithZone(VoidPtr zone);

    /**
     * Indicates whether to read and use the alpha channel fragment output of color attachments to compute a sample
     * coverage mask.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("alphaToCoverageState")
    @NInt
    public native long alphaToCoverageState();

    /**
     * Indicates whether the pipeline forces alpha channel values of color attachments to the largest representable
     * value.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("alphaToOneState")
    @NInt
    public native long alphaToOneState();

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
     * Configures a logical-to-physical rendering remap state.
     * 
     * Use this property to assign how a ``MTL4RenderCommandEncoder`` instance maps the output of your fragment shader
     * to
     * physical color attachments.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("colorAttachmentMappingState")
    @NInt
    public native long colorAttachmentMappingState();

    /**
     * Accesses an array containing descriptions of the color attachments this pipeline writes to.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("colorAttachments")
    @NotNull
    public native MTL4RenderPipelineColorAttachmentDescriptorArray colorAttachments();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Assigns the shader function that this pipeline executes for each fragment.
     * 
     * When you don't specify a fragment function, you need to disable rasterization by setting property
     * ``rasterizationEnabled`` to false.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("fragmentFunctionDescriptor")
    @Nullable
    public native MTL4FunctionDescriptor fragmentFunctionDescriptor();

    /**
     * Provides static linking information for the fragment stage of the render pipeline.
     * 
     * Use this property to link extra shader functions to the fragment stage of the render pipeline.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("fragmentStaticLinkingDescriptor")
    public native MTL4StaticLinkingDescriptor fragmentStaticLinkingDescriptor();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTL4RenderPipelineDescriptor init();

    /**
     * Assigns type of primitive topology this pipeline renders.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("inputPrimitiveTopology")
    @NUInt
    public native long inputPrimitiveTopology();

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

    /**
     * Determines whether the pipeline rasterizes primitives.
     * 
     * By default, this value is <doc://com.apple.documentation/documentation/swift/true>, specifying that this pipeline
     * rasterizes primitives. Set this property to <doc://com.apple.documentation/documentation/swift/false> when you
     * don't provide a fragment shader function via function ``fragmentFunctionDescriptor``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isRasterizationEnabled")
    public native boolean isRasterizationEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Determines the maximum value that can you can pass as the pipeline's amplification count.
     * 
     * This property controls the maximum count you pass to
     * ``MTL4RenderCommandEncoder/setVertexAmplificationCount:viewMappings:``
     * when using vertex amplification with this pipeline.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("maxVertexAmplificationCount")
    @NUInt
    public native long maxVertexAmplificationCount();

    @Generated
    @Owned
    @Selector("new")
    public static native MTL4RenderPipelineDescriptor new_objc();

    /**
     * Controls the number of samples this pipeline applies for each fragment.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("rasterSampleCount")
    @NUInt
    public native long rasterSampleCount();

    /**
     * Resets this descriptor to its default state.
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
     * Indicates whether to read and use the alpha channel fragment output of color attachments to compute a sample
     * coverage mask.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setAlphaToCoverageState:")
    public native void setAlphaToCoverageState(@NInt long value);

    /**
     * Indicates whether the pipeline forces alpha channel values of color attachments to the largest representable
     * value.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setAlphaToOneState:")
    public native void setAlphaToOneState(@NInt long value);

    /**
     * Configures a logical-to-physical rendering remap state.
     * 
     * Use this property to assign how a ``MTL4RenderCommandEncoder`` instance maps the output of your fragment shader
     * to
     * physical color attachments.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setColorAttachmentMappingState:")
    public native void setColorAttachmentMappingState(@NInt long value);

    /**
     * Assigns the shader function that this pipeline executes for each fragment.
     * 
     * When you don't specify a fragment function, you need to disable rasterization by setting property
     * ``rasterizationEnabled`` to false.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setFragmentFunctionDescriptor:")
    public native void setFragmentFunctionDescriptor(@Nullable MTL4FunctionDescriptor value);

    /**
     * Provides static linking information for the fragment stage of the render pipeline.
     * 
     * Use this property to link extra shader functions to the fragment stage of the render pipeline.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setFragmentStaticLinkingDescriptor:")
    public native void setFragmentStaticLinkingDescriptor(MTL4StaticLinkingDescriptor value);

    /**
     * Assigns type of primitive topology this pipeline renders.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setInputPrimitiveTopology:")
    public native void setInputPrimitiveTopology(@NUInt long value);

    /**
     * Determines the maximum value that can you can pass as the pipeline's amplification count.
     * 
     * This property controls the maximum count you pass to
     * ``MTL4RenderCommandEncoder/setVertexAmplificationCount:viewMappings:``
     * when using vertex amplification with this pipeline.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMaxVertexAmplificationCount:")
    public native void setMaxVertexAmplificationCount(@NUInt long value);

    /**
     * Controls the number of samples this pipeline applies for each fragment.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRasterSampleCount:")
    public native void setRasterSampleCount(@NUInt long value);

    /**
     * Determines whether the pipeline rasterizes primitives.
     * 
     * By default, this value is <doc://com.apple.documentation/documentation/swift/true>, specifying that this pipeline
     * rasterizes primitives. Set this property to <doc://com.apple.documentation/documentation/swift/false> when you
     * don't provide a fragment shader function via function ``fragmentFunctionDescriptor``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRasterizationEnabled:")
    public native void setRasterizationEnabled(boolean value);

    /**
     * Indicates whether you can use the pipeline to create new pipelines by
     * adding binary functions to the fragment shader function’s callable functions list.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSupportFragmentBinaryLinking:")
    public native void setSupportFragmentBinaryLinking(boolean value);

    /**
     * Indicates whether the pipeline supports indirect command buffers.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSupportIndirectCommandBuffers:")
    public native void setSupportIndirectCommandBuffers(@NInt long value);

    /**
     * Indicates whether you can use the render pipeline to create new pipelines by
     * adding binary functions to the vertex shader function’s callable functions list.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSupportVertexBinaryLinking:")
    public native void setSupportVertexBinaryLinking(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Configures an optional vertex descriptor for the vertex input.
     * 
     * A vertex descriptor specifies the layout of your vertex data, allowing your vertex shaders to access the content
     * in your vertex arrays via the `[[stage_in]]` attribute in Metal Shading Language.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setVertexDescriptor:")
    public native void setVertexDescriptor(@Nullable MTLVertexDescriptor value);

    /**
     * Assigns the shader function that this pipeline executes for each vertex.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setVertexFunctionDescriptor:")
    public native void setVertexFunctionDescriptor(@Nullable MTL4FunctionDescriptor value);

    /**
     * Provides static linking information for the vertex stage of the render pipeline.
     * 
     * Use this property to link extra shader functions to the vertex stage of the render pipeline.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setVertexStaticLinkingDescriptor:")
    public native void setVertexStaticLinkingDescriptor(MTL4StaticLinkingDescriptor value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Indicates whether you can use the pipeline to create new pipelines by
     * adding binary functions to the fragment shader function’s callable functions list.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportFragmentBinaryLinking")
    public native boolean supportFragmentBinaryLinking();

    /**
     * Indicates whether the pipeline supports indirect command buffers.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportIndirectCommandBuffers")
    @NInt
    public native long supportIndirectCommandBuffers();

    /**
     * Indicates whether you can use the render pipeline to create new pipelines by
     * adding binary functions to the vertex shader function’s callable functions list.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportVertexBinaryLinking")
    public native boolean supportVertexBinaryLinking();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Configures an optional vertex descriptor for the vertex input.
     * 
     * A vertex descriptor specifies the layout of your vertex data, allowing your vertex shaders to access the content
     * in your vertex arrays via the `[[stage_in]]` attribute in Metal Shading Language.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("vertexDescriptor")
    @Nullable
    public native MTLVertexDescriptor vertexDescriptor();

    /**
     * Assigns the shader function that this pipeline executes for each vertex.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("vertexFunctionDescriptor")
    @Nullable
    public native MTL4FunctionDescriptor vertexFunctionDescriptor();

    /**
     * Provides static linking information for the vertex stage of the render pipeline.
     * 
     * Use this property to link extra shader functions to the vertex stage of the render pipeline.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("vertexStaticLinkingDescriptor")
    public native MTL4StaticLinkingDescriptor vertexStaticLinkingDescriptor();
}