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

package apple.contacts.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("Contacts")
@Runtime(CRuntime.class)
public final class Contacts {
    static {
        NatJ.register();
    }

    @Generated
    private Contacts() {
    }

    /**
     * Generic labels
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelHome();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelWork();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelOther();

    /**
     * Additional email labels
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelEmailiCloud();

    /**
     * URL address labels
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelURLAddressHomePage();

    /**
     * Date labels
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelDateAnniversary();

    /**
     * Phone number labels
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelPhoneNumberiPhone();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelPhoneNumberMobile();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelPhoneNumberMain();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelPhoneNumberHomeFax();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelPhoneNumberWorkFax();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelPhoneNumberOtherFax();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelPhoneNumberPager();

    /**
     * Properties that are always fetched. Can be used with key value coding and observing.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNPostalAddressStreetKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNPostalAddressCityKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNPostalAddressStateKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNPostalAddressPostalCodeKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNPostalAddressCountryKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNPostalAddressISOCountryCodeKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationFather();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationMother();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationParent();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationBrother();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSister();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationChild();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationFriend();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSpouse();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationPartner();

    /**
     * Contact relation labels
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAssistant();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationManager();

    /**
     * Properties that are always fetched. Can be used with key value coding and observing.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileURLStringKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileUsernameKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileUserIdentifierKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileServiceKey();

    /**
     * Social profile services.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileServiceFacebook();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileServiceFlickr();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileServiceLinkedIn();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileServiceMySpace();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileServiceSinaWeibo();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileServiceTencentWeibo();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileServiceTwitter();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileServiceYelp();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileServiceGameCenter();

    /**
     * Properties that are always fetched. Can be used with key value coding and observing.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageAddressUsernameKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageAddressServiceKey();

    /**
     * Instant message services.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageServiceAIM();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageServiceFacebook();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageServiceGaduGadu();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageServiceGoogleTalk();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageServiceICQ();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageServiceJabber();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageServiceMSN();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageServiceQQ();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageServiceSkype();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageServiceYahoo();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactPropertyNotFetchedExceptionName();

    /**
     * Properties that are always fetched. Can be used with key value coding and observing.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactIdentifierKey();

    /**
     * Optional properties that can be fetched. Can be used with key value coding and observing.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactNamePrefixKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactGivenNameKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactMiddleNameKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactFamilyNameKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactPreviousFamilyNameKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactNameSuffixKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactNicknameKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactOrganizationNameKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactDepartmentNameKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactJobTitleKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactPhoneticGivenNameKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactPhoneticMiddleNameKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactPhoneticFamilyNameKey();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactPhoneticOrganizationNameKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactBirthdayKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactNonGregorianBirthdayKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactNoteKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactImageDataKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactThumbnailImageDataKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactImageDataAvailableKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactTypeKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactPhoneNumbersKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactEmailAddressesKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactPostalAddressesKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactDatesKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactUrlAddressesKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactRelationsKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactSocialProfilesKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactInstantMessageAddressesKey();

    /**
     * Notification posted when changes occur in another CNContactStore.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactStoreDidChangeNotification();

    /**
     * Properties that are always fetched. Can be used with key value coding and observing.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNGroupIdentifierKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNGroupNameKey();

    /**
     * Properties that are always fetched. Can be used with key value coding and observing.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContainerIdentifierKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContainerNameKey();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContainerTypeKey();

    /**
     * Attribute key whose value is a CNContact name component property key.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactPropertyAttribute();

    /**
     * Attribute key whose value is a CNPostalAddress property key.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNPostalAddressPropertyAttribute();

    /**
     * Attribute key whose value is a localized version of the CNPostalAddress property key.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNPostalAddressLocalizedPropertyNameAttribute();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNErrorDomain();

    /**
     * When available an array of one or more CNContact, CNGroup, CNContainer, CNSaveRequest, or CNFetchRequest objects
     * for which the error code applies.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNErrorUserInfoAffectedRecordsKey();

    /**
     * When available an array of one or more NSString objects for which the error code applies.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNErrorUserInfoAffectedRecordIdentifiersKey();

    /**
     * An array of NSErrors for CNErrorCodeValidationMultipleErrors.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNErrorUserInfoValidationErrorsKey();

    /**
     * An array of key paths associated with a given error. For validation errors this will contain key paths to
     * specific object properties.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNErrorUserInfoKeyPathsKey();

    /**
     * API-Since: 10.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNPostalAddressSubLocalityKey();

    /**
     * API-Since: 10.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNPostalAddressSubAdministrativeAreaKey();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSon();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelSchool();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationColleague();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationTeacher();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSibling();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerSibling();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderSibling();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerSister();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungestSister();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderSister();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationEldestSister();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerBrother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungestBrother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderBrother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationEldestBrother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationMaleFriend();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationFemaleFriend();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationWife();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationHusband();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationMalePartner();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationFemalePartner();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGirlfriendOrBoyfriend();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGirlfriend();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationBoyfriend();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandparent();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandmother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandmotherMothersMother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandmotherFathersMother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandfather();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandfatherMothersFather();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandfatherFathersFather();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGreatGrandparent();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGreatGrandmother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGreatGrandfather();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandchild();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGranddaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGranddaughterDaughtersDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGranddaughterSonsDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandson();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandsonDaughtersSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandsonSonsSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGreatGrandchild();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGreatGranddaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGreatGrandson();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationParentInLaw();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationMotherInLaw();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationMotherInLawWifesMother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationMotherInLawHusbandsMother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationFatherInLaw();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationFatherInLawWifesFather();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationFatherInLawHusbandsFather();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCoParentInLaw();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCoMotherInLaw();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCoFatherInLaw();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSiblingInLaw();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerSiblingInLaw();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderSiblingInLaw();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSisterInLaw();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerSisterInLaw();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderSisterInLaw();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSisterInLawSpousesSister();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSisterInLawWifesSister();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSisterInLawHusbandsSister();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSisterInLawBrothersWife();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSisterInLawYoungerBrothersWife();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSisterInLawElderBrothersWife();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationBrotherInLaw();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerBrotherInLaw();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderBrotherInLaw();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationBrotherInLawSpousesBrother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationBrotherInLawHusbandsBrother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationBrotherInLawWifesBrother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationBrotherInLawSistersHusband();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationBrotherInLawYoungerSistersHusband();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationBrotherInLawElderSistersHusband();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSisterInLawWifesBrothersWife();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSisterInLawHusbandsBrothersWife();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationBrotherInLawWifesSistersHusband();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationBrotherInLawHusbandsSistersHusband();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCoSiblingInLaw();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCoSisterInLaw();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCoBrotherInLaw();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationChildInLaw();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationDaughterInLaw();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSonInLaw();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousin();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousin();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousin();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationMaleCousin();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationFemaleCousin();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinParentsSiblingsChild();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinParentsSiblingsSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinParentsSiblingsSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinParentsSiblingsSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinParentsSiblingsDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinParentsSiblingsDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinParentsSiblingsDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinMothersSistersDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinMothersSistersDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinMothersSistersDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinMothersSistersSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinMothersSistersSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinMothersSistersSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinMothersBrothersDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinMothersBrothersDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinMothersBrothersDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinMothersBrothersSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinMothersBrothersSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinMothersBrothersSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinFathersSistersDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinFathersSistersDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinFathersSistersDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinFathersSistersSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinFathersSistersSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinFathersSistersSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinFathersBrothersDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinFathersBrothersDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinFathersBrothersDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinFathersBrothersSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinFathersBrothersSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinFathersBrothersSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinGrandparentsSiblingsChild();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinGrandparentsSiblingsDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinGrandparentsSiblingsSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinMothersSiblingsSonOrFathersSistersSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinMothersSiblingsSonOrFathersSistersSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinMothersSiblingsDaughterOrFathersSistersDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinMothersSiblingsDaughterOrFathersSistersDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationParentsSibling();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationParentsYoungerSibling();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationParentsElderSibling();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationParentsSiblingMothersSibling();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationParentsSiblingMothersYoungerSibling();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationParentsSiblingMothersElderSibling();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationParentsSiblingFathersSibling();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationParentsSiblingFathersYoungerSibling();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationParentsSiblingFathersElderSibling();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAunt();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntParentsSister();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntParentsYoungerSister();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntParentsElderSister();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntFathersSister();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntFathersYoungerSister();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntFathersElderSister();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntFathersBrothersWife();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntFathersYoungerBrothersWife();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntFathersElderBrothersWife();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntMothersSister();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntMothersYoungerSister();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntMothersElderSister();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntMothersBrothersWife();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandaunt();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncle();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleParentsBrother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleParentsYoungerBrother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleParentsElderBrother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleMothersBrother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleMothersYoungerBrother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleMothersElderBrother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleMothersSistersHusband();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleFathersBrother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleFathersYoungerBrother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleFathersElderBrother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleFathersSistersHusband();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleFathersYoungerSistersHusband();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleFathersElderSistersHusband();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGranduncle();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSiblingsChild();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNiece();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNieceSistersDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNieceBrothersDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNieceSistersDaughterOrWifesSiblingsDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNieceBrothersDaughterOrHusbandsSiblingsDaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNephew();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNephewSistersSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNephewBrothersSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNephewBrothersSonOrHusbandsSiblingsSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNephewSistersSonOrWifesSiblingsSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandniece();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandnieceSistersGranddaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandnieceBrothersGranddaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandnephew();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandnephewSistersGrandson();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandnephewBrothersGrandson();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationStepparent();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationStepfather();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationStepmother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationStepchild();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationStepson();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationStepdaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationStepbrother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationStepsister();

    /**
     * Additional international labels consisting of conjunctions of English terms:
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationMotherInLawOrStepmother();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationFatherInLawOrStepfather();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationDaughterInLawOrStepdaughter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSonInLawOrStepson();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinOrSiblingsChild();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNieceOrCousin();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNephewOrCousin();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandchildOrSiblingsChild();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGreatGrandchildOrSiblingsGrandchild();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationDaughterInLawOrSisterInLaw();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSonInLawOrBrotherInLaw();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGranddaughterOrNiece();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandsonOrNephew();

    /**
     * API-Since: 14.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelPhoneNumberAppleWatch();
}
