package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A data structure built over geometry used to accelerate ray tracing
 * <p>
 * Do not use this base class directly. Use one of the derived classes instead.
 * The general pattern for creating an acceleration structure is as follows. First, create the
 * acceleration structure:
 * <p>
 * [@code]
 * MPSTriangleAccelerationStructure *accelerationStructure = nil;
 * accelerationStructure = [[MPSTriangleAccelerationStructure alloc] initWithDevice:device];
 * [@endcode]
 * <p>
 * Then, assign values to the acceleration structure's properties:
 * <p>
 * [@code]
 * accelerationStructure.vertexBuffer = vertexBuffer;
 * accelerationStructure.triangleCount = triangleCount;
 * [@endcode]
 * <p>
 * Finally, the acceleration structure must be built:
 * <p>
 * [@code]
 * [accelerationStructure rebuild];
 * [@endcode]
 * <p>
 * The acceleration structure can then be used to encode ray intersection tests with an
 * MPSRayIntersector:
 * <p>
 * [@code]
 * [raytracer encodeIntersectionToCommandBuffer:commandBuffer
 * intersectionType:MPSIntersectionTypeNearest
 * rayBuffer:rayBuffer
 * rayBufferOffset:0
 * intersectionBuffer:intersectionBuffer
 * intersectionBufferOffset:0
 * rayCount:rayCount
 * accelerationStructure:accelerationStructure];
 * [@endcode]
 * <p>
 * Asynchronous Acceleration Structure Builds: Rebuilding an acceleration structure is an expensive
 * operation. Note that there is also a method to rebuild the acceleration structure asynchronously
 * to avoid blocking the main thread.
 * <p>
 * [@code]
 * [accelerationStructure rebuildWithCompletionHandler:^(MPSAccelerationStructure *accel) {
 * // Kick off ray intersection work
 * }];
 * [@endcode]
 * <p>
 * Streaming Geometry Updates: It is generally safe to change buffer properties such as the vertex
 * buffer after intersection tests have been encoded into a command buffer, but the contents of
 * those buffers cannot be safely changed by the CPU until the command buffer has finished
 * executing on the GPU. It is also not safe to rebuild the acceleration structure until the
 * command buffer has completed.
 * <p>
 * If the CPU needs to stream geometry updates to the GPU, ensure the vertex and other buffers are
 * double or triple buffered.
 * <p>
 * [@code]
 * #define MAX_ASYNC_OPERATIONS 3
 * <p>
 * // Initialization:
 * <p>
 * // Create a semaphore with the maximum number of asynchronous operations in flight
 * dispatch_semaphore_t asyncOperationSemaphore = dispatch_semaphore_create(MAX_ASYNC_OPERATIONS);
 * <p>
 * // Create an acceleration structure for each vertex buffer range
 * NSMutableArray *accelerationStructures = [NSMutableArray array];
 * <p>
 * NSUInteger vertexBufferLength = sizeof(float3) * vertexCount * MAX_ASYNC_OPERATIONS;
 * id <MTLBuffer> vertexBuffer = [device newBufferWithLength:vertexBufferLength
 * options:MTLResourceStorageModeManaged];
 * <p>
 * for (NSUInteger i = 0; i < MAX_ASYNC_OPERATIONS; i++) {
 * MPSTriangleAccelerationStructure *accel = nil;
 * accel = [[MPSTriangleAccelerationStructure alloc] initWithDevice:device];
 * <p>
 * // Configure acceleration structure
 * accel.vertexBuffer = vertexBuffer;
 * accel.vertexBufferOffset = i * sizeof(float3) * vertexCount;
 * <p>
 * [accelerationStructures addObject:accel];
 * }
 * <p>
 * NSUInteger asyncOperationIndex = 0;
 * <p>
 * // Encode intersection testing:
 * <p>
 * // Wait until there is a free acceleration structure
 * dispatch_semaphore_wait(asyncOperationSemaphore, DISPATCH_TIME_FOREVER);
 * <p>
 * MPSTriangleAccelerationStructure *accel = accelerationStructures[asyncOperationIndex];
 * asyncOperationIndex = (asyncOperationIndex + 1) % MAX_ASYNC_OPERATIONS;
 * <p>
 * float3 *vertices = (float3 *)((uint8_t *)vertexBuffer.contents + accel.vertexBufferOffset);
 * // Update vertices
 * MPSDidModifyRange(vertexBuffer, NSMakeRange(accel.vertexBufferOffset, sizeof(float3) * vertexCount));
 * <p>
 * // Rebuild the acceleration structure
 * [accel rebuild];
 * <p>
 * // Encode actual intersection work
 * [raytracer encodeIntersectionToCommandBuffer:commandBuffer
 * intersectionType:MPSIntersectionTypeNearest
 * rayBuffer:rayBuffer
 * rayBufferOffset:rayBufferOffset
 * intersectionBuffer:intersectionBuffer
 * intersectionBufferOffset:intersectionBufferOffset
 * rayCount:rayCount
 * accelerationStructure:accel];
 * <p>
 * // Register a completion handler to run when the GPU finishes executing
 * [commandBuffer addCompletedHandler:^(id <MTLCommandBuffer> commandBuffer) {
 * Intersection *intersections = (Intersection *)((uint8_t *)intersectionBuffer.contents +
 * intersectionBufferOffset);
 * <p>
 * // Process intersections
 * <p>
 * // Signal that the acceleration structure is now available for reuse
 * dispatch_semaphore_signal(asyncOperationSemaphore);
 * }];
 * <p>
 * // Commit the command buffer to allow the GPU to start executing
 * [commandBuffer commit];
 * [@endcode]
 * <p>
 * Refitting acceleration structures: If geometry has only moved slightly and not added or removed
 * from the scene, it can be much faster to refit the existing topology of an acceleration
 * structure to the new geometry than to rebuild the acceleration structure from scratch. Refitting
 * can also be pipelined with other GPU work such as intersection testing. If the geometry is
 * transformed entirely on the GPU, it is not necessary to use double or triple buffering. For
 * example:
 * <p>
 * [@code]
 * id <MTLCommandBuffer> commandBuffer = [commandQueue commandBuffer];
 * <p>
 * id <MTLComputeCommandEncoder> encoder = [commandBuffer computeCommandEncoder];
 * <p>
 * [encoder setBuffer:untransformedVertexBuffer offset:0 atIndex:0];
 * <p>
 * [encoder setBuffer:accelerationStructure.vertexBuffer
 * offset:accelerationStructure.vertexBufferOffset
 * atIndex:1];
 * <p>
 * [encoder setBuffer:transformationMatrices offset:0 atIndex:2];
 * <p>
 * [encoder setComputePipelineState:transformVerticesPipeline];
 * <p>
 * [encoder dispatchThreads:MTLSizeMake(accelerationStructure.triangleCount * 3, 1, 1)
 * threadsPerThreadgroup:MTLSizeMake(64, 1, 1)];
 * <p>
 * [encoder endEncoding];
 * <p>
 * [accelerationStructure encodeRefitToCommandBuffer:commandBuffer];
 * <p>
 * [commandBuffer commit];
 * [@endcode]
 * <p>
 * Serializing Acceleration Structures: Instead of rebuilding acceleration structures from scratch
 * they can be built offline, serialized, and reloaded at runtime using the NSSecureCoding
 * protocol:
 * <p>
 * [@code]
 * // Build time:
 * NSError *error = nil;
 * NSData *data = [NSKeyedArchiver archivedDataWithRootObject:accel
 * requiringSecureCoding:YES
 * error:&error];
 * <p>
 * if (!data)
 * NSLog(@"Error archiving MPSAccelerationStructure: %@",
 * error.localizedDescription);
 * <p>
 * // Runtime:
 * MPSTriangleAccelerationStructure *accel;
 * accel = [NSKeyedUnarchiver unarchivedObjectOfClass:[MPSTriangleAccelerationStructure class]
 * fromData:data
 * error:&error];
 * <p>
 * if (!accel)
 * NSLog(@"Error unarchiving MPSAccelerationStructure: %@",
 * error.localizedDescription);
 * [@endcode]
 * <p>
 * Copying Acceleration Structures: Acceleration structures can be copied using the NSCopying
 * protocol, even to a different Metal device. This can be used for multi-GPU raytracing. Buffer
 * properties are not copied to the new acceleration structure. These buffers must instead be
 * copied to the new Metal device and assigned to the new acceleration structure. For example:
 * <p>
 * [@code]
 * MPSTriangleAccelerationStructure *copy = [accelerationStructure copyWithZone:nil
 * device:newDevice];
 * <p>
 * copy.vertexBuffer = [self copyBuffer:accelerationStructure.vertexBuffer
 * withDevice:newDevice];
 * [@endcode]
 * <p>
 * Performance Guidelines:
 * <p>
 * - Provide accurate acceleration structure hints: if an acceleration structure does not
 * require support for refitting, a higher quality construction algorithm can be used.
 * However, if an acceleration structure must be rebuilt frequently, a lower quality
 * but higher performance construction algorithm can be used.
 * <p>
 * - Consider refitting existing acceleration structures rather than rebuilding them from
 * scratch. This is typically much faster and can result in a reasonably high quality
 * tree if the geometry has not been modified dramatically. Refitting can also be pipelined
 * with other GPU work. If objects have been added to or removed from the scene, it is
 * typically necessary to rebuild the acceleration structure rather than refit it.
 * <p>
 * - Rebuild acceleration structures asynchronously when possible to avoid blocking the main
 * thread. Consider presenting a UI indicating that work is happening in the background while
 * allowing the user to consider interacting with your application.
 * <p>
 * - If you need to mix intersection testing with acceleration structure builds (e.g. if the
 * user is interactively editing the scene while rendering or if objects are moving
 * significantly) consider allocating two independent acceleration structures that refer to
 * two copies of the scene data. Then, asynchronously rebuild one acceleration structure
 * while the other one is used for rendering. Once the rebuild has completed, swap the
 * acceleration structures. The intermediate frames could be filled by refitting the
 * rendering acceleration structure until the rebuilt acceleration structure is ready.
 * <p>
 * - When running in Xcode, disable "Enable Backtrace Recording" in your scheme settings.
 * Enabling this setting can significantly increase acceleration structure build time.
 * <p>
 * - Consider using quadrilaterals instead of triangles to represent your geometry.
 * The cost of intersecting a quadrilateral is typically less than the cost of intersecting
 * two triangles, so quadrilaterals can improve performance. Quadrilaterals also typically
 * require 30-40% less memory than triangles including vertex data and internal buffers
 * allocated by the acceleration structure. Whether quadrilaterals improve or hurt
 * performance can depend on the geometry and ray distribution, so you should choose
 * whichever performs better for your application.
 * <p>
 * Thread Safety: MPSAccelerationStructures are generally not thread safe. Changing properties
 * and rebuilding acceleration structures from multiple threads result in undefined behavior.
 * However, it is safe to encode intersection tests with a single acceleration structure
 * from multiple threads as long as each thread uses its own MPSRayIntersector.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSAccelerationStructure extends MPSKernel implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSAccelerationStructure(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSAccelerationStructure alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * Create a a copy of this acceleration structure
     * <p>
     * The acceleration structure may be copied to a different Metal device. Buffer
     * properties of the acceleration structure such as the vertex buffer, instance, buffer, etc. are
     * set to nil. Copy these buffers to the new Metal device and assign them to the new acceleration
     * structure instead. Do not copy the acceleration structure until any prior refit or rebuild
     * operations have completed.
     *
     * @param zone   This parameter is ignored. Memory zones are no longer used by Objective-C.
     * @param device New Metal device
     */
    @Generated
    @Owned
    @Selector("copyWithZone:device:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZoneDevice(VoidPtr zone, @Mapped(ObjCObjectMapper.class) MTLDevice device);

    /**
     * Create a a copy of this acceleration structure
     * <p>
     * The acceleration structure may be copied with a different acceleration structure
     * group. Buffer properties of the acceleration structure such as the vertex buffer, instance
     * buffer, etc. are set to nil. Copy these buffers with the new Metal device and assign them to
     * the new acceleration structure instead. Do not copy the acceleration structure until any prior
     * refit or rebuild operations have completed.
     *
     * @param zone  This parameter is ignored. Memory zones are no longer used by Objective-C.
     * @param group New acceleration structure group
     */
    @Generated
    @Owned
    @Selector("copyWithZone:group:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZoneGroup(VoidPtr zone, MPSAccelerationStructureGroup group);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Refit the existing acceleration structure to new data
     * <p>
     * This method is used to refit the acceleration structure to new vertex data,
     * index data, instance data, etc. while preserving the existing acceleration structure topology.
     * This is typically much faster than a full rebuild of the acceleration structure. Refitting can
     * also be pipelined with other GPU work such as ray intersection.
     * <p>
     * Until the command buffer has completed, the acceleration structure cannot be copied,
     * encoded with NSSecureCoding, or rebuilt. Changes to properties such as the triangle count or
     * instance count might not be reflected. These changes require that the acceleration structure be
     * rebuilt instead. The acceleration structure must be rebuilt at least once before this method can
     * be called.
     */
    @Generated
    @Selector("encodeRefitToCommandBuffer:")
    public native void encodeRefitToCommandBuffer(@Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * The group this acceleration structure was created with
     */
    @Generated
    @Selector("group")
    public native MPSAccelerationStructureGroup group();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSAccelerationStructure init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSAccelerationStructure initWithCoder(NSCoder coder);

    /**
     * Initialize the acceleration structure with an NSCoder and a Metal device. Buffer
     * properties such as the vertex buffer, instance buffer, etc. are set to nil. Encode and decode
     * these buffers along with the acceleration structure instead.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSAccelerationStructure initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize the acceleration structure with an NSCoder and an acceleration structure
     * group, if the acceleration structure will be used in an instance hierarchy. All acceleration
     * structures in the instance hierarchy must share the same group. Buffer properties such as the
     * vertex buffer, instance buffer, etc. are set to nil. Encode and decode these buffers along with
     * the acceleration structure instead.
     */
    @Generated
    @Selector("initWithCoder:group:")
    public native MPSAccelerationStructure initWithCoderGroup(NSCoder aDecoder, MPSAccelerationStructureGroup group);

    /**
     * Initialize the acceleration structure with a Metal device
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSAccelerationStructure initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize the acceleration structure with an acceleration structure group, if the
     * acceleration structure will be used in an instance hierarchy.
     * <p>
     * The Metal device is determined from the acceleration structure group. All
     * acceleration structures in the instance hierarchy must share the same group.
     */
    @Generated
    @Selector("initWithGroup:")
    public native MPSAccelerationStructure initWithGroup(MPSAccelerationStructureGroup group);

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * Rebuild the acceleration structure
     * <p>
     * This method must be called before any intersection tests can be scheduled with this
     * acceleration structure. Before calling this method, fill out the properties of the acceleration
     * structure such as vertex buffer, instance buffer, etc. The acceleration structure should be
     * rebuilt when its contents (e.g. vertices in a triangle acceleration structure) have been
     * modified significantly and must be rebuilt when properties such as triangle count,
     * vertex stride, etc. have changed. When the contents of the acceleration structure have only been
     * modified slightly, it may be cheaper to refit the acceleration structure instead.
     * <p>
     * This method blocks until the acceleration structure has been rebuilt. Until the rebuild has
     * completed, the acceleration structure cannot be copied, encoded with NSSecureCoding, rebuilt, or
     * refit. Before this method can be called, any pending GPU writes to the vertex buffer, index
     * buffer, etc. must be completed (and, for managed buffers, synchronized). Any prior intersection
     * tests must also be completed before the acceleration structure can be rebuilt.
     */
    @Generated
    @Selector("rebuild")
    public native void rebuild();

    /**
     * Rebuild the acceleration structure asynchronously
     * <p>
     * This method must be called before any intersection tests can be scheduled with this
     * acceleration structure. Before calling this method, fill out the properties of the acceleration
     * structure such as vertex buffer, instance buffer, etc. The acceleration structure should be
     * rebuilt when its contents (e.g. vertices in a triangle acceleration structure) have been
     * modified significantly and must be rebuilt when properties such as triangle count,
     * vertex stride, etc. have changed. When the contents of the acceleration structure have only been
     * modified slightly, it may be cheaper to refit the acceleration structure instead.
     * <p>
     * Until the rebuild has completed, the acceleration structure cannot be copied, encoded with
     * NSSecureCoding, rebuilt, or refit. Before this method can be called, any pending GPU writes to
     * the vertex buffer, index buffer, etc. must be completed (and, for managed buffers,
     * synchronized). Any prior intersection tests must also be completed before the acceleration
     * structure can be rebuilt.
     */
    @Generated
    @Selector("rebuildWithCompletionHandler:")
    public native void rebuildWithCompletionHandler(
            @ObjCBlock(name = "call_rebuildWithCompletionHandler") Block_rebuildWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_rebuildWithCompletionHandler {
        @Generated
        void call_rebuildWithCompletionHandler(MPSAccelerationStructure arg0);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Acceleration structure usage options. Changes to this property require rebuilding the
     * acceleration structure. Defaults to MPSAccelerationStructureUsageNone.
     */
    @Generated
    @Selector("setUsage:")
    public native void setUsage(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Status indicating whether the acceleration structure has finished building
     */
    @Generated
    @Selector("status")
    @NUInt
    public native long status();

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
     * Acceleration structure usage options. Changes to this property require rebuilding the
     * acceleration structure. Defaults to MPSAccelerationStructureUsageNone.
     */
    @Generated
    @Selector("usage")
    @NUInt
    public native long usage();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
