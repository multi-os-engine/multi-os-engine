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

import apple.messageui.MFMessageComposeViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] MFMessageComposeViewControllerDelegate
 * 
 * Protocol for delegate callbacks to MFMessageComposeViewControllerDelegate instances.
 * 
 * This protocol will be implemented by delegates of MFMessageComposeViewController instances.
 * It will be called at various times while the user is composing, sending, or canceling
 * message composition.
 */
@Generated
@Library("MessageUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MFMessageComposeViewControllerDelegate")
public interface MFMessageComposeViewControllerDelegate {
    /**
     * messageComposeViewController:didFinishWithResult:
     * 
     * Delegate callback which is called upon user's completion of message composition.
     * 
     * This delegate callback will be called when the user completes the message composition.
     * How the user chose to complete this task will be given as one of the parameters to the
     * callback. Upon this call, the client should remove the view associated with the controller,
     * typically by dismissing modally.
     * 
     * @param controller The MFMessageComposeViewController instance which is returning the result.
     * @param result     MessageComposeResult indicating how the user chose to complete the composition process.
     */
    @Generated
    @Selector("messageComposeViewController:didFinishWithResult:")
    void messageComposeViewControllerDidFinishWithResult(MFMessageComposeViewController controller, @NInt long result);
}
