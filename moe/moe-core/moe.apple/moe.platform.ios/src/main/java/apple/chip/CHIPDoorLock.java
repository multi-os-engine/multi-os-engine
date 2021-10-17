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
import org.moe.natj.general.ann.MappedReturn;
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
 * Cluster Door Lock
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPDoorLock extends CHIPCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPDoorLock(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPDoorLock alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @Selector("clearAllPins:")
    public native void clearAllPins(@ObjCBlock(name = "call_clearAllPins") Block_clearAllPins responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearAllPins {
        @Generated
        void call_clearAllPins(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("clearAllRfids:")
    public native void clearAllRfids(@ObjCBlock(name = "call_clearAllRfids") Block_clearAllRfids responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearAllRfids {
        @Generated
        void call_clearAllRfids(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("clearHolidaySchedule:responseHandler:")
    public native void clearHolidayScheduleResponseHandler(byte scheduleId,
            @ObjCBlock(name = "call_clearHolidayScheduleResponseHandler") Block_clearHolidayScheduleResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearHolidayScheduleResponseHandler {
        @Generated
        void call_clearHolidayScheduleResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("clearPin:responseHandler:")
    public native void clearPinResponseHandler(char userId,
            @ObjCBlock(name = "call_clearPinResponseHandler") Block_clearPinResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearPinResponseHandler {
        @Generated
        void call_clearPinResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("clearRfid:responseHandler:")
    public native void clearRfidResponseHandler(char userId,
            @ObjCBlock(name = "call_clearRfidResponseHandler") Block_clearRfidResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearRfidResponseHandler {
        @Generated
        void call_clearRfidResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("clearWeekdaySchedule:userId:responseHandler:")
    public native void clearWeekdayScheduleUserIdResponseHandler(byte scheduleId, char userId,
            @ObjCBlock(name = "call_clearWeekdayScheduleUserIdResponseHandler") Block_clearWeekdayScheduleUserIdResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearWeekdayScheduleUserIdResponseHandler {
        @Generated
        void call_clearWeekdayScheduleUserIdResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("clearYeardaySchedule:userId:responseHandler:")
    public native void clearYeardayScheduleUserIdResponseHandler(byte scheduleId, char userId,
            @ObjCBlock(name = "call_clearYeardayScheduleUserIdResponseHandler") Block_clearYeardayScheduleUserIdResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearYeardayScheduleUserIdResponseHandler {
        @Generated
        void call_clearYeardayScheduleUserIdResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("configureAttributeLockStateWithMinInterval:maxInterval:responseHandler:")
    public native void configureAttributeLockStateWithMinIntervalMaxIntervalResponseHandler(char minInterval,
            char maxInterval,
            @ObjCBlock(name = "call_configureAttributeLockStateWithMinIntervalMaxIntervalResponseHandler") Block_configureAttributeLockStateWithMinIntervalMaxIntervalResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeLockStateWithMinIntervalMaxIntervalResponseHandler {
        @Generated
        void call_configureAttributeLockStateWithMinIntervalMaxIntervalResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("getHolidaySchedule:responseHandler:")
    public native void getHolidayScheduleResponseHandler(byte scheduleId,
            @ObjCBlock(name = "call_getHolidayScheduleResponseHandler") Block_getHolidayScheduleResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getHolidayScheduleResponseHandler {
        @Generated
        void call_getHolidayScheduleResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("getLogRecord:responseHandler:")
    public native void getLogRecordResponseHandler(char logIndex,
            @ObjCBlock(name = "call_getLogRecordResponseHandler") Block_getLogRecordResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getLogRecordResponseHandler {
        @Generated
        void call_getLogRecordResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("getPin:responseHandler:")
    public native void getPinResponseHandler(char userId,
            @ObjCBlock(name = "call_getPinResponseHandler") Block_getPinResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getPinResponseHandler {
        @Generated
        void call_getPinResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("getRfid:responseHandler:")
    public native void getRfidResponseHandler(char userId,
            @ObjCBlock(name = "call_getRfidResponseHandler") Block_getRfidResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getRfidResponseHandler {
        @Generated
        void call_getRfidResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("getUserType:responseHandler:")
    public native void getUserTypeResponseHandler(char userId,
            @ObjCBlock(name = "call_getUserTypeResponseHandler") Block_getUserTypeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getUserTypeResponseHandler {
        @Generated
        void call_getUserTypeResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("getWeekdaySchedule:userId:responseHandler:")
    public native void getWeekdayScheduleUserIdResponseHandler(byte scheduleId, char userId,
            @ObjCBlock(name = "call_getWeekdayScheduleUserIdResponseHandler") Block_getWeekdayScheduleUserIdResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getWeekdayScheduleUserIdResponseHandler {
        @Generated
        void call_getWeekdayScheduleUserIdResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("getYeardaySchedule:userId:responseHandler:")
    public native void getYeardayScheduleUserIdResponseHandler(byte scheduleId, char userId,
            @ObjCBlock(name = "call_getYeardayScheduleUserIdResponseHandler") Block_getYeardayScheduleUserIdResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getYeardayScheduleUserIdResponseHandler {
        @Generated
        void call_getYeardayScheduleUserIdResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CHIPDoorLock init();

    @Generated
    @Selector("initWithDevice:endpoint:queue:")
    public native CHIPDoorLock initWithDeviceEndpointQueue(CHIPDevice device, byte endpoint, NSObject queue);

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
    @Selector("lockDoor:responseHandler:")
    public native void lockDoorResponseHandler(String pin,
            @ObjCBlock(name = "call_lockDoorResponseHandler") Block_lockDoorResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_lockDoorResponseHandler {
        @Generated
        void call_lockDoorResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("readAttributeActuatorEnabledWithResponseHandler:")
    public native void readAttributeActuatorEnabledWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeActuatorEnabledWithResponseHandler") Block_readAttributeActuatorEnabledWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActuatorEnabledWithResponseHandler {
        @Generated
        void call_readAttributeActuatorEnabledWithResponseHandler(NSError error, NSDictionary<?, ?> values);
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
    @Selector("readAttributeLockStateWithResponseHandler:")
    public native void readAttributeLockStateWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeLockStateWithResponseHandler") Block_readAttributeLockStateWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLockStateWithResponseHandler {
        @Generated
        void call_readAttributeLockStateWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeLockTypeWithResponseHandler:")
    public native void readAttributeLockTypeWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeLockTypeWithResponseHandler") Block_readAttributeLockTypeWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLockTypeWithResponseHandler {
        @Generated
        void call_readAttributeLockTypeWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeLockStateWithResponseHandler:")
    public native void reportAttributeLockStateWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeLockStateWithResponseHandler") Block_reportAttributeLockStateWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeLockStateWithResponseHandler {
        @Generated
        void call_reportAttributeLockStateWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setHolidaySchedule:localStartTime:localEndTime:operatingModeDuringHoliday:responseHandler:")
    public native void setHolidayScheduleLocalStartTimeLocalEndTimeOperatingModeDuringHolidayResponseHandler(
            byte scheduleId, int localStartTime, int localEndTime, byte operatingModeDuringHoliday,
            @ObjCBlock(name = "call_setHolidayScheduleLocalStartTimeLocalEndTimeOperatingModeDuringHolidayResponseHandler") Block_setHolidayScheduleLocalStartTimeLocalEndTimeOperatingModeDuringHolidayResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setHolidayScheduleLocalStartTimeLocalEndTimeOperatingModeDuringHolidayResponseHandler {
        @Generated
        void call_setHolidayScheduleLocalStartTimeLocalEndTimeOperatingModeDuringHolidayResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("setPin:userStatus:userType:pin:responseHandler:")
    public native void setPinUserStatusUserTypePinResponseHandler(char userId, byte userStatus, byte userType,
            String pin,
            @ObjCBlock(name = "call_setPinUserStatusUserTypePinResponseHandler") Block_setPinUserStatusUserTypePinResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPinUserStatusUserTypePinResponseHandler {
        @Generated
        void call_setPinUserStatusUserTypePinResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("setRfid:userStatus:userType:id:responseHandler:")
    public native void setRfidUserStatusUserTypeIdResponseHandler(char userId, byte userStatus, byte userType,
            String id,
            @ObjCBlock(name = "call_setRfidUserStatusUserTypeIdResponseHandler") Block_setRfidUserStatusUserTypeIdResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRfidUserStatusUserTypeIdResponseHandler {
        @Generated
        void call_setRfidUserStatusUserTypeIdResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("setUserType:userType:responseHandler:")
    public native void setUserTypeUserTypeResponseHandler(char userId, byte userType,
            @ObjCBlock(name = "call_setUserTypeUserTypeResponseHandler") Block_setUserTypeUserTypeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setUserTypeUserTypeResponseHandler {
        @Generated
        void call_setUserTypeUserTypeResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("setWeekdaySchedule:userId:daysMask:startHour:startMinute:endHour:endMinute:responseHandler:")
    public native void setWeekdayScheduleUserIdDaysMaskStartHourStartMinuteEndHourEndMinuteResponseHandler(
            byte scheduleId, char userId, byte daysMask, byte startHour, byte startMinute, byte endHour, byte endMinute,
            @ObjCBlock(name = "call_setWeekdayScheduleUserIdDaysMaskStartHourStartMinuteEndHourEndMinuteResponseHandler") Block_setWeekdayScheduleUserIdDaysMaskStartHourStartMinuteEndHourEndMinuteResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setWeekdayScheduleUserIdDaysMaskStartHourStartMinuteEndHourEndMinuteResponseHandler {
        @Generated
        void call_setWeekdayScheduleUserIdDaysMaskStartHourStartMinuteEndHourEndMinuteResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("setYeardaySchedule:userId:localStartTime:localEndTime:responseHandler:")
    public native void setYeardayScheduleUserIdLocalStartTimeLocalEndTimeResponseHandler(byte scheduleId, char userId,
            int localStartTime, int localEndTime,
            @ObjCBlock(name = "call_setYeardayScheduleUserIdLocalStartTimeLocalEndTimeResponseHandler") Block_setYeardayScheduleUserIdLocalStartTimeLocalEndTimeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setYeardayScheduleUserIdLocalStartTimeLocalEndTimeResponseHandler {
        @Generated
        void call_setYeardayScheduleUserIdLocalStartTimeLocalEndTimeResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("unlockDoor:responseHandler:")
    public native void unlockDoorResponseHandler(String pin,
            @ObjCBlock(name = "call_unlockDoorResponseHandler") Block_unlockDoorResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_unlockDoorResponseHandler {
        @Generated
        void call_unlockDoorResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("unlockWithTimeout:pin:responseHandler:")
    public native void unlockWithTimeoutPinResponseHandler(char timeoutInSeconds, String pin,
            @ObjCBlock(name = "call_unlockWithTimeoutPinResponseHandler") Block_unlockWithTimeoutPinResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_unlockWithTimeoutPinResponseHandler {
        @Generated
        void call_unlockWithTimeoutPinResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
