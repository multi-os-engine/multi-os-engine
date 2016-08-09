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

import ios.contacts.CNContact;
import ios.contacts.CNContactStore;
import ios.contacts.CNContainer;
import ios.contacts.CNGroup;
import ios.foundation.NSArray;
import ios.foundation.NSBundle;
import ios.foundation.NSCoder;
import ios.uikit.UIViewController;
import ios.contacts.protocol.CNKeyDescriptor;
import ios.contactsui.protocol.CNContactViewControllerDelegate;
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
public class CNContactViewController extends UIViewController {
	static {
		NatJ.register();
	}

	@Generated
	protected CNContactViewController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native CNContactViewController alloc();

	/**
	 * allowsActions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/instp/CNContactViewController/allowsActions">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allowsActions")
	public native boolean allowsActions();

	/**
	 * allowsEditing</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/instp/CNContactViewController/allowsEditing">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allowsEditing")
	public native boolean allowsEditing();

	/**
	 * alternateName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/instp/CNContactViewController/alternateName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("alternateName")
	public native String alternateName();

	/**
	 * contact</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/instp/CNContactViewController/contact">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contact")
	public native CNContact contact();

	/**
	 * contactStore</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/instp/CNContactViewController/contactStore">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contactStore")
	public native CNContactStore contactStore();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/instp/CNContactViewController/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native CNContactViewControllerDelegate delegate();

	/**
	 * descriptorForRequiredKeys</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/clm/CNContactViewController/descriptorForRequiredKeys">iOS Dev Center</a>
	 */
	@Generated
	@Selector("descriptorForRequiredKeys")
	@MappedReturn(ObjCObjectMapper.class)
	public static native CNKeyDescriptor descriptorForRequiredKeys();

	/**
	 * displayedPropertyKeys</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/instp/CNContactViewController/displayedPropertyKeys">iOS Dev Center</a>
	 */
	@Generated
	@Selector("displayedPropertyKeys")
	public native NSArray<?> displayedPropertyKeys();

	/**
	 * highlightPropertyWithKey:identifier:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/instm/CNContactViewController/highlightPropertyWithKey:identifier:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("highlightPropertyWithKey:identifier:")
	public native void highlightPropertyWithKeyIdentifier(String key, String identifier);

	@Generated
	@Selector("init")
	public native CNContactViewController init();

	@Generated
	@Selector("initWithCoder:")
	public native CNContactViewController initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithNibName:bundle:")
	public native CNContactViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

	/**
	 * message</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/instp/CNContactViewController/message">iOS Dev Center</a>
	 */
	@Generated
	@Selector("message")
	public native String message();

	@Generated
	@Selector("parentContainer")
	public native CNContainer parentContainer();

	/**
	 * parentGroup</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/instp/CNContactViewController/parentGroup">iOS Dev Center</a>
	 */
	@Generated
	@Selector("parentGroup")
	public native CNGroup parentGroup();

	/**
	 * allowsActions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/instp/CNContactViewController/allowsActions">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAllowsActions:")
	public native void setAllowsActions(boolean value);

	/**
	 * allowsEditing</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/instp/CNContactViewController/allowsEditing">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAllowsEditing:")
	public native void setAllowsEditing(boolean value);

	/**
	 * alternateName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/instp/CNContactViewController/alternateName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAlternateName:")
	public native void setAlternateName(String value);

	/**
	 * contactStore</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/instp/CNContactViewController/contactStore">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContactStore:")
	public native void setContactStore(CNContactStore value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/instp/CNContactViewController/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) CNContactViewControllerDelegate value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/instp/CNContactViewController/delegate">iOS Dev Center</a>
	 */
	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) CNContactViewControllerDelegate value) {
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
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/instp/CNContactViewController/displayedPropertyKeys">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDisplayedPropertyKeys:")
	public native void setDisplayedPropertyKeys(NSArray<?> value);

	/**
	 * message</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/instp/CNContactViewController/message">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMessage:")
	public native void setMessage(String value);

	@Generated
	@Selector("setParentContainer:")
	public native void setParentContainer(CNContainer value);

	/**
	 * parentGroup</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/instp/CNContactViewController/parentGroup">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setParentGroup:")
	public native void setParentGroup(CNGroup value);

	/**
	 * shouldShowLinkedContacts</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/instp/CNContactViewController/shouldShowLinkedContacts">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShouldShowLinkedContacts:")
	public native void setShouldShowLinkedContacts(boolean value);

	/**
	 * shouldShowLinkedContacts</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/instp/CNContactViewController/shouldShowLinkedContacts">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shouldShowLinkedContacts")
	public native boolean shouldShowLinkedContacts();

	/**
	 * viewControllerForContact:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/clm/CNContactViewController/viewControllerForContact:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("viewControllerForContact:")
	public static native CNContactViewController viewControllerForContact(CNContact contact);

	/**
	 * viewControllerForNewContact:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/clm/CNContactViewController/viewControllerForNewContact:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("viewControllerForNewContact:")
	public static native CNContactViewController viewControllerForNewContact(CNContact contact);

	/**
	 * viewControllerForUnknownContact:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewController_Class/index.html#//apple_ref/occ/clm/CNContactViewController/viewControllerForUnknownContact:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("viewControllerForUnknownContact:")
	public static native CNContactViewController viewControllerForUnknownContact(CNContact contact);

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
