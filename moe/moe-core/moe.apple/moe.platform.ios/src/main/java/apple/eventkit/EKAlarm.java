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
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * EKAlarm
 * 
 * The EKAlarm class provides an interface for accessing and manipulating calendar event alarms.
 * 
 * The EKAlarm class represents alarms on an event. An alarm can be relative (e.g. 15 mins before)
 * or absolute (specific time).
 * 
 * API-Since: 4.0
 */
@Generated
@Library("EventKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EKAlarm extends EKObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected EKAlarm(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * alarmWithAbsoluteDate:
     * 
     * Creates a new autoreleased alarm with an absolute trigger time.
     * 
     * @param date The date the alarm should fire.
     */
    @Generated
    @Selector("alarmWithAbsoluteDate:")
    public static native EKAlarm alarmWithAbsoluteDate(NSDate date);

    /**
     * alarmWithRelativeOffset:
     * 
     * Creates a new autoreleased alarm with a relative trigger time.
     * 
     * Creates a new autoreleased alarm with a relative trigger time. This offset
     * is added to the start date of the event.
     * 
     * @param offset The offset from the event start that the alarm should fire.
     */
    @Generated
    @Selector("alarmWithRelativeOffset:")
    public static native EKAlarm alarmWithRelativeOffset(double offset);

    @Generated
    @Owned
    @Selector("alloc")
    public static native EKAlarm alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native EKAlarm allocWithZone(VoidPtr zone);

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
    public static native EKAlarm new_objc();

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
     * [@property] absoluteDate
     * 
     * Represents an alarm that fires at a specific date.
     * 
     * Set this property to a date to establish an absolute alarm trigger. Setting this
     * clears any relative interval trigger.
     */
    @Generated
    @Selector("absoluteDate")
    public native NSDate absoluteDate();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("init")
    public native EKAlarm init();

    /**
     * [@property] proximity
     * 
     * Defines whether this alarm triggers via entering/exiting a geofence as defined by
     * structuredLocation.
     */
    @Generated
    @Selector("proximity")
    @NInt
    public native long proximity();

    /**
     * [@property] relativeOffset
     * 
     * Specifies a relative offset from an event start date to fire an alarm.
     * 
     * Set this property to an appropriate negative value to establish an alarm trigger
     * relative to the start date/time of an event. Setting this clears any existing
     * date trigger.
     */
    @Generated
    @Selector("relativeOffset")
    public native double relativeOffset();

    /**
     * [@property] absoluteDate
     * 
     * Represents an alarm that fires at a specific date.
     * 
     * Set this property to a date to establish an absolute alarm trigger. Setting this
     * clears any relative interval trigger.
     */
    @Generated
    @Selector("setAbsoluteDate:")
    public native void setAbsoluteDate(NSDate value);

    /**
     * [@property] proximity
     * 
     * Defines whether this alarm triggers via entering/exiting a geofence as defined by
     * structuredLocation.
     */
    @Generated
    @Selector("setProximity:")
    public native void setProximity(@NInt long value);

    /**
     * [@property] relativeOffset
     * 
     * Specifies a relative offset from an event start date to fire an alarm.
     * 
     * Set this property to an appropriate negative value to establish an alarm trigger
     * relative to the start date/time of an event. Setting this clears any existing
     * date trigger.
     */
    @Generated
    @Selector("setRelativeOffset:")
    public native void setRelativeOffset(double value);

    /**
     * [@property] structuredLocation
     * 
     * Allows you to set a structured location (a location with a potential geo-coordinate)
     * on an alarm. This is used in conjunction with proximity to do geofence-based
     * triggering of reminders.
     */
    @Generated
    @Selector("setStructuredLocation:")
    public native void setStructuredLocation(EKStructuredLocation value);

    /**
     * [@property] structuredLocation
     * 
     * Allows you to set a structured location (a location with a potential geo-coordinate)
     * on an alarm. This is used in conjunction with proximity to do geofence-based
     * triggering of reminders.
     */
    @Generated
    @Selector("structuredLocation")
    public native EKStructuredLocation structuredLocation();
}
