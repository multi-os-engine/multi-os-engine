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

@Generated
@Library("iAd")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ADBannerViewDelegate")
public interface ADBannerViewDelegate {
    /**
     * bannerView:didFailToReceiveAdWithError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UserExperience/Reference/ADBannerViewDelegate_Ref/index.html#//apple_ref/occ/intfm/ADBannerViewDelegate/bannerView:didFailToReceiveAdWithError:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("bannerView:didFailToReceiveAdWithError:")
    default void bannerViewDidFailToReceiveAdWithError(ADBannerView banner, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * bannerViewActionDidFinish:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UserExperience/Reference/ADBannerViewDelegate_Ref/index.html#//apple_ref/occ/intfm/ADBannerViewDelegate/bannerViewActionDidFinish:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("bannerViewActionDidFinish:")
    default void bannerViewActionDidFinish(ADBannerView banner) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * bannerViewActionShouldBegin:willLeaveApplication:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UserExperience/Reference/ADBannerViewDelegate_Ref/index.html#//apple_ref/occ/intfm/ADBannerViewDelegate/bannerViewActionShouldBegin:willLeaveApplication:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("bannerViewActionShouldBegin:willLeaveApplication:")
    default boolean bannerViewActionShouldBeginWillLeaveApplication(ADBannerView banner, boolean willLeave) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * bannerViewDidLoadAd:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UserExperience/Reference/ADBannerViewDelegate_Ref/index.html#//apple_ref/occ/intfm/ADBannerViewDelegate/bannerViewDidLoadAd:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("bannerViewDidLoadAd:")
    default void bannerViewDidLoadAd(ADBannerView banner) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * bannerViewWillLoadAd:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UserExperience/Reference/ADBannerViewDelegate_Ref/index.html#//apple_ref/occ/intfm/ADBannerViewDelegate/bannerViewWillLoadAd:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("bannerViewWillLoadAd:")
    default void bannerViewWillLoadAd(ADBannerView banner) {
        throw new java.lang.UnsupportedOperationException();
    }
}
