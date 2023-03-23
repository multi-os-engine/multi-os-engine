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

import apple.uikit.UIPageViewController;
import apple.uikit.UIViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIPageViewControllerDataSource")
public interface UIPageViewControllerDataSource {
    @Generated
    @Selector("pageViewController:viewControllerAfterViewController:")
    UIViewController pageViewControllerViewControllerAfterViewController(UIPageViewController pageViewController,
            UIViewController viewController);

    /**
     * In terms of navigation direction. For example, for 'UIPageViewControllerNavigationOrientationHorizontal', view
     * controllers coming 'before' would be to the left of the argument view controller, those coming 'after' would be
     * to the right.
     * Return 'nil' to indicate that no more progress can be made in the given direction.
     * For gesture-initiated transitions, the page view controller obtains view controllers via these methods, so use of
     * setViewControllers:direction:animated:completion: is not required.
     */
    @Generated
    @Selector("pageViewController:viewControllerBeforeViewController:")
    UIViewController pageViewControllerViewControllerBeforeViewController(UIPageViewController pageViewController,
            UIViewController viewController);

    /**
     * The number of items reflected in the page indicator.
     * 
     * API-Since: 6.0
     */
    @Generated
    @IsOptional
    @Selector("presentationCountForPageViewController:")
    @NInt
    default long presentationCountForPageViewController(UIPageViewController pageViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The selected item reflected in the page indicator.
     * 
     * API-Since: 6.0
     */
    @Generated
    @IsOptional
    @Selector("presentationIndexForPageViewController:")
    @NInt
    default long presentationIndexForPageViewController(UIPageViewController pageViewController) {
        throw new java.lang.UnsupportedOperationException();
    }
}
