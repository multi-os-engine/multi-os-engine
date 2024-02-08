package apple.pushtotalk;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
import apple.pushtotalk.protocol.PTChannelManagerDelegate;
import apple.pushtotalk.protocol.PTChannelRestorationDelegate;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 16.0
 */
@Generated
@Library("PushToTalk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PTChannelManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PTChannelManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Only one channel can be active at a time -- this is the channel that will handle user events
     * This being nonnull reflects whether the user can see this channel is active in the user interface
     * The ephemeral push token is only usable when this is nonnull.
     */
    @Nullable
    @Generated
    @Selector("activeChannelUUID")
    public native NSUUID activeChannelUUID();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PTChannelManager alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native PTChannelManager allocWithZone(VoidPtr zone);

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

    /**
     * You must instantiate a channel manager upon launching your app, otherwise the system will tear down channels and
     * their ability to receive pushes. By providing a restoration delegate, you can decide whether to rejoin or leave
     * any previously active channels that the system knows about. Once the channel restoration process is completed,
     * you will be given the PTChannelManager instance.
     */
    @Generated
    @Selector("channelManagerWithDelegate:restorationDelegate:completionHandler:")
    public static native void channelManagerWithDelegateRestorationDelegateCompletionHandler(
            @NotNull @Mapped(ObjCObjectMapper.class) PTChannelManagerDelegate delegate,
            @NotNull @Mapped(ObjCObjectMapper.class) PTChannelRestorationDelegate restorationDelegate,
            @NotNull @ObjCBlock(name = "call_channelManagerWithDelegateRestorationDelegateCompletionHandler") Block_channelManagerWithDelegateRestorationDelegateCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_channelManagerWithDelegateRestorationDelegateCompletionHandler {
        @Generated
        void call_channelManagerWithDelegateRestorationDelegateCompletionHandler(@Nullable PTChannelManager manager,
                @Nullable NSError error);
    }

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
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PTChannelManager init();

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * If successful, you will receive the delegate callback channelManager:channelUUID:didLeaveChannelWithUUID:reason:
     * with reason PTChannelLeaveReasonProgrammaticRequest, Otherwise, the delegate callback
     * channelManager:failedToLeaveChannelWithUUID:error: will be invoked if implemented. Generally, this should always
     * succeed so long as you are already joined to a channel.
     */
    @Generated
    @Selector("leaveChannelWithUUID:")
    public native void leaveChannelWithUUID(@NotNull NSUUID channelUUID);

    @Generated
    @Owned
    @Selector("new")
    public static native PTChannelManager new_objc();

    /**
     * If successful, you will receive the delegate callback channelManager:channelUUID:didBeginTransmittingFromSource:
     * with PTChannelTransmitRequestSourceProgrammaticRequest. Otherwise, the delegate callback
     * channelManager:failedToBeginTransmittingInChannelWithUUID:error: will be invoked if implemented.
     */
    @Generated
    @Selector("requestBeginTransmittingWithChannelUUID:")
    public native void requestBeginTransmittingWithChannelUUID(@NotNull NSUUID channelUUID);

    /**
     * You may only join a channel in the foreground. If successful, you will receive the delegate callback
     * channelManager:didJoinChannelWithUUID:reason: with reason PTChannelJoinReasonProgrammaticRequest. Otherwise, the
     * delegate callback channelManager:failedToJoinChannelWithUUID:error: will be invoked if implemented.
     */
    @Generated
    @Selector("requestJoinChannelWithUUID:descriptor:")
    public native void requestJoinChannelWithUUIDDescriptor(@NotNull NSUUID channelUUID,
            @NotNull PTChannelDescriptor descriptor);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * When receiving incoming audio from a remote participant, set the participant to a nonnull value, which will
     * update the system user interface and block transmitting. When the user has stopped speaking, set the participant
     * to nil.
     */
    @Generated
    @Selector("setActiveRemoteParticipant:forChannelUUID:completionHandler:")
    public native void setActiveRemoteParticipantForChannelUUIDCompletionHandler(@Nullable PTParticipant participant,
            @NotNull NSUUID channelUUID,
            @Nullable @ObjCBlock(name = "call_setActiveRemoteParticipantForChannelUUIDCompletionHandler") Block_setActiveRemoteParticipantForChannelUUIDCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setActiveRemoteParticipantForChannelUUIDCompletionHandler {
        @Generated
        void call_setActiveRemoteParticipantForChannelUUIDCompletionHandler(@Nullable NSError error);
    }

    /**
     * Updates the channel descriptor
     */
    @Generated
    @Selector("setChannelDescriptor:forChannelUUID:completionHandler:")
    public native void setChannelDescriptorForChannelUUIDCompletionHandler(
            @NotNull PTChannelDescriptor channelDescriptor, @NotNull NSUUID channelUUID,
            @Nullable @ObjCBlock(name = "call_setChannelDescriptorForChannelUUIDCompletionHandler") Block_setChannelDescriptorForChannelUUIDCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setChannelDescriptorForChannelUUIDCompletionHandler {
        @Generated
        void call_setChannelDescriptorForChannelUUIDCompletionHandler(@Nullable NSError error);
    }

    /**
     * The default value for service status is PTServiceStatusReady. If your underlying network connection is
     * experiencing issues, set the appropriate service status. The service status will be reflected in the system user
     * interface.
     */
    @Generated
    @Selector("setServiceStatus:forChannelUUID:completionHandler:")
    public native void setServiceStatusForChannelUUIDCompletionHandler(@NInt long status, @NotNull NSUUID channelUUID,
            @Nullable @ObjCBlock(name = "call_setServiceStatusForChannelUUIDCompletionHandler") Block_setServiceStatusForChannelUUIDCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setServiceStatusForChannelUUIDCompletionHandler {
        @Generated
        void call_setServiceStatusForChannelUUIDCompletionHandler(@Nullable NSError arg0);
    }

    /**
     * The default value for transmission mode is PTTransmissionModeHalfDuplex. If your application support one of the
     * other transmission modes set it using this function. The system user interface will be updated to reflect the
     * transmission mode.
     */
    @Generated
    @Selector("setTransmissionMode:forChannelUUID:completionHandler:")
    public native void setTransmissionModeForChannelUUIDCompletionHandler(@NInt long transmissionMode,
            @NotNull NSUUID channelUUID,
            @Nullable @ObjCBlock(name = "call_setTransmissionModeForChannelUUIDCompletionHandler") Block_setTransmissionModeForChannelUUIDCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setTransmissionModeForChannelUUIDCompletionHandler {
        @Generated
        void call_setTransmissionModeForChannelUUIDCompletionHandler(@Nullable NSError arg0);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * If successful, you will receive the delegate callback channelManager:channelUUID:didEndTransmittingFromSource
     * with request source PTChannelTransmitRequestSourceProgrammaticRequest. Otherwise, the delegate callback
     * channelManager:failedToStopTransmittingInChannelWithUUID:error: will be invoked if implemented. Generally, this
     * should always succeed, unless you are not currently transmitting or are not joined to a channel.
     */
    @Generated
    @Selector("stopTransmittingWithChannelUUID:")
    public native void stopTransmittingWithChannelUUID(@NotNull NSUUID channelUUID);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The default channel behavior is to map supported accessory button events to begin/end transmission actions. If
     * your application does not wish to map these button events to transmission actions you can disable them by setting
     * the enabled value to false.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setAccessoryButtonEventsEnabled:forChannelUUID:completionHandler:")
    public native void setAccessoryButtonEventsEnabledForChannelUUIDCompletionHandler(boolean enabled,
            @NotNull NSUUID channelUUID,
            @ObjCBlock(name = "call_setAccessoryButtonEventsEnabledForChannelUUIDCompletionHandler") @Nullable Block_setAccessoryButtonEventsEnabledForChannelUUIDCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setAccessoryButtonEventsEnabledForChannelUUIDCompletionHandler {
        @Generated
        void call_setAccessoryButtonEventsEnabledForChannelUUIDCompletionHandler(@Nullable NSError arg0);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}