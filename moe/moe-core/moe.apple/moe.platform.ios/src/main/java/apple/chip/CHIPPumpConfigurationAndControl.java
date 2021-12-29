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
 * Cluster Pump Configuration and Control
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPPumpConfigurationAndControl extends CHIPCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPPumpConfigurationAndControl(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPPumpConfigurationAndControl alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CHIPPumpConfigurationAndControl allocWithZone(VoidPtr zone);

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
    @Selector("configureAttributeCapacityWithMinInterval:maxInterval:change:responseHandler:")
    public native void configureAttributeCapacityWithMinIntervalMaxIntervalChangeResponseHandler(char minInterval,
            char maxInterval, short change,
            @ObjCBlock(name = "call_configureAttributeCapacityWithMinIntervalMaxIntervalChangeResponseHandler") Block_configureAttributeCapacityWithMinIntervalMaxIntervalChangeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeCapacityWithMinIntervalMaxIntervalChangeResponseHandler {
        @Generated
        void call_configureAttributeCapacityWithMinIntervalMaxIntervalChangeResponseHandler(NSError error,
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
    public native CHIPPumpConfigurationAndControl init();

    @Generated
    @Selector("initWithDevice:endpoint:queue:")
    public native CHIPPumpConfigurationAndControl initWithDeviceEndpointQueue(CHIPDevice device, char endpoint,
            NSObject queue);

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
    public static native CHIPPumpConfigurationAndControl new_objc();

    @Generated
    @Selector("readAttributeCapacityWithResponseHandler:")
    public native void readAttributeCapacityWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeCapacityWithResponseHandler") Block_readAttributeCapacityWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCapacityWithResponseHandler {
        @Generated
        void call_readAttributeCapacityWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

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
    @Selector("readAttributeEffectiveControlModeWithResponseHandler:")
    public native void readAttributeEffectiveControlModeWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeEffectiveControlModeWithResponseHandler") Block_readAttributeEffectiveControlModeWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEffectiveControlModeWithResponseHandler {
        @Generated
        void call_readAttributeEffectiveControlModeWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeEffectiveOperationModeWithResponseHandler:")
    public native void readAttributeEffectiveOperationModeWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeEffectiveOperationModeWithResponseHandler") Block_readAttributeEffectiveOperationModeWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEffectiveOperationModeWithResponseHandler {
        @Generated
        void call_readAttributeEffectiveOperationModeWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeMaxFlowWithResponseHandler:")
    public native void readAttributeMaxFlowWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeMaxFlowWithResponseHandler") Block_readAttributeMaxFlowWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxFlowWithResponseHandler {
        @Generated
        void call_readAttributeMaxFlowWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeMaxPressureWithResponseHandler:")
    public native void readAttributeMaxPressureWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeMaxPressureWithResponseHandler") Block_readAttributeMaxPressureWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxPressureWithResponseHandler {
        @Generated
        void call_readAttributeMaxPressureWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeMaxSpeedWithResponseHandler:")
    public native void readAttributeMaxSpeedWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeMaxSpeedWithResponseHandler") Block_readAttributeMaxSpeedWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxSpeedWithResponseHandler {
        @Generated
        void call_readAttributeMaxSpeedWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeOperationModeWithResponseHandler:")
    public native void readAttributeOperationModeWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeOperationModeWithResponseHandler") Block_readAttributeOperationModeWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOperationModeWithResponseHandler {
        @Generated
        void call_readAttributeOperationModeWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeCapacityWithResponseHandler:")
    public native void reportAttributeCapacityWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeCapacityWithResponseHandler") Block_reportAttributeCapacityWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeCapacityWithResponseHandler {
        @Generated
        void call_reportAttributeCapacityWithResponseHandler(NSError error, NSDictionary<?, ?> values);
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
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("writeAttributeOperationModeWithValue:responseHandler:")
    public native void writeAttributeOperationModeWithValueResponseHandler(byte value,
            @ObjCBlock(name = "call_writeAttributeOperationModeWithValueResponseHandler") Block_writeAttributeOperationModeWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOperationModeWithValueResponseHandler {
        @Generated
        void call_writeAttributeOperationModeWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }
}
