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

@Generated
@Library("iAd")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ADInterstitialAdDelegate")
public interface ADInterstitialAdDelegate {
    /**
     * interstitialAd:didFailWithError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iAd/Reference/ADInterstitialAdDelegate_Ref/index.html#//apple_ref/occ/intfm/ADInterstitialAdDelegate/interstitialAd:didFailWithError:">iOS Dev Center</a>
     */
    @Generated
    @Selector("interstitialAd:didFailWithError:")
    void interstitialAdDidFailWithError(ADInterstitialAd interstitialAd, NSError error);

    /**
     * interstitialAdActionDidFinish:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iAd/Reference/ADInterstitialAdDelegate_Ref/index.html#//apple_ref/occ/intfm/ADInterstitialAdDelegate/interstitialAdActionDidFinish:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("interstitialAdActionDidFinish:")
    default void interstitialAdActionDidFinish(ADInterstitialAd interstitialAd) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * interstitialAdActionShouldBegin:willLeaveApplication:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iAd/Reference/ADInterstitialAdDelegate_Ref/index.html#//apple_ref/occ/intfm/ADInterstitialAdDelegate/interstitialAdActionShouldBegin:willLeaveApplication:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("interstitialAdActionShouldBegin:willLeaveApplication:")
    default boolean interstitialAdActionShouldBeginWillLeaveApplication(ADInterstitialAd interstitialAd,
            boolean willLeave) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * interstitialAdDidLoad:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iAd/Reference/ADInterstitialAdDelegate_Ref/index.html#//apple_ref/occ/intfm/ADInterstitialAdDelegate/interstitialAdDidLoad:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("interstitialAdDidLoad:")
    default void interstitialAdDidLoad(ADInterstitialAd interstitialAd) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * interstitialAdDidUnload:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iAd/Reference/ADInterstitialAdDelegate_Ref/index.html#//apple_ref/occ/intfm/ADInterstitialAdDelegate/interstitialAdDidUnload:">iOS Dev Center</a>
     */
    @Generated
    @Selector("interstitialAdDidUnload:")
    void interstitialAdDidUnload(ADInterstitialAd interstitialAd);

    /**
     * interstitialAdWillLoad:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iAd/Reference/ADInterstitialAdDelegate_Ref/index.html#//apple_ref/occ/intfm/ADInterstitialAdDelegate/interstitialAdWillLoad:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("interstitialAdWillLoad:")
    default void interstitialAdWillLoad(ADInterstitialAd interstitialAd) {
        throw new java.lang.UnsupportedOperationException();
    }
}
