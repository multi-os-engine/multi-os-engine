package apple.chip;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Cluster Level Control
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPLevelControl extends CHIPCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPLevelControl(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPLevelControl alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native CHIPLevelControl allocWithZone(VoidPtr zone);

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
    @Selector("configureAttributeCurrentLevelWithMinInterval:maxInterval:change:responseHandler:")
    public native void configureAttributeCurrentLevelWithMinIntervalMaxIntervalChangeResponseHandler(char minInterval,
            char maxInterval, byte change,
            @ObjCBlock(name = "call_configureAttributeCurrentLevelWithMinIntervalMaxIntervalChangeResponseHandler") Block_configureAttributeCurrentLevelWithMinIntervalMaxIntervalChangeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeCurrentLevelWithMinIntervalMaxIntervalChangeResponseHandler {
        @Generated
        void call_configureAttributeCurrentLevelWithMinIntervalMaxIntervalChangeResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

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
    public native CHIPLevelControl init();

    @Generated
    @Selector("initWithDevice:endpoint:queue:")
    public native CHIPLevelControl initWithDeviceEndpointQueue(CHIPDevice device, byte endpoint, NSObject queue);

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
    @Selector("move:rate:optionMask:optionOverride:responseHandler:")
    public native void moveRateOptionMaskOptionOverrideResponseHandler(byte moveMode, byte rate, byte optionMask,
            byte optionOverride,
            @ObjCBlock(name = "call_moveRateOptionMaskOptionOverrideResponseHandler") Block_moveRateOptionMaskOptionOverrideResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveRateOptionMaskOptionOverrideResponseHandler {
        @Generated
        void call_moveRateOptionMaskOptionOverrideResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("moveToLevel:transitionTime:optionMask:optionOverride:responseHandler:")
    public native void moveToLevelTransitionTimeOptionMaskOptionOverrideResponseHandler(byte level, char transitionTime,
            byte optionMask, byte optionOverride,
            @ObjCBlock(name = "call_moveToLevelTransitionTimeOptionMaskOptionOverrideResponseHandler") Block_moveToLevelTransitionTimeOptionMaskOptionOverrideResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToLevelTransitionTimeOptionMaskOptionOverrideResponseHandler {
        @Generated
        void call_moveToLevelTransitionTimeOptionMaskOptionOverrideResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("moveToLevelWithOnOff:transitionTime:responseHandler:")
    public native void moveToLevelWithOnOffTransitionTimeResponseHandler(byte level, char transitionTime,
            @ObjCBlock(name = "call_moveToLevelWithOnOffTransitionTimeResponseHandler") Block_moveToLevelWithOnOffTransitionTimeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToLevelWithOnOffTransitionTimeResponseHandler {
        @Generated
        void call_moveToLevelWithOnOffTransitionTimeResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("moveWithOnOff:rate:responseHandler:")
    public native void moveWithOnOffRateResponseHandler(byte moveMode, byte rate,
            @ObjCBlock(name = "call_moveWithOnOffRateResponseHandler") Block_moveWithOnOffRateResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveWithOnOffRateResponseHandler {
        @Generated
        void call_moveWithOnOffRateResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native CHIPLevelControl new_objc();

    @Generated
    @Selector("readAttributeClusterRevisionWithResponseHandler:")
    public native void readAttributeClusterRevisionWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeClusterRevisionWithResponseHandler") Block_readAttributeClusterRevisionWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeClusterRevisionWithResponseHandler {
        @Generated
        void call_readAttributeClusterRevisionWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeCurrentLevelWithResponseHandler:")
    public native void readAttributeCurrentLevelWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeCurrentLevelWithResponseHandler") Block_readAttributeCurrentLevelWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentLevelWithResponseHandler {
        @Generated
        void call_readAttributeCurrentLevelWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeCurrentLevelWithResponseHandler:")
    public native void reportAttributeCurrentLevelWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeCurrentLevelWithResponseHandler") Block_reportAttributeCurrentLevelWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeCurrentLevelWithResponseHandler {
        @Generated
        void call_reportAttributeCurrentLevelWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

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
    @Selector("step:stepSize:transitionTime:optionMask:optionOverride:responseHandler:")
    public native void stepStepSizeTransitionTimeOptionMaskOptionOverrideResponseHandler(byte stepMode, byte stepSize,
            char transitionTime, byte optionMask, byte optionOverride,
            @ObjCBlock(name = "call_stepStepSizeTransitionTimeOptionMaskOptionOverrideResponseHandler") Block_stepStepSizeTransitionTimeOptionMaskOptionOverrideResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepStepSizeTransitionTimeOptionMaskOptionOverrideResponseHandler {
        @Generated
        void call_stepStepSizeTransitionTimeOptionMaskOptionOverrideResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("stepWithOnOff:stepSize:transitionTime:responseHandler:")
    public native void stepWithOnOffStepSizeTransitionTimeResponseHandler(byte stepMode, byte stepSize,
            char transitionTime,
            @ObjCBlock(name = "call_stepWithOnOffStepSizeTransitionTimeResponseHandler") Block_stepWithOnOffStepSizeTransitionTimeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepWithOnOffStepSizeTransitionTimeResponseHandler {
        @Generated
        void call_stepWithOnOffStepSizeTransitionTimeResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("stop:optionOverride:responseHandler:")
    public native void stopOptionOverrideResponseHandler(byte optionMask, byte optionOverride,
            @ObjCBlock(name = "call_stopOptionOverrideResponseHandler") Block_stopOptionOverrideResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopOptionOverrideResponseHandler {
        @Generated
        void call_stopOptionOverrideResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("stopWithOnOff:")
    public native void stopWithOnOff(@ObjCBlock(name = "call_stopWithOnOff") Block_stopWithOnOff responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopWithOnOff {
        @Generated
        void call_stopWithOnOff(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
