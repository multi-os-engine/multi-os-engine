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

/**
 * Protocol to which the principal view controller of the extension must conform.
 */
@Generated
@Library("PhotosUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PHContentEditingController")
public interface PHContentEditingController {
    /**
     * Query whether the receiver can handle (i.e. can decode and render) the given adjustment data.
     */
    @Generated
    @Selector("canHandleAdjustmentData:")
    boolean canHandleAdjustmentData(PHAdjustmentData adjustmentData);

    /**
     * Called if the user cancels the editing session. (Can be called while the receiver is producing the editing
     * output.)
     */
    @Generated
    @Selector("cancelContentEditing")
    void cancelContentEditing();

    /**
     * Called when the user finishes the editing session. The receiver should prevent the user from editing the asset
     * further. Also, it should create the editing output and call the completion handler. The completion handler
     * returns after the output has been consumed, so it is safe to perform clean up after it returns. The completion
     * handler can (and should best) be called on a background queue.
     */
    @Generated
    @Selector("finishContentEditingWithCompletionHandler:")
    void finishContentEditingWithCompletionHandler(
            @ObjCBlock(name = "call_finishContentEditingWithCompletionHandler") Block_finishContentEditingWithCompletionHandler completionHandler);

    /**
     * Returns whether the user should be prompted when canceling the editing session.
     */
    @Generated
    @Selector("shouldShowCancelConfirmation")
    boolean shouldShowCancelConfirmation();

    /**
     * Provides the input for the editing session. The placeholder image represents the current version of the asset
     * (with adjustments baked in), and can be used as UI placeholder, in case rendering the adjustments from the input
     * cannot be done in a timely fashion.
     */
    @Generated
    @Selector("startContentEditingWithInput:placeholderImage:")
    void startContentEditingWithInputPlaceholderImage(PHContentEditingInput contentEditingInput,
            UIImage placeholderImage);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_finishContentEditingWithCompletionHandler {
        @Generated
        void call_finishContentEditingWithCompletionHandler(PHContentEditingOutput arg0);
    }
}
