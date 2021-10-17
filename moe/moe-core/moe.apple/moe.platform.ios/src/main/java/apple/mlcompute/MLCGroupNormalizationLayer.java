package apple.mlcompute;

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
 * MLCGroupNormalizationLayer
 * <p>
 * A group normalizaion layer.  For more information, refer to https://pytorch.org/docs/stable/nn.html#groupnorm
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCGroupNormalizationLayer extends MLCLayer {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCGroupNormalizationLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCGroupNormalizationLayer alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property]   beta
     * <p>
     * The beta tensor
     */
    @Generated
    @Selector("beta")
    public native MLCTensor beta();

    /**
     * [@property]   betaParameter
     * <p>
     * The beta tensor parameter used for optimizer update
     */
    @Generated
    @Selector("betaParameter")
    public native MLCTensorParameter betaParameter();

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
     * [@property]   featureChannelCount
     * <p>
     * The number of feature channels
     */
    @Generated
    @Selector("featureChannelCount")
    @NUInt
    public native long featureChannelCount();

    /**
     * [@property]   gamma
     * <p>
     * The gamma tensor
     */
    @Generated
    @Selector("gamma")
    public native MLCTensor gamma();

    /**
     * [@property]   gammaParameter
     * <p>
     * The gamma tensor parameter used for optimizer update
     */
    @Generated
    @Selector("gammaParameter")
    public native MLCTensorParameter gammaParameter();

    /**
     * [@property]   groupCount
     * <p>
     * The number of groups to separate the channels into
     */
    @Generated
    @Selector("groupCount")
    @NUInt
    public native long groupCount();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLCGroupNormalizationLayer init();

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
     * Create a group normalization layer
     *
     * @param featureChannelCount The number of feature channels
     * @param beta                Training parameter
     * @param gamma               Training parameter
     * @param groupCount          The number of groups to divide the feature channels into
     * @param varianceEpsilon     A small numerical value added to variance for stability
     * @return A new group normalization layer.
     */
    @Generated
    @Selector("layerWithFeatureChannelCount:groupCount:beta:gamma:varianceEpsilon:")
    public static native MLCGroupNormalizationLayer layerWithFeatureChannelCountGroupCountBetaGammaVarianceEpsilon(
            @NUInt long featureChannelCount, @NUInt long groupCount, MLCTensor beta, MLCTensor gamma,
            float varianceEpsilon);

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
    @Selector("supportsDataType:onDevice:")
    public static native boolean supportsDataTypeOnDevice(int dataType, MLCDevice device);

    /**
     * [@property]   varianceEpsilon
     * <p>
     * A value used for numerical stability
     */
    @Generated
    @Selector("varianceEpsilon")
    public native float varianceEpsilon();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
