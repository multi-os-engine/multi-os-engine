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
 * Cluster Window Covering
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPWindowCovering extends CHIPCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPWindowCovering(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPWindowCovering alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CHIPWindowCovering allocWithZone(VoidPtr zone);

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
    public native CHIPWindowCovering init();

    @Generated
    @Selector("initWithDevice:endpoint:queue:")
    public native CHIPWindowCovering initWithDeviceEndpointQueue(CHIPDevice device, char endpoint, NSObject queue);

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
    public static native CHIPWindowCovering new_objc();

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
    @Selector("readAttributeConfigStatusWithResponseHandler:")
    public native void readAttributeConfigStatusWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeConfigStatusWithResponseHandler") Block_readAttributeConfigStatusWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeConfigStatusWithResponseHandler {
        @Generated
        void call_readAttributeConfigStatusWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeCurrentPositionLiftWithResponseHandler:")
    public native void readAttributeCurrentPositionLiftWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeCurrentPositionLiftWithResponseHandler") Block_readAttributeCurrentPositionLiftWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionLiftWithResponseHandler {
        @Generated
        void call_readAttributeCurrentPositionLiftWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeCurrentPositionTiltWithResponseHandler:")
    public native void readAttributeCurrentPositionTiltWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeCurrentPositionTiltWithResponseHandler") Block_readAttributeCurrentPositionTiltWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionTiltWithResponseHandler {
        @Generated
        void call_readAttributeCurrentPositionTiltWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeInstalledClosedLimitLiftWithResponseHandler:")
    public native void readAttributeInstalledClosedLimitLiftWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeInstalledClosedLimitLiftWithResponseHandler") Block_readAttributeInstalledClosedLimitLiftWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledClosedLimitLiftWithResponseHandler {
        @Generated
        void call_readAttributeInstalledClosedLimitLiftWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeInstalledClosedLimitTiltWithResponseHandler:")
    public native void readAttributeInstalledClosedLimitTiltWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeInstalledClosedLimitTiltWithResponseHandler") Block_readAttributeInstalledClosedLimitTiltWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledClosedLimitTiltWithResponseHandler {
        @Generated
        void call_readAttributeInstalledClosedLimitTiltWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeInstalledOpenLimitLiftWithResponseHandler:")
    public native void readAttributeInstalledOpenLimitLiftWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeInstalledOpenLimitLiftWithResponseHandler") Block_readAttributeInstalledOpenLimitLiftWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledOpenLimitLiftWithResponseHandler {
        @Generated
        void call_readAttributeInstalledOpenLimitLiftWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeInstalledOpenLimitTiltWithResponseHandler:")
    public native void readAttributeInstalledOpenLimitTiltWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeInstalledOpenLimitTiltWithResponseHandler") Block_readAttributeInstalledOpenLimitTiltWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledOpenLimitTiltWithResponseHandler {
        @Generated
        void call_readAttributeInstalledOpenLimitTiltWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeModeWithResponseHandler:")
    public native void readAttributeModeWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeModeWithResponseHandler") Block_readAttributeModeWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeModeWithResponseHandler {
        @Generated
        void call_readAttributeModeWithResponseHandler(NSError error, NSDictionary<?, ?> values);
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
    @Selector("writeAttributeModeWithValue:responseHandler:")
    public native void writeAttributeModeWithValueResponseHandler(byte value,
            @ObjCBlock(name = "call_writeAttributeModeWithValueResponseHandler") Block_writeAttributeModeWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeModeWithValueResponseHandler {
        @Generated
        void call_writeAttributeModeWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("configureAttributeCurrentPositionLiftPercent100thsWithMinInterval:maxInterval:change:responseHandler:")
    public native void configureAttributeCurrentPositionLiftPercent100thsWithMinIntervalMaxIntervalChangeResponseHandler(
            char minInterval, char maxInterval, char change,
            @ObjCBlock(name = "call_configureAttributeCurrentPositionLiftPercent100thsWithMinIntervalMaxIntervalChangeResponseHandler") Block_configureAttributeCurrentPositionLiftPercent100thsWithMinIntervalMaxIntervalChangeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeCurrentPositionLiftPercent100thsWithMinIntervalMaxIntervalChangeResponseHandler {
        @Generated
        void call_configureAttributeCurrentPositionLiftPercent100thsWithMinIntervalMaxIntervalChangeResponseHandler(
                NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("configureAttributeCurrentPositionLiftPercentageWithMinInterval:maxInterval:change:responseHandler:")
    public native void configureAttributeCurrentPositionLiftPercentageWithMinIntervalMaxIntervalChangeResponseHandler(
            char minInterval, char maxInterval, byte change,
            @ObjCBlock(name = "call_configureAttributeCurrentPositionLiftPercentageWithMinIntervalMaxIntervalChangeResponseHandler") Block_configureAttributeCurrentPositionLiftPercentageWithMinIntervalMaxIntervalChangeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeCurrentPositionLiftPercentageWithMinIntervalMaxIntervalChangeResponseHandler {
        @Generated
        void call_configureAttributeCurrentPositionLiftPercentageWithMinIntervalMaxIntervalChangeResponseHandler(
                NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("configureAttributeCurrentPositionTiltPercent100thsWithMinInterval:maxInterval:change:responseHandler:")
    public native void configureAttributeCurrentPositionTiltPercent100thsWithMinIntervalMaxIntervalChangeResponseHandler(
            char minInterval, char maxInterval, char change,
            @ObjCBlock(name = "call_configureAttributeCurrentPositionTiltPercent100thsWithMinIntervalMaxIntervalChangeResponseHandler") Block_configureAttributeCurrentPositionTiltPercent100thsWithMinIntervalMaxIntervalChangeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeCurrentPositionTiltPercent100thsWithMinIntervalMaxIntervalChangeResponseHandler {
        @Generated
        void call_configureAttributeCurrentPositionTiltPercent100thsWithMinIntervalMaxIntervalChangeResponseHandler(
                NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("configureAttributeCurrentPositionTiltPercentageWithMinInterval:maxInterval:change:responseHandler:")
    public native void configureAttributeCurrentPositionTiltPercentageWithMinIntervalMaxIntervalChangeResponseHandler(
            char minInterval, char maxInterval, byte change,
            @ObjCBlock(name = "call_configureAttributeCurrentPositionTiltPercentageWithMinIntervalMaxIntervalChangeResponseHandler") Block_configureAttributeCurrentPositionTiltPercentageWithMinIntervalMaxIntervalChangeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeCurrentPositionTiltPercentageWithMinIntervalMaxIntervalChangeResponseHandler {
        @Generated
        void call_configureAttributeCurrentPositionTiltPercentageWithMinIntervalMaxIntervalChangeResponseHandler(
                NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("configureAttributeOperationalStatusWithMinInterval:maxInterval:responseHandler:")
    public native void configureAttributeOperationalStatusWithMinIntervalMaxIntervalResponseHandler(char minInterval,
            char maxInterval,
            @ObjCBlock(name = "call_configureAttributeOperationalStatusWithMinIntervalMaxIntervalResponseHandler") Block_configureAttributeOperationalStatusWithMinIntervalMaxIntervalResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeOperationalStatusWithMinIntervalMaxIntervalResponseHandler {
        @Generated
        void call_configureAttributeOperationalStatusWithMinIntervalMaxIntervalResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("configureAttributeSafetyStatusWithMinInterval:maxInterval:responseHandler:")
    public native void configureAttributeSafetyStatusWithMinIntervalMaxIntervalResponseHandler(char minInterval,
            char maxInterval,
            @ObjCBlock(name = "call_configureAttributeSafetyStatusWithMinIntervalMaxIntervalResponseHandler") Block_configureAttributeSafetyStatusWithMinIntervalMaxIntervalResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeSafetyStatusWithMinIntervalMaxIntervalResponseHandler {
        @Generated
        void call_configureAttributeSafetyStatusWithMinIntervalMaxIntervalResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("configureAttributeTargetPositionLiftPercent100thsWithMinInterval:maxInterval:change:responseHandler:")
    public native void configureAttributeTargetPositionLiftPercent100thsWithMinIntervalMaxIntervalChangeResponseHandler(
            char minInterval, char maxInterval, char change,
            @ObjCBlock(name = "call_configureAttributeTargetPositionLiftPercent100thsWithMinIntervalMaxIntervalChangeResponseHandler") Block_configureAttributeTargetPositionLiftPercent100thsWithMinIntervalMaxIntervalChangeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeTargetPositionLiftPercent100thsWithMinIntervalMaxIntervalChangeResponseHandler {
        @Generated
        void call_configureAttributeTargetPositionLiftPercent100thsWithMinIntervalMaxIntervalChangeResponseHandler(
                NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("configureAttributeTargetPositionTiltPercent100thsWithMinInterval:maxInterval:change:responseHandler:")
    public native void configureAttributeTargetPositionTiltPercent100thsWithMinIntervalMaxIntervalChangeResponseHandler(
            char minInterval, char maxInterval, char change,
            @ObjCBlock(name = "call_configureAttributeTargetPositionTiltPercent100thsWithMinIntervalMaxIntervalChangeResponseHandler") Block_configureAttributeTargetPositionTiltPercent100thsWithMinIntervalMaxIntervalChangeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeTargetPositionTiltPercent100thsWithMinIntervalMaxIntervalChangeResponseHandler {
        @Generated
        void call_configureAttributeTargetPositionTiltPercent100thsWithMinIntervalMaxIntervalChangeResponseHandler(
                NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("downOrClose:")
    public native void downOrClose(@ObjCBlock(name = "call_downOrClose") Block_downOrClose responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downOrClose {
        @Generated
        void call_downOrClose(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("goToLiftPercentage:liftPercent100thsValue:responseHandler:")
    public native void goToLiftPercentageLiftPercent100thsValueResponseHandler(byte liftPercentageValue,
            char liftPercent100thsValue,
            @ObjCBlock(name = "call_goToLiftPercentageLiftPercent100thsValueResponseHandler") Block_goToLiftPercentageLiftPercent100thsValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goToLiftPercentageLiftPercent100thsValueResponseHandler {
        @Generated
        void call_goToLiftPercentageLiftPercent100thsValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("goToLiftValue:responseHandler:")
    public native void goToLiftValueResponseHandler(char liftValue,
            @ObjCBlock(name = "call_goToLiftValueResponseHandler") Block_goToLiftValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goToLiftValueResponseHandler {
        @Generated
        void call_goToLiftValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("goToTiltPercentage:tiltPercent100thsValue:responseHandler:")
    public native void goToTiltPercentageTiltPercent100thsValueResponseHandler(byte tiltPercentageValue,
            char tiltPercent100thsValue,
            @ObjCBlock(name = "call_goToTiltPercentageTiltPercent100thsValueResponseHandler") Block_goToTiltPercentageTiltPercent100thsValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goToTiltPercentageTiltPercent100thsValueResponseHandler {
        @Generated
        void call_goToTiltPercentageTiltPercent100thsValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("goToTiltValue:responseHandler:")
    public native void goToTiltValueResponseHandler(char tiltValue,
            @ObjCBlock(name = "call_goToTiltValueResponseHandler") Block_goToTiltValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goToTiltValueResponseHandler {
        @Generated
        void call_goToTiltValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeCurrentPositionLiftPercent100thsWithResponseHandler:")
    public native void readAttributeCurrentPositionLiftPercent100thsWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeCurrentPositionLiftPercent100thsWithResponseHandler") Block_readAttributeCurrentPositionLiftPercent100thsWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionLiftPercent100thsWithResponseHandler {
        @Generated
        void call_readAttributeCurrentPositionLiftPercent100thsWithResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeCurrentPositionLiftPercentageWithResponseHandler:")
    public native void readAttributeCurrentPositionLiftPercentageWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeCurrentPositionLiftPercentageWithResponseHandler") Block_readAttributeCurrentPositionLiftPercentageWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionLiftPercentageWithResponseHandler {
        @Generated
        void call_readAttributeCurrentPositionLiftPercentageWithResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeCurrentPositionTiltPercent100thsWithResponseHandler:")
    public native void readAttributeCurrentPositionTiltPercent100thsWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeCurrentPositionTiltPercent100thsWithResponseHandler") Block_readAttributeCurrentPositionTiltPercent100thsWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionTiltPercent100thsWithResponseHandler {
        @Generated
        void call_readAttributeCurrentPositionTiltPercent100thsWithResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeCurrentPositionTiltPercentageWithResponseHandler:")
    public native void readAttributeCurrentPositionTiltPercentageWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeCurrentPositionTiltPercentageWithResponseHandler") Block_readAttributeCurrentPositionTiltPercentageWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionTiltPercentageWithResponseHandler {
        @Generated
        void call_readAttributeCurrentPositionTiltPercentageWithResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeEndProductTypeWithResponseHandler:")
    public native void readAttributeEndProductTypeWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeEndProductTypeWithResponseHandler") Block_readAttributeEndProductTypeWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEndProductTypeWithResponseHandler {
        @Generated
        void call_readAttributeEndProductTypeWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeOperationalStatusWithResponseHandler:")
    public native void readAttributeOperationalStatusWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeOperationalStatusWithResponseHandler") Block_readAttributeOperationalStatusWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOperationalStatusWithResponseHandler {
        @Generated
        void call_readAttributeOperationalStatusWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeSafetyStatusWithResponseHandler:")
    public native void readAttributeSafetyStatusWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeSafetyStatusWithResponseHandler") Block_readAttributeSafetyStatusWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSafetyStatusWithResponseHandler {
        @Generated
        void call_readAttributeSafetyStatusWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeTargetPositionLiftPercent100thsWithResponseHandler:")
    public native void readAttributeTargetPositionLiftPercent100thsWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeTargetPositionLiftPercent100thsWithResponseHandler") Block_readAttributeTargetPositionLiftPercent100thsWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTargetPositionLiftPercent100thsWithResponseHandler {
        @Generated
        void call_readAttributeTargetPositionLiftPercent100thsWithResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeTargetPositionTiltPercent100thsWithResponseHandler:")
    public native void readAttributeTargetPositionTiltPercent100thsWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeTargetPositionTiltPercent100thsWithResponseHandler") Block_readAttributeTargetPositionTiltPercent100thsWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTargetPositionTiltPercent100thsWithResponseHandler {
        @Generated
        void call_readAttributeTargetPositionTiltPercent100thsWithResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeTypeWithResponseHandler:")
    public native void readAttributeTypeWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeTypeWithResponseHandler") Block_readAttributeTypeWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTypeWithResponseHandler {
        @Generated
        void call_readAttributeTypeWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeCurrentPositionLiftPercent100thsWithResponseHandler:")
    public native void reportAttributeCurrentPositionLiftPercent100thsWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeCurrentPositionLiftPercent100thsWithResponseHandler") Block_reportAttributeCurrentPositionLiftPercent100thsWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeCurrentPositionLiftPercent100thsWithResponseHandler {
        @Generated
        void call_reportAttributeCurrentPositionLiftPercent100thsWithResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeCurrentPositionLiftPercentageWithResponseHandler:")
    public native void reportAttributeCurrentPositionLiftPercentageWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeCurrentPositionLiftPercentageWithResponseHandler") Block_reportAttributeCurrentPositionLiftPercentageWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeCurrentPositionLiftPercentageWithResponseHandler {
        @Generated
        void call_reportAttributeCurrentPositionLiftPercentageWithResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeCurrentPositionTiltPercent100thsWithResponseHandler:")
    public native void reportAttributeCurrentPositionTiltPercent100thsWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeCurrentPositionTiltPercent100thsWithResponseHandler") Block_reportAttributeCurrentPositionTiltPercent100thsWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeCurrentPositionTiltPercent100thsWithResponseHandler {
        @Generated
        void call_reportAttributeCurrentPositionTiltPercent100thsWithResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeCurrentPositionTiltPercentageWithResponseHandler:")
    public native void reportAttributeCurrentPositionTiltPercentageWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeCurrentPositionTiltPercentageWithResponseHandler") Block_reportAttributeCurrentPositionTiltPercentageWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeCurrentPositionTiltPercentageWithResponseHandler {
        @Generated
        void call_reportAttributeCurrentPositionTiltPercentageWithResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeOperationalStatusWithResponseHandler:")
    public native void reportAttributeOperationalStatusWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeOperationalStatusWithResponseHandler") Block_reportAttributeOperationalStatusWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeOperationalStatusWithResponseHandler {
        @Generated
        void call_reportAttributeOperationalStatusWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeSafetyStatusWithResponseHandler:")
    public native void reportAttributeSafetyStatusWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeSafetyStatusWithResponseHandler") Block_reportAttributeSafetyStatusWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeSafetyStatusWithResponseHandler {
        @Generated
        void call_reportAttributeSafetyStatusWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeTargetPositionLiftPercent100thsWithResponseHandler:")
    public native void reportAttributeTargetPositionLiftPercent100thsWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeTargetPositionLiftPercent100thsWithResponseHandler") Block_reportAttributeTargetPositionLiftPercent100thsWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeTargetPositionLiftPercent100thsWithResponseHandler {
        @Generated
        void call_reportAttributeTargetPositionLiftPercent100thsWithResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeTargetPositionTiltPercent100thsWithResponseHandler:")
    public native void reportAttributeTargetPositionTiltPercent100thsWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeTargetPositionTiltPercent100thsWithResponseHandler") Block_reportAttributeTargetPositionTiltPercent100thsWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeTargetPositionTiltPercent100thsWithResponseHandler {
        @Generated
        void call_reportAttributeTargetPositionTiltPercent100thsWithResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("stopMotion:")
    public native void stopMotion(@ObjCBlock(name = "call_stopMotion") Block_stopMotion responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopMotion {
        @Generated
        void call_stopMotion(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("upOrOpen:")
    public native void upOrOpen(@ObjCBlock(name = "call_upOrOpen") Block_upOrOpen responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_upOrOpen {
        @Generated
        void call_upOrOpen(NSError error, NSDictionary<?, ?> values);
    }
}
