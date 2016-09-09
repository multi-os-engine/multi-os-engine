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
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSArray;
import ios.foundation.NSDate;
import ios.foundation.NSTimeZone;
import ios.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("EventKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EKCalendarItem extends EKObject {
	static {
		NatJ.register();
	}

	@Generated
	protected EKCalendarItem(Pointer peer) {
		super(peer);
	}

	/**
	 * URL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/URL">iOS Dev Center</a>
	 */
	@Generated
	@Selector("URL")
	public native NSURL URL();

	/**
	 * UUID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/UUID">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("UUID")
	public native String UUID();

	/**
	 * addAlarm:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instm/EKCalendarItem/addAlarm:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addAlarm:")
	public native void addAlarm(EKAlarm alarm);

	/**
	 * addRecurrenceRule:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instm/EKCalendarItem/addRecurrenceRule:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addRecurrenceRule:")
	public native void addRecurrenceRule(EKRecurrenceRule rule);

	/**
	 * alarms</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/alarms">iOS Dev Center</a>
	 */
	@Generated
	@Selector("alarms")
	public native NSArray<? extends EKAlarm> alarms();

	@Generated
	@Owned
	@Selector("alloc")
	public static native EKCalendarItem alloc();

	/**
	 * attendees</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/attendees">iOS Dev Center</a>
	 */
	@Generated
	@Selector("attendees")
	public native NSArray<? extends EKParticipant> attendees();

	/**
	 * calendar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/calendar">iOS Dev Center</a>
	 */
	@Generated
	@Selector("calendar")
	public native EKCalendar calendar();

	/**
	 * calendarItemExternalIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/calendarItemExternalIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("calendarItemExternalIdentifier")
	public native String calendarItemExternalIdentifier();

	/**
	 * calendarItemIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/calendarItemIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("calendarItemIdentifier")
	public native String calendarItemIdentifier();

	/**
	 * creationDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/creationDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("creationDate")
	public native NSDate creationDate();

	/**
	 * hasAlarms</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/hasAlarms">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hasAlarms")
	public native boolean hasAlarms();

	/**
	 * hasAttendees</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/hasAttendees">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hasAttendees")
	public native boolean hasAttendees();

	/**
	 * hasNotes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/hasNotes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hasNotes")
	public native boolean hasNotes();

	/**
	 * hasRecurrenceRules</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/hasRecurrenceRules">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hasRecurrenceRules")
	public native boolean hasRecurrenceRules();

	@Generated
	@Selector("init")
	public native EKCalendarItem init();

	/**
	 * lastModifiedDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/lastModifiedDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lastModifiedDate")
	public native NSDate lastModifiedDate();

	/**
	 * location</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/location">iOS Dev Center</a>
	 */
	@Generated
	@Selector("location")
	public native String location();

	/**
	 * notes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/notes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("notes")
	public native String notes();

	/**
	 * recurrenceRules</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/recurrenceRules">iOS Dev Center</a>
	 */
	@Generated
	@Selector("recurrenceRules")
	public native NSArray<? extends EKRecurrenceRule> recurrenceRules();

	/**
	 * removeAlarm:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instm/EKCalendarItem/removeAlarm:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeAlarm:")
	public native void removeAlarm(EKAlarm alarm);

	/**
	 * removeRecurrenceRule:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instm/EKCalendarItem/removeRecurrenceRule:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeRecurrenceRule:")
	public native void removeRecurrenceRule(EKRecurrenceRule rule);

	/**
	 * alarms</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/alarms">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAlarms:")
	public native void setAlarms(NSArray<? extends EKAlarm> value);

	/**
	 * calendar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/calendar">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCalendar:")
	public native void setCalendar(EKCalendar value);

	/**
	 * location</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/location">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLocation:")
	public native void setLocation(String value);

	/**
	 * notes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/notes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setNotes:")
	public native void setNotes(String value);

	/**
	 * recurrenceRules</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/recurrenceRules">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRecurrenceRules:")
	public native void setRecurrenceRules(NSArray<? extends EKRecurrenceRule> value);

	/**
	 * timeZone</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/timeZone">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTimeZone:")
	public native void setTimeZone(NSTimeZone value);

	/**
	 * title</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/title">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTitle:")
	public native void setTitle(String value);

	/**
	 * URL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/URL">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setURL:")
	public native void setURL(NSURL value);

	/**
	 * timeZone</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/timeZone">iOS Dev Center</a>
	 */
	@Generated
	@Selector("timeZone")
	public native NSTimeZone timeZone();

	/**
	 * title</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKCalendarItemClassRef/index.html#//apple_ref/occ/instp/EKCalendarItem/title">iOS Dev Center</a>
	 */
	@Generated
	@Selector("title")
	public native String title();

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
