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

/**
 * @abstract Protocol to declare support for handling an INGetRideStatusIntent. By implementing this protocol, a class can provide logic for resolving, confirming and handling the intent.
 * @discussion The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and confirmation methods are optional. The handling method is always called last, after resolving and confirming the intent.
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INGetRideStatusIntentHandling")
public interface INGetRideStatusIntentHandling {
    /**
     * @abstract Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * @discussion Called prior to asking the app to handle the intent. The app should return a response object that contains additional information about the intent, which may be relevant for the system to show the user prior to handling. If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no additional information relevant to this intent.
     * 
     * @param  intent The input intent
     * @param  completion The response block contains an INGetRideStatusIntentResponse containing additional details about the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INGetRideStatusIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmGetRideStatus:completion:")
    default void confirmGetRideStatusCompletion(INGetRideStatusIntent intent,
            @ObjCBlock(name = "call_confirmGetRideStatusCompletion") Block_confirmGetRideStatusCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @abstract Handling method - Execute the task represented by the INGetRideStatusIntent that's passed in
     * @discussion Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param  intent The input intent
     * @param  completion The response handling block takes a INGetRideStatusIntentResponse containing the details of the result of having executed the intent
     * 
     * @see  INGetRideStatusIntentResponse
     */
    @Generated
    @Selector("handleGetRideStatus:completion:")
    void handleGetRideStatusCompletion(INGetRideStatusIntent intent,
            @ObjCBlock(name = "call_handleGetRideStatusCompletion") Block_handleGetRideStatusCompletion completion);

    @Generated
    @Selector("startSendingUpdatesForGetRideStatus:toObserver:")
    void startSendingUpdatesForGetRideStatusToObserver(INGetRideStatusIntent intent,
            @Mapped(ObjCObjectMapper.class) INGetRideStatusIntentResponseObserver observer);

    @Generated
    @Selector("stopSendingUpdatesForGetRideStatus:")
    void stopSendingUpdatesForGetRideStatus(INGetRideStatusIntent intent);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmGetRideStatusCompletion {
        @Generated
        void call_confirmGetRideStatusCompletion(INGetRideStatusIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleGetRideStatusCompletion {
        @Generated
        void call_handleGetRideStatusCompletion(INGetRideStatusIntentResponse response);
    }
}
