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

import apple.foundation.NSArray;
import apple.uikit.UIPageViewController;
import apple.uikit.UIViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIPageViewControllerDelegate")
public interface UIPageViewControllerDelegate {
    /**
     * Sent when a gesture-initiated transition ends. The 'finished' parameter indicates whether the animation finished,
     * while the 'completed' parameter indicates whether the transition completed or bailed out (if the user let go
     * early).
     */
    @Generated
    @IsOptional
    @Selector("pageViewController:didFinishAnimating:previousViewControllers:transitionCompleted:")
    default void pageViewControllerDidFinishAnimatingPreviousViewControllersTransitionCompleted(
            @NotNull UIPageViewController pageViewController, boolean finished,
            @NotNull NSArray<? extends UIViewController> previousViewControllers, boolean completed) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Delegate may specify a different spine location for after the interface orientation change. Only sent for
     * transition style 'UIPageViewControllerTransitionStylePageCurl'.
     * Delegate may set new view controllers or update double-sided state within this method's implementation as well.
     */
    @Generated
    @IsOptional
    @Selector("pageViewController:spineLocationForInterfaceOrientation:")
    @NInt
    default long pageViewControllerSpineLocationForInterfaceOrientation(
            @NotNull UIPageViewController pageViewController, @NInt long orientation) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent when a gesture-initiated transition begins.
     * 
     * API-Since: 6.0
     */
    @Generated
    @IsOptional
    @Selector("pageViewController:willTransitionToViewControllers:")
    default void pageViewControllerWillTransitionToViewControllers(@NotNull UIPageViewController pageViewController,
            @NotNull NSArray<? extends UIViewController> pendingViewControllers) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("pageViewControllerPreferredInterfaceOrientationForPresentation:")
    @NInt
    default long pageViewControllerPreferredInterfaceOrientationForPresentation(
            @NotNull UIPageViewController pageViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("pageViewControllerSupportedInterfaceOrientations:")
    @NUInt
    default long pageViewControllerSupportedInterfaceOrientations(@NotNull UIPageViewController pageViewController) {
        throw new java.lang.UnsupportedOperationException();
    }
}
