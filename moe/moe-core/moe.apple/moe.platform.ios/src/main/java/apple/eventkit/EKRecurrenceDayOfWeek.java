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
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * EKRecurrenceDayOfWeek
 * 
 * Class which represents a day of the week this recurrence will occur.
 * 
 * EKRecurrenceDayOfWeek specifies either a simple day of the week, or the nth instance
 * of a particular day of the week, such as the third Tuesday of every month. The week
 * number is only valid when used with monthly or yearly recurrences, since it would
 * be otherwise meaningless.
 * 
 * Valid values for dayOfTheWeek are integers 1-7, which correspond to days of the week
 * with Sunday = 1. Valid values for weekNumber portion are (+/-)1-53, where a negative
 * value indicates a value from the end of the range. For example, in a yearly event -1
 * means last week of the year. -1 in a Monthly recurrence indicates the last week of
 * the month.
 * 
 * The value 0 also indicates the weekNumber is irrelevant (every Sunday, etc.).
 * 
 * Day-of-week weekNumber values that are out of bounds for the recurrence type will
 * result in an exception when trying to initialize the recurrence. In particular,
 * weekNumber must be zero when passing EKRecurrenceDayOfWeek objects to initialize a weekly
 * recurrence.
 * 
 * API-Since: 4.0
 */
@Generated
@Library("EventKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EKRecurrenceDayOfWeek extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected EKRecurrenceDayOfWeek(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native EKRecurrenceDayOfWeek alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native EKRecurrenceDayOfWeek allocWithZone(VoidPtr zone);

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

    /**
     * dayOfWeek:
     * 
     * Creates an autoreleased object with a day of the week and week number of zero.
     */
    @Generated
    @Selector("dayOfWeek:")
    public static native EKRecurrenceDayOfWeek dayOfWeek(@NInt long dayOfTheWeek);

    /**
     * dayOfWeek:weekNumber:
     * 
     * Creates an autoreleased object with a specific day of week and week number.
     */
    @Generated
    @Selector("dayOfWeek:weekNumber:")
    public static native EKRecurrenceDayOfWeek dayOfWeekWeekNumber(@NInt long dayOfTheWeek, @NInt long weekNumber);

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
    public static native EKRecurrenceDayOfWeek new_objc();

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * [@property] dayOfTheWeek
     * 
     * The day of the week.
     */
    @Generated
    @Selector("dayOfTheWeek")
    @NInt
    public native long dayOfTheWeek();

    @Generated
    @Selector("init")
    public native EKRecurrenceDayOfWeek init();

    /**
     * initWithDayOfTheWeek:weekNumber:
     * 
     * Creates an day-of-week object with a specific day of week and week number.
     */
    @Generated
    @Selector("initWithDayOfTheWeek:weekNumber:")
    public native EKRecurrenceDayOfWeek initWithDayOfTheWeekWeekNumber(@NInt long dayOfTheWeek, @NInt long weekNumber);

    /**
     * [@property] weekNumber
     * 
     * The week number.
     */
    @Generated
    @Selector("weekNumber")
    @NInt
    public native long weekNumber();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithCoder:")
    public native EKRecurrenceDayOfWeek initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
