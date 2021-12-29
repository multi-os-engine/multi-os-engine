package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metalperformanceshaders.protocol.MPSHandle;
import apple.metalperformanceshaders.protocol.MPSImageAllocator;
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
 * MPSNNImageNode
 * <p>
 * A placeholder node denoting the position of a MPSImage in a graph
 * <p>
 * MPS neural network graphs are made up of filter nodes connected by
 * image (or state) nodes. An image node is produced by one filter but
 * may be consumed by more than one filter.
 * <p>
 * Most image nodes will be created by MPS and made available through
 * MPSNNFilterNode.resultImage. Image nodes that are not created by MPS
 * (i.e. "the graph inputs") must be created by you.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNImageNode extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNImageNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNImageNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNImageNode allocWithZone(VoidPtr zone);

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
     * Tag a image node for view later
     * <p>
     * Most image nodes are private to the graph. These alias memory heavily and
     * consequently generally have invalid state when the graph exits.  When
     * exportFromGraph = YES, the image is preserved and made available through
     * the [MPSNNGraph encode... intermediateImages:... list.
     * <p>
     * CAUTION: exporting an image from a graph prevents MPS from
     * recycling memory. It will nearly always cause the
     * amount of memory used by the graph to increase by the size
     * of the image. There will probably be a performance
     * regression accordingly.  This feature should generally
     * be used only when the node is needed as an input for
     * further work and recomputing it is prohibitively costly.
     * <p>
     * Default: NO
     */
    @Generated
    @Selector("exportFromGraph")
    public native boolean exportFromGraph();

    /**
     * Create a autoreleased MPSNNImageNode with exportFromGraph = YES.
     * <p>
     * Note: image is still temporary. See MPSNNImageNode.imageAllocator parameter.
     */
    @Generated
    @Selector("exportedNodeWithHandle:")
    public static native MPSNNImageNode exportedNodeWithHandle(NSObject handle);

    /**
     * The preferred precision for the image
     * <p>
     * Default: MPSImageFeatureChannelFormatNone, meaning MPS should pick a format
     * Typically, this is 16-bit floating-point.
     */
    @Generated
    @Selector("format")
    @NUInt
    public native long format();

    /**
     * MPS resource identifier
     * <p>
     * See MPSHandle protocol description.  Default: nil
     */
    @Generated
    @Selector("handle")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSHandle handle();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Configurability for image allocation
     * <p>
     * Allows you to influence how the image is allocated
     * Default: MPSTemporaryImage.defaultAllocator
     */
    @Generated
    @Selector("imageAllocator")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSImageAllocator imageAllocator();

    @Generated
    @Selector("init")
    public native MPSNNImageNode init();

    @Generated
    @Selector("initWithHandle:")
    public native MPSNNImageNode initWithHandle(NSObject handle);

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
    public static native MPSNNImageNode new_objc();

    @Generated
    @Selector("nodeWithHandle:")
    public static native MPSNNImageNode nodeWithHandle(NSObject handle);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Tag a image node for view later
     * <p>
     * Most image nodes are private to the graph. These alias memory heavily and
     * consequently generally have invalid state when the graph exits.  When
     * exportFromGraph = YES, the image is preserved and made available through
     * the [MPSNNGraph encode... intermediateImages:... list.
     * <p>
     * CAUTION: exporting an image from a graph prevents MPS from
     * recycling memory. It will nearly always cause the
     * amount of memory used by the graph to increase by the size
     * of the image. There will probably be a performance
     * regression accordingly.  This feature should generally
     * be used only when the node is needed as an input for
     * further work and recomputing it is prohibitively costly.
     * <p>
     * Default: NO
     */
    @Generated
    @Selector("setExportFromGraph:")
    public native void setExportFromGraph(boolean value);

    /**
     * The preferred precision for the image
     * <p>
     * Default: MPSImageFeatureChannelFormatNone, meaning MPS should pick a format
     * Typically, this is 16-bit floating-point.
     */
    @Generated
    @Selector("setFormat:")
    public native void setFormat(@NUInt long value);

    /**
     * MPS resource identifier
     * <p>
     * See MPSHandle protocol description.  Default: nil
     */
    @Generated
    @Selector("setHandle:")
    public native void setHandle(@Mapped(ObjCObjectMapper.class) MPSHandle value);

    /**
     * Configurability for image allocation
     * <p>
     * Allows you to influence how the image is allocated
     * Default: MPSTemporaryImage.defaultAllocator
     */
    @Generated
    @Selector("setImageAllocator:")
    public native void setImageAllocator(@Mapped(ObjCObjectMapper.class) MPSImageAllocator value);

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
     * Stop training graph automatic creation at this node.
     * <p>
     * An inference graph of MPSNNFilterNodes, MPSNNStateNodes and MPSNNImageNodes can be automatically
     * converted to a training graph using -[MPSNNFilterNode trainingGraphWithSourceGradient:nodeHandler:].
     * Sometimes, an inference graph may contain extra nodes at start to do operations like resampling or range
     * adjustment that should not be part of the training graph. To prevent gradient operations for these extra
     * nodes from being included in the training graph, set <undesired node>.resultImage.stopGradient = YES.
     * This will prevent gradient propagation beyond this MPSNNImageNode.
     * Default: NO
     */
    @Generated
    @Selector("setStopGradient:")
    public native void setStopGradient(boolean value);

    /**
     * Set to true to cause the resource to be synchronized with the CPU
     * <p>
     * It is not needed on iOS/tvOS devices, where it does nothing.
     */
    @Generated
    @Selector("setSynchronizeResource:")
    public native void setSynchronizeResource(boolean value);

    /**
     * Stop training graph automatic creation at this node.
     * <p>
     * An inference graph of MPSNNFilterNodes, MPSNNStateNodes and MPSNNImageNodes can be automatically
     * converted to a training graph using -[MPSNNFilterNode trainingGraphWithSourceGradient:nodeHandler:].
     * Sometimes, an inference graph may contain extra nodes at start to do operations like resampling or range
     * adjustment that should not be part of the training graph. To prevent gradient operations for these extra
     * nodes from being included in the training graph, set <undesired node>.resultImage.stopGradient = YES.
     * This will prevent gradient propagation beyond this MPSNNImageNode.
     * Default: NO
     */
    @Generated
    @Selector("stopGradient")
    public native boolean stopGradient();

    /**
     * Set to true to cause the resource to be synchronized with the CPU
     * <p>
     * It is not needed on iOS/tvOS devices, where it does nothing.
     */
    @Generated
    @Selector("synchronizeResource")
    public native boolean synchronizeResource();
}
