/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.homekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCalendar;
import apple.foundation.NSDate;
import apple.foundation.NSDateComponents;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSTimeZone;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Timer based trigger.
 * 
 * This class represents a trigger that is based on timers.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HMTimerTrigger extends HMTrigger {
    static {
        NatJ.register();
    }

    @Generated
    protected HMTimerTrigger(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HMTimerTrigger alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HMTimerTrigger allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

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
    public static native HMTimerTrigger new_objc();

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

    /**
     * Specifies when, in an absolute time, the trigger should fire the first time.
     * 
     * Timer triggers are only set at the top of the minute. When the timer trigger fires,
     * it will typically fire within 1 minute of the scheduled fire date or calculated
     * recurrence fire date, depending on how the system is managing its resources.
     * 
     * [@note] Should be at least 1 minute ahead for reliable firing.
     */
    @NotNull
    @Generated
    @Selector("fireDate")
    public native NSDate fireDate();

    @Generated
    @Selector("init")
    public native HMTimerTrigger init();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 16.4
     */
    @Deprecated
    @Generated
    @Selector("initWithName:fireDate:timeZone:recurrence:recurrenceCalendar:")
    public native HMTimerTrigger initWithNameFireDateTimeZoneRecurrenceRecurrenceCalendar(@NotNull String name,
            @NotNull NSDate fireDate, @Nullable NSTimeZone timeZone, @Nullable NSDateComponents recurrence,
            @Nullable NSCalendar recurrenceCalendar);

    /**
     * The date components that specify how a trigger is to be repeated.
     * 
     * This value must be nil if the trigger should not repeat. The date component
     * values are relative to the initial fire date of the trigger. If the
     * calendar value of the recurrence is nil, the current calendar
     * will be used to calculate the recurrence interval. Recurrence example: if a
     * trigger should repeat every hour, set the 'hour' property of the
     * recurrence to 1. The minimum recurrence interval is 5 minutes, maximum recurrence
     * interval is 5 weeks and the recurrence interval must be specified in multiples of
     * whole minutes. Examples are 5 minutes, 6 minutes, 1 day, 2 weeks.
     */
    @Nullable
    @Generated
    @Selector("recurrence")
    public native NSDateComponents recurrence();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 16.4
     * Deprecated-Message: No longer supported
     */
    @Deprecated
    @Nullable
    @Generated
    @Selector("recurrenceCalendar")
    public native NSCalendar recurrenceCalendar();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 16.4
     * Deprecated-Message: Use HMEventTrigger with HMCalendarEvent for triggers based on a time-zone-relative time of
     * day
     */
    @Deprecated
    @Nullable
    @Generated
    @Selector("timeZone")
    public native NSTimeZone timeZone();

    /**
     * This method is used to change the fire date of a timer trigger.
     * 
     * @param fireDate   New fire date for the trigger. The seconds value must be zero.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request,
     *                   error will be nil on success. HMErrorCodeDateMustBeOnSpecifiedBoundaries will
     *                   be returned if the fireDate includes a seconds value other than 0.
     */
    @Generated
    @Selector("updateFireDate:completionHandler:")
    public native void updateFireDateCompletionHandler(@NotNull NSDate fireDate,
            @NotNull @ObjCBlock(name = "call_updateFireDateCompletionHandler") Block_updateFireDateCompletionHandler completion);

    /**
     * This method is used to change the recurrence interval for a timer trigger.
     * 
     * @param recurrence New recurrence interval for the trigger. Passing a nil indicates that
     *                   the trigger is non-repeating. The minimum recurrence interval is 5 minutes,
     *                   maximum recurrence interval is 5 weeks and the recurrence interval must be specified
     *                   in multiples of whole minutes.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request:
     *                   HMErrorCodeDateMustBeOnSpecifiedBoundaries is returned if the seconds/nanoseconds
     *                   fields have a value other than 0;
     *                   HMErrorCodeRecurrenceTooSmall is returned if the recurrence interval is less than
     *                   5 minutes;
     *                   HMErrorCodeRecurrenceTooLarge is returned if the recurrence interval is
     *                   greater than 5 weeks. * error will be nil on success.
     */
    @Generated
    @Selector("updateRecurrence:completionHandler:")
    public native void updateRecurrenceCompletionHandler(@Nullable NSDateComponents recurrence,
            @NotNull @ObjCBlock(name = "call_updateRecurrenceCompletionHandler") Block_updateRecurrenceCompletionHandler completion);

    /**
     * API-Since: 8.0
     * Deprecated-Since: 16.4
     * Deprecated-Message: Use HMEventTrigger with HMCalendarEvent for triggers based on a time-zone-relative time of
     * day
     */
    @Deprecated
    @Generated
    @Selector("updateTimeZone:completionHandler:")
    public native void updateTimeZoneCompletionHandler(@Nullable NSTimeZone timeZone,
            @NotNull @ObjCBlock(name = "call_updateTimeZoneCompletionHandler") Block_updateTimeZoneCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateFireDateCompletionHandler {
        @Generated
        void call_updateFireDateCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateRecurrenceCompletionHandler {
        @Generated
        void call_updateRecurrenceCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateTimeZoneCompletionHandler {
        @Generated
        void call_updateTimeZoneCompletionHandler(@Nullable NSError error);
    }

    /**
     * Initialize a new HMTimerTrigger object.
     * 
     * Validity checks are performed when the trigger is added to the home and the NSError in
     * the completion block for addTrigger: method indicates the reason for the failure:
     * HMErrorCodeDateMustBeOnSpecifiedBoundaries is returned if the seconds/nanoseconds fields
     * in recurrence interval or seconds field in fireDate have a value other than 0.
     * HMErrorCodeRecurrenceTooSmall is returned if recurrence interval is less than 5 minutes.
     * HMErrorCodeRecurrenceTooLarge is returned if recurrence interval is greater than 5 weeks.
     * HMErrorCodeFireDateInPast is returned if recurrence is nil and fireDate is in the past.
     * 
     * API-Since: 16.4
     * 
     * @param name       Name for the trigger.
     * 
     * @param fireDate   The initial fire date for the timer trigger. The seconds value must be zero.
     *                   Date should be at least 1 minute ahead for reliable firing.
     *                   HMErrorCodeDateMustBeOnSpecifiedBoundaries will be returned when adding the trigger
     *                   to a home if the fireDate includes a seconds value other than 0.
     * 
     * @param recurrence The recurrence interval to fire the trigger. A value of nil indicates that the
     *                   trigger is non-repeating. The minimum reccurence interval is 5 minutes, maximum
     *                   recurrence interval is 5 weeks and the recurrence interval must be specified in
     *                   multiples of whole minutes.
     */
    @Generated
    @Selector("initWithName:fireDate:recurrence:")
    public native HMTimerTrigger initWithNameFireDateRecurrence(@NotNull String name, @NotNull NSDate fireDate,
            @Nullable NSDateComponents recurrence);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
