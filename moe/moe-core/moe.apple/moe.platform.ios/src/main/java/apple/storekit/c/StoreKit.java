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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKCloudServiceSetupOptionsActionKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKCloudServiceSetupOptionsITunesItemIdentifierKey();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKReceiptPropertyIsExpired();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKReceiptPropertyIsRevoked();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKReceiptPropertyIsVolumePurchase();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterITunesItemIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterAffiliateToken();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterCampaignToken();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterProviderToken();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterAdvertisingPartnerToken();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStorefrontCountryCodeDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKCloudServiceSetupOptionsAffiliateTokenKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKCloudServiceSetupOptionsCampaignTokenKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKCloudServiceSetupOptionsMessageIdentifierKey();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterProductIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterAdNetworkAttributionSignature();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterAdNetworkCampaignIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterAdNetworkIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterAdNetworkNonce();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SKStoreProductParameterAdNetworkTimestamp();
}
