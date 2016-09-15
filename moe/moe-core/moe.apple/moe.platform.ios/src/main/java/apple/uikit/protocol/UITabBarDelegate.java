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
import apple.uikit.UITabBar;
import apple.uikit.UITabBarItem;
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
@ObjCProtocolName("UITabBarDelegate")
public interface UITabBarDelegate {
    /**
     * tabBar:didBeginCustomizingItems:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITabBarDelegate/tabBar:didBeginCustomizingItems:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("tabBar:didBeginCustomizingItems:")
    default void tabBarDidBeginCustomizingItems(UITabBar tabBar, NSArray<? extends UITabBarItem> items) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * tabBar:didEndCustomizingItems:changed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITabBarDelegate/tabBar:didEndCustomizingItems:changed:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("tabBar:didEndCustomizingItems:changed:")
    default void tabBarDidEndCustomizingItemsChanged(UITabBar tabBar, NSArray<? extends UITabBarItem> items,
            boolean changed) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * tabBar:didSelectItem:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITabBarDelegate/tabBar:didSelectItem:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("tabBar:didSelectItem:")
    default void tabBarDidSelectItem(UITabBar tabBar, UITabBarItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * tabBar:willBeginCustomizingItems:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITabBarDelegate/tabBar:willBeginCustomizingItems:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("tabBar:willBeginCustomizingItems:")
    default void tabBarWillBeginCustomizingItems(UITabBar tabBar, NSArray<? extends UITabBarItem> items) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * tabBar:willEndCustomizingItems:changed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITabBarDelegate/tabBar:willEndCustomizingItems:changed:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("tabBar:willEndCustomizingItems:changed:")
    default void tabBarWillEndCustomizingItemsChanged(UITabBar tabBar, NSArray<? extends UITabBarItem> items,
            boolean changed) {
        throw new java.lang.UnsupportedOperationException();
    }
}
