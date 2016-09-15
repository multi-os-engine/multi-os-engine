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

import apple.foundation.NSError;
import apple.gamekit.GKTurnBasedMatch;
import apple.gamekit.GKTurnBasedMatchmakerViewController;
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
@ObjCProtocolName("GKTurnBasedMatchmakerViewControllerDelegate")
public interface GKTurnBasedMatchmakerViewControllerDelegate {
    /**
     * turnBasedMatchmakerViewController:didFailWithError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatchmakerViewControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKTurnBasedMatchmakerViewControllerDelegate/turnBasedMatchmakerViewController:didFailWithError:">iOS Dev Center</a>
     */
    @Generated
    @Selector("turnBasedMatchmakerViewController:didFailWithError:")
    void turnBasedMatchmakerViewControllerDidFailWithError(GKTurnBasedMatchmakerViewController viewController,
            NSError error);

    /**
     * turnBasedMatchmakerViewController:didFindMatch:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatchmakerViewControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKTurnBasedMatchmakerViewControllerDelegate/turnBasedMatchmakerViewController:didFindMatch:">iOS Dev Center</a>
     */
    @IsOptional
    @Deprecated
    @Generated
    @Selector("turnBasedMatchmakerViewController:didFindMatch:")
    default void turnBasedMatchmakerViewControllerDidFindMatch(GKTurnBasedMatchmakerViewController viewController,
            GKTurnBasedMatch match) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * turnBasedMatchmakerViewController:playerQuitForMatch:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatchmakerViewControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKTurnBasedMatchmakerViewControllerDelegate/turnBasedMatchmakerViewController:playerQuitForMatch:">iOS Dev Center</a>
     */
    @IsOptional
    @Deprecated
    @Generated
    @Selector("turnBasedMatchmakerViewController:playerQuitForMatch:")
    default void turnBasedMatchmakerViewControllerPlayerQuitForMatch(GKTurnBasedMatchmakerViewController viewController,
            GKTurnBasedMatch match) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * turnBasedMatchmakerViewControllerWasCancelled:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatchmakerViewControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKTurnBasedMatchmakerViewControllerDelegate/turnBasedMatchmakerViewControllerWasCancelled:">iOS Dev Center</a>
     */
    @Generated
    @Selector("turnBasedMatchmakerViewControllerWasCancelled:")
    void turnBasedMatchmakerViewControllerWasCancelled(GKTurnBasedMatchmakerViewController viewController);
}
