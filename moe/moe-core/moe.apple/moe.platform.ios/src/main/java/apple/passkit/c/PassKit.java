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

package apple.passkit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("PassKit")
@Runtime(CRuntime.class)
public final class PassKit {
    static {
        NatJ.register();
    }

    @Generated
    private PassKit() {
    }

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKEncryptionSchemeECC_V2();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKEncryptionSchemeRSA_V2();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkAmex();

    /**
     * API-Since: 9.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkChinaUnionPay();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkDiscover();

    /**
     * API-Since: 9.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkInterac();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkMasterCard();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkPrivateLabel();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkVisa();

    /**
     * API-Since: 10.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkJCB();

    /**
     * API-Since: 10.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkSuica();

    /**
     * PKPassKitErrorDomain is used for generic errors with PassKit, such as
     * adding or removing passes from the user's pass library. PassKit returns these errors to you.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPassKitErrorDomain();

    /**
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPassLibraryDidChangeNotification();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPassLibraryRemotePaymentPassesDidChangeNotification();

    /**
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPassLibraryAddedPassesUserInfoKey();

    /**
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPassLibraryReplacementPassesUserInfoKey();

    /**
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPassLibraryRemovedPassInfosUserInfoKey();

    /**
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPassLibraryPassTypeIdentifierUserInfoKey();

    /**
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPassLibrarySerialNumberUserInfoKey();

    /**
     * API-Since: 10.3
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use PKPaymentNetworkCartesBancaires instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkCarteBancaire();

    /**
     * API-Since: 11.0
     * Deprecated-Since: 11.2
     * Deprecated-Message: Use PKPaymentNetworkCartesBancaires instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkCarteBancaires();

    /**
     * API-Since: 10.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkIDCredit();

    /**
     * API-Since: 10.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkQuicPay();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKContactFieldPostalAddress();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKContactFieldEmailAddress();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKContactFieldPhoneNumber();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKContactFieldName();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKContactFieldPhoneticName();

    /**
     * PKPaymentErrorDomain is used for errors with in-app or web payments.
     * You create your own PKPaymentErrors and return them to indicate problems with a purchase
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentErrorDomain();

    /**
     * a PKContactField the error relates to. Use with PKPaymentShippingContactInvalidError
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentErrorContactFieldUserInfoKey();

    /**
     * if the error relates to PKContactFieldPostalAddress you may set the specific key here
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentErrorPostalAddressUserInfoKey();

    /**
     * API-Since: 11.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkCartesBancaires();

    /**
     * API-Since: 12.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkEftpos();

    /**
     * API-Since: 12.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkElectron();

    /**
     * API-Since: 12.1.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkElo();

    /**
     * API-Since: 12.1.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkMada();

    /**
     * API-Since: 12.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkMaestro();

    /**
     * API-Since: 12.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkVPay();

    /**
     * API-Since: 13.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKAddSecureElementPassErrorDomain();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkBarcode();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkGirocard();

    /**
     * API-Since: 14.5
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkMir();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkWaon();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkNanaco();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKStoredValuePassBalanceTypeCash();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKStoredValuePassBalanceTypeLoyaltyPoints();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPassLibraryRecoveredPassesUserInfoKey();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkBancomat();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkBancontact();

    /**
     * API-Since: 15.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkDankort();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKShareSecureElementPassErrorDomain();

    /**
     * Error domain for identity errors.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKIdentityErrorDomain();
}
