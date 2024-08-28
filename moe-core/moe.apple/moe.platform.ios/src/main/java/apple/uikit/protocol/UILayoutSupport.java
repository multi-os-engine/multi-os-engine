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

import apple.uikit.NSLayoutDimension;
import apple.uikit.NSLayoutYAxisAnchor;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UILayoutSupport")
public interface UILayoutSupport {
    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("bottomAnchor")
    NSLayoutYAxisAnchor bottomAnchor();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("heightAnchor")
    NSLayoutDimension heightAnchor();

    /**
     * As a courtesy when not using auto layout, this value is safe to refer to in -viewDidLayoutSubviews, or in
     * -layoutSubviews after calling super
     */
    @Generated
    @Selector("length")
    @NFloat
    double length();

    /**
     * Constraint creation conveniences. See NSLayoutAnchor.h for details.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("topAnchor")
    NSLayoutYAxisAnchor topAnchor();
}
