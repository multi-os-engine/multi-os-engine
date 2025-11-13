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
 * Groups together properties you use to create a mesh render pipeline state object.
 * 
 * Compared to ``MTLMeshRenderPipelineDescriptor``, this interface doesn't offer a mechanism to hint to Metal mutability
 * of object, mesh, or fragment buffers. Additionally, when you use this descriptor, you don't specify binary archives.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTL4MeshRenderPipelineDescriptor extends MTL4PipelineDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MTL4MeshRenderPipelineDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTL4MeshRenderPipelineDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTL4MeshRenderPipelineDescriptor allocWithZone(VoidPtr zone);

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
     * Sets the logical-to-physical rendering remap state.
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
     * Assigns a function descriptor representing the function this pipeline executes for each fragment.
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
    public native MTL4MeshRenderPipelineDescriptor init();

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
     * Controls the largest number of threads the pipeline state can execute when the object stage of a mesh
     * render pipeline you create from this descriptor dispatches its mesh stage.
     * 
     * This number represents the maximum size of the product of the components of the parameter you pass to Metal
     * Shading Language's built-in function `mesh_grid_properties::set_threadgroups_per_grid`.
     * 
     * The default value of this property is `0`, which indicates that the Metal Shading Language attribute
     * `[[max_total_threadgroups_per_mesh_grid(N)]]` you attach to the pipeline's mesh shader function determines
     * the value of this property.
     * 
     * When you specify both the `[[max_total_threadgroups_per_mesh_grid(N)]]` attribute and this property, you are
     * responsible for making sure these values match.
     * 
     * Additionally, you are responsible for ensuring this value doesn't exceed the "maximum threads per mesh grid"
     * device limit documented in the "Metal Feature Set Tables" PDF:
     * <https://developer.apple.com/metal/Metal-Feature-Set-Tables.pdf>.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("maxTotalThreadgroupsPerMeshGrid")
    @NUInt
    public native long maxTotalThreadgroupsPerMeshGrid();

    /**
     * Controls the largest number of threads the pipeline state can execute in a single mesh shader threadgroup
     * dispatch.
     * 
     * This number represents the maximum size of the product of the components of parameter `threadsPerMeshThreadgroup`
     * that Metal can use when drawing with this pipeline in mesh shader dispatch methods, such as
     * ``MTL4RenderCommandEncoder/drawMeshThreadgroups:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:``.
     * 
     * The compiler's optimizer can use the value of this property to generate more efficient code, specifically when
     * the value doesn't exceed the thread execution width of the underlying GPU.
     * 
     * The default value of this property is `0`, thish indicates that the Metal Shader Language attribute
     * `[[max_total_threads_per_threadgroup]]` you attache to the pipeline's mesh shader function determines
     * the value of this property.
     * 
     * 
     * When you specify both the `[[max_total_threads_per_threadgroup(N)]]` attribute and this property, you are
     * responsible
     * for making sure these values match.
     * 
     * Additionally, you are responsible for ensuring this value doesn't exceed the "maximum threads per threadgroup"
     * device limit documented in the "Metal Feature Set Tables" PDF:
     * <https://developer.apple.com/metal/Metal-Feature-Set-Tables.pdf>.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("maxTotalThreadsPerMeshThreadgroup")
    @NUInt
    public native long maxTotalThreadsPerMeshThreadgroup();

    /**
     * Controls the largest number of threads the pipeline state can execute in a single object shader threadgroup
     * dispatch.
     * 
     * This number represents the maximum size of the product of the components of parameter
     * `threadsPerObjectThreadgroup`
     * that Metal can use when drawing with this pipeline in mesh shader dispatch methods, such as
     * ``MTL4RenderCommandEncoder/drawMeshThreadgroups:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:``.
     * 
     * The compiler's optimizer can use the value of this property to generate more efficient code, specifically when
     * the value doesn't exceed the thread execution width of the underlying GPU.
     * 
     * The default value of this property is `0`, which indicates that the number you pass to attribute
     * `[[max_total_threads_per_threadgroup(N)]]` of the pipeline's object function determines the maximum
     * total threads per threadgroup.
     * 
     * When you specify both the `[[max_total_threads_per_threadgroup(N)]]` attribute and this property, you are
     * responsible
     * for making sure these values match.
     * 
     * Additionally, you are responsible for ensuring this value doesn't exceed the "maximum threads per threadgroup"
     * device limit documented in the "Metal Feature Set Tables" PDF:
     * <https://developer.apple.com/metal/Metal-Feature-Set-Tables.pdf>.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("maxTotalThreadsPerObjectThreadgroup")
    @NUInt
    public native long maxTotalThreadsPerObjectThreadgroup();

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

    /**
     * Assigns a function descriptor representing the function this pipeline executes for each primitive in the mesh
     * shader stage.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("meshFunctionDescriptor")
    @Nullable
    public native MTL4FunctionDescriptor meshFunctionDescriptor();

    /**
     * Provides static linking information for the mesh stage of the render pipeline.
     * 
     * Use this property to link extra shader functions to the mesh stage of the render pipeline.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("meshStaticLinkingDescriptor")
    public native MTL4StaticLinkingDescriptor meshStaticLinkingDescriptor();

    /**
     * Provides a guarantee to Metal regarding the number of threadgroup threads for the mesh stage of a pipeline you
     * create from this descriptor.
     * 
     * If you set this property to <doc://com.apple.documentation/documentation/swift/true>, you state to Metal that
     * when
     * you use a mesh render pipeline you create from this descriptor, the number of threadgroup threads you dispatch
     * for
     * the mesh stage is a multiple of its ``MTLRenderPipelineState/meshThreadExecutionWidth``. The compiler's optimizer
     * can use this guarantee to generate more efficient code.
     * 
     * This property's default value is <doc://com.apple.documentation/documentation/swift/false>.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("meshThreadgroupSizeIsMultipleOfThreadExecutionWidth")
    public native boolean meshThreadgroupSizeIsMultipleOfThreadExecutionWidth();

    @Generated
    @Owned
    @Selector("new")
    public static native MTL4MeshRenderPipelineDescriptor new_objc();

    /**
     * Assigns a function descriptor representing the function this pipeline executes for each *object* in the object
     * shader stage.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("objectFunctionDescriptor")
    @Nullable
    public native MTL4FunctionDescriptor objectFunctionDescriptor();

    /**
     * Provides static linking information for the object stage of the render pipeline.
     * 
     * Use this property to link extra shader functions to the object stage of the render pipeline.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("objectStaticLinkingDescriptor")
    public native MTL4StaticLinkingDescriptor objectStaticLinkingDescriptor();

    /**
     * Provides a guarantee to Metal regarding the number of threadgroup threads for the object stage of a pipeline you
     * create from this descriptor.
     * 
     * If you set this property to <doc://com.apple.documentation/documentation/swift/true>, you state to Metal that
     * when
     * you use a mesh render pipeline you create from this descriptor, the number of threadgroup threads you dispatch
     * for
     * the object stage is a multiple of its ``MTLRenderPipelineState/objectThreadExecutionWidth``. The compiler's
     * optimizer can use this guarantee to generate
     * more efficient code.
     * 
     * This property's default value is <doc://com.apple.documentation/documentation/swift/false>.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("objectThreadgroupSizeIsMultipleOfThreadExecutionWidth")
    public native boolean objectThreadgroupSizeIsMultipleOfThreadExecutionWidth();

    /**
     * Reserves storage for the object-to-mesh stage payload.
     * 
     * This property determines the size, in bytes, of the buffer you indicate via the Metal Shading Language
     * `[[payload]]`
     * attribute in the object and mesh shader functions of the mesh render pipeline.
     * 
     * If this value is `0`, Metal derives the size from the (dereferenced) type you declare for the payload in the
     * object
     * shader function. If the type is a pointer, Metal reserves space for a single element.
     * 
     * The default value is `0`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("payloadMemoryLength")
    @NUInt
    public native long payloadMemoryLength();

    /**
     * Sets number of samples this pipeline applies for each fragment.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("rasterSampleCount")
    @NUInt
    public native long rasterSampleCount();

    /**
     * Controls the required number of mesh threads-per-threadgroup when drawing with a mesh shader pipeline you create
     * from this descriptor.
     * 
     * This argument is optional, unless this pipeline uses `CooperativeTensors`, in which case you are responsible for
     * providing it.
     * 
     * When this value is set to non-zero, you are responsible for ensuring the parameter `threadsPerMeshThreadgroup`
     * in any mesh dispatch draw calls that use this mesh render pipeline, such as
     * ``MTL4RenderCommandEncoder/drawMeshThreadgroups:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:``,
     * match it.
     * 
     * Setting this value to a size of 0 in every dimension disables this property.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("requiredThreadsPerMeshThreadgroup")
    @ByValue
    public native MTLSize requiredThreadsPerMeshThreadgroup();

    /**
     * Controls the required number of object threads-per-threadgroup when drawing with a mesh shader pipeline you
     * create
     * from this descriptor.
     * 
     * This argument is optional, unless this pipeline uses `CooperativeTensors`, in which case you are responsible for
     * providing it.
     * 
     * When this value is set to non-zero, you are responsible for ensuring the parameter `threadsPerObjectThreadgroup`
     * in any mesh dispatch draw calls that use this mesh render pipeline, such as
     * ``MTL4RenderCommandEncoder/drawMeshThreadgroups:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:``,
     * match it.
     * 
     * Setting this value to a size of 0 in every dimension disables this property.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("requiredThreadsPerObjectThreadgroup")
    @ByValue
    public native MTLSize requiredThreadsPerObjectThreadgroup();

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
     * Sets the logical-to-physical rendering remap state.
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
     * Assigns a function descriptor representing the function this pipeline executes for each fragment.
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
     * Controls the largest number of threads the pipeline state can execute when the object stage of a mesh
     * render pipeline you create from this descriptor dispatches its mesh stage.
     * 
     * This number represents the maximum size of the product of the components of the parameter you pass to Metal
     * Shading Language's built-in function `mesh_grid_properties::set_threadgroups_per_grid`.
     * 
     * The default value of this property is `0`, which indicates that the Metal Shading Language attribute
     * `[[max_total_threadgroups_per_mesh_grid(N)]]` you attach to the pipeline's mesh shader function determines
     * the value of this property.
     * 
     * When you specify both the `[[max_total_threadgroups_per_mesh_grid(N)]]` attribute and this property, you are
     * responsible for making sure these values match.
     * 
     * Additionally, you are responsible for ensuring this value doesn't exceed the "maximum threads per mesh grid"
     * device limit documented in the "Metal Feature Set Tables" PDF:
     * <https://developer.apple.com/metal/Metal-Feature-Set-Tables.pdf>.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMaxTotalThreadgroupsPerMeshGrid:")
    public native void setMaxTotalThreadgroupsPerMeshGrid(@NUInt long value);

    /**
     * Controls the largest number of threads the pipeline state can execute in a single mesh shader threadgroup
     * dispatch.
     * 
     * This number represents the maximum size of the product of the components of parameter `threadsPerMeshThreadgroup`
     * that Metal can use when drawing with this pipeline in mesh shader dispatch methods, such as
     * ``MTL4RenderCommandEncoder/drawMeshThreadgroups:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:``.
     * 
     * The compiler's optimizer can use the value of this property to generate more efficient code, specifically when
     * the value doesn't exceed the thread execution width of the underlying GPU.
     * 
     * The default value of this property is `0`, thish indicates that the Metal Shader Language attribute
     * `[[max_total_threads_per_threadgroup]]` you attache to the pipeline's mesh shader function determines
     * the value of this property.
     * 
     * 
     * When you specify both the `[[max_total_threads_per_threadgroup(N)]]` attribute and this property, you are
     * responsible
     * for making sure these values match.
     * 
     * Additionally, you are responsible for ensuring this value doesn't exceed the "maximum threads per threadgroup"
     * device limit documented in the "Metal Feature Set Tables" PDF:
     * <https://developer.apple.com/metal/Metal-Feature-Set-Tables.pdf>.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMaxTotalThreadsPerMeshThreadgroup:")
    public native void setMaxTotalThreadsPerMeshThreadgroup(@NUInt long value);

    /**
     * Controls the largest number of threads the pipeline state can execute in a single object shader threadgroup
     * dispatch.
     * 
     * This number represents the maximum size of the product of the components of parameter
     * `threadsPerObjectThreadgroup`
     * that Metal can use when drawing with this pipeline in mesh shader dispatch methods, such as
     * ``MTL4RenderCommandEncoder/drawMeshThreadgroups:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:``.
     * 
     * The compiler's optimizer can use the value of this property to generate more efficient code, specifically when
     * the value doesn't exceed the thread execution width of the underlying GPU.
     * 
     * The default value of this property is `0`, which indicates that the number you pass to attribute
     * `[[max_total_threads_per_threadgroup(N)]]` of the pipeline's object function determines the maximum
     * total threads per threadgroup.
     * 
     * When you specify both the `[[max_total_threads_per_threadgroup(N)]]` attribute and this property, you are
     * responsible
     * for making sure these values match.
     * 
     * Additionally, you are responsible for ensuring this value doesn't exceed the "maximum threads per threadgroup"
     * device limit documented in the "Metal Feature Set Tables" PDF:
     * <https://developer.apple.com/metal/Metal-Feature-Set-Tables.pdf>.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMaxTotalThreadsPerObjectThreadgroup:")
    public native void setMaxTotalThreadsPerObjectThreadgroup(@NUInt long value);

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
     * Assigns a function descriptor representing the function this pipeline executes for each primitive in the mesh
     * shader stage.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMeshFunctionDescriptor:")
    public native void setMeshFunctionDescriptor(@Nullable MTL4FunctionDescriptor value);

    /**
     * Provides static linking information for the mesh stage of the render pipeline.
     * 
     * Use this property to link extra shader functions to the mesh stage of the render pipeline.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMeshStaticLinkingDescriptor:")
    public native void setMeshStaticLinkingDescriptor(MTL4StaticLinkingDescriptor value);

    /**
     * Provides a guarantee to Metal regarding the number of threadgroup threads for the mesh stage of a pipeline you
     * create from this descriptor.
     * 
     * If you set this property to <doc://com.apple.documentation/documentation/swift/true>, you state to Metal that
     * when
     * you use a mesh render pipeline you create from this descriptor, the number of threadgroup threads you dispatch
     * for
     * the mesh stage is a multiple of its ``MTLRenderPipelineState/meshThreadExecutionWidth``. The compiler's optimizer
     * can use this guarantee to generate more efficient code.
     * 
     * This property's default value is <doc://com.apple.documentation/documentation/swift/false>.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMeshThreadgroupSizeIsMultipleOfThreadExecutionWidth:")
    public native void setMeshThreadgroupSizeIsMultipleOfThreadExecutionWidth(boolean value);

    /**
     * Assigns a function descriptor representing the function this pipeline executes for each *object* in the object
     * shader stage.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setObjectFunctionDescriptor:")
    public native void setObjectFunctionDescriptor(@Nullable MTL4FunctionDescriptor value);

    /**
     * Provides static linking information for the object stage of the render pipeline.
     * 
     * Use this property to link extra shader functions to the object stage of the render pipeline.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setObjectStaticLinkingDescriptor:")
    public native void setObjectStaticLinkingDescriptor(MTL4StaticLinkingDescriptor value);

    /**
     * Provides a guarantee to Metal regarding the number of threadgroup threads for the object stage of a pipeline you
     * create from this descriptor.
     * 
     * If you set this property to <doc://com.apple.documentation/documentation/swift/true>, you state to Metal that
     * when
     * you use a mesh render pipeline you create from this descriptor, the number of threadgroup threads you dispatch
     * for
     * the object stage is a multiple of its ``MTLRenderPipelineState/objectThreadExecutionWidth``. The compiler's
     * optimizer can use this guarantee to generate
     * more efficient code.
     * 
     * This property's default value is <doc://com.apple.documentation/documentation/swift/false>.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setObjectThreadgroupSizeIsMultipleOfThreadExecutionWidth:")
    public native void setObjectThreadgroupSizeIsMultipleOfThreadExecutionWidth(boolean value);

    /**
     * Reserves storage for the object-to-mesh stage payload.
     * 
     * This property determines the size, in bytes, of the buffer you indicate via the Metal Shading Language
     * `[[payload]]`
     * attribute in the object and mesh shader functions of the mesh render pipeline.
     * 
     * If this value is `0`, Metal derives the size from the (dereferenced) type you declare for the payload in the
     * object
     * shader function. If the type is a pointer, Metal reserves space for a single element.
     * 
     * The default value is `0`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setPayloadMemoryLength:")
    public native void setPayloadMemoryLength(@NUInt long value);

    /**
     * Sets number of samples this pipeline applies for each fragment.
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
     * Controls the required number of mesh threads-per-threadgroup when drawing with a mesh shader pipeline you create
     * from this descriptor.
     * 
     * This argument is optional, unless this pipeline uses `CooperativeTensors`, in which case you are responsible for
     * providing it.
     * 
     * When this value is set to non-zero, you are responsible for ensuring the parameter `threadsPerMeshThreadgroup`
     * in any mesh dispatch draw calls that use this mesh render pipeline, such as
     * ``MTL4RenderCommandEncoder/drawMeshThreadgroups:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:``,
     * match it.
     * 
     * Setting this value to a size of 0 in every dimension disables this property.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRequiredThreadsPerMeshThreadgroup:")
    public native void setRequiredThreadsPerMeshThreadgroup(@ByValue MTLSize value);

    /**
     * Controls the required number of object threads-per-threadgroup when drawing with a mesh shader pipeline you
     * create
     * from this descriptor.
     * 
     * This argument is optional, unless this pipeline uses `CooperativeTensors`, in which case you are responsible for
     * providing it.
     * 
     * When this value is set to non-zero, you are responsible for ensuring the parameter `threadsPerObjectThreadgroup`
     * in any mesh dispatch draw calls that use this mesh render pipeline, such as
     * ``MTL4RenderCommandEncoder/drawMeshThreadgroups:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:``,
     * match it.
     * 
     * Setting this value to a size of 0 in every dimension disables this property.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRequiredThreadsPerObjectThreadgroup:")
    public native void setRequiredThreadsPerObjectThreadgroup(@ByValue MTLSize value);

    /**
     * Indicates whether you can use the render pipeline to create new pipelines by adding binary functions to the
     * fragment
     * shader function’s callable functions list.
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
     * Indicates whether you can use the render pipeline to create new pipelines by adding binary functions to the mesh
     * shader function’s callable functions list.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSupportMeshBinaryLinking:")
    public native void setSupportMeshBinaryLinking(boolean value);

    /**
     * Indicates whether you can use the render pipeline to create new pipelines by adding binary functions to the
     * object
     * shader function’s callable functions list.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSupportObjectBinaryLinking:")
    public native void setSupportObjectBinaryLinking(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Indicates whether you can use the render pipeline to create new pipelines by adding binary functions to the
     * fragment
     * shader function’s callable functions list.
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
     * Indicates whether you can use the render pipeline to create new pipelines by adding binary functions to the mesh
     * shader function’s callable functions list.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportMeshBinaryLinking")
    public native boolean supportMeshBinaryLinking();

    /**
     * Indicates whether you can use the render pipeline to create new pipelines by adding binary functions to the
     * object
     * shader function’s callable functions list.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportObjectBinaryLinking")
    public native boolean supportObjectBinaryLinking();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}