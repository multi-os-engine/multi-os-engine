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

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDateComponents extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSDateComponents(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSDateComponents alloc();

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
    @Selector("calendar")
    public native NSCalendar calendar();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("date")
    public native NSDate date();

    @Generated
    @Selector("day")
    @NInt
    public native long day();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("era")
    @NInt
    public native long era();

    @Generated
    @Selector("hour")
    @NInt
    public native long hour();

    @Generated
    @Selector("init")
    public native NSDateComponents init();

    @Generated
    @Selector("initWithCoder:")
    public native NSDateComponents initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("isLeapMonth")
    public native boolean isLeapMonth();

    @Generated
    @Selector("setLeapMonth:")
    public native void setLeapMonth(boolean value);

    @Generated
    @Selector("isValidDate")
    public native boolean isValidDate();

    @Generated
    @Selector("isValidDateInCalendar:")
    public native boolean isValidDateInCalendar(NSCalendar calendar);

    @Generated
    @Selector("minute")
    @NInt
    public native long minute();

    @Generated
    @Selector("month")
    @NInt
    public native long month();

    @Generated
    @Selector("nanosecond")
    @NInt
    public native long nanosecond();

    @Generated
    @Selector("quarter")
    @NInt
    public native long quarter();

    @Generated
    @Selector("second")
    @NInt
    public native long second();

    @Generated
    @Selector("setCalendar:")
    public native void setCalendar(NSCalendar value);

    @Generated
    @Selector("setDay:")
    public native void setDay(@NInt long value);

    @Generated
    @Selector("setEra:")
    public native void setEra(@NInt long value);

    @Generated
    @Selector("setHour:")
    public native void setHour(@NInt long value);

    @Generated
    @Selector("setMinute:")
    public native void setMinute(@NInt long value);

    @Generated
    @Selector("setMonth:")
    public native void setMonth(@NInt long value);

    @Generated
    @Selector("setNanosecond:")
    public native void setNanosecond(@NInt long value);

    @Generated
    @Selector("setQuarter:")
    public native void setQuarter(@NInt long value);

    @Generated
    @Selector("setSecond:")
    public native void setSecond(@NInt long value);

    @Generated
    @Selector("setTimeZone:")
    public native void setTimeZone(NSTimeZone value);

    @Generated
    @Selector("setValue:forComponent:")
    public native void setValueForComponent(@NInt long value, @NUInt long unit);

    @Generated
    @Deprecated
    @Selector("setWeek:")
    public native void setWeek(@NInt long v);

    @Generated
    @Selector("setWeekOfMonth:")
    public native void setWeekOfMonth(@NInt long value);

    @Generated
    @Selector("setWeekOfYear:")
    public native void setWeekOfYear(@NInt long value);

    @Generated
    @Selector("setWeekday:")
    public native void setWeekday(@NInt long value);

    @Generated
    @Selector("setWeekdayOrdinal:")
    public native void setWeekdayOrdinal(@NInt long value);

    @Generated
    @Selector("setYear:")
    public native void setYear(@NInt long value);

    @Generated
    @Selector("setYearForWeekOfYear:")
    public native void setYearForWeekOfYear(@NInt long value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("timeZone")
    public native NSTimeZone timeZone();

    @Generated
    @Selector("valueForComponent:")
    @NInt
    public native long valueForComponent(@NUInt long unit);

    @Generated
    @Deprecated
    @Selector("week")
    @NInt
    public native long week();

    @Generated
    @Selector("weekOfMonth")
    @NInt
    public native long weekOfMonth();

    @Generated
    @Selector("weekOfYear")
    @NInt
    public native long weekOfYear();

    @Generated
    @Selector("weekday")
    @NInt
    public native long weekday();

    @Generated
    @Selector("weekdayOrdinal")
    @NInt
    public native long weekdayOrdinal();

    @Generated
    @Selector("year")
    @NInt
    public native long year();

    @Generated
    @Selector("yearForWeekOfYear")
    @NInt
    public native long yearForWeekOfYear();
}
