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
import apple.iad.ADInterstitialAd;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] ADInterstitialAdDelegate
 */
@Generated
@Library("iAd")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ADInterstitialAdDelegate")
public interface ADInterstitialAdDelegate {
    /**
     * interstitialAd:didFailWithError:
     * 
     * Called when an error has occurred attempting to get ad content.
     * 
     * @see ADError for a list of possible error codes.
     */
    @Generated
    @Selector("interstitialAd:didFailWithError:")
    void interstitialAdDidFailWithError(ADInterstitialAd interstitialAd, NSError error);

    /**
     * interstitialAdActionDidFinish:
     * This message is sent when the action has completed and control is returned to
     * the application. Games, media playback, and other activities that were paused
     * in response to the beginning of the action should resume at this point.
     */
    @Generated
    @IsOptional
    @Selector("interstitialAdActionDidFinish:")
    default void interstitialAdActionDidFinish(ADInterstitialAd interstitialAd) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * interstitialAdActionShouldBegin:willLeaveApplication:
     * 
     * Called when the user chooses to interact with the interstitial ad.
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
    @Selector("interstitialAdActionShouldBegin:willLeaveApplication:")
    default boolean interstitialAdActionShouldBeginWillLeaveApplication(ADInterstitialAd interstitialAd,
            boolean willLeave) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * interstitialAdDidLoad:
     * 
     * Called when the interstitial ad has finished loading ad content. The delegate
     * should implement this method so it knows when the interstitial ad is ready to
     * be presented.
     */
    @Generated
    @IsOptional
    @Selector("interstitialAdDidLoad:")
    default void interstitialAdDidLoad(ADInterstitialAd interstitialAd) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * interstitialAdDidUnload:
     * 
     * When this method is invoked, if the application is using -presentInView:, the
     * content will be unloaded from the container shortly after this method is
     * called and no new content will be loaded. This may occur either as a result
     * of user actions or if the ad content has expired.
     * 
     * In the case of an interstitial presented via -presentInView:, the layout of
     * the app should be updated to reflect that an ad is no longer visible. e.g.
     * by removing the view used for presentation and replacing it with another view.
     */
    @Generated
    @Selector("interstitialAdDidUnload:")
    void interstitialAdDidUnload(ADInterstitialAd interstitialAd);

    /**
     * interstitialAdWillLoad:
     * 
     * Called when the interstitial has confirmation that an ad will be presented,
     * but before the ad has loaded resources necessary for presentation.
     */
    @Generated
    @IsOptional
    @Selector("interstitialAdWillLoad:")
    default void interstitialAdWillLoad(ADInterstitialAd interstitialAd) {
        throw new java.lang.UnsupportedOperationException();
    }
}
