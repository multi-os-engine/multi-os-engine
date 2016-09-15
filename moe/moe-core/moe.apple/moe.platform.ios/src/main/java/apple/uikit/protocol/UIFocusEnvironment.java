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

package apple.uikit.protocol;

import apple.uikit.UIFocusAnimationCoordinator;
import apple.uikit.UIFocusUpdateContext;
import apple.uikit.UIView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIFocusEnvironment")
public interface UIFocusEnvironment {
    /**
     * didUpdateFocusInContext:withAnimationCoordinator:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFocusEnvironment_Protocol/index.html#//apple_ref/occ/intfm/UIFocusEnvironment/didUpdateFocusInContext:withAnimationCoordinator:">iOS Dev Center</a>
     */
    @Generated
    @Selector("didUpdateFocusInContext:withAnimationCoordinator:")
    void didUpdateFocusInContextWithAnimationCoordinator(UIFocusUpdateContext context,
            UIFocusAnimationCoordinator coordinator);

    /**
     * preferredFocusedView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFocusEnvironment_Protocol/index.html#//apple_ref/occ/intfp/UIFocusEnvironment/preferredFocusedView">iOS Dev Center</a>
     */
    @Generated
    @Selector("preferredFocusedView")
    UIView preferredFocusedView();

    /**
     * setNeedsFocusUpdate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFocusEnvironment_Protocol/index.html#//apple_ref/occ/intfm/UIFocusEnvironment/setNeedsFocusUpdate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNeedsFocusUpdate")
    void setNeedsFocusUpdate();

    /**
     * shouldUpdateFocusInContext:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFocusEnvironment_Protocol/index.html#//apple_ref/occ/intfm/UIFocusEnvironment/shouldUpdateFocusInContext:">iOS Dev Center</a>
     */
    @Generated
    @Selector("shouldUpdateFocusInContext:")
    boolean shouldUpdateFocusInContext(UIFocusUpdateContext context);

    /**
     * updateFocusIfNeeded</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFocusEnvironment_Protocol/index.html#//apple_ref/occ/intfm/UIFocusEnvironment/updateFocusIfNeeded">iOS Dev Center</a>
     */
    @Generated
    @Selector("updateFocusIfNeeded")
    void updateFocusIfNeeded();
}
