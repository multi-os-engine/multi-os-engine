package apple.safetykit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.safetykit.protocol.SAEmergencyResponseDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * * SAEmergencyResponseManager
 * 
 * *
 * * @discussion
 * * Use SAEmergencyResponseManager to request actions in response to an emergency event.
 * * Set the delegate to monitor the progress of requested emergency response actions.
 * * SAEmergencyResponseManager requires user authorization for at least one of the emergency event detections e.g.
 * SACrashDetectionEvent
 * *
 * * SAEmergencyResponseManager requires an entitlement from Apple to at least one of the emergency event detections. To
 * apply for the entitlement, see respective detection mechanisms
 * 
 * API-Since: 16.0
 */
@Generated
@Library("SafetyKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SAEmergencyResponseManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SAEmergencyResponseManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SAEmergencyResponseManager alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native SAEmergencyResponseManager allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * delegate
     * 
     * The delegate object to receive updates about requested emergency response action.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native SAEmergencyResponseDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Requests the system to dial a voice call on behalf of the user.
     * Apps running in the background / foreground can request to dial a voice call without user confirmation. Emergency
     * numbers are not allowed.
     * Requests are accepted only if user has authorized the app to receive and handle emergency detection events and
     * only for a limited time after an emergency event is detected.
     * 
     * [@sa] SAEmergencyResponseDelegate
     * 
     * @param phoneNumber
     *                    Apps can request the system to dial a voice call by providing a phone number. Emergency
     *                    numbers are not allowed.
     * 
     * @param handler
     *                    Completion handler invoked with the status of the voice call request.
     *                    If requested is accepted, the handler is invoked with a nil error. Interpret the error
     *                    returned using SAErrorDomain.
     *                    Requests will fail with SAErrorNotAuthorized if user has not authorized the app to receive and
     *                    handle any emergency events.
     *                    Requests will fail with SAErrorNotAvailable if invoked outside of the limited time window
     *                    after an emergency event is detected.
     *                    Use the SAEmergencyResponseDelegate to monitor the progress of the voice call.
     */
    @Generated
    @Selector("dialVoiceCallToPhoneNumber:completionHandler:")
    public native void dialVoiceCallToPhoneNumberCompletionHandler(@NotNull String phoneNumber,
            @ObjCBlock(name = "call_dialVoiceCallToPhoneNumberCompletionHandler") @NotNull Block_dialVoiceCallToPhoneNumberCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_dialVoiceCallToPhoneNumberCompletionHandler {
        @Generated
        void call_dialVoiceCallToPhoneNumberCompletionHandler(boolean requestAccepted, @Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SAEmergencyResponseManager init();

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native SAEmergencyResponseManager new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * delegate
     * 
     * The delegate object to receive updates about requested emergency response action.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) @Nullable SAEmergencyResponseDelegate value);

    /**
     * delegate
     * 
     * The delegate object to receive updates about requested emergency response action.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) @Nullable SAEmergencyResponseDelegate value) {
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
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}