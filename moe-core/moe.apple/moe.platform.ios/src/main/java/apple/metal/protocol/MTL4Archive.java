package apple.metal.protocol;

import apple.foundation.NSError;
import apple.metal.MTL4BinaryFunctionDescriptor;
import apple.metal.MTL4ComputePipelineDescriptor;
import apple.metal.MTL4PipelineDescriptor;
import apple.metal.MTL4PipelineStageDynamicLinkingDescriptor;
import apple.metal.MTL4RenderPipelineDynamicLinkingDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A read-only container that stores pipeline states from a shader compiler.
 * 
 * The pipeline states can have intermediate representation (IR) binaries,
 * GPU- and system-specific binaries, or a combination.
 * 
 * ## Topics
 * 
 * ### Identifying the archive
 * - ``label``
 * 
 * ### Creating compute pipeline states
 * 
 * - ``newComputePipelineStateWithDescriptor:dynamicLinkingDescriptor:error:``
 * - ``newComputePipelineStateWithDescriptor:error:``
 * - ``newComputePipelineStateWithName:dynamicLinkingDescriptor:error:``
 * - ``newComputePipelineStateWithName:error:``
 * 
 * ### Creating render pipeline states
 * 
 * - ``newRenderPipelineStateWithDescriptor:dynamicLinkingDescriptor:error:``
 * - ``newRenderPipelineStateWithDescriptor:error:``
 * - ``newRenderPipelineStateWithName:dynamicLinkingDescriptor:error:``
 * - ``newRenderPipelineStateWithName:error:``
 * 
 * ### Creating binary functions
 * 
 * - ``newBinaryFunctionWithDescriptor:functionType:error:``
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTL4Archive")
public interface MTL4Archive {
    /**
     * A label that you can associate with this archive.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("label")
    @Nullable
    String label();

    /**
     * Synchronously creates a binary version of a GPU visible function or GPU intersection function.
     * 
     * - Parameters:
     * - descriptor: A configuration that tells the method which GPU function to
     * make into a binary function and which options to apply when compiling it.
     * - error: An optional pointer to an error pointer where the method returns
     * the problem details when it can't create a binary GPU function.
     * 
     * - Returns: A new GPU binary function instance if the method succeeds; otherwise `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newBinaryFunctionWithDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTL4BinaryFunction newBinaryFunctionWithDescriptorError(@NotNull MTL4BinaryFunctionDescriptor descriptor,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Creates a compute pipeline state from the archive with a compute descriptor and a dynamic linking descriptor.
     * 
     * - Parameters:
     * - descriptor: A compute pipeline descriptor.
     * - dynamicLinkingDescriptor: A descriptor that provides additional properties
     * to link other functions with the pipeline.
     * - error: On return, if the method fails, a pointer to an error information instance; otherwise `nil`.
     * 
     * - Returns: A compute pipeline state if the method succeeds, otherwise `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newComputePipelineStateWithDescriptor:dynamicLinkingDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLComputePipelineState newComputePipelineStateWithDescriptorDynamicLinkingDescriptorError(
            @NotNull MTL4ComputePipelineDescriptor descriptor,
            @NotNull MTL4PipelineStageDynamicLinkingDescriptor dynamicLinkingDescriptor,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Creates a compute pipeline state from the archive with a descriptor.
     * 
     * - Parameters:
     * - descriptor: A compute pipeline descriptor.
     * - error: On return, if the method fails, a pointer to an error information instance; otherwise `nil`.
     * 
     * - Returns: A compute pipeline state if the method succeeds, otherwise `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newComputePipelineStateWithDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLComputePipelineState newComputePipelineStateWithDescriptorError(
            @NotNull MTL4ComputePipelineDescriptor descriptor,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Creates a render pipeline state from the archive with a render descriptor and a dynamic linking descriptor.
     * 
     * You create any kind of render pipeline states with this method, including:
     * - Traditional render pipelines
     * - Mesh render pipelines
     * - Tile render pipelines
     * 
     * - Parameters:
     * - descriptor: A render pipeline descriptor.
     * - dynamicLinkingDescriptor: A descriptor that provides additional properties
     * to link other functions with the pipeline.
     * - error: On return, if the method fails, a pointer to an error information instance; otherwise `nil`.
     * 
     * - Returns: A render pipeline state if the method succeeds, otherwise `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newRenderPipelineStateWithDescriptor:dynamicLinkingDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLRenderPipelineState newRenderPipelineStateWithDescriptorDynamicLinkingDescriptorError(
            @NotNull MTL4PipelineDescriptor descriptor,
            @NotNull MTL4RenderPipelineDynamicLinkingDescriptor dynamicLinkingDescriptor,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Creates a render pipeline state from the archive with a descriptor.
     * 
     * You create any kind of render pipeline states with this method, including:
     * - Traditional render pipelines
     * - Mesh render pipelines
     * - Tile render pipelines
     * 
     * - Parameters:
     * - descriptor: A render pipeline descriptor.
     * - error: On return, if the method fails, a pointer to an error information instance; otherwise `nil`.
     * 
     * - Returns: A render pipeline state if the method succeeds, otherwise `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newRenderPipelineStateWithDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLRenderPipelineState newRenderPipelineStateWithDescriptorError(@NotNull MTL4PipelineDescriptor descriptor,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * A label that you can associate with this archive.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(@Nullable String value);
}