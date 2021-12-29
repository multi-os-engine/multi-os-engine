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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
 * EKRecurrenceRule
 * <p>
 * Represents how an event repeats.
 * <p>
 * This class describes the recurrence pattern for a repeating event. The recurrence rules that
 * can be expressed are not restricted to the recurrence patterns that can be set in Calendar's UI.
 * <p>
 * It is currently not possible to directly modify a EKRecurrenceRule or any of its properties.
 * This functionality is achieved by creating a new EKRecurrenceRule, and setting an event to use the new rule.
 * When a new recurrence rule is set on an EKEvent, that change is not saved until the client
 * has passed the modified event to EKEventStore's saveEvent: method.
 */
@Generated
@Library("EventKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EKRecurrenceRule extends EKObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected EKRecurrenceRule(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native EKRecurrenceRule alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native EKRecurrenceRule allocWithZone(VoidPtr zone);

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
    public static native EKRecurrenceRule new_objc();

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
     * [@property]       calendarIdentifier;
     * <p>
     * Calendar used by this recurrence rule.
     */
    @Generated
    @Selector("calendarIdentifier")
    public native String calendarIdentifier();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * [@property]       daysOfTheMonth
     * <p>
     * This property is valid for rules whose EKRecurrenceFrequency is EKRecurrenceFrequencyMonthly, and that were initialized
     * with one or more specific days of the month (not with a day of the week and week of the month). This property can be
     * accessed as an array containing one or more NSNumbers corresponding to the days of the month the event recurs.
     * For all other EKRecurrenceRules, this property is nil. This property corresponds to BYMONTHDAY in the iCalendar
     * specification.
     */
    @Generated
    @Selector("daysOfTheMonth")
    public native NSArray<? extends NSNumber> daysOfTheMonth();

    /**
     * [@property]       daysOfTheWeek
     * <p>
     * This property is valid for rules whose EKRecurrenceFrequency is EKRecurrenceFrequencyWeekly, EKRecurrenceFrequencyMonthly, or
     * EKRecurrenceFrequencyYearly. This property can be accessed as an array containing one or more EKRecurrenceDayOfWeek objects
     * corresponding to the days of the week the event recurs. For all other EKRecurrenceRules, this property is nil.
     * This property corresponds to BYDAY in the iCalendar specification.
     */
    @Generated
    @Selector("daysOfTheWeek")
    public native NSArray<? extends EKRecurrenceDayOfWeek> daysOfTheWeek();

    /**
     * [@property]       daysOfTheYear
     * <p>
     * This property is valid for rules whose EKRecurrenceFrequency is EKRecurrenceFrequencyYearly. This property can be accessed
     * as an array containing one or more NSNumbers corresponding to the days of the year the event recurs. For all other
     * EKRecurrenceRules, this property is nil. This property corresponds to BYYEARDAY in the iCalendar specification. It should
     * contain values between 1 to 366 or -366 to -1.
     */
    @Generated
    @Selector("daysOfTheYear")
    public native NSArray<? extends NSNumber> daysOfTheYear();

    /**
     * [@property]       firstDayOfTheWeek
     * <p>
     * Recurrence patterns can specify which day of the week should be treated as the first day. Possible values for this
     * property are integers 0 and 1-7, which correspond to days of the week with Sunday = 1. Zero indicates that the
     * property is not set for this recurrence. The first day of the week only affects the way the recurrence is expanded
     * for weekly recurrence patterns with an interval greater than 1. For those types of recurrence patterns, the
     * Calendar framework will set firstDayOfTheWeek to be 2 (Monday). In all other cases, this property will be set
     * to zero. The iCalendar spec stipulates that the default value is Monday if this property is not set.
     */
    @Generated
    @Selector("firstDayOfTheWeek")
    @NInt
    public native long firstDayOfTheWeek();

    /**
     * [@property]       frequency
     * <p>
     * This property designates the unit of time used to describe the recurrence pattern.
     */
    @Generated
    @Selector("frequency")
    @NInt
    public native long frequency();

    @Generated
    @Selector("init")
    public native EKRecurrenceRule init();

    /**
     * initRecurrenceWithFrequency:interval:daysOfTheWeek:daysOfTheMonth:monthsOfTheYear:weeksOfTheYear:daysOfTheYear:setPositions:end:
     * <p>
     * The designated initializer.
     * <p>
     * This can be used to build any kind of recurrence rule. But be aware that certain combinations make
     * no sense and will be ignored. For example, if you pass daysOfTheWeek for a daily recurrence, they
     * will be ignored.
     *
     * @param type            The type of recurrence
     * @param interval        The interval. Passing zero will raise an exception.
     * @param daysOfTheWeek   An array of EKRecurrenceDayOfWeek objects. Valid for all recurrence types except daily. Ignored otherwise.
     *                        Corresponds to the BYDAY value in the iCalendar specification.
     * @param daysOfTheMonth  An array of NSNumbers ([+/-] 1 to 31). Negative numbers infer counting from the end of the month.
     *                        For example, -1 means the last day of the month. Valid only for monthly recurrences. Ignored otherwise.
     *                        Corresponds to the BYMONTHDAY value in the iCalendar specification.
     * @param monthsOfTheYear An array of NSNumbers (1 to 12). Valid only for yearly recurrences. Ignored otherwise. Corresponds to
     *                        the BYMONTH value in the iCalendar specification.
     * @param weeksOfTheYear  An array of NSNumbers ([+/1] 1 to 53). Negative numbers infer counting from the end of the year.
     *                        For example, -1 means the last week of the year. Valid only for yearly recurrences. Ignored otherwise.
     *                        Corresponds to the BYWEEKNO value in the iCalendar specification.
     * @param daysOfTheYear   An array of NSNumbers ([+/1] 1 to 366). Negative numbers infer counting from the end of the year.
     *                        For example, -1 means the last day of the year. Valid only for yearly recurrences. Ignored otherwise.
     *                        Corresponds to the BYYEARDAY value in the iCalendar specification.
     * @param setPositions    An array of NSNumbers ([+/1] 1 to 366). Used at the end of recurrence computation to filter the list
     *                        to the positions specified. Negative numbers indicate starting at the end, i.e. -1 indicates taking the
     *                        last result of the set. Valid when daysOfTheWeek, daysOfTheMonth, monthsOfTheYear, weeksOfTheYear, or
     *                        daysOfTheYear is passed. Ignored otherwise. Corresponds to the BYSETPOS value in the iCalendar specification.
     * @param end             The recurrence end, or nil.
     */
    @Generated
    @Selector("initRecurrenceWithFrequency:interval:daysOfTheWeek:daysOfTheMonth:monthsOfTheYear:weeksOfTheYear:daysOfTheYear:setPositions:end:")
    public native EKRecurrenceRule initRecurrenceWithFrequencyIntervalDaysOfTheWeekDaysOfTheMonthMonthsOfTheYearWeeksOfTheYearDaysOfTheYearSetPositionsEnd(
            @NInt long type, @NInt long interval, NSArray<? extends EKRecurrenceDayOfWeek> days,
            NSArray<? extends NSNumber> monthDays, NSArray<? extends NSNumber> months,
            NSArray<? extends NSNumber> weeksOfTheYear, NSArray<? extends NSNumber> daysOfTheYear,
            NSArray<? extends NSNumber> setPositions, EKRecurrenceEnd end);

    /**
     * initRecurrenceWithFrequency:interval:end:
     * <p>
     * Simple initializer to create a recurrence.
     * <p>
     * This is used to create a simple recurrence with a specific type, interval and end. If interval is
     * 0, an exception is raised. The end parameter can be nil.
     */
    @Generated
    @Selector("initRecurrenceWithFrequency:interval:end:")
    public native EKRecurrenceRule initRecurrenceWithFrequencyIntervalEnd(@NInt long type, @NInt long interval,
            EKRecurrenceEnd end);

    /**
     * [@property]       interval
     * <p>
     * The interval of a EKRecurrenceRule is an integer value which specifies how often the recurrence rule repeats
     * over the unit of time described by the EKRecurrenceFrequency. For example, if the EKRecurrenceFrequency is
     * EKRecurrenceWeekly, then an interval of 1 means the pattern is repeated every week. A value of 2
     * indicates it is repeated every other week, 3 means every third week, and so on. The value must be a
     * positive integer; 0 is not a valid value, and nil will be returned if the client attempts to initialize a
     * rule with a negative or zero interval.
     */
    @Generated
    @Selector("interval")
    @NInt
    public native long interval();

    /**
     * [@property]       monthsOfTheYear
     * <p>
     * This property is valid for rules whose EKRecurrenceFrequency is EKRecurrenceFrequencyYearly. This property can be accessed
     * as an array containing one or more NSNumbers corresponding to the months of the year the event recurs. For all other
     * EKRecurrenceRules, this property is nil. This property corresponds to BYMONTH in the iCalendar specification.
     */
    @Generated
    @Selector("monthsOfTheYear")
    public native NSArray<? extends NSNumber> monthsOfTheYear();

    /**
     * [@property]       recurrenceEnd
     * <p>
     * This property defines when the the repeating event is scheduled to end. The end date can be specified by a number of
     * occurrences, or with an end date.
     */
    @Generated
    @Selector("recurrenceEnd")
    public native EKRecurrenceEnd recurrenceEnd();

    /**
     * [@property]       setPositions
     * <p>
     * This property is valid for rules which have a valid daysOfTheWeek, daysOfTheMonth, weeksOfTheYear, or monthsOfTheYear property.
     * It allows you to specify a set of ordinal numbers to help choose which objects out of the set of selected events should be
     * included. For example, setting the daysOfTheWeek to Monday-Friday and including a value of -1 in the array would indicate
     * the last weekday in the recurrence range (month, year, etc). This value corresponds to the iCalendar BYSETPOS property.
     */
    @Generated
    @Selector("setPositions")
    public native NSArray<? extends NSNumber> setPositions();

    /**
     * [@property]       recurrenceEnd
     * <p>
     * This property defines when the the repeating event is scheduled to end. The end date can be specified by a number of
     * occurrences, or with an end date.
     */
    @Generated
    @Selector("setRecurrenceEnd:")
    public native void setRecurrenceEnd(EKRecurrenceEnd value);

    /**
     * [@property]       weeksOfTheYear
     * <p>
     * This property is valid for rules whose EKRecurrenceFrequency is EKRecurrenceFrequencyYearly. This property can be accessed
     * as an array containing one or more NSNumbers corresponding to the weeks of the year the event recurs. For all other
     * EKRecurrenceRules, this property is nil. This property corresponds to BYWEEK in the iCalendar specification. It should
     * contain integers from 1 to 53 or -1 to -53.
     */
    @Generated
    @Selector("weeksOfTheYear")
    public native NSArray<? extends NSNumber> weeksOfTheYear();
}
