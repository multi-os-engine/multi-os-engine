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

package ios.contacts.c;


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

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CNLabelEmailiCloud();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CNLabelURLAddressHomePage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CNLabelDateAnniversary();

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

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CNLabelContactRelationAssistant();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CNLabelContactRelationManager();

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

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CNInstantMessageAddressUsernameKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CNInstantMessageAddressServiceKey();

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

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CNContactIdentifierKey();

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

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CNContactStoreDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CNGroupIdentifierKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CNGroupNameKey();

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

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CNContactPropertyAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CNPostalAddressPropertyAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CNPostalAddressLocalizedPropertyNameAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CNErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CNErrorUserInfoAffectedRecordsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CNErrorUserInfoAffectedRecordIdentifiersKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CNErrorUserInfoValidationErrorsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CNErrorUserInfoKeyPathsKey();
}
