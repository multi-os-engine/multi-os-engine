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
 * MLCConvolutionLayer
 * <p>
 * A convolution layer
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCConvolutionLayer extends MLCLayer {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCConvolutionLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCConvolutionLayer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCConvolutionLayer allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property]   biases
     * <p>
     * The bias tensor used by the convolution layer
     */
    @Generated
    @Selector("biases")
    public native MLCTensor biases();

    /**
     * [@property]   biasesParameter
     * <p>
     * The bias tensor parameter used for optimizer update
     */
    @Generated
    @Selector("biasesParameter")
    public native MLCTensorParameter biasesParameter();

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
     * [@property]   descriptor
     * <p>
     * The convolution descriptor
     */
    @Generated
    @Selector("descriptor")
    public native MLCConvolutionDescriptor descriptor();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLCConvolutionLayer init();

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
     * Create a convolution layer
     *
     * @param weights    The weights tensor
     * @param biases     The bias tensor
     * @param descriptor The convolution descriptor
     * @return A new convolution layer.
     */
    @Generated
    @Selector("layerWithWeights:biases:descriptor:")
    public static native MLCConvolutionLayer layerWithWeightsBiasesDescriptor(MLCTensor weights, MLCTensor biases,
            MLCConvolutionDescriptor descriptor);

    @Generated
    @Owned
    @Selector("new")
    public static native MLCConvolutionLayer new_objc();

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property]   weights
     * <p>
     * The weights tensor used by the convolution layer
     */
    @Generated
    @Selector("weights")
    public native MLCTensor weights();

    /**
     * [@property]   weightsParameter
     * <p>
     * The weights tensor parameter used for optimizer update
     */
    @Generated
    @Selector("weightsParameter")
    public native MLCTensorParameter weightsParameter();
}
