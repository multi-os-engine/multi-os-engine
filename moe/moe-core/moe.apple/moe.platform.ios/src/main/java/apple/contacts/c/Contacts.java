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
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelHome();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelWork();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelOther();

    /**
     * Additional email labels
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelEmailiCloud();

    /**
     * URL address labels
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelURLAddressHomePage();

    /**
     * Date labels
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelDateAnniversary();

    /**
     * Phone number labels
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelPhoneNumberiPhone();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelPhoneNumberMobile();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelPhoneNumberMain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelPhoneNumberHomeFax();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelPhoneNumberWorkFax();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelPhoneNumberOtherFax();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelPhoneNumberPager();

    /**
     * Properties that are always fetched. Can be used with key value coding and observing.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNPostalAddressStreetKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNPostalAddressCityKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNPostalAddressStateKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNPostalAddressPostalCodeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNPostalAddressCountryKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNPostalAddressISOCountryCodeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationFather();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationMother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationParent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationBrother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSister();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationChild();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationFriend();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSpouse();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationPartner();

    /**
     * Contact relation labels
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAssistant();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationManager();

    /**
     * Properties that are always fetched. Can be used with key value coding and observing.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileURLStringKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileUsernameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileUserIdentifierKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileServiceKey();

    /**
     * Social profile services.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileServiceFacebook();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileServiceFlickr();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileServiceLinkedIn();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileServiceMySpace();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileServiceSinaWeibo();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileServiceTencentWeibo();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileServiceTwitter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileServiceYelp();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNSocialProfileServiceGameCenter();

    /**
     * Properties that are always fetched. Can be used with key value coding and observing.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageAddressUsernameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageAddressServiceKey();

    /**
     * Instant message services.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageServiceAIM();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageServiceFacebook();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageServiceGaduGadu();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageServiceGoogleTalk();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageServiceICQ();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageServiceJabber();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageServiceMSN();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageServiceQQ();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNInstantMessageServiceSkype();

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
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactIdentifierKey();

    /**
     * Optional properties that can be fetched. Can be used with key value coding and observing.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactNamePrefixKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactGivenNameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactMiddleNameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactFamilyNameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactPreviousFamilyNameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactNameSuffixKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactNicknameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactOrganizationNameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactDepartmentNameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactJobTitleKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactPhoneticGivenNameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactPhoneticMiddleNameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactPhoneticFamilyNameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactPhoneticOrganizationNameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactBirthdayKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactNonGregorianBirthdayKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactNoteKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactImageDataKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactThumbnailImageDataKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactImageDataAvailableKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactTypeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactPhoneNumbersKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactEmailAddressesKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactPostalAddressesKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactDatesKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactUrlAddressesKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactRelationsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactSocialProfilesKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactInstantMessageAddressesKey();

    /**
     * @abstract Notification posted when changes occur in another CNContactStore.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContactStoreDidChangeNotification();

    /**
     * Properties that are always fetched. Can be used with key value coding and observing.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNGroupIdentifierKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNGroupNameKey();

    /**
     * Properties that are always fetched. Can be used with key value coding and observing.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContainerIdentifierKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNContainerNameKey();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNErrorDomain();

    /**
     * When available an array of one or more CNContact, CNGroup, CNContainer, CNSaveRequest, or CNFetchRequest objects for which the error code applies.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNErrorUserInfoAffectedRecordsKey();

    /**
     * When available an array of one or more NSString objects for which the error code applies.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNErrorUserInfoAffectedRecordIdentifiersKey();

    /**
     * An array of NSErrors for CNErrorCodeValidationMultipleErrors.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNErrorUserInfoValidationErrorsKey();

    /**
     * An array of key paths associated with a given error. For validation errors this will contain key paths to specific object properties.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNErrorUserInfoKeyPathsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNPostalAddressSubLocalityKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNPostalAddressSubAdministrativeAreaKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelSchool();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationColleague();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationTeacher();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSibling();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerSibling();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderSibling();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerSister();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungestSister();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderSister();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationEldestSister();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerBrother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungestBrother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderBrother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationEldestBrother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationMaleFriend();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationFemaleFriend();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationWife();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationHusband();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationMalePartner();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationFemalePartner();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGirlfriendOrBoyfriend();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGirlfriend();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationBoyfriend();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandparent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandmother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandmotherMothersMother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandmotherFathersMother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandfather();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandfatherMothersFather();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandfatherFathersFather();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGreatGrandparent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGreatGrandmother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGreatGrandfather();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandchild();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGranddaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGranddaughterDaughtersDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGranddaughterSonsDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandson();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandsonDaughtersSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandsonSonsSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGreatGrandchild();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGreatGranddaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGreatGrandson();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationParentInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationMotherInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationMotherInLawWifesMother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationMotherInLawHusbandsMother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationFatherInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationFatherInLawWifesFather();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationFatherInLawHusbandsFather();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCoParentInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCoMotherInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCoFatherInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSiblingInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerSiblingInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderSiblingInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSisterInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerSisterInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderSisterInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSisterInLawSpousesSister();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSisterInLawWifesSister();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSisterInLawHusbandsSister();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSisterInLawBrothersWife();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSisterInLawYoungerBrothersWife();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSisterInLawElderBrothersWife();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationBrotherInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerBrotherInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderBrotherInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationBrotherInLawSpousesBrother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationBrotherInLawHusbandsBrother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationBrotherInLawWifesBrother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationBrotherInLawSistersHusband();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationBrotherInLawYoungerSistersHusband();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationBrotherInLawElderSistersHusband();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSisterInLawWifesBrothersWife();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSisterInLawHusbandsBrothersWife();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationBrotherInLawWifesSistersHusband();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationBrotherInLawHusbandsSistersHusband();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCoSiblingInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCoSisterInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCoBrotherInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationChildInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationDaughterInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSonInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousin();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousin();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousin();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationMaleCousin();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationFemaleCousin();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinParentsSiblingsChild();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinParentsSiblingsSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinParentsSiblingsSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinParentsSiblingsSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinParentsSiblingsDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinParentsSiblingsDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinParentsSiblingsDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinMothersSistersDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinMothersSistersDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinMothersSistersDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinMothersSistersSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinMothersSistersSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinMothersSistersSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinMothersBrothersDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinMothersBrothersDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinMothersBrothersDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinMothersBrothersSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinMothersBrothersSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinMothersBrothersSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinFathersSistersDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinFathersSistersDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinFathersSistersDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinFathersSistersSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinFathersSistersSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinFathersSistersSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinFathersBrothersDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinFathersBrothersDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinFathersBrothersDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinFathersBrothersSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinFathersBrothersSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinFathersBrothersSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinGrandparentsSiblingsChild();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinGrandparentsSiblingsDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinGrandparentsSiblingsSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinMothersSiblingsSonOrFathersSistersSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinMothersSiblingsSonOrFathersSistersSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationYoungerCousinMothersSiblingsDaughterOrFathersSistersDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationElderCousinMothersSiblingsDaughterOrFathersSistersDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationParentsSibling();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationParentsYoungerSibling();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationParentsElderSibling();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationParentsSiblingMothersSibling();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationParentsSiblingMothersYoungerSibling();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationParentsSiblingMothersElderSibling();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationParentsSiblingFathersSibling();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationParentsSiblingFathersYoungerSibling();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationParentsSiblingFathersElderSibling();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAunt();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntParentsSister();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntParentsYoungerSister();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntParentsElderSister();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntFathersSister();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntFathersYoungerSister();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntFathersElderSister();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntFathersBrothersWife();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntFathersYoungerBrothersWife();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntFathersElderBrothersWife();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntMothersSister();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntMothersYoungerSister();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntMothersElderSister();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationAuntMothersBrothersWife();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandaunt();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleParentsBrother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleParentsYoungerBrother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleParentsElderBrother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleMothersBrother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleMothersYoungerBrother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleMothersElderBrother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleMothersSistersHusband();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleFathersBrother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleFathersYoungerBrother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleFathersElderBrother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleFathersSistersHusband();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleFathersYoungerSistersHusband();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationUncleFathersElderSistersHusband();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGranduncle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSiblingsChild();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNiece();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNieceSistersDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNieceBrothersDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNieceSistersDaughterOrWifesSiblingsDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNieceBrothersDaughterOrHusbandsSiblingsDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNephew();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNephewSistersSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNephewBrothersSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNephewBrothersSonOrHusbandsSiblingsSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNephewSistersSonOrWifesSiblingsSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandniece();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandnieceSistersGranddaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandnieceBrothersGranddaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandnephew();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandnephewSistersGrandson();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandnephewBrothersGrandson();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationStepparent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationStepfather();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationStepmother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationStepchild();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationStepson();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationStepdaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationStepbrother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationStepsister();

    /**
     * Additional international labels consisting of conjunctions of English terms:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationMotherInLawOrStepmother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationFatherInLawOrStepfather();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationDaughterInLawOrStepdaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSonInLawOrStepson();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationCousinOrSiblingsChild();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNieceOrCousin();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationNephewOrCousin();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandchildOrSiblingsChild();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGreatGrandchildOrSiblingsGrandchild();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationDaughterInLawOrSisterInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationSonInLawOrBrotherInLaw();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGranddaughterOrNiece();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CNLabelContactRelationGrandsonOrNephew();
}
