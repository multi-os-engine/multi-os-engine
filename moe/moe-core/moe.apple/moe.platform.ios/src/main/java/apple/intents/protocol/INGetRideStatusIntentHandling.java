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

package apple.intents.protocol;

import apple.intents.INGetRideStatusIntent;
import apple.intents.INGetRideStatusIntentResponse;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INGetRideStatusIntentHandling")
public interface INGetRideStatusIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmGetRideStatus:completion:")
    default void confirmGetRideStatusCompletion(INGetRideStatusIntent intent,
            @ObjCBlock(name = "call_confirmGetRideStatusCompletion") Block_confirmGetRideStatusCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleGetRideStatus:completion:")
    void handleGetRideStatusCompletion(INGetRideStatusIntent intent,
            @ObjCBlock(name = "call_handleGetRideStatusCompletion") Block_handleGetRideStatusCompletion completion);

    @Generated
    @Selector("startSendingUpdatesForGetRideStatus:toObserver:")
    void startSendingUpdatesForGetRideStatusToObserver(INGetRideStatusIntent intent,
            @Mapped(ObjCObjectMapper.class) Object observer);

    @Generated
    @Selector("stopSendingUpdatesForGetRideStatus:")
    void stopSendingUpdatesForGetRideStatus(INGetRideStatusIntent intent);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmGetRideStatusCompletion {
        @Generated
        void call_confirmGetRideStatusCompletion(INGetRideStatusIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleGetRideStatusCompletion {
        @Generated
        void call_handleGetRideStatusCompletion(INGetRideStatusIntentResponse arg0);
    }
}
