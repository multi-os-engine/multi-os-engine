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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIPageViewControllerDelegate")
public interface UIPageViewControllerDelegate {
    /**
     * pageViewController:didFinishAnimating:previousViewControllers:transitionCompleted:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerDelegateProtocolRef/index.html#//apple_ref/occ/intfm/UIPageViewControllerDelegate/pageViewController:didFinishAnimating:previousViewControllers:transitionCompleted:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("pageViewController:didFinishAnimating:previousViewControllers:transitionCompleted:")
    default void pageViewControllerDidFinishAnimatingPreviousViewControllersTransitionCompleted(
            UIPageViewController pageViewController, boolean finished,
            NSArray<? extends UIViewController> previousViewControllers, boolean completed) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * pageViewController:spineLocationForInterfaceOrientation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerDelegateProtocolRef/index.html#//apple_ref/occ/intfm/UIPageViewControllerDelegate/pageViewController:spineLocationForInterfaceOrientation:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("pageViewController:spineLocationForInterfaceOrientation:")
    @NInt
    default long pageViewControllerSpineLocationForInterfaceOrientation(UIPageViewController pageViewController,
            @NInt long orientation) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * pageViewController:willTransitionToViewControllers:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerDelegateProtocolRef/index.html#//apple_ref/occ/intfm/UIPageViewControllerDelegate/pageViewController:willTransitionToViewControllers:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("pageViewController:willTransitionToViewControllers:")
    default void pageViewControllerWillTransitionToViewControllers(UIPageViewController pageViewController,
            NSArray<? extends UIViewController> pendingViewControllers) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * pageViewControllerPreferredInterfaceOrientationForPresentation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerDelegateProtocolRef/index.html#//apple_ref/occ/intfm/UIPageViewControllerDelegate/pageViewControllerPreferredInterfaceOrientationForPresentation:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("pageViewControllerPreferredInterfaceOrientationForPresentation:")
    @NInt
    default long pageViewControllerPreferredInterfaceOrientationForPresentation(
            UIPageViewController pageViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * pageViewControllerSupportedInterfaceOrientations:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerDelegateProtocolRef/index.html#//apple_ref/occ/intfm/UIPageViewControllerDelegate/pageViewControllerSupportedInterfaceOrientations:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("pageViewControllerSupportedInterfaceOrientations:")
    @NUInt
    default long pageViewControllerSupportedInterfaceOrientations(UIPageViewController pageViewController) {
        throw new java.lang.UnsupportedOperationException();
    }
}
