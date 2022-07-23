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
import apple.replaykit.RPPreviewViewController;
import apple.replaykit.RPScreenRecorder;
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
@ObjCProtocolName("RPScreenRecorderDelegate")
public interface RPScreenRecorderDelegate {
    /**
     * Called when recording has stopped due to an error.
     *
     * @param screenRecorder        The instance of the screen recorder.
     * @param error                 An NSError describing why recording has stopped in the RPRecordingErrorDomain.
     * @param previewViewController If a partial movie is available before it was stopped, an instance of
     *                              RPPreviewViewController will be returned.
     */
    @Generated
    @IsOptional
    @Selector("screenRecorder:didStopRecordingWithError:previewViewController:")
    default void screenRecorderDidStopRecordingWithErrorPreviewViewController(RPScreenRecorder screenRecorder,
            NSError error, RPPreviewViewController previewViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the recorder becomes available or stops being available. Check the screen recorder's availability
     * property to check the current availability state. Possible reasons for the recorder to be unavailable include an
     * in-progress Airplay/TVOut session or unsupported hardware.
     *
     * @param screenRecorder The instance of the screen recorder.
     */
    @Generated
    @IsOptional
    @Selector("screenRecorderDidChangeAvailability:")
    default void screenRecorderDidChangeAvailability(RPScreenRecorder screenRecorder) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("screenRecorder:didStopRecordingWithPreviewViewController:error:")
    default void screenRecorderDidStopRecordingWithPreviewViewControllerError(RPScreenRecorder screenRecorder,
            RPPreviewViewController previewViewController, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }
}
