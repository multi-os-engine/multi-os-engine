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

package apple.callkit;

import apple.NSObject;
import apple.callkit.protocol.CXProviderDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CallKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CXProvider extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CXProvider(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CXProvider alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CXProvider allocWithZone(VoidPtr zone);

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
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CXProvider new_objc();

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
     * The receiver's current configuration.
     */
    @Generated
    @Selector("configuration")
    public native CXProviderConfiguration configuration();

    @Generated
    @Selector("init")
    public native CXProvider init();

    /**
     * Initialize a new provider instance with the supplied configuration
     */
    @Generated
    @Selector("initWithConfiguration:")
    public native CXProvider initWithConfiguration(CXProviderConfiguration configuration);

    /**
     * Invalidate the receiver. All existing calls will be marked as ended in failure. The provider must be invalidated before it is deallocated.
     */
    @Generated
    @Selector("invalidate")
    public native void invalidate();

    /**
     * Returns subset of call actions contained in any transaction in -pendingTransactions of the specified class and with the specified call UUID.
     */
    @Generated
    @Selector("pendingCallActionsOfClass:withCallUUID:")
    public native NSArray<? extends CXCallAction> pendingCallActionsOfClassWithCallUUID(Class callActionClass,
            NSUUID callUUID);

    /**
     * List of all transactions that are incomplete.
     */
    @Generated
    @Selector("pendingTransactions")
    public native NSArray<? extends CXTransaction> pendingTransactions();

    /**
     * Report that a call ended. A nil value for `dateEnded` results in the ended date being set to now.
     */
    @Generated
    @Selector("reportCallWithUUID:endedAtDate:reason:")
    public native void reportCallWithUUIDEndedAtDateReason(NSUUID UUID, NSDate dateEnded, @NInt long endedReason);

    /**
     * Report an update to call information.
     */
    @Generated
    @Selector("reportCallWithUUID:updated:")
    public native void reportCallWithUUIDUpdated(NSUUID UUID, CXCallUpdate update);

    /**
     * Report a new incoming call to the system.
     * <p>
     * If completion is invoked with a non-nil `error`, the incoming call has been disallowed by the system and will not be displayed, so the provider should not proceed with the call.
     * <p>
     * Completion block will be called on delegate queue, if specified, otherwise on a private serial queue.
     */
    @Generated
    @Selector("reportNewIncomingCallWithUUID:update:completion:")
    public native void reportNewIncomingCallWithUUIDUpdateCompletion(NSUUID UUID, CXCallUpdate update,
            @ObjCBlock(name = "call_reportNewIncomingCallWithUUIDUpdateCompletion") Block_reportNewIncomingCallWithUUIDUpdateCompletion completion);

    /**
     * Report that an outgoing call connected. A nil value for `dateConnected` results in the connected date being set to now.
     */
    @Generated
    @Selector("reportOutgoingCallWithUUID:connectedAtDate:")
    public native void reportOutgoingCallWithUUIDConnectedAtDate(NSUUID UUID, NSDate dateConnected);

    /**
     * Report that an outgoing call started connecting. A nil value for `dateStartedConnecting` results in the started connecting date being set to now.
     */
    @Generated
    @Selector("reportOutgoingCallWithUUID:startedConnectingAtDate:")
    public native void reportOutgoingCallWithUUIDStartedConnectingAtDate(NSUUID UUID, NSDate dateStartedConnecting);

    /**
     * The receiver's current configuration.
     */
    @Generated
    @Selector("setConfiguration:")
    public native void setConfiguration(CXProviderConfiguration value);

    /**
     * Set delegate and optional queue for delegate callbacks to be performed on.
     * A nil queue implies that delegate callbacks should happen on the main queue. The delegate is stored weakly
     */
    @Generated
    @Selector("setDelegate:queue:")
    public native void setDelegateQueue(@Mapped(ObjCObjectMapper.class) CXProviderDelegate delegate, NSObject queue);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportNewIncomingCallWithUUIDUpdateCompletion {
        @Generated
        void call_reportNewIncomingCallWithUUIDUpdateCompletion(NSError error);
    }

    /**
     * From within a Notification Service Extension, request the containing application be launched to handle an incoming VoIP call. The application's PKPushRegistryDelegate must handle the push upon launch.
     */
    @Generated
    @Selector("reportNewIncomingVoIPPushPayload:completion:")
    public static native void reportNewIncomingVoIPPushPayloadCompletion(NSDictionary<?, ?> dictionaryPayload,
            @ObjCBlock(name = "call_reportNewIncomingVoIPPushPayloadCompletion") Block_reportNewIncomingVoIPPushPayloadCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportNewIncomingVoIPPushPayloadCompletion {
        @Generated
        void call_reportNewIncomingVoIPPushPayloadCompletion(NSError arg0);
    }
}
