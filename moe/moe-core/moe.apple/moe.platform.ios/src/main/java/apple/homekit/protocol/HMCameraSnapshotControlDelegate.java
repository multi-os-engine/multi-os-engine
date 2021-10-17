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

package apple.homekit.protocol;

import apple.foundation.NSError;
import apple.homekit.HMCameraSnapshot;
import apple.homekit.HMCameraSnapshotControl;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * This delegate receives updates on the camera snapshot.
 */
@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("HMCameraSnapshotControlDelegate")
public interface HMCameraSnapshotControlDelegate {
    /**
     * Informs the delegate that the snapshot was taken.
     *
     * @param cameraSnapshotControl Sender of this message.
     * @param snapshot              Snapshot will be valid if snapshot was successfully taken.
     * @param error                 Error will be populated if the snapshot could not be taken.
     */
    @Generated
    @IsOptional
    @Selector("cameraSnapshotControl:didTakeSnapshot:error:")
    default void cameraSnapshotControlDidTakeSnapshotError(HMCameraSnapshotControl cameraSnapshotControl,
            HMCameraSnapshot snapshot, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that the mostRecentSnapshot was updated.
     *
     * @param cameraSnapshotControl Sender of this message.
     */
    @Generated
    @IsOptional
    @Selector("cameraSnapshotControlDidUpdateMostRecentSnapshot:")
    default void cameraSnapshotControlDidUpdateMostRecentSnapshot(HMCameraSnapshotControl cameraSnapshotControl) {
        throw new java.lang.UnsupportedOperationException();
    }
}
