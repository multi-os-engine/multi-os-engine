package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLBuffer;
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

/**
 * An acceleration structure built over instances of other acceleration structures
 * <p>
 * Instancing can be used to reduce memory usage in scenes that contain many copies
 * of the same object(s) or to combine multiple acceleration structures such as a static and
 * dynamic acceleration structure into a two-level instance hierarchy.
 * <p>
 * The typical pattern for creating an instance acceleration structure is as follows. First,
 * create individual bottom-level acceleration structures. Then assign these acceleration
 * structures to the accelerationStructures property of an instance acceleration structure.
 * <p>
 * All of the acceleration structures in the instance hierarchy must share the same
 * MPSAccelerationStructureGroup. Furthermore, all of the bottom-level acceleration structures
 * must share the same vertex buffer, index buffer, etc. although they may have different offsets
 * within those buffers.
 * <p>
 * [@code]
 * MPSAccelerationStructureGroup *group = nil;
 * group = [[MPSAccelerationStructureGroup alloc] initWithDevice:device];
 * <p>
 * MPSInstanceAccelerationStructure *instanceAccel = nil;
 * instanceAccel = [[MPSInstanceAccelerationStructure alloc] initWithGroup:group];
 * <p>
 * NSMutableArray *accelerationStructures = [NSMutableArray array];
 * instanceAccel.accelerationStructures = accelerationStructures;
 * <p>
 * instanceAccel.instanceCount = instanceCount;
 * <p>
 * for (ObjectType *objectType in objectTypes) {
 * MPSTriangleAccelerationStructure *triAccel = nil;
 * triAccel = [[MPSTriangleAccelerationStructure alloc] initWithGroup:group];
 * <p>
 * triAccel.vertexBuffer = objectType.vertexBuffer;
 * triAccel.vertexBufferOffset = objectType.vertexBufferOffset;
 * triAccel.triangleCount = objectType.triangleCount;
 * <p>
 * [triAccel rebuild];
 * <p>
 * [accelerationStructures addObject:triAccel];
 * }
 * [@endcode]
 * <p>
 * Next, create a buffer containing the acceleration structure index for each instance, and
 * another acceleration structure containing the transformation matrix for each instance:
 * <p>
 * [@code]
 * NSUInteger instanceBufferLength = sizeof(uint32_t) * instanceCount;
 * <p>
 * id <MTLBuffer> instanceBuffer =
 * [device newBufferWithLength:instanceBufferLength
 * options:MTLResourceStorageModeManaged];
 * <p>
 * memcpy(instanceBuffer.contents, instances,
 * instanceBufferLength);
 * [instanceBuffer
 * didModifyRange:NSMakeRange(0, instanceBufferLength)];
 * <p>
 * instanceAccel.instanceBuffer = instanceBuffer;
 * <p>
 * // Similar for transformation matrix buffer
 * [@endcode]
 * <p>
 * Finally, rebuild the instance acceleration structure:
 * <p>
 * [@code]
 * [instanceAccel rebuild];
 * [@endcode]
 * <p>
 * Refitting and Rebuilding Bottom-Level Acceleration Structures: when a bottom level acceleration
 * structure is rebuild or refit, its' bounding box may change. Therefore, the instance
 * acceleration structure also needs to be rebuilt or refit.
 * <p>
 * Copying and Serializing Instance Acceleration Structures: When an instance acceleration
 * structure is copied or serialized, the bottom level acceleration structures are not copied or
 * serialized. These must be copied or serialized along with the instance acceleration structure
 * and assigned to the new instance acceleration structure. This also applies to buffer properties
 * such as the instance buffer, transformation buffer, etc.
 * <p>
 * Performance Guidelines:
 * <p>
 * - Use instancing to reduce memory usage: if there are many copies of the same object(s) in
 * a scene, using instances of the same object can reduce memory usage and acceleration
 * structure build time. Rebuilding or refitting the top level acceleration structure can
 * also be much faster than rebuilding a large single level acceleration structure.
 * <p>
 * - Consider flattening your instance hierarchy into a single acceleration structure if the
 * increased memory usage and acceleration structure build time are not a concern.
 * Intersecting a two level acceleration structure can have a significant performance cost so
 * only use it when necessary. Which technique to use depends on the scene and use case. For
 * example, in a rendering application, it may be best to use an instance hierarchy for
 * interactive scene editing and preview and flattening the instance hierarchy for the final
 * render. For smaller scenes, it may also be sufficient to refit a flattened acceleration
 * structure rather than rebuilding an instance hierarchy.
 * <p>
 * - If there is only a single object in the scene, intersect its acceleration structure
 * directly instead of using an instance hierarchy.
 * <p>
 * - Consider dividing objects into static and dynamic acceleration structures. If dynamic
 * objects require the acceleration structure to be rebuilt frequently, create a high quality
 * static acceleration structure and a lower quality but faster to build dynamic acceleration
 * structure. These two acceleration structures can then be combined with a two level
 * acceleration structure. Use MPSTransformTypeIdentity to reduce the overhead of this
 * technique. Whether this technique is more efficient than rebuilding the entire
 * acceleration structure depends on the scene.
 * <p>
 * See MPSAccelerationStructure for more information
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSInstanceAccelerationStructure extends MPSAccelerationStructure {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSInstanceAccelerationStructure(Pointer peer) {
        super(peer);
    }

    /**
     * Acceleration structures available for use in this instance acceleration structure. Each
     * instance must provide an index into this array in the instance buffer as well as a
     * transformation matrix in the transform buffer. All acceleration structures must share a single
     * vertex buffer, optional index buffer, and optional mask buffer, though they may have different
     * offsets within each buffer, and all acceleration structures must share the same acceleration
     * structure group. If a polygon acceleration structure is rebuilt or refit, the instance
     * acceleration structure must subsequently be rebuilt or refit.
     */
    @Generated
    @Selector("accelerationStructures")
    public native NSArray<? extends MPSPolygonAccelerationStructure> accelerationStructures();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSInstanceAccelerationStructure alloc();

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
    public native MPSInstanceAccelerationStructure init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSInstanceAccelerationStructure initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSInstanceAccelerationStructure initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithCoder:group:")
    public native MPSInstanceAccelerationStructure initWithCoderGroup(NSCoder aDecoder,
            MPSAccelerationStructureGroup group);

    @Generated
    @Selector("initWithDevice:")
    public native MPSInstanceAccelerationStructure initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithGroup:")
    public native MPSInstanceAccelerationStructure initWithGroup(MPSAccelerationStructureGroup group);

    /**
     * Buffer containing the 32 bit unsigned integer index into the acceleration structure array
     * for each instance
     */
    @Generated
    @Selector("instanceBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer instanceBuffer();

    /**
     * Offset, in bytes, into the instance buffer. Defaults to 0 bytes. Must be aligned to 4
     * bytes.
     */
    @Generated
    @Selector("instanceBufferOffset")
    @NUInt
    public native long instanceBufferOffset();

    /**
     * Number of instances. Changes to this property require rebuilding the acceleration
     * structure.
     */
    @Generated
    @Selector("instanceCount")
    @NUInt
    public native long instanceCount();

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

    /**
     * Mask buffer containing one uint32_t mask per instance. May be nil.
     */
    @Generated
    @Selector("maskBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer maskBuffer();

    /**
     * Offset, in bytes, into the mask buffer. Defaults to 0 bytes. Must be aligned to 4 bytes.
     */
    @Generated
    @Selector("maskBufferOffset")
    @NUInt
    public native long maskBufferOffset();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Acceleration structures available for use in this instance acceleration structure. Each
     * instance must provide an index into this array in the instance buffer as well as a
     * transformation matrix in the transform buffer. All acceleration structures must share a single
     * vertex buffer, optional index buffer, and optional mask buffer, though they may have different
     * offsets within each buffer, and all acceleration structures must share the same acceleration
     * structure group. If a polygon acceleration structure is rebuilt or refit, the instance
     * acceleration structure must subsequently be rebuilt or refit.
     */
    @Generated
    @Selector("setAccelerationStructures:")
    public native void setAccelerationStructures(NSArray<? extends MPSPolygonAccelerationStructure> value);

    /**
     * Buffer containing the 32 bit unsigned integer index into the acceleration structure array
     * for each instance
     */
    @Generated
    @Selector("setInstanceBuffer:")
    public native void setInstanceBuffer(@Mapped(ObjCObjectMapper.class) MTLBuffer value);

    /**
     * Offset, in bytes, into the instance buffer. Defaults to 0 bytes. Must be aligned to 4
     * bytes.
     */
    @Generated
    @Selector("setInstanceBufferOffset:")
    public native void setInstanceBufferOffset(@NUInt long value);

    /**
     * Number of instances. Changes to this property require rebuilding the acceleration
     * structure.
     */
    @Generated
    @Selector("setInstanceCount:")
    public native void setInstanceCount(@NUInt long value);

    /**
     * Mask buffer containing one uint32_t mask per instance. May be nil.
     */
    @Generated
    @Selector("setMaskBuffer:")
    public native void setMaskBuffer(@Mapped(ObjCObjectMapper.class) MTLBuffer value);

    /**
     * Offset, in bytes, into the mask buffer. Defaults to 0 bytes. Must be aligned to 4 bytes.
     */
    @Generated
    @Selector("setMaskBufferOffset:")
    public native void setMaskBufferOffset(@NUInt long value);

    /**
     * Buffer containing one column major matrix_float4x4 transformation matrix per instance
     */
    @Generated
    @Selector("setTransformBuffer:")
    public native void setTransformBuffer(@Mapped(ObjCObjectMapper.class) MTLBuffer value);

    /**
     * Offset, in bytes, into the transform buffer. Defaults to 0 bytes. Must be aligned to the
     * stride of the transform type.
     */
    @Generated
    @Selector("setTransformBufferOffset:")
    public native void setTransformBufferOffset(@NUInt long value);

    /**
     * Instance transform type. Defaults to MPSTransformTypeFloat4x4. Changes to this property
     * require rebuilding the acceleration structure.
     */
    @Generated
    @Selector("setTransformType:")
    public native void setTransformType(@NUInt long value);

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
     * Buffer containing one column major matrix_float4x4 transformation matrix per instance
     */
    @Generated
    @Selector("transformBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer transformBuffer();

    /**
     * Offset, in bytes, into the transform buffer. Defaults to 0 bytes. Must be aligned to the
     * stride of the transform type.
     */
    @Generated
    @Selector("transformBufferOffset")
    @NUInt
    public native long transformBufferOffset();

    /**
     * Instance transform type. Defaults to MPSTransformTypeFloat4x4. Changes to this property
     * require rebuilding the acceleration structure.
     */
    @Generated
    @Selector("transformType")
    @NUInt
    public native long transformType();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
