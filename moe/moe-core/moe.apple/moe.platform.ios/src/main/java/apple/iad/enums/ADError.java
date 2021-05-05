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

package apple.iad.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] ADError
 * 
 * [@const] ADErrorUnknown
 * General errors that aren't covered by one of the more specific error reasons.
 * 
 * [@const] ADErrorServerFailure
 * Unable to request ads and their resources from the iAd service.
 * 
 * [@const] ADErrorInventoryUnavailable
 * No ads are available at the moment. Note that this error is *always* returned
 * to iPhone apps running in compatibility mode on iPad, since ads are not
 * supported in that configuration.
 * 
 * [@const] ADErrorConfigurationError
 * There are iAd configuration issues that need to be resolved before ads can be
 * served. Generally, this means visiting ADC <http://developer.apple.com/>.
 * 
 * [@const] ADErrorBannerVisibleWithoutContent
 * The banner is visible but had no ad. Generally, this means a banner was made
 * visible before the -bannerViewDidLoadAd: delegate method was called, or
 * remained visible after the -bannerView:didFailToReceiveAdWithError: delegate
 * method was called.
 * 
 * [@const] ADErrorAdUnloaded
 * The ad being displayed in the banner was unloaded. Some examples of when this
 * might happen is when an ad expires, or when an ad is moved from a non-visible
 * banner to a visible banner.
 * 
 * [@const] ADErrorLoadingThrottled
 * Unused.
 * 
 * [@const] ADErrorApplicationInactive
 * Unused.
 * 
 * Error codes for NSErrors passed to the delegate via the
 * bannerView:didFailToReceiveAdWithError: delegate method.
 */
@Generated
public final class ADError {
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NInt public static final long ServerFailure = 0x0000000000000001L;
    @Generated @NInt public static final long LoadingThrottled = 0x0000000000000002L;
    @Generated @NInt public static final long InventoryUnavailable = 0x0000000000000003L;
    @Generated @NInt public static final long ConfigurationError = 0x0000000000000004L;
    @Generated @NInt public static final long BannerVisibleWithoutContent = 0x0000000000000005L;
    @Generated @NInt public static final long ApplicationInactive = 0x0000000000000006L;
    @Generated @NInt public static final long AdUnloaded = 0x0000000000000007L;
    @Generated @NInt public static final long AssetLoadFailure = 0x0000000000000008L;

    @Generated
    private ADError() {
    }

    @Generated @NInt public static final long AdResponseValidateFailure = 0x0000000000000009L;
    @Generated @NInt public static final long AdAssetLoadPending = 0x000000000000000AL;
}
