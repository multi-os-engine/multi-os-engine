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
    /**
     * pageViewController:viewControllerAfterViewController:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerDataSourceProtocolRef/index.html#//apple_ref/occ/intfm/UIPageViewControllerDataSource/pageViewController:viewControllerAfterViewController:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pageViewController:viewControllerAfterViewController:")
    UIViewController pageViewControllerViewControllerAfterViewController(UIPageViewController pageViewController,
            UIViewController viewController);

    /**
     * pageViewController:viewControllerBeforeViewController:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerDataSourceProtocolRef/index.html#//apple_ref/occ/intfm/UIPageViewControllerDataSource/pageViewController:viewControllerBeforeViewController:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pageViewController:viewControllerBeforeViewController:")
    UIViewController pageViewControllerViewControllerBeforeViewController(UIPageViewController pageViewController,
            UIViewController viewController);

    /**
     * presentationCountForPageViewController:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerDataSourceProtocolRef/index.html#//apple_ref/occ/intfm/UIPageViewControllerDataSource/presentationCountForPageViewController:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("presentationCountForPageViewController:")
    @NInt
    default long presentationCountForPageViewController(UIPageViewController pageViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * presentationIndexForPageViewController:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerDataSourceProtocolRef/index.html#//apple_ref/occ/intfm/UIPageViewControllerDataSource/presentationIndexForPageViewController:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("presentationIndexForPageViewController:")
    @NInt
    default long presentationIndexForPageViewController(UIPageViewController pageViewController) {
        throw new java.lang.UnsupportedOperationException();
    }
}
