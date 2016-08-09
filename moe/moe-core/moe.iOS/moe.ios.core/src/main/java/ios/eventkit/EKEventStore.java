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

package ios.eventkit;


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
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSDate;
import ios.foundation.NSError;
import ios.foundation.NSPredicate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

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
	@Owned
	@Selector("alloc")
	public static native EKEventStore alloc();

	/**
	 * authorizationStatusForEntityType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/clm/EKEventStore/authorizationStatusForEntityType:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("authorizationStatusForEntityType:")
	@NInt
	public static native long authorizationStatusForEntityType(
			@NUInt long entityType);

	/**
	 * calendarItemWithIdentifier:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/calendarItemWithIdentifier:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("calendarItemWithIdentifier:")
	public native EKCalendarItem calendarItemWithIdentifier(String identifier);

	/**
	 * calendarItemsWithExternalIdentifier:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/calendarItemsWithExternalIdentifier:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("calendarItemsWithExternalIdentifier:")
	public native NSArray<? extends EKCalendarItem> calendarItemsWithExternalIdentifier(
			String externalIdentifier);

	/**
	 * calendarWithIdentifier:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/calendarWithIdentifier:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("calendarWithIdentifier:")
	public native EKCalendar calendarWithIdentifier(String identifier);

	/**
	 * calendars</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instp/EKEventStore/calendars">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("calendars")
	public native NSArray<? extends EKCalendar> calendars();

	/**
	 * calendarsForEntityType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/calendarsForEntityType:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("calendarsForEntityType:")
	public native NSArray<? extends EKCalendar> calendarsForEntityType(@NUInt long entityType);

	/**
	 * cancelFetchRequest:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/cancelFetchRequest:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cancelFetchRequest:")
	public native void cancelFetchRequest(
			@Mapped(ObjCObjectMapper.class) Object fetchIdentifier);

	/**
	 * commit:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/commit:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("commit:")
	public native boolean commit(Ptr<NSError> error);

	/**
	 * defaultCalendarForNewEvents</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instp/EKEventStore/defaultCalendarForNewEvents">iOS Dev Center</a>
	 */
	@Generated
	@Selector("defaultCalendarForNewEvents")
	public native EKCalendar defaultCalendarForNewEvents();

	/**
	 * defaultCalendarForNewReminders</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/defaultCalendarForNewReminders">iOS Dev Center</a>
	 */
	@Generated
	@Selector("defaultCalendarForNewReminders")
	public native EKCalendar defaultCalendarForNewReminders();

	/**
	 * enumerateEventsMatchingPredicate:usingBlock:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/enumerateEventsMatchingPredicate:usingBlock:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("enumerateEventsMatchingPredicate:usingBlock:")
	public native void enumerateEventsMatchingPredicateUsingBlock(
			NSPredicate predicate,
			@ObjCBlock(name = "call_enumerateEventsMatchingPredicateUsingBlock") Block_enumerateEventsMatchingPredicateUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_enumerateEventsMatchingPredicateUsingBlock {
		@Generated
		void call_enumerateEventsMatchingPredicateUsingBlock(
				EKEvent arg0, BoolPtr arg1);
	}

	/**
	 * eventStoreIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instp/EKEventStore/eventStoreIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("eventStoreIdentifier")
	public native String eventStoreIdentifier();

	/**
	 * eventWithIdentifier:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/eventWithIdentifier:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("eventWithIdentifier:")
	public native EKEvent eventWithIdentifier(String identifier);

	/**
	 * eventsMatchingPredicate:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/eventsMatchingPredicate:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("eventsMatchingPredicate:")
	public native NSArray<? extends EKEvent> eventsMatchingPredicate(NSPredicate predicate);

	/**
	 * fetchRemindersMatchingPredicate:completion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/fetchRemindersMatchingPredicate:completion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchRemindersMatchingPredicate:completion:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object fetchRemindersMatchingPredicateCompletion(
			NSPredicate predicate,
			@ObjCBlock(name = "call_fetchRemindersMatchingPredicateCompletion") Block_fetchRemindersMatchingPredicateCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_fetchRemindersMatchingPredicateCompletion {
		@Generated
		void call_fetchRemindersMatchingPredicateCompletion(NSArray<? extends EKReminder> arg0);
	}

	@Generated
	@Selector("init")
	public native EKEventStore init();

	/**
	 * predicateForCompletedRemindersWithCompletionDateStarting:ending:calendars:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/predicateForCompletedRemindersWithCompletionDateStarting:ending:calendars:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("predicateForCompletedRemindersWithCompletionDateStarting:ending:calendars:")
	public native NSPredicate predicateForCompletedRemindersWithCompletionDateStartingEndingCalendars(
			NSDate startDate, NSDate endDate, NSArray<? extends EKCalendar> calendars);

	/**
	 * predicateForEventsWithStartDate:endDate:calendars:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/predicateForEventsWithStartDate:endDate:calendars:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("predicateForEventsWithStartDate:endDate:calendars:")
	public native NSPredicate predicateForEventsWithStartDateEndDateCalendars(
			NSDate startDate, NSDate endDate, NSArray<? extends EKCalendar> calendars);

	/**
	 * predicateForIncompleteRemindersWithDueDateStarting:ending:calendars:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/predicateForIncompleteRemindersWithDueDateStarting:ending:calendars:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("predicateForIncompleteRemindersWithDueDateStarting:ending:calendars:")
	public native NSPredicate predicateForIncompleteRemindersWithDueDateStartingEndingCalendars(
			NSDate startDate, NSDate endDate, NSArray<? extends EKCalendar> calendars);

	/**
	 * predicateForRemindersInCalendars:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/predicateForRemindersInCalendars:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("predicateForRemindersInCalendars:")
	public native NSPredicate predicateForRemindersInCalendars(NSArray<? extends EKCalendar> calendars);

	/**
	 * refreshSourcesIfNecessary</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/refreshSourcesIfNecessary">iOS Dev Center</a>
	 */
	@Generated
	@Selector("refreshSourcesIfNecessary")
	public native void refreshSourcesIfNecessary();

	/**
	 * removeCalendar:commit:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/removeCalendar:commit:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeCalendar:commit:error:")
	public native boolean removeCalendarCommitError(EKCalendar calendar,
			boolean commit, Ptr<NSError> error);

	/**
	 * removeEvent:span:commit:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/removeEvent:span:commit:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeEvent:span:commit:error:")
	public native boolean removeEventSpanCommitError(EKEvent event, @NInt long span,
			boolean commit, Ptr<NSError> error);

	/**
	 * removeEvent:span:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/removeEvent:span:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeEvent:span:error:")
	public native boolean removeEventSpanError(EKEvent event, @NInt long span,
			Ptr<NSError> error);

	/**
	 * removeReminder:commit:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/removeReminder:commit:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeReminder:commit:error:")
	public native boolean removeReminderCommitError(EKReminder reminder,
			boolean commit, Ptr<NSError> error);

	/**
	 * requestAccessToEntityType:completion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/requestAccessToEntityType:completion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("requestAccessToEntityType:completion:")
	public native void requestAccessToEntityTypeCompletion(
			@NUInt long entityType,
			@ObjCBlock(name = "call_requestAccessToEntityTypeCompletion") Block_requestAccessToEntityTypeCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_requestAccessToEntityTypeCompletion {
		@Generated
		void call_requestAccessToEntityTypeCompletion(boolean arg0,
				NSError arg1);
	}

	/**
	 * reset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/reset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("reset")
	public native void reset();

	/**
	 * saveCalendar:commit:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/saveCalendar:commit:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("saveCalendar:commit:error:")
	public native boolean saveCalendarCommitError(EKCalendar calendar,
			boolean commit, Ptr<NSError> error);

	/**
	 * saveEvent:span:commit:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/saveEvent:span:commit:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("saveEvent:span:commit:error:")
	public native boolean saveEventSpanCommitError(EKEvent event, @NInt long span,
			boolean commit, Ptr<NSError> error);

	/**
	 * saveEvent:span:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/saveEvent:span:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("saveEvent:span:error:")
	public native boolean saveEventSpanError(EKEvent event, @NInt long span,
			Ptr<NSError> error);

	/**
	 * saveReminder:commit:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/saveReminder:commit:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("saveReminder:commit:error:")
	public native boolean saveReminderCommitError(EKReminder reminder,
			boolean commit, Ptr<NSError> error);

	/**
	 * sourceWithIdentifier:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventStoreClassRef/index.html#//apple_ref/occ/instm/EKEventStore/sourceWithIdentifier:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sourceWithIdentifier:")
	public native EKSource sourceWithIdentifier(String identifier);

	@Generated
	@Selector("sources")
	public native NSArray<? extends EKSource> sources();

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	@Selector("initialize")
	public static native void initialize();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

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
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
