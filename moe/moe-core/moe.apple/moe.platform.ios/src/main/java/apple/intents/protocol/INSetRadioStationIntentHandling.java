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

import apple.intents.INDoubleResolutionResult;
import apple.intents.INIntegerResolutionResult;
import apple.intents.INRadioTypeResolutionResult;
import apple.intents.INSetRadioStationIntent;
import apple.intents.INSetRadioStationIntentResponse;
import apple.intents.INStringResolutionResult;
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
@ObjCProtocolName("INSetRadioStationIntentHandling")
public interface INSetRadioStationIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmSetRadioStation:completion:")
    default void confirmSetRadioStationCompletion(INSetRadioStationIntent intent,
            @ObjCBlock(name = "call_confirmSetRadioStationCompletion") Block_confirmSetRadioStationCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleSetRadioStation:completion:")
    void handleSetRadioStationCompletion(INSetRadioStationIntent intent,
            @ObjCBlock(name = "call_handleSetRadioStationCompletion") Block_handleSetRadioStationCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveChannelForSetRadioStation:withCompletion:")
    default void resolveChannelForSetRadioStationWithCompletion(INSetRadioStationIntent intent,
            @ObjCBlock(name = "call_resolveChannelForSetRadioStationWithCompletion") Block_resolveChannelForSetRadioStationWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveFrequencyForSetRadioStation:withCompletion:")
    default void resolveFrequencyForSetRadioStationWithCompletion(INSetRadioStationIntent intent,
            @ObjCBlock(name = "call_resolveFrequencyForSetRadioStationWithCompletion") Block_resolveFrequencyForSetRadioStationWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolvePresetNumberForSetRadioStation:withCompletion:")
    default void resolvePresetNumberForSetRadioStationWithCompletion(INSetRadioStationIntent intent,
            @ObjCBlock(name = "call_resolvePresetNumberForSetRadioStationWithCompletion") Block_resolvePresetNumberForSetRadioStationWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveRadioTypeForSetRadioStation:withCompletion:")
    default void resolveRadioTypeForSetRadioStationWithCompletion(INSetRadioStationIntent intent,
            @ObjCBlock(name = "call_resolveRadioTypeForSetRadioStationWithCompletion") Block_resolveRadioTypeForSetRadioStationWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveStationNameForSetRadioStation:withCompletion:")
    default void resolveStationNameForSetRadioStationWithCompletion(INSetRadioStationIntent intent,
            @ObjCBlock(name = "call_resolveStationNameForSetRadioStationWithCompletion") Block_resolveStationNameForSetRadioStationWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSetRadioStationCompletion {
        @Generated
        void call_confirmSetRadioStationCompletion(INSetRadioStationIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSetRadioStationCompletion {
        @Generated
        void call_handleSetRadioStationCompletion(INSetRadioStationIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveChannelForSetRadioStationWithCompletion {
        @Generated
        void call_resolveChannelForSetRadioStationWithCompletion(INStringResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveFrequencyForSetRadioStationWithCompletion {
        @Generated
        void call_resolveFrequencyForSetRadioStationWithCompletion(INDoubleResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePresetNumberForSetRadioStationWithCompletion {
        @Generated
        void call_resolvePresetNumberForSetRadioStationWithCompletion(INIntegerResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRadioTypeForSetRadioStationWithCompletion {
        @Generated
        void call_resolveRadioTypeForSetRadioStationWithCompletion(INRadioTypeResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveStationNameForSetRadioStationWithCompletion {
        @Generated
        void call_resolveStationNameForSetRadioStationWithCompletion(INStringResolutionResult resolutionResult);
    }
}
