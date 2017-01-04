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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("autoupdatingCurrentCalendar")
    public static native NSCalendar autoupdatingCurrentCalendar();

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
    @Selector("initialize")
    public static native void initialize();

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

    @Generated
    @Selector("AMSymbol")
    public native String AMSymbol();

    @Generated
    @Selector("PMSymbol")
    public native String PMSymbol();

    @Generated
    @Selector("calendarIdentifier")
    public native String calendarIdentifier();

    @Generated
    @Selector("compareDate:toDate:toUnitGranularity:")
    @NInt
    public native long compareDateToDateToUnitGranularity(NSDate date1, NSDate date2, @NUInt long unit);

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

    @Generated
    @Selector("components:fromDateComponents:toDateComponents:options:")
    public native NSDateComponents componentsFromDateComponentsToDateComponentsOptions(@NUInt long unitFlags,
            NSDateComponents startingDateComp, NSDateComponents resultDateComp, @NUInt long options);

    @Generated
    @Selector("componentsInTimeZone:fromDate:")
    public native NSDateComponents componentsInTimeZoneFromDate(NSTimeZone timezone, NSDate date);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("date:matchesComponents:")
    public native boolean dateMatchesComponents(NSDate date, NSDateComponents components);

    @Generated
    @Selector("dateByAddingComponents:toDate:options:")
    public native NSDate dateByAddingComponentsToDateOptions(NSDateComponents comps, NSDate date, @NUInt long opts);

    @Generated
    @Selector("dateByAddingUnit:value:toDate:options:")
    public native NSDate dateByAddingUnitValueToDateOptions(@NUInt long unit, @NInt long value, NSDate date,
            @NUInt long options);

    @Generated
    @Selector("dateBySettingHour:minute:second:ofDate:options:")
    public native NSDate dateBySettingHourMinuteSecondOfDateOptions(@NInt long h, @NInt long m, @NInt long s,
            NSDate date, @NUInt long opts);

    @Generated
    @Selector("dateBySettingUnit:value:ofDate:options:")
    public native NSDate dateBySettingUnitValueOfDateOptions(@NUInt long unit, @NInt long v, NSDate date,
            @NUInt long opts);

    @Generated
    @Selector("dateFromComponents:")
    public native NSDate dateFromComponents(NSDateComponents comps);

    @Generated
    @Selector("dateWithEra:year:month:day:hour:minute:second:nanosecond:")
    public native NSDate dateWithEraYearMonthDayHourMinuteSecondNanosecond(@NInt long eraValue, @NInt long yearValue,
            @NInt long monthValue, @NInt long dayValue, @NInt long hourValue, @NInt long minuteValue,
            @NInt long secondValue, @NInt long nanosecondValue);

    @Generated
    @Selector("dateWithEra:yearForWeekOfYear:weekOfYear:weekday:hour:minute:second:nanosecond:")
    public native NSDate dateWithEraYearForWeekOfYearWeekOfYearWeekdayHourMinuteSecondNanosecond(@NInt long eraValue,
            @NInt long yearValue, @NInt long weekValue, @NInt long weekdayValue, @NInt long hourValue,
            @NInt long minuteValue, @NInt long secondValue, @NInt long nanosecondValue);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("enumerateDatesStartingAfterDate:matchingComponents:options:usingBlock:")
    public native void enumerateDatesStartingAfterDateMatchingComponentsOptionsUsingBlock(NSDate start,
            NSDateComponents comps, @NUInt long opts,
            @ObjCBlock(name = "call_enumerateDatesStartingAfterDateMatchingComponentsOptionsUsingBlock") Block_enumerateDatesStartingAfterDateMatchingComponentsOptionsUsingBlock block);

    @Generated
    @Selector("eraSymbols")
    public native NSArray<String> eraSymbols();

    @Generated
    @Selector("firstWeekday")
    @NUInt
    public native long firstWeekday();

    @Generated
    @Selector("getEra:year:month:day:fromDate:")
    public native void getEraYearMonthDayFromDate(NIntPtr eraValuePointer, NIntPtr yearValuePointer,
            NIntPtr monthValuePointer, NIntPtr dayValuePointer, NSDate date);

    @Generated
    @Selector("getEra:yearForWeekOfYear:weekOfYear:weekday:fromDate:")
    public native void getEraYearForWeekOfYearWeekOfYearWeekdayFromDate(NIntPtr eraValuePointer,
            NIntPtr yearValuePointer, NIntPtr weekValuePointer, NIntPtr weekdayValuePointer, NSDate date);

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
    public native NSCalendar initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("isDate:equalToDate:toUnitGranularity:")
    public native boolean isDateEqualToDateToUnitGranularity(NSDate date1, NSDate date2, @NUInt long unit);

    @Generated
    @Selector("isDate:inSameDayAsDate:")
    public native boolean isDateInSameDayAsDate(NSDate date1, NSDate date2);

    @Generated
    @Selector("isDateInToday:")
    public native boolean isDateInToday(NSDate date);

    @Generated
    @Selector("isDateInTomorrow:")
    public native boolean isDateInTomorrow(NSDate date);

    @Generated
    @Selector("isDateInWeekend:")
    public native boolean isDateInWeekend(NSDate date);

    @Generated
    @Selector("isDateInYesterday:")
    public native boolean isDateInYesterday(NSDate date);

    @Generated
    @Selector("locale")
    public native NSLocale locale();

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

    @Generated
    @Selector("minimumRangeOfUnit:")
    @ByValue
    public native NSRange minimumRangeOfUnit(@NUInt long unit);

    @Generated
    @Selector("monthSymbols")
    public native NSArray<String> monthSymbols();

    @Generated
    @Selector("nextDateAfterDate:matchingComponents:options:")
    public native NSDate nextDateAfterDateMatchingComponentsOptions(NSDate date, NSDateComponents comps,
            @NUInt long options);

    @Generated
    @Selector("nextDateAfterDate:matchingHour:minute:second:options:")
    public native NSDate nextDateAfterDateMatchingHourMinuteSecondOptions(NSDate date, @NInt long hourValue,
            @NInt long minuteValue, @NInt long secondValue, @NUInt long options);

    @Generated
    @Selector("nextDateAfterDate:matchingUnit:value:options:")
    public native NSDate nextDateAfterDateMatchingUnitValueOptions(NSDate date, @NUInt long unit, @NInt long value,
            @NUInt long options);

    @Generated
    @Selector("nextWeekendStartDate:interval:options:afterDate:")
    public native boolean nextWeekendStartDateIntervalOptionsAfterDate(
            @ReferenceInfo(type = NSDate.class) Ptr<NSDate> datep, DoublePtr tip, @NUInt long options, NSDate date);

    @Generated
    @Selector("ordinalityOfUnit:inUnit:forDate:")
    @NUInt
    public native long ordinalityOfUnitInUnitForDate(@NUInt long smaller, @NUInt long larger, NSDate date);

    @Generated
    @Selector("quarterSymbols")
    public native NSArray<String> quarterSymbols();

    @Generated
    @Selector("rangeOfUnit:inUnit:forDate:")
    @ByValue
    public native NSRange rangeOfUnitInUnitForDate(@NUInt long smaller, @NUInt long larger, NSDate date);

    @Generated
    @Selector("rangeOfUnit:startDate:interval:forDate:")
    public native boolean rangeOfUnitStartDateIntervalForDate(@NUInt long unit,
            @ReferenceInfo(type = NSDate.class) Ptr<NSDate> datep, DoublePtr tip, NSDate date);

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

    @Generated
    @Selector("shortMonthSymbols")
    public native NSArray<String> shortMonthSymbols();

    @Generated
    @Selector("shortQuarterSymbols")
    public native NSArray<String> shortQuarterSymbols();

    @Generated
    @Selector("shortStandaloneMonthSymbols")
    public native NSArray<String> shortStandaloneMonthSymbols();

    @Generated
    @Selector("shortStandaloneQuarterSymbols")
    public native NSArray<String> shortStandaloneQuarterSymbols();

    @Generated
    @Selector("shortStandaloneWeekdaySymbols")
    public native NSArray<String> shortStandaloneWeekdaySymbols();

    @Generated
    @Selector("shortWeekdaySymbols")
    public native NSArray<String> shortWeekdaySymbols();

    @Generated
    @Selector("standaloneMonthSymbols")
    public native NSArray<String> standaloneMonthSymbols();

    @Generated
    @Selector("standaloneQuarterSymbols")
    public native NSArray<String> standaloneQuarterSymbols();

    @Generated
    @Selector("standaloneWeekdaySymbols")
    public native NSArray<String> standaloneWeekdaySymbols();

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

    @Generated
    @Selector("veryShortMonthSymbols")
    public native NSArray<String> veryShortMonthSymbols();

    @Generated
    @Selector("veryShortStandaloneMonthSymbols")
    public native NSArray<String> veryShortStandaloneMonthSymbols();

    @Generated
    @Selector("veryShortStandaloneWeekdaySymbols")
    public native NSArray<String> veryShortStandaloneWeekdaySymbols();

    @Generated
    @Selector("veryShortWeekdaySymbols")
    public native NSArray<String> veryShortWeekdaySymbols();

    @Generated
    @Selector("weekdaySymbols")
    public native NSArray<String> weekdaySymbols();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateDatesStartingAfterDateMatchingComponentsOptionsUsingBlock {
        @Generated
        void call_enumerateDatesStartingAfterDateMatchingComponentsOptionsUsingBlock(NSDate arg0, boolean arg1,
                BoolPtr arg2);
    }
}
