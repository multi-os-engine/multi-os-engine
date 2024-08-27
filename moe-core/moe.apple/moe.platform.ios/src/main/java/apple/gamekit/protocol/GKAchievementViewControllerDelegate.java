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

import apple.gamekit.GKAchievementViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Optional delegate
 * 
 * API-Since: 4.1
 * Deprecated-Since: 7.0
 */
@Deprecated
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKAchievementViewControllerDelegate")
public interface GKAchievementViewControllerDelegate {
    /**
     * The achievement view has finished
     */
    @Generated
    @Selector("achievementViewControllerDidFinish:")
    void achievementViewControllerDidFinish(GKAchievementViewController viewController);
}
