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

package ios.foundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDateComponents extends NSObject implements NSCopying,
		NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSDateComponents(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSDateComponents alloc();

	/**
	 * calendar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/calendar">iOS Dev Center</a>
	 */
	@Generated
	@Selector("calendar")
	public native NSCalendar calendar();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * date</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/date">iOS Dev Center</a>
	 */
	@Generated
	@Selector("date")
	public native NSDate date();

	/**
	 * day</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/day">iOS Dev Center</a>
	 */
	@Generated
	@Selector("day")
	@NInt
	public native long day();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * era</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/era">iOS Dev Center</a>
	 */
	@Generated
	@Selector("era")
	@NInt
	public native long era();

	/**
	 * hour</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/hour">iOS Dev Center</a>
	 */
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

	/**
	 * leapMonth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/leapMonth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isLeapMonth")
	public native boolean isLeapMonth();

	/**
	 * validDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/validDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isValidDate")
	public native boolean isValidDate();

	/**
	 * isValidDateInCalendar:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instm/NSDateComponents/isValidDateInCalendar:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isValidDateInCalendar:")
	public native boolean isValidDateInCalendar(NSCalendar calendar);

	/**
	 * minute</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/minute">iOS Dev Center</a>
	 */
	@Generated
	@Selector("minute")
	@NInt
	public native long minute();

	/**
	 * month</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/month">iOS Dev Center</a>
	 */
	@Generated
	@Selector("month")
	@NInt
	public native long month();

	/**
	 * nanosecond</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/nanosecond">iOS Dev Center</a>
	 */
	@Generated
	@Selector("nanosecond")
	@NInt
	public native long nanosecond();

	/**
	 * quarter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/quarter">iOS Dev Center</a>
	 */
	@Generated
	@Selector("quarter")
	@NInt
	public native long quarter();

	/**
	 * second</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/second">iOS Dev Center</a>
	 */
	@Generated
	@Selector("second")
	@NInt
	public native long second();

	/**
	 * calendar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/calendar">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCalendar:")
	public native void setCalendar(NSCalendar value);

	/**
	 * day</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/day">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDay:")
	public native void setDay(@NInt long value);

	/**
	 * era</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/era">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEra:")
	public native void setEra(@NInt long value);

	/**
	 * hour</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/hour">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHour:")
	public native void setHour(@NInt long value);

	/**
	 * leapMonth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/leapMonth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLeapMonth:")
	public native void setLeapMonth(boolean value);

	/**
	 * minute</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/minute">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMinute:")
	public native void setMinute(@NInt long value);

	/**
	 * month</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/month">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMonth:")
	public native void setMonth(@NInt long value);

	/**
	 * nanosecond</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/nanosecond">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setNanosecond:")
	public native void setNanosecond(@NInt long value);

	/**
	 * quarter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/quarter">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setQuarter:")
	public native void setQuarter(@NInt long value);

	/**
	 * second</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/second">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSecond:")
	public native void setSecond(@NInt long value);

	/**
	 * timeZone</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/timeZone">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTimeZone:")
	public native void setTimeZone(NSTimeZone value);

	/**
	 * setValue:forComponent:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instm/NSDateComponents/setValue:forComponent:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setValue:forComponent:")
	public native void setValueForComponent(@NInt long value, @NUInt long unit);

	/**
	 * setWeek:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instm/NSDateComponents/setWeek:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setWeek:")
	public native void setWeek(@NInt long v);

	/**
	 * weekOfMonth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/weekOfMonth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setWeekOfMonth:")
	public native void setWeekOfMonth(@NInt long value);

	/**
	 * weekOfYear</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/weekOfYear">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setWeekOfYear:")
	public native void setWeekOfYear(@NInt long value);

	/**
	 * weekday</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/weekday">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setWeekday:")
	public native void setWeekday(@NInt long value);

	/**
	 * weekdayOrdinal</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/weekdayOrdinal">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setWeekdayOrdinal:")
	public native void setWeekdayOrdinal(@NInt long value);

	/**
	 * year</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/year">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setYear:")
	public native void setYear(@NInt long value);

	/**
	 * yearForWeekOfYear</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/yearForWeekOfYear">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setYearForWeekOfYear:")
	public native void setYearForWeekOfYear(@NInt long value);

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
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/timeZone">iOS Dev Center</a>
	 */
	@Generated
	@Selector("timeZone")
	public native NSTimeZone timeZone();

	/**
	 * valueForComponent:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instm/NSDateComponents/valueForComponent:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueForComponent:")
	@NInt
	public native long valueForComponent(@NUInt long unit);

	/**
	 * week</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instm/NSDateComponents/week">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("week")
	@NInt
	public native long week();

	/**
	 * weekOfMonth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/weekOfMonth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("weekOfMonth")
	@NInt
	public native long weekOfMonth();

	/**
	 * weekOfYear</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/weekOfYear">iOS Dev Center</a>
	 */
	@Generated
	@Selector("weekOfYear")
	@NInt
	public native long weekOfYear();

	/**
	 * weekday</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/weekday">iOS Dev Center</a>
	 */
	@Generated
	@Selector("weekday")
	@NInt
	public native long weekday();

	/**
	 * weekdayOrdinal</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/weekdayOrdinal">iOS Dev Center</a>
	 */
	@Generated
	@Selector("weekdayOrdinal")
	@NInt
	public native long weekdayOrdinal();

	/**
	 * year</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/year">iOS Dev Center</a>
	 */
	@Generated
	@Selector("year")
	@NInt
	public native long year();

	/**
	 * yearForWeekOfYear</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDateComponents_Class/index.html#//apple_ref/occ/instp/NSDateComponents/yearForWeekOfYear">iOS Dev Center</a>
	 */
	@Generated
	@Selector("yearForWeekOfYear")
	@NInt
	public native long yearForWeekOfYear();

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
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

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
