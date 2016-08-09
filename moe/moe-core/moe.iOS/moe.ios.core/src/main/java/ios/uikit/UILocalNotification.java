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

package ios.uikit;


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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.corelocation.CLRegion;
import ios.foundation.NSCalendar;
import ios.foundation.NSCoder;
import ios.foundation.NSDate;
import ios.foundation.NSDictionary;
import ios.foundation.NSTimeZone;
import ios.foundation.protocol.NSCoding;
import ios.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UILocalNotification extends NSObject implements NSCopying,
		NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected UILocalNotification(Pointer peer) {
		super(peer);
	}

	/**
	 * alertAction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/alertAction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("alertAction")
	public native String alertAction();

	/**
	 * alertBody</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/alertBody">iOS Dev Center</a>
	 */
	@Generated
	@Selector("alertBody")
	public native String alertBody();

	/**
	 * alertLaunchImage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/alertLaunchImage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("alertLaunchImage")
	public native String alertLaunchImage();

	/**
	 * alertTitle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/alertTitle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("alertTitle")
	public native String alertTitle();

	@Generated
	@Owned
	@Selector("alloc")
	public static native UILocalNotification alloc();

	/**
	 * applicationIconBadgeNumber</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/applicationIconBadgeNumber">iOS Dev Center</a>
	 */
	@Generated
	@Selector("applicationIconBadgeNumber")
	@NInt
	public native long applicationIconBadgeNumber();

	/**
	 * category</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/category">iOS Dev Center</a>
	 */
	@Generated
	@Selector("category")
	public native String category();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * fireDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/fireDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fireDate")
	public native NSDate fireDate();

	/**
	 * hasAction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/hasAction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hasAction")
	public native boolean hasAction();

	@Generated
	@Selector("init")
	public native UILocalNotification init();

	@Generated
	@Selector("initWithCoder:")
	public native UILocalNotification initWithCoder(NSCoder aDecoder);

	/**
	 * region</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/region">iOS Dev Center</a>
	 */
	@Generated
	@Selector("region")
	public native CLRegion region();

	/**
	 * regionTriggersOnce</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/regionTriggersOnce">iOS Dev Center</a>
	 */
	@Generated
	@Selector("regionTriggersOnce")
	public native boolean regionTriggersOnce();

	/**
	 * repeatCalendar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/repeatCalendar">iOS Dev Center</a>
	 */
	@Generated
	@Selector("repeatCalendar")
	public native NSCalendar repeatCalendar();

	/**
	 * repeatInterval</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/repeatInterval">iOS Dev Center</a>
	 */
	@Generated
	@Selector("repeatInterval")
	@NUInt
	public native long repeatInterval();

	/**
	 * alertAction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/alertAction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAlertAction:")
	public native void setAlertAction(String value);

	/**
	 * alertBody</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/alertBody">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAlertBody:")
	public native void setAlertBody(String value);

	/**
	 * alertLaunchImage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/alertLaunchImage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAlertLaunchImage:")
	public native void setAlertLaunchImage(String value);

	/**
	 * alertTitle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/alertTitle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAlertTitle:")
	public native void setAlertTitle(String value);

	/**
	 * applicationIconBadgeNumber</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/applicationIconBadgeNumber">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setApplicationIconBadgeNumber:")
	public native void setApplicationIconBadgeNumber(@NInt long value);

	/**
	 * category</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/category">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCategory:")
	public native void setCategory(String value);

	/**
	 * fireDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/fireDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFireDate:")
	public native void setFireDate(NSDate value);

	/**
	 * hasAction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/hasAction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHasAction:")
	public native void setHasAction(boolean value);

	/**
	 * region</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/region">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRegion:")
	public native void setRegion(CLRegion value);

	/**
	 * regionTriggersOnce</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/regionTriggersOnce">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRegionTriggersOnce:")
	public native void setRegionTriggersOnce(boolean value);

	/**
	 * repeatCalendar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/repeatCalendar">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRepeatCalendar:")
	public native void setRepeatCalendar(NSCalendar value);

	/**
	 * repeatInterval</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/repeatInterval">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRepeatInterval:")
	public native void setRepeatInterval(@NUInt long value);

	/**
	 * soundName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/soundName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSoundName:")
	public native void setSoundName(String value);

	/**
	 * timeZone</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/timeZone">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTimeZone:")
	public native void setTimeZone(NSTimeZone value);

	/**
	 * userInfo</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/userInfo">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setUserInfo:")
	public native void setUserInfo(NSDictionary<?, ?> value);

	/**
	 * soundName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/soundName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("soundName")
	public native String soundName();

	/**
	 * timeZone</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/timeZone">iOS Dev Center</a>
	 */
	@Generated
	@Selector("timeZone")
	public native NSTimeZone timeZone();

	/**
	 * userInfo</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UILocalNotification_Class/index.html#//apple_ref/occ/instp/UILocalNotification/userInfo">iOS Dev Center</a>
	 */
	@Generated
	@Selector("userInfo")
	public native NSDictionary<?, ?> userInfo();

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
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
