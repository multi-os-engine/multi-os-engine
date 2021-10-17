package apple.coreml;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
 * Multidimensional Array
 */
@Generated
@Library("CoreML")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLMultiArray extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MLMultiArray(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLMultiArray alloc();

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
     * Count of total number of elements
     */
    @Generated
    @Selector("count")
    @NInt
    public native long count();

    /**
     * Unsafe pointer to underlying buffer holding the data
     */
    @Generated
    @Selector("dataPointer")
    public native VoidPtr dataPointer();

    /**
     * Type of element held
     */
    @Generated
    @Selector("dataType")
    @NInt
    public native long dataType();

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
    public native MLMultiArray init();

    /**
     * Create by wrapping existing data
     */
    @Generated
    @Selector("initWithDataPointer:shape:dataType:strides:deallocator:error:")
    public native MLMultiArray initWithDataPointerShapeDataTypeStridesDeallocatorError(VoidPtr dataPointer,
            NSArray<? extends NSNumber> shape, @NInt long dataType, NSArray<? extends NSNumber> strides,
            @ObjCBlock(name = "call_initWithDataPointerShapeDataTypeStridesDeallocatorError") Block_initWithDataPointerShapeDataTypeStridesDeallocatorError deallocator,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithDataPointerShapeDataTypeStridesDeallocatorError {
        @Generated
        void call_initWithDataPointerShapeDataTypeStridesDeallocatorError(VoidPtr bytes);
    }

    /**
     * Create by C-style contiguous array by allocating and managing the necessary memory
     */
    @Generated
    @Selector("initWithShape:dataType:error:")
    public native MLMultiArray initWithShapeDataTypeError(NSArray<? extends NSNumber> shape, @NInt long dataType,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
     * Get a value by its linear index (assumes C-style index ordering)
     */
    @Generated
    @Selector("objectAtIndexedSubscript:")
    public native NSNumber objectAtIndexedSubscript(@NInt long idx);

    /**
     * Get a value by its multidimensional index (NSArray<NSNumber *>)
     */
    @Generated
    @Selector("objectForKeyedSubscript:")
    public native NSNumber objectForKeyedSubscript(NSArray<? extends NSNumber> key);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Set a value by its linear index (assumes C-style index ordering)
     */
    @Generated
    @Selector("setObject:atIndexedSubscript:")
    public native void setObjectAtIndexedSubscript(NSNumber obj, @NInt long idx);

    /**
     * Set a value by subindicies (NSArray<NSNumber *>)
     */
    @Generated
    @Selector("setObject:forKeyedSubscript:")
    public native void setObjectForKeyedSubscript(NSNumber obj, NSArray<? extends NSNumber> key);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * An array containing the sizes of each dimension in the multiarray
     */
    @Generated
    @Selector("shape")
    public native NSArray<? extends NSNumber> shape();

    /**
     * An array containing the stride in memory for each dimension.
     * The element referred to by a multidimensional index is located at an offset equal to
     * sum_d index[d]*strides[d]. This offset is in the units of the specified dataType.
     */
    @Generated
    @Selector("strides")
    public native NSArray<? extends NSNumber> strides();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithCoder:")
    public native MLMultiArray initWithCoder(NSCoder coder);

    /**
     * Concatenate MLMultiArrays to form a new MLMultiArray.
     * <p>
     * All the source MLMultiArrays must have a same shape except the specified axis. The resultant
     * MLMultiArray has the same shape as inputs except this axis, which dimension will be the sum of
     * all the input dimensions of the axis.
     * <p>
     * For example,
     * <p>
     * \code
     * // Swift
     * let A = try MLMultiArray(shape: [2, 3], dataType: .int32)
     * let B = try MLMultiArray(shape: [2, 2], dataType: .int32)
     * let C = MLMultiArray(concatenating: [A, B], axis: 1, dataType: .int32)
     * assert(C.shape == [2, 5])
     * \endcode
     * <p>
     * \code
     * // Obj-C
     * MLMultiArray *A = [[MLMultiArray alloc] initWithShape:@[@2, @3] dataType:MLMultiArrayDataTypeInt32 error:NULL];
     * MLMultiArray *B = [[MLMultiArray alloc] initWithShape:@[@2, @2] dataType:MLMultiArrayDataTypeInt32 error:NULL];
     * MLMultiArray *C = [MLMultiArray multiArrayByConcatenatingMultiArrays:@[A, B] alongAxis:1 dataType:MLMultiArrayDataTypeInt32];
     * assert(C.shape == @[@2, @5])
     * \endcode
     * <p>
     * Numeric data will be up or down casted as needed.
     * <p>
     * The method raises NSInvalidArgumentException if the shapes of input multi arrays are not
     * compatible for concatenation.
     *
     * @param multiArrays Array of MLMultiArray instances to be concatenated.
     * @param axis        Axis index with which the concatenation will performed. The value is wrapped by the
     *                    dimension of the axis. For example, -1 is the last axis.
     * @param dataType    The data type of the resultant MLMultiArray
     */
    @Generated
    @Selector("multiArrayByConcatenatingMultiArrays:alongAxis:dataType:")
    public static native MLMultiArray multiArrayByConcatenatingMultiArraysAlongAxisDataType(
            NSArray<? extends MLMultiArray> multiArrays, @NInt long axis, @NInt long dataType);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
