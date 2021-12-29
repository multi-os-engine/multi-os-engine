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
import apple.coregraphics.opaque.CGColorRef;
import apple.foundation.NSArray;
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
 * EKCalendar
 * <p>
 * The EKCalendar class represents a calendar for events.
 */
@Generated
@Library("EventKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EKCalendar extends EKObject {
    static {
        NatJ.register();
    }

    @Generated
    protected EKCalendar(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native EKCalendar alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native EKCalendar allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * calendarForEntityType:
     * <p>
     * Creates a new autoreleased calendar that may contain the given entity type.
     * <p>
     * You can only create calendars that accept either reminders or events via our API.
     * However, other servers might allow mixing the two (though it is not common).
     *
     * @param entityType The entity type that this calendar may support.
     * @param eventStore The event store in which to create this calendar.
     */
    @Generated
    @Selector("calendarForEntityType:eventStore:")
    public static native EKCalendar calendarForEntityTypeEventStore(@NUInt long entityType, EKEventStore eventStore);

    /**
     * Create a new calendar in the specified event store. You should use calendarForEntityType in iOS 6 or later.
     */
    @Generated
    @Deprecated
    @Selector("calendarWithEventStore:")
    public static native EKCalendar calendarWithEventStore(EKEventStore eventStore);

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
    public static native EKCalendar new_objc();

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
     * [@property]   color
     * <p>
     * Returns the calendar color as a CGColorRef.
     * <p>
     * This will be nil for new calendars until you set it.
     */
    @Generated
    @Selector("CGColor")
    public native CGColorRef CGColor();

    /**
     * [@property]   allowedEntityTypes
     * <p>
     * Returns the entity types this calendar can contain. While our API only allows creation
     * of single-entity calendars, other servers might allow mixed-entity calendars.
     */
    @Generated
    @Selector("allowedEntityTypes")
    @NUInt
    public native long allowedEntityTypes();

    /**
     * [@property]   allowsContentModifications
     * <p>
     * Represents whether you can this add, remove, or modify items in this calendar.
     */
    @Generated
    @Selector("allowsContentModifications")
    public native boolean allowsContentModifications();

    /**
     * [@property]   calendarIdentifier
     * <p>
     * A unique identifier for the calendar. It is not sync-proof in that a full
     * sync will lose this identifier, so you should always have a back up plan for dealing
     * with a calendar that is no longer fetchable by this property, e.g. by title, type, color, etc.
     * Use [EKEventStore calendarWithIdentifier:] to look up the calendar by this value.
     */
    @Generated
    @Selector("calendarIdentifier")
    public native String calendarIdentifier();

    @Generated
    @Selector("init")
    public native EKCalendar init();

    /**
     * [@property]   immutable
     * <p>
     * If this is set to YES, it means you cannot modify any attributes of
     * the calendar or delete it. It does NOT imply that you cannot add events
     * or reminders to the calendar.
     */
    @Generated
    @Selector("isImmutable")
    public native boolean isImmutable();

    /**
     * [@property]   subscribed
     * <p>
     * YES if this calendar is a subscribed calendar.
     */
    @Generated
    @Selector("isSubscribed")
    public native boolean isSubscribed();

    /**
     * [@property]   color
     * <p>
     * Returns the calendar color as a CGColorRef.
     * <p>
     * This will be nil for new calendars until you set it.
     */
    @Generated
    @Selector("setCGColor:")
    public native void setCGColor(CGColorRef value);

    /**
     * [@property]   source
     * <p>
     * The source representing the 'account' this calendar belongs to.
     * This is only settable when initially creating a calendar and then
     * effectively read-only after that. That is, you can create a calendar,
     * but you cannot move it to another source.
     * <p>
     * This will be nil for new calendars until you set it.
     */
    @Generated
    @Selector("setSource:")
    public native void setSource(EKSource value);

    /**
     * [@property]   title
     * <p>
     * The title of the calendar.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    /**
     * [@property]   source
     * <p>
     * The source representing the 'account' this calendar belongs to.
     * This is only settable when initially creating a calendar and then
     * effectively read-only after that. That is, you can create a calendar,
     * but you cannot move it to another source.
     * <p>
     * This will be nil for new calendars until you set it.
     */
    @Generated
    @Selector("source")
    public native EKSource source();

    /**
     * [@property]   supportedEventAvailabilities
     * <p>
     * Returns a bitfield of supported event availabilities, or EKCalendarEventAvailabilityNone
     * if this calendar does not support setting availability on an event.
     */
    @Generated
    @Selector("supportedEventAvailabilities")
    @NUInt
    public native long supportedEventAvailabilities();

    /**
     * [@property]   title
     * <p>
     * The title of the calendar.
     */
    @Generated
    @Selector("title")
    public native String title();

    /**
     * [@property]   type
     * <p>
     * The type of the calendar as a EKCalendarType. This is actually based on
     * what source the calendar is in, as well as whether it is a subscribed calendar.
     * <p>
     * CalDAV subscribed calendars have type EKCalendarTypeCalDAV with isSubscribed = YES.
     */
    @Generated
    @Selector("type")
    @NInt
    public native long type();
}
