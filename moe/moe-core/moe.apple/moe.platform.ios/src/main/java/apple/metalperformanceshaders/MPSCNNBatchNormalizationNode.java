package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metalperformanceshaders.protocol.MPSCNNBatchNormalizationDataSource;
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
 * MPSCNNBatchNormalizationNode
 * <p>
 * A node representing batch normalization for inference or training
 * <p>
 * Batch normalization operates differently for inference and training.
 * For inference, the normalization is done according to a static statistical
 * representation of data saved during training. For training, this representation
 * is ever evolving. In the low level MPS batch normalization interface,
 * during training, the batch normalization is broken up into two steps:
 * calculation of the statistical representation of input data, followed
 * by normalization once the statistics are known for the entire batch.
 * These are MPSCNNBatchNormalizationStatistics and MPSCNNBatchNormalization,
 * respectively.
 * <p>
 * When this node appears in a graph and is not required to produce a
 * MPSCNNBatchNormalizationState -- that is, MPSCNNBatchNormalizationNode.resultState
 * is not used within the graph -- then it operates in inference mode
 * and new batch-only statistics are not calculated. When this state node
 * is consumed, then the node is assumed to be in training mode and
 * new statistics will be calculated and written to the MPSCNNBatchNormalizationState
 * and passed along to the MPSCNNBatchNormalizationGradient and
 * MPSCNNBatchNormalizationStatisticsGradient as necessary. This should
 * allow you to construct an identical sequence of nodes for inference
 * and training and expect the right thing to happen.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNBatchNormalizationNode extends MPSNNFilterNode implements MPSNNTrainableNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNBatchNormalizationNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNBatchNormalizationNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNBatchNormalizationNode allocWithZone(VoidPtr zone);

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
     * Options controlling how batch normalization is calculated
     * <p>
     * Default: MPSCNNBatchNormalizationFlagsDefault
     */
    @Generated
    @Selector("flags")
    @NUInt
    public native long flags();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNBatchNormalizationNode init();

    @Generated
    @Selector("initWithSource:dataSource:")
    public native MPSCNNBatchNormalizationNode initWithSourceDataSource(MPSNNImageNode source,
            @Mapped(ObjCObjectMapper.class) MPSCNNBatchNormalizationDataSource dataSource);

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
    public static native MPSCNNBatchNormalizationNode new_objc();

    @Generated
    @Selector("nodeWithSource:dataSource:")
    public static native MPSCNNBatchNormalizationNode nodeWithSourceDataSource(MPSNNImageNode source,
            @Mapped(ObjCObjectMapper.class) MPSCNNBatchNormalizationDataSource dataSource);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Options controlling how batch normalization is calculated
     * <p>
     * Default: MPSCNNBatchNormalizationFlagsDefault
     */
    @Generated
    @Selector("setFlags:")
    public native void setFlags(@NUInt long value);

    @Generated
    @Selector("setTrainingStyle:")
    public native void setTrainingStyle(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("trainingStyle")
    @NUInt
    public native long trainingStyle();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
