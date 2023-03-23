package apple.metalperformanceshaders;

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
 * Node representing a the concatenation (in the feature channel dimension) of the results from one or more kernels
 * 
 * API-Since: 11.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNConcatenationNode extends MPSNNFilterNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNConcatenationNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNConcatenationNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNConcatenationNode allocWithZone(VoidPtr zone);

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
    public native MPSNNConcatenationNode init();

    /**
     * Init a node that concatenates feature channels from multiple images
     * 
     * In some neural network designs, it is necessary to append feature channels
     * from one neural network filter to the results of another. If we have three
     * image nodes with M, N and O feature channels in them, passed to -initWithSources:
     * as @[imageM, imageN, imageO], then feature channels [0,M-1] will be drawn from
     * image M, feature channels [M, M+N-1] will be drawn from image N and feature channels
     * [M+N, M+N+O-1] will be drawn from image O.
     * 
     * As all images are padded out to a multiple of four feature channels,
     * M, N and O here are also multiples of four, even when the MPSImages
     * are not. That is, if the image is 23 feature channels and one channel
     * of padding, it takes up 24 feature channels worth of space in the
     * concatenated result.
     * 
     * Performance Note: Generally, concatenation is free as long as all
     * of the sourceNodes are produced by filters in the same MPSNNGraph.
     * Most MPSCNNKernels have the ability to write their results at a
     * feature channel offset within a target MPSImage. However, if the
     * MPSNNImageNode source nodes come from images external to the MPSNNGraph,
     * then we have to do a copy operation to assemble the concatenated node.
     * As a result, when deciding where to break a large logical graph into
     * multiple smaller MPSNNGraphs, it is better for concatenations to
     * appear at the ends of subgraphs when possible rather than at the start,
     * to the extent that all the images used in the concatenation are
     * produced by that subgraph.
     * 
     * @param sourceNodes The MPSNNImageNode representing the source MPSImages for the filter
     * @return A new MPSNNFilter node that concatenates its inputs.
     */
    @Generated
    @Selector("initWithSources:")
    public native MPSNNConcatenationNode initWithSources(NSArray<? extends MPSNNImageNode> sourceNodes);

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
    public static native MPSNNConcatenationNode new_objc();

    /**
     * Init a autoreleased node that concatenates feature channels from multiple images
     * 
     * In some neural network designs, it is necessary to append feature channels
     * from one neural network filter to the results of another. If we have three
     * image nodes with M, N and O feature channels in them, passed to -initWithSources:
     * as @[imageM, imageN, imageO], then feature channels [0,M-1] will be drawn from
     * image M, feature channels [M, M+N-1] will be drawn from image N and feature channels
     * [M+N, M+N+O-1] will be drawn from image O.
     * 
     * As all images are padded out to a multiple of four feature channels,
     * M, N and O here are also multiples of four, even when the MPSImages
     * are not. That is, if the image is 23 feature channels and one channel
     * of padding, it takes up 24 feature channels worth of space in the
     * concatenated result.
     * 
     * Performance Note: Generally, concatenation is free as long as all
     * of the sourceNodes are produced by filters in the same MPSNNGraph.
     * Most MPSCNNKernels have the ability to write their results at a
     * feature channel offset within a target MPSImage. However, if the
     * MPSNNImageNode source nodes come from images external to the MPSNNGraph,
     * then we have to do a copy operation to assemble the concatenated node.
     * As a result, when deciding where to break a large logical graph into
     * multiple smaller MPSNNGraphs, it is better for concatenations to
     * appear at the ends of subgraphs when possible rather than at the start,
     * to the extent that all the images used in the concatenation are
     * produced by that subgraph.
     * 
     * @param sourceNodes The MPSNNImageNode representing the source MPSImages for the filter
     * @return A new MPSNNFilter node that concatenates its inputs.
     */
    @Generated
    @Selector("nodeWithSources:")
    public static native MPSNNConcatenationNode nodeWithSources(NSArray<? extends MPSNNImageNode> sourceNodes);

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
