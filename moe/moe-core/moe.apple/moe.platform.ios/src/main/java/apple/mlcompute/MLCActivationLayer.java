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

@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCActivationLayer extends MLCLayer {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCActivationLayer(Pointer peer) {
        super(peer);
    }

    /**
     * Create an absolute activation layer
     *
     * @return A new activation layer
     */
    @Generated
    @Selector("absoluteLayer")
    public static native MLCActivationLayer absoluteLayer();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCActivationLayer alloc();

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

    /**
     * Create a CELU activation layer
     *
     * @return A new activation layer
     */
    @Generated
    @Selector("celuLayer")
    public static native MLCActivationLayer celuLayer();

    /**
     * Create a CELU activation layer
     *
     * @param a The \p a value for the CELU formation
     * @return A new activation layer
     */
    @Generated
    @Selector("celuLayerWithA:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object celuLayerWithA(float a);

    /**
     * Create a clamp activation layer
     *
     * @param minValue The minimum range used by clamp
     * @param maxValue The maximum range used by clamp
     * @return A new activation layer
     */
    @Generated
    @Selector("clampLayerWithMinValue:maxValue:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object clampLayerWithMinValueMaxValue(float minValue, float maxValue);

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
     * [@property]   descriptor
     * <p>
     * The activation descriptor
     */
    @Generated
    @Selector("descriptor")
    public native MLCActivationDescriptor descriptor();

    /**
     * Create an ELU activation layer
     *
     * @return A new activation layer
     */
    @Generated
    @Selector("eluLayer")
    public static native MLCActivationLayer eluLayer();

    /**
     * Create an ELU activation layer
     *
     * @param a The \p a value for the ELU formation
     * @return A new activation layer
     */
    @Generated
    @Selector("eluLayerWithA:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object eluLayerWithA(float a);

    /**
     * Create a GELU activation layer
     *
     * @return A new activation layer
     */
    @Generated
    @Selector("geluLayer")
    public static native MLCActivationLayer geluLayer();

    /**
     * Create a hard shrink activation layer
     *
     * @return A new activation layer
     */
    @Generated
    @Selector("hardShrinkLayer")
    public static native MLCActivationLayer hardShrinkLayer();

    /**
     * Create a hard shrink activation layer
     *
     * @param a The \p a value for the hard shrink formation
     * @return A new activation layer
     */
    @Generated
    @Selector("hardShrinkLayerWithA:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object hardShrinkLayerWithA(float a);

    /**
     * Create a hard sigmoid activation layer
     *
     * @return A new activation layer
     */
    @Generated
    @Selector("hardSigmoidLayer")
    public static native MLCActivationLayer hardSigmoidLayer();

    /**
     * Create a hardswish activation layer
     *
     * @return A new activation layer
     */
    @Generated
    @Selector("hardSwishLayer")
    public static native MLCActivationLayer hardSwishLayer();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLCActivationLayer init();

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
     * Create an activation layer
     *
     * @param descriptor The activation descriptor
     * @return A new activation layer
     */
    @Generated
    @Selector("layerWithDescriptor:")
    public static native MLCActivationLayer layerWithDescriptor(MLCActivationDescriptor descriptor);

    /**
     * Create a leaky ReLU activation layer
     *
     * @return A new activation layer
     */
    @Generated
    @Selector("leakyReLULayer")
    public static native MLCActivationLayer leakyReLULayer();

    /**
     * Create a leaky ReLU activation layer
     *
     * @param negativeSlope Controls the angle of the negative slope
     * @return A new activation layer
     */
    @Generated
    @Selector("leakyReLULayerWithNegativeSlope:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object leakyReLULayerWithNegativeSlope(float negativeSlope);

    /**
     * Create a linear activation layer
     *
     * @param scale The scale factor
     * @param bias  The bias value
     * @return A new activation layer
     */
    @Generated
    @Selector("linearLayerWithScale:bias:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object linearLayerWithScaleBias(float scale, float bias);

    /**
     * Create a log sigmoid activation layer
     *
     * @return A new activation layer
     */
    @Generated
    @Selector("logSigmoidLayer")
    public static native MLCActivationLayer logSigmoidLayer();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * Create a ReLU6 activation layer
     *
     * @return A new activation layer
     */
    @Generated
    @Selector("relu6Layer")
    public static native MLCActivationLayer relu6Layer();

    /**
     * Create a ReLU activation layer
     *
     * @return A new activation layer
     */
    @Generated
    @Selector("reluLayer")
    public static native MLCActivationLayer reluLayer();

    /**
     * Create a ReLUN activation layer
     * <p>
     * This can be used to implement layers such as ReLU6 for example.
     *
     * @param a The \p a value
     * @param b The \p b value
     * @return A new activation layer
     */
    @Generated
    @Selector("relunLayerWithA:b:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object relunLayerWithAB(float a, float b);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Create a SELU activation layer
     *
     * @return A new activation layer
     */
    @Generated
    @Selector("seluLayer")
    public static native MLCActivationLayer seluLayer();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Create a sigmoid activation layer
     *
     * @return A new activation layer
     */
    @Generated
    @Selector("sigmoidLayer")
    public static native MLCActivationLayer sigmoidLayer();

    /**
     * Create a soft plus activation layer
     *
     * @return A new activation layer
     */
    @Generated
    @Selector("softPlusLayer")
    public static native MLCActivationLayer softPlusLayer();

    /**
     * Create a soft plus activation layer
     *
     * @param beta The beta value for the softplus formation
     * @return A new activation layer
     */
    @Generated
    @Selector("softPlusLayerWithBeta:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object softPlusLayerWithBeta(float beta);

    /**
     * Create a soft shrink activation layer
     *
     * @return A new activation layer
     */
    @Generated
    @Selector("softShrinkLayer")
    public static native MLCActivationLayer softShrinkLayer();

    /**
     * Create a soft shrink activation layer
     *
     * @param a The \p a value for the soft shrink formation
     * @return A new activation layer
     */
    @Generated
    @Selector("softShrinkLayerWithA:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object softShrinkLayerWithA(float a);

    /**
     * Create a soft sign activation layer
     *
     * @return A new activation layer
     */
    @Generated
    @Selector("softSignLayer")
    public static native MLCActivationLayer softSignLayer();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsDataType:onDevice:")
    public static native boolean supportsDataTypeOnDevice(int dataType, MLCDevice device);

    /**
     * Create a tanh activation layer
     *
     * @return A new activation layer
     */
    @Generated
    @Selector("tanhLayer")
    public static native MLCActivationLayer tanhLayer();

    /**
     * Create a TanhShrink activation layer
     *
     * @return A new activation layer
     */
    @Generated
    @Selector("tanhShrinkLayer")
    public static native MLCActivationLayer tanhShrinkLayer();

    /**
     * Create a threshold activation layer
     *
     * @param threshold   The value to threshold at
     * @param replacement The value to replace with
     * @return A new activation layer
     */
    @Generated
    @Selector("thresholdLayerWithThreshold:replacement:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object thresholdLayerWithThresholdReplacement(float threshold, float replacement);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
