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

package ios.contacts;


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

import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.foundation.NSData;
import ios.foundation.NSDateComponents;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.contacts.protocol.CNKeyDescriptor;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSPredicate;
import ios.foundation.NSSet;

@Generated
@Library("Contacts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNMutableContact extends CNContact {
	static {
		NatJ.register();
	}

	@Generated
	protected CNMutableContact(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native CNMutableContact alloc();

	/**
	 * birthday</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/birthday">iOS Dev Center</a>
	 */
	@Generated
	@Selector("birthday")
	public native NSDateComponents birthday();

	/**
	 * contactRelations</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/contactRelations">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contactRelations")
	public native NSArray<? extends CNLabeledValue<CNContactRelation>> contactRelations();

	/**
	 * contactType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/contactType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contactType")
	@NInt
	public native long contactType();

	/**
	 * dates</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/dates">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dates")
	public native NSArray<? extends CNLabeledValue<NSDateComponents>> dates();

	/**
	 * departmentName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/departmentName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("departmentName")
	public native String departmentName();

	/**
	 * emailAddresses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/emailAddresses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("emailAddresses")
	public native NSArray<? extends CNLabeledValue<String>> emailAddresses();

	/**
	 * familyName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/familyName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("familyName")
	public native String familyName();

	/**
	 * givenName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/givenName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("givenName")
	public native String givenName();

	/**
	 * imageData</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/imageData">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageData")
	public native NSData imageData();

	@Generated
	@Selector("init")
	public native CNMutableContact init();

	/**
	 * instantMessageAddresses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/instantMessageAddresses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("instantMessageAddresses")
	public native NSArray<? extends CNLabeledValue<CNInstantMessageAddress>> instantMessageAddresses();

	/**
	 * jobTitle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/jobTitle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("jobTitle")
	public native String jobTitle();

	/**
	 * middleName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/middleName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("middleName")
	public native String middleName();

	/**
	 * namePrefix</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/namePrefix">iOS Dev Center</a>
	 */
	@Generated
	@Selector("namePrefix")
	public native String namePrefix();

	/**
	 * nameSuffix</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/nameSuffix">iOS Dev Center</a>
	 */
	@Generated
	@Selector("nameSuffix")
	public native String nameSuffix();

	/**
	 * nickname</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/nickname">iOS Dev Center</a>
	 */
	@Generated
	@Selector("nickname")
	public native String nickname();

	/**
	 * nonGregorianBirthday</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/nonGregorianBirthday">iOS Dev Center</a>
	 */
	@Generated
	@Selector("nonGregorianBirthday")
	public native NSDateComponents nonGregorianBirthday();

	/**
	 * note</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/note">iOS Dev Center</a>
	 */
	@Generated
	@Selector("note")
	public native String note();

	/**
	 * organizationName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/organizationName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("organizationName")
	public native String organizationName();

	/**
	 * phoneNumbers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/phoneNumbers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("phoneNumbers")
	public native NSArray<? extends CNLabeledValue<CNPhoneNumber>> phoneNumbers();

	/**
	 * phoneticFamilyName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/phoneticFamilyName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("phoneticFamilyName")
	public native String phoneticFamilyName();

	/**
	 * phoneticGivenName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/phoneticGivenName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("phoneticGivenName")
	public native String phoneticGivenName();

	/**
	 * phoneticMiddleName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/phoneticMiddleName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("phoneticMiddleName")
	public native String phoneticMiddleName();

	/**
	 * postalAddresses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/postalAddresses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("postalAddresses")
	public native NSArray<? extends CNLabeledValue<CNPostalAddress>> postalAddresses();

	/**
	 * previousFamilyName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/previousFamilyName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("previousFamilyName")
	public native String previousFamilyName();

	/**
	 * birthday</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/birthday">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBirthday:")
	public native void setBirthday(NSDateComponents value);

	/**
	 * contactRelations</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/contactRelations">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContactRelations:")
	public native void setContactRelations(NSArray<? extends CNLabeledValue<CNContactRelation>> value);

	/**
	 * contactType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/contactType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContactType:")
	public native void setContactType(@NInt long value);

	/**
	 * dates</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/dates">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDates:")
	public native void setDates(NSArray<? extends CNLabeledValue<NSDateComponents>> value);

	/**
	 * departmentName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/departmentName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDepartmentName:")
	public native void setDepartmentName(String value);

	/**
	 * emailAddresses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/emailAddresses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEmailAddresses:")
	public native void setEmailAddresses(NSArray<? extends CNLabeledValue<String>> value);

	/**
	 * familyName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/familyName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFamilyName:")
	public native void setFamilyName(String value);

	/**
	 * givenName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/givenName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setGivenName:")
	public native void setGivenName(String value);

	/**
	 * imageData</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/imageData">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setImageData:")
	public native void setImageData(NSData value);

	/**
	 * instantMessageAddresses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/instantMessageAddresses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setInstantMessageAddresses:")
	public native void setInstantMessageAddresses(NSArray<? extends CNLabeledValue<CNInstantMessageAddress>> value);

	/**
	 * jobTitle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/jobTitle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setJobTitle:")
	public native void setJobTitle(String value);

	/**
	 * middleName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/middleName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMiddleName:")
	public native void setMiddleName(String value);

	/**
	 * namePrefix</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/namePrefix">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setNamePrefix:")
	public native void setNamePrefix(String value);

	/**
	 * nameSuffix</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/nameSuffix">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setNameSuffix:")
	public native void setNameSuffix(String value);

	/**
	 * nickname</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/nickname">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setNickname:")
	public native void setNickname(String value);

	/**
	 * nonGregorianBirthday</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/nonGregorianBirthday">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setNonGregorianBirthday:")
	public native void setNonGregorianBirthday(NSDateComponents value);

	/**
	 * note</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/note">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setNote:")
	public native void setNote(String value);

	/**
	 * organizationName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/organizationName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setOrganizationName:")
	public native void setOrganizationName(String value);

	/**
	 * phoneNumbers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/phoneNumbers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPhoneNumbers:")
	public native void setPhoneNumbers(NSArray<? extends CNLabeledValue<CNPhoneNumber>> value);

	/**
	 * phoneticFamilyName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/phoneticFamilyName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPhoneticFamilyName:")
	public native void setPhoneticFamilyName(String value);

	/**
	 * phoneticGivenName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/phoneticGivenName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPhoneticGivenName:")
	public native void setPhoneticGivenName(String value);

	/**
	 * phoneticMiddleName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/phoneticMiddleName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPhoneticMiddleName:")
	public native void setPhoneticMiddleName(String value);

	/**
	 * postalAddresses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/postalAddresses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPostalAddresses:")
	public native void setPostalAddresses(NSArray<? extends CNLabeledValue<CNPostalAddress>> value);

	/**
	 * previousFamilyName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/previousFamilyName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPreviousFamilyName:")
	public native void setPreviousFamilyName(String value);

	/**
	 * socialProfiles</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/socialProfiles">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSocialProfiles:")
	public native void setSocialProfiles(NSArray<? extends CNLabeledValue<CNSocialProfile>> value);

	/**
	 * urlAddresses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/urlAddresses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setUrlAddresses:")
	public native void setUrlAddresses(NSArray<? extends CNLabeledValue<String>> value);

	/**
	 * socialProfiles</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/socialProfiles">iOS Dev Center</a>
	 */
	@Generated
	@Selector("socialProfiles")
	public native NSArray<? extends CNLabeledValue<CNSocialProfile>> socialProfiles();

	/**
	 * urlAddresses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNMutableContact_Class/index.html#//apple_ref/occ/instp/CNMutableContact/urlAddresses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("urlAddresses")
	public native NSArray<? extends CNLabeledValue<String>> urlAddresses();

	@Generated
	@Selector("initWithCoder:")
	public native CNMutableContact initWithCoder(NSCoder aDecoder);

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
	@Selector("comparatorForNameSortOrder:")
	@ObjCBlock(name = "call_comparatorForNameSortOrder_ret")
	public static native CNContact.Block_comparatorForNameSortOrder_ret comparatorForNameSortOrder(
			@NInt long sortOrder);

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("descriptorForAllComparatorKeys")
	@MappedReturn(ObjCObjectMapper.class)
	public static native CNKeyDescriptor descriptorForAllComparatorKeys();

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
	@Selector("localizedStringForKey:")
	public static native String localizedStringForKey(String key);

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("predicateForContactsInContainerWithIdentifier:")
	public static native NSPredicate predicateForContactsInContainerWithIdentifier(
			String containerIdentifier);

	@Generated
	@Selector("predicateForContactsInGroupWithIdentifier:")
	public static native NSPredicate predicateForContactsInGroupWithIdentifier(
			String groupIdentifier);

	@Generated
	@Selector("predicateForContactsMatchingName:")
	public static native NSPredicate predicateForContactsMatchingName(
			String name);

	@Generated
	@Selector("predicateForContactsWithIdentifiers:")
	public static native NSPredicate predicateForContactsWithIdentifiers(
			NSArray<String> identifiers);

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
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
