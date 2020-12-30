package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.metalperformanceshaders.struct.MPSDimensionSlice;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @class      MPSNDArrayDescriptor
 * @dependency This depends on Metal.framework
 * @abstract   A MPSNDArrayDescriptor object describes a attributes of MPSNDArray and is used to
 *             create one (see MPSNDArray discussion below)
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNDArrayDescriptor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNDArrayDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNDArrayDescriptor alloc();

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
     * @abstract  Data Type of the MPSNDArray elements
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

    /**
     * @abstract   Create an MPSNDArrayDescriptor object for a given size of dimensions.
     * @discussion Sample code:
     *  @code
     *               // Creates an NDArrayDescriptor of dimensions [32, 6, 5, 3]
     *               NSUInteger sizes[] = {3,5,6,32};
     *               [ MPSNDArray descriptorWithDataType: MPSDataTypeFloat32
     *                                    dimensionCount: 4
     *                                    dimensionSizes: sizes ];    // array of numberOfDimensions dimensions. Starts with dimension 0
     *  @endcode
     * @param      dataType           MPSDataType of elements in the MPSNDArray
     * @param      numberOfDimensions Number of dimensions in the NDArray. May not exceed 16.
     * @param      dimensionSizes     An array of NSUIntegers where dimension lengths provided by the user goes from fastest
     *                                moving to slowest moving dimension.
     *                                The product of all dimension lengths must be less than 2**31.
     *                                Additional system memory limits may apply
     * @return     A valid MPSNDArrayDescriptor object or nil, if failure.
     */
    @Generated
    @Selector("descriptorWithDataType:dimensionCount:dimensionSizes:")
    public static native MPSNDArrayDescriptor descriptorWithDataTypeDimensionCountDimensionSizes(int dataType,
            @NUInt long numberOfDimensions, NUIntPtr dimensionSizes);

    /**
     * @abstract   Create an MPSNDArrayDescriptor object for a given size of dimensions.
     * @discussion     Sample code:
     *  @code
     *               // Creates an NDArrayDescriptor of dimensions [32, 5, 6, 3]
     *               [ MPSNDArray descriptorWithDataType: MPSDataTypeFloat32
     *                                    dimensionSizes: 3, 6, 5, 32, 0 //<--list terminator! ]; // array of numberOfDimensions dimensions. Starts with dimension 0
     *  @endcode
     * @param      dataType           MPSDataType of elements in the MPSNDArray
     * @param      dimension0         The start of a 0-terminated variadric list of NSUIntegers where dimension lengths provided by the user goes from fastest
     *                                moving to slowest moving dimension.
     *                                The product of all dimension sizes must be less than 2**31.
     *                                Additional system memory limits may apply
     * @return     A valid MPSNDArrayDescriptor object or nil, if failure.
     */
    @Generated
    @Variadic()
    @Selector("descriptorWithDataType:dimensionSizes:")
    public static native MPSNDArrayDescriptor descriptorWithDataTypeDimensionSizes(int dataType, @NUInt long dimension0,
            Object... varargs);

    /**
     * @abstract   A convenience function to create an MPSNDArrayDescriptor object for a given size of dimensions.
     * @discussion Sample code:
     *  @code
     *               // Creates an NDArrayDescriptor of dimensions [32, 6, 5, 3]
     *               NSArray<NSNumber *> sizes = {@32,@6,@5,@3};
     *               [ MPSNDArray descriptorWithDataType: MPSDataTypeFloat32
     *                                             shape: &sizes];
     *  @endcode
     * @param      dataType           MPSDataType of elements in the MPSNDArray
     * @param      shape              An array of NSUIntegers where dimension lengths provided by the user goes from slowest
     *                                moving to fastest moving dimension. This is same order as MLMultiArray in coreML and most frameworks in Python
     *                                The product of all dimension lengths must be less than 2**31.
     *                                Additional system memory limits may apply
     * @return     A valid MPSNDArrayDescriptor object or nil, if failure.
     */
    @Generated
    @Selector("descriptorWithDataType:shape:")
    public static native MPSNDArrayDescriptor descriptorWithDataTypeShape(int dataType,
            NSArray<? extends NSNumber> shape);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNDArrayDescriptor init();

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
     * @abstract   The number of elements of type dataType in the indicated dimension.
     * @discussion If dimensionIndex >= numberOfDimensions, 1 will be returned.
     * @param      dimensionIndex  dimension the MPSNDArray for which to return the length
     * @return     The number of elements in that dimension.
     */
    @Generated
    @Selector("lengthOfDimension:")
    @NUInt
    public native long lengthOfDimension(@NUInt long dimensionIndex);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * @abstract   The number of dimensions in the NDArray.
     * @discussion May not exceed 16. A 0-diumension MPSNDArray is a single scalar value.
     *             Undefined dimensions are implicitly length 1.
     */
    @Generated
    @Selector("numberOfDimensions")
    @NUInt
    public native long numberOfDimensions();

    /**
     * @abstract   Changes dimension sizes and number of dimensions on the current descriptor
     * @param      numberOfDimensions Number of dimensions in the NDArray. May not exceed 16.
     * @param      dimensionSizes     An array of NSUIntegers where dimension lengths provided by the user goes from fastest
     *                                moving to slowest moving dimension.
     *                                The product of all dimension lengths must be less than 2**31.
     *                                Additional system memory limits may apply
     */
    @Generated
    @Selector("reshapeWithDimensionCount:dimensionSizes:")
    public native void reshapeWithDimensionCountDimensionSizes(@NUInt long numberOfDimensions, NUIntPtr dimensionSizes);

    /**
     * @abstract   Changes dimension sizes and number of dimensions on the current descriptor
     * @param      shape              An array of NSUIntegers where dimension lengths provided by the user goes from slowest
     *                                moving to fastest moving dimension. This is same order as MLMultiArray in coreML and most frameworks in Python
     *                                The product of all dimension lengths must be less than 2**31.
     *                                Additional system memory limits may apply
     */
    @Generated
    @Selector("reshapeWithShape:")
    public native void reshapeWithShape(NSArray<? extends NSNumber> shape);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * @abstract  Data Type of the MPSNDArray elements
     */
    @Generated
    @Selector("setDataType:")
    public native void setDataType(int value);

    /**
     * @abstract   The number of dimensions in the NDArray.
     * @discussion May not exceed 16. A 0-diumension MPSNDArray is a single scalar value.
     *             Undefined dimensions are implicitly length 1.
     */
    @Generated
    @Selector("setNumberOfDimensions:")
    public native void setNumberOfDimensions(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * @abstract      The slice dimensions for each dimension
     * @discusion     A slice is a subregion of a dimension. It is
     *                used to calve off a fraction of a larger NDArray.
     * 
     *                Default:  NSRange(0, lengthOfDimension(i))
     * 
     * @param         subRange                 The region of the slice, start value is wrt dimensionLength of the NDArray.
     * @param         dimensionIndex           The index of the dimension. Must be < numberOfDimensions
     */
    @Generated
    @Selector("sliceDimension:withSubrange:")
    public native void sliceDimensionWithSubrange(@NUInt long dimensionIndex, @ByValue MPSDimensionSlice subRange);

    /**
     * @abstract      The slice dimensions for each dimension
     * @discusion     A slice is a subregion of a dimension. It is
     *                used to calve off a fraction of a larger NDArray.
     * @param         dimensionIndex           The index of the dimension
     * @return        Returns the slice range for the index. If the
     *                dimensionIndex >= numberOfDimensions, {0,1} is returned.
     */
    @Generated
    @Selector("sliceRangeForDimension:")
    @ByValue
    public native MPSDimensionSlice sliceRangeForDimension(@NUInt long dimensionIndex);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * @abstract    transpose two dimensions
     * @discusion   If the intention is to insert a length 1 dimension, increment the numberOfDimensions first.
     * @param       dimensionIndex  The first dimension. Must be < numberOfDimensions
     * @param       dimensionIndex2 The second dimension.  Must be < number of Dimensions.
     */
    @Generated
    @Selector("transposeDimension:withDimension:")
    public native void transposeDimensionWithDimension(@NUInt long dimensionIndex, @NUInt long dimensionIndex2);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}