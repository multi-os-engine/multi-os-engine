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
import apple.foundation.NSDateComponents;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
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
 * Triggers based on events.
 * <p>
 * This class represents a trigger that is based on events.
 */
@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HMEventTrigger extends HMTrigger {
    static {
        NatJ.register();
    }

    @Generated
    protected HMEventTrigger(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HMEventTrigger alloc();

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * Creates a predicate that will evaluate whether the event occurred at or after the time specified.
     *
     * @param dateComponents Date components representing the time to compare against when the event occurs.
     * @return Predicate object representing a condition to evaluate before executing the action set.
     */
    @Generated
    @Selector("predicateForEvaluatingTriggerOccurringAfterDateWithComponents:")
    public static native NSPredicate predicateForEvaluatingTriggerOccurringAfterDateWithComponents(
            NSDateComponents dateComponents);

    /**
     * Creates a predicate that will evaluate whether the event occurred after a significant event.
     *
     * @param significantEvent The significant event to compare against.
     *                         The valid values are: HMSignificantEventSunrise and HMSignificantEventSunset.
     * @param offset           An offset from the time of the signficant event. To specify an offset after the significant event, the
     *                         properties of the NSDateComponents must be positive value. e.g. To specify 30 mins after sunset, the
     *                         'minute' property must be set to 30.
     * @return Predicate object representing a condition to evaluate before executing the action set.
     */
    @Generated
    @Selector("predicateForEvaluatingTriggerOccurringAfterSignificantEvent:applyingOffset:")
    public static native NSPredicate predicateForEvaluatingTriggerOccurringAfterSignificantEventApplyingOffset(
            String significantEvent, NSDateComponents offset);

    /**
     * Creates a predicate that will evaluate whether the event occurred before the time specified.
     *
     * @param dateComponents Date components representing the time to compare against when the event occurs.
     * @return Predicate object representing a condition to evaluate before executing the action set.
     */
    @Generated
    @Selector("predicateForEvaluatingTriggerOccurringBeforeDateWithComponents:")
    public static native NSPredicate predicateForEvaluatingTriggerOccurringBeforeDateWithComponents(
            NSDateComponents dateComponents);

    /**
     * Creates a predicate that will evaluate whether the event occurred before a significant event.
     *
     * @param significantEvent The significant event to compare against.
     *                         The valid values are: HMSignificantEventSunrise and HMSignificantEventSunset.
     * @param offset           An offset from the time of the signficant event. To specify an offset before the significant event, the
     *                         properties of the NSDateComponents must be negative value. e.g. To specify 30 mins before sunset, the
     *                         'minute' property must be set to -30.
     * @return Predicate object representing a condition to evaluate before executing the action set.
     */
    @Generated
    @Selector("predicateForEvaluatingTriggerOccurringBeforeSignificantEvent:applyingOffset:")
    public static native NSPredicate predicateForEvaluatingTriggerOccurringBeforeSignificantEventApplyingOffset(
            String significantEvent, NSDateComponents offset);

    /**
     * Creates a predicate that will evaluate whether the event occurred at the time specified.
     *
     * @param dateComponents Date components representing the time to compare against when the event occurs.
     * @return Predicate object representing a condition to evaluate before executing the action set.
     */
    @Generated
    @Selector("predicateForEvaluatingTriggerOccurringOnDateWithComponents:")
    public static native NSPredicate predicateForEvaluatingTriggerOccurringOnDateWithComponents(
            NSDateComponents dateComponents);

    /**
     * Creates a predicate that will evaluate whether a characteristic value is related to the specified value.
     *
     * @param characteristic The characteristic that is evaluated as part of the predicate.
     * @param operatorType   The relation between the characteristic and the target value.
     *                       This can be either Less Than, Greater Than, Less Than or Equal, Greater Than or Equal, Equal, or Not Equal.
     *                       Anything else will cause an exception to be thrown.
     * @param value          The value of the characteristic to compare when evaluating the predicate.
     * @return Predicate object representing a condition to evaluate before executing the action set.
     */
    @Generated
    @Selector("predicateForEvaluatingTriggerWithCharacteristic:relatedBy:toValue:")
    public static native NSPredicate predicateForEvaluatingTriggerWithCharacteristicRelatedByToValue(
            HMCharacteristic characteristic, @NUInt long operatorType, @Mapped(ObjCObjectMapper.class) Object value);

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
     * Adds a new event to the event trigger.
     *
     * @param event      Event to add to the event trigger.
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("addEvent:completionHandler:")
    public native void addEventCompletionHandler(HMEvent event,
            @ObjCBlock(name = "call_addEventCompletionHandler") Block_addEventCompletionHandler completion);

    /**
     * The events associated with the trigger.
     */
    @Generated
    @Selector("events")
    public native NSArray<? extends HMEvent> events();

    @Generated
    @Selector("init")
    public native HMEventTrigger init();

    /**
     * Initializes a new event trigger object.
     *
     * @param name      Name of the event trigger.
     * @param events    Array of events that can trigger the evaluation of the trigger. Note: The trigger will
     *                  be evaluated if any one of the events is true.
     * @param predicate The predicate to evaluate before executing any of the actions sets associated to this
     *                  event.
     * @return Instance object representing the event trigger.
     */
    @Generated
    @Selector("initWithName:events:predicate:")
    public native HMEventTrigger initWithNameEventsPredicate(String name, NSArray<? extends HMEvent> events,
            NSPredicate predicate);

    /**
     * The predicate to evaluate before executing the action sets associated with the trigger.
     */
    @Generated
    @Selector("predicate")
    public native NSPredicate predicate();

    /**
     * Removes the specified event from the event trigger.
     *
     * @param event      Event to remove from the event trigger.
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("removeEvent:completionHandler:")
    public native void removeEventCompletionHandler(HMEvent event,
            @ObjCBlock(name = "call_removeEventCompletionHandler") Block_removeEventCompletionHandler completion);

    /**
     * This method replaces the predicate used to evaluate execution of the action sets associated with the trigger.
     *
     * @param predicate  The new predicate for the event trigger.
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request,
     *                   error will be nil on success.
     */
    @Generated
    @Selector("updatePredicate:completionHandler:")
    public native void updatePredicateCompletionHandler(NSPredicate predicate,
            @ObjCBlock(name = "call_updatePredicateCompletionHandler") Block_updatePredicateCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addEventCompletionHandler {
        @Generated
        void call_addEventCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeEventCompletionHandler {
        @Generated
        void call_removeEventCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updatePredicateCompletionHandler {
        @Generated
        void call_updatePredicateCompletionHandler(NSError error);
    }

    /**
     * The events that correspond to executing the restore of the scene before the trigger was executed.
     * E.g. Execute the scene for 10 mins and restore original state is achieved by specifying a corresponding
     * HMDurationEvent in the list of endEvents.
     */
    @Generated
    @Selector("endEvents")
    public native NSArray<? extends HMEvent> endEvents();

    /**
     * Specifies whether this trigger is executed only once after which the trigger is disabled.
     */
    @Generated
    @Selector("executeOnce")
    public native boolean executeOnce();

    /**
     * Initializes a new event trigger object.
     *
     * @param name        Name of the event trigger.
     * @param events      Array of events that can trigger the evaluation of the trigger. Note: The trigger will
     *                    be evaluated if any one of the events is true.
     * @param endEvents   Array of end events that can trigger the restoration to the state before the scene was run.
     * @param recurrences Specifies the days of the week when the trigger is to be evaluated. Only the 'weekday' property
     *                    is honored in NSDateComponents.
     * @param predicate   The predicate to evaluate before executing any of the actions sets associated to this
     *                    event.
     * @return Instance object representing the event trigger.
     */
    @Generated
    @Selector("initWithName:events:endEvents:recurrences:predicate:")
    public native HMEventTrigger initWithNameEventsEndEventsRecurrencesPredicate(String name,
            NSArray<? extends HMEvent> events, NSArray<? extends HMEvent> endEvents,
            NSArray<? extends NSDateComponents> recurrences, NSPredicate predicate);

    /**
     * Creates a predicate that will evaluate whether the event occurred after a significant event.
     *
     * @param significantEvent The significant event to compare against.
     * @return Predicate object representing a condition to evaluate before executing the action set.
     */
    @Generated
    @Selector("predicateForEvaluatingTriggerOccurringAfterSignificantEvent:")
    public static native NSPredicate predicateForEvaluatingTriggerOccurringAfterSignificantEvent(
            HMSignificantTimeEvent significantEvent);

    /**
     * Creates a predicate that will evaluate whether the event occurred before a significant event.
     *
     * @param significantEvent The significant event to compare against.
     * @return Predicate object representing a condition to evaluate before executing the action set.
     */
    @Generated
    @Selector("predicateForEvaluatingTriggerOccurringBeforeSignificantEvent:")
    public static native NSPredicate predicateForEvaluatingTriggerOccurringBeforeSignificantEvent(
            HMSignificantTimeEvent significantEvent);

    /**
     * Creates a predicate that will evaluate whether the event occurred between two times.
     *
     * @param firstDateComponents      The first date component.
     * @param secondDateWithComponents The second date component.
     * @return Predicate object representing a condition to evaluate before executing the action set.
     */
    @Generated
    @Selector("predicateForEvaluatingTriggerOccurringBetweenDateWithComponents:secondDateWithComponents:")
    public static native NSPredicate predicateForEvaluatingTriggerOccurringBetweenDateWithComponentsSecondDateWithComponents(
            NSDateComponents firstDateComponents, NSDateComponents secondDateWithComponents);

    /**
     * Creates a predicate that will evaluate whether the event occurred between two significant events.
     *
     * @param firstSignificantEvent  The first significant event.
     * @param secondSignificantEvent The second significant event.
     * @return Predicate object representing a condition to evaluate before executing the action set.
     */
    @Generated
    @Selector("predicateForEvaluatingTriggerOccurringBetweenSignificantEvent:secondSignificantEvent:")
    public static native NSPredicate predicateForEvaluatingTriggerOccurringBetweenSignificantEventSecondSignificantEvent(
            HMSignificantTimeEvent firstSignificantEvent, HMSignificantTimeEvent secondSignificantEvent);

    /**
     * Creates a predicate that will evaluate based on the presence event.
     *
     * @param presenceEvent The presenceEvent that is evaluated as part of the predicate.
     * @return Predicate object representing a condition to evaluate before executing the action set.
     */
    @Generated
    @Selector("predicateForEvaluatingTriggerWithPresence:")
    public static native NSPredicate predicateForEvaluatingTriggerWithPresence(HMPresenceEvent presenceEvent);

    /**
     * recurrences Specifies the recurrences for when the trigger is evaluated. This only supports days of the week.
     */
    @Generated
    @Selector("recurrences")
    public native NSArray<? extends NSDateComponents> recurrences();

    /**
     * Specifies the current activation state of the trigger.
     */
    @Generated
    @Selector("triggerActivationState")
    @NUInt
    public native long triggerActivationState();

    /**
     * Updates the set of events in the event trigger.
     *
     * @param endEvents  Events to update in the event trigger
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("updateEndEvents:completionHandler:")
    public native void updateEndEventsCompletionHandler(NSArray<? extends HMEvent> endEvents,
            @ObjCBlock(name = "call_updateEndEventsCompletionHandler") Block_updateEndEventsCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateEndEventsCompletionHandler {
        @Generated
        void call_updateEndEventsCompletionHandler(NSError error);
    }

    /**
     * Updates the set of events in the event trigger.
     *
     * @param events     Events to update in the event trigger
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("updateEvents:completionHandler:")
    public native void updateEventsCompletionHandler(NSArray<? extends HMEvent> events,
            @ObjCBlock(name = "call_updateEventsCompletionHandler") Block_updateEventsCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateEventsCompletionHandler {
        @Generated
        void call_updateEventsCompletionHandler(NSError error);
    }

    /**
     * This method is used to update whether the event trigger repeats or not.
     *
     * @param executeOnce Specifies whether the event trigger is repeated or not.
     * @param completion  Block that is invoked once the request is processed.
     *                    The NSError provides more information on the status of the request, error
     *                    will be nil on success.
     */
    @Generated
    @Selector("updateExecuteOnce:completionHandler:")
    public native void updateExecuteOnceCompletionHandler(boolean executeOnce,
            @ObjCBlock(name = "call_updateExecuteOnceCompletionHandler") Block_updateExecuteOnceCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateExecuteOnceCompletionHandler {
        @Generated
        void call_updateExecuteOnceCompletionHandler(NSError error);
    }

    /**
     * This method replaces the recurrences which secifies the days of the week when the trigger is to be evaluated.
     *
     * @param recurrences The new recurrences for the event trigger.
     * @param completion  Block that is invoked once the request is processed.
     *                    The NSError provides more information on the status of the request,
     *                    error will be nil on success.
     */
    @Generated
    @Selector("updateRecurrences:completionHandler:")
    public native void updateRecurrencesCompletionHandler(NSArray<? extends NSDateComponents> recurrences,
            @ObjCBlock(name = "call_updateRecurrencesCompletionHandler") Block_updateRecurrencesCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateRecurrencesCompletionHandler {
        @Generated
        void call_updateRecurrencesCompletionHandler(NSError error);
    }
}
