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
    @Generated
    @Selector("interstitialAd:didFailWithError:")
    void interstitialAdDidFailWithError(ADInterstitialAd interstitialAd, NSError error);

    @Generated
    @IsOptional
    @Selector("interstitialAdActionDidFinish:")
    default void interstitialAdActionDidFinish(ADInterstitialAd interstitialAd) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("interstitialAdActionShouldBegin:willLeaveApplication:")
    default boolean interstitialAdActionShouldBeginWillLeaveApplication(ADInterstitialAd interstitialAd,
            boolean willLeave) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("interstitialAdDidLoad:")
    default void interstitialAdDidLoad(ADInterstitialAd interstitialAd) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("interstitialAdDidUnload:")
    void interstitialAdDidUnload(ADInterstitialAd interstitialAd);

    @Generated
    @IsOptional
    @Selector("interstitialAdWillLoad:")
    default void interstitialAdWillLoad(ADInterstitialAd interstitialAd) {
        throw new java.lang.UnsupportedOperationException();
    }
}
