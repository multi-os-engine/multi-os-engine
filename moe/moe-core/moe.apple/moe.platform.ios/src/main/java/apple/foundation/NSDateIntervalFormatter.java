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
 * NSDateIntervalFormatter is used to format the range between two NSDates in a locale-sensitive way.
 * NSDateIntervalFormatter returns nil and NO for all methods in NSFormatter.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDateIntervalFormatter extends NSFormatter {
    static {
        NatJ.register();
    }

    @Generated
    protected NSDateIntervalFormatter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSDateIntervalFormatter alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSDateIntervalFormatter allocWithZone(VoidPtr zone);

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
    public static native NSDateIntervalFormatter new_objc();

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
     * default is the calendar of the locale
     */
    @Generated
    @Selector("calendar")
    public native NSCalendar calendar();

    /**
     * default is NSDateIntervalFormatterNoStyle
     */
    @Generated
    @Selector("dateStyle")
    @NUInt
    public native long dateStyle();

    /**
     * default is an empty string
     */
    @Generated
    @Selector("dateTemplate")
    public native String dateTemplate();

    @Generated
    @Selector("init")
    public native NSDateIntervalFormatter init();

    @Generated
    @Selector("initWithCoder:")
    public native NSDateIntervalFormatter initWithCoder(NSCoder coder);

    /**
     * default is [NSLocale currentLocale]
     */
    @Generated
    @Selector("locale")
    public native NSLocale locale();

    /**
     * default is the calendar of the locale
     */
    @Generated
    @Selector("setCalendar:")
    public native void setCalendar(NSCalendar value);

    /**
     * default is NSDateIntervalFormatterNoStyle
     */
    @Generated
    @Selector("setDateStyle:")
    public native void setDateStyle(@NUInt long value);

    /**
     * default is an empty string
     */
    @Generated
    @Selector("setDateTemplate:")
    public native void setDateTemplate(String value);

    /**
     * default is [NSLocale currentLocale]
     */
    @Generated
    @Selector("setLocale:")
    public native void setLocale(NSLocale value);

    /**
     * default is NSDateIntervalFormatterNoStyle
     */
    @Generated
    @Selector("setTimeStyle:")
    public native void setTimeStyle(@NUInt long value);

    /**
     * default is [NSTimeZone defaultTimeZone]
     */
    @Generated
    @Selector("setTimeZone:")
    public native void setTimeZone(NSTimeZone value);

    /**
     * If the range smaller than the resolution specified by the dateTemplate, a single date format will be produced. If
     * the range is larger than the format specified by the dateTemplate, a locale-specific fallback will be used to
     * format the items missing from the pattern.
     * <p>
     * For example, if the range is 2010-03-04 07:56 - 2010-03-04 19:56 (12 hours)
     * - The pattern jm will produce
     * for en_US, "7:56 AM - 7:56 PM"
     * for en_GB, "7:56 - 19:56"
     * - The pattern MMMd will produce
     * for en_US, "Mar 4"
     * for en_GB, "4 Mar"
     * If the range is 2010-03-04 07:56 - 2010-03-08 16:11 (4 days, 8 hours, 15 minutes)
     * - The pattern jm will produce
     * for en_US, "3/4/2010 7:56 AM - 3/8/2010 4:11 PM"
     * for en_GB, "4/3/2010 7:56 - 8/3/2010 16:11"
     * - The pattern MMMd will produce
     * for en_US, "Mar 4-8"
     * for en_GB, "4-8 Mar"
     */
    @Generated
    @Selector("stringFromDate:toDate:")
    public native String stringFromDateToDate(NSDate fromDate, NSDate toDate);

    @Generated
    @Selector("stringFromDateInterval:")
    public native String stringFromDateInterval(NSDateInterval dateInterval);

    /**
     * default is NSDateIntervalFormatterNoStyle
     */
    @Generated
    @Selector("timeStyle")
    @NUInt
    public native long timeStyle();

    /**
     * default is [NSTimeZone defaultTimeZone]
     */
    @Generated
    @Selector("timeZone")
    public native NSTimeZone timeZone();
}
