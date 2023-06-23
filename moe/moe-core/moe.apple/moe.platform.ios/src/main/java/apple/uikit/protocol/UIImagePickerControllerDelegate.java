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

import apple.foundation.NSDictionary;
import apple.uikit.UIImage;
import apple.uikit.UIImagePickerController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIImagePickerControllerDelegate")
public interface UIImagePickerControllerDelegate {
    /**
     * The picker does not dismiss itself; the client dismisses it in these callbacks.
     * The delegate will receive one or the other, but not both, depending whether the user
     * confirms or cancels.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 3.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("imagePickerController:didFinishPickingImage:editingInfo:")
    default void imagePickerControllerDidFinishPickingImageEditingInfo(@NotNull UIImagePickerController picker,
            @NotNull UIImage image, @Nullable NSDictionary<String, ?> editingInfo) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("imagePickerController:didFinishPickingMediaWithInfo:")
    default void imagePickerControllerDidFinishPickingMediaWithInfo(@NotNull UIImagePickerController picker,
            @NotNull NSDictionary<String, ?> info) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("imagePickerControllerDidCancel:")
    default void imagePickerControllerDidCancel(@NotNull UIImagePickerController picker) {
        throw new java.lang.UnsupportedOperationException();
    }
}
