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

import apple.intents.INListRideOptionsIntent;
import apple.intents.INListRideOptionsIntentResponse;
import apple.intents.INPlacemarkResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INListRideOptionsIntentHandling")
public interface INListRideOptionsIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmListRideOptions:completion:")
    default void confirmListRideOptionsCompletion(INListRideOptionsIntent intent,
            @ObjCBlock(name = "call_confirmListRideOptionsCompletion") Block_confirmListRideOptionsCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleListRideOptions:completion:")
    void handleListRideOptionsCompletion(INListRideOptionsIntent intent,
            @ObjCBlock(name = "call_handleListRideOptionsCompletion") Block_handleListRideOptionsCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveDropOffLocationForListRideOptions:withCompletion:")
    default void resolveDropOffLocationForListRideOptionsWithCompletion(INListRideOptionsIntent intent,
            @ObjCBlock(name = "call_resolveDropOffLocationForListRideOptionsWithCompletion") Block_resolveDropOffLocationForListRideOptionsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolvePickupLocationForListRideOptions:withCompletion:")
    default void resolvePickupLocationForListRideOptionsWithCompletion(INListRideOptionsIntent intent,
            @ObjCBlock(name = "call_resolvePickupLocationForListRideOptionsWithCompletion") Block_resolvePickupLocationForListRideOptionsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmListRideOptionsCompletion {
        @Generated
        void call_confirmListRideOptionsCompletion(INListRideOptionsIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleListRideOptionsCompletion {
        @Generated
        void call_handleListRideOptionsCompletion(INListRideOptionsIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveDropOffLocationForListRideOptionsWithCompletion {
        @Generated
        void call_resolveDropOffLocationForListRideOptionsWithCompletion(INPlacemarkResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePickupLocationForListRideOptionsWithCompletion {
        @Generated
        void call_resolvePickupLocationForListRideOptionsWithCompletion(INPlacemarkResolutionResult arg0);
    }
}
