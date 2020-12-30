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

package apple.addressbook.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class Enums {
    @Generated public static final int kABPersonType = 0x00000000;
    @Generated public static final int kABGroupType = 0x00000001;
    @Generated public static final int kABSourceType = 0x00000002;
    /**
     * deprecated, use CNErrorCodePolicyViolation
     */
    @Generated public static final int kABOperationNotPermittedByStoreError = 0x00000000;
    /**
     * deprecated, use CNErrorCodeAuthorizationDenied
     */
    @Generated public static final int kABOperationNotPermittedByUserError = 0x00000001;
    /**
     * deprecated, use CNContactSortOrderGivenName
     */
    @Generated public static final int kABPersonSortByFirstName = 0x00000000;
    /**
     * deprecated, use CNContactSortOrderFamilyName"
     */
    @Generated public static final int kABPersonSortByLastName = 0x00000001;
    /**
     * deprecated, use CNContainerTypeLocal
     */
    @Generated public static final int kABSourceTypeLocal = 0x00000000;
    /**
     * deprecated, used CNContainerTypeExchange
     */
    @Generated public static final int kABSourceTypeExchange = 0x00000001;
    /**
     * deprecated
     */
    @Generated public static final int kABSourceTypeExchangeGAL = 0x01000001;
    /**
     * deprecated
     */
    @Generated public static final int kABSourceTypeMobileMe = 0x00000002;
    /**
     * deprecated
     */
    @Generated public static final int kABSourceTypeLDAP = 0x01000003;
    /**
     * deprecated, use CNContainerTypeCardDAV
     */
    @Generated public static final int kABSourceTypeCardDAV = 0x00000004;
    /**
     * deprecated
     */
    @Generated public static final int kABSourceTypeCardDAVSearch = 0x01000004;
    /**
     * deprecated
     */
    @Generated public static final int kABPersonCompositeNameFormatFirstNameFirst = 0x00000000;
    /**
     * deprecated
     */
    @Generated public static final int kABPersonCompositeNameFormatLastNameFirst = 0x00000001;
    /**
     * deprecated
     */
    @Generated public static final int kABInvalidPropertyType = 0x00000000;
    /**
     * deprecated
     */
    @Generated public static final int kABStringPropertyType = 0x00000001;
    /**
     * deprecated
     */
    @Generated public static final int kABIntegerPropertyType = 0x00000002;
    /**
     * deprecated
     */
    @Generated public static final int kABRealPropertyType = 0x00000003;
    /**
     * deprecated
     */
    @Generated public static final int kABDateTimePropertyType = 0x00000004;
    /**
     * deprecated
     */
    @Generated public static final int kABDictionaryPropertyType = 0x00000005;
    /**
     * deprecated
     */
    @Generated public static final int kABMultiStringPropertyType = 0x00000101;
    /**
     * deprecated
     */
    @Generated public static final int kABMultiIntegerPropertyType = 0x00000102;
    /**
     * deprecated
     */
    @Generated public static final int kABMultiRealPropertyType = 0x00000103;
    /**
     * deprecated
     */
    @Generated public static final int kABMultiDateTimePropertyType = 0x00000104;
    /**
     * deprecated
     */
    @Generated public static final int kABMultiDictionaryPropertyType = 0x00000105;

    @Generated
    private Enums() {
    }
}
