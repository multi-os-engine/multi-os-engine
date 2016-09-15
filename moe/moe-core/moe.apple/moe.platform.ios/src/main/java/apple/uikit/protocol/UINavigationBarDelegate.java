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

import apple.uikit.UINavigationBar;
import apple.uikit.UINavigationItem;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UINavigationBarDelegate")
public interface UINavigationBarDelegate extends UIBarPositioningDelegate {
    /**
     * navigationBar:didPopItem:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBarDelegate_Protocol/index.html#//apple_ref/occ/intfm/UINavigationBarDelegate/navigationBar:didPopItem:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("navigationBar:didPopItem:")
    default void navigationBarDidPopItem(UINavigationBar navigationBar, UINavigationItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * navigationBar:didPushItem:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBarDelegate_Protocol/index.html#//apple_ref/occ/intfm/UINavigationBarDelegate/navigationBar:didPushItem:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("navigationBar:didPushItem:")
    default void navigationBarDidPushItem(UINavigationBar navigationBar, UINavigationItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * navigationBar:shouldPopItem:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBarDelegate_Protocol/index.html#//apple_ref/occ/intfm/UINavigationBarDelegate/navigationBar:shouldPopItem:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("navigationBar:shouldPopItem:")
    default boolean navigationBarShouldPopItem(UINavigationBar navigationBar, UINavigationItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * navigationBar:shouldPushItem:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationBarDelegate_Protocol/index.html#//apple_ref/occ/intfm/UINavigationBarDelegate/navigationBar:shouldPushItem:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("navigationBar:shouldPushItem:")
    default boolean navigationBarShouldPushItem(UINavigationBar navigationBar, UINavigationItem item) {
        throw new java.lang.UnsupportedOperationException();
    }
}
