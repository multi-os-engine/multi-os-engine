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

package apple.foundation.protocol;

import apple.foundation.NSInputStream;
import apple.foundation.NSOutputStream;
import apple.foundation.NSUserActivity;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * The user activity delegate is responsible for updating the state of an activity and is also notified when an activity has been continued on another device.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSUserActivityDelegate")
public interface NSUserActivityDelegate {
    /**
     * If supportsContinuationStreams is set to YES the continuing side can request streams back to this user activity. This delegate callback will be received with the incoming streams from the other side. The streams will be in an unopened state. The streams should be opened immediately to start receiving requests from the continuing side.
     */
    @Generated
    @IsOptional
    @Selector("userActivity:didReceiveInputStream:outputStream:")
    default void userActivityDidReceiveInputStreamOutputStream(NSUserActivity userActivity, NSInputStream inputStream,
            NSOutputStream outputStream) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The user activity was continued on another device.
     */
    @Generated
    @IsOptional
    @Selector("userActivityWasContinued:")
    default void userActivityWasContinued(NSUserActivity userActivity) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The user activity will be saved (to be continued or persisted). The receiver should update the activity with current activity state.
     */
    @Generated
    @IsOptional
    @Selector("userActivityWillSave:")
    default void userActivityWillSave(NSUserActivity userActivity) {
        throw new java.lang.UnsupportedOperationException();
    }
}
