package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metalperformanceshaders.protocol.MPSCNNConvolutionDataSource;
import apple.metalperformanceshaders.protocol.MPSNNTrainableNode;
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
 * A MPSNNFilterNode representing a MPSCNNConvolution kernel
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNConvolutionNode extends MPSNNFilterNode implements MPSNNTrainableNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNConvolutionNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNConvolutionNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNConvolutionNode allocWithZone(VoidPtr zone);

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
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNConvolutionNode init();

    /**
     * Init a node representing a MPSCNNConvolution kernel
     *
     * @param sourceNode The MPSNNImageNode representing the source MPSImage for the filter
     * @param weights    A pointer to a valid object conforming to the MPSCNNConvolutionDataSource
     *                   protocol. This object is provided by you to encapsulate storage for
     *                   convolution weights and biases. If it is used for training, it may not
     *                   have a neuron embedded in the convolution descriptor.
     * @return A new MPSNNFilter node for a MPSCNNConvolution kernel.
     */
    @Generated
    @Selector("initWithSource:weights:")
    public native MPSCNNConvolutionNode initWithSourceWeights(MPSNNImageNode sourceNode,
            @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource weights);

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
    public static native MPSCNNConvolutionNode new_objc();

    /**
     * Init an autoreleased not representing a MPSCNNConvolution kernel
     *
     * @param sourceNode The MPSNNImageNode representing the source MPSImage for the filter
     * @param weights    A pointer to a valid object conforming to the MPSCNNConvolutionDataSource
     *                   protocol. This object is provided by you to encapsulate storage for
     *                   convolution weights and biases. If it is used for training, it may not
     *                   have a neuron embedded in the convolution descriptor.
     * @return A new MPSNNFilter node for a MPSCNNConvolution kernel.
     */
    @Generated
    @Selector("nodeWithSource:weights:")
    public static native MPSCNNConvolutionNode nodeWithSourceWeights(MPSNNImageNode sourceNode,
            @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource weights);

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

    /**
     * Set the floating-point precision used by the convolution accumulator
     * <p>
     * Default:  MPSNNConvolutionAccumulatorPrecisionOptionFloat
     */
    @Generated
    @Selector("accumulatorPrecision")
    @NUInt
    public native long accumulatorPrecision();

    /**
     * A node to represent a MPSCNNConvolutionGradientState object
     * <p>
     * Use this if the convolution is mirrored by a convolution transpose node
     * later on in the graph to make sure that the size of the image returned
     * from the convolution transpose matches the size of the image passed in
     * to this node.
     */
    @Generated
    @Selector("convolutionGradientState")
    public native MPSCNNConvolutionGradientStateNode convolutionGradientState();

    /**
     * Set the floating-point precision used by the convolution accumulator
     * <p>
     * Default:  MPSNNConvolutionAccumulatorPrecisionOptionFloat
     */
    @Generated
    @Selector("setAccumulatorPrecision:")
    public native void setAccumulatorPrecision(@NUInt long value);

    @Generated
    @Selector("setTrainingStyle:")
    public native void setTrainingStyle(@NUInt long value);

    @Generated
    @Selector("trainingStyle")
    @NUInt
    public native long trainingStyle();
}
