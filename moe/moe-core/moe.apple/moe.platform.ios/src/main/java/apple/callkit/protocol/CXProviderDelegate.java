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

package apple.callkit.protocol;

import apple.avfoundation.AVAudioSession;
import apple.callkit.CXAction;
import apple.callkit.CXAnswerCallAction;
import apple.callkit.CXEndCallAction;
import apple.callkit.CXPlayDTMFCallAction;
import apple.callkit.CXProvider;
import apple.callkit.CXSetGroupCallAction;
import apple.callkit.CXSetHeldCallAction;
import apple.callkit.CXSetMutedCallAction;
import apple.callkit.CXStartCallAction;
import apple.callkit.CXTransaction;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CallKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CXProviderDelegate")
public interface CXProviderDelegate {
    @Generated
    @IsOptional
    @Selector("provider:didActivateAudioSession:")
    default void providerDidActivateAudioSession(CXProvider provider, AVAudioSession audioSession) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("provider:didDeactivateAudioSession:")
    default void providerDidDeactivateAudioSession(CXProvider provider, AVAudioSession audioSession) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("provider:executeTransaction:")
    default boolean providerExecuteTransaction(CXProvider provider, CXTransaction transaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("provider:performAnswerCallAction:")
    default void providerPerformAnswerCallAction(CXProvider provider, CXAnswerCallAction action) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("provider:performEndCallAction:")
    default void providerPerformEndCallAction(CXProvider provider, CXEndCallAction action) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("provider:performPlayDTMFCallAction:")
    default void providerPerformPlayDTMFCallAction(CXProvider provider, CXPlayDTMFCallAction action) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("provider:performSetGroupCallAction:")
    default void providerPerformSetGroupCallAction(CXProvider provider, CXSetGroupCallAction action) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("provider:performSetHeldCallAction:")
    default void providerPerformSetHeldCallAction(CXProvider provider, CXSetHeldCallAction action) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("provider:performSetMutedCallAction:")
    default void providerPerformSetMutedCallAction(CXProvider provider, CXSetMutedCallAction action) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("provider:performStartCallAction:")
    default void providerPerformStartCallAction(CXProvider provider, CXStartCallAction action) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("provider:timedOutPerformingAction:")
    default void providerTimedOutPerformingAction(CXProvider provider, CXAction action) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("providerDidBegin:")
    default void providerDidBegin(CXProvider provider) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("providerDidReset:")
    void providerDidReset(CXProvider provider);
}
