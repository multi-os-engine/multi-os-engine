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

package apple.videosubscriberaccount.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class VSErrorCode {
    /**
     * The user has not granted the app access to their subscription information.
     */
    @Generated @NInt public static final long AccessNotGranted = 0x0000000000000000L;
    /**
     * The system does not currently support the user's subscription provider.
     */
    @Generated @NInt public static final long UnsupportedProvider = 0x0000000000000001L;
    /**
     * The request was cancelled by the user.
     */
    @Generated @NInt public static final long UserCancelled = 0x0000000000000002L;
    /**
     * The request failed, but a subsequent attempt might succeed.
     */
    @Generated @NInt public static final long ServiceTemporarilyUnavailable = 0x0000000000000003L;
    /**
     * The user's subscription provider did not allow the request to proceed, e.g. because the subscription tier doesn't
     * include the resource, or interactive reauthentication is required, but the request does not allow interruption.
     */
    @Generated @NInt public static final long ProviderRejected = 0x0000000000000004L;
    /**
     * The request's verification token was rejected by the user's subscription provider.
     */
    @Generated @NInt public static final long InvalidVerificationToken = 0x0000000000000005L;

    @Generated
    private VSErrorCode() {
    }

    /**
     * The system rejected the request.
     */
    @Generated @NInt public static final long Rejected = 0x0000000000000006L;
    /**
     * The TV Provider feature is not supported in the device's current region.
     */
    @Generated @NInt public static final long Unsupported = 0x0000000000000007L;
}
