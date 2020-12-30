package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
 * @brief A vertex buffer and optional index and mask buffer for a set of polygons
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSPolygonBuffer extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSPolygonBuffer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSPolygonBuffer alloc();

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

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * @brief Index buffer containing index data. Each index references a vertex in the vertex buffer.
     * May be nil.
     */
    @Generated
    @Selector("indexBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer indexBuffer();

    /**
     * @brief Offset, in bytes, into the index buffer. Defaults to 0 bytes. Must be aligned to a
     * multiple of the index type. Changes to this property require rebuilding the acceleration
     * structure.
     */
    @Generated
    @Selector("indexBufferOffset")
    @NUInt
    public native long indexBufferOffset();

    /**
     * @brief Initialize the polygon buffer
     */
    @Generated
    @Selector("init")
    public native MPSPolygonBuffer init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSPolygonBuffer initWithCoder(NSCoder aDecoder);

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
     * @brief Mask buffer containing one uint32_t mask per polygon. May be nil. Otherwise, the mask
     * type must be specified on the MPSRayIntersector with which it is used.
     */
    @Generated
    @Selector("maskBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer maskBuffer();

    /**
     * @brief Offset, in bytes, into the mask buffer. Defaults to 0 bytes. Must be aligned to 4 bytes.
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
    @Selector("polygonBuffer")
    public static native MPSPolygonBuffer polygonBuffer();

    /**
     * @brief Number of polygons. Changes to this property require rebuilding the acceleration
     * structure.
     */
    @Generated
    @Selector("polygonCount")
    @NUInt
    public native long polygonCount();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * @brief Index buffer containing index data. Each index references a vertex in the vertex buffer.
     * May be nil.
     */
    @Generated
    @Selector("setIndexBuffer:")
    public native void setIndexBuffer(@Mapped(ObjCObjectMapper.class) MTLBuffer value);

    /**
     * @brief Offset, in bytes, into the index buffer. Defaults to 0 bytes. Must be aligned to a
     * multiple of the index type. Changes to this property require rebuilding the acceleration
     * structure.
     */
    @Generated
    @Selector("setIndexBufferOffset:")
    public native void setIndexBufferOffset(@NUInt long value);

    /**
     * @brief Mask buffer containing one uint32_t mask per polygon. May be nil. Otherwise, the mask
     * type must be specified on the MPSRayIntersector with which it is used.
     */
    @Generated
    @Selector("setMaskBuffer:")
    public native void setMaskBuffer(@Mapped(ObjCObjectMapper.class) MTLBuffer value);

    /**
     * @brief Offset, in bytes, into the mask buffer. Defaults to 0 bytes. Must be aligned to 4 bytes.
     */
    @Generated
    @Selector("setMaskBufferOffset:")
    public native void setMaskBufferOffset(@NUInt long value);

    /**
     * @brief Number of polygons. Changes to this property require rebuilding the acceleration
     * structure.
     */
    @Generated
    @Selector("setPolygonCount:")
    public native void setPolygonCount(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * @brief Vertex buffer containing vertex data encoded as three 32 bit floats per vertex. Note
     * that by default each vertex is aligned to the alignment of the vector_float3 type: 16 bytes.
     * This can be changed using the vertexStride property. A vertex buffer must be provided before
     * the acceleration structure is built.
     * 
     * When using triangle polygons, degenerate (zero or negative area) triangles are ignored
     * during acceleration structure construction. This can be used to pad triangle indices if needed.
     * 
     * Quadrilateral polygons are internally treated as two triangles. If the quadrilateral has
     * vertices v0, v1, v2, and v3, the two triangles will have vertices v0, v1, v2 and v0, v2, v3.
     * A quadrilateral may be used to represent a triangle by repeating the last vertex. If the first
     * triangle is degenerate (zero or negative area), the entire quadrilateral will be ignored. This
     * can be used to pad quadrilateral indices if needed. All four vertices of a quadrilateral must
     * be coplanar and the quadrilateral must be convex.
     */
    @Generated
    @Selector("setVertexBuffer:")
    public native void setVertexBuffer(@Mapped(ObjCObjectMapper.class) MTLBuffer value);

    /**
     * @brief Offset, in bytes, into the vertex buffer. Defaults to 0 bytes. Must be aligned to 4
     * bytes.
     */
    @Generated
    @Selector("setVertexBufferOffset:")
    public native void setVertexBufferOffset(@NUInt long value);

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
     * @brief Vertex buffer containing vertex data encoded as three 32 bit floats per vertex. Note
     * that by default each vertex is aligned to the alignment of the vector_float3 type: 16 bytes.
     * This can be changed using the vertexStride property. A vertex buffer must be provided before
     * the acceleration structure is built.
     * 
     * When using triangle polygons, degenerate (zero or negative area) triangles are ignored
     * during acceleration structure construction. This can be used to pad triangle indices if needed.
     * 
     * Quadrilateral polygons are internally treated as two triangles. If the quadrilateral has
     * vertices v0, v1, v2, and v3, the two triangles will have vertices v0, v1, v2 and v0, v2, v3.
     * A quadrilateral may be used to represent a triangle by repeating the last vertex. If the first
     * triangle is degenerate (zero or negative area), the entire quadrilateral will be ignored. This
     * can be used to pad quadrilateral indices if needed. All four vertices of a quadrilateral must
     * be coplanar and the quadrilateral must be convex.
     */
    @Generated
    @Selector("vertexBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer vertexBuffer();

    /**
     * @brief Offset, in bytes, into the vertex buffer. Defaults to 0 bytes. Must be aligned to 4
     * bytes.
     */
    @Generated
    @Selector("vertexBufferOffset")
    @NUInt
    public native long vertexBufferOffset();
}