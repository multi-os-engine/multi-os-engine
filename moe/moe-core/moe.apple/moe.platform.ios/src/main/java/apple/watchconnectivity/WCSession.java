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

package apple.watchconnectivity;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.watchconnectivity.protocol.WCSessionDelegate;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("WatchConnectivity")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WCSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected WCSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native WCSession alloc();

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
    @Selector("defaultSession")
    public static native WCSession defaultSession();

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
    @Selector("isSupported")
    public static native boolean isSupported();

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
    @Selector("activateSession")
    public native void activateSession();

    @Generated
    @Selector("activationState")
    @NInt
    public native long activationState();

    @Generated
    @Selector("applicationContext")
    public native NSDictionary<String, ?> applicationContext();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native WCSessionDelegate delegate();

    @Generated
    @Selector("hasContentPending")
    public native boolean hasContentPending();

    @Generated
    @Selector("init")
    public native WCSession init();

    @Generated
    @Selector("isComplicationEnabled")
    public native boolean isComplicationEnabled();

    @Generated
    @Selector("isPaired")
    public native boolean isPaired();

    @Generated
    @Selector("isReachable")
    public native boolean isReachable();

    @Generated
    @Selector("isWatchAppInstalled")
    public native boolean isWatchAppInstalled();

    @Generated
    @Selector("outstandingFileTransfers")
    public native NSArray<? extends WCSessionFileTransfer> outstandingFileTransfers();

    @Generated
    @Selector("outstandingUserInfoTransfers")
    public native NSArray<? extends WCSessionUserInfoTransfer> outstandingUserInfoTransfers();

    @Generated
    @Selector("receivedApplicationContext")
    public native NSDictionary<String, ?> receivedApplicationContext();

    @Generated
    @Selector("remainingComplicationUserInfoTransfers")
    @NUInt
    public native long remainingComplicationUserInfoTransfers();

    @Generated
    @Selector("sendMessage:replyHandler:errorHandler:")
    public native void sendMessageReplyHandlerErrorHandler(NSDictionary<String, ?> message,
            @ObjCBlock(name = "call_sendMessageReplyHandlerErrorHandler_1") Block_sendMessageReplyHandlerErrorHandler_1 replyHandler,
            @ObjCBlock(name = "call_sendMessageReplyHandlerErrorHandler_2") Block_sendMessageReplyHandlerErrorHandler_2 errorHandler);

    @Generated
    @Selector("sendMessageData:replyHandler:errorHandler:")
    public native void sendMessageDataReplyHandlerErrorHandler(NSData data,
            @ObjCBlock(name = "call_sendMessageDataReplyHandlerErrorHandler_1") Block_sendMessageDataReplyHandlerErrorHandler_1 replyHandler,
            @ObjCBlock(name = "call_sendMessageDataReplyHandlerErrorHandler_2") Block_sendMessageDataReplyHandlerErrorHandler_2 errorHandler);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) WCSessionDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) WCSessionDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("transferCurrentComplicationUserInfo:")
    public native WCSessionUserInfoTransfer transferCurrentComplicationUserInfo(NSDictionary<String, ?> userInfo);

    @Generated
    @Selector("transferFile:metadata:")
    public native WCSessionFileTransfer transferFileMetadata(NSURL file, NSDictionary<String, ?> metadata);

    @Generated
    @Selector("transferUserInfo:")
    public native WCSessionUserInfoTransfer transferUserInfo(NSDictionary<String, ?> userInfo);

    @Generated
    @Selector("updateApplicationContext:error:")
    public native boolean updateApplicationContextError(NSDictionary<String, ?> applicationContext,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("watchDirectoryURL")
    public native NSURL watchDirectoryURL();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendMessageReplyHandlerErrorHandler_1 {
        @Generated
        void call_sendMessageReplyHandlerErrorHandler_1(NSDictionary<String, ?> arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendMessageReplyHandlerErrorHandler_2 {
        @Generated
        void call_sendMessageReplyHandlerErrorHandler_2(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendMessageDataReplyHandlerErrorHandler_1 {
        @Generated
        void call_sendMessageDataReplyHandlerErrorHandler_1(NSData arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendMessageDataReplyHandlerErrorHandler_2 {
        @Generated
        void call_sendMessageDataReplyHandlerErrorHandler_2(NSError arg0);
    }
}
