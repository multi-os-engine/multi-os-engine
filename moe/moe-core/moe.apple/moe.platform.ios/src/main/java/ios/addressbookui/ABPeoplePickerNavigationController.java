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

package ios.addressbookui;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.foundation.NSArray;
import ios.foundation.NSBundle;
import ios.foundation.NSCoder;
import ios.foundation.NSNumber;
import ios.foundation.NSPredicate;
import ios.uikit.UINavigationController;
import ios.uikit.UIViewController;
import ios.addressbookui.protocol.ABPeoplePickerNavigationControllerDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.SEL;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("AddressBookUI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ABPeoplePickerNavigationController extends UINavigationController {
	static {
		NatJ.register();
	}

	@Generated
	protected ABPeoplePickerNavigationController(Pointer peer) {
		super(peer);
	}

	/**
	 * addressBook</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPeoplePickerNavigationController_Class/index.html#//apple_ref/occ/instp/ABPeoplePickerNavigationController/addressBook">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addressBook")
	public native ConstVoidPtr addressBook();

	@Generated
	@Owned
	@Selector("alloc")
	public static native ABPeoplePickerNavigationController alloc();

	/**
	 * displayedProperties</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPeoplePickerNavigationController_Class/index.html#//apple_ref/occ/instp/ABPeoplePickerNavigationController/displayedProperties">iOS Dev Center</a>
	 */
	@Generated
	@Selector("displayedProperties")
	public native NSArray<? extends NSNumber> displayedProperties();

	@Generated
	@Selector("init")
	public native ABPeoplePickerNavigationController init();

	@Generated
	@Selector("initWithNavigationBarClass:toolbarClass:")
	public native ABPeoplePickerNavigationController initWithNavigationBarClassToolbarClass(
			Class navigationBarClass, Class toolbarClass);

	@Generated
	@Selector("initWithNibName:bundle:")
	public native ABPeoplePickerNavigationController initWithNibNameBundle(
			String nibNameOrNil, NSBundle nibBundleOrNil);

	@Generated
	@Selector("initWithRootViewController:")
	public native ABPeoplePickerNavigationController initWithRootViewController(
			UIViewController rootViewController);

	/**
	 * peoplePickerDelegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPeoplePickerNavigationController_Class/index.html#//apple_ref/occ/instp/ABPeoplePickerNavigationController/peoplePickerDelegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("peoplePickerDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native ABPeoplePickerNavigationControllerDelegate peoplePickerDelegate();

	/**
	 * predicateForEnablingPerson</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPeoplePickerNavigationController_Class/index.html#//apple_ref/occ/instp/ABPeoplePickerNavigationController/predicateForEnablingPerson">iOS Dev Center</a>
	 */
	@Generated
	@Selector("predicateForEnablingPerson")
	public native NSPredicate predicateForEnablingPerson();

	/**
	 * predicateForSelectionOfPerson</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPeoplePickerNavigationController_Class/index.html#//apple_ref/occ/instp/ABPeoplePickerNavigationController/predicateForSelectionOfPerson">iOS Dev Center</a>
	 */
	@Generated
	@Selector("predicateForSelectionOfPerson")
	public native NSPredicate predicateForSelectionOfPerson();

	/**
	 * predicateForSelectionOfProperty</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPeoplePickerNavigationController_Class/index.html#//apple_ref/occ/instp/ABPeoplePickerNavigationController/predicateForSelectionOfProperty">iOS Dev Center</a>
	 */
	@Generated
	@Selector("predicateForSelectionOfProperty")
	public native NSPredicate predicateForSelectionOfProperty();

	/**
	 * addressBook</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPeoplePickerNavigationController_Class/index.html#//apple_ref/occ/instp/ABPeoplePickerNavigationController/addressBook">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAddressBook:")
	public native void setAddressBook(ConstVoidPtr value);

	/**
	 * displayedProperties</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPeoplePickerNavigationController_Class/index.html#//apple_ref/occ/instp/ABPeoplePickerNavigationController/displayedProperties">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDisplayedProperties:")
	public native void setDisplayedProperties(NSArray<? extends NSNumber> value);

	/**
	 * peoplePickerDelegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPeoplePickerNavigationController_Class/index.html#//apple_ref/occ/instp/ABPeoplePickerNavigationController/peoplePickerDelegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPeoplePickerDelegate:")
	public native void setPeoplePickerDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) ABPeoplePickerNavigationControllerDelegate value);

	/**
	 * peoplePickerDelegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPeoplePickerNavigationController_Class/index.html#//apple_ref/occ/instp/ABPeoplePickerNavigationController/peoplePickerDelegate">iOS Dev Center</a>
	 */
	@Generated
	public void setPeoplePickerDelegate(
			@Mapped(ObjCObjectMapper.class) ABPeoplePickerNavigationControllerDelegate value) {
		Object __old = peoplePickerDelegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setPeoplePickerDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	/**
	 * predicateForEnablingPerson</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPeoplePickerNavigationController_Class/index.html#//apple_ref/occ/instp/ABPeoplePickerNavigationController/predicateForEnablingPerson">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPredicateForEnablingPerson:")
	public native void setPredicateForEnablingPerson(NSPredicate value);

	/**
	 * predicateForSelectionOfPerson</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPeoplePickerNavigationController_Class/index.html#//apple_ref/occ/instp/ABPeoplePickerNavigationController/predicateForSelectionOfPerson">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPredicateForSelectionOfPerson:")
	public native void setPredicateForSelectionOfPerson(NSPredicate value);

	/**
	 * predicateForSelectionOfProperty</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPeoplePickerNavigationController_Class/index.html#//apple_ref/occ/instp/ABPeoplePickerNavigationController/predicateForSelectionOfProperty">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPredicateForSelectionOfProperty:")
	public native void setPredicateForSelectionOfProperty(NSPredicate value);

	@Generated
	@Selector("initWithCoder:")
	public native ABPeoplePickerNavigationController initWithCoder(NSCoder aDecoder);

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
