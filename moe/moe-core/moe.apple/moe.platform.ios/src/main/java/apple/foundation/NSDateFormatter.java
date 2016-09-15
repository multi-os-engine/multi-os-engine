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
import apple.foundation.struct.NSRange;
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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDateFormatter extends NSFormatter {
    static {
        NatJ.register();
    }

    @Generated
    protected NSDateFormatter(Pointer peer) {
        super(peer);
    }

    /**
     * AMSymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/AMSymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("AMSymbol")
    public native String AMSymbol();

    /**
     * PMSymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/PMSymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("PMSymbol")
    public native String PMSymbol();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSDateFormatter alloc();

    /**
     * calendar</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/calendar">iOS Dev Center</a>
     */
    @Generated
    @Selector("calendar")
    public native NSCalendar calendar();

    /**
     * dateFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/dateFormat">iOS Dev Center</a>
     */
    @Generated
    @Selector("dateFormat")
    public native String dateFormat();

    /**
     * dateFormatFromTemplate:options:locale:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/clm/NSDateFormatter/dateFormatFromTemplate:options:locale:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dateFormatFromTemplate:options:locale:")
    public static native String dateFormatFromTemplateOptionsLocale(String tmplate, @NUInt long opts, NSLocale locale);

    /**
     * dateFromString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instm/NSDateFormatter/dateFromString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dateFromString:")
    public native NSDate dateFromString(String string);

    /**
     * dateStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/dateStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("dateStyle")
    @NUInt
    public native long dateStyle();

    /**
     * defaultDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/defaultDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("defaultDate")
    public native NSDate defaultDate();

    /**
     * defaultFormatterBehavior</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/clm/NSDateFormatter/defaultFormatterBehavior">iOS Dev Center</a>
     */
    @Generated
    @Selector("defaultFormatterBehavior")
    @NUInt
    public static native long defaultFormatterBehavior();

    /**
     * doesRelativeDateFormatting</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/doesRelativeDateFormatting">iOS Dev Center</a>
     */
    @Generated
    @Selector("doesRelativeDateFormatting")
    public native boolean doesRelativeDateFormatting();

    /**
     * eraSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/eraSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("eraSymbols")
    public native NSArray<String> eraSymbols();

    /**
     * formatterBehavior</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/formatterBehavior">iOS Dev Center</a>
     */
    @Generated
    @Selector("formatterBehavior")
    @NUInt
    public native long formatterBehavior();

    @Generated
    @Selector("formattingContext")
    @NInt
    public native long formattingContext();

    /**
     * generatesCalendarDates</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/generatesCalendarDates">iOS Dev Center</a>
     */
    @Generated
    @Selector("generatesCalendarDates")
    public native boolean generatesCalendarDates();

    /**
     * getObjectValue:forString:range:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instm/NSDateFormatter/getObjectValue:forString:range:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getObjectValue:forString:range:error:")
    public native boolean getObjectValueForStringRangeError(Ptr<ObjCObject> obj, String string, NSRange rangep,
            Ptr<NSError> error);

    /**
     * gregorianStartDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/gregorianStartDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("gregorianStartDate")
    public native NSDate gregorianStartDate();

    @Generated
    @Selector("init")
    public native NSDateFormatter init();

    /**
     * lenient</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/lenient">iOS Dev Center</a>
     */
    @Generated
    @Selector("isLenient")
    public native boolean isLenient();

    /**
     * locale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/locale">iOS Dev Center</a>
     */
    @Generated
    @Selector("locale")
    public native NSLocale locale();

    /**
     * localizedStringFromDate:dateStyle:timeStyle:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/clm/NSDateFormatter/localizedStringFromDate:dateStyle:timeStyle:">iOS Dev Center</a>
     */
    @Generated
    @Selector("localizedStringFromDate:dateStyle:timeStyle:")
    public static native String localizedStringFromDateDateStyleTimeStyle(NSDate date, @NUInt long dstyle,
            @NUInt long tstyle);

    /**
     * longEraSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/longEraSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("longEraSymbols")
    public native NSArray<String> longEraSymbols();

    /**
     * monthSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/monthSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("monthSymbols")
    public native NSArray<String> monthSymbols();

    /**
     * quarterSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/quarterSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("quarterSymbols")
    public native NSArray<String> quarterSymbols();

    /**
     * AMSymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/AMSymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAMSymbol:")
    public native void setAMSymbol(String value);

    /**
     * calendar</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/calendar">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCalendar:")
    public native void setCalendar(NSCalendar value);

    /**
     * dateFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/dateFormat">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDateFormat:")
    public native void setDateFormat(String value);

    /**
     * dateStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/dateStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDateStyle:")
    public native void setDateStyle(@NUInt long value);

    /**
     * defaultDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/defaultDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDefaultDate:")
    public native void setDefaultDate(NSDate value);

    /**
     * setDefaultFormatterBehavior:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/clm/NSDateFormatter/setDefaultFormatterBehavior:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDefaultFormatterBehavior:")
    public static native void setDefaultFormatterBehavior(@NUInt long behavior);

    /**
     * doesRelativeDateFormatting</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/doesRelativeDateFormatting">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDoesRelativeDateFormatting:")
    public native void setDoesRelativeDateFormatting(boolean value);

    /**
     * eraSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/eraSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEraSymbols:")
    public native void setEraSymbols(NSArray<String> value);

    /**
     * formatterBehavior</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/formatterBehavior">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFormatterBehavior:")
    public native void setFormatterBehavior(@NUInt long value);

    @Generated
    @Selector("setFormattingContext:")
    public native void setFormattingContext(@NInt long value);

    /**
     * generatesCalendarDates</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/generatesCalendarDates">iOS Dev Center</a>
     */
    @Generated
    @Selector("setGeneratesCalendarDates:")
    public native void setGeneratesCalendarDates(boolean value);

    /**
     * gregorianStartDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/gregorianStartDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setGregorianStartDate:")
    public native void setGregorianStartDate(NSDate value);

    /**
     * lenient</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/lenient">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLenient:")
    public native void setLenient(boolean value);

    /**
     * locale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/locale">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLocale:")
    public native void setLocale(NSLocale value);

    /**
     * setLocalizedDateFormatFromTemplate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instm/NSDateFormatter/setLocalizedDateFormatFromTemplate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLocalizedDateFormatFromTemplate:")
    public native void setLocalizedDateFormatFromTemplate(String dateFormatTemplate);

    /**
     * longEraSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/longEraSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLongEraSymbols:")
    public native void setLongEraSymbols(NSArray<String> value);

    /**
     * monthSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/monthSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMonthSymbols:")
    public native void setMonthSymbols(NSArray<String> value);

    /**
     * PMSymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/PMSymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPMSymbol:")
    public native void setPMSymbol(String value);

    /**
     * quarterSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/quarterSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("setQuarterSymbols:")
    public native void setQuarterSymbols(NSArray<String> value);

    /**
     * shortMonthSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/shortMonthSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShortMonthSymbols:")
    public native void setShortMonthSymbols(NSArray<String> value);

    /**
     * shortQuarterSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/shortQuarterSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShortQuarterSymbols:")
    public native void setShortQuarterSymbols(NSArray<String> value);

    /**
     * shortStandaloneMonthSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/shortStandaloneMonthSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShortStandaloneMonthSymbols:")
    public native void setShortStandaloneMonthSymbols(NSArray<String> value);

    /**
     * shortStandaloneQuarterSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/shortStandaloneQuarterSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShortStandaloneQuarterSymbols:")
    public native void setShortStandaloneQuarterSymbols(NSArray<String> value);

    /**
     * shortStandaloneWeekdaySymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/shortStandaloneWeekdaySymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShortStandaloneWeekdaySymbols:")
    public native void setShortStandaloneWeekdaySymbols(NSArray<String> value);

    /**
     * shortWeekdaySymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/shortWeekdaySymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShortWeekdaySymbols:")
    public native void setShortWeekdaySymbols(NSArray<String> value);

    /**
     * standaloneMonthSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/standaloneMonthSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("setStandaloneMonthSymbols:")
    public native void setStandaloneMonthSymbols(NSArray<String> value);

    /**
     * standaloneQuarterSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/standaloneQuarterSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("setStandaloneQuarterSymbols:")
    public native void setStandaloneQuarterSymbols(NSArray<String> value);

    /**
     * standaloneWeekdaySymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/standaloneWeekdaySymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("setStandaloneWeekdaySymbols:")
    public native void setStandaloneWeekdaySymbols(NSArray<String> value);

    /**
     * timeStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/timeStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTimeStyle:")
    public native void setTimeStyle(@NUInt long value);

    /**
     * timeZone</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/timeZone">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTimeZone:")
    public native void setTimeZone(NSTimeZone value);

    /**
     * twoDigitStartDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/twoDigitStartDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTwoDigitStartDate:")
    public native void setTwoDigitStartDate(NSDate value);

    /**
     * veryShortMonthSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/veryShortMonthSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("setVeryShortMonthSymbols:")
    public native void setVeryShortMonthSymbols(NSArray<String> value);

    /**
     * veryShortStandaloneMonthSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/veryShortStandaloneMonthSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("setVeryShortStandaloneMonthSymbols:")
    public native void setVeryShortStandaloneMonthSymbols(NSArray<String> value);

    /**
     * veryShortStandaloneWeekdaySymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/veryShortStandaloneWeekdaySymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("setVeryShortStandaloneWeekdaySymbols:")
    public native void setVeryShortStandaloneWeekdaySymbols(NSArray<String> value);

    /**
     * veryShortWeekdaySymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/veryShortWeekdaySymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("setVeryShortWeekdaySymbols:")
    public native void setVeryShortWeekdaySymbols(NSArray<String> value);

    /**
     * weekdaySymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/weekdaySymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("setWeekdaySymbols:")
    public native void setWeekdaySymbols(NSArray<String> value);

    /**
     * shortMonthSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/shortMonthSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("shortMonthSymbols")
    public native NSArray<String> shortMonthSymbols();

    /**
     * shortQuarterSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/shortQuarterSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("shortQuarterSymbols")
    public native NSArray<String> shortQuarterSymbols();

    /**
     * shortStandaloneMonthSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/shortStandaloneMonthSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("shortStandaloneMonthSymbols")
    public native NSArray<String> shortStandaloneMonthSymbols();

    /**
     * shortStandaloneQuarterSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/shortStandaloneQuarterSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("shortStandaloneQuarterSymbols")
    public native NSArray<String> shortStandaloneQuarterSymbols();

    /**
     * shortStandaloneWeekdaySymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/shortStandaloneWeekdaySymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("shortStandaloneWeekdaySymbols")
    public native NSArray<String> shortStandaloneWeekdaySymbols();

    /**
     * shortWeekdaySymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/shortWeekdaySymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("shortWeekdaySymbols")
    public native NSArray<String> shortWeekdaySymbols();

    /**
     * standaloneMonthSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/standaloneMonthSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("standaloneMonthSymbols")
    public native NSArray<String> standaloneMonthSymbols();

    /**
     * standaloneQuarterSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/standaloneQuarterSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("standaloneQuarterSymbols")
    public native NSArray<String> standaloneQuarterSymbols();

    /**
     * standaloneWeekdaySymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/standaloneWeekdaySymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("standaloneWeekdaySymbols")
    public native NSArray<String> standaloneWeekdaySymbols();

    /**
     * stringFromDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instm/NSDateFormatter/stringFromDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringFromDate:")
    public native String stringFromDate(NSDate date);

    /**
     * timeStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/timeStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("timeStyle")
    @NUInt
    public native long timeStyle();

    /**
     * timeZone</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/timeZone">iOS Dev Center</a>
     */
    @Generated
    @Selector("timeZone")
    public native NSTimeZone timeZone();

    /**
     * twoDigitStartDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/twoDigitStartDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("twoDigitStartDate")
    public native NSDate twoDigitStartDate();

    /**
     * veryShortMonthSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/veryShortMonthSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("veryShortMonthSymbols")
    public native NSArray<String> veryShortMonthSymbols();

    /**
     * veryShortStandaloneMonthSymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/veryShortStandaloneMonthSymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("veryShortStandaloneMonthSymbols")
    public native NSArray<String> veryShortStandaloneMonthSymbols();

    /**
     * veryShortStandaloneWeekdaySymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/veryShortStandaloneWeekdaySymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("veryShortStandaloneWeekdaySymbols")
    public native NSArray<String> veryShortStandaloneWeekdaySymbols();

    /**
     * veryShortWeekdaySymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/veryShortWeekdaySymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("veryShortWeekdaySymbols")
    public native NSArray<String> veryShortWeekdaySymbols();

    /**
     * weekdaySymbols</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateFormatter_Class/index.html#//apple_ref/occ/instp/NSDateFormatter/weekdaySymbols">iOS Dev Center</a>
     */
    @Generated
    @Selector("weekdaySymbols")
    public native NSArray<String> weekdaySymbols();

    @Generated
    @Selector("initWithCoder:")
    public native NSDateFormatter initWithCoder(NSCoder aDecoder);

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
