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

package apple.gamekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gamekit.protocol.GKVoiceChatClient;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * GKVoiceChatService provides voice chat capabilities depending on your networking situation.
 */
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKVoiceChatService extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKVoiceChatService(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKVoiceChatService alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKVoiceChatService allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("defaultVoiceChatService")
    public static native GKVoiceChatService defaultVoiceChatService();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("isVoIPAllowed")
    public static native boolean isVoIPAllowed();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native GKVoiceChatService new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * callID is returned by didReceiveInvitationFromParticipantID call. An error may occur if there can be no viable
     * connection made to the remote participant.
     */
    @Generated
    @Selector("acceptCallID:error:")
    public native boolean acceptCallIDError(@NInt long callID, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 7.0
     */
    @Deprecated
    @Generated
    @Selector("client")
    @MappedReturn(ObjCObjectMapper.class)
    public native GKVoiceChatClient client();

    /**
     * callID is returned by didReceiveInvitationFromParticipantID call.
     */
    @Generated
    @Selector("denyCallID:")
    public native void denyCallID(@NInt long callID);

    @Generated
    @Selector("init")
    public native GKVoiceChatService init();

    /**
     * changes frequently as the near-end participant speaks
     */
    @Generated
    @Selector("inputMeterLevel")
    public native float inputMeterLevel();

    /**
     * default NO
     */
    @Generated
    @Selector("isInputMeteringEnabled")
    public native boolean isInputMeteringEnabled();

    /**
     * default NO
     */
    @Generated
    @Selector("setInputMeteringEnabled:")
    public native void setInputMeteringEnabled(boolean value);

    /**
     * default is NO
     */
    @Generated
    @Selector("isMicrophoneMuted")
    public native boolean isMicrophoneMuted();

    /**
     * default is NO
     */
    @Generated
    @Selector("setMicrophoneMuted:")
    public native void setMicrophoneMuted(boolean value);

    /**
     * default NO
     */
    @Generated
    @Selector("isOutputMeteringEnabled")
    public native boolean isOutputMeteringEnabled();

    /**
     * default NO
     */
    @Generated
    @Selector("setOutputMeteringEnabled:")
    public native void setOutputMeteringEnabled(boolean value);

    /**
     * changes frequently as the far-end participant speaks
     */
    @Generated
    @Selector("outputMeterLevel")
    public native float outputMeterLevel();

    /**
     * will be called by the client otherwise.
     */
    @Generated
    @Selector("receivedData:fromParticipantID:")
    public native void receivedDataFromParticipantID(NSData arbitraryData, String participantID);

    /**
     * will only be called by the client if the client has a pre-established peer-to-peer UDP connection. Used to
     * receive audio.
     */
    @Generated
    @Selector("receivedRealTimeData:fromParticipantID:")
    public native void receivedRealTimeDataFromParticipantID(NSData audio, String participantID);

    /**
     * default 1.0 (max is 1.0, min is 0.0)
     */
    @Generated
    @Selector("remoteParticipantVolume")
    public native float remoteParticipantVolume();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 7.0
     */
    @Deprecated
    @Generated
    @Selector("setClient:")
    public native void setClient_unsafe(@Mapped(ObjCObjectMapper.class) GKVoiceChatClient value);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 7.0
     */
    @Deprecated
    @Generated
    public void setClient(@Mapped(ObjCObjectMapper.class) GKVoiceChatClient value) {
        Object __old = client();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setClient_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * default 1.0 (max is 1.0, min is 0.0)
     */
    @Generated
    @Selector("setRemoteParticipantVolume:")
    public native void setRemoteParticipantVolume(float value);

    /**
     * May fail if you already in a chat, or if there is no peer-to-peer channel that can be made to the participant.
     */
    @Generated
    @Selector("startVoiceChatWithParticipantID:error:")
    public native boolean startVoiceChatWithParticipantIDError(String participantID,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("stopVoiceChatWithParticipantID:")
    public native void stopVoiceChatWithParticipantID(String participantID);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
