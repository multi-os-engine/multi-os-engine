package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @brief Descriptor for triangle geometry
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLAccelerationStructureTriangleGeometryDescriptor extends MTLAccelerationStructureGeometryDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLAccelerationStructureTriangleGeometryDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLAccelerationStructureTriangleGeometryDescriptor alloc();

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
    @Selector("descriptor")
    public static native MTLAccelerationStructureTriangleGeometryDescriptor descriptor();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Optional index buffer containing references to vertices in the vertex buffer. May be nil.
     */
    @Generated
    @Selector("indexBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer indexBuffer();

    /**
     * @brief Index buffer offset. Must be a multiple of the index data type size and must be aligned to both
     * the index data type's alignment and the platform's buffer offset alignment.
     */
    @Generated
    @Selector("indexBufferOffset")
    @NUInt
    public native long indexBufferOffset();

    /**
     * @brief Index type
     */
    @Generated
    @Selector("indexType")
    @NUInt
    public native long indexType();

    @Generated
    @Selector("init")
    public native MTLAccelerationStructureTriangleGeometryDescriptor init();

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

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Optional index buffer containing references to vertices in the vertex buffer. May be nil.
     */
    @Generated
    @Selector("setIndexBuffer:")
    public native void setIndexBuffer(@Mapped(ObjCObjectMapper.class) MTLBuffer value);

    /**
     * @brief Index buffer offset. Must be a multiple of the index data type size and must be aligned to both
     * the index data type's alignment and the platform's buffer offset alignment.
     */
    @Generated
    @Selector("setIndexBufferOffset:")
    public native void setIndexBufferOffset(@NUInt long value);

    /**
     * @brief Index type
     */
    @Generated
    @Selector("setIndexType:")
    public native void setIndexType(@NUInt long value);

    /**
     * @brief Number of triangles
     */
    @Generated
    @Selector("setTriangleCount:")
    public native void setTriangleCount(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * @brief Vertex buffer containing triangle vertices. Each vertex must consist of three 32-bit floats
     * encoding X, Y, and Z position. Must not be nil.
     */
    @Generated
    @Selector("setVertexBuffer:")
    public native void setVertexBuffer(@Mapped(ObjCObjectMapper.class) MTLBuffer value);

    /**
     * @brief Vertex buffer offset. Must be a multiple of the vertex stride and must be aligned to the
     * platform's buffer offset alignment.
     */
    @Generated
    @Selector("setVertexBufferOffset:")
    public native void setVertexBufferOffset(@NUInt long value);

    /**
     * @brief Stride, in bytes, between vertices in the vertex buffer. Must be at least 12 bytes and must be a
     * multiple of 4 bytes. Defaults to 12 bytes.
     */
    @Generated
    @Selector("setVertexStride:")
    public native void setVertexStride(@NUInt long value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * @brief Number of triangles
     */
    @Generated
    @Selector("triangleCount")
    @NUInt
    public native long triangleCount();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * @brief Vertex buffer containing triangle vertices. Each vertex must consist of three 32-bit floats
     * encoding X, Y, and Z position. Must not be nil.
     */
    @Generated
    @Selector("vertexBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer vertexBuffer();

    /**
     * @brief Vertex buffer offset. Must be a multiple of the vertex stride and must be aligned to the
     * platform's buffer offset alignment.
     */
    @Generated
    @Selector("vertexBufferOffset")
    @NUInt
    public native long vertexBufferOffset();

    /**
     * @brief Stride, in bytes, between vertices in the vertex buffer. Must be at least 12 bytes and must be a
     * multiple of 4 bytes. Defaults to 12 bytes.
     */
    @Generated
    @Selector("vertexStride")
    @NUInt
    public native long vertexStride();
}