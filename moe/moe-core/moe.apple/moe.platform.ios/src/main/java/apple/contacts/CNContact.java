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

package apple.contacts;

import apple.NSObject;
import apple.contacts.protocol.CNKeyDescriptor;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDateComponents;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSMutableCopying;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Contacts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNContact extends NSObject implements NSCopying, NSMutableCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CNContact(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native CNContact alloc();

    /**
     * areKeysAvailable:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instm/CNContact/areKeysAvailable:">iOS Dev Center</a>
     */
    @Generated
    @Selector("areKeysAvailable:")
    public native boolean areKeysAvailable(NSArray<?> keyDescriptors);

    /**
     * birthday</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/birthday">iOS Dev Center</a>
     */
    @Generated
    @Selector("birthday")
    public native NSDateComponents birthday();

    /**
     * comparatorForNameSortOrder:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/clm/CNContact/comparatorForNameSortOrder:">iOS Dev Center</a>
     */
    @Generated
    @Selector("comparatorForNameSortOrder:")
    @ObjCBlock(name = "call_comparatorForNameSortOrder_ret")
    public static native Block_comparatorForNameSortOrder_ret comparatorForNameSortOrder(@NInt long sortOrder);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_comparatorForNameSortOrder_ret {
        @Generated
        @NInt
        long call_comparatorForNameSortOrder_ret(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1);
    }

    /**
     * contactRelations</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/contactRelations">iOS Dev Center</a>
     */
    @Generated
    @Selector("contactRelations")
    public native NSArray<? extends CNLabeledValue<CNContactRelation>> contactRelations();

    /**
     * contactType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/contactType">iOS Dev Center</a>
     */
    @Generated
    @Selector("contactType")
    @NInt
    public native long contactType();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * dates</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/dates">iOS Dev Center</a>
     */
    @Generated
    @Selector("dates")
    public native NSArray<? extends CNLabeledValue<NSDateComponents>> dates();

    /**
     * departmentName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/departmentName">iOS Dev Center</a>
     */
    @Generated
    @Selector("departmentName")
    public native String departmentName();

    /**
     * descriptorForAllComparatorKeys</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/clm/CNContact/descriptorForAllComparatorKeys">iOS Dev Center</a>
     */
    @Generated
    @Selector("descriptorForAllComparatorKeys")
    @MappedReturn(ObjCObjectMapper.class)
    public static native CNKeyDescriptor descriptorForAllComparatorKeys();

    /**
     * emailAddresses</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/emailAddresses">iOS Dev Center</a>
     */
    @Generated
    @Selector("emailAddresses")
    public native NSArray<? extends CNLabeledValue<String>> emailAddresses();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * familyName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/familyName">iOS Dev Center</a>
     */
    @Generated
    @Selector("familyName")
    public native String familyName();

    /**
     * givenName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/givenName">iOS Dev Center</a>
     */
    @Generated
    @Selector("givenName")
    public native String givenName();

    /**
     * identifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/identifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    /**
     * imageData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/imageData">iOS Dev Center</a>
     */
    @Generated
    @Selector("imageData")
    public native NSData imageData();

    /**
     * imageDataAvailable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/imageDataAvailable">iOS Dev Center</a>
     */
    @Generated
    @Selector("imageDataAvailable")
    public native boolean imageDataAvailable();

    @Generated
    @Selector("init")
    public native CNContact init();

    @Generated
    @Selector("initWithCoder:")
    public native CNContact initWithCoder(NSCoder aDecoder);

    /**
     * instantMessageAddresses</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/instantMessageAddresses">iOS Dev Center</a>
     */
    @Generated
    @Selector("instantMessageAddresses")
    public native NSArray<? extends CNLabeledValue<CNInstantMessageAddress>> instantMessageAddresses();

    /**
     * isKeyAvailable:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instm/CNContact/isKeyAvailable:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isKeyAvailable:")
    public native boolean isKeyAvailable(String key);

    @Generated
    @Selector("isUnifiedWithContactWithIdentifier:")
    public native boolean isUnifiedWithContactWithIdentifier(String contactIdentifier);

    /**
     * jobTitle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/jobTitle">iOS Dev Center</a>
     */
    @Generated
    @Selector("jobTitle")
    public native String jobTitle();

    /**
     * localizedStringForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/clm/CNContact/localizedStringForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("localizedStringForKey:")
    public static native String localizedStringForKey(String key);

    /**
     * middleName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/middleName">iOS Dev Center</a>
     */
    @Generated
    @Selector("middleName")
    public native String middleName();

    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

    /**
     * namePrefix</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/namePrefix">iOS Dev Center</a>
     */
    @Generated
    @Selector("namePrefix")
    public native String namePrefix();

    /**
     * nameSuffix</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/nameSuffix">iOS Dev Center</a>
     */
    @Generated
    @Selector("nameSuffix")
    public native String nameSuffix();

    /**
     * nickname</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/nickname">iOS Dev Center</a>
     */
    @Generated
    @Selector("nickname")
    public native String nickname();

    /**
     * nonGregorianBirthday</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/nonGregorianBirthday">iOS Dev Center</a>
     */
    @Generated
    @Selector("nonGregorianBirthday")
    public native NSDateComponents nonGregorianBirthday();

    /**
     * note</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/note">iOS Dev Center</a>
     */
    @Generated
    @Selector("note")
    public native String note();

    /**
     * organizationName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/organizationName">iOS Dev Center</a>
     */
    @Generated
    @Selector("organizationName")
    public native String organizationName();

    /**
     * phoneNumbers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/phoneNumbers">iOS Dev Center</a>
     */
    @Generated
    @Selector("phoneNumbers")
    public native NSArray<? extends CNLabeledValue<CNPhoneNumber>> phoneNumbers();

    /**
     * phoneticFamilyName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/phoneticFamilyName">iOS Dev Center</a>
     */
    @Generated
    @Selector("phoneticFamilyName")
    public native String phoneticFamilyName();

    /**
     * phoneticGivenName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/phoneticGivenName">iOS Dev Center</a>
     */
    @Generated
    @Selector("phoneticGivenName")
    public native String phoneticGivenName();

    /**
     * phoneticMiddleName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/phoneticMiddleName">iOS Dev Center</a>
     */
    @Generated
    @Selector("phoneticMiddleName")
    public native String phoneticMiddleName();

    /**
     * postalAddresses</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/postalAddresses">iOS Dev Center</a>
     */
    @Generated
    @Selector("postalAddresses")
    public native NSArray<? extends CNLabeledValue<CNPostalAddress>> postalAddresses();

    /**
     * predicateForContactsInContainerWithIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/clm/CNContact/predicateForContactsInContainerWithIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForContactsInContainerWithIdentifier:")
    public static native NSPredicate predicateForContactsInContainerWithIdentifier(String containerIdentifier);

    /**
     * predicateForContactsInGroupWithIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/clm/CNContact/predicateForContactsInGroupWithIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForContactsInGroupWithIdentifier:")
    public static native NSPredicate predicateForContactsInGroupWithIdentifier(String groupIdentifier);

    /**
     * predicateForContactsMatchingName:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/clm/CNContact/predicateForContactsMatchingName:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForContactsMatchingName:")
    public static native NSPredicate predicateForContactsMatchingName(String name);

    /**
     * predicateForContactsWithIdentifiers:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/clm/CNContact/predicateForContactsWithIdentifiers:">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicateForContactsWithIdentifiers:")
    public static native NSPredicate predicateForContactsWithIdentifiers(NSArray<String> identifiers);

    /**
     * previousFamilyName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/previousFamilyName">iOS Dev Center</a>
     */
    @Generated
    @Selector("previousFamilyName")
    public native String previousFamilyName();

    /**
     * socialProfiles</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/socialProfiles">iOS Dev Center</a>
     */
    @Generated
    @Selector("socialProfiles")
    public native NSArray<? extends CNLabeledValue<CNSocialProfile>> socialProfiles();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * thumbnailImageData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/thumbnailImageData">iOS Dev Center</a>
     */
    @Generated
    @Selector("thumbnailImageData")
    public native NSData thumbnailImageData();

    /**
     * urlAddresses</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContact_Class/index.html#//apple_ref/occ/instp/CNContact/urlAddresses">iOS Dev Center</a>
     */
    @Generated
    @Selector("urlAddresses")
    public native NSArray<? extends CNLabeledValue<String>> urlAddresses();

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
    @Selector("initialize")
    public static native void initialize();

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
