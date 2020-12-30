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

/**
 * A MPSNNFilterNode representing a MPSCNNConvolutionTranspose kernel
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNConvolutionTransposeNode extends MPSCNNConvolutionNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNConvolutionTransposeNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNConvolutionTransposeNode alloc();

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
    public native MPSCNNConvolutionTransposeNode init();

    @Generated
    @Selector("initWithSource:weights:")
    public native MPSCNNConvolutionTransposeNode initWithSourceWeights(MPSNNImageNode sourceNode,
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
    @Selector("nodeWithSource:weights:")
    public static native MPSCNNConvolutionTransposeNode nodeWithSourceWeights(MPSNNImageNode sourceNode,
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
     * Init a node representing a MPSCNNConvolutionTransposeNode kernel
     * 
     * @param      sourceNode              The MPSNNImageNode representing the source MPSImage for the filter
     * @param      convolutionGradientState        When the convolution transpose is used to 'undo' an earlier convolution
     *                                     in the graph, it is generally desired that the output image be the same
     *                                     size as the input image to the earlier convolution. You may optionally
     *                                     specify this size identity by passing in the MPSCNNConvolutionGradientState node
     *                                     here.
     * @param      weights                 A pointer to a valid object conforming to the MPSCNNConvolutionDataSource
     *                                     protocol. This object is provided by you to encapsulate storage for
     *                                     convolution weights and biases.
     * @return     A new MPSNNFilter node for a MPSCNNConvolutionTransposeNode kernel.
     */
    @Generated
    @Selector("initWithSource:convolutionGradientState:weights:")
    public native MPSCNNConvolutionTransposeNode initWithSourceConvolutionGradientStateWeights(
            MPSNNImageNode sourceNode, MPSCNNConvolutionGradientStateNode convolutionGradientState,
            @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource weights);

    /**
     * Init an autoreleased not representing a MPSCNNConvolutionTransposeNode kernel
     * 
     * @param      sourceNode              The MPSNNImageNode representing the source MPSImage for the filter
     * @param      convolutionGradientState        When the convolution transpose is used to 'undo' an earlier convolution
     *                                     in the graph, it is generally desired that the output image be the same
     *                                     size as the input image to the earlier convolution. You may optionally
     *                                     specify this size identity by passing in the MPSNNConvolutionGradientStateNode
     *                                     created by the convolution node here.
     * @param      weights                 A pointer to a valid object conforming to the MPSCNNConvolutionDataSource
     *                                     protocol. This object is provided by you to encapsulate storage for
     *                                     convolution weights and biases.
     * @return     A new MPSNNFilter node for a MPSCNNConvolutionTransposeNode kernel.
     */
    @Generated
    @Selector("nodeWithSource:convolutionGradientState:weights:")
    public static native MPSCNNConvolutionTransposeNode nodeWithSourceConvolutionGradientStateWeights(
            MPSNNImageNode sourceNode, MPSCNNConvolutionGradientStateNode convolutionGradientState,
            @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource weights);
}