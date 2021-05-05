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

package apple.storekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * error codes for the SKErrorDomain
 */
@Generated
public final class SKErrorCode {
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * client is not allowed to issue the request, etc.
     */
    @Generated @NInt public static final long ClientInvalid = 0x0000000000000001L;
    /**
     * user cancelled the request, etc.
     */
    @Generated @NInt public static final long PaymentCancelled = 0x0000000000000002L;
    /**
     * purchase identifier was invalid, etc.
     */
    @Generated @NInt public static final long PaymentInvalid = 0x0000000000000003L;
    /**
     * this device is not allowed to make the payment
     */
    @Generated @NInt public static final long PaymentNotAllowed = 0x0000000000000004L;
    /**
     * Product is not available in the current storefront
     */
    @Generated @NInt public static final long StoreProductNotAvailable = 0x0000000000000005L;
    /**
     * user has not allowed access to cloud service information
     */
    @Generated @NInt public static final long CloudServicePermissionDenied = 0x0000000000000006L;
    /**
     * the device could not connect to the nework
     */
    @Generated @NInt public static final long CloudServiceNetworkConnectionFailed = 0x0000000000000007L;

    @Generated
    private SKErrorCode() {
    }

    /**
     * user has revoked permission to use this cloud service
     */
    @Generated @NInt public static final long CloudServiceRevoked = 0x0000000000000008L;
    /**
     * The user needs to acknowledge Apple's privacy policy
     */
    @Generated @NInt public static final long PrivacyAcknowledgementRequired = 0x0000000000000009L;
    /**
     * The app is attempting to use SKPayment's requestData property, but does not have the appropriate entitlement
     */
    @Generated @NInt public static final long UnauthorizedRequestData = 0x000000000000000AL;
    /**
     * The specified subscription offer identifier is not valid
     */
    @Generated @NInt public static final long InvalidOfferIdentifier = 0x000000000000000BL;
    /**
     * The cryptographic signature provided is not valid
     */
    @Generated @NInt public static final long InvalidSignature = 0x000000000000000CL;
    /**
     * One or more parameters from SKPaymentDiscount is missing
     */
    @Generated @NInt public static final long MissingOfferParams = 0x000000000000000DL;
    /**
     * The price of the selected offer is not valid (e.g. lower than the current base subscription price)
     */
    @Generated @NInt public static final long InvalidOfferPrice = 0x000000000000000EL;
    @Generated @NInt public static final long OverlayCancelled = 0x000000000000000FL;
    @Generated @NInt public static final long OverlayInvalidConfiguration = 0x0000000000000010L;
    @Generated @NInt public static final long OverlayTimeout = 0x0000000000000011L;
    /**
     * User is not eligible for the subscription offer
     */
    @Generated @NInt public static final long IneligibleForOffer = 0x0000000000000012L;
    @Generated
    @NInt
    public static final long UnsupportedPlatform = 0x0000000000000013L;
}
