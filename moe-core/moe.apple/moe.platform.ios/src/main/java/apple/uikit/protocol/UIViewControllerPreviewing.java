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

import apple.uikit.UIGestureRecognizer;
import apple.uikit.UIView;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIViewControllerPreviewing")
public interface UIViewControllerPreviewing {
    /**
     * API-Since: 9.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: UIViewControllerPreviewing is deprecated. Please use UIContextMenuInteraction.
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    UIViewControllerPreviewingDelegate delegate();

    /**
     * This gesture can be used to cause the previewing presentation to wait until one of your gestures fails or to
     * allow simultaneous recognition during the initial phase of the preview presentation.
     * 
     * API-Since: 9.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: UIViewControllerPreviewing is deprecated. Please use UIContextMenuInteraction.
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("previewingGestureRecognizerForFailureRelationship")
    UIGestureRecognizer previewingGestureRecognizerForFailureRelationship();

    /**
     * This rect will be set to the bounds of sourceView before each call to
     * -previewingContext:viewControllerForLocation:
     * 
     * API-Since: 9.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: UIViewControllerPreviewing is deprecated. Please use UIContextMenuInteraction.
     */
    @Deprecated
    @Generated
    @Selector("setSourceRect:")
    void setSourceRect(@ByValue CGRect value);

    /**
     * This rect will be set to the bounds of sourceView before each call to
     * -previewingContext:viewControllerForLocation:
     * 
     * API-Since: 9.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: UIViewControllerPreviewing is deprecated. Please use UIContextMenuInteraction.
     */
    @Deprecated
    @Generated
    @Selector("sourceRect")
    @ByValue
    CGRect sourceRect();

    /**
     * API-Since: 9.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: UIViewControllerPreviewing is deprecated. Please use UIContextMenuInteraction.
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("sourceView")
    UIView sourceView();
}
