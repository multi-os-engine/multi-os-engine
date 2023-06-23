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
import org.jetbrains.annotations.NotNull;

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
     * address: an address dictionary obtained representing the address (kABPersonAddressProperty) of a person
     * (ABRecordRef)
     * addCountryName: whether to always include the country name in the address string, regardless of whether it is
     * specified
     * in the dictionary. If not specified by the user a localized country name will be added.
     * returns a formatted multi line string that contains the full address. The string is likely to contain line
     * endings.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use CNPostalAddressFormatter from Contacts.framework instead
     */
    @NotNull
    @Generated
    @Deprecated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABCreateStringWithAddressDictionary(@NotNull NSDictionary<?, ?> address,
            boolean addCountryName);

    /**
     * "namePrefix" NSString
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonNamePrefixProperty();

    /**
     * "givenName" NSString
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonGivenNameProperty();

    /**
     * "middleName" NSString
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonMiddleNameProperty();

    /**
     * "familyName" NSString
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonFamilyNameProperty();

    /**
     * "nameSuffix" NSString
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonNameSuffixProperty();

    /**
     * "previousFamilyName" NSString
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonPreviousFamilyNameProperty();

    /**
     * "nickname" NSString
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonNicknameProperty();

    /**
     * "phoneticGivenName" NSString
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonPhoneticGivenNameProperty();

    /**
     * "phoneticMiddleName" NSString
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonPhoneticMiddleNameProperty();

    /**
     * "phoneticFamilyName" NSString
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonPhoneticFamilyNameProperty();

    /**
     * "organizationName" NSString
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonOrganizationNameProperty();

    /**
     * "departmentName" NSString
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonDepartmentNameProperty();

    /**
     * "jobTitle" NSString
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonJobTitleProperty();

    /**
     * "birthday" NSDateComponents
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonBirthdayProperty();

    /**
     * "note" NSString
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonNoteProperty();

    /**
     * "phoneNumbers" array of LabeledValue with PhoneNumber values
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonPhoneNumbersProperty();

    /**
     * "emailAddresses" array of LabeledValue with NSString values
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonEmailAddressesProperty();

    /**
     * "urlAddresses" array of LabeledValue with NSString values
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonUrlAddressesProperty();

    /**
     * "dates" array of LabeledValue with NSDateComponents values
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonDatesProperty();

    /**
     * "instantMessageAddresses" array of LabeledValue with InstantMessageAddress values
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonInstantMessageAddressesProperty();

    /**
     * "relatedNames" array of LabeledValue with NSString values
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonRelatedNamesProperty();

    /**
     * "socialProfiles" array of LabeledValue with SocialProfile values
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonSocialProfilesProperty();

    /**
     * "postalAddresses" array of LabeledValue with PostalAddress values
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonPostalAddressesProperty();
}
