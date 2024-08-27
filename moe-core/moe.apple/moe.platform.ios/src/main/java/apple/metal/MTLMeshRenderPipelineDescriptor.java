package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.metal.protocol.MTLFunction;
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
 * MTLMeshRenderPipelineDescriptor
 * 
 * As an alternative to a vertex + fragment shader render pipeline, this render pipeline uses a (object +) mesh +
 * fragment shader for rendering geometry.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLMeshRenderPipelineDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLMeshRenderPipelineDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLMeshRenderPipelineDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTLMeshRenderPipelineDescriptor allocWithZone(VoidPtr zone);

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

    /**
     * [@property] colorAttachments
     * 
     * Describes the color attachments of the render pass in which this pipeline will be used.
     */
    @NotNull
    @Generated
    @Selector("colorAttachments")
    public native MTLRenderPipelineColorAttachmentDescriptorArray colorAttachments();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * [@property] depthAttachmentPixelFormat
     * 
     * The pixel format of the depth attachment of the render pass in which this pipeline will be used.
     * 
     * The default value is MTLPixelFormatInvalid; indicating no depth attachment will be used.
     */
    @Generated
    @Selector("depthAttachmentPixelFormat")
    @NUInt
    public native long depthAttachmentPixelFormat();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] fragmentBuffers
     * 
     * Provide mutability information on the buffers used by fragmentFunction.
     * 
     * Specifying these values is optional; it may be used to optimize the shader code.
     */
    @NotNull
    @Generated
    @Selector("fragmentBuffers")
    public native MTLPipelineBufferDescriptorArray fragmentBuffers();

    /**
     * [@property] fragmentFunction
     * 
     * Like a classical render pipeline, this fragments covered by the rasterized geometry are shaded with this
     * function.
     * The default value is nil. To create a pipeline, you must either set fragmentFunction to non-nil, or set
     * rasterizationEnabled to NO.
     */
    @Nullable
    @Generated
    @Selector("fragmentFunction")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLFunction fragmentFunction();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTLMeshRenderPipelineDescriptor init();

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
     * [@property] alphaToCoverageEnabled
     * 
     * Whether the alpha value exported by the fragment shader for the first color attachment is converted to a sample
     * mask, which is subsequently AND-ed with the fragments' sample mask
     * 
     * The default value is NO.
     */
    @Generated
    @Selector("isAlphaToCoverageEnabled")
    public native boolean isAlphaToCoverageEnabled();

    /**
     * [@property] alphaToOneEnabled
     * 
     * Whether the alpha value exported by the fragment shader for all color attachments is modified to 1 (after
     * evaluating alphaToCoverage).
     * 
     * The default value is NO.
     */
    @Generated
    @Selector("isAlphaToOneEnabled")
    public native boolean isAlphaToOneEnabled();

    /**
     * [@property] rasterizationEnabled
     * 
     * Whether rasterization is disabled, all primitives are dropped prior to rasterization.
     * 
     * The default value is YES.
     */
    @Generated
    @Selector("isRasterizationEnabled")
    public native boolean isRasterizationEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] label
     * 
     * A name or description provided by the application that will be displayed in debugging tools.
     * The default value is nil.
     */
    @Nullable
    @Generated
    @Selector("label")
    public native String label();

    /**
     * [@property] maxTotalThreadgroupsPerMeshGrid
     * 
     * The maximum value of the product of vector elements that the object shader may pass to the
     * mesh_grid_properties::set_threadgroups_per_grid built-in function.
     * The default value is 0, which means that the value specified with the [[max_total_threadgroups_per_mesh_grid(N)]]
     * specified on objectFunction will be used.
     * When both the [[max_total_threadgroups_per_mesh_grid(N)]] attribute and a non-zero value are specified, both
     * values must match.
     * Any value specified cannot exceed the device limit as documented in the "Metal Feature Set Tables" for "Maximum
     * threadgroups per mesh grid".
     * Specifying this value is optional; it may be used to improve scheduling of the workload. If neither this value
     * nor the shader attribute are used, the device's maximum supported value is used instead.
     */
    @Generated
    @Selector("maxTotalThreadgroupsPerMeshGrid")
    @NUInt
    public native long maxTotalThreadgroupsPerMeshGrid();

    /**
     * [@property] maxTotalThreadsPerMeshThreadgroup
     * 
     * The maximum size of the product of threadsPerMeshThreadgroup that can be used for draws with this pipeline.
     * This information can be used by the optimizer to generate more efficient code, specifically when the specified
     * value does not exceed the thread execution width of the underlying GPU.
     * The default value is 0, which means that the value specified with the [[max_total_threads_per_threadgroup(N)]]
     * specified on meshFunction will be used.
     * When both the [[max_total_threads_per_threadgroup(N)]] attribute and a non-zero value are specified, both values
     * must match.
     * Any value specified cannot exceed the device limit as documented in the "Metal Feature Set Tables" for "Maximum
     * threads per threadgroup".
     */
    @Generated
    @Selector("maxTotalThreadsPerMeshThreadgroup")
    @NUInt
    public native long maxTotalThreadsPerMeshThreadgroup();

    /**
     * [@property] maxTotalThreadsPerObjectThreadgroup
     * 
     * The maximum size of the product of threadsPerObjectThreadgroup that can be used for draws with this pipeline.
     * This information can be used by the optimizer to generate more efficient code, specifically when the specified
     * value does not exceed the thread execution width of the underlying GPU.
     * The default value is 0, which means that the value specified with the [[max_total_threads_per_threadgroup(N)]]
     * specified on objectFunction will be used.
     * When both the [[max_total_threads_per_threadgroup(N)]] attribute and a non-zero value are specified, both values
     * must match.
     * Any value specified cannot exceed the device limit as documented in the "Metal Feature Set Tables" for "Maximum
     * threads per threadgroup".
     */
    @Generated
    @Selector("maxTotalThreadsPerObjectThreadgroup")
    @NUInt
    public native long maxTotalThreadsPerObjectThreadgroup();

    /**
     * [@property] maxVertexAmplificationCount
     * 
     * The maximum value that can be passed to setVertexAmplificationCount when using this pipeline.
     * 
     * The default value is 1. The value must be supported by the device, which can be checked with
     * supportsVertexAmplificationCount.
     */
    @Generated
    @Selector("maxVertexAmplificationCount")
    @NUInt
    public native long maxVertexAmplificationCount();

    /**
     * [@property] meshBuffers
     * 
     * Provide mutability information on the buffers used by meshFunction.
     * 
     * Specifying these values is optional; it may be used to optimize the shader code.
     */
    @NotNull
    @Generated
    @Selector("meshBuffers")
    public native MTLPipelineBufferDescriptorArray meshBuffers();

    /**
     * [@property] meshFunction
     * 
     * Shader function responsible for exporting a chunk of geometry per threadgroup for the rasterizer.
     * The default value is nil.
     */
    @Nullable
    @Generated
    @Selector("meshFunction")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLFunction meshFunction();

    /**
     * [@property] meshThreadgroupSizeIsMultipleOfThreadExecutionWidth
     * 
     * Set this value to YES when you will only use draws with the product of threadsPerMeshThreadgroup set to a
     * multiple of the meshThreadExecutionWidth of the returned pipeline state.
     * This information can be used by the optimizer to generate more efficient code.
     * The default value is NO.
     */
    @Generated
    @Selector("meshThreadgroupSizeIsMultipleOfThreadExecutionWidth")
    public native boolean meshThreadgroupSizeIsMultipleOfThreadExecutionWidth();

    @Generated
    @Owned
    @Selector("new")
    public static native MTLMeshRenderPipelineDescriptor new_objc();

    /**
     * [@property] objectBuffers
     * 
     * Provide mutability information on the buffers used by objectFunction.
     * 
     * Specifying these values is optional; it may be used to optimize the shader code.
     */
    @NotNull
    @Generated
    @Selector("objectBuffers")
    public native MTLPipelineBufferDescriptorArray objectBuffers();

    /**
     * [@property] objectFunction
     * 
     * Optional shader function responsible for determining how many threadgroups of the mesh shader to run, can
     * optionally provide payload data for the mesh stage.
     * If this is nil, no payload data is available to the mesh function, and the draw command determines how many
     * threadgroups of the mesh stage to run.
     * The default value is nil.
     */
    @Nullable
    @Generated
    @Selector("objectFunction")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLFunction objectFunction();

    /**
     * [@property] objectThreadgroupSizeIsMultipleOfThreadExecutionWidth
     * 
     * Set this value to YES when you will only use draws with the product of threadsPerObjectThreadgroup set to a
     * multiple of the objectThreadExecutionWidth of the returned pipeline state.
     * This information can be used by the optimizer to generate more efficient code.
     * The default value is NO.
     */
    @Generated
    @Selector("objectThreadgroupSizeIsMultipleOfThreadExecutionWidth")
    public native boolean objectThreadgroupSizeIsMultipleOfThreadExecutionWidth();

    /**
     * [@property] payloadMemoryLength
     * 
     * The size, in bytes, of the buffer indicated by [[payload]] in the object and mesh shader.
     * If this value is 0, the size of the dereferenced type declared in the object shader for the buffer is used (space
     * for a single element is assumed for pointers).
     * The default value is 0.
     */
    @Generated
    @Selector("payloadMemoryLength")
    @NUInt
    public native long payloadMemoryLength();

    /**
     * [@property] rasterSampleCount
     * 
     * The number of samples per fragment of the render pass in which this pipeline will be used.
     */
    @Generated
    @Selector("rasterSampleCount")
    @NUInt
    public native long rasterSampleCount();

    /**
     * reset
     * 
     * Restore all mesh pipeline descriptor properties to their default values.
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
     * [@property] alphaToCoverageEnabled
     * 
     * Whether the alpha value exported by the fragment shader for the first color attachment is converted to a sample
     * mask, which is subsequently AND-ed with the fragments' sample mask
     * 
     * The default value is NO.
     */
    @Generated
    @Selector("setAlphaToCoverageEnabled:")
    public native void setAlphaToCoverageEnabled(boolean value);

    /**
     * [@property] alphaToOneEnabled
     * 
     * Whether the alpha value exported by the fragment shader for all color attachments is modified to 1 (after
     * evaluating alphaToCoverage).
     * 
     * The default value is NO.
     */
    @Generated
    @Selector("setAlphaToOneEnabled:")
    public native void setAlphaToOneEnabled(boolean value);

    /**
     * [@property] depthAttachmentPixelFormat
     * 
     * The pixel format of the depth attachment of the render pass in which this pipeline will be used.
     * 
     * The default value is MTLPixelFormatInvalid; indicating no depth attachment will be used.
     */
    @Generated
    @Selector("setDepthAttachmentPixelFormat:")
    public native void setDepthAttachmentPixelFormat(@NUInt long value);

    /**
     * [@property] fragmentFunction
     * 
     * Like a classical render pipeline, this fragments covered by the rasterized geometry are shaded with this
     * function.
     * The default value is nil. To create a pipeline, you must either set fragmentFunction to non-nil, or set
     * rasterizationEnabled to NO.
     */
    @Generated
    @Selector("setFragmentFunction:")
    public native void setFragmentFunction(@Nullable @Mapped(ObjCObjectMapper.class) MTLFunction value);

    /**
     * [@property] label
     * 
     * A name or description provided by the application that will be displayed in debugging tools.
     * The default value is nil.
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(@Nullable String value);

    /**
     * [@property] maxTotalThreadgroupsPerMeshGrid
     * 
     * The maximum value of the product of vector elements that the object shader may pass to the
     * mesh_grid_properties::set_threadgroups_per_grid built-in function.
     * The default value is 0, which means that the value specified with the [[max_total_threadgroups_per_mesh_grid(N)]]
     * specified on objectFunction will be used.
     * When both the [[max_total_threadgroups_per_mesh_grid(N)]] attribute and a non-zero value are specified, both
     * values must match.
     * Any value specified cannot exceed the device limit as documented in the "Metal Feature Set Tables" for "Maximum
     * threadgroups per mesh grid".
     * Specifying this value is optional; it may be used to improve scheduling of the workload. If neither this value
     * nor the shader attribute are used, the device's maximum supported value is used instead.
     */
    @Generated
    @Selector("setMaxTotalThreadgroupsPerMeshGrid:")
    public native void setMaxTotalThreadgroupsPerMeshGrid(@NUInt long value);

    /**
     * [@property] maxTotalThreadsPerMeshThreadgroup
     * 
     * The maximum size of the product of threadsPerMeshThreadgroup that can be used for draws with this pipeline.
     * This information can be used by the optimizer to generate more efficient code, specifically when the specified
     * value does not exceed the thread execution width of the underlying GPU.
     * The default value is 0, which means that the value specified with the [[max_total_threads_per_threadgroup(N)]]
     * specified on meshFunction will be used.
     * When both the [[max_total_threads_per_threadgroup(N)]] attribute and a non-zero value are specified, both values
     * must match.
     * Any value specified cannot exceed the device limit as documented in the "Metal Feature Set Tables" for "Maximum
     * threads per threadgroup".
     */
    @Generated
    @Selector("setMaxTotalThreadsPerMeshThreadgroup:")
    public native void setMaxTotalThreadsPerMeshThreadgroup(@NUInt long value);

    /**
     * [@property] maxTotalThreadsPerObjectThreadgroup
     * 
     * The maximum size of the product of threadsPerObjectThreadgroup that can be used for draws with this pipeline.
     * This information can be used by the optimizer to generate more efficient code, specifically when the specified
     * value does not exceed the thread execution width of the underlying GPU.
     * The default value is 0, which means that the value specified with the [[max_total_threads_per_threadgroup(N)]]
     * specified on objectFunction will be used.
     * When both the [[max_total_threads_per_threadgroup(N)]] attribute and a non-zero value are specified, both values
     * must match.
     * Any value specified cannot exceed the device limit as documented in the "Metal Feature Set Tables" for "Maximum
     * threads per threadgroup".
     */
    @Generated
    @Selector("setMaxTotalThreadsPerObjectThreadgroup:")
    public native void setMaxTotalThreadsPerObjectThreadgroup(@NUInt long value);

    /**
     * [@property] maxVertexAmplificationCount
     * 
     * The maximum value that can be passed to setVertexAmplificationCount when using this pipeline.
     * 
     * The default value is 1. The value must be supported by the device, which can be checked with
     * supportsVertexAmplificationCount.
     */
    @Generated
    @Selector("setMaxVertexAmplificationCount:")
    public native void setMaxVertexAmplificationCount(@NUInt long value);

    /**
     * [@property] meshFunction
     * 
     * Shader function responsible for exporting a chunk of geometry per threadgroup for the rasterizer.
     * The default value is nil.
     */
    @Generated
    @Selector("setMeshFunction:")
    public native void setMeshFunction(@Nullable @Mapped(ObjCObjectMapper.class) MTLFunction value);

    /**
     * [@property] meshThreadgroupSizeIsMultipleOfThreadExecutionWidth
     * 
     * Set this value to YES when you will only use draws with the product of threadsPerMeshThreadgroup set to a
     * multiple of the meshThreadExecutionWidth of the returned pipeline state.
     * This information can be used by the optimizer to generate more efficient code.
     * The default value is NO.
     */
    @Generated
    @Selector("setMeshThreadgroupSizeIsMultipleOfThreadExecutionWidth:")
    public native void setMeshThreadgroupSizeIsMultipleOfThreadExecutionWidth(boolean value);

    /**
     * [@property] objectFunction
     * 
     * Optional shader function responsible for determining how many threadgroups of the mesh shader to run, can
     * optionally provide payload data for the mesh stage.
     * If this is nil, no payload data is available to the mesh function, and the draw command determines how many
     * threadgroups of the mesh stage to run.
     * The default value is nil.
     */
    @Generated
    @Selector("setObjectFunction:")
    public native void setObjectFunction(@Nullable @Mapped(ObjCObjectMapper.class) MTLFunction value);

    /**
     * [@property] objectThreadgroupSizeIsMultipleOfThreadExecutionWidth
     * 
     * Set this value to YES when you will only use draws with the product of threadsPerObjectThreadgroup set to a
     * multiple of the objectThreadExecutionWidth of the returned pipeline state.
     * This information can be used by the optimizer to generate more efficient code.
     * The default value is NO.
     */
    @Generated
    @Selector("setObjectThreadgroupSizeIsMultipleOfThreadExecutionWidth:")
    public native void setObjectThreadgroupSizeIsMultipleOfThreadExecutionWidth(boolean value);

    /**
     * [@property] payloadMemoryLength
     * 
     * The size, in bytes, of the buffer indicated by [[payload]] in the object and mesh shader.
     * If this value is 0, the size of the dereferenced type declared in the object shader for the buffer is used (space
     * for a single element is assumed for pointers).
     * The default value is 0.
     */
    @Generated
    @Selector("setPayloadMemoryLength:")
    public native void setPayloadMemoryLength(@NUInt long value);

    /**
     * [@property] rasterSampleCount
     * 
     * The number of samples per fragment of the render pass in which this pipeline will be used.
     */
    @Generated
    @Selector("setRasterSampleCount:")
    public native void setRasterSampleCount(@NUInt long value);

    /**
     * [@property] rasterizationEnabled
     * 
     * Whether rasterization is disabled, all primitives are dropped prior to rasterization.
     * 
     * The default value is YES.
     */
    @Generated
    @Selector("setRasterizationEnabled:")
    public native void setRasterizationEnabled(boolean value);

    /**
     * [@property] stencilAttachmentPixelFormat
     * 
     * The pixel format of the stencil attachment of the render pass in which this pipeline will be used.
     * 
     * The default value is MTLPixelFormatInvalid; indicating no stencil attachment will be used.
     */
    @Generated
    @Selector("setStencilAttachmentPixelFormat:")
    public native void setStencilAttachmentPixelFormat(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] stencilAttachmentPixelFormat
     * 
     * The pixel format of the stencil attachment of the render pass in which this pipeline will be used.
     * 
     * The default value is MTLPixelFormatInvalid; indicating no stencil attachment will be used.
     */
    @Generated
    @Selector("stencilAttachmentPixelFormat")
    @NUInt
    public native long stencilAttachmentPixelFormat();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] fragmentLinkedFunctions
     * 
     * The set of functions to be linked with the pipeline state and accessed from the fragment function.
     * 
     * @see MTLLinkedFunctions
     * 
     *      API-Since: 17.0
     */
    @Generated
    @Selector("fragmentLinkedFunctions")
    public native MTLLinkedFunctions fragmentLinkedFunctions();

    /**
     * [@property] meshLinkedFunctions
     * 
     * The set of functions to be linked with the pipeline state and accessed from the mesh function.
     * 
     * @see MTLLinkedFunctions
     * 
     *      API-Since: 17.0
     */
    @Generated
    @Selector("meshLinkedFunctions")
    public native MTLLinkedFunctions meshLinkedFunctions();

    /**
     * [@property] objectLinkedFunctions
     * 
     * The set of functions to be linked with the pipeline state and accessed from the object function.
     * 
     * @see MTLLinkedFunctions
     * 
     *      API-Since: 17.0
     */
    @Generated
    @Selector("objectLinkedFunctions")
    public native MTLLinkedFunctions objectLinkedFunctions();

    /**
     * [@property] fragmentLinkedFunctions
     * 
     * The set of functions to be linked with the pipeline state and accessed from the fragment function.
     * 
     * @see MTLLinkedFunctions
     * 
     *      API-Since: 17.0
     */
    @Generated
    @Selector("setFragmentLinkedFunctions:")
    public native void setFragmentLinkedFunctions(MTLLinkedFunctions value);

    /**
     * [@property] meshLinkedFunctions
     * 
     * The set of functions to be linked with the pipeline state and accessed from the mesh function.
     * 
     * @see MTLLinkedFunctions
     * 
     *      API-Since: 17.0
     */
    @Generated
    @Selector("setMeshLinkedFunctions:")
    public native void setMeshLinkedFunctions(MTLLinkedFunctions value);

    /**
     * [@property] objectLinkedFunctions
     * 
     * The set of functions to be linked with the pipeline state and accessed from the object function.
     * 
     * @see MTLLinkedFunctions
     * 
     *      API-Since: 17.0
     */
    @Generated
    @Selector("setObjectLinkedFunctions:")
    public native void setObjectLinkedFunctions(MTLLinkedFunctions value);

    /**
     * [@property] supportIndirectCommandBuffers
     * 
     * Whether this pipeline will support being used by commands in an indirect command buffer.
     * 
     * The default value is NO.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setSupportIndirectCommandBuffers:")
    public native void setSupportIndirectCommandBuffers(boolean value);

    /**
     * [@property] supportIndirectCommandBuffers
     * 
     * Whether this pipeline will support being used by commands in an indirect command buffer.
     * 
     * The default value is NO.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("supportIndirectCommandBuffers")
    public native boolean supportIndirectCommandBuffers();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}