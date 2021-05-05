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

package apple.iad.protocol;

import apple.foundation.NSError;
import apple.iad.ADBannerView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] ADBannerViewDelegate
 */
@Generated
@Library("iAd")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ADBannerViewDelegate")
public interface ADBannerViewDelegate {
    /**
     * bannerView:didFailToReceiveAdWithError:
     * 
     * Called when an error has occurred while attempting to get ad content. If the
     * banner is being displayed when an error occurs, it should be hidden
     * to prevent display of a banner view with no ad content.
     * 
     * @see ADError for a list of possible error codes.
     */
    @Generated
    @IsOptional
    @Selector("bannerView:didFailToReceiveAdWithError:")
    default void bannerViewDidFailToReceiveAdWithError(ADBannerView banner, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * bannerViewActionDidFinish:
     * 
     * Called when a modal action has completed and control is returned to the
     * application. Games, media playback, and other activities that were paused in
     * bannerViewActionShouldBegin:willLeaveApplication: should resume at this point.
     */
    @Generated
    @IsOptional
    @Selector("bannerViewActionDidFinish:")
    default void bannerViewActionDidFinish(ADBannerView banner) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * bannerViewActionShouldBegin:willLeaveApplication:
     * 
     * Called when the user taps on the banner and some action is to be taken.
     * Actions either display full screen content modally, or take the user to a
     * different application.
     * 
     * The delegate may return NO to block the action from taking place, but this
     * should be avoided if possible because most ads pay significantly more when
     * the action takes place and, over the longer term, repeatedly blocking actions
     * will decrease the ad inventory available to the application.
     * 
     * Applications should reduce their own activity while the advertisement's action
     * executes.
     */
    @Generated
    @IsOptional
    @Selector("bannerViewActionShouldBegin:willLeaveApplication:")
    default boolean bannerViewActionShouldBeginWillLeaveApplication(ADBannerView banner, boolean willLeave) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * bannerViewDidLoadAd:
     * 
     * Called each time a banner loads a new ad. Once a banner has loaded an ad, it
     * will display it until another ad is available.
     * 
     * It's generally recommended to show the banner view when this method is called,
     * and hide it again when bannerView:didFailToReceiveAdWithError: is called.
     */
    @Generated
    @IsOptional
    @Selector("bannerViewDidLoadAd:")
    default void bannerViewDidLoadAd(ADBannerView banner) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * bannerViewWillLoadAd:
     * 
     * Called when a banner has confirmation that an ad will be presented, but
     * before the resources necessary for presentation have loaded.
     */
    @Generated
    @IsOptional
    @Selector("bannerViewWillLoadAd:")
    default void bannerViewWillLoadAd(ADBannerView banner) {
        throw new java.lang.UnsupportedOperationException();
    }
}
