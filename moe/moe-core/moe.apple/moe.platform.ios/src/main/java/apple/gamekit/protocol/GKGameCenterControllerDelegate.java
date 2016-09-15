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

import apple.gamekit.GKGameCenterViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKGameCenterControllerDelegate")
public interface GKGameCenterControllerDelegate {
    /**
     * gameCenterViewControllerDidFinish:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKGameCenterViewControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/GKGameCenterControllerDelegate/gameCenterViewControllerDidFinish:">iOS Dev Center</a>
     */
    @Generated
    @Selector("gameCenterViewControllerDidFinish:")
    void gameCenterViewControllerDidFinish(GKGameCenterViewController gameCenterViewController);
}
