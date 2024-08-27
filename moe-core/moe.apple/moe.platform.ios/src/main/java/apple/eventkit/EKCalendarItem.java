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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSTimeZone;
import apple.foundation.NSURL;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native EKCalendarItem alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native EKCalendarItem allocWithZone(VoidPtr zone);

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
    public static native EKCalendarItem new_objc();

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
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * [@property] UUID
     * 
     * This is now deprecated; use calendarItemIdentifier instead.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 6.0
     */
    @NotNull
    @Generated
    @Deprecated
    @Selector("UUID")
    public native String UUID();

    /**
     * addAlarm:
     * 
     * Adds an alarm to this item.
     * 
     * This method add an alarm to an item. Be warned that some calendars can only
     * allow a certain maximum number of alarms. When this item is saved, it will
     * truncate any extra alarms from the array.
     */
    @Generated
    @Selector("addAlarm:")
    public native void addAlarm(@NotNull EKAlarm alarm);

    @Generated
    @Selector("addRecurrenceRule:")
    public native void addRecurrenceRule(@NotNull EKRecurrenceRule rule);

    /**
     * An array of EKAlarm objects
     */
    @Nullable
    @Generated
    @Selector("alarms")
    public native NSArray<? extends EKAlarm> alarms();

    /**
     * An array of EKParticipant objects
     */
    @Nullable
    @Generated
    @Selector("attendees")
    public native NSArray<? extends EKParticipant> attendees();

    /**
     * [@property] calendar
     * 
     * The calendar that this calendar item belongs to.
     * 
     * This will be nil for new calendar items until you set it.
     */
    @Generated
    @Selector("calendar")
    public native EKCalendar calendar();

    /**
     * [@property] calendarItemExternalIdentifier
     * 
     * A server-provided identifier for this calendar item
     * 
     * This identifier, provided by the server, allows you to reference the same event or reminder across
     * multiple devices. For calendars stored locally on the device, including the birthday calendar,
     * it simply passes through to calendarItemIdentifier.
     * 
     * This identifier is unique as of creation for every calendar item. However, there are some
     * cases where duplicate copies of a calendar item can exist in the same database, including:
     * - A calendar item was imported from an ICS file into multiple calendars
     * - An event was created in a calendar shared with the user and the user was also invited to the event
     * - The user is a delegate of a calendar that also has this event
     * - A subscribed calendar was added to multiple accounts
     * In such cases, you should choose between calendar items based on other factors, such as
     * the calendar or source.
     * 
     * This identifier is the same for all occurrences of a recurring event. If you wish to differentiate
     * between occurrences, you may want to use the start date.
     * 
     * This may be nil for new calendar items that do not yet belong to a calendar.
     * 
     * In addition, there are two caveats for Exchange-based calendars:
     * - This identifier will be different between EventKit on iOS versus OS X
     * - This identifier will be different between devices for EKReminders
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("calendarItemExternalIdentifier")
    public native String calendarItemExternalIdentifier();

    /**
     * [@property] calendarItemIdentifier
     * 
     * A unique identifier for a calendar item.
     * 
     * Item identifiers are not sync-proof in that a full sync will lose
     * this identifier, so you should always have a back up plan for dealing
     * with a reminder that is no longer fetchable by this property, e.g. by title, etc.
     * Use [EKEventStore calendarItemWithIdentifier:] to look up the item by this value.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("calendarItemIdentifier")
    public native String calendarItemIdentifier();

    /**
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("creationDate")
    public native NSDate creationDate();

    /**
     * These exist to do simple checks for the presence of data without
     * loading said data. While at present only hasRecurrenceRules has a
     * fast path, it is a good idea to use these if you only need to know
     * the data exists anyway since at some point they will all be a
     * simple check.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("hasAlarms")
    public native boolean hasAlarms();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("hasAttendees")
    public native boolean hasAttendees();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("hasNotes")
    public native boolean hasNotes();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("hasRecurrenceRules")
    public native boolean hasRecurrenceRules();

    @Generated
    @Selector("init")
    public native EKCalendarItem init();

    @Nullable
    @Generated
    @Selector("lastModifiedDate")
    public native NSDate lastModifiedDate();

    @Nullable
    @Generated
    @Selector("location")
    public native String location();

    @Nullable
    @Generated
    @Selector("notes")
    public native String notes();

    /**
     * [@property] recurrenceRules
     * 
     * An array of EKRecurrenceRules, or nil if none.
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("recurrenceRules")
    public native NSArray<? extends EKRecurrenceRule> recurrenceRules();

    /**
     * removeAlarm:
     * 
     * Removes an alarm from this item.
     */
    @Generated
    @Selector("removeAlarm:")
    public native void removeAlarm(@NotNull EKAlarm alarm);

    @Generated
    @Selector("removeRecurrenceRule:")
    public native void removeRecurrenceRule(@NotNull EKRecurrenceRule rule);

    /**
     * An array of EKAlarm objects
     */
    @Generated
    @Selector("setAlarms:")
    public native void setAlarms(@Nullable NSArray<? extends EKAlarm> value);

    /**
     * [@property] calendar
     * 
     * The calendar that this calendar item belongs to.
     * 
     * This will be nil for new calendar items until you set it.
     */
    @Generated
    @Selector("setCalendar:")
    public native void setCalendar(EKCalendar value);

    @Generated
    @Selector("setLocation:")
    public native void setLocation(@Nullable String value);

    @Generated
    @Selector("setNotes:")
    public native void setNotes(@Nullable String value);

    /**
     * [@property] recurrenceRules
     * 
     * An array of EKRecurrenceRules, or nil if none.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setRecurrenceRules:")
    public native void setRecurrenceRules(@Nullable NSArray<? extends EKRecurrenceRule> value);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("setTimeZone:")
    public native void setTimeZone(@Nullable NSTimeZone value);

    /**
     * [@property] title
     * 
     * The title of this calendar item.
     * 
     * This will be an empty string for new calendar items until you set it.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("setURL:")
    public native void setURL(@Nullable NSURL value);

    /**
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("timeZone")
    public native NSTimeZone timeZone();

    /**
     * [@property] title
     * 
     * The title of this calendar item.
     * 
     * This will be an empty string for new calendar items until you set it.
     */
    @Generated
    @Selector("title")
    public native String title();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
