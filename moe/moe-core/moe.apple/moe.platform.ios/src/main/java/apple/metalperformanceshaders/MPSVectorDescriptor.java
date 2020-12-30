package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * MPSVectorDescriptor
 * 
 * [@dependency] This depends on Metal.framework
 * 
 * A MPSVectorDescriptor describes the length and data type of a
 *             an array of 1-dimensional vectors.  All vectors are stored as
 *             contiguous arrays of data.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSVectorDescriptor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSVectorDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSVectorDescriptor alloc();

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

    /**
     * [@property]   dataType
     * 
     * The type of the data which makes up the values of the vector.
     */
    @Generated
    @Selector("dataType")
    public native int dataType();

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
    public native MPSVectorDescriptor init();

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
     * [@property]   length
     * 
     * The number of elements in the vector.
     */
    @Generated
    @Selector("length")
    @NUInt
    public native long length();

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
     * [@property]   dataType
     * 
     * The type of the data which makes up the values of the vector.
     */
    @Generated
    @Selector("setDataType:")
    public native void setDataType(int value);

    /**
     * [@property]   length
     * 
     * The number of elements in the vector.
     */
    @Generated
    @Selector("setLength:")
    public native void setLength(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property]   vectorBytes
     * 
     * The stride, in bytes, between corresponding elements of
     *             consecutive vectors.  Must be a multiple of the element size
     */
    @Generated
    @Selector("vectorBytes")
    @NUInt
    public native long vectorBytes();

    /**
     * Return the recommended stride, in bytes, to be used for an array
     *             of vectors of a given length.
     * 
     * To achieve best performance the optimal stride between vectors within an array of
     *             vectors is not necessarily equivalent to the number of elements per vector.  This method
     *             returns the stride, in bytes, which gives best performance for a given vector length.
     *             Using this stride to construct your array is recommended, but not required (provided that
     *             the stride used is still large enough to allocate a full vector of data).
     * 
     * @param      length          The number of elements in a single vector.
     * 
     * @param      dataType        The type of vector data values.
     */
    @Generated
    @Selector("vectorBytesForLength:dataType:")
    @NUInt
    public static native long vectorBytesForLengthDataType(@NUInt long length, int dataType);

    /**
     * Create a MPSVectorDescriptor with the specified length and data type.
     * 
     * Use this function for creating a descriptor of a MPSVector object
     *             containing a single vector.
     * 
     * @param      length              The number of elements in a single vector.
     * 
     * @param      dataType            The type of the data to be stored in the vector.
     */
    @Generated
    @Selector("vectorDescriptorWithLength:dataType:")
    public static native MPSVectorDescriptor vectorDescriptorWithLengthDataType(@NUInt long length, int dataType);

    /**
     * Create a MPSVectorDescriptor with the specified length and data type.
     * 
     * For performance considerations the optimal stride between vectors may not necessarily be equal
     *             to the vector length.  The MPSVectorDescriptor class provides a method which
     *             may be used to determine this value, see the vectorBytesForLength API.
     * 
     * @param      length              The number of elements in a single vector.
     * 
     * @param      vectors             The number of vectors in the MPSVector object.
     * 
     * @param      vectorBytes         The number of bytes between starting elements of consecutive
     *                                 vectors.
     * 
     * @param      dataType            The type of the data to be stored in the vector.
     */
    @Generated
    @Selector("vectorDescriptorWithLength:vectors:vectorBytes:dataType:")
    public static native MPSVectorDescriptor vectorDescriptorWithLengthVectorsVectorBytesDataType(@NUInt long length,
            @NUInt long vectors, @NUInt long vectorBytes, int dataType);

    /**
     * [@property]   vectors
     * 
     * The number of vectors.
     */
    @Generated
    @Selector("vectors")
    @NUInt
    public native long vectors();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}