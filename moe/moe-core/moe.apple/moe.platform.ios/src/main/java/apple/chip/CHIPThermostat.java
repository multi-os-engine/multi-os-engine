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
 * Cluster Thermostat
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPThermostat extends CHIPCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPThermostat(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPThermostat alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CHIPThermostat allocWithZone(VoidPtr zone);

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
    @Selector("clearWeeklySchedule:")
    public native void clearWeeklySchedule(
            @ObjCBlock(name = "call_clearWeeklySchedule") Block_clearWeeklySchedule responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearWeeklySchedule {
        @Generated
        void call_clearWeeklySchedule(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("configureAttributeLocalTemperatureWithMinInterval:maxInterval:change:responseHandler:")
    public native void configureAttributeLocalTemperatureWithMinIntervalMaxIntervalChangeResponseHandler(
            char minInterval, char maxInterval, short change,
            @ObjCBlock(name = "call_configureAttributeLocalTemperatureWithMinIntervalMaxIntervalChangeResponseHandler") Block_configureAttributeLocalTemperatureWithMinIntervalMaxIntervalChangeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeLocalTemperatureWithMinIntervalMaxIntervalChangeResponseHandler {
        @Generated
        void call_configureAttributeLocalTemperatureWithMinIntervalMaxIntervalChangeResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("getRelayStatusLog:")
    public native void getRelayStatusLog(
            @ObjCBlock(name = "call_getRelayStatusLog") Block_getRelayStatusLog responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getRelayStatusLog {
        @Generated
        void call_getRelayStatusLog(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("getWeeklySchedule:modeToReturn:responseHandler:")
    public native void getWeeklyScheduleModeToReturnResponseHandler(byte daysToReturn, byte modeToReturn,
            @ObjCBlock(name = "call_getWeeklyScheduleModeToReturnResponseHandler") Block_getWeeklyScheduleModeToReturnResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getWeeklyScheduleModeToReturnResponseHandler {
        @Generated
        void call_getWeeklyScheduleModeToReturnResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CHIPThermostat init();

    @Generated
    @Selector("initWithDevice:endpoint:queue:")
    public native CHIPThermostat initWithDeviceEndpointQueue(CHIPDevice device, char endpoint, NSObject queue);

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
    public static native CHIPThermostat new_objc();

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
    @Selector("readAttributeControlSequenceOfOperationWithResponseHandler:")
    public native void readAttributeControlSequenceOfOperationWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeControlSequenceOfOperationWithResponseHandler") Block_readAttributeControlSequenceOfOperationWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeControlSequenceOfOperationWithResponseHandler {
        @Generated
        void call_readAttributeControlSequenceOfOperationWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeLocalTemperatureWithResponseHandler:")
    public native void readAttributeLocalTemperatureWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeLocalTemperatureWithResponseHandler") Block_readAttributeLocalTemperatureWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLocalTemperatureWithResponseHandler {
        @Generated
        void call_readAttributeLocalTemperatureWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeOccupiedCoolingSetpointWithResponseHandler:")
    public native void readAttributeOccupiedCoolingSetpointWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeOccupiedCoolingSetpointWithResponseHandler") Block_readAttributeOccupiedCoolingSetpointWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupiedCoolingSetpointWithResponseHandler {
        @Generated
        void call_readAttributeOccupiedCoolingSetpointWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeOccupiedHeatingSetpointWithResponseHandler:")
    public native void readAttributeOccupiedHeatingSetpointWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeOccupiedHeatingSetpointWithResponseHandler") Block_readAttributeOccupiedHeatingSetpointWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupiedHeatingSetpointWithResponseHandler {
        @Generated
        void call_readAttributeOccupiedHeatingSetpointWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeSystemModeWithResponseHandler:")
    public native void readAttributeSystemModeWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeSystemModeWithResponseHandler") Block_readAttributeSystemModeWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSystemModeWithResponseHandler {
        @Generated
        void call_readAttributeSystemModeWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeLocalTemperatureWithResponseHandler:")
    public native void reportAttributeLocalTemperatureWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeLocalTemperatureWithResponseHandler") Block_reportAttributeLocalTemperatureWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeLocalTemperatureWithResponseHandler {
        @Generated
        void call_reportAttributeLocalTemperatureWithResponseHandler(NSError error, NSDictionary<?, ?> values);
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
    @Selector("setWeeklySchedule:dayOfWeekForSequence:modeForSequence:payload:responseHandler:")
    public native void setWeeklyScheduleDayOfWeekForSequenceModeForSequencePayloadResponseHandler(
            byte numberOfTransitionsForSequence, byte dayOfWeekForSequence, byte modeForSequence, byte payload,
            @ObjCBlock(name = "call_setWeeklyScheduleDayOfWeekForSequenceModeForSequencePayloadResponseHandler") Block_setWeeklyScheduleDayOfWeekForSequenceModeForSequencePayloadResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setWeeklyScheduleDayOfWeekForSequenceModeForSequencePayloadResponseHandler {
        @Generated
        void call_setWeeklyScheduleDayOfWeekForSequenceModeForSequencePayloadResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("setpointRaiseLower:amount:responseHandler:")
    public native void setpointRaiseLowerAmountResponseHandler(byte mode, byte amount,
            @ObjCBlock(name = "call_setpointRaiseLowerAmountResponseHandler") Block_setpointRaiseLowerAmountResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setpointRaiseLowerAmountResponseHandler {
        @Generated
        void call_setpointRaiseLowerAmountResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("writeAttributeControlSequenceOfOperationWithValue:responseHandler:")
    public native void writeAttributeControlSequenceOfOperationWithValueResponseHandler(byte value,
            @ObjCBlock(name = "call_writeAttributeControlSequenceOfOperationWithValueResponseHandler") Block_writeAttributeControlSequenceOfOperationWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeControlSequenceOfOperationWithValueResponseHandler {
        @Generated
        void call_writeAttributeControlSequenceOfOperationWithValueResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeOccupiedCoolingSetpointWithValue:responseHandler:")
    public native void writeAttributeOccupiedCoolingSetpointWithValueResponseHandler(short value,
            @ObjCBlock(name = "call_writeAttributeOccupiedCoolingSetpointWithValueResponseHandler") Block_writeAttributeOccupiedCoolingSetpointWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOccupiedCoolingSetpointWithValueResponseHandler {
        @Generated
        void call_writeAttributeOccupiedCoolingSetpointWithValueResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeOccupiedHeatingSetpointWithValue:responseHandler:")
    public native void writeAttributeOccupiedHeatingSetpointWithValueResponseHandler(short value,
            @ObjCBlock(name = "call_writeAttributeOccupiedHeatingSetpointWithValueResponseHandler") Block_writeAttributeOccupiedHeatingSetpointWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOccupiedHeatingSetpointWithValueResponseHandler {
        @Generated
        void call_writeAttributeOccupiedHeatingSetpointWithValueResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeSystemModeWithValue:responseHandler:")
    public native void writeAttributeSystemModeWithValueResponseHandler(byte value,
            @ObjCBlock(name = "call_writeAttributeSystemModeWithValueResponseHandler") Block_writeAttributeSystemModeWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeSystemModeWithValueResponseHandler {
        @Generated
        void call_writeAttributeSystemModeWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeAbsMaxCoolSetpointLimitWithResponseHandler:")
    public native void readAttributeAbsMaxCoolSetpointLimitWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeAbsMaxCoolSetpointLimitWithResponseHandler") Block_readAttributeAbsMaxCoolSetpointLimitWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMaxCoolSetpointLimitWithResponseHandler {
        @Generated
        void call_readAttributeAbsMaxCoolSetpointLimitWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeAbsMaxHeatSetpointLimitWithResponseHandler:")
    public native void readAttributeAbsMaxHeatSetpointLimitWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeAbsMaxHeatSetpointLimitWithResponseHandler") Block_readAttributeAbsMaxHeatSetpointLimitWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMaxHeatSetpointLimitWithResponseHandler {
        @Generated
        void call_readAttributeAbsMaxHeatSetpointLimitWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeAbsMinCoolSetpointLimitWithResponseHandler:")
    public native void readAttributeAbsMinCoolSetpointLimitWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeAbsMinCoolSetpointLimitWithResponseHandler") Block_readAttributeAbsMinCoolSetpointLimitWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMinCoolSetpointLimitWithResponseHandler {
        @Generated
        void call_readAttributeAbsMinCoolSetpointLimitWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeAbsMinHeatSetpointLimitWithResponseHandler:")
    public native void readAttributeAbsMinHeatSetpointLimitWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeAbsMinHeatSetpointLimitWithResponseHandler") Block_readAttributeAbsMinHeatSetpointLimitWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMinHeatSetpointLimitWithResponseHandler {
        @Generated
        void call_readAttributeAbsMinHeatSetpointLimitWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeFeatureMapWithResponseHandler:")
    public native void readAttributeFeatureMapWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeFeatureMapWithResponseHandler") Block_readAttributeFeatureMapWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeFeatureMapWithResponseHandler {
        @Generated
        void call_readAttributeFeatureMapWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeMaxCoolSetpointLimitWithResponseHandler:")
    public native void readAttributeMaxCoolSetpointLimitWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeMaxCoolSetpointLimitWithResponseHandler") Block_readAttributeMaxCoolSetpointLimitWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxCoolSetpointLimitWithResponseHandler {
        @Generated
        void call_readAttributeMaxCoolSetpointLimitWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeMaxHeatSetpointLimitWithResponseHandler:")
    public native void readAttributeMaxHeatSetpointLimitWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeMaxHeatSetpointLimitWithResponseHandler") Block_readAttributeMaxHeatSetpointLimitWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxHeatSetpointLimitWithResponseHandler {
        @Generated
        void call_readAttributeMaxHeatSetpointLimitWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeMinCoolSetpointLimitWithResponseHandler:")
    public native void readAttributeMinCoolSetpointLimitWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeMinCoolSetpointLimitWithResponseHandler") Block_readAttributeMinCoolSetpointLimitWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinCoolSetpointLimitWithResponseHandler {
        @Generated
        void call_readAttributeMinCoolSetpointLimitWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeMinHeatSetpointLimitWithResponseHandler:")
    public native void readAttributeMinHeatSetpointLimitWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeMinHeatSetpointLimitWithResponseHandler") Block_readAttributeMinHeatSetpointLimitWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinHeatSetpointLimitWithResponseHandler {
        @Generated
        void call_readAttributeMinHeatSetpointLimitWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeNumberOfDailyTransitionsWithResponseHandler:")
    public native void readAttributeNumberOfDailyTransitionsWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeNumberOfDailyTransitionsWithResponseHandler") Block_readAttributeNumberOfDailyTransitionsWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfDailyTransitionsWithResponseHandler {
        @Generated
        void call_readAttributeNumberOfDailyTransitionsWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeNumberOfWeeklyTransitionsWithResponseHandler:")
    public native void readAttributeNumberOfWeeklyTransitionsWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeNumberOfWeeklyTransitionsWithResponseHandler") Block_readAttributeNumberOfWeeklyTransitionsWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfWeeklyTransitionsWithResponseHandler {
        @Generated
        void call_readAttributeNumberOfWeeklyTransitionsWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeStartOfWeekWithResponseHandler:")
    public native void readAttributeStartOfWeekWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeStartOfWeekWithResponseHandler") Block_readAttributeStartOfWeekWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStartOfWeekWithResponseHandler {
        @Generated
        void call_readAttributeStartOfWeekWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeMaxCoolSetpointLimitWithValue:responseHandler:")
    public native void writeAttributeMaxCoolSetpointLimitWithValueResponseHandler(short value,
            @ObjCBlock(name = "call_writeAttributeMaxCoolSetpointLimitWithValueResponseHandler") Block_writeAttributeMaxCoolSetpointLimitWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMaxCoolSetpointLimitWithValueResponseHandler {
        @Generated
        void call_writeAttributeMaxCoolSetpointLimitWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeMaxHeatSetpointLimitWithValue:responseHandler:")
    public native void writeAttributeMaxHeatSetpointLimitWithValueResponseHandler(short value,
            @ObjCBlock(name = "call_writeAttributeMaxHeatSetpointLimitWithValueResponseHandler") Block_writeAttributeMaxHeatSetpointLimitWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMaxHeatSetpointLimitWithValueResponseHandler {
        @Generated
        void call_writeAttributeMaxHeatSetpointLimitWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeMinCoolSetpointLimitWithValue:responseHandler:")
    public native void writeAttributeMinCoolSetpointLimitWithValueResponseHandler(short value,
            @ObjCBlock(name = "call_writeAttributeMinCoolSetpointLimitWithValueResponseHandler") Block_writeAttributeMinCoolSetpointLimitWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMinCoolSetpointLimitWithValueResponseHandler {
        @Generated
        void call_writeAttributeMinCoolSetpointLimitWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeMinHeatSetpointLimitWithValue:responseHandler:")
    public native void writeAttributeMinHeatSetpointLimitWithValueResponseHandler(short value,
            @ObjCBlock(name = "call_writeAttributeMinHeatSetpointLimitWithValueResponseHandler") Block_writeAttributeMinHeatSetpointLimitWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMinHeatSetpointLimitWithValueResponseHandler {
        @Generated
        void call_writeAttributeMinHeatSetpointLimitWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }
}
