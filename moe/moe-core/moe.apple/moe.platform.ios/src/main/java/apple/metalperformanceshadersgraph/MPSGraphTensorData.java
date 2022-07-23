package apple.metalperformanceshadersgraph;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metalperformanceshaders.MPSMatrix;
import apple.metalperformanceshaders.MPSNDArray;
import apple.metalperformanceshaders.MPSVector;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
 * MPSGraphTensorData
 * <p>
 * Representation of a compute datatype
 * <p>
 * MPSGraphTensorData is how we pass data to an MPSGraph, a reference will be taken to your data and used just in time
 * when MPSGraph is run.
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphTensorData extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSGraphTensorData(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSGraphTensorData alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSGraphTensorData allocWithZone(VoidPtr zone);

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
     * [@property] dataType
     * <p>
     * dataType of the tensorData
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
     * [@property] device
     * <p>
     * device of the tensorData
     */
    @Generated
    @Selector("device")
    public native MPSGraphDevice device();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSGraphTensorData init();

    /**
     * Initialize an MPSGraphTensorData with an MPSMatrix
     * The device of the MPSMatrix will be used to get the MPSDevice for this MPSGraphTensorData.
     * [@note] If matrix.matrices == 1, then a rank 2 tensor is returned, otherwise rank 3.
     *
     * @param matrix MPSMatrix to be used within the MPSGraphTensorData
     * @return A valid MPSGraphTensorData, or nil if allocation failure.
     */
    @Generated
    @Selector("initWithMPSMatrix:")
    public native MPSGraphTensorData initWithMPSMatrix(MPSMatrix matrix);

    /**
     * Initialize an MPSGraphTensorData with an MPSMatrix enforcing rank of the result.
     * The device of the MPSMatrix will be used to get the MPSDevice for this MPSGraphTensorData.
     *
     * @param matrix MPSMatrix to be used within the MPSGraphTensorData
     * @param rank   The rank of the resulting TensorData tensor. NOTE: must be within { 1, ... ,16 }.
     * @return A valid MPSGraphTensorData of given rank, or nil if allocation failure.
     */
    @Generated
    @Selector("initWithMPSMatrix:rank:")
    public native MPSGraphTensorData initWithMPSMatrixRank(MPSMatrix matrix, @NUInt long rank);

    /**
     * Initialize an MPSGraphTensorData with an MPSNDArray
     * The device of the MPSNDArray will be used to get the MPSDevice for this MPSGraphTensorData.
     *
     * @param ndarray MPSNDArray to be used within the MPSGraphTensorData
     * @return A valid MPSGraphTensorData, or nil if allocation failure.
     */
    @Generated
    @Selector("initWithMPSNDArray:")
    public native MPSGraphTensorData initWithMPSNDArray(MPSNDArray ndarray);

    /**
     * Initialize an MPSGraphTensorData with an MPSVector
     * The device of the MPSVector will be used to get the MPSDevice for this MPSGraphTensorData.
     * [@note] If vector.vectors == 1, then a rank 1 tensor is returned, otherwise rank 2.
     *
     * @param vector MPSVector to be used within the MPSGraphTensorData
     * @return A valid MPSGraphTensorData, or nil if allocation failure.
     */
    @Generated
    @Selector("initWithMPSVector:")
    public native MPSGraphTensorData initWithMPSVector(MPSVector vector);

    /**
     * Initialize an MPSGraphTensorData with an MPSVector enforcing rank of the result.
     * The device of the MPSVector will be used to get the MPSDevice for this MPSGraphTensorData.
     * [@note] If vector.vectors == 1, then a rank 1 tensor is returned, otherwise rank 2.
     *
     * @param vector MPSVector to be used within the MPSGraphTensorData
     * @param rank   The rank of the resulting TensorData tensor. NOTE: must be within { 1, ... ,16 }.
     * @return A valid MPSGraphTensorData, or nil if allocation failure.
     */
    @Generated
    @Selector("initWithMPSVector:rank:")
    public native MPSGraphTensorData initWithMPSVectorRank(MPSVector vector, @NUInt long rank);

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
     * Return an mpsndarray object will copy contents if the contents are not stored in an MPSNDArray
     *
     * @return A valid MPSNDArray, or nil if allocation fails.
     */
    @Generated
    @Selector("mpsndarray")
    public native MPSNDArray mpsndarray();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSGraphTensorData new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
