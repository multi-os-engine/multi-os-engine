package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metalperformanceshaders.protocol.MPSNNPadding;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSNNFilterNode
 * <p>
 * A placeholder node denoting a neural network filter stage
 * <p>
 * There are as many MPSNNFilterNode subclasses as there are
 * MPS neural network filter objects. Make one of those.
 * This class defines an polymorphic interface for them.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNFilterNode extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNFilterNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNFilterNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNFilterNode allocWithZone(VoidPtr zone);

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
    public native MPSNNFilterNode init();

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
     * [@property] label
     * <p>
     * A string to help identify this object.
     */
    @Generated
    @Selector("label")
    public native String label();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSNNFilterNode new_objc();

    /**
     * The padding method used for the filter node
     * <p>
     * The padding policy configures how the filter centers
     * the region of interest in the source image. It principally
     * is responsible for setting the MPSCNNKernel.offset and
     * the size of the image produced, and sometimes will also
     * configure .sourceFeatureChannelOffset, .sourceFeatureChannelMaxCount,
     * and .edgeMode. It is permitted to set any other filter properties
     * as needed using a custom padding policy. The default padding
     * policy varies per filter to conform to consensus expectation for
     * the behavior of that filter. In some cases, pre-made padding
     * policies are provided to match the behavior of common neural
     * networking frameworks with particularly complex or unexpected
     * behavior for specific nodes. See MPSNNDefaultPadding class methods
     * in MPSNeuralNetworkTypes.h for more.
     * <p>
     * BUG: MPS doesn't provide a good way to reset the MPSKernel properties
     * in the context of a MPSNNGraph after the kernel is finished encoding.
     * These values carry on to the next time the graph is used. Consequently,
     * if your custom padding policy modifies the property as a function of the
     * previous value, e.g.:
     * <p>
     * kernel.someProperty += 2;
     * <p>
     * then the second time the graph runs, the property may have an inconsistent
     * value, leading to unexpected behavior. The default padding computation
     * runs before the custom padding method to provide it with a sense of
     * what is expected for the default configuration and will reinitialize the value
     * in the case of the .offset. However, that computation usually doesn't reset
     * other properties. In such cases, the custom padding policy may need to keep
     * a record of the original value to enable consistent behavior.
     */
    @Generated
    @Selector("paddingPolicy")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSNNPadding paddingPolicy();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Get the node representing the image result of the filter
     * <p>
     * Except where otherwise noted, the precision used for the
     * result image (see format property) is copied from the precision
     * from the first input image node.
     */
    @Generated
    @Selector("resultImage")
    public native MPSNNImageNode resultImage();

    /**
     * convenience method for resultStates[0]
     * <p>
     * If resultStates is nil, returns nil
     */
    @Generated
    @Selector("resultState")
    public native MPSNNStateNode resultState();

    /**
     * Get the node representing the state result of the filter
     * <p>
     * If more than one, see description of subclass for ordering.
     */
    @Generated
    @Selector("resultStates")
    public native NSArray<? extends MPSNNStateNode> resultStates();

    /**
     * [@property] label
     * <p>
     * A string to help identify this object.
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(String value);

    /**
     * The padding method used for the filter node
     * <p>
     * The padding policy configures how the filter centers
     * the region of interest in the source image. It principally
     * is responsible for setting the MPSCNNKernel.offset and
     * the size of the image produced, and sometimes will also
     * configure .sourceFeatureChannelOffset, .sourceFeatureChannelMaxCount,
     * and .edgeMode. It is permitted to set any other filter properties
     * as needed using a custom padding policy. The default padding
     * policy varies per filter to conform to consensus expectation for
     * the behavior of that filter. In some cases, pre-made padding
     * policies are provided to match the behavior of common neural
     * networking frameworks with particularly complex or unexpected
     * behavior for specific nodes. See MPSNNDefaultPadding class methods
     * in MPSNeuralNetworkTypes.h for more.
     * <p>
     * BUG: MPS doesn't provide a good way to reset the MPSKernel properties
     * in the context of a MPSNNGraph after the kernel is finished encoding.
     * These values carry on to the next time the graph is used. Consequently,
     * if your custom padding policy modifies the property as a function of the
     * previous value, e.g.:
     * <p>
     * kernel.someProperty += 2;
     * <p>
     * then the second time the graph runs, the property may have an inconsistent
     * value, leading to unexpected behavior. The default padding computation
     * runs before the custom padding method to provide it with a sense of
     * what is expected for the default configuration and will reinitialize the value
     * in the case of the .offset. However, that computation usually doesn't reset
     * other properties. In such cases, the custom padding policy may need to keep
     * a record of the original value to enable consistent behavior.
     */
    @Generated
    @Selector("setPaddingPolicy:")
    public native void setPaddingPolicy(@Mapped(ObjCObjectMapper.class) MPSNNPadding value);

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
     * Return the gradient (backwards) version of this filter.
     * <p>
     * The backwards training version of the filter will be returned.
     * The non-gradient image and state arguments for the filter are automatically
     * obtained from the target.
     *
     * @param gradientImage The gradient images corresponding with the resultImage
     *                      of the target
     */
    @Generated
    @Selector("gradientFilterWithSource:")
    public native MPSNNGradientFilterNode gradientFilterWithSource(MPSNNImageNode gradientImage);

    /**
     * Return the gradient (backwards) version of this filter.
     * <p>
     * The backwards training version of the filter will be returned.
     * The non-gradient image and state arguments for the filter are automatically
     * obtained from the target.
     *
     * @param gradientImages The gradient images corresponding with the resultImage
     *                       of the target
     */
    @Generated
    @Selector("gradientFilterWithSources:")
    public native MPSNNGradientFilterNode gradientFilterWithSources(NSArray<? extends MPSNNImageNode> gradientImages);

    /**
     * Return multiple gradient versions of the filter
     * <p>
     * MPSNNFilters that consume multiple inputs generally result in
     * multiple conjugate filters for the gradient computation at
     * the end of training. For example, a single concatenation operation
     * that concatenates multple images will result in an array of slice
     * operators that carve out subsections of the input gradient image.
     */
    @Generated
    @Selector("gradientFiltersWithSource:")
    public native NSArray<? extends MPSNNGradientFilterNode> gradientFiltersWithSource(MPSNNImageNode gradientImage);

    /**
     * Return multiple gradient versions of the filter
     * <p>
     * MPSNNFilters that consume multiple inputs generally result in
     * multiple conjugate filters for the gradient computation at
     * the end of training. For example, a single concatenation operation
     * that concatenates multple images will result in an array of slice
     * operators that carve out subsections of the input gradient image.
     */
    @Generated
    @Selector("gradientFiltersWithSources:")
    public native NSArray<? extends MPSNNGradientFilterNode> gradientFiltersWithSources(
            NSArray<? extends MPSNNImageNode> gradientImages);

    /**
     * Build training graph from inference graph
     * <p>
     * This method will iteratively build the training portion of a graph based
     * on an inference graph. Self should be the last node in the
     * inference graph. It is typically a loss layer, but can be anything.
     * Typically, the "inference graph" used here is the desired inference
     * graph with a dropout node and a loss layer node appended.
     * <p>
     * The nodes that are created will have default properties. In certain cases,
     * these may not be appropriate (e.g. if you want to do CPU based updates
     * of convolution weights instead of default GPU updates.) In such cases, your
     * application should use the nodeHandler to configure the new nodes as they are
     * created.
     * <p>
     * BUG: This method can not follow links to regions of the graph that are
     * connected to the rest of the graph solely via MPSNNStateNodes. A gradient
     * image input is required to construct a MPSNNGradientFilterNode from a
     * inference filter node.
     *
     * @param gradientImage The input gradient image for the first gradient
     *                      node in the training section of the graph. If nil,
     *                      self.resultImage is used. This results in a standard monolithic
     *                      training graph. If the graph is instead divided into multiple
     *                      subgraphs (potentially to allow for your custom code to appear
     *                      inbetween MPSNNGraph segments) a new MPSImageNode*
     *                      may be substituted.
     * @param nodeHandler   An optional block to allow for customization of gradient
     *                      nodes and intermediate images as the graph is constructed.
     *                      It may also be used to prune braches of the developing
     *                      training graph. If nil, the default handler is used. It builds
     *                      the full graph, and assigns any inferenceNodeSources[i].handle
     *                      to their gradient counterparts.
     * @return The list of new MPSNNFilterNode training graph termini. These MPSNNFilterNodes
     *         are not necessarily all MPSNNGradientFilterNodes. To build a full list of nodes
     *         created, use a custom nodeHandler. If no nodes are created nil is returned.
     */
    @Generated
    @Selector("trainingGraphWithSourceGradient:nodeHandler:")
    public native NSArray<? extends MPSNNFilterNode> trainingGraphWithSourceGradientNodeHandler(
            MPSNNImageNode gradientImage,
            @ObjCBlock(name = "call_trainingGraphWithSourceGradientNodeHandler") Block_trainingGraphWithSourceGradientNodeHandler nodeHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_trainingGraphWithSourceGradientNodeHandler {
        @Generated
        void call_trainingGraphWithSourceGradientNodeHandler(MPSNNFilterNode gradientNode,
                MPSNNFilterNode inferenceNode, MPSNNImageNode inferenceSource, MPSNNImageNode gradientSource);
    }
}
