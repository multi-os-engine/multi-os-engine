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
 * API-Since: 15.4
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphLSTMDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSGraphLSTMDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * [@property] activation
     * 
     * Activation function to use with the current cell value of the LSTM op.
     * Default value: @code MPSGraphRNNActivationTanh @endcode
     */
    @Generated
    @Selector("activation")
    @NUInt
    public native long activation();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSGraphLSTMDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MPSGraphLSTMDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] bidirectional
     * 
     * If set then the input sequence is traversed in both directions and the two results
     * are concatenated together on the channel-axis.
     * Default value: @code NO @endcode
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

    /**
     * [@property] cellGateActivation
     * 
     * Activation function to use with the cell gate of the LSTM op.
     * Default value: @code MPSGraphRNNActivationTanh @endcode
     */
    @Generated
    @Selector("cellGateActivation")
    @NUInt
    public native long cellGateActivation();

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

    @Generated
    @Selector("descriptor")
    public static native MPSGraphLSTMDescriptor descriptor();

    /**
     * [@property] forgetGateActivation
     * 
     * Activation function to use with the forget gate of the LSTM op.
     * Default value: @code MPSGraphRNNActivationSigmoid @endcode
     */
    @Generated
    @Selector("forgetGateActivation")
    @NUInt
    public native long forgetGateActivation();

    /**
     * [@property] forgetGateLast
     * 
     * If set then the layer will use the gate-ordering `[ i, z, f, o ]` instead of default `[ i, f, z, o ]`.
     * Default value: @code NO @endcode
     */
    @Generated
    @Selector("forgetGateLast")
    public native boolean forgetGateLast();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSGraphLSTMDescriptor init();

    /**
     * [@property] inputGateActivation
     * 
     * Activation function to use with the input gate of the LSTM op.
     * Default value: @code MPSGraphRNNActivationSigmoid @endcode
     */
    @Generated
    @Selector("inputGateActivation")
    @NUInt
    public native long inputGateActivation();

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
    public static native MPSGraphLSTMDescriptor new_objc();

    /**
     * [@property] outputGateActivation
     * 
     * Activation function to use with the output gate of the LSTM op.
     * Default value: @code MPSGraphRNNActivationSigmoid @endcode
     */
    @Generated
    @Selector("outputGateActivation")
    @NUInt
    public native long outputGateActivation();

    /**
     * [@property] produceCell
     * 
     * If set then this layer will produce the internal cell of the LSTM unit as secondary output.
     * Default value: @code NO @endcode
     */
    @Generated
    @Selector("produceCell")
    public native boolean produceCell();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] reverse
     * 
     * If set then the input sequence is passed in reverse time order to the layer.
     * Note: Ignored when @code bidirectional = YES @endcode.
     * Default value: @code NO @endcode
     */
    @Generated
    @Selector("reverse")
    public native boolean reverse();

    /**
     * [@property] activation
     * 
     * Activation function to use with the current cell value of the LSTM op.
     * Default value: @code MPSGraphRNNActivationTanh @endcode
     */
    @Generated
    @Selector("setActivation:")
    public native void setActivation(@NUInt long value);

    /**
     * [@property] bidirectional
     * 
     * If set then the input sequence is traversed in both directions and the two results
     * are concatenated together on the channel-axis.
     * Default value: @code NO @endcode
     */
    @Generated
    @Selector("setBidirectional:")
    public native void setBidirectional(boolean value);

    /**
     * [@property] cellGateActivation
     * 
     * Activation function to use with the cell gate of the LSTM op.
     * Default value: @code MPSGraphRNNActivationTanh @endcode
     */
    @Generated
    @Selector("setCellGateActivation:")
    public native void setCellGateActivation(@NUInt long value);

    /**
     * [@property] forgetGateActivation
     * 
     * Activation function to use with the forget gate of the LSTM op.
     * Default value: @code MPSGraphRNNActivationSigmoid @endcode
     */
    @Generated
    @Selector("setForgetGateActivation:")
    public native void setForgetGateActivation(@NUInt long value);

    /**
     * [@property] forgetGateLast
     * 
     * If set then the layer will use the gate-ordering `[ i, z, f, o ]` instead of default `[ i, f, z, o ]`.
     * Default value: @code NO @endcode
     */
    @Generated
    @Selector("setForgetGateLast:")
    public native void setForgetGateLast(boolean value);

    /**
     * [@property] inputGateActivation
     * 
     * Activation function to use with the input gate of the LSTM op.
     * Default value: @code MPSGraphRNNActivationSigmoid @endcode
     */
    @Generated
    @Selector("setInputGateActivation:")
    public native void setInputGateActivation(@NUInt long value);

    /**
     * [@property] outputGateActivation
     * 
     * Activation function to use with the output gate of the LSTM op.
     * Default value: @code MPSGraphRNNActivationSigmoid @endcode
     */
    @Generated
    @Selector("setOutputGateActivation:")
    public native void setOutputGateActivation(@NUInt long value);

    /**
     * [@property] produceCell
     * 
     * If set then this layer will produce the internal cell of the LSTM unit as secondary output.
     * Default value: @code NO @endcode
     */
    @Generated
    @Selector("setProduceCell:")
    public native void setProduceCell(boolean value);

    /**
     * [@property] reverse
     * 
     * If set then the input sequence is passed in reverse time order to the layer.
     * Note: Ignored when @code bidirectional = YES @endcode.
     * Default value: @code NO @endcode
     */
    @Generated
    @Selector("setReverse:")
    public native void setReverse(boolean value);

    /**
     * [@property] training
     * 
     * If set then the layer will produce training state tensor as a secondary or third output.
     * Default value: @code NO @endcode
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
     * [@property] training
     * 
     * If set then the layer will produce training state tensor as a secondary or third output.
     * Default value: @code NO @endcode
     */
    @Generated
    @Selector("training")
    public native boolean training();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}