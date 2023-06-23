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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSDateFormatter alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSDateFormatter allocWithZone(VoidPtr zone);

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
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @Selector("dateFormatFromTemplate:options:locale:")
    public static native String dateFormatFromTemplateOptionsLocale(@NotNull String tmplate, @NUInt long opts,
            @Nullable NSLocale locale);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Attributes of an NSDateFormatter
     */
    @Generated
    @Selector("defaultFormatterBehavior")
    @NUInt
    public static native long defaultFormatterBehavior();

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

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("localizedStringFromDate:dateStyle:timeStyle:")
    public static native String localizedStringFromDateDateStyleTimeStyle(@NotNull NSDate date, @NUInt long dstyle,
            @NUInt long tstyle);

    @Generated
    @Owned
    @Selector("new")
    public static native NSDateFormatter new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Attributes of an NSDateFormatter
     */
    @Generated
    @Selector("setDefaultFormatterBehavior:")
    public static native void setDefaultFormatterBehavior(@NUInt long value);

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

    @Generated
    @Selector("AMSymbol")
    public native String AMSymbol();

    @Generated
    @Selector("PMSymbol")
    public native String PMSymbol();

    @Generated
    @Selector("calendar")
    public native NSCalendar calendar();

    @Generated
    @Selector("dateFormat")
    public native String dateFormat();

    @Nullable
    @Generated
    @Selector("dateFromString:")
    public native NSDate dateFromString(@NotNull String string);

    @Generated
    @Selector("dateStyle")
    @NUInt
    public native long dateStyle();

    @Nullable
    @Generated
    @Selector("defaultDate")
    public native NSDate defaultDate();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("doesRelativeDateFormatting")
    public native boolean doesRelativeDateFormatting();

    @Generated
    @Selector("eraSymbols")
    public native NSArray<String> eraSymbols();

    @Generated
    @Selector("formatterBehavior")
    @NUInt
    public native long formatterBehavior();

    /**
     * default is NSFormattingContextUnknown
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("formattingContext")
    @NInt
    public native long formattingContext();

    @Generated
    @Selector("generatesCalendarDates")
    public native boolean generatesCalendarDates();

    /**
     * Report the used range of the string and an NSError, in addition to the usual stuff from NSFormatter
     */
    @Generated
    @Selector("getObjectValue:forString:range:error:")
    public native boolean getObjectValueForStringRangeError(
            @Nullable @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> obj, @NotNull String string,
            @Nullable NSRange rangep, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @Selector("gregorianStartDate")
    public native NSDate gregorianStartDate();

    @Generated
    @Selector("init")
    public native NSDateFormatter init();

    @Generated
    @Selector("initWithCoder:")
    public native NSDateFormatter initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("isLenient")
    public native boolean isLenient();

    @Generated
    @Selector("setLenient:")
    public native void setLenient(boolean value);

    @Generated
    @Selector("locale")
    public native NSLocale locale();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("longEraSymbols")
    public native NSArray<String> longEraSymbols();

    @Generated
    @Selector("monthSymbols")
    public native NSArray<String> monthSymbols();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("quarterSymbols")
    public native NSArray<String> quarterSymbols();

    @Generated
    @Selector("setAMSymbol:")
    public native void setAMSymbol(String value);

    @Generated
    @Selector("setCalendar:")
    public native void setCalendar(NSCalendar value);

    @Generated
    @Selector("setDateFormat:")
    public native void setDateFormat(String value);

    @Generated
    @Selector("setDateStyle:")
    public native void setDateStyle(@NUInt long value);

    @Generated
    @Selector("setDefaultDate:")
    public native void setDefaultDate(@Nullable NSDate value);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("setDoesRelativeDateFormatting:")
    public native void setDoesRelativeDateFormatting(boolean value);

    @Generated
    @Selector("setEraSymbols:")
    public native void setEraSymbols(NSArray<String> value);

    @Generated
    @Selector("setFormatterBehavior:")
    public native void setFormatterBehavior(@NUInt long value);

    /**
     * default is NSFormattingContextUnknown
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setFormattingContext:")
    public native void setFormattingContext(@NInt long value);

    @Generated
    @Selector("setGeneratesCalendarDates:")
    public native void setGeneratesCalendarDates(boolean value);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("setGregorianStartDate:")
    public native void setGregorianStartDate(@Nullable NSDate value);

    @Generated
    @Selector("setLocale:")
    public native void setLocale(NSLocale value);

    /**
     * A convenient way to generate an appropriate localized date format, and set it, in a single operation.
     * 
     * Equivalent to, though not necessarily implemented as:
     * formatter.dateFormat = [NSDateFormatter dateFormatFromTemplate:dateFormatTemplate options:0
     * locale:formatter.locale];
     * 
     * Note that the template string is used only to specify which date format components should be included. Ordering
     * and other text will not be preserved.
     * The parameter is also not stored, or updated when the locale or other options change, just as with the
     * ‘dateFormat’ property.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setLocalizedDateFormatFromTemplate:")
    public native void setLocalizedDateFormatFromTemplate(@NotNull String dateFormatTemplate);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("setLongEraSymbols:")
    public native void setLongEraSymbols(NSArray<String> value);

    @Generated
    @Selector("setMonthSymbols:")
    public native void setMonthSymbols(NSArray<String> value);

    @Generated
    @Selector("setPMSymbol:")
    public native void setPMSymbol(String value);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("setQuarterSymbols:")
    public native void setQuarterSymbols(NSArray<String> value);

    @Generated
    @Selector("setShortMonthSymbols:")
    public native void setShortMonthSymbols(NSArray<String> value);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("setShortQuarterSymbols:")
    public native void setShortQuarterSymbols(NSArray<String> value);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("setShortStandaloneMonthSymbols:")
    public native void setShortStandaloneMonthSymbols(NSArray<String> value);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("setShortStandaloneQuarterSymbols:")
    public native void setShortStandaloneQuarterSymbols(NSArray<String> value);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("setShortStandaloneWeekdaySymbols:")
    public native void setShortStandaloneWeekdaySymbols(NSArray<String> value);

    @Generated
    @Selector("setShortWeekdaySymbols:")
    public native void setShortWeekdaySymbols(NSArray<String> value);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("setStandaloneMonthSymbols:")
    public native void setStandaloneMonthSymbols(NSArray<String> value);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("setStandaloneQuarterSymbols:")
    public native void setStandaloneQuarterSymbols(NSArray<String> value);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("setStandaloneWeekdaySymbols:")
    public native void setStandaloneWeekdaySymbols(NSArray<String> value);

    @Generated
    @Selector("setTimeStyle:")
    public native void setTimeStyle(@NUInt long value);

    @Generated
    @Selector("setTimeZone:")
    public native void setTimeZone(NSTimeZone value);

    @Generated
    @Selector("setTwoDigitStartDate:")
    public native void setTwoDigitStartDate(@Nullable NSDate value);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("setVeryShortMonthSymbols:")
    public native void setVeryShortMonthSymbols(NSArray<String> value);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("setVeryShortStandaloneMonthSymbols:")
    public native void setVeryShortStandaloneMonthSymbols(NSArray<String> value);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("setVeryShortStandaloneWeekdaySymbols:")
    public native void setVeryShortStandaloneWeekdaySymbols(NSArray<String> value);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("setVeryShortWeekdaySymbols:")
    public native void setVeryShortWeekdaySymbols(NSArray<String> value);

    @Generated
    @Selector("setWeekdaySymbols:")
    public native void setWeekdaySymbols(NSArray<String> value);

    @Generated
    @Selector("shortMonthSymbols")
    public native NSArray<String> shortMonthSymbols();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("shortQuarterSymbols")
    public native NSArray<String> shortQuarterSymbols();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("shortStandaloneMonthSymbols")
    public native NSArray<String> shortStandaloneMonthSymbols();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("shortStandaloneQuarterSymbols")
    public native NSArray<String> shortStandaloneQuarterSymbols();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("shortStandaloneWeekdaySymbols")
    public native NSArray<String> shortStandaloneWeekdaySymbols();

    @Generated
    @Selector("shortWeekdaySymbols")
    public native NSArray<String> shortWeekdaySymbols();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("standaloneMonthSymbols")
    public native NSArray<String> standaloneMonthSymbols();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("standaloneQuarterSymbols")
    public native NSArray<String> standaloneQuarterSymbols();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("standaloneWeekdaySymbols")
    public native NSArray<String> standaloneWeekdaySymbols();

    /**
     * Even though NSDateFormatter responds to the usual NSFormatter methods,
     * here are some convenience methods which are a little more obvious.
     */
    @NotNull
    @Generated
    @Selector("stringFromDate:")
    public native String stringFromDate(@NotNull NSDate date);

    @Generated
    @Selector("timeStyle")
    @NUInt
    public native long timeStyle();

    @Generated
    @Selector("timeZone")
    public native NSTimeZone timeZone();

    @Nullable
    @Generated
    @Selector("twoDigitStartDate")
    public native NSDate twoDigitStartDate();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("veryShortMonthSymbols")
    public native NSArray<String> veryShortMonthSymbols();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("veryShortStandaloneMonthSymbols")
    public native NSArray<String> veryShortStandaloneMonthSymbols();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("veryShortStandaloneWeekdaySymbols")
    public native NSArray<String> veryShortStandaloneWeekdaySymbols();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("veryShortWeekdaySymbols")
    public native NSArray<String> veryShortWeekdaySymbols();

    @Generated
    @Selector("weekdaySymbols")
    public native NSArray<String> weekdaySymbols();
}
