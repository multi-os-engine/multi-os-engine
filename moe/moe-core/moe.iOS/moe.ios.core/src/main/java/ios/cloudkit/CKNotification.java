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

package ios.cloudkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSDictionary;
import ios.foundation.NSNumber;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKNotification extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected CKNotification(Pointer peer) {
		super(peer);
	}

	/**
	 * alertActionLocalizationKey</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotification_class/index.html#//apple_ref/occ/instp/CKNotification/alertActionLocalizationKey">iOS Dev Center</a>
	 */
	@Generated
	@Selector("alertActionLocalizationKey")
	public native String alertActionLocalizationKey();

	/**
	 * alertBody</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotification_class/index.html#//apple_ref/occ/instp/CKNotification/alertBody">iOS Dev Center</a>
	 */
	@Generated
	@Selector("alertBody")
	public native String alertBody();

	/**
	 * alertLaunchImage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotification_class/index.html#//apple_ref/occ/instp/CKNotification/alertLaunchImage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("alertLaunchImage")
	public native String alertLaunchImage();

	/**
	 * alertLocalizationArgs</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotification_class/index.html#//apple_ref/occ/instp/CKNotification/alertLocalizationArgs">iOS Dev Center</a>
	 */
	@Generated
	@Selector("alertLocalizationArgs")
	public native NSArray<String> alertLocalizationArgs();

	/**
	 * alertLocalizationKey</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotification_class/index.html#//apple_ref/occ/instp/CKNotification/alertLocalizationKey">iOS Dev Center</a>
	 */
	@Generated
	@Selector("alertLocalizationKey")
	public native String alertLocalizationKey();

	@Generated
	@Owned
	@Selector("alloc")
	public static native CKNotification alloc();

	/**
	 * badge</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotification_class/index.html#//apple_ref/occ/instp/CKNotification/badge">iOS Dev Center</a>
	 */
	@Generated
	@Selector("badge")
	public native NSNumber badge();

	/**
	 * containerIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotification_class/index.html#//apple_ref/occ/instp/CKNotification/containerIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("containerIdentifier")
	public native String containerIdentifier();

	@Generated
	@Selector("init")
	public native CKNotification init();

	/**
	 * isPruned</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotification_class/index.html#//apple_ref/occ/instp/CKNotification/isPruned">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isPruned")
	public native boolean isPruned();

	/**
	 * notificationFromRemoteNotificationDictionary:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotification_class/index.html#//apple_ref/occ/clm/CKNotification/notificationFromRemoteNotificationDictionary:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("notificationFromRemoteNotificationDictionary:")
	public static native CKNotification notificationFromRemoteNotificationDictionary(
			NSDictionary<String, ? extends NSObject> notificationDictionary);

	/**
	 * notificationID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotification_class/index.html#//apple_ref/occ/instp/CKNotification/notificationID">iOS Dev Center</a>
	 */
	@Generated
	@Selector("notificationID")
	public native CKNotificationID notificationID();

	/**
	 * notificationType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotification_class/index.html#//apple_ref/occ/instp/CKNotification/notificationType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("notificationType")
	@NInt
	public native long notificationType();

	/**
	 * soundName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotification_class/index.html#//apple_ref/occ/instp/CKNotification/soundName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("soundName")
	public native String soundName();

	/**
	 * category</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotification_class/index.html#//apple_ref/occ/instp/CKNotification/category">iOS Dev Center</a>
	 */
	@Generated
	@Selector("category")
	public native String category();

	/**
	 * subscriptionID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotification_class/index.html#//apple_ref/occ/instp/CKNotification/subscriptionID">iOS Dev Center</a>
	 */
	@Generated
	@Selector("subscriptionID")
	public native String subscriptionID();

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
