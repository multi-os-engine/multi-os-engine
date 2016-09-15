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

package apple.photosui.protocol;

import apple.photos.PHAdjustmentData;
import apple.photos.PHContentEditingInput;
import apple.photos.PHContentEditingOutput;
import apple.uikit.UIImage;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("PhotosUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PHContentEditingController")
public interface PHContentEditingController {
    /**
     * canHandleAdjustmentData:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PhotosUI/Reference/PHContentEditingController_Protocol/index.html#//apple_ref/occ/intfm/PHContentEditingController/canHandleAdjustmentData:">iOS Dev Center</a>
     */
    @Generated
    @Selector("canHandleAdjustmentData:")
    boolean canHandleAdjustmentData(PHAdjustmentData adjustmentData);

    /**
     * cancelContentEditing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PhotosUI/Reference/PHContentEditingController_Protocol/index.html#//apple_ref/occ/intfm/PHContentEditingController/cancelContentEditing">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancelContentEditing")
    void cancelContentEditing();

    /**
     * finishContentEditingWithCompletionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PhotosUI/Reference/PHContentEditingController_Protocol/index.html#//apple_ref/occ/intfm/PHContentEditingController/finishContentEditingWithCompletionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("finishContentEditingWithCompletionHandler:")
    void finishContentEditingWithCompletionHandler(
            @ObjCBlock(name = "call_finishContentEditingWithCompletionHandler") Block_finishContentEditingWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_finishContentEditingWithCompletionHandler {
        @Generated
        void call_finishContentEditingWithCompletionHandler(PHContentEditingOutput arg0);
    }

    /**
     * shouldShowCancelConfirmation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PhotosUI/Reference/PHContentEditingController_Protocol/index.html#//apple_ref/occ/intfp/PHContentEditingController/shouldShowCancelConfirmation">iOS Dev Center</a>
     */
    @Generated
    @Selector("shouldShowCancelConfirmation")
    boolean shouldShowCancelConfirmation();

    /**
     * startContentEditingWithInput:placeholderImage:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PhotosUI/Reference/PHContentEditingController_Protocol/index.html#//apple_ref/occ/intfm/PHContentEditingController/startContentEditingWithInput:placeholderImage:">iOS Dev Center</a>
     */
    @Generated
    @Selector("startContentEditingWithInput:placeholderImage:")
    void startContentEditingWithInputPlaceholderImage(PHContentEditingInput contentEditingInput,
            UIImage placeholderImage);
}
