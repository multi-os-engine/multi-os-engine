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

package ios.homekit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSCalendar;
import ios.foundation.NSDate;
import ios.foundation.NSDateComponents;
import ios.foundation.NSError;
import ios.foundation.NSTimeZone;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HMTimerTrigger extends HMTrigger {
	static {
		NatJ.register();
	}

	@Generated
	protected HMTimerTrigger(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native HMTimerTrigger alloc();

	/**
	 * fireDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMTimerTrigger_Class/index.html#//apple_ref/occ/instp/HMTimerTrigger/fireDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fireDate")
	public native NSDate fireDate();

	@Generated
	@Selector("init")
	public native HMTimerTrigger init();

	/**
	 * initWithName:fireDate:timeZone:recurrence:recurrenceCalendar:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMTimerTrigger_Class/index.html#//apple_ref/occ/instm/HMTimerTrigger/initWithName:fireDate:timeZone:recurrence:recurrenceCalendar:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithName:fireDate:timeZone:recurrence:recurrenceCalendar:")
	public native HMTimerTrigger initWithNameFireDateTimeZoneRecurrenceRecurrenceCalendar(
			String name, NSDate fireDate, NSTimeZone timeZone,
			NSDateComponents recurrence, NSCalendar recurrenceCalendar);

	/**
	 * recurrence</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMTimerTrigger_Class/index.html#//apple_ref/occ/instp/HMTimerTrigger/recurrence">iOS Dev Center</a>
	 */
	@Generated
	@Selector("recurrence")
	public native NSDateComponents recurrence();

	/**
	 * recurrenceCalendar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMTimerTrigger_Class/index.html#//apple_ref/occ/instp/HMTimerTrigger/recurrenceCalendar">iOS Dev Center</a>
	 */
	@Generated
	@Selector("recurrenceCalendar")
	public native NSCalendar recurrenceCalendar();

	/**
	 * timeZone</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMTimerTrigger_Class/index.html#//apple_ref/occ/instp/HMTimerTrigger/timeZone">iOS Dev Center</a>
	 */
	@Generated
	@Selector("timeZone")
	public native NSTimeZone timeZone();

	/**
	 * updateFireDate:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMTimerTrigger_Class/index.html#//apple_ref/occ/instm/HMTimerTrigger/updateFireDate:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("updateFireDate:completionHandler:")
	public native void updateFireDateCompletionHandler(
			NSDate fireDate,
			@ObjCBlock(name = "call_updateFireDateCompletionHandler") Block_updateFireDateCompletionHandler completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_updateFireDateCompletionHandler {
		@Generated
		void call_updateFireDateCompletionHandler(NSError arg0);
	}

	/**
	 * updateRecurrence:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMTimerTrigger_Class/index.html#//apple_ref/occ/instm/HMTimerTrigger/updateRecurrence:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("updateRecurrence:completionHandler:")
	public native void updateRecurrenceCompletionHandler(
			NSDateComponents recurrence,
			@ObjCBlock(name = "call_updateRecurrenceCompletionHandler") Block_updateRecurrenceCompletionHandler completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_updateRecurrenceCompletionHandler {
		@Generated
		void call_updateRecurrenceCompletionHandler(NSError arg0);
	}

	/**
	 * updateTimeZone:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMTimerTrigger_Class/index.html#//apple_ref/occ/instm/HMTimerTrigger/updateTimeZone:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("updateTimeZone:completionHandler:")
	public native void updateTimeZoneCompletionHandler(
			NSTimeZone timeZone,
			@ObjCBlock(name = "call_updateTimeZoneCompletionHandler") Block_updateTimeZoneCompletionHandler completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_updateTimeZoneCompletionHandler {
		@Generated
		void call_updateTimeZoneCompletionHandler(NSError arg0);
	}

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
	public static native void load_objc();

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
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version();
}
