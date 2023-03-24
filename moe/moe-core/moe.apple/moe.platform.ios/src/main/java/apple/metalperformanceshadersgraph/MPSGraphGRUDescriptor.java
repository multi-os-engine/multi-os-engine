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
 * API-Since: 16.0
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphGRUDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSGraphGRUDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSGraphGRUDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MPSGraphGRUDescriptor allocWithZone(VoidPtr zone);

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
    public static native MPSGraphGRUDescriptor descriptor();

    /**
     * [@property] flipZ
     * 
     * If set then the layer will compute the final value as `h[t] = z[t] h[t-1] + (1-z[t]) o[t]`.
     * Otherwise it's computed as `h[t] = (1-z[t]) h[t-1] + z[t] o[t]`.
     * Default value: @code NO @endcode
     */
    @Generated
    @Selector("flipZ")
    public native boolean flipZ();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSGraphGRUDescriptor init();

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
    public static native MPSGraphGRUDescriptor new_objc();

    /**
     * [@property] outputGateActivation
     * 
     * Activation function to use with the o-gate of the LSTM op.
     * Default value: @code MPSGraphRNNActivationTanh @endcode
     */
    @Generated
    @Selector("outputGateActivation")
    @NUInt
    public native long outputGateActivation();

    /**
     * [@property] resetAfter
     * 
     * If set then the layer will compute the intermediate value as `c[t] = ( b + (h[t-1] m ) R^T) r[t]`.
     * Otherwise it's computed as `c[t] = (h[t-1] r[t] m) R^T`.
     * Default value: @code NO @endcode
     */
    @Generated
    @Selector("resetAfter")
    public native boolean resetAfter();

    /**
     * [@property] resetGateActivation
     * 
     * Activation function to use with the r-gate of the GRU op.
     * Default value: @code MPSGraphRNNActivationSigmoid @endcode
     */
    @Generated
    @Selector("resetGateActivation")
    @NUInt
    public native long resetGateActivation();

    /**
     * [@property] resetGateFirst
     * 
     * If set then the layer will use the gate-ordering `[ r, z, o ]` instead of default `[ z, r, o ]`.
     * Default value: @code NO @endcode
     */
    @Generated
    @Selector("resetGateFirst")
    public native boolean resetGateFirst();

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
     * [@property] flipZ
     * 
     * If set then the layer will compute the final value as `h[t] = z[t] h[t-1] + (1-z[t]) o[t]`.
     * Otherwise it's computed as `h[t] = (1-z[t]) h[t-1] + z[t] o[t]`.
     * Default value: @code NO @endcode
     */
    @Generated
    @Selector("setFlipZ:")
    public native void setFlipZ(boolean value);

    /**
     * [@property] outputGateActivation
     * 
     * Activation function to use with the o-gate of the LSTM op.
     * Default value: @code MPSGraphRNNActivationTanh @endcode
     */
    @Generated
    @Selector("setOutputGateActivation:")
    public native void setOutputGateActivation(@NUInt long value);

    /**
     * [@property] resetAfter
     * 
     * If set then the layer will compute the intermediate value as `c[t] = ( b + (h[t-1] m ) R^T) r[t]`.
     * Otherwise it's computed as `c[t] = (h[t-1] r[t] m) R^T`.
     * Default value: @code NO @endcode
     */
    @Generated
    @Selector("setResetAfter:")
    public native void setResetAfter(boolean value);

    /**
     * [@property] resetGateActivation
     * 
     * Activation function to use with the r-gate of the GRU op.
     * Default value: @code MPSGraphRNNActivationSigmoid @endcode
     */
    @Generated
    @Selector("setResetGateActivation:")
    public native void setResetGateActivation(@NUInt long value);

    /**
     * [@property] resetGateFirst
     * 
     * If set then the layer will use the gate-ordering `[ r, z, o ]` instead of default `[ z, r, o ]`.
     * Default value: @code NO @endcode
     */
    @Generated
    @Selector("setResetGateFirst:")
    public native void setResetGateFirst(boolean value);

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

    /**
     * [@property] updateGateActivation
     * 
     * Activation function to use with the z-gate of the GRU op.
     * Default value: @code MPSGraphRNNActivationSigmoid @endcode
     */
    @Generated
    @Selector("setUpdateGateActivation:")
    public native void setUpdateGateActivation(@NUInt long value);

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

    /**
     * [@property] updateGateActivation
     * 
     * Activation function to use with the z-gate of the GRU op.
     * Default value: @code MPSGraphRNNActivationSigmoid @endcode
     */
    @Generated
    @Selector("updateGateActivation")
    @NUInt
    public native long updateGateActivation();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}