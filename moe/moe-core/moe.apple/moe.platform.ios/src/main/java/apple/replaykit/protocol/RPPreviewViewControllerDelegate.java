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

import apple.foundation.NSSet;
import apple.replaykit.RPPreviewViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("ReplayKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("RPPreviewViewControllerDelegate")
public interface RPPreviewViewControllerDelegate {
    /**
     * Called when the view controller is finished and returns a set of activity types that the user has completed on the recording. The built in activity types are listed in UIActivity.h.
     */
    @Generated
    @IsOptional
    @Selector("previewController:didFinishWithActivityTypes:")
    default void previewControllerDidFinishWithActivityTypes(RPPreviewViewController previewController,
            NSSet<String> activityTypes) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the view controller is finished.
     */
    @Generated
    @IsOptional
    @Selector("previewControllerDidFinish:")
    default void previewControllerDidFinish(RPPreviewViewController previewController) {
        throw new java.lang.UnsupportedOperationException();
    }
}
