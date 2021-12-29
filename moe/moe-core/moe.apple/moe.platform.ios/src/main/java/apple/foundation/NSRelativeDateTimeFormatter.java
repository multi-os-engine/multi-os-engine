package apple.foundation;

import apple.NSObject;
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

/**
 * NSRelativeDateTimeFormatter provides locale-aware formatting of a relative date or time, such as "1 hour ago", "in 2 weeks", "yesterday", and "tomorrow." Note that the string produced by the formatter should only be used in a standalone manner as it may not be grammatically correct to embed the string in longer strings.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSRelativeDateTimeFormatter extends NSFormatter {
    static {
        NatJ.register();
    }

    @Generated
    protected NSRelativeDateTimeFormatter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSRelativeDateTimeFormatter alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSRelativeDateTimeFormatter allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Specifies the calendar to use for formatting values that do not have an inherent calendar of their own. Defaults to autoupdatingCurrentCalendar. Also resets to autoupdatingCurrentCalendar on assignment of nil.
     */
    @Generated
    @Selector("calendar")
    public native NSCalendar calendar();

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
     * Specifies how to describe a relative date. For example, "yesterday" vs "1 day ago" in English. Default is NSRelativeDateTimeFormatterStyleNumeric.
     */
    @Generated
    @Selector("dateTimeStyle")
    @NInt
    public native long dateTimeStyle();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Specifies the formatting context of the output. Default is NSFormattingContextUnknown.
     */
    @Generated
    @Selector("formattingContext")
    @NInt
    public native long formattingContext();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSRelativeDateTimeFormatter init();

    @Generated
    @Selector("initWithCoder:")
    public native NSRelativeDateTimeFormatter initWithCoder(NSCoder coder);

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

    /**
     * Specifies the locale of the output string. Defaults to and resets on assignment of nil to the calendar's locale.
     */
    @Generated
    @Selector("locale")
    public native NSLocale locale();

    /**
     * Formats the date interval from the reference date to the given date using the formatter's calendar.
     */
    @Generated
    @Selector("localizedStringForDate:relativeToDate:")
    public native String localizedStringForDateRelativeToDate(NSDate date, NSDate referenceDate);

    /**
     * Convenience method for formatting a relative time represented by an NSDateComponents object. Negative component values are evaluated as a date in the past. This method formats the value of the least granular unit in the NSDateComponents object, and does not provide a compound format of the date component.
     * <p>
     * Note this method only supports the following components: year, month, week of month, day, hour, minute, and second. The rest will be ignored.
     */
    @Generated
    @Selector("localizedStringFromDateComponents:")
    public native String localizedStringFromDateComponents(NSDateComponents dateComponents);

    /**
     * Convenience method for formatting a time interval using the formatter's calendar. Negative time interval is evaluated as a date in the past.
     */
    @Generated
    @Selector("localizedStringFromTimeInterval:")
    public native String localizedStringFromTimeInterval(double timeInterval);

    @Generated
    @Owned
    @Selector("new")
    public static native NSRelativeDateTimeFormatter new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Specifies the calendar to use for formatting values that do not have an inherent calendar of their own. Defaults to autoupdatingCurrentCalendar. Also resets to autoupdatingCurrentCalendar on assignment of nil.
     */
    @Generated
    @Selector("setCalendar:")
    public native void setCalendar(NSCalendar value);

    /**
     * Specifies how to describe a relative date. For example, "yesterday" vs "1 day ago" in English. Default is NSRelativeDateTimeFormatterStyleNumeric.
     */
    @Generated
    @Selector("setDateTimeStyle:")
    public native void setDateTimeStyle(@NInt long value);

    /**
     * Specifies the formatting context of the output. Default is NSFormattingContextUnknown.
     */
    @Generated
    @Selector("setFormattingContext:")
    public native void setFormattingContext(@NInt long value);

    /**
     * Specifies the locale of the output string. Defaults to and resets on assignment of nil to the calendar's locale.
     */
    @Generated
    @Selector("setLocale:")
    public native void setLocale(NSLocale value);

    /**
     * Specifies how to format the quantity or the name of the unit. For example, "1 day ago" vs "one day ago" in English. Default is NSRelativeDateTimeFormatterUnitsStyleFull.
     */
    @Generated
    @Selector("setUnitsStyle:")
    public native void setUnitsStyle(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Inherited from NSFormatter. 'obj' must be an instance of NSDate. Returns nil otherwise. When formatting a relative date using this method, the class uses -[NSDate date] as the reference date.
     */
    @Generated
    @Selector("stringForObjectValue:")
    public native String stringForObjectValue(@Mapped(ObjCObjectMapper.class) Object obj);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Specifies how to format the quantity or the name of the unit. For example, "1 day ago" vs "one day ago" in English. Default is NSRelativeDateTimeFormatterUnitsStyleFull.
     */
    @Generated
    @Selector("unitsStyle")
    @NInt
    public native long unitsStyle();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
