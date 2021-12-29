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
 * An acceleration structure built over polygonal shapes
 * <p>
 * See MPSAccelerationStructure for more information
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSPolygonAccelerationStructure extends MPSAccelerationStructure {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSPolygonAccelerationStructure(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSPolygonAccelerationStructure alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSPolygonAccelerationStructure allocWithZone(VoidPtr zone);

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

    /**
     * Index buffer containing index data. Each index references a vertex in the vertex buffer.
     * May be nil.
     * <p>
     * This is an alias for polygonBuffers[0].indexBuffer. There must be exactly one polygon buffer
     * to use this property, or the polygonBuffers property must be nil, in which case an
     * MPSPolygonBuffer will be created automatically.
     */
    @Generated
    @Selector("indexBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer indexBuffer();

    /**
     * Offset, in bytes, into the index buffer. Defaults to 0 bytes. Must be aligned to a
     * multiple of the index type. Changes to this property require rebuilding the acceleration
     * structure.
     * <p>
     * This is an alias for polygonBuffers[0].indexBufferOffset. There must be exactly one polygon
     * buffer to use this property, or the polygonBuffers property must be nil, in which case an
     * MPSPolygonBuffer will be created automatically.
     */
    @Generated
    @Selector("indexBufferOffset")
    @NUInt
    public native long indexBufferOffset();

    /**
     * Index type. Defaults to MPSDataTypeUInt32. Only MPSDataTypeUInt16 and MPSDataTypeUInt32
     * are supported.
     */
    @Generated
    @Selector("indexType")
    public native int indexType();

    @Generated
    @Selector("init")
    public native MPSPolygonAccelerationStructure init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSPolygonAccelerationStructure initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSPolygonAccelerationStructure initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithCoder:group:")
    public native MPSPolygonAccelerationStructure initWithCoderGroup(NSCoder aDecoder,
            MPSAccelerationStructureGroup group);

    @Generated
    @Selector("initWithDevice:")
    public native MPSPolygonAccelerationStructure initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithGroup:")
    public native MPSPolygonAccelerationStructure initWithGroup(MPSAccelerationStructureGroup group);

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
     * Mask buffer containing one uint32_t mask per polygon. May be nil. Otherwise, the mask
     * type must be specified on the MPSRayIntersector with which it is used.
     * <p>
     * This is an alias for polygonBuffers[0].maskBuffer. There must be exactly one polygon buffer
     * to use this property, or the polygonBuffers property must be nil, in which case an
     * MPSPolygonBuffer will be created automatically.
     */
    @Generated
    @Selector("maskBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer maskBuffer();

    /**
     * Offset, in bytes, into the mask buffer. Defaults to 0 bytes. Must be aligned to 4 bytes.
     * <p>
     * This is an alias for polygonBuffers[0].maskBufferOffset. There must be exactly one polygon
     * buffer to use this property, or the polygonBuffers property must be nil, in which case an
     * MPSPolygonBuffer will be created automatically.
     */
    @Generated
    @Selector("maskBufferOffset")
    @NUInt
    public native long maskBufferOffset();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSPolygonAccelerationStructure new_objc();

    /**
     * Array of polygon buffers. Each buffer contains a vertex buffer and optional index and
     * mask buffer for an array of polygons. Changing the length of this array requires rebuilding the
     * acceleration structure.
     * <p>
     * Using more than one MPSPolygonBuffer will reduce performance. It is better to concatenate
     * these buffers into a single vertex buffer, index buffer, and mask buffer and use a single
     * MPSPolygonBuffer if possible. This also applies when using an MPSInstanceAccelerationStructure:
     * each instance or subclass of MPSPolygonAccelerationStructure in an instance hierarchy should use
     * the same vertex buffer, index buffer, and mask buffer, although each acceleration structure
     * may use different offsets into these buffers. This allows for the vertex, index, and mask
     * buffers to be bound directly instead of indirectly through an argument buffer.
     * <p>
     * There must be at least one MPSPolygonBuffer. On argument buffer tier 1 devices, there must be
     * be exactly one MPSPolygonBuffer. Use the argumentBuffersSupport property of the MTLDevice to
     * check for support.
     */
    @Generated
    @Selector("polygonBuffers")
    public native NSArray<? extends MPSPolygonBuffer> polygonBuffers();

    /**
     * Number of polygons. Changes to this property require rebuilding the acceleration
     * structure.
     * <p>
     * This is an alias for polygonBuffers[0].polygonCount. There must be exactly one polygon buffer
     * to use this property, or the polygonBuffers property must be nil, in which case an
     * MPSPolygonBuffer will be created automatically.
     */
    @Generated
    @Selector("polygonCount")
    @NUInt
    public native long polygonCount();

    /**
     * The type of polygon. Defaults to MPSPolygonTypeTriangle. Changes to this property require
     * rebuilding the acceleration structure.
     */
    @Generated
    @Selector("polygonType")
    @NUInt
    public native long polygonType();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Index buffer containing index data. Each index references a vertex in the vertex buffer.
     * May be nil.
     * <p>
     * This is an alias for polygonBuffers[0].indexBuffer. There must be exactly one polygon buffer
     * to use this property, or the polygonBuffers property must be nil, in which case an
     * MPSPolygonBuffer will be created automatically.
     */
    @Generated
    @Selector("setIndexBuffer:")
    public native void setIndexBuffer(@Mapped(ObjCObjectMapper.class) MTLBuffer value);

    /**
     * Offset, in bytes, into the index buffer. Defaults to 0 bytes. Must be aligned to a
     * multiple of the index type. Changes to this property require rebuilding the acceleration
     * structure.
     * <p>
     * This is an alias for polygonBuffers[0].indexBufferOffset. There must be exactly one polygon
     * buffer to use this property, or the polygonBuffers property must be nil, in which case an
     * MPSPolygonBuffer will be created automatically.
     */
    @Generated
    @Selector("setIndexBufferOffset:")
    public native void setIndexBufferOffset(@NUInt long value);

    /**
     * Index type. Defaults to MPSDataTypeUInt32. Only MPSDataTypeUInt16 and MPSDataTypeUInt32
     * are supported.
     */
    @Generated
    @Selector("setIndexType:")
    public native void setIndexType(int value);

    /**
     * Mask buffer containing one uint32_t mask per polygon. May be nil. Otherwise, the mask
     * type must be specified on the MPSRayIntersector with which it is used.
     * <p>
     * This is an alias for polygonBuffers[0].maskBuffer. There must be exactly one polygon buffer
     * to use this property, or the polygonBuffers property must be nil, in which case an
     * MPSPolygonBuffer will be created automatically.
     */
    @Generated
    @Selector("setMaskBuffer:")
    public native void setMaskBuffer(@Mapped(ObjCObjectMapper.class) MTLBuffer value);

    /**
     * Offset, in bytes, into the mask buffer. Defaults to 0 bytes. Must be aligned to 4 bytes.
     * <p>
     * This is an alias for polygonBuffers[0].maskBufferOffset. There must be exactly one polygon
     * buffer to use this property, or the polygonBuffers property must be nil, in which case an
     * MPSPolygonBuffer will be created automatically.
     */
    @Generated
    @Selector("setMaskBufferOffset:")
    public native void setMaskBufferOffset(@NUInt long value);

    /**
     * Array of polygon buffers. Each buffer contains a vertex buffer and optional index and
     * mask buffer for an array of polygons. Changing the length of this array requires rebuilding the
     * acceleration structure.
     * <p>
     * Using more than one MPSPolygonBuffer will reduce performance. It is better to concatenate
     * these buffers into a single vertex buffer, index buffer, and mask buffer and use a single
     * MPSPolygonBuffer if possible. This also applies when using an MPSInstanceAccelerationStructure:
     * each instance or subclass of MPSPolygonAccelerationStructure in an instance hierarchy should use
     * the same vertex buffer, index buffer, and mask buffer, although each acceleration structure
     * may use different offsets into these buffers. This allows for the vertex, index, and mask
     * buffers to be bound directly instead of indirectly through an argument buffer.
     * <p>
     * There must be at least one MPSPolygonBuffer. On argument buffer tier 1 devices, there must be
     * be exactly one MPSPolygonBuffer. Use the argumentBuffersSupport property of the MTLDevice to
     * check for support.
     */
    @Generated
    @Selector("setPolygonBuffers:")
    public native void setPolygonBuffers(NSArray<? extends MPSPolygonBuffer> value);

    /**
     * Number of polygons. Changes to this property require rebuilding the acceleration
     * structure.
     * <p>
     * This is an alias for polygonBuffers[0].polygonCount. There must be exactly one polygon buffer
     * to use this property, or the polygonBuffers property must be nil, in which case an
     * MPSPolygonBuffer will be created automatically.
     */
    @Generated
    @Selector("setPolygonCount:")
    public native void setPolygonCount(@NUInt long value);

    /**
     * The type of polygon. Defaults to MPSPolygonTypeTriangle. Changes to this property require
     * rebuilding the acceleration structure.
     */
    @Generated
    @Selector("setPolygonType:")
    public native void setPolygonType(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Vertex buffer containing vertex data encoded as three 32 bit floats per vertex. Note
     * that by default each vertex is aligned to the alignment of the vector_float3 type: 16 bytes.
     * This can be changed using the vertexStride property. A vertex buffer must be provided before
     * the acceleration structure is built.
     * <p>
     * When using triangle polygons, degenerate (zero or negative area) triangles are ignored
     * during acceleration structure construction. This can be used to pad triangle indices if needed.
     * <p>
     * Quadrilateral polygons are internally treated as two triangles. If the quadrilateral has
     * vertices v0, v1, v2, and v3, the two triangles will have vertices v0, v1, v2 and v0, v2, v3.
     * A quadrilateral may be used to represent a triangle by repeating the last vertex. If the first
     * triangle is degenerate (zero or negative area), the entire quadrilateral will be ignored. This
     * can be used to pad quadrilateral indices if needed. All four vertices of a quadrilateral must
     * be coplanar and the quadrilateral must be convex.
     * <p>
     * This is an alias for polygonBuffers[0].vertexBuffer. There must be exactly one polygon buffer
     * to use this property, or the polygonBuffers property must be nil, in which case an
     * MPSPolygonBuffer will be created automatically.
     */
    @Generated
    @Selector("setVertexBuffer:")
    public native void setVertexBuffer(@Mapped(ObjCObjectMapper.class) MTLBuffer value);

    /**
     * Offset, in bytes, into the vertex buffer. Defaults to 0 bytes. Must be aligned to 4
     * bytes.
     * <p>
     * This is an alias for polygonBuffers[0].vertexBufferOffset. There must be exactly one polygon
     * buffer to use this property, or the polygonBuffers property must be nil, in which case an
     * MPSPolygonBuffer will be created automatically.
     */
    @Generated
    @Selector("setVertexBufferOffset:")
    public native void setVertexBufferOffset(@NUInt long value);

    /**
     * Offset, in bytes, between consecutive vertices in the vertex buffer. Defaults to 0 bytes,
     * indicating that the vertices are packed according to the natural alignment of the vector_float3
     * type: 16 bytes.
     * <p>
     * This can be used to skip past any additional per-vertex data which may be stored
     * alongside the position such as the vertex normal and texture coordinates. Must be a multiple of
     * 4 bytes, and must be at least 12 bytes. Changes to this property require rebuilding the
     * acceleration structure.
     */
    @Generated
    @Selector("setVertexStride:")
    public native void setVertexStride(@NUInt long value);

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Vertex buffer containing vertex data encoded as three 32 bit floats per vertex. Note
     * that by default each vertex is aligned to the alignment of the vector_float3 type: 16 bytes.
     * This can be changed using the vertexStride property. A vertex buffer must be provided before
     * the acceleration structure is built.
     * <p>
     * When using triangle polygons, degenerate (zero or negative area) triangles are ignored
     * during acceleration structure construction. This can be used to pad triangle indices if needed.
     * <p>
     * Quadrilateral polygons are internally treated as two triangles. If the quadrilateral has
     * vertices v0, v1, v2, and v3, the two triangles will have vertices v0, v1, v2 and v0, v2, v3.
     * A quadrilateral may be used to represent a triangle by repeating the last vertex. If the first
     * triangle is degenerate (zero or negative area), the entire quadrilateral will be ignored. This
     * can be used to pad quadrilateral indices if needed. All four vertices of a quadrilateral must
     * be coplanar and the quadrilateral must be convex.
     * <p>
     * This is an alias for polygonBuffers[0].vertexBuffer. There must be exactly one polygon buffer
     * to use this property, or the polygonBuffers property must be nil, in which case an
     * MPSPolygonBuffer will be created automatically.
     */
    @Generated
    @Selector("vertexBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer vertexBuffer();

    /**
     * Offset, in bytes, into the vertex buffer. Defaults to 0 bytes. Must be aligned to 4
     * bytes.
     * <p>
     * This is an alias for polygonBuffers[0].vertexBufferOffset. There must be exactly one polygon
     * buffer to use this property, or the polygonBuffers property must be nil, in which case an
     * MPSPolygonBuffer will be created automatically.
     */
    @Generated
    @Selector("vertexBufferOffset")
    @NUInt
    public native long vertexBufferOffset();

    /**
     * Offset, in bytes, between consecutive vertices in the vertex buffer. Defaults to 0 bytes,
     * indicating that the vertices are packed according to the natural alignment of the vector_float3
     * type: 16 bytes.
     * <p>
     * This can be used to skip past any additional per-vertex data which may be stored
     * alongside the position such as the vertex normal and texture coordinates. Must be a multiple of
     * 4 bytes, and must be at least 12 bytes. Changes to this property require rebuilding the
     * acceleration structure.
     */
    @Generated
    @Selector("vertexStride")
    @NUInt
    public native long vertexStride();
}
