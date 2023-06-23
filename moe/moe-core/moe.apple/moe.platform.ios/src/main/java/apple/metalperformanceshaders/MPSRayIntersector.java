package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.metal.protocol.MTLBuffer;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLTexture;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSRayIntersector
 * 
 * Performs intersection tests between rays and the geometry in an MPSAccelerationStructure
 * 
 * An MPSRayIntersector is used to schedule intersection tests between rays and geometry
 * into an MTLCommandBuffer. First, create a raytracer with a Metal device. Then, configure the
 * properties of the raytracer:
 * 
 * [@code]
 * id <MTLDevice> device = MTLCreateSystemDefaultDevice();
 * id <MTLCommandQueue> commandQueue = [device newCommandQueue];
 * 
 * MPSRayIntersector *raytracer = [[MPSRayIntersector alloc] initWithDevice:device];
 * 
 * // Configure raytracer properties
 * [@endcode]
 * 
 * Before scheduling intersection tests, an MPSAccelerationStructure must be created. The
 * acceleration structure is built over geometry and is used to accelerate intersection testing.
 * For example, to create a triangle acceleration structure, allocate an
 * MPSTriangleAccelerationStructure object. Then, configure the properties of the acceleration
 * structure. For example, triangle acceleration structures require a vertex buffer and a triangle
 * count:
 * 
 * [@code]
 * MPSTriangleAccelerationStructure *accelerationStructure =
 * [[MPSTriangleAccelerationStructure alloc] initWithDevice:device];
 * 
 * accelerationStructure.vertexBuffer = vertexBuffer;
 * accelerationStructure.triangleCount = triangleCount;
 * [@endcode]
 * 
 * Acceleration structures must be built at least once before they are used for intersection
 * testing, and must be rebuilt when the geometry changes. Rebuilding an acceleration structure
 * is a time consuming operation, so an asynchronous version of this method is also available.
 * 
 * [@code]
 * [accelerationStructure rebuild];
 * [@endcode]
 * 
 * The raytracer is then used to schedule intersection tests into an MTLCommandBuffer. Rays
 * are provided in batches through a Metal buffer, and intersection results are returned through
 * another Metal buffer in the same order, one intersection per ray.
 * 
 * There are several choices of ray data type controlled by the rayDataType property. The default
 * ray data type is MPSRayOriginDirection, which includes just the ray origin direction. The other
 * data types add support for minimum and maximum intersection distances and ray masks. These
 * data types are available in the Metal Shading Language by including the
 * MetalPerformanceShaders/MetalPerformanceShaders.h header. Additional application specific
 * per-ray data can also be appended to the end of the ray data type using the rayStride property.
 * This data will be ignored by the intersector.
 * 
 * If the rays were generated on the CPU:
 * 
 * [@code]
 * typedef MPSRayOriginDirection Ray;
 * 
 * // Create a buffer to hold the rays
 * id <MTLBuffer> rayBuffer = [device newBufferWithLength:sizeof(Ray) * rayCount options:0];
 * 
 * // Copy the rays into the ray buffer
 * memcpy(rayBuffer.contents, rays, sizeof(Ray) * rayCount);
 * 
 * // Create a buffer to hold the intersections
 * id <MTLBuffer> intersectionBuffer = [device newBufferWithLength:sizeof(Intersection) * rayCount
 * options:0];
 * [@endcode]
 * 
 * It can be useful to prevent certain rays from participating in intersection testing. For
 * example: rays which have bounced out of the scene in previous intersection tests. It may be
 * more efficient to do this by compacting the ray buffer so that threads with invalid rays are
 * not left idle during intersection testing. However, it can be more convenient to disable the
 * ray in place. This can be done by setting most fields to invalid values. For example, setting
 * the maximum distance to a negative value, setting the mask to zero, setting the direction to
 * the zero vector, etc.
 * 
 * Finally, the intersection testing is encoded into an MTLCommandBuffer. There are two
 * intersection types. The "nearest" intersection type returns the closest intersection along each
 * ray. The "any" intersection type returns immediately when the first intersection is found. The
 * "any" intersection type is useful for determining whether a point is visible from another point
 * for, e.g., shadow rays or ambient occlusion rays and is typically much faster than the "nearest"
 * intersection type.
 * 
 * [@code]
 * id <MTLCommandBuffer> commandBuffer = [commandQueue commandBuffer];
 * 
 * [raytracer encodeIntersectionToCommandBuffer:commandBuffer
 * intersectionType:MPSIntersectionTypeNearest
 * rayBuffer:rayBuffer
 * rayBufferOffset:0
 * intersectionBuffer:intersectionBuffer
 * intersectionBufferOffset:0
 * rayCount:rayCount
 * accelerationStructure:accelerationStructure];
 * 
 * [commandBuffer commit];
 * [@endcode]
 * 
 * The intersection results are not available until the command buffer has finished executing
 * on the GPU. It is not safe for the CPU to write or read the contents of the ray buffer,
 * intersection buffer, vertex buffer, etc. until the command buffer has finished executing.
 * Use the waitUntilCompleted or addCompletedHandler methods of the MTLCommandBuffer to block
 * the CPU until the GPU has finished executing. Then retrieve the intersection results
 * from the intersection buffer:
 * 
 * [@code]
 * typedef MPSIntersectionDistancePrimitiveIndexCoordinates Intersection;
 * [@endcode]
 * 
 * [@code]
 * [commandBuffer waitUntilCompleted];
 * 
 * Intersection *intersections = (Intersection *)intersectionBuffer.contents;
 * [@endcode]
 * 
 * There are also several choices of intersection data type controlled by the intersectionDataType
 * property. The default intersection data type is MPSIntersectionDistancePrimitiveIndexCoordinates,
 * which includes the intersection distance, primitive index, and barycentric coordinates. The
 * other data types remove the primitive index or barycentric coordinates, which can be used to
 * reduce the memory and memory bandwidth usage of the intersection buffer. These data types are
 * available in the Metal Shading Language by including the
 * MetalPerformanceShaders/MetalPerformanceShaders.h header.
 * 
 * The intersection distance field is positive when an intersection has been found and negative
 * when there is no intersection. When using the "nearest" intersection type, the intersection
 * point is the ray origin plus the ray direction multiplied by the intersection distance. The
 * other fields are not valid if there is no intersection. Only the intersection distance field is
 * valid for the "any" intersection type, and the distance is either a negative or positive value
 * to indicate an intersection or miss. It does not necessarily contain the actual intersection
 * distance when using the "any" intersection type.
 * 
 * Asynchronous Raytracing: Copying rays and intersections to and from the CPU is expensive.
 * Furthermore, generating rays and consuming intersections on the CPU causes the CPU and GPU to
 * block each other. If the CPU must generate rays and consume intersections, it is better
 * to add an asynchronous completion handler to the MTLCommandBuffer. The CPU can then proceed
 * to do other useful work and will be notified when the GPU has finished executing. Use double
 * or triple buffered ray and intersection buffers to avoid race conditions such as the CPU
 * overwriting data the GPU may be reading. Then the CPU can safely write to one range of the
 * buffer while the GPU reads from another range of the buffer. Once the GPU is done
 * executing, the CPU and GPU can advance to the next range of the buffer. This method can be
 * implemented using a completion handler and a semaphore:
 * 
 * [@code]
 * #define MAX_ASYNC_OPERATIONS 3
 * 
 * // Initialization:
 * 
 * // Create a semaphore with the maximum number of asynchronous operations in flight
 * dispatch_semaphore_t asyncOperationSemaphore = dispatch_semaphore_create(MAX_ASYNC_OPERATIONS);
 * 
 * // Create a ray and intersection buffer large enough for the maximum number of operations
 * id <MTLBuffer> rayBuffer =
 * [device newBufferWithLength:sizeof(Ray) * rayCount * MAX_ASYNC_OPERATIONS
 * options:0];
 * 
 * id <MTLBuffer> intersectionBuffer =
 * [device newBufferWithLength:sizeof(Intersection) * rayCount * MAX_ASYNC_OPERATIONS
 * options:0];
 * 
 * NSUInteger asyncOperationIndex = 0;
 * 
 * // Encode intersection testing:
 * 
 * // Wait until there is a free buffer range
 * dispatch_semaphore_wait(asyncOperationSemaphore, DISPATCH_TIME_FOREVER);
 * 
 * // Copy rays into ray buffer
 * NSUInteger rayBufferOffset = sizeof(Ray) * rayCount * asyncOperationIndex;
 * NSUInteger intersectionBufferOffset = sizeof(Intersection) * rayCount * asyncOperationIndex;
 * 
 * memcpy((uint8_t *)rayBuffer.contents + rayBufferOffset, rays, sizeof(Ray) * rayCount);
 * 
 * // Advance the async operation index
 * asyncOperationIndex = (asyncOperationIndex + 1) % MAX_ASYNC_OPERATIONS;
 * 
 * // Create a command buffer
 * id <MTLCommandBuffer> commandBuffer = [commandQueue commandBuffer];
 * 
 * // Encode actual intersection work
 * [raytracer encodeIntersectionToCommandBuffer:commandBuffer
 * intersectionType:MPSIntersectionTypeNearest
 * rayBuffer:rayBuffer
 * rayBufferOffset:rayBufferOffset
 * intersectionBuffer:intersectionBuffer
 * intersectionBufferOffset:intersectionBufferOffset
 * rayCount:rayCount
 * accelerationStructure:accelerationStructure];
 * 
 * // Register a completion handler to run when the GPU finishes executing
 * [commandBuffer addCompletedHandler:^(id <MTLCommandBuffer> commandBuffer) {
 * Intersection *intersections = (Intersection *)((uint8_t *)intersectionBuffer.contents +
 * intersectionBufferOffset);
 * 
 * // Process intersections
 * 
 * // Signal that the ray and intersection buffer ranges are now available for reuse
 * dispatch_semaphore_signal(asyncOperationSemaphore);
 * }];
 * 
 * // Commit the command buffer to allow the GPU to start executing
 * [commandBuffer commit];
 * [@endcode]
 * 
 * GPU Driven Raytracing: Pipelining CPU and GPU work with asynchronous raytracing is better than
 * allowing the CPU and GPU block each other, but it is even better to produce rays and consume
 * intersections entirely on the GPU. This avoids the need to copy rays and intersections to and
 * from the GPU and avoids any kind of CPU/GPU synchronization. To do this, encode compute kernels
 * before and after intersection testing. By processing rays in parallel, the compute kernels may
 * also be able to generate and consume rays faster than the CPU. The ray generation kernel
 * typically produces rays according to some camera model, and the intersection consumption kernel
 * typically updates the output buffer or texture according to some shading model.
 * 
 * Since the rays and intersections will never leave the GPU, store them in private Metal buffers
 * that are allocated in GPU memory rather than system memory. Because the ray generation,
 * intersection testing, and intersection consumption kernels are pipelined on the GPU, there
 * is no need to double or triple buffer the ray or intersection buffers, which saves memory.
 * 
 * [@code]
 * id <MTLBuffer> rayBuffer =
 * [device newBufferWithLength:sizeof(Ray) * rayCount
 * options:MTLResourceStorageModePrivate];
 * id <MTLBuffer> intersectionBuffer =
 * [device newBufferWithLength:sizeof(Intersection) * rayCount
 * options:MTLResourceStorageModePrivate];
 * 
 * id <MTLCommandBuffer> commandBuffer = [commandQueue commandBuffer];
 * 
 * // Generate rays
 * id <MTLComputeCommandEncoder> encoder = [commandBuffer computeCommandEncoder];
 * 
 * [encoder setBuffer:rayBuffer offset:0 atIndex:0];
 * [encoder setBytes:&uniformData length:sizeof(uniformData) atIndex:1];
 * 
 * [encoder setComputePipelineState:cameraPipeline];
 * 
 * [encoder dispatchThreads:MTLSizeMake(rayCount, 1, 1)
 * threadsPerThreadgroup:MTLSizeMake(64, 1, 1)];
 * 
 * [encoder endEncoding];
 * 
 * [raytracer encodeIntersectionToCommandBuffer:commandBuffer
 * intersectionType:MPSIntersectionTypeNearest
 * rayBuffer:rayBuffer
 * rayBufferOffset:0
 * intersectionBuffer:intersectionBuffer
 * intersectionBufferOffset:0
 * rayCount:rayCount
 * accelerationStructure:accelerationStructure];
 * 
 * // Perform shading at intersections and update framebuffer texture
 * encoder = [commandBuffer computeCommandEncoder];
 * 
 * [encoder setBuffer:rayBuffer offset:0 atIndex:0];
 * [encoder setBuffer:intersectionBuffer offset:0 atIndex:1];
 * [encoder setBytes:&uniformData length:sizeof(uniformData) atIndex:2];
 * 
 * [encoder setTexture:framebufferTexture atIndex:0];
 * 
 * [encoder setComputePipelineState:shadingPipeline];
 * 
 * [encoder dispatchThreads:MTLSizeMake(rayCount, 1, 1)
 * threadsPerThreadgroup:MTLSizeMake(64, 1, 1)];
 * 
 * [encoder endEncoding];
 * 
 * [commandBuffer commit];
 * [@endcode]
 * 
 * Note that the intersection consumption kernel can in turn produce new rays that can be passed
 * back to the MPSRayIntersector. This technique can be used to implement iterative techniques such as
 * progressive path tracing without leaving the GPU. For example, the shading kernel in the example
 * above could produce both a secondary ray that will be passed back to the raytracer in the
 * next iteration as well as a shadow ray that will be used to sample the direct lighting. A
 * final kernel can consume the shadow ray intersections to accumulate lighting contributions
 * into the framebuffer.
 * 
 * There is an alternative version of the intersection test encoding method that does not accept
 * a literal ray count. The ray count is instead fetched indirectly by the GPU. For example,
 * this can be combined with a parallel reduction on the GPU to compact the ray buffer after each
 * iteration as rays bounce out of the scene or are absorbed. Alternatively, setting the maximum
 * distance of a ray to a negative number indicates that the ray has become inactive and causes the
 * raytracer to ignore the ray.
 * 
 * [@code]
 * [raytracer encodeIntersectionToCommandBuffer:commandBuffer
 * intersectionType:MPSIntersectionTypeNearest
 * rayBuffer:rayBuffer
 * rayBufferOffset:0
 * intersectionBuffer:intersectionBuffer
 * intersectionBufferOffset:0
 * rayCountBuffer:rayCountBuffer
 * rayCountBufferOffset:0
 * accelerationStructure:accelerationStructure];
 * [@endcode]
 * 
 * Multi-GPU Raytracing: to implement multi-GPU raytracing, create the MPSRayIntersector and
 * MPSAccelerationStructure objects first with one Metal device and copy them to the other Metal
 * device(s). The raytracing process can then proceed independently on each GPU. For example,
 * divide the output image into tiles or slices that are rendered independently. Then composite
 * finished tiles or slices back together on one GPU and present the output image to the screen.
 * The workload should be distributed across GPUs according to their performance to avoid a more
 * powerful GPU idly waiting for a less powerful GPU to finish.
 * 
 * Acceleration Structure Serialization: MPSAccelerationStructure objects can be serialized
 * and deserialized using the NSSecureCoding protocol. This can be used to build acceleration
 * structures offline and reload them at runtime rather than building them from scratch.
 * 
 * Performance Guidelines:
 * 
 * - For vertex buffers, ray buffers, intersection buffers, etc., use private or managed
 * buffers rather than shared buffers when possible on discrete memory GPU architectures as
 * they are much faster than fetching data over the PCIe bus. If the CPU only writes once
 * to a ray buffer once and reads once from the intersection buffer, then a shared buffer may
 * be acceptable and avoids extra copies to and from the GPU. However, it is generally
 * preferable to generate and consume rays and intersections on the GPU instead, in which
 * case a private buffer should be used. Vertex data is typically static and reused many
 * times so it should be stored in private or managed buffers.
 * 
 * - If the CPU must generate and consume rays and intersections, use double or triple
 * buffering as described above. This avoids the CPU and GPU mutually blocking each other.
 * 
 * - In general, disable any unused features such as ray masks, backface culling,
 * etc. Enabling extra features increases the number of instructions and register usage of
 * the ray intersection kernel(s), reducing intersection performance. For example, it may be
 * more efficient to compute barycentric coordinates in your intersection consumption
 * kernel rather getting them from the raytracer. Use of an index buffer may also reduce
 * performance, so consider disabling the index buffer if there is enough memory available.
 * 
 * - Try to submit rays in large batches. This amortizes the costs involved in dispatching
 * work to the GPU and also allows the GPU to perform more effective latency hiding.
 * Use the recommendedMinimumRayBatchSizeForRayCount method to get an estimate of the
 * minimum recommended ray batch size. For this reason, small images or sample counts
 * may not perform as well as large images or sample counts. Note, however, that submitting
 * rays in very large batches can reduce the responsiveness of the system because the GPU
 * will be busy for long periods. Experiment to find a balance between raytracing throughput
 * and system responsiveness.
 * 
 * - When possible, organize rays within a batch for spatial locality. Rays that originate
 * at nearby points or are oriented in similar directions tend to access the same
 * locations in memory and can therefore make more effective use of the GPU's caches.
 * For example, the camera rays associated with nearby pixels in the output image will likely
 * originate at the same point and travel in very similar directions. Therefore, divide the
 * output image into small tiles (e.g., 8x8). Rather than laying out all of the rays in the
 * ray buffer in scanline order, first lay out the ray in scanline order within each tile,
 * then lay out the tiles in scanline order or according to some space filling curve.
 * 
 * - If CPU encode time is an issue, disable Metal API validation and enable
 * MPSKernelOptionsSkipAPIValidation.
 * 
 * - Choose the minimal ray and intersection data types for your use case. Loading and storing
 * extra values such as ray masks or primitive indices can reduce raytracing performance, so
 * use a simpler data type if they are not needed. For example, camera rays typically have no
 * need for a maximum distance field, while shadow rays do.
 * 
 * - Use MPSIntersectionTestTypeAny when possible: this is typically much faster than
 * MPSIntersectionTestTypeNearest and can be used when you only need to check for
 * binary visibility between two points such as shadow and ambient occlusion rays. Combine
 * this with MPSRayDataTypeDistance to minimize memory bandwidth usage.
 * 
 * - Try to keep the geometry, textures, ray buffers, etc. within the Metal device's
 * recommended working set size. Paging data into GPU memory can significantly reduce
 * raytracing performance.
 * 
 * - Changes to MPSRayIntersector properties can trigger internal pipeline compilations when
 * intersection tests are next encoded. If you need to avoid hitches due to pipeline
 * compilation, encode a small ray intersection with each raytracer configuration you will
 * use at encode-time. This creates and caches the corresponding pipelines.
 * 
 * - Disable rays which should not participate in intersection testing. This can be done either
 * by compacting the ray buffer such that it only contains valid rays, or by setting fields
 * of the ray struct to invalid values. For example, setting the maximum distance to a
 * negative value, setting the mask to zero, setting the direction to the zero vector, etc.
 * In particular, rays should NOT be disabled using schemes such as moving their origin
 * outside the scene. These rays will still partially traverse the acceleration structure,
 * potentially evicting data from the cache which could have been used by valid rays. Note
 * that it is preferable to provide only valid rays so that threads are not left idle if
 * their rays are found to be invalid, but it can be convenient to disable rays in place in
 * the ray buffer.
 * 
 * See MPSAccelerationStructure and MPSInstanceAccelerationStructure for more performance
 * guidelines.
 * 
 * Thread Safety: MPSRayIntersectors are generally not thread safe: changing properties and encoding
 * intersection tests from multiple threads result in undefined behavior. Instead, multiple
 * threads should copy or create their own MPSRayIntersectors.
 * 
 * API-Since: 12.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSRayIntersector extends MPSKernel implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSRayIntersector(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSRayIntersector alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSRayIntersector allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Ray/bounding box intersection test type. Defaults to
     * MPSBoundingBoxIntersectionTestTypeDefault.
     */
    @Generated
    @Selector("boundingBoxIntersectionTestType")
    @NUInt
    public native long boundingBoxIntersectionTestType();

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * Copy the raytracer with a Metal device
     * 
     * @param zone   The NSZone in which to allocate the object
     * @param device The Metal device for the new MPSRayIntersector
     * 
     * @return A pointer to a copy of this MPSRayIntersector
     */
    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:device:")
    public native MPSRayIntersector copyWithZoneDevice(@Nullable VoidPtr zone,
            @Nullable @Mapped(ObjCObjectMapper.class) MTLDevice device);

    /**
     * Whether to ignore intersections between rays and back-facing or front-facing triangles
     * or quadrilaterals. Defaults to MTLCullModeNone.
     * 
     * A triangle or quadrilateral is back-facing if its normal points in the same
     * direction as a ray and front-facing if its normal points in the opposite direction as a ray. If
     * the cull mode is set to MTLCullModeBack, then back-facing triangles and quadrilaterals will be
     * ignored. If the cull mode is set to MTLCullModeFront, then front-facing triangles and
     * quadrilaterals will be ignored. Otherwise, if the cull mode is set to MTLCullModeNone, no
     * triangles or quadrilaterals will be ignored. The front and back faces can be swapped using the
     * frontFacingWinding property.
     * 
     * Backface culling is necessary for some scenes but can reduce raytracing performance.
     */
    @Generated
    @Selector("cullMode")
    @NUInt
    public native long cullMode();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Schedule intersection tests between rays and an acceleration structure
     * 
     * @param commandBuffer            Command buffer to schedule intersection testing in
     * @param intersectionType         Which type of intersection to test for
     * @param rayBuffer                Buffer containing rays to intersect against the acceleration
     *                                 structure. The ray data type is defined by the rayDataType
     *                                 and rayStride properties.
     * @param rayBufferOffset          Offset, in bytes, into the ray buffer. Must be a multiple of
     *                                 the ray stride.
     * @param intersectionBuffer       Buffer to store intersection in. Intersections are stored in
     *                                 the same order as the ray buffer, one intersection per ray.
     *                                 The intersection data type is defined by the
     *                                 intersectionDataType and intersectionStride properties.
     * @param intersectionBufferOffset Offset, in bytes, into the intersection buffer. Must be a
     *                                 multiple of the intersection stride.
     * @param rayCount                 Number of rays
     * @param accelerationStructure    Acceleration structure to test against
     */
    @Generated
    @Selector("encodeIntersectionToCommandBuffer:intersectionType:rayBuffer:rayBufferOffset:intersectionBuffer:intersectionBufferOffset:rayCount:accelerationStructure:")
    public native void encodeIntersectionToCommandBufferIntersectionTypeRayBufferRayBufferOffsetIntersectionBufferIntersectionBufferOffsetRayCountAccelerationStructure(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NUInt long intersectionType,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer rayBuffer, @NUInt long rayBufferOffset,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer intersectionBuffer, @NUInt long intersectionBufferOffset,
            @NUInt long rayCount, @NotNull MPSAccelerationStructure accelerationStructure);

    /**
     * Schedule intersection tests between rays and an acceleration structure with a ray count
     * provided in a buffer
     * 
     * @param commandBuffer            Command buffer to schedule intersection testing in
     * @param intersectionType         Which type of intersection to test for
     * @param rayBuffer                Buffer containing rays to intersect against the acceleration
     *                                 structure. The ray data type is defined by the rayDataType
     *                                 and rayStride properties.
     * @param rayBufferOffset          Offset, in bytes, into the ray buffer. Must be a multiple of
     *                                 the ray stride.
     * @param intersectionBuffer       Buffer to store intersection in. Intersections are stored in
     *                                 the same order as the ray buffer, one intersection per ray.
     *                                 The intersection data type is defined by the
     *                                 intersectionDataType and intersectionStride properties.
     * @param intersectionBufferOffset Offset, in bytes, into the intersection buffer. Must be a
     *                                 multiple of the intersection stride.
     * @param rayCountBuffer           Buffer containing number of rays as a 32 bit unsigned integer
     * @param rayCountBufferOffset     Offset, in bytes, into the ray count buffer. Must be a multiple
     *                                 of 4 bytes.
     * @param accelerationStructure    Acceleration structure to test against
     */
    @Generated
    @Selector("encodeIntersectionToCommandBuffer:intersectionType:rayBuffer:rayBufferOffset:intersectionBuffer:intersectionBufferOffset:rayCountBuffer:rayCountBufferOffset:accelerationStructure:")
    public native void encodeIntersectionToCommandBufferIntersectionTypeRayBufferRayBufferOffsetIntersectionBufferIntersectionBufferOffsetRayCountBufferRayCountBufferOffsetAccelerationStructure(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NUInt long intersectionType,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer rayBuffer, @NUInt long rayBufferOffset,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer intersectionBuffer, @NUInt long intersectionBufferOffset,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer rayCountBuffer, @NUInt long rayCountBufferOffset,
            @NotNull MPSAccelerationStructure accelerationStructure);

    /**
     * Schedule intersection tests between rays and an acceleration structure
     * 
     * @param commandBuffer            Command buffer to schedule intersection testing in
     * @param intersectionType         Which type of intersection to test for
     * @param rayBuffer                Buffer containing rays to intersect against the acceleration
     *                                 structure. The ray data type is defined by the rayDataType
     *                                 and rayStride properties.
     * @param rayBufferOffset          Offset, in bytes, into the ray buffer. Must be a multiple of
     *                                 the ray stride.
     * @param rayIndexBuffer           Buffer containing ray indices. Each index references a ray in
     *                                 the ray buffer. The ray index data type is controlled by the
     *                                 rayIndexDataType property.
     * @param rayIndexBufferOffset     Offset, in bytes, into the ray index buffer. Must be a multiple
     *                                 of the stride of the ray index type.
     * @param intersectionBuffer       Buffer to store intersection in. Intersections are stored in
     *                                 the same order as the ray buffer, one intersection per ray.
     *                                 The intersection data type is defined by the
     *                                 intersectionDataType and intersectionStride properties.
     * @param intersectionBufferOffset Offset, in bytes, into the intersection buffer. Must be a
     *                                 multiple of the intersection stride.
     * @param rayIndexCount            Number of ray indices
     * @param accelerationStructure    Acceleration structure to test against
     * 
     *                                 API-Since: 13.0
     */
    @Generated
    @Selector("encodeIntersectionToCommandBuffer:intersectionType:rayBuffer:rayBufferOffset:rayIndexBuffer:rayIndexBufferOffset:intersectionBuffer:intersectionBufferOffset:rayIndexCount:accelerationStructure:")
    public native void encodeIntersectionToCommandBufferIntersectionTypeRayBufferRayBufferOffsetRayIndexBufferRayIndexBufferOffsetIntersectionBufferIntersectionBufferOffsetRayIndexCountAccelerationStructure(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NUInt long intersectionType,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer rayBuffer, @NUInt long rayBufferOffset,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer rayIndexBuffer, @NUInt long rayIndexBufferOffset,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer intersectionBuffer, @NUInt long intersectionBufferOffset,
            @NUInt long rayIndexCount, @NotNull MPSAccelerationStructure accelerationStructure);

    /**
     * Schedule intersection tests between rays and an acceleration structure with a ray count
     * provided in a buffer
     * 
     * @param commandBuffer             Command buffer to schedule intersection testing in
     * @param intersectionType          Which type of intersection to test for
     * @param rayBuffer                 Buffer containing rays to intersect against the acceleration
     *                                  structure. The ray data type is defined by the rayDataType
     *                                  and rayStride properties.
     * @param rayBufferOffset           Offset, in bytes, into the ray buffer. Must be a multiple of
     *                                  the ray stride.
     * @param rayIndexBuffer            Buffer containing ray indices. Each index references a ray in
     *                                  the ray buffer. The ray index data type is controlled by the
     *                                  rayIndexDataType property.
     * @param rayIndexBufferOffset      Offset, in bytes, into the ray index buffer. Must be a multiple
     *                                  of the stride of the ray index type.
     * @param intersectionBuffer        Buffer to store intersection in. Intersections are stored in
     *                                  the same order as the ray buffer, one intersection per ray.
     *                                  The intersection data type is defined by the
     *                                  intersectionDataType and intersectionStride properties.
     * @param intersectionBufferOffset  Offset, in bytes, into the intersection buffer. Must be a
     *                                  multiple of the intersection stride.
     * @param rayIndexCountBuffer       Buffer containing number of rays as a 32 bit unsigned integer
     * @param rayIndexCountBufferOffset Offset, in bytes, into the ray count buffer. Must be a multiple
     *                                  of 4 bytes.
     * @param accelerationStructure     Acceleration structure to test against
     * 
     *                                  API-Since: 13.0
     */
    @Generated
    @Selector("encodeIntersectionToCommandBuffer:intersectionType:rayBuffer:rayBufferOffset:rayIndexBuffer:rayIndexBufferOffset:intersectionBuffer:intersectionBufferOffset:rayIndexCountBuffer:rayIndexCountBufferOffset:accelerationStructure:")
    public native void encodeIntersectionToCommandBufferIntersectionTypeRayBufferRayBufferOffsetRayIndexBufferRayIndexBufferOffsetIntersectionBufferIntersectionBufferOffsetRayIndexCountBufferRayIndexCountBufferOffsetAccelerationStructure(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NUInt long intersectionType,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer rayBuffer, @NUInt long rayBufferOffset,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer rayIndexBuffer, @NUInt long rayIndexBufferOffset,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer intersectionBuffer, @NUInt long intersectionBufferOffset,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer rayIndexCountBuffer,
            @NUInt long rayIndexCountBufferOffset, @NotNull MPSAccelerationStructure accelerationStructure);

    /**
     * Schedule intersection tests between rays and an acceleration structure, where rays and
     * loaded from a texture and intersections are stored into a texture.
     * 
     * This is convenient for hybrid rendering applications which produce ray data from a fragment
     * shader. The ray and intersection texture must be 2D array textures. Ray data must be packed into
     * consecutive channels and slices of the ray texture. Intersection data will be packed the same
     * way. The ray and intersection data types are defined by the rayDataType and intersectionDataType
     * properties. The rayStride and intersectionStride properties are ignored. Channels and slices
     * beyond the required number are ignored when reading from the ray texture. Channels and slices
     * beyond the required number are undefined when writing to the intersection texture.
     * 
     * For example, if the ray data type is MPSRayDataTypeOriginMaskDirectionMaxDistance, the ray
     * texture must have pixel format MTLPixelFormatRGBA32Float and at least two array slices, packed
     * as follows:
     * 
     * [@code]
     * tex.write(float4(ray.position, as_type<float>(ray.mask)), pixel, 0); // slice 0
     * tex.write(float4(ray.direction, ray.maxDistance), pixel, 1); // slice 1
     * [@end]
     * 
     * If the intersection data type is MPSIntersectionDataTypeDistance, the intersection texture may
     * have pixel format MTLPixelFormatR32Float with just a single channel and one array slice, and
     * should be unpacked as follows:
     * 
     * [@code]
     * float distance = tex.read(pixel, 0).x;
     * [@end]
     * 
     * On the other hand, if the intersection data type is
     * MPSIntersectionDistancePrimitiveIndexInstanceIndexCoordinates, the intersection texture must
     * have pixel format MTLPixelFormatRGBA32Float and at least two slices:
     * 
     * [@code]
     * float3 f0 = tex.read(pixel, 0);
     * 
     * float distance = f0.x;
     * unsigned int primitiveIndex = as_type<unsigned int>(f0.y);
     * unsigned int instanceIndex = as_type<unsigned int>(f0.z);
     * // w component is padding for this intersection data type
     * 
     * float2 coordinates = tex.read(pixel, 1).xy;
     * [@end]
     * 
     * @param commandBuffer         Command buffer to schedule intersection testing in
     * @param intersectionType      Which type of intersection to test for
     * @param rayTexture            A 2D array texture containing rays to intersect against the
     *                              acceleration structure. The ray data type is defined by the
     *                              rayDataType property.
     * @param intersectionTexture   Texture to store intersection in. Intersections are stored in
     *                              the same position as the ray texture, one intersection per ray.
     *                              The intersection data type is defined by the
     *                              intersectionDataType property.
     * @param accelerationStructure Acceleration structure to test against
     * 
     *                              API-Since: 13.0
     */
    @Generated
    @Selector("encodeIntersectionToCommandBuffer:intersectionType:rayTexture:intersectionTexture:accelerationStructure:")
    public native void encodeIntersectionToCommandBufferIntersectionTypeRayTextureIntersectionTextureAccelerationStructure(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NUInt long intersectionType,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture rayTexture,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture intersectionTexture,
            @NotNull MPSAccelerationStructure accelerationStructure);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * Winding order used to determine which direction a triangle or quadrilateral's normal
     * points when back face or front face culling is enabled. Defaults to MTLWindingClockwise.
     * 
     * If the front face winding is set to MTLWindingClockwise, the triangle or
     * quadrilateral normal is considered to point towards the direction where the vertices are in
     * clockwise order when viewed from that direction. Otherwise, if the front facing winding is set
     * to MTLWindingCounterClockwise, the triangle or quadrilateral normal is considered to point in
     * the opposite direction.
     */
    @Generated
    @Selector("frontFacingWinding")
    @NUInt
    public native long frontFacingWinding();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSRayIntersector init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSRayIntersector initWithCoder(@NotNull NSCoder coder);

    /**
     * Initialize the raytracer with an NSCoder and a Metal device
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSRayIntersector initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize the raytracer with a Metal device
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSRayIntersector initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

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
     * Intersection data type. Defaults to
     * MPSIntersectionDataTypeDistancePrimitiveIndexCoordinates.
     */
    @Generated
    @Selector("intersectionDataType")
    @NUInt
    public native long intersectionDataType();

    /**
     * Offset, in bytes, between consecutive intersections in the intersection buffer. Defaults
     * to 0, indicating that the intersections are packed according to their natural aligned size.
     * 
     * This can be used to skip past any additional per-intersection that which may be
     * stored alongside the MPSRayIntersection struct such as the surface normal at the point
     * of intersection. Must be aligned to the alignment of the intersection data type.
     */
    @Generated
    @Selector("intersectionStride")
    @NUInt
    public native long intersectionStride();

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
    public static native MPSRayIntersector new_objc();

    /**
     * Ray data type. Defaults to MPSRayDataTypeOriginDirection.
     */
    @Generated
    @Selector("rayDataType")
    @NUInt
    public native long rayDataType();

    /**
     * Ray index data type. Defaults to MPSDataTypeUInt32. Only MPSDataTypeUInt16 and
     * MPSDataTypeUInt32 are supported.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("rayIndexDataType")
    public native int rayIndexDataType();

    /**
     * Global ray mask. Defaults to 0xFFFFFFFF. This value will be logically AND-ed with the
     * per-ray mask if the ray data type contains a mask.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("rayMask")
    public native int rayMask();

    /**
     * The operator to apply to determine whether to accept an intersection between a ray and a
     * primitive or instance. Defaults to MPSRayMaskOperatorAnd.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("rayMaskOperator")
    @NUInt
    public native long rayMaskOperator();

    /**
     * Whether to enable primitive and instance masks. Defaults to MPSRayMaskOptionNone.
     * 
     * If MPSRayMaskOptionPrimitive or MPSRayMaskOptionInstance is enabled, each ray and
     * primitive and/or instance is associated with a 32 bit unsigned integer mask. Before checking
     * for intersection between a ray and a primitive or instance, the corresponding masks are
     * compared using the ray mask operator defined by the rayMaskOperator property. If the result is
     * zero, the intersection is skipped.
     * 
     * This can be used to make certain primitives or instances invisible to certain rays. For example,
     * objects can be grouped into layers and their visibility can be toggled by modifying the ray
     * masks rather than removing the objects from the scene and rebuilding the acceleration structure.
     * Alternatively, certain objects can be prevented from casting shadows by making them invisible to
     * shadow rays.
     * 
     * Enabling this option may reduce raytracing performance.
     */
    @Generated
    @Selector("rayMaskOptions")
    @NUInt
    public native long rayMaskOptions();

    /**
     * Offset, in bytes, between consecutive rays in the ray buffer. Defaults to 0, indicating
     * that the rays are packed according to their natural aligned size.
     * 
     * This can be used to skip past any additional per-ray data that may be stored
     * alongside the MPSRay struct such as the current radiance along the ray or the source pixel
     * coordinates. Must be aligned to the alignment of the ray data type.
     */
    @Generated
    @Selector("rayStride")
    @NUInt
    public native long rayStride();

    /**
     * Get the recommended minimum number of rays to submit for intersection in one batch
     * 
     * In order to keep the system responsive, and to limit the amount of memory allocated
     * to ray and intersection buffers, it may be desirable to divide the rays to be intersected
     * against an acceleration structure into smaller batches. However, submitting too few rays in a
     * batch reduces GPU utilization and performance. This method provides a recommended minimum
     * number of rays to submit in any given batch. For example, for a 1920x1080 image, this method may
     * recommend that the image be divided into 512x512 tiles. The actual recommendation varies per
     * device and total ray count.
     * 
     * @param rayCount The total number of rays to be submitted
     * 
     * @return The recommended minimum ray batch size
     */
    @Generated
    @Selector("recommendedMinimumRayBatchSizeForRayCount:")
    @NUInt
    public native long recommendedMinimumRayBatchSizeForRayCount(@NUInt long rayCount);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Ray/bounding box intersection test type. Defaults to
     * MPSBoundingBoxIntersectionTestTypeDefault.
     */
    @Generated
    @Selector("setBoundingBoxIntersectionTestType:")
    public native void setBoundingBoxIntersectionTestType(@NUInt long value);

    /**
     * Whether to ignore intersections between rays and back-facing or front-facing triangles
     * or quadrilaterals. Defaults to MTLCullModeNone.
     * 
     * A triangle or quadrilateral is back-facing if its normal points in the same
     * direction as a ray and front-facing if its normal points in the opposite direction as a ray. If
     * the cull mode is set to MTLCullModeBack, then back-facing triangles and quadrilaterals will be
     * ignored. If the cull mode is set to MTLCullModeFront, then front-facing triangles and
     * quadrilaterals will be ignored. Otherwise, if the cull mode is set to MTLCullModeNone, no
     * triangles or quadrilaterals will be ignored. The front and back faces can be swapped using the
     * frontFacingWinding property.
     * 
     * Backface culling is necessary for some scenes but can reduce raytracing performance.
     */
    @Generated
    @Selector("setCullMode:")
    public native void setCullMode(@NUInt long value);

    /**
     * Winding order used to determine which direction a triangle or quadrilateral's normal
     * points when back face or front face culling is enabled. Defaults to MTLWindingClockwise.
     * 
     * If the front face winding is set to MTLWindingClockwise, the triangle or
     * quadrilateral normal is considered to point towards the direction where the vertices are in
     * clockwise order when viewed from that direction. Otherwise, if the front facing winding is set
     * to MTLWindingCounterClockwise, the triangle or quadrilateral normal is considered to point in
     * the opposite direction.
     */
    @Generated
    @Selector("setFrontFacingWinding:")
    public native void setFrontFacingWinding(@NUInt long value);

    /**
     * Intersection data type. Defaults to
     * MPSIntersectionDataTypeDistancePrimitiveIndexCoordinates.
     */
    @Generated
    @Selector("setIntersectionDataType:")
    public native void setIntersectionDataType(@NUInt long value);

    /**
     * Offset, in bytes, between consecutive intersections in the intersection buffer. Defaults
     * to 0, indicating that the intersections are packed according to their natural aligned size.
     * 
     * This can be used to skip past any additional per-intersection that which may be
     * stored alongside the MPSRayIntersection struct such as the surface normal at the point
     * of intersection. Must be aligned to the alignment of the intersection data type.
     */
    @Generated
    @Selector("setIntersectionStride:")
    public native void setIntersectionStride(@NUInt long value);

    /**
     * Ray data type. Defaults to MPSRayDataTypeOriginDirection.
     */
    @Generated
    @Selector("setRayDataType:")
    public native void setRayDataType(@NUInt long value);

    /**
     * Ray index data type. Defaults to MPSDataTypeUInt32. Only MPSDataTypeUInt16 and
     * MPSDataTypeUInt32 are supported.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setRayIndexDataType:")
    public native void setRayIndexDataType(int value);

    /**
     * Global ray mask. Defaults to 0xFFFFFFFF. This value will be logically AND-ed with the
     * per-ray mask if the ray data type contains a mask.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setRayMask:")
    public native void setRayMask(int value);

    /**
     * The operator to apply to determine whether to accept an intersection between a ray and a
     * primitive or instance. Defaults to MPSRayMaskOperatorAnd.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setRayMaskOperator:")
    public native void setRayMaskOperator(@NUInt long value);

    /**
     * Whether to enable primitive and instance masks. Defaults to MPSRayMaskOptionNone.
     * 
     * If MPSRayMaskOptionPrimitive or MPSRayMaskOptionInstance is enabled, each ray and
     * primitive and/or instance is associated with a 32 bit unsigned integer mask. Before checking
     * for intersection between a ray and a primitive or instance, the corresponding masks are
     * compared using the ray mask operator defined by the rayMaskOperator property. If the result is
     * zero, the intersection is skipped.
     * 
     * This can be used to make certain primitives or instances invisible to certain rays. For example,
     * objects can be grouped into layers and their visibility can be toggled by modifying the ray
     * masks rather than removing the objects from the scene and rebuilding the acceleration structure.
     * Alternatively, certain objects can be prevented from casting shadows by making them invisible to
     * shadow rays.
     * 
     * Enabling this option may reduce raytracing performance.
     */
    @Generated
    @Selector("setRayMaskOptions:")
    public native void setRayMaskOptions(@NUInt long value);

    /**
     * Offset, in bytes, between consecutive rays in the ray buffer. Defaults to 0, indicating
     * that the rays are packed according to their natural aligned size.
     * 
     * This can be used to skip past any additional per-ray data that may be stored
     * alongside the MPSRay struct such as the current radiance along the ray or the source pixel
     * coordinates. Must be aligned to the alignment of the ray data type.
     */
    @Generated
    @Selector("setRayStride:")
    public native void setRayStride(@NUInt long value);

    /**
     * Ray/triangle intersection test type. Defaults to MPSTriangleIntersectionTestTypeDefault.
     * Quads are broken into two triangles for intersection testing, so this property also applies to
     * quadrilateral intersections.
     */
    @Generated
    @Selector("setTriangleIntersectionTestType:")
    public native void setTriangleIntersectionTestType(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Ray/triangle intersection test type. Defaults to MPSTriangleIntersectionTestTypeDefault.
     * Quads are broken into two triangles for intersection testing, so this property also applies to
     * quadrilateral intersections.
     */
    @Generated
    @Selector("triangleIntersectionTestType")
    @NUInt
    public native long triangleIntersectionTestType();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
