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

package apple.gamekit.protocol;

import apple.gamekit.GKChallenge;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKChallengeEventHandlerDelegate")
public interface GKChallengeEventHandlerDelegate {
    /**
     * localPlayerDidCompleteChallenge:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GKChallengeEventHandlerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKChallengeEventHandlerDelegate/localPlayerDidCompleteChallenge:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("localPlayerDidCompleteChallenge:")
    default void localPlayerDidCompleteChallenge(GKChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * localPlayerDidReceiveChallenge:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GKChallengeEventHandlerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKChallengeEventHandlerDelegate/localPlayerDidReceiveChallenge:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("localPlayerDidReceiveChallenge:")
    default void localPlayerDidReceiveChallenge(GKChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * localPlayerDidSelectChallenge:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GKChallengeEventHandlerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKChallengeEventHandlerDelegate/localPlayerDidSelectChallenge:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("localPlayerDidSelectChallenge:")
    default void localPlayerDidSelectChallenge(GKChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * remotePlayerDidCompleteChallenge:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GKChallengeEventHandlerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKChallengeEventHandlerDelegate/remotePlayerDidCompleteChallenge:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("remotePlayerDidCompleteChallenge:")
    default void remotePlayerDidCompleteChallenge(GKChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * shouldShowBannerForLocallyCompletedChallenge:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GKChallengeEventHandlerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKChallengeEventHandlerDelegate/shouldShowBannerForLocallyCompletedChallenge:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("shouldShowBannerForLocallyCompletedChallenge:")
    default boolean shouldShowBannerForLocallyCompletedChallenge(GKChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * shouldShowBannerForLocallyReceivedChallenge:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GKChallengeEventHandlerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKChallengeEventHandlerDelegate/shouldShowBannerForLocallyReceivedChallenge:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("shouldShowBannerForLocallyReceivedChallenge:")
    default boolean shouldShowBannerForLocallyReceivedChallenge(GKChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * shouldShowBannerForRemotelyCompletedChallenge:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GKChallengeEventHandlerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKChallengeEventHandlerDelegate/shouldShowBannerForRemotelyCompletedChallenge:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("shouldShowBannerForRemotelyCompletedChallenge:")
    default boolean shouldShowBannerForRemotelyCompletedChallenge(GKChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }
}
