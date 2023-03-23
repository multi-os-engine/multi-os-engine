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

/**
 * API-Since: 15.4
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphSingleGateRNNDescriptor extends NSObject implements NSCopying {
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
     * [@property] activation
     * 
     * Activation function to use with the RNN op.
     * Default value: @code MPSGraphRNNActivationRelu @endcode
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
    public static native boolean automaticallyNotifiesObserversForKey(String key);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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
     * Activation function to use with the RNN op.
     * Default value: @code MPSGraphRNNActivationRelu @endcode
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
     * If set then the layer will produce training state tensor as a secondary output.
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
     * If set then the layer will produce training state tensor as a secondary output.
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