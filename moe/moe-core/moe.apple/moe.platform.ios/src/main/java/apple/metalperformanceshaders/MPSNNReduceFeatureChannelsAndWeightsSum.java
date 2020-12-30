package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNReduceFeatureChannelsAndWeightsSum extends MPSNNReduceBinary {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNReduceFeatureChannelsAndWeightsSum(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNReduceFeatureChannelsAndWeightsSum alloc();

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

    /**
     * A boolean to indicate whether the reduction should perform a weighted sum of feature channels with non-zero weights
     * 
     * If false, computes a dot product of the feature channels and weights.
     *             If true, computes a dot product of the feature channels and weights divided by the number of non-zero weights
     */
    @Generated
    @Selector("doWeightedSumByNonZeroWeights")
    public native boolean doWeightedSumByNonZeroWeights();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNNReduceFeatureChannelsAndWeightsSum init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNNReduceFeatureChannelsAndWeightsSum initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * See @ref MPSKernel#initWithCoder.
     * 
     * @param      aDecoder    The NSCoder subclass with your serialized MPSCNNPooling
     * @param      device      The MTLDevice on which to make the MPSCNNPooling
     * @return     A new MPSCNNPooling object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNNReduceFeatureChannelsAndWeightsSum initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Specifies information to apply the reduction operation on an image.
     * 
     * @param    device            The device the filter will run on
     * @return   A valid MPSNNReduceFeatureChannelsAndWeightsMean object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSNNReduceFeatureChannelsAndWeightsSum initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Specifies information to apply the reduction operation on an image.
     * 
     * @param    device                         The device the filter will run on
     * @param    doWeightedSumByNonZeroWeights  A boolean to indicate whether to compute a weighted sum or
     *                                          weighted sum divided by the number of non-zero weights
     * @return   A valid MPSNNReduceFeatureChannelsAndWeightsSum object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:doWeightedSumByNonZeroWeights:")
    public native MPSNNReduceFeatureChannelsAndWeightsSum initWithDeviceDoWeightedSumByNonZeroWeights(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, boolean doWeightedSumByNonZeroWeights);

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}