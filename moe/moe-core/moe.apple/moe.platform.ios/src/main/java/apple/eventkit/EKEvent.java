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

/**
 * EKEvent
 * <p>
 * The EKEvent class represents an occurrence of an event.
 */
@Generated
@Library("EventKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EKEvent extends EKCalendarItem {
    static {
        NatJ.register();
    }

    @Generated
    protected EKEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native EKEvent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native EKEvent allocWithZone(VoidPtr zone);

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

    /**
     * eventWithEventStore:
     * <p>
     * Creates a new autoreleased event object.
     */
    @Generated
    @Selector("eventWithEventStore:")
    public static native EKEvent eventWithEventStore(EKEventStore eventStore);

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
    public static native EKEvent new_objc();

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
     * [@property]   availability
     * <p>
     * The availability setting for this event.
     * <p>
     * The availability setting is used by CalDAV and Exchange servers to indicate
     * how the time should be treated for scheduling. If the calendar the event is
     * currently in does not support event availability, EKEventAvailabilityNotSupported
     * is returned.
     */
    @Generated
    @Selector("availability")
    @NInt
    public native long availability();

    /**
     * birthdayContactIdentifier
     * <p>
     * Specifies the contact identifier of the person this event was created for.
     * <p>
     * This property is only valid for events in the built-in Birthdays calendar. It specifies
     * the contact identifier (for use with the Contacts framework) of the person this event was
     * created for. For any other type of event, this property returns nil.
     */
    @Generated
    @Selector("birthdayContactIdentifier")
    public native String birthdayContactIdentifier();

    /**
     * [@property]   birthdayPersonID
     * <p>
     * Specifies the address book ID of the person this event was created for.
     * <p>
     * This property is only valid for events in the built-in Birthdays calendar. It specifies
     * the Address Book ID of the person this event was created for. For any other type of event,
     * this property returns -1.
     */
    @Generated
    @Deprecated
    @Selector("birthdayPersonID")
    @NInt
    public native long birthdayPersonID();

    /**
     * compareStartDateWithEvent
     * <p>
     * Comparison function you can pass to sort NSArrays of EKEvents by start date.
     */
    @Generated
    @Selector("compareStartDateWithEvent:")
    @NInt
    public native long compareStartDateWithEvent(EKEvent other);

    /**
     * [@property]   endDate
     * <p>
     * The end date for the event.
     * <p>
     * This will be nil for new events until you set it.
     */
    @Generated
    @Selector("endDate")
    public native NSDate endDate();

    /**
     * [@property]   eventIdentifier
     * <p>
     * A unique identifier for this event.
     * <p>
     * This identifier can be used to look the event up using [EKEventStore eventWithIdentifier:].
     * You can use this not only to simply fetch the event, but also to validate the event
     * has not been deleted out from under you when you get an external change notification
     * via the EKEventStore database changed notification. If eventWithIdentifier: returns nil,
     * the event was deleted.
     * <p>
     * Please note that if you change the calendar of an event, this ID will likely change. It is
     * currently also possible for the ID to change due to a sync operation. For example, if
     * a user moved an event on a different client to another calendar, we'd see it as a
     * completely new event here.
     * <p>
     * This may be nil for events that have not been saved.
     */
    @Generated
    @Selector("eventIdentifier")
    public native String eventIdentifier();

    @Generated
    @Selector("init")
    public native EKEvent init();

    /**
     * [@property]   allDay
     * <p>
     * Indicates this event is an 'all day' event.
     */
    @Generated
    @Selector("isAllDay")
    public native boolean isAllDay();

    /**
     * [@property]   allDay
     * <p>
     * Indicates this event is an 'all day' event.
     */
    @Generated
    @Selector("setAllDay:")
    public native void setAllDay(boolean value);

    /**
     * [@property]   isDetached
     * <p>
     * Represents whether this event is detached from a recurring series.
     * <p>
     * If this EKEvent is an instance of a repeating event, and an attribute of this
     * EKEvent has been changed from the default value generated by the repeating event,
     * isDetached will return YES. If the EKEvent is unchanged from its default state, or
     * is not a repeating event, isDetached returns NO.
     */
    @Generated
    @Selector("isDetached")
    public native boolean isDetached();

    /**
     * [@property]   occurrenceDate:
     * <p>
     * The occurrence date of an event if it is part of a recurring series.
     * <p>
     * This is only set if the event is part of a recurring series. It returns
     * the date on which this event was originally scheduled to occur. For occurrences
     * that are unmodified from the recurring series, this is the same as the start date.
     * This value will remain the same even if the event has been detached and its start
     * date has changed. Floating events (such as all-day events) are currently returned
     * in the default time zone. ([NSTimeZone defaultTimeZone])
     * <p>
     * This will be nil for new events until you set startDate.
     */
    @Generated
    @Selector("occurrenceDate")
    public native NSDate occurrenceDate();

    /**
     * [@property]   organizer
     * <p>
     * The organizer of this event, or nil.
     */
    @Generated
    @Selector("organizer")
    public native EKParticipant organizer();

    /**
     * refresh
     * <p>
     * Refreshes an event object to ensure it's still valid.
     * <p>
     * When the database changes, your application is sent an EKEventStoreChangedNotification
     * note. You should generally consider all EKEvent instances to be invalid as soon as
     * you receive the notification. However, for events you truly care to keep around, you
     * can call this method. It ensures the record is still valid by ensuring the event and
     * start date are still valid. It also attempts to refresh all properties except those
     * you might have modified. If this method returns NO, the record has been deleted or is
     * otherwise invalid. You should not continue to use it. If it returns YES, all is still
     * well, and the record is ready for continued use. You should only call this method on
     * events that are more critical to keep around if possible, such as an event that is
     * being actively edited, as this call is fairly heavyweight. Do not use it to refresh
     * the entire selected range of events you might have had selected. It is mostly pointless
     * anyway, as recurrence information may have changed.
     */
    @Generated
    @Selector("refresh")
    public native boolean refresh();

    /**
     * [@property]   availability
     * <p>
     * The availability setting for this event.
     * <p>
     * The availability setting is used by CalDAV and Exchange servers to indicate
     * how the time should be treated for scheduling. If the calendar the event is
     * currently in does not support event availability, EKEventAvailabilityNotSupported
     * is returned.
     */
    @Generated
    @Selector("setAvailability:")
    public native void setAvailability(@NInt long value);

    /**
     * [@property]   endDate
     * <p>
     * The end date for the event.
     * <p>
     * This will be nil for new events until you set it.
     */
    @Generated
    @Selector("setEndDate:")
    public native void setEndDate(NSDate value);

    /**
     * [@property]   startDate
     * <p>
     * The start date for the event.
     * <p>
     * This property represents the start date for this event. Floating events (such
     * as all-day events) are currently always returned in the default time zone.
     * ([NSTimeZone defaultTimeZone])
     * <p>
     * This will be nil for new events until you set it.
     */
    @Generated
    @Selector("setStartDate:")
    public native void setStartDate(NSDate value);

    /**
     * [@property]   structuredLocation
     * <p>
     * Allows you to set a structured location (a location with a potential geo-coordinate) on an
     * event. The getter for EKEvent’s location property just returns the structured location’s title.
     * The setter for EKEvent’s location property is equivalent to
     * [event setStructuredLocation:[EKStructuredLocation locationWithTitle:…]].
     */
    @Generated
    @Selector("setStructuredLocation:")
    public native void setStructuredLocation(EKStructuredLocation value);

    /**
     * [@property]   startDate
     * <p>
     * The start date for the event.
     * <p>
     * This property represents the start date for this event. Floating events (such
     * as all-day events) are currently always returned in the default time zone.
     * ([NSTimeZone defaultTimeZone])
     * <p>
     * This will be nil for new events until you set it.
     */
    @Generated
    @Selector("startDate")
    public native NSDate startDate();

    /**
     * [@property]   status
     * <p>
     * The status of the event.
     * <p>
     * While the status offers four different values in the EKEventStatus enumeration,
     * in practice, the only actionable and reliable status is canceled. Any other status
     * should be considered informational at best. You cannot set this property. If you
     * wish to cancel an event, you should simply remove it using removeEvent:.
     */
    @Generated
    @Selector("status")
    @NInt
    public native long status();

    /**
     * [@property]   structuredLocation
     * <p>
     * Allows you to set a structured location (a location with a potential geo-coordinate) on an
     * event. The getter for EKEvent’s location property just returns the structured location’s title.
     * The setter for EKEvent’s location property is equivalent to
     * [event setStructuredLocation:[EKStructuredLocation locationWithTitle:…]].
     */
    @Generated
    @Selector("structuredLocation")
    public native EKStructuredLocation structuredLocation();
}
