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
import org.moe.natj.general.ann.NInt;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UINavigationBarDelegate")
public interface UINavigationBarDelegate extends UIBarPositioningDelegate {
    @Generated
    @IsOptional
    @Selector("navigationBar:didPopItem:")
    default void navigationBarDidPopItem(@NotNull UINavigationBar navigationBar, @NotNull UINavigationItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called at end of animation of push or immediately if not animated
     */
    @Generated
    @IsOptional
    @Selector("navigationBar:didPushItem:")
    default void navigationBarDidPushItem(@NotNull UINavigationBar navigationBar, @NotNull UINavigationItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * same as push methods
     */
    @Generated
    @IsOptional
    @Selector("navigationBar:shouldPopItem:")
    default boolean navigationBarShouldPopItem(@NotNull UINavigationBar navigationBar, @NotNull UINavigationItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called to push. return NO not to.
     */
    @Generated
    @IsOptional
    @Selector("navigationBar:shouldPushItem:")
    default boolean navigationBarShouldPushItem(@NotNull UINavigationBar navigationBar,
            @NotNull UINavigationItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Which section of the NSToolbar this navigation bar should use when attempting to host in an NSToolbar. Returning
     * 'None' will disable NSToolbar hosting as if preferredBehavioralStyle were set to 'Pad' The specific section
     * returned will also affect how the navigation bar presents in that section.
     */
    @Generated
    @IsOptional
    @Selector("navigationBarNSToolbarSection:")
    @NInt
    default long navigationBarNSToolbarSection(@NotNull UINavigationBar navigationBar) {
        throw new java.lang.UnsupportedOperationException();
    }
}
