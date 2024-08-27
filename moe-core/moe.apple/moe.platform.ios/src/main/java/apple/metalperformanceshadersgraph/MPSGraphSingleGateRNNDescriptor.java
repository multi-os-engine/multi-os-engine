package apple.metalperformanceshadersgraph;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This class defines parameters for a single gate (vanilla) RNN operation.
 * 
 * Use this descriptor with the following ``MPSGraph`` methods:
 * - ``MPSGraph/singleGateRNNWithSourceTensor:recurrentWeight:initState:descriptor:name:``,
 * - ``MPSGraph/singleGateRNNWithSourceTensor:recurrentWeight:inputWeight:bias:initState:descriptor:name:``,
 * - ``MPSGraph/singleGateRNNWithSourceTensor:recurrentWeight:inputWeight:bias:initState:mask:descriptor:name:``,
 * -
 * ``MPSGraph/singleGateRNNGradientsWithSourceTensor:recurrentWeight:sourceGradient:zState:initState:descriptor:name:``,
 * -
 * ``MPSGraph/singleGateRNNGradientsWithSourceTensor:recurrentWeight:sourceGradient:zState:inputWeight:bias:initState:descriptor:name:``,
 * -
 * ``MPSGraph/singleGateRNNGradientsWithSourceTensor:recurrentWeight:sourceGradient:zState:inputWeight:bias:initState:mask:descriptor:name:``,
 * and
 * -
 * ``MPSGraph/singleGateRNNGradientsWithSourceTensor:recurrentWeight:sourceGradient:zState:stateGradient:inputWeight:bias:initState:mask:descriptor:name:``.
 * 
 * API-Since: 15.4
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphSingleGateRNNDescriptor extends MPSGraphObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSGraphSingleGateRNNDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * A parameter which defines the activation function to use with the RNN operation.
     * Default value: `MPSGraphRNNActivationRelu`.
     */
    @Generated
    @Selector("activation")
    @NUInt
    public native long activation();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSGraphSingleGateRNNDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MPSGraphSingleGateRNNDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * A parameter that defines a bidirectional RNN layer.
     * 
     * If set to `YES` then the input sequence is traversed in both directions and the two results
     * are concatenated together on the channel-axis.
     * Default value: `NO`.
     */
    @Generated
    @Selector("bidirectional")
    public native boolean bidirectional();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Creates a single gate RNN descriptor with default values.
     */
    @Generated
    @Selector("descriptor")
    public static native MPSGraphSingleGateRNNDescriptor descriptor();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSGraphSingleGateRNNDescriptor init();

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSGraphSingleGateRNNDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A parameter that defines time direction of the input sequence.
     * 
     * If set to `YES` then the input sequence is passed in reverse time order to the layer.
     * Note: Ignored when `bidirectional = YES`.
     * Default value: `NO`.
     */
    @Generated
    @Selector("reverse")
    public native boolean reverse();

    /**
     * A parameter which defines the activation function to use with the RNN operation.
     * Default value: `MPSGraphRNNActivationRelu`.
     */
    @Generated
    @Selector("setActivation:")
    public native void setActivation(@NUInt long value);

    /**
     * A parameter that defines a bidirectional RNN layer.
     * 
     * If set to `YES` then the input sequence is traversed in both directions and the two results
     * are concatenated together on the channel-axis.
     * Default value: `NO`.
     */
    @Generated
    @Selector("setBidirectional:")
    public native void setBidirectional(boolean value);

    /**
     * A parameter that defines time direction of the input sequence.
     * 
     * If set to `YES` then the input sequence is passed in reverse time order to the layer.
     * Note: Ignored when `bidirectional = YES`.
     * Default value: `NO`.
     */
    @Generated
    @Selector("setReverse:")
    public native void setReverse(boolean value);

    /**
     * A parameter that makes the RNN layer support training.
     * 
     * If set to `YES` then the layer will produce training state tensor as a secondary output.
     * Default value: `NO`.
     */
    @Generated
    @Selector("setTraining:")
    public native void setTraining(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * A parameter that makes the RNN layer support training.
     * 
     * If set to `YES` then the layer will produce training state tensor as a secondary output.
     * Default value: `NO`.
     */
    @Generated
    @Selector("training")
    public native boolean training();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}