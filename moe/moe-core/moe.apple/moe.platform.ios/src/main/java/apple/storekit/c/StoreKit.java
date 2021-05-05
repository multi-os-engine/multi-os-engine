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

package apple.storekit.c;

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
@Library("StoreKit")
@Runtime(CRuntime.class)
public final class StoreKit {
    static {
        NatJ.register();
    }

    @Generated
    private StoreKit() {
    }

    @Generated
    @CFunction
    public static native void SKTerminateForInvalidReceipt();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStorefrontIdentifierDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKCloudServiceCapabilitiesDidChangeNotification();

    /**
     * Action for setup entry point (of type SKCloudServiceSetupAction).
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKCloudServiceSetupOptionsActionKey();

    /**
     * Identifier of the iTunes Store item the user is trying to access which requires cloud service setup (NSNumber).
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKCloudServiceSetupOptionsITunesItemIdentifierKey();

    /**
     * Supported actions for setup entry point.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKCloudServiceSetupActionSubscribe();

    @Generated
    @CVariable()
    public static native double SKDownloadTimeRemainingUnknown();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKErrorDomain();

    /**
     * NSNumber BOOL, defaults to NO
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKReceiptPropertyIsExpired();

    /**
     * NSNumber BOOL, defaults to NO
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKReceiptPropertyIsRevoked();

    /**
     * NSNumber BOOL, defaults to NO
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKReceiptPropertyIsVolumePurchase();

    /**
     * iTunes Store item identifier (NSNumber) of the product
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterITunesItemIdentifier();

    /**
     * iTunes Store affiliate token (NSString)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterAffiliateToken();

    /**
     * iTunes Store affiliate campaign token (NSString)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterCampaignToken();

    /**
     * Analytics provider token (NSString)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterProviderToken();

    /**
     * Advertising partner token (NSString)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterAdvertisingPartnerToken();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStorefrontCountryCodeDidChangeNotification();

    /**
     * iTunes Store affiliate token (NSString).
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKCloudServiceSetupOptionsAffiliateTokenKey();

    /**
     * iTunes Store affiliate campaign token (NSString).
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKCloudServiceSetupOptionsCampaignTokenKey();

    /**
     * Identifier used to select the main message presented to the user for this setup view (SKCloudServiceSetupMessageIdentifier).
     * When missing, the setup view will be configured in a way that is equivalent to using SKCloudServiceSetupMessageIdentifierJoin.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKCloudServiceSetupOptionsMessageIdentifierKey();

    /**
     * Supported message identifiers.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKCloudServiceSetupMessageIdentifierJoin();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKCloudServiceSetupMessageIdentifierConnect();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKCloudServiceSetupMessageIdentifierAddMusic();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKCloudServiceSetupMessageIdentifierPlayMusic();

    /**
     * SKU for the In-App Purchase product (NSString) to render at the top of the product page
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterProductIdentifier();

    /**
     * Advertising network's cryptographic signature for the atribution params (NSString)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterAdNetworkAttributionSignature();

    /**
     * Advertising network campaign identifier (NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterAdNetworkCampaignIdentifier();

    /**
     * Advertising network identifier (NSString)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterAdNetworkIdentifier();

    /**
     * Random entropy value for security (NSUUID)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterAdNetworkNonce();

    /**
     * Timestamp for this ad impression (NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterAdNetworkTimestamp();

    /**
     * App Store item identifier of the source app (NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterAdNetworkSourceAppStoreIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterAdNetworkVersion();
}
