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

/**
 * NSDateComponentsFormatter provides locale-correct and flexible string formatting of quantities of time, such as "1 day" or "1h 10m", as specified by NSDateComponents. For formatting intervals of time (such as "2PM to 5PM"), see NSDateIntervalFormatter. NSDateComponentsFormatter is thread-safe, in that calling methods on it from multiple threads will not cause crashes or incorrect results, but it makes no attempt to prevent confusion when one thread sets something and another thread isn't expecting it to change.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDateComponentsFormatter extends NSFormatter {
    static {
        NatJ.register();
    }

    @Generated
    protected NSDateComponentsFormatter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSDateComponentsFormatter alloc();

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
    @Selector("localizedStringFromDateComponents:unitsStyle:")
    public static native String localizedStringFromDateComponentsUnitsStyle(NSDateComponents components,
            @NInt long unitsStyle);

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

    /**
     * Bitmask of units to include. Set to 0 to get the default behavior. Note that, especially if the maximum number of units is low, unit collapsing is on, or zero dropping is on, not all allowed units may actually be used for a given NSDateComponents. Default value is the components of the passed-in NSDateComponents object, or years | months | weeks | days | hours | minutes | seconds if passed an NSTimeInterval or pair of NSDates.
     * <p>
     * Allowed units are:
     * <p>
     * NSCalendarUnitYear
     * NSCalendarUnitMonth
     * NSCalendarUnitWeekOfMonth (used to mean "quantity of weeks")
     * NSCalendarUnitDay
     * NSCalendarUnitHour
     * NSCalendarUnitMinute
     * NSCalendarUnitSecond
     * <p>
     * Specifying any other NSCalendarUnits will result in an exception.
     */
    @Generated
    @Selector("allowedUnits")
    @NUInt
    public native long allowedUnits();

    /**
     * Choose whether non-integer units should be used to handle display of values that can't be exactly represented with the allowed units. For example, if minutes aren't allowed, then "1h 30m" could be formatted as "1.5h". Default is NO.
     */
    @Generated
    @Selector("allowsFractionalUnits")
    public native boolean allowsFractionalUnits();

    /**
     * Specifies the locale and calendar to use for formatting date components that do not themselves have calendars. Defaults to NSAutoupdatingCurrentCalendar. If set to nil, uses the gregorian calendar with the en_US_POSIX locale.
     */
    @Generated
    @Selector("calendar")
    public native NSCalendar calendar();

    /**
     * Choose whether to express largest units just above the threshold for the next lowest unit as a larger quantity of the lower unit. For example: "1m 3s" vs "63s". Default is NO.
     */
    @Generated
    @Selector("collapsesLargestUnit")
    public native boolean collapsesLargestUnit();

    /**
     * Not yet supported.
     */
    @Generated
    @Selector("formattingContext")
    @NInt
    public native long formattingContext();

    /**
     * NSDateComponentsFormatter currently only implements formatting, not parsing. Until it implements parsing, this will always return NO.
     */
    @Generated
    @Selector("getObjectValue:forString:errorDescription:")
    public native boolean getObjectValueForStringErrorDescription(
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> obj, String string,
            @ReferenceInfo(type = NSString.class) Ptr<NSString> error);

    /**
     * Choose whether to indicate that the allowed units/insignificant units choices lead to inexact results. In some languages, simply prepending "about " to the string will produce incorrect results; this handles those cases correctly. Default is NO.
     */
    @Generated
    @Selector("includesApproximationPhrase")
    public native boolean includesApproximationPhrase();

    /**
     * Choose whether to produce strings like "35 minutes remaining". Default is NO.
     */
    @Generated
    @Selector("includesTimeRemainingPhrase")
    public native boolean includesTimeRemainingPhrase();

    @Generated
    @Selector("init")
    public native NSDateComponentsFormatter init();

    @Generated
    @Selector("initWithCoder:")
    public native NSDateComponentsFormatter initWithCoder(NSCoder coder);

    /**
     * Choose whether or not, and at which point, to round small units in large values to zero.
     * Examples:
     * 1h 10m 30s, maximumUnitCount set to 0: "1h 10m 30s"
     * 1h 10m 30s, maximumUnitCount set to 2: "1h 10m"
     * 10m 30s, maximumUnitCount set to 0: "10m 30s"
     * 10m 30s, maximumUnitCount set to 2: "10m 30s"
     * <p>
     * Default is 0, which is interpreted as unlimited.
     */
    @Generated
    @Selector("maximumUnitCount")
    @NInt
    public native long maximumUnitCount();

    /**
     * Bitmask of units to include. Set to 0 to get the default behavior. Note that, especially if the maximum number of units is low, unit collapsing is on, or zero dropping is on, not all allowed units may actually be used for a given NSDateComponents. Default value is the components of the passed-in NSDateComponents object, or years | months | weeks | days | hours | minutes | seconds if passed an NSTimeInterval or pair of NSDates.
     * <p>
     * Allowed units are:
     * <p>
     * NSCalendarUnitYear
     * NSCalendarUnitMonth
     * NSCalendarUnitWeekOfMonth (used to mean "quantity of weeks")
     * NSCalendarUnitDay
     * NSCalendarUnitHour
     * NSCalendarUnitMinute
     * NSCalendarUnitSecond
     * <p>
     * Specifying any other NSCalendarUnits will result in an exception.
     */
    @Generated
    @Selector("setAllowedUnits:")
    public native void setAllowedUnits(@NUInt long value);

    /**
     * Choose whether non-integer units should be used to handle display of values that can't be exactly represented with the allowed units. For example, if minutes aren't allowed, then "1h 30m" could be formatted as "1.5h". Default is NO.
     */
    @Generated
    @Selector("setAllowsFractionalUnits:")
    public native void setAllowsFractionalUnits(boolean value);

    /**
     * Specifies the locale and calendar to use for formatting date components that do not themselves have calendars. Defaults to NSAutoupdatingCurrentCalendar. If set to nil, uses the gregorian calendar with the en_US_POSIX locale.
     */
    @Generated
    @Selector("setCalendar:")
    public native void setCalendar(NSCalendar value);

    /**
     * Choose whether to express largest units just above the threshold for the next lowest unit as a larger quantity of the lower unit. For example: "1m 3s" vs "63s". Default is NO.
     */
    @Generated
    @Selector("setCollapsesLargestUnit:")
    public native void setCollapsesLargestUnit(boolean value);

    /**
     * Not yet supported.
     */
    @Generated
    @Selector("setFormattingContext:")
    public native void setFormattingContext(@NInt long value);

    /**
     * Choose whether to indicate that the allowed units/insignificant units choices lead to inexact results. In some languages, simply prepending "about " to the string will produce incorrect results; this handles those cases correctly. Default is NO.
     */
    @Generated
    @Selector("setIncludesApproximationPhrase:")
    public native void setIncludesApproximationPhrase(boolean value);

    /**
     * Choose whether to produce strings like "35 minutes remaining". Default is NO.
     */
    @Generated
    @Selector("setIncludesTimeRemainingPhrase:")
    public native void setIncludesTimeRemainingPhrase(boolean value);

    /**
     * Choose whether or not, and at which point, to round small units in large values to zero.
     * Examples:
     * 1h 10m 30s, maximumUnitCount set to 0: "1h 10m 30s"
     * 1h 10m 30s, maximumUnitCount set to 2: "1h 10m"
     * 10m 30s, maximumUnitCount set to 0: "10m 30s"
     * 10m 30s, maximumUnitCount set to 2: "10m 30s"
     * <p>
     * Default is 0, which is interpreted as unlimited.
     */
    @Generated
    @Selector("setMaximumUnitCount:")
    public native void setMaximumUnitCount(@NInt long value);

    /**
     * Choose how to indicate units. For example, 1h 10m vs 1:10. Default is NSDateComponentsFormatterUnitsStylePositional.
     */
    @Generated
    @Selector("setUnitsStyle:")
    public native void setUnitsStyle(@NInt long value);

    /**
     * Bitmask specifying how to handle zeros in units. This includes both padding and dropping zeros so that a consistent number digits are displayed, causing updating displays to remain more stable. Default is NSDateComponentsFormatterZeroFormattingBehaviorDefault.
     * <p>
     * If the combination of zero formatting behavior and style would lead to ambiguous date formats (for example, 1:10 meaning 1 hour, 10 seconds), NSDateComponentsFormatter will throw an exception.
     */
    @Generated
    @Selector("setZeroFormattingBehavior:")
    public native void setZeroFormattingBehavior(@NUInt long value);

    /**
     * 'obj' must be an instance of NSDateComponents.
     */
    @Generated
    @Selector("stringForObjectValue:")
    public native String stringForObjectValue(@Mapped(ObjCObjectMapper.class) Object obj);

    /**
     * Normally, NSDateComponentsFormatter will calculate as though counting from referenceDate (e.g. in February, 1 month formatted as a number of days will be 28). -stringFromDate:toDate: calculates from the passed-in startDate instead.
     * <p>
     * See 'allowedUnits' for how the default set of allowed units differs from -stringFromDateComponents:.
     * <p>
     * Note that this is still formatting the quantity of time between the dates, not the pair of dates itself. For strings like "Feb 22nd - Feb 28th", use NSDateIntervalFormatter.
     */
    @Generated
    @Selector("stringFromDate:toDate:")
    public native String stringFromDateToDate(NSDate startDate, NSDate endDate);

    /**
     * Convenience method for formatting an NSDateComponents object. This calculates the count of the unit(s) starting from referenceDate.
     */
    @Generated
    @Selector("stringFromDateComponents:")
    public native String stringFromDateComponents(NSDateComponents components);

    /**
     * Convenience method for formatting a number of seconds. See 'allowedUnits' for how the default set of allowed units differs from -stringFromDateComponents:. This calculates the count of the unit(s) from referenceDate to the passed-in time interval.
     */
    @Generated
    @Selector("stringFromTimeInterval:")
    public native String stringFromTimeInterval(double ti);

    /**
     * Choose how to indicate units. For example, 1h 10m vs 1:10. Default is NSDateComponentsFormatterUnitsStylePositional.
     */
    @Generated
    @Selector("unitsStyle")
    @NInt
    public native long unitsStyle();

    /**
     * Bitmask specifying how to handle zeros in units. This includes both padding and dropping zeros so that a consistent number digits are displayed, causing updating displays to remain more stable. Default is NSDateComponentsFormatterZeroFormattingBehaviorDefault.
     * <p>
     * If the combination of zero formatting behavior and style would lead to ambiguous date formats (for example, 1:10 meaning 1 hour, 10 seconds), NSDateComponentsFormatter will throw an exception.
     */
    @Generated
    @Selector("zeroFormattingBehavior")
    @NUInt
    public native long zeroFormattingBehavior();

    /**
     * Where units have variable length (number of days in a month, number of hours in a day, etc...), NSDateComponentsFormatter will calculate as though counting from the date specified by the referenceDate in the appropriate calendar. Defaults to [NSDate dateWithTimeIntervalSinceReferenceDate:0] at the time of the -stringForObjectValue: call if not set. Set to nil to get the default behavior.
     */
    @Generated
    @Selector("referenceDate")
    public native NSDate referenceDate();

    /**
     * Where units have variable length (number of days in a month, number of hours in a day, etc...), NSDateComponentsFormatter will calculate as though counting from the date specified by the referenceDate in the appropriate calendar. Defaults to [NSDate dateWithTimeIntervalSinceReferenceDate:0] at the time of the -stringForObjectValue: call if not set. Set to nil to get the default behavior.
     */
    @Generated
    @Selector("setReferenceDate:")
    public native void setReferenceDate(NSDate value);
}
