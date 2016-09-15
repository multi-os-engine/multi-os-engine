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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UISearchControllerDelegate")
public interface UISearchControllerDelegate {
    /**
     * didDismissSearchController:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/UISearchControllerDelegate/didDismissSearchController:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("didDismissSearchController:")
    default void didDismissSearchController(UISearchController searchController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * didPresentSearchController:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/UISearchControllerDelegate/didPresentSearchController:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("didPresentSearchController:")
    default void didPresentSearchController(UISearchController searchController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * presentSearchController:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/UISearchControllerDelegate/presentSearchController:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("presentSearchController:")
    default void presentSearchController(UISearchController searchController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * willDismissSearchController:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/UISearchControllerDelegate/willDismissSearchController:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("willDismissSearchController:")
    default void willDismissSearchController(UISearchController searchController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * willPresentSearchController:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/UISearchControllerDelegate/willPresentSearchController:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("willPresentSearchController:")
    default void willPresentSearchController(UISearchController searchController) {
        throw new java.lang.UnsupportedOperationException();
    }
}
