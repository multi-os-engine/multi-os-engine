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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

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
    @Selector("initialize")
    public static native void initialize();

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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

    @Generated
    @Selector("acceptCallID:error:")
    public native boolean acceptCallIDError(@NInt long callID, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("client")
    @MappedReturn(ObjCObjectMapper.class)
    public native GKVoiceChatClient client();

    @Generated
    @Selector("denyCallID:")
    public native void denyCallID(@NInt long callID);

    @Generated
    @Selector("init")
    public native GKVoiceChatService init();

    @Generated
    @Selector("inputMeterLevel")
    public native float inputMeterLevel();

    @Generated
    @Selector("isInputMeteringEnabled")
    public native boolean isInputMeteringEnabled();

    @Generated
    @Selector("setInputMeteringEnabled:")
    public native void setInputMeteringEnabled(boolean value);

    @Generated
    @Selector("isMicrophoneMuted")
    public native boolean isMicrophoneMuted();

    @Generated
    @Selector("setMicrophoneMuted:")
    public native void setMicrophoneMuted(boolean value);

    @Generated
    @Selector("isOutputMeteringEnabled")
    public native boolean isOutputMeteringEnabled();

    @Generated
    @Selector("setOutputMeteringEnabled:")
    public native void setOutputMeteringEnabled(boolean value);

    @Generated
    @Selector("outputMeterLevel")
    public native float outputMeterLevel();

    @Generated
    @Selector("receivedData:fromParticipantID:")
    public native void receivedDataFromParticipantID(NSData arbitraryData, String participantID);

    @Generated
    @Selector("receivedRealTimeData:fromParticipantID:")
    public native void receivedRealTimeDataFromParticipantID(NSData audio, String participantID);

    @Generated
    @Selector("remoteParticipantVolume")
    public native float remoteParticipantVolume();

    @Generated
    @Selector("setClient:")
    public native void setClient_unsafe(@Mapped(ObjCObjectMapper.class) GKVoiceChatClient value);

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

    @Generated
    @Selector("setRemoteParticipantVolume:")
    public native void setRemoteParticipantVolume(float value);

    @Generated
    @Selector("startVoiceChatWithParticipantID:error:")
    public native boolean startVoiceChatWithParticipantIDError(String participantID,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("stopVoiceChatWithParticipantID:")
    public native void stopVoiceChatWithParticipantID(String participantID);
}
