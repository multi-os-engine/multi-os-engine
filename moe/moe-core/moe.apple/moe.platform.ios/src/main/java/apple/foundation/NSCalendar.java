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

    /**
     * AMSymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/AMSymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("AMSymbol")
    public native String AMSymbol();

    /**
     * PMSymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/PMSymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("PMSymbol")
    public native String PMSymbol();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSCalendar alloc();

    /**
     * autoupdatingCurrentCalendar</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/clm/NSCalendar/autoupdatingCurrentCalendar">iOS Dev Center</a>
     */
    @Generated
    @Selector("autoupdatingCurrentCalendar")
    public static native NSCalendar autoupdatingCurrentCalendar();

    /**
     * calendarIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/calendarIdentifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("calendarIdentifier")
    public native String calendarIdentifier();

    /**
     * calendarWithIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/clm/NSCalendar/calendarWithIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("calendarWithIdentifier:")
    public static native NSCalendar calendarWithIdentifier(String calendarIdentifierConstant);

    /**
     * compareDate:toDate:toUnitGranularity:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/compareDate:toDate:toUnitGranularity:">iOS Dev Center</a>
     */
    @Generated
    @Selector("compareDate:toDate:toUnitGranularity:")
    @NInt
    public native long compareDateToDateToUnitGranularity(NSDate date1, NSDate date2, @NUInt long unit);

    /**
     * component:fromDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/component:fromDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("component:fromDate:")
    @NInt
    public native long componentFromDate(@NUInt long unit, NSDate date);

    /**
     * components:fromDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/components:fromDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("components:fromDate:")
    public native NSDateComponents componentsFromDate(@NUInt long unitFlags, NSDate date);

    /**
     * components:fromDate:toDate:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/components:fromDate:toDate:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("components:fromDate:toDate:options:")
    public native NSDateComponents componentsFromDateToDateOptions(@NUInt long unitFlags, NSDate startingDate,
            NSDate resultDate, @NUInt long opts);

    /**
     * components:fromDateComponents:toDateComponents:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/components:fromDateComponents:toDateComponents:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("components:fromDateComponents:toDateComponents:options:")
    public native NSDateComponents componentsFromDateComponentsToDateComponentsOptions(@NUInt long unitFlags,
            NSDateComponents startingDateComp, NSDateComponents resultDateComp, @NUInt long options);

    /**
     * componentsInTimeZone:fromDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/componentsInTimeZone:fromDate:">iOS Dev Center</a>
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
     * currentCalendar</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/clm/NSCalendar/currentCalendar">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentCalendar")
    public static native NSCalendar currentCalendar();

    /**
     * date:matchesComponents:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/date:matchesComponents:">iOS Dev Center</a>
     */
    @Generated
    @Selector("date:matchesComponents:")
    public native boolean dateMatchesComponents(NSDate date, NSDateComponents components);

    /**
     * dateByAddingComponents:toDate:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/dateByAddingComponents:toDate:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dateByAddingComponents:toDate:options:")
    public native NSDate dateByAddingComponentsToDateOptions(NSDateComponents comps, NSDate date, @NUInt long opts);

    /**
     * dateByAddingUnit:value:toDate:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/dateByAddingUnit:value:toDate:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dateByAddingUnit:value:toDate:options:")
    public native NSDate dateByAddingUnitValueToDateOptions(@NUInt long unit, @NInt long value, NSDate date,
            @NUInt long options);

    /**
     * dateBySettingHour:minute:second:ofDate:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/dateBySettingHour:minute:second:ofDate:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dateBySettingHour:minute:second:ofDate:options:")
    public native NSDate dateBySettingHourMinuteSecondOfDateOptions(@NInt long h, @NInt long m, @NInt long s,
            NSDate date, @NUInt long opts);

    /**
     * dateBySettingUnit:value:ofDate:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/dateBySettingUnit:value:ofDate:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dateBySettingUnit:value:ofDate:options:")
    public native NSDate dateBySettingUnitValueOfDateOptions(@NUInt long unit, @NInt long v, NSDate date,
            @NUInt long opts);

    /**
     * dateFromComponents:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/dateFromComponents:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dateFromComponents:")
    public native NSDate dateFromComponents(NSDateComponents comps);

    /**
     * dateWithEra:year:month:day:hour:minute:second:nanosecond:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/dateWithEra:year:month:day:hour:minute:second:nanosecond:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dateWithEra:year:month:day:hour:minute:second:nanosecond:")
    public native NSDate dateWithEraYearMonthDayHourMinuteSecondNanosecond(@NInt long eraValue, @NInt long yearValue,
            @NInt long monthValue, @NInt long dayValue, @NInt long hourValue, @NInt long minuteValue,
            @NInt long secondValue, @NInt long nanosecondValue);

    /**
     * dateWithEra:yearForWeekOfYear:weekOfYear:weekday:hour:minute:second:nanosecond:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/dateWithEra:yearForWeekOfYear:weekOfYear:weekday:hour:minute:second:nanosecond:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dateWithEra:yearForWeekOfYear:weekOfYear:weekday:hour:minute:second:nanosecond:")
    public native NSDate dateWithEraYearForWeekOfYearWeekOfYearWeekdayHourMinuteSecondNanosecond(@NInt long eraValue,
            @NInt long yearValue, @NInt long weekValue, @NInt long weekdayValue, @NInt long hourValue,
            @NInt long minuteValue, @NInt long secondValue, @NInt long nanosecondValue);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * enumerateDatesStartingAfterDate:matchingComponents:options:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/enumerateDatesStartingAfterDate:matchingComponents:options:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateDatesStartingAfterDate:matchingComponents:options:usingBlock:")
    public native void enumerateDatesStartingAfterDateMatchingComponentsOptionsUsingBlock(NSDate start,
            NSDateComponents comps, @NUInt long opts,
            @ObjCBlock(name = "call_enumerateDatesStartingAfterDateMatchingComponentsOptionsUsingBlock") Block_enumerateDatesStartingAfterDateMatchingComponentsOptionsUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateDatesStartingAfterDateMatchingComponentsOptionsUsingBlock {
        @Generated
        void call_enumerateDatesStartingAfterDateMatchingComponentsOptionsUsingBlock(NSDate arg0, boolean arg1,
                BoolPtr arg2);
    }

    /**
     * eraSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/eraSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("eraSymbols")
    public native NSArray<String> eraSymbols();

    /**
     * firstWeekday</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/firstWeekday">iOS Dev Center</a>
     */
    @Generated
    @Selector("firstWeekday")
    @NUInt
    public native long firstWeekday();

    /**
     * getEra:year:month:day:fromDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/getEra:year:month:day:fromDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getEra:year:month:day:fromDate:")
    public native void getEraYearMonthDayFromDate(NIntPtr eraValuePointer, NIntPtr yearValuePointer,
            NIntPtr monthValuePointer, NIntPtr dayValuePointer, NSDate date);

    /**
     * getEra:yearForWeekOfYear:weekOfYear:weekday:fromDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/getEra:yearForWeekOfYear:weekOfYear:weekday:fromDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getEra:yearForWeekOfYear:weekOfYear:weekday:fromDate:")
    public native void getEraYearForWeekOfYearWeekOfYearWeekdayFromDate(NIntPtr eraValuePointer,
            NIntPtr yearValuePointer, NIntPtr weekValuePointer, NIntPtr weekdayValuePointer, NSDate date);

    /**
     * getHour:minute:second:nanosecond:fromDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/getHour:minute:second:nanosecond:fromDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getHour:minute:second:nanosecond:fromDate:")
    public native void getHourMinuteSecondNanosecondFromDate(NIntPtr hourValuePointer, NIntPtr minuteValuePointer,
            NIntPtr secondValuePointer, NIntPtr nanosecondValuePointer, NSDate date);

    @Generated
    @Selector("init")
    public native NSCalendar init();

    /**
     * initWithCalendarIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/initWithCalendarIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithCalendarIdentifier:")
    public native NSCalendar initWithCalendarIdentifier(String ident);

    @Generated
    @Selector("initWithCoder:")
    public native NSCalendar initWithCoder(NSCoder aDecoder);

    /**
     * isDate:equalToDate:toUnitGranularity:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/isDate:equalToDate:toUnitGranularity:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isDate:equalToDate:toUnitGranularity:")
    public native boolean isDateEqualToDateToUnitGranularity(NSDate date1, NSDate date2, @NUInt long unit);

    /**
     * isDate:inSameDayAsDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/isDate:inSameDayAsDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isDate:inSameDayAsDate:")
    public native boolean isDateInSameDayAsDate(NSDate date1, NSDate date2);

    /**
     * isDateInToday:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/isDateInToday:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isDateInToday:")
    public native boolean isDateInToday(NSDate date);

    /**
     * isDateInTomorrow:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/isDateInTomorrow:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isDateInTomorrow:")
    public native boolean isDateInTomorrow(NSDate date);

    /**
     * isDateInWeekend:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/isDateInWeekend:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isDateInWeekend:")
    public native boolean isDateInWeekend(NSDate date);

    /**
     * isDateInYesterday:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/isDateInYesterday:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isDateInYesterday:")
    public native boolean isDateInYesterday(NSDate date);

    /**
     * locale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/locale">iOS Dev Center</a>
     */
    @Generated
    @Selector("locale")
    public native NSLocale locale();

    /**
     * longEraSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/longEraSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("longEraSymbols")
    public native NSArray<String> longEraSymbols();

    /**
     * maximumRangeOfUnit:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/maximumRangeOfUnit:">iOS Dev Center</a>
     */
    @Generated
    @Selector("maximumRangeOfUnit:")
    @ByValue
    public native NSRange maximumRangeOfUnit(@NUInt long unit);

    /**
     * minimumDaysInFirstWeek</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/minimumDaysInFirstWeek">iOS Dev Center</a>
     */
    @Generated
    @Selector("minimumDaysInFirstWeek")
    @NUInt
    public native long minimumDaysInFirstWeek();

    /**
     * minimumRangeOfUnit:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/minimumRangeOfUnit:">iOS Dev Center</a>
     */
    @Generated
    @Selector("minimumRangeOfUnit:")
    @ByValue
    public native NSRange minimumRangeOfUnit(@NUInt long unit);

    /**
     * monthSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/monthSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("monthSymbols")
    public native NSArray<String> monthSymbols();

    /**
     * nextDateAfterDate:matchingComponents:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/nextDateAfterDate:matchingComponents:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("nextDateAfterDate:matchingComponents:options:")
    public native NSDate nextDateAfterDateMatchingComponentsOptions(NSDate date, NSDateComponents comps,
            @NUInt long options);

    /**
     * nextDateAfterDate:matchingHour:minute:second:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/nextDateAfterDate:matchingHour:minute:second:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("nextDateAfterDate:matchingHour:minute:second:options:")
    public native NSDate nextDateAfterDateMatchingHourMinuteSecondOptions(NSDate date, @NInt long hourValue,
            @NInt long minuteValue, @NInt long secondValue, @NUInt long options);

    /**
     * nextDateAfterDate:matchingUnit:value:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/nextDateAfterDate:matchingUnit:value:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("nextDateAfterDate:matchingUnit:value:options:")
    public native NSDate nextDateAfterDateMatchingUnitValueOptions(NSDate date, @NUInt long unit, @NInt long value,
            @NUInt long options);

    /**
     * nextWeekendStartDate:interval:options:afterDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/nextWeekendStartDate:interval:options:afterDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("nextWeekendStartDate:interval:options:afterDate:")
    public native boolean nextWeekendStartDateIntervalOptionsAfterDate(Ptr<NSDate> datep, DoublePtr tip,
            @NUInt long options, NSDate date);

    /**
     * ordinalityOfUnit:inUnit:forDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/ordinalityOfUnit:inUnit:forDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("ordinalityOfUnit:inUnit:forDate:")
    @NUInt
    public native long ordinalityOfUnitInUnitForDate(@NUInt long smaller, @NUInt long larger, NSDate date);

    /**
     * quarterSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/quarterSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("quarterSymbols")
    public native NSArray<String> quarterSymbols();

    /**
     * rangeOfUnit:inUnit:forDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/rangeOfUnit:inUnit:forDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rangeOfUnit:inUnit:forDate:")
    @ByValue
    public native NSRange rangeOfUnitInUnitForDate(@NUInt long smaller, @NUInt long larger, NSDate date);

    /**
     * rangeOfUnit:startDate:interval:forDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/rangeOfUnit:startDate:interval:forDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rangeOfUnit:startDate:interval:forDate:")
    public native boolean rangeOfUnitStartDateIntervalForDate(@NUInt long unit, Ptr<NSDate> datep, DoublePtr tip,
            NSDate date);

    /**
     * rangeOfWeekendStartDate:interval:containingDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/rangeOfWeekendStartDate:interval:containingDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rangeOfWeekendStartDate:interval:containingDate:")
    public native boolean rangeOfWeekendStartDateIntervalContainingDate(Ptr<NSDate> datep, DoublePtr tip, NSDate date);

    /**
     * firstWeekday</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/firstWeekday">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFirstWeekday:")
    public native void setFirstWeekday(@NUInt long value);

    /**
     * locale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/locale">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLocale:")
    public native void setLocale(NSLocale value);

    /**
     * minimumDaysInFirstWeek</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/minimumDaysInFirstWeek">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMinimumDaysInFirstWeek:")
    public native void setMinimumDaysInFirstWeek(@NUInt long value);

    /**
     * timeZone</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/timeZone">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTimeZone:")
    public native void setTimeZone(NSTimeZone value);

    /**
     * shortMonthSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/shortMonthSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("shortMonthSymbols")
    public native NSArray<String> shortMonthSymbols();

    /**
     * shortQuarterSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/shortQuarterSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("shortQuarterSymbols")
    public native NSArray<String> shortQuarterSymbols();

    /**
     * shortStandaloneMonthSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/shortStandaloneMonthSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("shortStandaloneMonthSymbols")
    public native NSArray<String> shortStandaloneMonthSymbols();

    /**
     * shortStandaloneQuarterSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/shortStandaloneQuarterSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("shortStandaloneQuarterSymbols")
    public native NSArray<String> shortStandaloneQuarterSymbols();

    /**
     * shortStandaloneWeekdaySymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/shortStandaloneWeekdaySymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("shortStandaloneWeekdaySymbols")
    public native NSArray<String> shortStandaloneWeekdaySymbols();

    /**
     * shortWeekdaySymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/shortWeekdaySymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("shortWeekdaySymbols")
    public native NSArray<String> shortWeekdaySymbols();

    /**
     * standaloneMonthSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/standaloneMonthSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("standaloneMonthSymbols")
    public native NSArray<String> standaloneMonthSymbols();

    /**
     * standaloneQuarterSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/standaloneQuarterSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("standaloneQuarterSymbols")
    public native NSArray<String> standaloneQuarterSymbols();

    /**
     * standaloneWeekdaySymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/standaloneWeekdaySymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("standaloneWeekdaySymbols")
    public native NSArray<String> standaloneWeekdaySymbols();

    /**
     * startOfDayForDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instm/NSCalendar/startOfDayForDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("startOfDayForDate:")
    public native NSDate startOfDayForDate(NSDate date);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * timeZone</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/timeZone">iOS Dev Center</a>
     */
    @Generated
    @Selector("timeZone")
    public native NSTimeZone timeZone();

    /**
     * veryShortMonthSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/veryShortMonthSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("veryShortMonthSymbols")
    public native NSArray<String> veryShortMonthSymbols();

    /**
     * veryShortStandaloneMonthSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/veryShortStandaloneMonthSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("veryShortStandaloneMonthSymbols")
    public native NSArray<String> veryShortStandaloneMonthSymbols();

    /**
     * veryShortStandaloneWeekdaySymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/veryShortStandaloneWeekdaySymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("veryShortStandaloneWeekdaySymbols")
    public native NSArray<String> veryShortStandaloneWeekdaySymbols();

    /**
     * veryShortWeekdaySymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/veryShortWeekdaySymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("veryShortWeekdaySymbols")
    public native NSArray<String> veryShortWeekdaySymbols();

    /**
     * weekdaySymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCalendar_Class/index.html#//apple_ref/occ/instp/NSCalendar/weekdaySymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("weekdaySymbols")
    public native NSArray<String> weekdaySymbols();

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
    @Selector("version")
    @NInt
    public static native long version_static();
}
