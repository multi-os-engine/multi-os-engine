package apple.metal.protocol;

import apple.foundation.struct.NSRange;
import apple.metal.MTLLogicalToPhysicalColorAttachmentMap;
import apple.metal.struct.MTLScissorRect;
import apple.metal.struct.MTLSize;
import apple.metal.struct.MTLVertexAmplificationViewMapping;
import apple.metal.struct.MTLViewport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Encodes a render pass into a command buffer, including all its draw calls and configuration.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTL4RenderCommandEncoder")
public interface MTL4RenderCommandEncoder extends MTL4CommandEncoder {
    /**
     * Encodes a command that invokes a tile shader function from the encoder’s current tile render pipeline state.
     * 
     * - Parameter threadsPerTile: A ``MTLSize`` instance that represents the number of threads the render pass uses per
     * tile.
     * Set the size’s ``MTLSize/width`` and ``MTLSize/height`` properties to values that are less
     * than or equal to ``tileWidth`` and ``tileHeight``, respectively. Some GPU families
     * only support square tile dispatches and require the same value for width and height.
     * Set ``MTLSize/depth`` to `1`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("dispatchThreadsPerTile:")
    void dispatchThreadsPerTile(@ByValue MTLSize threadsPerTile);

    /**
     * Encodes a draw command that renders an instance of a geometric primitive with indexed vertices.
     * 
     * Use this method to perform indexed drawing, where an index buffer determines how Metal assembles primitives.
     * 
     * Metal imposes some restrictions on the index buffer's address, which needs to be 2- or 4-byte aligned, and its
     * length
     * in bytes, which needs to be a multiple of 2 or 4, depending on whether the format of the index is
     * ``MTLIndexType/MTLIndexTypeUInt16`` or ``MTLIndexType/MTLIndexTypeUInt32``.
     * 
     * Use an instance of ``MTLResidencySet`` to mark residency of the index buffer the `indexBuffer` parameter
     * references.
     * 
     * - Parameters:
     * - primitiveType: A ``MTLPrimitiveType`` representing how the command interprets vertex argument data.
     * - indexCount: An integer that represents the number of vertices the command reads from `indexBuffer`.
     * - indexType: A ``MTLIndexType`` instance that represents the index format.
     * - indexBuffer: GPUAddress of a ``MTLBuffer`` instance that contains `indexCount` indices of `indexType` format.
     * You are responsible for ensuring this address is aligned to 2 bytes if the `indexType` format is
     * ``MTLIndexType/MTLIndexTypeUInt16``, and aligned to 4 bytes if the format is
     * ``MTLIndexType/MTLIndexTypeUInt32``.
     * - indexBufferLength: An integer that represents the length of `indexBuffer`, in bytes. You are responsible for
     * ensuring this this size is a multiple of 2 if the `indexType` format is ``MTLIndexType/MTLIndexTypeUInt16``,
     * and a multiple of 4 if the format is ``MTLIndexType/MTLIndexTypeUInt32``.
     * If this draw call causes Metal to read indices at or beyond the `indexBufferLength`, Metal
     * continues to execute them assigning a value of `0` to the `vertex_id` attribute.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferLength:")
    void drawIndexedPrimitivesIndexCountIndexTypeIndexBufferIndexBufferLength(@NUInt long primitiveType,
            @NUInt long indexCount, @NUInt long indexType, long indexBuffer, @NUInt long indexBufferLength);

    /**
     * Encodes a draw command that renders multiple instances of a geometric primitive with indexed vertices.
     * 
     * Use this method to perform instanced indexed drawing, where an index buffer determines how Metal assembles
     * primitives.
     * 
     * The command assigns each drawing instance a unique `instance_id` value that increases
     * from `0` through `(instanceCount - 1)`. Your shader can use this value to identify which
     * instance the vertex belongs to.
     * 
     * Metal imposes some restrictions on the index buffer's address, which needs to be 2- or 4-byte aligned, and its
     * length
     * in bytes, which needs to be a multiple of 2 or 4, depending on whether the format of the index is
     * ``MTLIndexType/MTLIndexTypeUInt16`` or ``MTLIndexType/MTLIndexTypeUInt32``.
     * 
     * Use an instance of ``MTLResidencySet`` to mark residency of the index buffer the `indexBuffer` parameter
     * references.
     * 
     * - Parameters:
     * - primitiveType: A ``MTLPrimitiveType`` representing how the command interprets vertex argument data.
     * - indexCount: An integer that represents the number of vertices the command reads from `indexBuffer`.
     * - indexType: A ``MTLIndexType`` instance that represents the index format.
     * - indexBuffer: GPUAddress of a ``MTLBuffer`` instance that contains `indexCount` indices of `indexType` format.
     * You are responsible for ensuring this address is aligned to 2 bytes if the `indexType` format is
     * ``MTLIndexType/MTLIndexTypeUInt16``, and aligned to 4 bytes if the format is
     * ``MTLIndexType/MTLIndexTypeUInt32``.
     * - indexBufferLength: An integer that represents the length of `indexBuffer`, in bytes. You are responsible for
     * ensuring this this size is a multiple of 2 if the `indexType` format is ``MTLIndexType/MTLIndexTypeUInt16``,
     * and a multiple of 4 if the format is ``MTLIndexType/MTLIndexTypeUInt32``.
     * Metal disregards this value and assigns `0` to the `vertex_id` attribute for all primitives that
     * require loading indices at a byte offset of `indexBufferLength` or greater.
     * - instanceCount: An integer that represents the number of times the command draws `primitiveType` with
     * `indexCount`
     * vertices.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferLength:instanceCount:")
    void drawIndexedPrimitivesIndexCountIndexTypeIndexBufferIndexBufferLengthInstanceCount(@NUInt long primitiveType,
            @NUInt long indexCount, @NUInt long indexType, long indexBuffer, @NUInt long indexBufferLength,
            @NUInt long instanceCount);

    /**
     * Encodes a draw command that renders multiple instances of a geometric primitive with indexed vertices,
     * starting with a custom vertex and instance.
     * 
     * Use this method to perform instanced indexed drawing, where an index buffer determines how Metal assembles
     * primitives
     * whilst customizing the base vertex and base instance value Metal passes to the vertex shader function.
     * 
     * The command assigns each drawing instance a unique `instance_id` value that increases
     * from `baseInstance` through `(baseInstance + instanceCount - 1)`. Your shader can use this value
     * to identify which instance the vertex belongs to.
     * 
     * Metal imposes some restrictions on the index buffer's address, which needs to be 2- or 4-byte aligned, and its
     * length
     * in bytes, which needs to be a multiple of 2 or 4, depending on whether the format of the index is
     * ``MTLIndexType/MTLIndexTypeUInt16`` or ``MTLIndexType/MTLIndexTypeUInt32``.
     * 
     * Use an instance of ``MTLResidencySet`` to mark residency of the index buffer the `indexBuffer` parameter
     * references.
     * 
     * - Parameters:
     * - primitiveType: A ``MTLPrimitiveType`` representing how the command interprets vertex argument data.
     * - indexCount: An integer that represents the number of vertices the command reads from `indexBuffer`.
     * - indexType: A ``MTLIndexType`` instance that represents the index format.
     * - indexBuffer: GPUAddress of a ``MTLBuffer`` instance that contains `indexCount` indices of `indexType` format.
     * You are responsible for ensuring this address is aligned to 2 bytes if the `indexType` format is
     * ``MTLIndexType/MTLIndexTypeUInt16``, and aligned to 4 bytes if the format is
     * ``MTLIndexType/MTLIndexTypeUInt32``.
     * - indexBufferLength: An integer that represents the length of `indexBuffer`, in bytes. You are responsible for
     * ensuring this this size is a multiple of 2 if the `indexType` format is ``MTLIndexType/MTLIndexTypeUInt16``,
     * and a multiple of 4 if the format is ``MTLIndexType/MTLIndexTypeUInt32``.
     * If this draw call causes Metal to read indices at or beyond the `indexBufferLength`, Metal
     * continues to execute them assigning a value of `0` to the `vertex_id` attribute.
     * - instanceCount: An integer that represents the number of times the command draws `primitiveType` with
     * `indexCount`
     * vertices.
     * - baseVertex: The lowest value the command passes to your vertex shader functions’s parameter with the
     * `vertex_id`
     * attribute. Metal disregards this value and assigns `0` to the `vertex_id` attribute for all
     * primitives that require loading indices at a byte offset of `indexBufferLength` or greater.
     * - baseInstance: The lowest value the command passes to your vertex shader’s parameter with the `instance_id`
     * attribute.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferLength:instanceCount:baseVertex:baseInstance:")
    void drawIndexedPrimitivesIndexCountIndexTypeIndexBufferIndexBufferLengthInstanceCountBaseVertexBaseInstance(
            @NUInt long primitiveType, @NUInt long indexCount, @NUInt long indexType, long indexBuffer,
            @NUInt long indexBufferLength, @NUInt long instanceCount, @NInt long baseVertex, @NUInt long baseInstance);

    /**
     * Encodes a draw command that renders multiple instances of a geometric primitive with indexed vertices
     * and indirect arguments.
     * 
     * When you use this function, Metal reads the parameters to the draw command from an ``MTLBuffer`` instance,
     * allowing you to implement a GPU-driven workflow where a compute pipeline state determines the draw arguments.
     * 
     * Because this is an indexed draw call, Metal interprets the contents of the indirect buffer to match the
     * layout of struct ``MTLDrawIndexedPrimitivesIndirectArguments``, which includes `indexStart` and `indexCount`
     * members, denoting a range within the index buffer you provide in the `indexBuffer` parameter.
     * 
     * The range of indices within the `indexBuffer` form the primitives Metal draws.
     * 
     * Metal imposes some restrictions on the index buffer's address, which needs to be 2- or 4-byte aligned, and its
     * length
     * in bytes, which needs to be a multiple of 2 or 4, depending on whether the format of the index is
     * ``MTLIndexType/MTLIndexTypeUInt16`` or ``MTLIndexType/MTLIndexTypeUInt32``.
     * 
     * Similarly, you are responsible for ensuring the indirect buffer's address has 4-byte alignment.
     * 
     * Use an instance of ``MTLResidencySet`` to mark residency of the indirect buffer that the `indirectBuffer`
     * parameter
     * references, and of the index buffer the `indexBuffer` parameter references.
     * 
     * - Parameters:
     * - primitiveType: A ``MTLPrimitiveType`` representing how the command interprets vertex argument data.
     * - indexType: A ``MTLIndexType`` instance that represents the index format.
     * - indexBuffer: GPUAddress of a ``MTLBuffer`` instance that contains `indexCount` indices of `indexType` format.
     * You are responsible for ensuring this address is aligned to 2 bytes if the `indexType` format is
     * ``MTLIndexType/MTLIndexTypeUInt16``, and aligned to 4 bytes if the format is
     * ``MTLIndexType/MTLIndexTypeUInt32``.
     * - indexBufferLength: An integer that represents the length of `indexBuffer`, in bytes. You are responsible for
     * ensuring this this size is a multiple of 2 if the `indexType` format is ``MTLIndexType/MTLIndexTypeUInt16``,
     * and a multiple of 4 if the format is ``MTLIndexType/MTLIndexTypeUInt32``.
     * If this draw call causes Metal to read indices at or beyond the `indexBufferLength`, Metal
     * continues to execute them assigning a value of `0` to the `vertex_id` attribute.
     * - indirectBuffer: GPUAddress of an ``MTLBuffer`` instance with data that matches the layout of the
     * ``MTLDrawIndexedPrimitivesIndirectArguments`` structure. This address requires 4-byte alignment.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("drawIndexedPrimitives:indexType:indexBuffer:indexBufferLength:indirectBuffer:")
    void drawIndexedPrimitivesIndexTypeIndexBufferIndexBufferLengthIndirectBuffer(@NUInt long primitiveType,
            @NUInt long indexType, long indexBuffer, @NUInt long indexBufferLength, long indirectBuffer);

    /**
     * Encodes a draw command that invokes a mesh shader and, optionally, an object shader with a grid of threadgroups.
     * 
     * - Parameters:
     * - threadgroupsPerGrid: A ``MTLSize`` instance that represents the number of threadgroups for each grid dimension.
     * - threadsPerObjectThreadgroup: A ``MTLSize`` instance that represents the number of threads in an object
     * shader threadgroup, if applicable.
     * - threadsPerMeshThreadgroup: A ``MTLSize`` instance that represents the number of threads in a mesh shader
     * threadgroup.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("drawMeshThreadgroups:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:")
    void drawMeshThreadgroupsThreadsPerObjectThreadgroupThreadsPerMeshThreadgroup(@ByValue MTLSize threadgroupsPerGrid,
            @ByValue MTLSize threadsPerObjectThreadgroup, @ByValue MTLSize threadsPerMeshThreadgroup);

    /**
     * Encodes a draw command that invokes a mesh shader and, optionally, an object shader with indirect arguments.
     * 
     * This method enables you to determine the number of threadgroups per grid indirectly, in the GPU timeline.
     * Metal expects this buffer's contents to match the layout of structure
     * ``MTLDispatchThreadgroupsIndirectArguments``.
     * You are responsible for ensuring the address of this buffer has 4-byte alignment.
     * 
     * Use an instance of ``MTLResidencySet`` to mark residency of the indirect buffer that the `indirectBuffer`
     * parameter
     * references.
     * 
     * - Parameters:
     * - indirectBuffer: GPUAddress of an ``MTLBuffer`` instance with data that matches the layout of the
     * ``MTLDispatchThreadgroupsIndirectArguments`` structure. This address requires 4-byte alignment.
     * - threadsPerObjectThreadgroup: A ``MTLSize`` instance that represents the number of threads in an object
     * shader threadgroup, if applicable.
     * - threadsPerMeshThreadgroup: A ``MTLSize`` instance that represents the number of threads in a mesh shader
     * threadgroup.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("drawMeshThreadgroupsWithIndirectBuffer:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:")
    void drawMeshThreadgroupsWithIndirectBufferThreadsPerObjectThreadgroupThreadsPerMeshThreadgroup(long indirectBuffer,
            @ByValue MTLSize threadsPerObjectThreadgroup, @ByValue MTLSize threadsPerMeshThreadgroup);

    /**
     * Encodes a draw command that invokes a mesh shader and, optionally, an object shader with a grid of threads.
     * 
     * - Parameters:
     * - threadsPerGrid: A ``MTLSize`` instance that represents the number of threads for each grid dimension.
     * For mesh shaders, the command rounds the value down to the nearest multiple of
     * `threadsPerMeshThreadgroup` for each dimension. For object shaders, the value doesn’t
     * need to be a multiple of `threadsPerObjectThreadgroup`.
     * - threadsPerObjectThreadgroup: A ``MTLSize`` instance that represents the number of threads in an object
     * shader threadgroup, if applicable.
     * - threadsPerMeshThreadgroup: A ``MTLSize`` instance that represents the number of threads in a mesh shader
     * threadgroup.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("drawMeshThreads:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:")
    void drawMeshThreadsThreadsPerObjectThreadgroupThreadsPerMeshThreadgroup(@ByValue MTLSize threadsPerGrid,
            @ByValue MTLSize threadsPerObjectThreadgroup, @ByValue MTLSize threadsPerMeshThreadgroup);

    /**
     * Encodes a draw command that renders multiple instances of a geometric primitive with indirect arguments.
     * 
     * When you use this function, Metal reads the parameters to the draw command from an ``MTLBuffer`` instance,
     * allowing you to implement a GPU-driven workflow where a compute pipeline state determines the draw arguments.
     * 
     * You are responsible for ensuring that the address of the indirect buffer you provide to this method has 4-byte
     * alignment.
     * 
     * Because this is a non-indexed draw call, Metal interprets the contents of the indirect buffer to match the
     * layout of struct ``MTLDrawPrimitivesIndirectArguments``.
     * 
     * Use an instance of ``MTLResidencySet`` to mark residency of the indirect buffer that the `indirectBuffer`
     * parameter
     * references.
     * 
     * - Parameters:
     * - primitiveType: A ``MTLPrimitiveType`` representing how the command interprets vertex argument data.
     * - indirectBuffer: GPUAddress of a ``MTLBuffer`` instance with data that matches the layout of the
     * ``MTLDrawPrimitivesIndirectArguments`` structure. You are responsible for ensuring that the
     * alignment of this address is 4 bytes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("drawPrimitives:indirectBuffer:")
    void drawPrimitivesIndirectBuffer(@NUInt long primitiveType, long indirectBuffer);

    /**
     * Encodes a draw command that renders an instance of a geometric primitive.
     * 
     * This command assigns each vertex a unique `vertex_id` value that increases from `vertexStart` through
     * `(vertexStart + vertexCount - 1)`.
     * 
     * Your vertex shader function can use this value to uniquely identify each vertex.
     * 
     * - Parameters:
     * - primitiveType: A ``MTLPrimitiveType`` representing how the command interprets vertex argument data.
     * - vertexStart: The lowest value the command passes to your vertex shader function’s parameter with the
     * `[[vertex_id]]` attribute.
     * - vertexCount: An integer that represents the number of vertices of `primitiveType` the command draws.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("drawPrimitives:vertexStart:vertexCount:")
    void drawPrimitivesVertexStartVertexCount(@NUInt long primitiveType, @NUInt long vertexStart,
            @NUInt long vertexCount);

    /**
     * Encodes a draw command that renders multiple instances of a geometric primitive.
     * 
     * The command assigns each vertex a unique `vertex_id` value within its drawing instance
     * that increases from `vertexStart` through `(vertexStart + vertexCount - 1)`.
     * 
     * Additionally, the command assigns each drawing instance a unique `instance_id` value that increases
     * from `0` through `(instanceCount - 1)`.
     * 
     * Your vertex shader can use the `vertex_id` value to uniquely identify each vertex in each drawing instance, and
     * the
     * `instance_id` value to identify which instance that vertex belongs to.
     * 
     * - Parameters:
     * - primitiveType: A ``MTLPrimitiveType`` represents how the command interprets vertex argument data.
     * - vertexStart: The lowest value the command passes to your vertex shader function’s parameter with
     * the `vertex_id` attribute.
     * - vertexCount: An integer that represents the number of vertices of `primitiveType` the command draws.
     * - instanceCount: An integer that represents the number of times the command draws `primitiveType` primitives
     * with `vertexCount` vertices.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("drawPrimitives:vertexStart:vertexCount:instanceCount:")
    void drawPrimitivesVertexStartVertexCountInstanceCount(@NUInt long primitiveType, @NUInt long vertexStart,
            @NUInt long vertexCount, @NUInt long instanceCount);

    /**
     * Encodes a draw command that renders multiple instances of a geometric primitive,
     * starting with a custom instance identification number.
     * 
     * The command assigns each vertex a unique `vertex_id` value within its drawing instance
     * that increases from `vertexStart` through `(vertexStart + vertexCount - 1)`.
     * 
     * Additionally, the command assigns each drawing instance a unique `instance_id` value that increases
     * from `baseInstance` through `(baseInstance + instanceCount - 1)`.
     * 
     * Your vertex shader can use the `vertex_id` value to uniquely identify each vertex in each drawing instance, and
     * the
     * `instance_id` value to identify which instance that vertex belongs to.
     * 
     * - Parameters:
     * - primitiveType: A ``MTLPrimitiveType`` representing how the command interprets vertex argument data.
     * - vertexStart: The lowest value the command passes to your vertex shader function’s parameter with
     * the `vertex_id` attribute.
     * - vertexCount: An integer that represents the number of vertices of `primitiveType` the command draws.
     * - instanceCount: An integer that represents the number of times the command draws `primitiveType`
     * with `vertexCount` vertices.
     * - baseInstance: The lowest value the command passes to your vertex shader function’s parameter with
     * the `instance_id` attribute.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("drawPrimitives:vertexStart:vertexCount:instanceCount:baseInstance:")
    void drawPrimitivesVertexStartVertexCountInstanceCountBaseInstance(@NUInt long primitiveType,
            @NUInt long vertexStart, @NUInt long vertexCount, @NUInt long instanceCount, @NUInt long baseInstance);

    /**
     * Encodes a command that runs an indirect range of commands from an indirect command buffer.
     * 
     * Use this method to indicate to Metal the span of indices in the command buffer to execute indirectly via an
     * ``MTLBuffer`` instance you provide in the `indirectRangeBuffer` parameter. This allows you to calculate the
     * span of commands Metal executes in the GPU timeline, enabling GPU-driven workflows.
     * 
     * Metal requires that the contents of this buffer match the layout of struct
     * ``MTLIndirectCommandBufferExecutionRange``,
     * which specifies a location and a length within the indirect command buffer. You are responsible for ensuring the
     * address of this buffer has 4-byte alignment.
     * 
     * Use an instance of ``MTLResidencySet`` to mark residency of the indirect buffer that the `indirectRangeBuffer`
     * parameter references.
     * 
     * - Parameters:
     * - indirectCommandBuffer: A ``MTLIndirectCommandBuffer`` instance that contains other commands
     * the current command runs.
     * - indirectRangeBuffer: GPUAddress of a ``MTLBuffer`` instance with data that matches the layout of the
     * ``MTLIndirectCommandBufferExecutionRange`` structure. This address requires 4-byte alignment.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("executeCommandsInBuffer:indirectBuffer:")
    void executeCommandsInBufferIndirectBuffer(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLIndirectCommandBuffer indirectCommandBuffer,
            long indirectRangeBuffer);

    /**
     * Encodes a command that runs a range of commands from an indirect command buffer.
     * 
     * - Parameters:
     * - indirectCommandBuffer: A ``MTLIndirectCommandBuffer`` instance containing other commands that the current
     * command runs.
     * - executionRange: A span of integers that represent the command entries in the buffer that the current command
     * runs.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("executeCommandsInBuffer:withRange:")
    void executeCommandsInBufferWithRange(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLIndirectCommandBuffer indirectCommandBuffer,
            @ByValue NSRange executionRange);

    /**
     * Associates an argument table with a set of render stages.
     * 
     * Metal takes a snapshot of the resources in the argument table when you encode a draw, dispatch, or execute
     * command.
     * This snapshot becomes available to the `stages` you specify to this method.
     * 
     * - Parameters:
     * - argumentTable: ``MTL4ArgumentTable`` to set.
     * - stages: A ``MTLRenderStages`` bitmask that specifies the shader stages with visibility over the table.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setArgumentTable:atStages:")
    void setArgumentTableAtStages(@Mapped(ObjCObjectMapper.class) @NotNull MTL4ArgumentTable argumentTable,
            @NUInt long stages);

    /**
     * Configures each pixel component value, including alpha, for the render pipeline’s constant blend color.
     * 
     * - Parameters:
     * - red: A value for the red component for the blend color constant.
     * - green: A value for the green component for the blend color constant.
     * - blue: A value for the blue component for the blend color constant.
     * - alpha: A value for the alpha component for the blend color constant.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setBlendColorRed:green:blue:alpha:")
    void setBlendColorRedGreenBlueAlpha(float red, float green, float blue, float alpha);

    /**
     * Sets the mapping from logical shader color output to physical render pass color attachments.
     * 
     * Use this method to define how the physical color attachments you specify via
     * ``MTL4RenderPassDescriptor/colorAttachments``
     * map to the logical color output the fragment shader writes to.
     * 
     * To use this feature, make sure to set ``MTL4RenderPassDescriptor/supportColorAttachmentMapping`` to
     * <doc://com.apple.documentation/documentation/swift/true>.
     * 
     * - Parameter mapping: Mapping from logical shader outputs to physical outputs.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setColorAttachmentMap:")
    void setColorAttachmentMap(@Nullable MTLLogicalToPhysicalColorAttachmentMap mapping);

    /**
     * Configures the store action for a color attachment.
     * 
     * - Parameters:
     * - storeAction: A store action for the color attachment that
     * can’t be ``MTLStoreAction/MTLStoreActionUnknown``.
     * - colorAttachmentIndex: The index of a color attachment.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setColorStoreAction:atIndex:")
    void setColorStoreActionAtIndex(@NUInt long storeAction, @NUInt long colorAttachmentIndex);

    /**
     * Controls whether Metal culls front facing primitives, back facing primitives, or culls no primitives at all.
     * 
     * - Parameter cullMode: ``MTLCullMode`` to set.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setCullMode:")
    void setCullMode(@NUInt long cullMode);

    /**
     * Configures the adjustments a render pass applies to depth values from fragment shader functions
     * by a scaling factor and bias.
     * 
     * - Parameters:
     * - depthBias: A constant bias the render pipeline applies to all fragments.
     * - slopeScale: A bias coefficient that scales with the depth of the primitive relative to the camera.
     * - clamp: A value that limits the bias value the render pipeline can apply to a fragment.
     * Pass a positive or negative value to limit the largest magnitude of a positive
     * or negative bias, respectively. Set this value to `0` to disable bias clamping.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDepthBias:slopeScale:clamp:")
    void setDepthBiasSlopeScaleClamp(float depthBias, float slopeScale, float clamp);

    /**
     * Controls the behavior for fragments outside of the near or far planes.
     * 
     * - Parameter depthClipMode: ``MTLDepthClipMode`` to set.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDepthClipMode:")
    void setDepthClipMode(@NUInt long depthClipMode);

    /**
     * Configures this encoder with a depth stencil state that applies to your subsequent draw commands.
     * 
     * - Parameter depthStencilState: the ``MTLDepthStencilState`` instance to set.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDepthStencilState:")
    void setDepthStencilState(@Mapped(ObjCObjectMapper.class) @Nullable MTLDepthStencilState depthStencilState);

    /**
     * Configures the store action for the depth attachment.
     * 
     * - Parameter storeAction: A store action for the depth attachment that
     * can’t be ``MTLStoreAction/MTLStoreActionUnknown``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDepthStoreAction:")
    void setDepthStoreAction(@NUInt long storeAction);

    /**
     * Configures the minimum and maximum bounds for depth bounds testing.
     * 
     * The render command encoder disables depth bounds testing by default.
     * The render command encoder also disables depth bounds testing when all of the following properties equal a
     * specific value:
     * - The `minBound` property is equal to `0.0f`.
     * - The `maxBound` property is equal to `1.0f`.
     * Both `minBound` and `maxBound` need to be within `[0.0f, 1.0f]`, and `minBound` needs to be less than or equal to
     * `maxBound`.
     * - Parameters:
     * - minBound: A minimum bound for depth testing, which discards fragments with a stored depth that is less than
     * `minBound`.
     * - maxBound: A maximum bound for depth testing, which discards fragments with a stored depth that is greater than
     * `maxBound`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDepthTestMinBound:maxBound:")
    void setDepthTestMinBoundMaxBound(float minBound, float maxBound);

    /**
     * Configures the vertex winding order that determines which face of a geometric primitive is the front one.
     * 
     * - Parameter frontFacingWinding: A ``MTLWinding`` value that determines which side of a primitive the render
     * pipeline
     * interprets as front facing.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setFrontFacingWinding:")
    void setFrontFacingWinding(@NUInt long frontFacingWinding);

    /**
     * Configures the size of a threadgroup memory buffer for a threadgroup argument in the object shader function.
     * 
     * - Parameters:
     * - length: The size of the threadgroup memory, in bytes.
     * - index: An integer that corresponds to the index of the argument you annotate with attribute
     * `[[threadgroup(index)]]`
     * in the shader function.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setObjectThreadgroupMemoryLength:atIndex:")
    void setObjectThreadgroupMemoryLengthAtIndex(@NUInt long length, @NUInt long index);

    /**
     * Configures this encoder with a render pipeline state that applies to your subsequent draw commands.
     * 
     * - Parameter pipelineState: a non-`nil` ``MTLRenderPipelineState`` instance.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRenderPipelineState:")
    void setRenderPipelineState(@Mapped(ObjCObjectMapper.class) @NotNull MTLRenderPipelineState pipelineState);

    /**
     * Sets a scissor rectangle to discard fragments outside a specific area.
     * 
     * Metal performs a scissor test and discards all fragments outside of the scissor rect.
     * 
     * - Parameter rect: ``MTLScissorRect`` rectangle to specify. This rectangle needs to lie completely
     * within the current render attachment.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setScissorRect:")
    void setScissorRect(@ByValue MTLScissorRect rect);

    /**
     * Sets an array of scissor rectangles for a fragment scissor test.
     * 
     * Metal uses the specific scissor rectangle corresponding to the index you specify via the `[[ viewport_array_index
     * ]]`
     * output attribute of the vertex shader function in the Metal Shading Language, discarding all fragments outside of
     * the scissor rect.
     * 
     * - Parameters:
     * - scissorRects: Array of ``MTLScissorRect`` structures.
     * - count: Number of ``MTLScissorRect`` structures in the array.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setScissorRects:count:")
    void setScissorRectsCount(
            @UncertainArgument("Options: reference, array Fallback: reference") @NotNull MTLScissorRect scissorRects,
            @NUInt long count);

    /**
     * Configures the encoder with different stencil test reference values for front-facing and back-facing primitives.
     * 
     * The render pipeline applies `frontReferenceValue` to front-facing primitives and `backReferenceValue` to
     * back-facing primitives.
     * 
     * - Parameters:
     * - frontReferenceValue: A stencil test comparison value the render pipeline applies
     * to front-facing primitives.
     * - backReferenceValue: A stencil test comparison value the render pipeline applies
     * to back-facing primitives.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setStencilFrontReferenceValue:backReferenceValue:")
    void setStencilFrontReferenceValueBackReferenceValue(int frontReferenceValue, int backReferenceValue);

    /**
     * Configures this encoder with a reference value for stencil testing.
     * 
     * The render pipeline applies this reference value to both front-facing and back-facing primitives.
     * 
     * - Parameter referenceValue: A stencil test comparison value.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setStencilReferenceValue:")
    void setStencilReferenceValue(int referenceValue);

    /**
     * Configures the store action for the stencil attachment.
     * 
     * - Parameter storeAction: A store action for the stencil attachment that
     * can’t be ``MTLStoreAction/MTLStoreActionUnknown``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setStencilStoreAction:")
    void setStencilStoreAction(@NUInt long storeAction);

    /**
     * Configures the size of a threadgroup memory buffer for a threadgroup argument in the fragment and tile shader
     * functions.
     * 
     * - Parameters:
     * - length: The size of the threadgroup memory, in bytes.
     * - offset: An integer that represents the location, in bytes, from the start of the threadgroup memory buffer
     * at `index` where the threadgroup memory begins.
     * - index: An integer that corresponds to the index of the argument you annotate with attribute
     * `[[threadgroup(index)]]`
     * in the shader function.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setThreadgroupMemoryLength:offset:atIndex:")
    void setThreadgroupMemoryLengthOffsetAtIndex(@NUInt long length, @NUInt long offset, @NUInt long index);

    /**
     * Configures how subsequent draw commands rasterize triangle and triangle strip primitives.
     * 
     * - Parameter fillMode:``MTLTriangleFillMode`` the render pass applies to draw commands that
     * rasterize triangles or triangle strips.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTriangleFillMode:")
    void setTriangleFillMode(@NUInt long fillMode);

    /**
     * Sets the vertex amplification count and its view mapping for each amplification ID.
     * 
     * Each view mapping element describes how to route the corresponding amplification ID to a specific viewport and
     * render target array index by using offsets from the base array index provided by the `[[
     * render_target_array_index ]]`
     * and/or `[[ viewport_array_index ]]` output attributes in the vertex shader. This allows Metal to route each
     * amplified
     * vertex to a different `[[ render_target_array_index ]]` and `[[ viewport_array_index ]]`, even though you can't
     * directly amplify these attributes.
     * 
     * - Parameters:
     * - count: The number of outputs to create. The maximum value is `2`.
     * - viewMappings: Array of ``MTLVertexAmplificationViewMapping`` instances. Each instance provides
     * per-output offsets to a specific render target and viewport.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setVertexAmplificationCount:viewMappings:")
    void setVertexAmplificationCountViewMappings(@NUInt long count,
            @UncertainArgument("Options: reference, array Fallback: reference") @Nullable MTLVertexAmplificationViewMapping viewMappings);

    /**
     * Sets the viewport which that transforms vertices from normalized device coordinates to window coordinates.
     * 
     * Metal clips fragments that lie outside this viewport, and optionally clamps fragments outside of z-near/z-far
     * range
     * depending on the value you assign to ``setDepthClipMode:``.
     * 
     * - Parameter viewport: ``MTLViewport`` to set.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setViewport:")
    void setViewport(@ByValue MTLViewport viewport);

    /**
     * Sets an array of viewports to transform vertices from normalized device coordinates to window coordinates.
     * 
     * Metal clips fragments that lie outside of the viewport, and optionally clamps fragments outside of z-near/z-far
     * range,
     * depending on the value you assign to ``setDepthClipMode:``.
     * 
     * Metal selects the viewport to use from the `[[ viewport_array_index ]]` attribute you specify in the pipeline
     * state's vertex shader function in the Metal Shading Language.
     * 
     * - Parameters:
     * - viewports: Array of ``MTLViewport`` instances.
     * - count: Number of ``MTLViewport`` instances in the array.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setViewports:count:")
    void setViewportsCount(
            @UncertainArgument("Options: reference, array Fallback: reference") @NotNull MTLViewport viewports,
            @NUInt long count);

    /**
     * Configures a visibility test for Metal to run, and the destination for any results it generates.
     * 
     * You use the `mode` parameter to enable or disable the visibility test, and determine if it produces a boolean
     * response for passing fragments, or if it counts the number of fragments.
     * 
     * - Parameters:
     * - mode: A ``MTLVisibilityResultMode`` that configures which visibility test results
     * the render pass saves to a buffer, or disables visibility testing.
     * - offset: A location, in bytes, relative to the start of
     * ``MTL4RenderPassDescriptor/visibilityResultBuffer`` The GPU stores
     * the result of a visibility test at `offset`, which needs to be a multiple of `8`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setVisibilityResultMode:offset:")
    void setVisibilityResultModeOffset(@NUInt long mode, @NUInt long offset);

    /**
     * Sets the height of a tile for this render pass.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("tileHeight")
    @NUInt
    long tileHeight();

    /**
     * Sets the width of a tile for this render pass.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("tileWidth")
    @NUInt
    long tileWidth();

    /**
     * Writes a GPU timestamp into the given ``MTL4CounterHeap`` at `index` after `stage` completes.
     * 
     * This command only guarantees all draws prior to this command are complete when Metal writes the timestamp into
     * the counter heap you provide in the `counterHeap` parameter. The timestamp may also include subsequent
     * operations.
     * 
     * If you call this method before any draw calls, Metal writes a timestamp before the stage you specify in the
     * `stage` parameter begins.
     * 
     * - Parameters:
     * - granularity: a ``MTL4TimestampGranularity`` hint.
     * - stage: ``MTLRenderStages`` that need to complete before Metal writes the timestamp. This may also include later
     * stages that are related, for example ``MTLRenderStages/MTLRenderStageMesh`` may include
     * ``MTLRenderStages/MTLRenderStageVertex``.
     * - counterHeap: ``MTL4CounterHeap`` into which Metal writes timestamps.
     * - index: The index value into which Metal writes this timestamp.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("writeTimestampWithGranularity:afterStage:intoHeap:atIndex:")
    void writeTimestampWithGranularityAfterStageIntoHeapAtIndex(@NInt long granularity, @NUInt long stage,
            @Mapped(ObjCObjectMapper.class) @NotNull MTL4CounterHeap counterHeap, @NUInt long index);
}