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

package apple.replaykit.protocol;

import apple.foundation.NSError;
import apple.replaykit.RPBroadcastActivityViewController;
import apple.replaykit.RPBroadcastController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("ReplayKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("RPBroadcastActivityViewControllerDelegate")
public interface RPBroadcastActivityViewControllerDelegate {
    /**
     * Called when the view controller is finished.
     * 
     * @param broadcastActivityViewController The view controller instance.
     * @param broadcastController An RPBroadcastController instance that can be used to start and stop broadcasts to a user selected service.
     * @param error Optional error in the RPRecordingErrorCode domain. A nil error signifies that the user has successfully set up the broadcast with a broadcast service and is ready to start broadcasting.
     */
    @Generated
    @Selector("broadcastActivityViewController:didFinishWithBroadcastController:error:")
    void broadcastActivityViewControllerDidFinishWithBroadcastControllerError(
            RPBroadcastActivityViewController broadcastActivityViewController,
            RPBroadcastController broadcastController, NSError error);
}
