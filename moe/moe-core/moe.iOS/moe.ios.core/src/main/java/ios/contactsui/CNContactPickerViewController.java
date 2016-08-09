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

package ios.contactsui;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.foundation.NSArray;
import ios.foundation.NSBundle;
import ios.foundation.NSCoder;
import ios.foundation.NSPredicate;
import ios.uikit.UIViewController;
import ios.contactsui.protocol.CNContactPickerDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("ContactsUI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNContactPickerViewController extends UIViewController {
	static {
		NatJ.register();
	}

	@Generated
	protected CNContactPickerViewController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native CNContactPickerViewController alloc();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactPickerViewController_Class/index.html#//apple_ref/occ/instp/CNContactPickerViewController/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native CNContactPickerDelegate delegate();

	/**
	 * displayedPropertyKeys</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactPickerViewController_Class/index.html#//apple_ref/occ/instp/CNContactPickerViewController/displayedPropertyKeys">iOS Dev Center</a>
	 */
	@Generated
	@Selector("displayedPropertyKeys")
	public native NSArray<String> displayedPropertyKeys();

	@Generated
	@Selector("init")
	public native CNContactPickerViewController init();

	@Generated
	@Selector("initWithCoder:")
	public native CNContactPickerViewController initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithNibName:bundle:")
	public native CNContactPickerViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

	/**
	 * predicateForEnablingContact</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactPickerViewController_Class/index.html#//apple_ref/occ/instp/CNContactPickerViewController/predicateForEnablingContact">iOS Dev Center</a>
	 */
	@Generated
	@Selector("predicateForEnablingContact")
	public native NSPredicate predicateForEnablingContact();

	/**
	 * predicateForSelectionOfContact</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactPickerViewController_Class/index.html#//apple_ref/occ/instp/CNContactPickerViewController/predicateForSelectionOfContact">iOS Dev Center</a>
	 */
	@Generated
	@Selector("predicateForSelectionOfContact")
	public native NSPredicate predicateForSelectionOfContact();

	/**
	 * predicateForSelectionOfProperty</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactPickerViewController_Class/index.html#//apple_ref/occ/instp/CNContactPickerViewController/predicateForSelectionOfProperty">iOS Dev Center</a>
	 */
	@Generated
	@Selector("predicateForSelectionOfProperty")
	public native NSPredicate predicateForSelectionOfProperty();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactPickerViewController_Class/index.html#//apple_ref/occ/instp/CNContactPickerViewController/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) CNContactPickerDelegate value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactPickerViewController_Class/index.html#//apple_ref/occ/instp/CNContactPickerViewController/delegate">iOS Dev Center</a>
	 */
	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) CNContactPickerDelegate value) {
		Object __old = delegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	/**
	 * displayedPropertyKeys</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactPickerViewController_Class/index.html#//apple_ref/occ/instp/CNContactPickerViewController/displayedPropertyKeys">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDisplayedPropertyKeys:")
	public native void setDisplayedPropertyKeys(NSArray<String> value);

	/**
	 * predicateForEnablingContact</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactPickerViewController_Class/index.html#//apple_ref/occ/instp/CNContactPickerViewController/predicateForEnablingContact">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPredicateForEnablingContact:")
	public native void setPredicateForEnablingContact(NSPredicate value);

	/**
	 * predicateForSelectionOfContact</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactPickerViewController_Class/index.html#//apple_ref/occ/instp/CNContactPickerViewController/predicateForSelectionOfContact">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPredicateForSelectionOfContact:")
	public native void setPredicateForSelectionOfContact(NSPredicate value);

	/**
	 * predicateForSelectionOfProperty</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactPickerViewController_Class/index.html#//apple_ref/occ/instp/CNContactPickerViewController/predicateForSelectionOfProperty">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPredicateForSelectionOfProperty:")
	public native void setPredicateForSelectionOfProperty(NSPredicate value);

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("attemptRotationToDeviceOrientation")
	public static native void attemptRotationToDeviceOrientation();

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
	@Selector("clearTextInputContextIdentifier:")
	public static native void clearTextInputContextIdentifier(String identifier);

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
	@Selector("prepareInterstitialAds")
	public static native void prepareInterstitialAds();

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
