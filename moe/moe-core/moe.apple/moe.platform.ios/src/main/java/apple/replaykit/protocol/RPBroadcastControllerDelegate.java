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

import apple.NSObject;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSURL;
import apple.replaykit.RPBroadcastController;
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
@ObjCProtocolName("RPBroadcastControllerDelegate")
public interface RPBroadcastControllerDelegate {
    @Generated
    @IsOptional
    @Selector("broadcastController:didFinishWithError:")
    default void broadcastControllerDidFinishWithError(RPBroadcastController broadcastController, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("broadcastController:didUpdateServiceInfo:")
    default void broadcastControllerDidUpdateServiceInfo(RPBroadcastController broadcastController,
            NSDictionary<String, ? extends NSObject> serviceInfo) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("broadcastController:didUpdateBroadcastURL:")
    default void broadcastControllerDidUpdateBroadcastURL(RPBroadcastController broadcastController,
            NSURL broadcastURL) {
        throw new java.lang.UnsupportedOperationException();
    }
}
