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

package apple.addressbookui.c;

import apple.foundation.NSDictionary;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("AddressBookUI")
@Runtime(CRuntime.class)
public final class AddressBookUI {
    static {
        NatJ.register();
    }

    @Generated
    private AddressBookUI() {
    }

    /**
     * address: an address dictionary obtained representing the address (kABPersonAddressProperty) of a person (ABRecordRef)
     * addCountryName: whether to always include the country name in the address string, regardless of whether it is specified
     *                 in the dictionary. If not specified by the user a localized country name will be added.
     * returns a formatted multi line string that contains the full address. The string is likely to contain line endings.
     */
    @Generated
    @Deprecated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABCreateStringWithAddressDictionary(NSDictionary<?, ?> address, boolean addCountryName);

    /**
     * "namePrefix"                 NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonNamePrefixProperty();

    /**
     * "givenName"                  NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonGivenNameProperty();

    /**
     * "middleName"                 NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonMiddleNameProperty();

    /**
     * "familyName"                 NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonFamilyNameProperty();

    /**
     * "nameSuffix"                 NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonNameSuffixProperty();

    /**
     * "previousFamilyName"         NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonPreviousFamilyNameProperty();

    /**
     * "nickname"                   NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonNicknameProperty();

    /**
     * "phoneticGivenName"          NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonPhoneticGivenNameProperty();

    /**
     * "phoneticMiddleName"         NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonPhoneticMiddleNameProperty();

    /**
     * "phoneticFamilyName"         NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonPhoneticFamilyNameProperty();

    /**
     * "organizationName"           NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonOrganizationNameProperty();

    /**
     * "departmentName"             NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonDepartmentNameProperty();

    /**
     * "jobTitle"                   NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonJobTitleProperty();

    /**
     * "birthday"                   NSDateComponents
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonBirthdayProperty();

    /**
     * "note"                       NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonNoteProperty();

    /**
     * "phoneNumbers"               array of LabeledValue with PhoneNumber values
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonPhoneNumbersProperty();

    /**
     * "emailAddresses"             array of LabeledValue with NSString values
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonEmailAddressesProperty();

    /**
     * "urlAddresses"               array of LabeledValue with NSString values
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonUrlAddressesProperty();

    /**
     * "dates"                      array of LabeledValue with NSDateComponents values
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonDatesProperty();

    /**
     * "instantMessageAddresses"    array of LabeledValue with InstantMessageAddress values
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonInstantMessageAddressesProperty();

    /**
     * "relatedNames"               array of LabeledValue with NSString values
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonRelatedNamesProperty();

    /**
     * "socialProfiles"             array of LabeledValue with SocialProfile values
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonSocialProfilesProperty();

    /**
     * "postalAddresses"            array of LabeledValue with PostalAddress values
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonPostalAddressesProperty();
}
