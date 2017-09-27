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

    @Generated
    @Selector("predicateForEvaluatingTriggerOccurringAfterDateWithComponents:")
    public static native NSPredicate predicateForEvaluatingTriggerOccurringAfterDateWithComponents(
            NSDateComponents dateComponents);

    @Generated
    @Selector("predicateForEvaluatingTriggerOccurringAfterSignificantEvent:applyingOffset:")
    public static native NSPredicate predicateForEvaluatingTriggerOccurringAfterSignificantEventApplyingOffset(
            String significantEvent, NSDateComponents offset);

    @Generated
    @Selector("predicateForEvaluatingTriggerOccurringBeforeDateWithComponents:")
    public static native NSPredicate predicateForEvaluatingTriggerOccurringBeforeDateWithComponents(
            NSDateComponents dateComponents);

    @Generated
    @Selector("predicateForEvaluatingTriggerOccurringBeforeSignificantEvent:applyingOffset:")
    public static native NSPredicate predicateForEvaluatingTriggerOccurringBeforeSignificantEventApplyingOffset(
            String significantEvent, NSDateComponents offset);

    @Generated
    @Selector("predicateForEvaluatingTriggerOccurringOnDateWithComponents:")
    public static native NSPredicate predicateForEvaluatingTriggerOccurringOnDateWithComponents(
            NSDateComponents dateComponents);

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

    @Generated
    @Selector("addEvent:completionHandler:")
    public native void addEventCompletionHandler(HMEvent event,
            @ObjCBlock(name = "call_addEventCompletionHandler") Block_addEventCompletionHandler completion);

    @Generated
    @Selector("events")
    public native NSArray<? extends HMEvent> events();

    @Generated
    @Selector("init")
    public native HMEventTrigger init();

    @Generated
    @Selector("initWithName:events:predicate:")
    public native HMEventTrigger initWithNameEventsPredicate(String name, NSArray<? extends HMEvent> events,
            NSPredicate predicate);

    @Generated
    @Selector("predicate")
    public native NSPredicate predicate();

    @Generated
    @Selector("removeEvent:completionHandler:")
    public native void removeEventCompletionHandler(HMEvent event,
            @ObjCBlock(name = "call_removeEventCompletionHandler") Block_removeEventCompletionHandler completion);

    @Generated
    @Selector("updatePredicate:completionHandler:")
    public native void updatePredicateCompletionHandler(NSPredicate predicate,
            @ObjCBlock(name = "call_updatePredicateCompletionHandler") Block_updatePredicateCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addEventCompletionHandler {
        @Generated
        void call_addEventCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeEventCompletionHandler {
        @Generated
        void call_removeEventCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updatePredicateCompletionHandler {
        @Generated
        void call_updatePredicateCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("endEvents")
    public native NSArray<? extends HMEvent> endEvents();

    @Generated
    @Selector("executeOnce")
    public native boolean executeOnce();

    @Generated
    @Selector("initWithName:events:endEvents:recurrences:predicate:")
    public native HMEventTrigger initWithNameEventsEndEventsRecurrencesPredicate(String name,
            NSArray<? extends HMEvent> events, NSArray<? extends HMEvent> endEvents,
            NSArray<? extends NSDateComponents> recurrences, NSPredicate predicate);

    @Generated
    @Selector("predicateForEvaluatingTriggerOccurringAfterSignificantEvent:")
    public static native NSPredicate predicateForEvaluatingTriggerOccurringAfterSignificantEvent(
            HMSignificantTimeEvent significantEvent);

    @Generated
    @Selector("predicateForEvaluatingTriggerOccurringBeforeSignificantEvent:")
    public static native NSPredicate predicateForEvaluatingTriggerOccurringBeforeSignificantEvent(
            HMSignificantTimeEvent significantEvent);

    @Generated
    @Selector("predicateForEvaluatingTriggerOccurringBetweenDateWithComponents:secondDateWithComponents:")
    public static native NSPredicate predicateForEvaluatingTriggerOccurringBetweenDateWithComponentsSecondDateWithComponents(
            NSDateComponents firstDateComponents, NSDateComponents secondDateWithComponents);

    @Generated
    @Selector("predicateForEvaluatingTriggerOccurringBetweenSignificantEvent:secondSignificantEvent:")
    public static native NSPredicate predicateForEvaluatingTriggerOccurringBetweenSignificantEventSecondSignificantEvent(
            HMSignificantTimeEvent firstSignificantEvent, HMSignificantTimeEvent secondSignificantEvent);

    @Generated
    @Selector("predicateForEvaluatingTriggerWithPresence:")
    public static native NSPredicate predicateForEvaluatingTriggerWithPresence(HMPresenceEvent presenceEvent);

    @Generated
    @Selector("recurrences")
    public native NSArray<? extends NSDateComponents> recurrences();

    @Generated
    @Selector("triggerActivationState")
    @NUInt
    public native long triggerActivationState();

    @Generated
    @Selector("updateEndEvents:completionHandler:")
    public native void updateEndEventsCompletionHandler(NSArray<? extends HMEvent> endEvents,
            @ObjCBlock(name = "call_updateEndEventsCompletionHandler") Block_updateEndEventsCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateEndEventsCompletionHandler {
        @Generated
        void call_updateEndEventsCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("updateEvents:completionHandler:")
    public native void updateEventsCompletionHandler(NSArray<? extends HMEvent> events,
            @ObjCBlock(name = "call_updateEventsCompletionHandler") Block_updateEventsCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateEventsCompletionHandler {
        @Generated
        void call_updateEventsCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("updateExecuteOnce:completionHandler:")
    public native void updateExecuteOnceCompletionHandler(boolean executeOnce,
            @ObjCBlock(name = "call_updateExecuteOnceCompletionHandler") Block_updateExecuteOnceCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateExecuteOnceCompletionHandler {
        @Generated
        void call_updateExecuteOnceCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("updateRecurrences:completionHandler:")
    public native void updateRecurrencesCompletionHandler(NSArray<? extends NSDateComponents> recurrences,
            @ObjCBlock(name = "call_updateRecurrencesCompletionHandler") Block_updateRecurrencesCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateRecurrencesCompletionHandler {
        @Generated
        void call_updateRecurrencesCompletionHandler(NSError arg0);
    }
}
