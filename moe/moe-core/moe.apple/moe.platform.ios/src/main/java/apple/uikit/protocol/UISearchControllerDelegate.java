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

import apple.uikit.UISearchController;
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
@ObjCProtocolName("UISearchControllerDelegate")
public interface UISearchControllerDelegate {
    @Generated
    @IsOptional
    @Selector("didDismissSearchController:")
    default void didDismissSearchController(@NotNull UISearchController searchController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("didPresentSearchController:")
    default void didPresentSearchController(@NotNull UISearchController searchController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called after the search controller's search bar has agreed to begin editing or when 'active' is set to YES. If
     * you choose not to present the controller yourself or do not implement this method, a default presentation is
     * performed on your behalf.
     */
    @Generated
    @IsOptional
    @Selector("presentSearchController:")
    default void presentSearchController(@NotNull UISearchController searchController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("willDismissSearchController:")
    default void willDismissSearchController(@NotNull UISearchController searchController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * These methods are called when automatic presentation or dismissal occurs. They will not be called if you present
     * or dismiss the search controller yourself.
     */
    @Generated
    @IsOptional
    @Selector("willPresentSearchController:")
    default void willPresentSearchController(@NotNull UISearchController searchController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("searchController:didChangeFromSearchBarPlacement:")
    default void searchControllerDidChangeFromSearchBarPlacement(@NotNull UISearchController searchController,
            @NInt long previousPlacement) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("searchController:willChangeToSearchBarPlacement:")
    default void searchControllerWillChangeToSearchBarPlacement(@NotNull UISearchController searchController,
            @NInt long newPlacement) {
        throw new java.lang.UnsupportedOperationException();
    }
}
