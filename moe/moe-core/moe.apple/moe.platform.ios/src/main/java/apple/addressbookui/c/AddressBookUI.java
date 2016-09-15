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
     * ABCreateStringWithAddressDictionary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/AddressBookUI_Functions/index.html#//apple_ref/c/func/ABCreateStringWithAddressDictionary">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABCreateStringWithAddressDictionary(NSDictionary<?, ?> address, boolean addCountryName);

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonNamePrefixProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonGivenNameProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonMiddleNameProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonFamilyNameProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonNameSuffixProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonPreviousFamilyNameProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonNicknameProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonPhoneticGivenNameProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonPhoneticMiddleNameProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonPhoneticFamilyNameProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonOrganizationNameProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonDepartmentNameProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonJobTitleProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonBirthdayProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonNoteProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonPhoneNumbersProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonEmailAddressesProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonUrlAddressesProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonDatesProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonInstantMessageAddressesProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonRelatedNamesProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonSocialProfilesProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ABPersonPostalAddressesProperty();
}
