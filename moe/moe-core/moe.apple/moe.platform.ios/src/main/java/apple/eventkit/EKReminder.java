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
import apple.foundation.NSDateComponents;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * EKReminder
 * 
 * The EKReminder class represents a reminder (task/todo).
 */
@Generated
@Library("EventKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EKReminder extends EKCalendarItem {
    static {
        NatJ.register();
    }

    @Generated
    protected EKReminder(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native EKReminder alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native EKReminder allocWithZone(VoidPtr zone);

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
    public static native EKReminder new_objc();

    /**
     * reminderWithEventStore:
     * 
     * Creates a new reminder in the given event store.
     */
    @NotNull
    @Generated
    @Selector("reminderWithEventStore:")
    public static native EKReminder reminderWithEventStore(@NotNull EKEventStore eventStore);

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
     * [@property] completionDate
     * 
     * The date on which this reminder was completed.
     */
    @Nullable
    @Generated
    @Selector("completionDate")
    public native NSDate completionDate();

    /**
     * [@property] dueDateComponents
     * 
     * The date by which this reminder should be completed.
     * 
     * The use of date components allows the due date and its time zone to be represented in a single property.
     * A nil time zone represents a floating date. Setting a date component without a hour, minute and second component
     * will set allDay to YES.
     * If you set this property, the calendar must be set to NSCalendarIdentifierGregorian. An exception is raised
     * otherwise.
     * 
     * On iOS, if you set the due date for a reminder, you must also set a start date, otherwise you will receive
     * an error (EKErrorNoStartDate) when attempting to save this reminder. This is not a requirement on OS X.
     */
    @Nullable
    @Generated
    @Selector("dueDateComponents")
    public native NSDateComponents dueDateComponents();

    @Generated
    @Selector("init")
    public native EKReminder init();

    /**
     * [@property] completed
     * 
     * Whether or not the reminder is completed.
     * 
     * Setting it to YES will set the completed date to the current date.
     * Setting it to NO will set the completed date to nil.
     */
    @Generated
    @Selector("isCompleted")
    public native boolean isCompleted();

    /**
     * [@property] completed
     * 
     * Whether or not the reminder is completed.
     * 
     * Setting it to YES will set the completed date to the current date.
     * Setting it to NO will set the completed date to nil.
     */
    @Generated
    @Selector("setCompleted:")
    public native void setCompleted(boolean value);

    /**
     * [@property] priority
     * 
     * The priority of the reminder.
     * 
     * Priorities run from 1 (highest) to 9 (lowest). A priority of 0 means no priority.
     * Saving a reminder with any other priority will fail.
     * Per RFC 5545, priorities of 1-4 are considered "high," a priority of 5 is "medium," and priorities of 6-9 are
     * "low."
     */
    @Generated
    @Selector("priority")
    @NUInt
    public native long priority();

    /**
     * [@property] completionDate
     * 
     * The date on which this reminder was completed.
     */
    @Generated
    @Selector("setCompletionDate:")
    public native void setCompletionDate(@Nullable NSDate value);

    /**
     * [@property] dueDateComponents
     * 
     * The date by which this reminder should be completed.
     * 
     * The use of date components allows the due date and its time zone to be represented in a single property.
     * A nil time zone represents a floating date. Setting a date component without a hour, minute and second component
     * will set allDay to YES.
     * If you set this property, the calendar must be set to NSCalendarIdentifierGregorian. An exception is raised
     * otherwise.
     * 
     * On iOS, if you set the due date for a reminder, you must also set a start date, otherwise you will receive
     * an error (EKErrorNoStartDate) when attempting to save this reminder. This is not a requirement on OS X.
     */
    @Generated
    @Selector("setDueDateComponents:")
    public native void setDueDateComponents(@Nullable NSDateComponents value);

    /**
     * [@property] priority
     * 
     * The priority of the reminder.
     * 
     * Priorities run from 1 (highest) to 9 (lowest). A priority of 0 means no priority.
     * Saving a reminder with any other priority will fail.
     * Per RFC 5545, priorities of 1-4 are considered "high," a priority of 5 is "medium," and priorities of 6-9 are
     * "low."
     */
    @Generated
    @Selector("setPriority:")
    public native void setPriority(@NUInt long value);

    /**
     * [@property] startDateComponents
     * 
     * The start date of the task, as date components.
     * 
     * The use of date components allows the start date and its time zone to be represented in a single property.
     * A nil time zone represents a floating date. Setting a date component without a hour, minute and second component
     * will set allDay to YES.
     * If you set this property, the calendar must be set to NSCalendarIdentifierGregorian. An exception is raised
     * otherwise.
     */
    @Generated
    @Selector("setStartDateComponents:")
    public native void setStartDateComponents(@Nullable NSDateComponents value);

    /**
     * [@property] startDateComponents
     * 
     * The start date of the task, as date components.
     * 
     * The use of date components allows the start date and its time zone to be represented in a single property.
     * A nil time zone represents a floating date. Setting a date component without a hour, minute and second component
     * will set allDay to YES.
     * If you set this property, the calendar must be set to NSCalendarIdentifierGregorian. An exception is raised
     * otherwise.
     */
    @Nullable
    @Generated
    @Selector("startDateComponents")
    public native NSDateComponents startDateComponents();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
