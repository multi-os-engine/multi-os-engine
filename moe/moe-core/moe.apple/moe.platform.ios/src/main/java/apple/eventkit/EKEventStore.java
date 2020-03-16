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

package apple.eventkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("EventKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EKEventStore extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected EKEventStore(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native EKEventStore alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("authorizationStatusForEntityType:")
    @NInt
    public static native long authorizationStatusForEntityType(@NUInt long entityType);

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
    @Selector("calendarItemWithIdentifier:")
    public native EKCalendarItem calendarItemWithIdentifier(String identifier);

    @Generated
    @Selector("calendarItemsWithExternalIdentifier:")
    public native NSArray<? extends EKCalendarItem> calendarItemsWithExternalIdentifier(String externalIdentifier);

    @Generated
    @Selector("calendarWithIdentifier:")
    public native EKCalendar calendarWithIdentifier(String identifier);

    @Generated
    @Deprecated
    @Selector("calendars")
    public native NSArray<? extends EKCalendar> calendars();

    @Generated
    @Selector("calendarsForEntityType:")
    public native NSArray<? extends EKCalendar> calendarsForEntityType(@NUInt long entityType);

    @Generated
    @Selector("cancelFetchRequest:")
    public native void cancelFetchRequest(@Mapped(ObjCObjectMapper.class) Object fetchIdentifier);

    @Generated
    @Selector("commit:")
    public native boolean commit(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("defaultCalendarForNewEvents")
    public native EKCalendar defaultCalendarForNewEvents();

    @Generated
    @Selector("defaultCalendarForNewReminders")
    public native EKCalendar defaultCalendarForNewReminders();

    @Generated
    @Selector("enumerateEventsMatchingPredicate:usingBlock:")
    public native void enumerateEventsMatchingPredicateUsingBlock(NSPredicate predicate,
            @ObjCBlock(name = "call_enumerateEventsMatchingPredicateUsingBlock") Block_enumerateEventsMatchingPredicateUsingBlock block);

    @Generated
    @Selector("eventStoreIdentifier")
    public native String eventStoreIdentifier();

    @Generated
    @Selector("eventWithIdentifier:")
    public native EKEvent eventWithIdentifier(String identifier);

    @Generated
    @Selector("eventsMatchingPredicate:")
    public native NSArray<? extends EKEvent> eventsMatchingPredicate(NSPredicate predicate);

    @Generated
    @Selector("fetchRemindersMatchingPredicate:completion:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object fetchRemindersMatchingPredicateCompletion(NSPredicate predicate,
            @ObjCBlock(name = "call_fetchRemindersMatchingPredicateCompletion") Block_fetchRemindersMatchingPredicateCompletion completion);

    @Generated
    @Selector("init")
    public native EKEventStore init();

    @Generated
    @Selector("predicateForCompletedRemindersWithCompletionDateStarting:ending:calendars:")
    public native NSPredicate predicateForCompletedRemindersWithCompletionDateStartingEndingCalendars(NSDate startDate,
            NSDate endDate, NSArray<? extends EKCalendar> calendars);

    @Generated
    @Selector("predicateForEventsWithStartDate:endDate:calendars:")
    public native NSPredicate predicateForEventsWithStartDateEndDateCalendars(NSDate startDate, NSDate endDate,
            NSArray<? extends EKCalendar> calendars);

    @Generated
    @Selector("predicateForIncompleteRemindersWithDueDateStarting:ending:calendars:")
    public native NSPredicate predicateForIncompleteRemindersWithDueDateStartingEndingCalendars(NSDate startDate,
            NSDate endDate, NSArray<? extends EKCalendar> calendars);

    @Generated
    @Selector("predicateForRemindersInCalendars:")
    public native NSPredicate predicateForRemindersInCalendars(NSArray<? extends EKCalendar> calendars);

    @Generated
    @Selector("refreshSourcesIfNecessary")
    public native void refreshSourcesIfNecessary();

    @Generated
    @Selector("removeCalendar:commit:error:")
    public native boolean removeCalendarCommitError(EKCalendar calendar, boolean commit,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("removeEvent:span:commit:error:")
    public native boolean removeEventSpanCommitError(EKEvent event, @NInt long span, boolean commit,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("removeEvent:span:error:")
    public native boolean removeEventSpanError(EKEvent event, @NInt long span,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("removeReminder:commit:error:")
    public native boolean removeReminderCommitError(EKReminder reminder, boolean commit,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("requestAccessToEntityType:completion:")
    public native void requestAccessToEntityTypeCompletion(@NUInt long entityType,
            @ObjCBlock(name = "call_requestAccessToEntityTypeCompletion") Block_requestAccessToEntityTypeCompletion completion);

    @Generated
    @Selector("reset")
    public native void reset();

    @Generated
    @Selector("saveCalendar:commit:error:")
    public native boolean saveCalendarCommitError(EKCalendar calendar, boolean commit,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("saveEvent:span:commit:error:")
    public native boolean saveEventSpanCommitError(EKEvent event, @NInt long span, boolean commit,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("saveEvent:span:error:")
    public native boolean saveEventSpanError(EKEvent event, @NInt long span,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("saveReminder:commit:error:")
    public native boolean saveReminderCommitError(EKReminder reminder, boolean commit,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("sourceWithIdentifier:")
    public native EKSource sourceWithIdentifier(String identifier);

    @Generated
    @Selector("sources")
    public native NSArray<? extends EKSource> sources();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateEventsMatchingPredicateUsingBlock {
        @Generated
        void call_enumerateEventsMatchingPredicateUsingBlock(EKEvent arg0, BoolPtr arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchRemindersMatchingPredicateCompletion {
        @Generated
        void call_fetchRemindersMatchingPredicateCompletion(NSArray<? extends EKReminder> arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAccessToEntityTypeCompletion {
        @Generated
        void call_requestAccessToEntityTypeCompletion(boolean arg0, NSError arg1);
    }

    @Generated
    @Selector("delegateSources")
    public native NSArray<? extends EKSource> delegateSources();
}
