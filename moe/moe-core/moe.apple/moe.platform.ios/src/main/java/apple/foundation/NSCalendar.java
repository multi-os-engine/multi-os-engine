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

package apple.foundation;

import apple.NSObject;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCalendar extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSCalendar(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSCalendar alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSCalendar allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * tracks changes to user's preferred calendar identifier
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("autoupdatingCurrentCalendar")
    public static native NSCalendar autoupdatingCurrentCalendar();

    /**
     * This method returns a new autoreleased calendar object of the given type, specified by a calendar identifier
     * constant.
     * The calendar defaults to having the current locale and default time zone, for those properties.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("calendarWithIdentifier:")
    public static native NSCalendar calendarWithIdentifier(String calendarIdentifierConstant);

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

    /**
     * user's preferred calendar
     */
    @Generated
    @Selector("currentCalendar")
    public static native NSCalendar currentCalendar();

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
    public static native NSCalendar new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("AMSymbol")
    public native String AMSymbol();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("PMSymbol")
    public native String PMSymbol();

    @Generated
    @Selector("calendarIdentifier")
    public native String calendarIdentifier();

    /**
     * This API compares the given dates down to the given unit, reporting them equal if they are the same in the given
     * unit and all larger units, otherwise either less than or greater than.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("compareDate:toDate:toUnitGranularity:")
    @NInt
    public native long compareDateToDateToUnitGranularity(NSDate date1, NSDate date2, @NUInt long unit);

    /**
     * Get just one component's value.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("component:fromDate:")
    @NInt
    public native long componentFromDate(@NUInt long unit, NSDate date);

    @Generated
    @Selector("components:fromDate:")
    public native NSDateComponents componentsFromDate(@NUInt long unitFlags, NSDate date);

    @Generated
    @Selector("components:fromDate:toDate:options:")
    public native NSDateComponents componentsFromDateToDateOptions(@NUInt long unitFlags, NSDate startingDate,
            NSDate resultDate, @NUInt long opts);

    /**
     * This API returns the difference between two dates specified as date components.
     * For units which are not specified in each NSDateComponents, but required to specify an absolute date, the base
     * value of the unit is assumed. For example, for an NSDateComponents with just a Year and a Month specified, a Day
     * of 1, and an Hour, Minute, Second, and Nanosecond of 0 are assumed.
     * Calendrical calculations with unspecified Year or Year value prior to the start of a calendar are not advised.
     * For each date components object, if its time zone property is set, that time zone is used for it; if the calendar
     * property is set, that is used rather than the receiving calendar, and if both the calendar and time zone are set,
     * the time zone property value overrides the time zone of the calendar property.
     * No options are currently defined; pass 0.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("components:fromDateComponents:toDateComponents:options:")
    public native NSDateComponents componentsFromDateComponentsToDateComponentsOptions(@NUInt long unitFlags,
            NSDateComponents startingDateComp, NSDateComponents resultDateComp, @NUInt long options);

    /**
     * This API returns all the date components of a date, as if in a given time zone (instead of the receiving
     * calendar's time zone).
     * The time zone overrides the time zone of the NSCalendar for the purposes of this calculation.
     * Note: if you want "date information in a given time zone" in order to display it, you should use NSDateFormatter
     * to format the date.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("componentsInTimeZone:fromDate:")
    public native NSDateComponents componentsInTimeZoneFromDate(NSTimeZone timezone, NSDate date);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * This API returns YES if the date has all the matched components. Otherwise, it returns NO.
     * It is useful to test the return value of the -nextDateAfterDate:matchingUnit:value:options:, to find out if the
     * components were obeyed or if the method had to fudge the result value due to missing time.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("date:matchesComponents:")
    public native boolean dateMatchesComponents(NSDate date, NSDateComponents components);

    @Generated
    @Selector("dateByAddingComponents:toDate:options:")
    public native NSDate dateByAddingComponentsToDateOptions(NSDateComponents comps, NSDate date, @NUInt long opts);

    /**
     * This API returns a new NSDate object representing the date calculated by adding an amount of a specific component
     * to a given date.
     * The NSCalendarWrapComponents option specifies if the component should be incremented and wrap around to zero/one
     * on overflow, and should not cause higher units to be incremented.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("dateByAddingUnit:value:toDate:options:")
    public native NSDate dateByAddingUnitValueToDateOptions(@NUInt long unit, @NInt long value, NSDate date,
            @NUInt long options);

    /**
     * This API returns a new NSDate object representing the date calculated by setting hour, minute, and second to a
     * given time.
     * If no such time exists, the next available time is returned (which could, for example, be in a different day than
     * the nominal target date).
     * The intent is to return a date on the same day as the original date argument. This may result in a date which is
     * earlier than the given date, of course.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("dateBySettingHour:minute:second:ofDate:options:")
    public native NSDate dateBySettingHourMinuteSecondOfDateOptions(@NInt long h, @NInt long m, @NInt long s,
            NSDate date, @NUInt long opts);

    /**
     * This API returns a new NSDate object representing the date calculated by setting a specific component to a given
     * time, and trying to keep lower components the same. If the unit already has that value, this may result in a date
     * which is the same as the given date.
     * Changing a component's value often will require higher or coupled components to change as well. For example,
     * setting the Weekday to Thursday usually will require the Day component to change its value, and possibly the
     * Month and Year as well.
     * If no such time exists, the next available time is returned (which could, for example, be in a different day,
     * week, month, ... than the nominal target date). Setting a component to something which would be inconsistent
     * forces other units to change; for example, setting the Weekday to Thursday probably shifts the Day and possibly
     * Month and Year.
     * The specific behaviors here are as yet unspecified; for example, if I change the weekday to Thursday, does that
     * move forward to the next, backward to the previous, or to the nearest Thursday? A likely rule is that the
     * algorithm will try to produce a result which is in the next-larger unit to the one given (there's a table of this
     * mapping at the top of this document). So for the "set to Thursday" example, find the Thursday in the Week in
     * which the given date resides (which could be a forwards or backwards move, and not necessarily the nearest
     * Thursday). For forwards or backwards behavior, one can use the -nextDateAfterDate:matchingUnit:value:options:
     * method above.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("dateBySettingUnit:value:ofDate:options:")
    public native NSDate dateBySettingUnitValueOfDateOptions(@NUInt long unit, @NInt long v, NSDate date,
            @NUInt long opts);

    @Generated
    @Selector("dateFromComponents:")
    public native NSDate dateFromComponents(NSDateComponents comps);

    /**
     * Create a date with given components.
     * Current era is assumed.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("dateWithEra:year:month:day:hour:minute:second:nanosecond:")
    public native NSDate dateWithEraYearMonthDayHourMinuteSecondNanosecond(@NInt long eraValue, @NInt long yearValue,
            @NInt long monthValue, @NInt long dayValue, @NInt long hourValue, @NInt long minuteValue,
            @NInt long secondValue, @NInt long nanosecondValue);

    /**
     * Create a date with given components.
     * Current era is assumed.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("dateWithEra:yearForWeekOfYear:weekOfYear:weekday:hour:minute:second:nanosecond:")
    public native NSDate dateWithEraYearForWeekOfYearWeekOfYearWeekdayHourMinuteSecondNanosecond(@NInt long eraValue,
            @NInt long yearValue, @NInt long weekValue, @NInt long weekdayValue, @NInt long hourValue,
            @NInt long minuteValue, @NInt long secondValue, @NInt long nanosecondValue);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * This method computes the dates which match (or most closely match) a given set of components, and calls the block
     * once for each of them, until the enumeration is stopped.
     * There will be at least one intervening date which does not match all the components (or the given date itself
     * must not match) between the given date and any result.
     * If the NSCalendarSearchBackwards option is used, this method finds the previous match before the given date. The
     * intent is that the same matches as for a forwards search will be found (that is, if you are enumerating forwards
     * or backwards for each hour with minute "27", the seconds in the date you will get in forwards search would
     * obviously be 00, and the same will be true in a backwards search in order to implement this rule. Similarly for
     * DST backwards jumps which repeats times, you'll get the first match by default, where "first" is defined from the
     * point of view of searching forwards. So, when searching backwards looking for a particular hour, with no minute
     * and second specified, you don't get a minute and second of 59:59 for the matching hour (which would be the
     * nominal first match within a given hour, given the other rules here, when searching backwards).
     * If the NSCalendarMatchStrictly option is used, the algorithm travels as far forward or backward as necessary
     * looking for a match, but there are ultimately implementation-defined limits in how far distant the search will
     * go. If the NSCalendarMatchStrictly option is not specified, the algorithm searches up to the end of the next
     * instance of the next higher unit to the highest specified unit in the NSDateComponents argument. If you want to
     * find the next Feb 29 in the Gregorian calendar, for example, you have to specify the NSCalendarMatchStrictly
     * option to guarantee finding it.
     * If an exact match is not possible, and requested with the NSCalendarMatchStrictly option, nil is passed to the
     * block and the enumeration ends. (Logically, since an exact match searches indefinitely into the future, if no
     * match is found there's no point in continuing the enumeration.)
     * 
     * If the NSCalendarMatchStrictly option is NOT used, exactly one option from the set
     * {NSCalendarMatchPreviousTimePreservingSmallerUnits, NSCalendarMatchNextTimePreservingSmallerUnits,
     * NSCalendarMatchNextTime} must be specified, or an illegal argument exception will be thrown.
     * 
     * If the NSCalendarMatchPreviousTimePreservingSmallerUnits option is specified, and there is no matching time
     * before the end of the next instance of the next higher unit to the highest specified unit in the NSDateComponents
     * argument, the method will return the previous existing value of the missing unit and preserves the lower units'
     * values (e.g., no 2:37am results in 1:37am, if that exists).
     * 
     * If the NSCalendarMatchNextTimePreservingSmallerUnits option is specified, and there is no matching time before
     * the end of the next instance of the next higher unit to the highest specified unit in the NSDateComponents
     * argument, the method will return the next existing value of the missing unit and preserves the lower units'
     * values (e.g., no 2:37am results in 3:37am, if that exists).
     * 
     * If the NSCalendarMatchNextTime option is specified, and there is no matching time before the end of the next
     * instance of the next higher unit to the highest specified unit in the NSDateComponents argument, the method will
     * return the next existing time which exists (e.g., no 2:37am results in 3:00am, if that exists).
     * If the NSCalendarMatchFirst option is specified, and there are two or more matching times (all the components are
     * the same, including isLeapMonth) before the end of the next instance of the next higher unit to the highest
     * specified unit in the NSDateComponents argument, the method will return the first occurrence.
     * If the NSCalendarMatchLast option is specified, and there are two or more matching times (all the components are
     * the same, including isLeapMonth) before the end of the next instance of the next higher unit to the highest
     * specified unit in the NSDateComponents argument, the method will return the last occurrence.
     * If neither the NSCalendarMatchFirst or NSCalendarMatchLast option is specified, the default behavior is to act as
     * if NSCalendarMatchFirst was specified.
     * There is no option to return middle occurrences of more than two occurrences of a matching time, if such exist.
     * 
     * Result dates have an integer number of seconds (as if 0 was specified for the nanoseconds property of the
     * NSDateComponents matching parameter), unless a value was set in the nanoseconds property, in which case the
     * result date will have that number of nanoseconds (or as close as possible with floating point numbers).
     * The enumeration is stopped by setting *stop = YES in the block and return. It is not necessary to set *stop to NO
     * to keep the enumeration going.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("enumerateDatesStartingAfterDate:matchingComponents:options:usingBlock:")
    public native void enumerateDatesStartingAfterDateMatchingComponentsOptionsUsingBlock(NSDate start,
            NSDateComponents comps, @NUInt long opts,
            @ObjCBlock(name = "call_enumerateDatesStartingAfterDateMatchingComponentsOptionsUsingBlock") Block_enumerateDatesStartingAfterDateMatchingComponentsOptionsUsingBlock block);

    /**
     * Methods to return component name strings localized to the calendar's locale
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("eraSymbols")
    public native NSArray<String> eraSymbols();

    @Generated
    @Selector("firstWeekday")
    @NUInt
    public native long firstWeekday();

    /**
     * This API is a convenience for getting era, year, month, and day of a given date.
     * Pass NULL for a NSInteger pointer parameter if you don't care about that value.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("getEra:year:month:day:fromDate:")
    public native void getEraYearMonthDayFromDate(NIntPtr eraValuePointer, NIntPtr yearValuePointer,
            NIntPtr monthValuePointer, NIntPtr dayValuePointer, NSDate date);

    /**
     * This API is a convenience for getting era, year for week-of-year calculations, week of year, and weekday of a
     * given date.
     * Pass NULL for a NSInteger pointer parameter if you don't care about that value.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("getEra:yearForWeekOfYear:weekOfYear:weekday:fromDate:")
    public native void getEraYearForWeekOfYearWeekOfYearWeekdayFromDate(NIntPtr eraValuePointer,
            NIntPtr yearValuePointer, NIntPtr weekValuePointer, NIntPtr weekdayValuePointer, NSDate date);

    /**
     * This API is a convenience for getting hour, minute, second, and nanoseconds of a given date.
     * Pass NULL for a NSInteger pointer parameter if you don't care about that value.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("getHour:minute:second:nanosecond:fromDate:")
    public native void getHourMinuteSecondNanosecondFromDate(NIntPtr hourValuePointer, NIntPtr minuteValuePointer,
            NIntPtr secondValuePointer, NIntPtr nanosecondValuePointer, NSDate date);

    @Generated
    @Selector("init")
    public native NSCalendar init();

    @Generated
    @Selector("initWithCalendarIdentifier:")
    public native NSCalendar initWithCalendarIdentifier(String ident);

    @Generated
    @Selector("initWithCoder:")
    public native NSCalendar initWithCoder(NSCoder coder);

    /**
     * This API compares the given dates down to the given unit, reporting them equal if they are the same in the given
     * unit and all larger units.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("isDate:equalToDate:toUnitGranularity:")
    public native boolean isDateEqualToDateToUnitGranularity(NSDate date1, NSDate date2, @NUInt long unit);

    /**
     * This API compares the Days of the given dates, reporting them equal if they are in the same Day.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("isDate:inSameDayAsDate:")
    public native boolean isDateInSameDayAsDate(NSDate date1, NSDate date2);

    /**
     * This API reports if the date is within "today".
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("isDateInToday:")
    public native boolean isDateInToday(NSDate date);

    /**
     * This API reports if the date is within "tomorrow".
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("isDateInTomorrow:")
    public native boolean isDateInTomorrow(NSDate date);

    /**
     * This API reports if the date is within a weekend period, as defined by the calendar and calendar's locale.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("isDateInWeekend:")
    public native boolean isDateInWeekend(NSDate date);

    /**
     * This API reports if the date is within "yesterday".
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("isDateInYesterday:")
    public native boolean isDateInYesterday(NSDate date);

    @Generated
    @Selector("locale")
    public native NSLocale locale();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("longEraSymbols")
    public native NSArray<String> longEraSymbols();

    @Generated
    @Selector("maximumRangeOfUnit:")
    @ByValue
    public native NSRange maximumRangeOfUnit(@NUInt long unit);

    @Generated
    @Selector("minimumDaysInFirstWeek")
    @NUInt
    public native long minimumDaysInFirstWeek();

    /**
     * Calendrical calculations
     */
    @Generated
    @Selector("minimumRangeOfUnit:")
    @ByValue
    public native NSRange minimumRangeOfUnit(@NUInt long unit);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("monthSymbols")
    public native NSArray<String> monthSymbols();

    /**
     * This method computes the next date which matches (or most closely matches) a given set of components.
     * The general semantics follow those of the -enumerateDatesStartingAfterDate:... method above.
     * To compute a sequence of results, use the -enumerateDatesStartingAfterDate:... method above, rather than looping
     * and calling this method with the previous loop iteration's result.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("nextDateAfterDate:matchingComponents:options:")
    public native NSDate nextDateAfterDateMatchingComponentsOptions(NSDate date, NSDateComponents comps,
            @NUInt long options);

    /**
     * This API returns a new NSDate object representing the date found which matches the given hour, minute, and second
     * values.
     * The general semantics follow those of the -enumerateDatesStartingAfterDate:... method above.
     * To compute a sequence of results, use the -enumerateDatesStartingAfterDate:... method above, rather than looping
     * and calling this method with the previous loop iteration's result.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("nextDateAfterDate:matchingHour:minute:second:options:")
    public native NSDate nextDateAfterDateMatchingHourMinuteSecondOptions(NSDate date, @NInt long hourValue,
            @NInt long minuteValue, @NInt long secondValue, @NUInt long options);

    /**
     * This API returns a new NSDate object representing the date found which matches a specific component value.
     * The general semantics follow those of the -enumerateDatesStartingAfterDate:... method above.
     * To compute a sequence of results, use the -enumerateDatesStartingAfterDate:... method above, rather than looping
     * and calling this method with the previous loop iteration's result.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("nextDateAfterDate:matchingUnit:value:options:")
    public native NSDate nextDateAfterDateMatchingUnitValueOptions(NSDate date, @NUInt long unit, @NInt long value,
            @NUInt long options);

    /**
     * Returns the range of the next weekend, via two by-reference parameters, which starts strictly after the given
     * date.
     * The NSCalendarSearchBackwards option can be used to find the previous weekend range strictly before the date.
     * Returns NO if there are no such things as weekend in the calendar and its locale.
     * Note that a given entire Day within a calendar is not necessarily all in a weekend or not; weekends can start in
     * the middle of a Day in some calendars and locales.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("nextWeekendStartDate:interval:options:afterDate:")
    public native boolean nextWeekendStartDateIntervalOptionsAfterDate(
            @ReferenceInfo(type = NSDate.class) Ptr<NSDate> datep, DoublePtr tip, @NUInt long options, NSDate date);

    @Generated
    @Selector("ordinalityOfUnit:inUnit:forDate:")
    @NUInt
    public native long ordinalityOfUnitInUnitForDate(@NUInt long smaller, @NUInt long larger, NSDate date);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("quarterSymbols")
    public native NSArray<String> quarterSymbols();

    @Generated
    @Selector("rangeOfUnit:inUnit:forDate:")
    @ByValue
    public native NSRange rangeOfUnitInUnitForDate(@NUInt long smaller, @NUInt long larger, NSDate date);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("rangeOfUnit:startDate:interval:forDate:")
    public native boolean rangeOfUnitStartDateIntervalForDate(@NUInt long unit,
            @ReferenceInfo(type = NSDate.class) Ptr<NSDate> datep, DoublePtr tip, NSDate date);

    /**
     * Find the range of the weekend around the given date, returned via two by-reference parameters.
     * Returns NO if the given date is not in a weekend.
     * Note that a given entire Day within a calendar is not necessarily all in a weekend or not; weekends can start in
     * the middle of a Day in some calendars and locales.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("rangeOfWeekendStartDate:interval:containingDate:")
    public native boolean rangeOfWeekendStartDateIntervalContainingDate(
            @ReferenceInfo(type = NSDate.class) Ptr<NSDate> datep, DoublePtr tip, NSDate date);

    @Generated
    @Selector("setFirstWeekday:")
    public native void setFirstWeekday(@NUInt long value);

    @Generated
    @Selector("setLocale:")
    public native void setLocale(NSLocale value);

    @Generated
    @Selector("setMinimumDaysInFirstWeek:")
    public native void setMinimumDaysInFirstWeek(@NUInt long value);

    @Generated
    @Selector("setTimeZone:")
    public native void setTimeZone(NSTimeZone value);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("shortMonthSymbols")
    public native NSArray<String> shortMonthSymbols();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("shortQuarterSymbols")
    public native NSArray<String> shortQuarterSymbols();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("shortStandaloneMonthSymbols")
    public native NSArray<String> shortStandaloneMonthSymbols();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("shortStandaloneQuarterSymbols")
    public native NSArray<String> shortStandaloneQuarterSymbols();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("shortStandaloneWeekdaySymbols")
    public native NSArray<String> shortStandaloneWeekdaySymbols();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("shortWeekdaySymbols")
    public native NSArray<String> shortWeekdaySymbols();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("standaloneMonthSymbols")
    public native NSArray<String> standaloneMonthSymbols();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("standaloneQuarterSymbols")
    public native NSArray<String> standaloneQuarterSymbols();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("standaloneWeekdaySymbols")
    public native NSArray<String> standaloneWeekdaySymbols();

    /**
     * This API returns the first moment date of a given date.
     * Pass in [NSDate date], for example, if you want the start of "today".
     * If there were two midnights, it returns the first. If there was none, it returns the first moment that did exist.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("startOfDayForDate:")
    public native NSDate startOfDayForDate(NSDate date);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("timeZone")
    public native NSTimeZone timeZone();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("veryShortMonthSymbols")
    public native NSArray<String> veryShortMonthSymbols();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("veryShortStandaloneMonthSymbols")
    public native NSArray<String> veryShortStandaloneMonthSymbols();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("veryShortStandaloneWeekdaySymbols")
    public native NSArray<String> veryShortStandaloneWeekdaySymbols();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("veryShortWeekdaySymbols")
    public native NSArray<String> veryShortWeekdaySymbols();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("weekdaySymbols")
    public native NSArray<String> weekdaySymbols();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateDatesStartingAfterDateMatchingComponentsOptionsUsingBlock {
        @Generated
        void call_enumerateDatesStartingAfterDateMatchingComponentsOptionsUsingBlock(NSDate date, boolean exactMatch,
                BoolPtr stop);
    }
}
