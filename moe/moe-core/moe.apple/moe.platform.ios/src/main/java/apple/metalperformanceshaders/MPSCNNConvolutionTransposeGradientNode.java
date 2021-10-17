package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metalperformanceshaders.protocol.MPSCNNConvolutionDataSource;
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
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNConvolutionTransposeGradientNode extends MPSCNNConvolutionGradientNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNConvolutionTransposeGradientNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNConvolutionTransposeGradientNode alloc();

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
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNConvolutionTransposeGradientNode init();

    @Generated
    @Selector("initWithSourceGradient:sourceImage:convolutionGradientState:weights:")
    public native MPSCNNConvolutionTransposeGradientNode initWithSourceGradientSourceImageConvolutionGradientStateWeights(
            MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage, MPSCNNConvolutionGradientStateNode gradientState,
            @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource weights);

    /**
     * A node to represent the gradient calculation for convolution transpose training.
     *
     * @param sourceGradient The input gradient from the 'downstream' gradient filter. Often
     *                       that is a neuron gradient filter node.
     * @param sourceImage    The input image from the forward convolution transpose node
     * @param gradientState  The gradient state from the forward convolution transpose
     * @param weights        The data source from the forward convolution transpose. It may not contain
     *                       an integrated neuron. Similary, any normalization should be
     *                       broken out into a separate node. Pass nil to use the weights
     *                       from the forward convolution transpose pass.
     * @return A MPSCNNConvolutionTransposeGradientNode
     */
    @Generated
    @Selector("initWithSourceGradient:sourceImage:convolutionTransposeGradientState:weights:")
    public native MPSCNNConvolutionTransposeGradientNode initWithSourceGradientSourceImageConvolutionTransposeGradientStateWeights(
            MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage,
            MPSCNNConvolutionTransposeGradientStateNode gradientState,
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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("nodeWithSourceGradient:sourceImage:convolutionGradientState:weights:")
    public static native MPSCNNConvolutionTransposeGradientNode nodeWithSourceGradientSourceImageConvolutionGradientStateWeights(
            MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage, MPSCNNConvolutionGradientStateNode gradientState,
            @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource weights);

    /**
     * A node to represent the gradient calculation for convolution transpose training.
     *
     * @param sourceGradient The input gradient from the 'downstream' gradient filter. Often
     *                       that is a neuron gradient filter node.
     * @param sourceImage    The input image from the forward convolution transpose node
     * @param gradientState  The gradient state from the forward convolution transpose
     * @param weights        The data source from the forward convolution transpose. It may not contain
     *                       an integrated neuron. Similary, any normalization should be
     *                       broken out into a separate node. Pass nil to use the weights
     *                       from the forward convolution transpose pass.
     * @return A MPSCNNConvolutionTransposeGradientNode
     */
    @Generated
    @Selector("nodeWithSourceGradient:sourceImage:convolutionTransposeGradientState:weights:")
    public static native MPSCNNConvolutionTransposeGradientNode nodeWithSourceGradientSourceImageConvolutionTransposeGradientStateWeights(
            MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage,
            MPSCNNConvolutionTransposeGradientStateNode gradientState,
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
}
