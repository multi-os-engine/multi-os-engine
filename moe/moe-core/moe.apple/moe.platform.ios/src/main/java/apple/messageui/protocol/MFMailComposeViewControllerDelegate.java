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

package apple.messageui.protocol;

import apple.foundation.NSError;
import apple.messageui.MFMailComposeViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol]    MFMailComposeViewControllerDelegate
 * <p>
 * Protocol for delegate callbacks to MFMailComposeViewController instances.
 * <p>
 * This protocol must be implemented for delegates of MFMailComposeViewController instances.  It will
 * be called at various times while the user is composing, sending, saving, or canceling email composition.
 */
@Generated
@Library("MessageUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MFMailComposeViewControllerDelegate")
public interface MFMailComposeViewControllerDelegate {
    /**
     * mailComposeController:didFinishWithResult:error:
     * <p>
     * Delegate callback which is called upon user's completion of email composition.
     * <p>
     * This delegate callback will be called when the user completes the email composition.  How the user chose
     * to complete this task will be given as one of the parameters to the callback.  Upon this call, the client
     * should remove the view associated with the controller, typically by dismissing modally.
     *
     * @param controller The MFMailComposeViewController instance which is returning the result.
     * @param result     MFMailComposeResult indicating how the user chose to complete the composition process.
     * @param error      NSError indicating the failure reason if failure did occur.  This will be <tt>nil</tt> if
     *                   result did not indicate failure.
     */
    @Generated
    @IsOptional
    @Selector("mailComposeController:didFinishWithResult:error:")
    default void mailComposeControllerDidFinishWithResultError(MFMailComposeViewController controller,
            @NInt long result, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }
}
