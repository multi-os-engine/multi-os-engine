package apple.exposurenotification;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSProgress;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
 * ===========================================================================================================================
 * <p>
 * Manages Exposure Notification functionality.
 */
@Generated
@Library("ExposureNotification")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ENManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ENManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Activates the object to prepare it for use. Properties may not be usable until the completion handler reports success.
     */
    @Generated
    @Selector("activateWithCompletionHandler:")
    public native void activateWithCompletionHandler(
            @ObjCBlock(name = "call_activateWithCompletionHandler") Block_activateWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_activateWithCompletionHandler {
        @Generated
        void call_activateWithCompletionHandler(NSError arg0);
    }

    /**
     * Invoked when the app is launched for an activity while it might not be running.
     * When the app is launched, it should create an ENManager instance, set this handler, and then activate the manager.
     */
    @Generated
    @Selector("activityHandler")
    @ObjCBlock(name = "call_activityHandler_ret")
    public native Block_activityHandler_ret activityHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_activityHandler_ret {
        @Generated
        void call_activityHandler_ret(int arg0);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native ENManager alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * Reports the current authorization status of the app.
     * Apps can use this property to preflight authorization in order to determine if the user will be prompted.
     */
    @Generated
    @Selector("authorizationStatus")
    @NInt
    public static native long authorizationStatus();

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

    /**
     * Detects exposures using the specified configuration to control the scoring algorithm.
     * This uses the diagnosis keys already known to the system.
     * Only available to apps with ENAPIVersion 2 or higher.
     */
    @Generated
    @Selector("detectExposuresWithConfiguration:completionHandler:")
    public native NSProgress detectExposuresWithConfigurationCompletionHandler(ENExposureConfiguration configuration,
            @ObjCBlock(name = "call_detectExposuresWithConfigurationCompletionHandler") Block_detectExposuresWithConfigurationCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_detectExposuresWithConfigurationCompletionHandler {
        @Generated
        void call_detectExposuresWithConfigurationCompletionHandler(ENExposureDetectionSummary arg0, NSError arg1);
    }

    /**
     * Detects exposures using the specified configuration to control the scoring algorithm and URLs to specify the
     * files containing diagnosis keys the app has downloaded. The diagnosis key files must be signed appropriately.
     * When the app's ENAPIVersion is 2 or higher, keys already known to the system are included in the analysis.
     */
    @Generated
    @Selector("detectExposuresWithConfiguration:diagnosisKeyURLs:completionHandler:")
    public native NSProgress detectExposuresWithConfigurationDiagnosisKeyURLsCompletionHandler(
            ENExposureConfiguration configuration, NSArray<? extends NSURL> diagnosisKeyURLs,
            @ObjCBlock(name = "call_detectExposuresWithConfigurationDiagnosisKeyURLsCompletionHandler") Block_detectExposuresWithConfigurationDiagnosisKeyURLsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_detectExposuresWithConfigurationDiagnosisKeyURLsCompletionHandler {
        @Generated
        void call_detectExposuresWithConfigurationDiagnosisKeyURLsCompletionHandler(ENExposureDetectionSummary arg0,
                NSError arg1);
    }

    /**
     * Invoked after requestPreAuthorizedDiagnosisKeys if user authorization is still valid.
     */
    @Generated
    @Selector("diagnosisKeysAvailableHandler")
    @ObjCBlock(name = "call_diagnosisKeysAvailableHandler_ret")
    public native Block_diagnosisKeysAvailableHandler_ret diagnosisKeysAvailableHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_diagnosisKeysAvailableHandler_ret {
        @Generated
        void call_diagnosisKeysAvailableHandler_ret(NSArray<? extends ENTemporaryExposureKey> arg0);
    }

    @Generated
    @Selector("dispatchQueue")
    public native NSObject dispatchQueue();

    /**
     * Indicates if Exposure Notification is enabled on the system. KVO may be used to monitor for changes.
     * This will be NO until activateWithCompletionHandler has completed successfully.
     * Note that even if it's enabled, it may be inactive for other reasons, such as Bluetooth being turned off.
     * The exposureNotificationStatus property can be monitored for the overall status of Exposure Notification.
     */
    @Generated
    @Selector("exposureNotificationEnabled")
    public native boolean exposureNotificationEnabled();

    /**
     * Overall status of Exposure Notification. KVO may be used to monitor for changes.
     */
    @Generated
    @Selector("exposureNotificationStatus")
    @NInt
    public native long exposureNotificationStatus();

    /**
     * Requests the temporary exposure keys used by this device to share with a server.
     * Each use of this API will present the user with system UI to authorize it.
     */
    @Generated
    @Selector("getDiagnosisKeysWithCompletionHandler:")
    public native void getDiagnosisKeysWithCompletionHandler(
            @ObjCBlock(name = "call_getDiagnosisKeysWithCompletionHandler") Block_getDiagnosisKeysWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getDiagnosisKeysWithCompletionHandler {
        @Generated
        void call_getDiagnosisKeysWithCompletionHandler(NSArray<? extends ENTemporaryExposureKey> arg0, NSError arg1);
    }

    /**
     * Gets info about each exposure from the summary provided when exposure detection completes.
     * Using this API will inform the user that their exposure details have been revealed to the app.
     * The user explanation string will be displayed as part of the UI to inform the user of using this API.
     */
    @Generated
    @Selector("getExposureInfoFromSummary:userExplanation:completionHandler:")
    public native NSProgress getExposureInfoFromSummaryUserExplanationCompletionHandler(
            ENExposureDetectionSummary summary, String userExplanation,
            @ObjCBlock(name = "call_getExposureInfoFromSummaryUserExplanationCompletionHandler") Block_getExposureInfoFromSummaryUserExplanationCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getExposureInfoFromSummaryUserExplanationCompletionHandler {
        @Generated
        void call_getExposureInfoFromSummaryUserExplanationCompletionHandler(NSArray<? extends ENExposureInfo> arg0,
                NSError arg1);
    }

    /**
     * Gets info about each exposure window from the summary provided when exposure detection completes.
     */
    @Generated
    @Selector("getExposureWindowsFromSummary:completionHandler:")
    public native NSProgress getExposureWindowsFromSummaryCompletionHandler(ENExposureDetectionSummary summary,
            @ObjCBlock(name = "call_getExposureWindowsFromSummaryCompletionHandler") Block_getExposureWindowsFromSummaryCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getExposureWindowsFromSummaryCompletionHandler {
        @Generated
        void call_getExposureWindowsFromSummaryCompletionHandler(NSArray<? extends ENExposureWindow> arg0,
                NSError arg1);
    }

    /**
     * Requests the temporary exposure keys, including the current key, used by this device for testing.
     * Each use of this API will present the user with system UI to authorize it.
     * WARNING: This API is only for use by developers. It requires a special entitlement that is not allowed in the app store.
     * It's only intended to allow developers to test without needing to wait 24 hours for a key to be released.
     */
    @Generated
    @Selector("getTestDiagnosisKeysWithCompletionHandler:")
    public native void getTestDiagnosisKeysWithCompletionHandler(
            @ObjCBlock(name = "call_getTestDiagnosisKeysWithCompletionHandler") Block_getTestDiagnosisKeysWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getTestDiagnosisKeysWithCompletionHandler {
        @Generated
        void call_getTestDiagnosisKeysWithCompletionHandler(NSArray<? extends ENTemporaryExposureKey> arg0,
                NSError arg1);
    }

    /**
     * Reports if the user traveled within an exposure period (e.g. 14 days).
     */
    @Generated
    @Selector("getUserTraveledWithCompletionHandler:")
    public native void getUserTraveledWithCompletionHandler(
            @ObjCBlock(name = "call_getUserTraveledWithCompletionHandler") Block_getUserTraveledWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getUserTraveledWithCompletionHandler {
        @Generated
        void call_getUserTraveledWithCompletionHandler(boolean arg0, NSError arg1);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ENManager init();

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

    /**
     * Stops any outstanding operations and invalidates this object. Once this is called, the object can no longer be used.
     * To start using ENManager again, a new instance of the class must be created and activated.
     */
    @Generated
    @Selector("invalidate")
    public native void invalidate();

    /**
     * Invoked exactly once when invalidation completes. This property is cleared before it's invoked to break retain cycles.
     */
    @Generated
    @Selector("invalidationHandler")
    @ObjCBlock(name = "call_invalidationHandler_ret")
    public native Block_invalidationHandler_ret invalidationHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_invalidationHandler_ret {
        @Generated
        void call_invalidationHandler_ret();
    }

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * Authorizes a one-time, future release of diagnosis keys without a user prompt at the time of release.
     * This allows the user to authorize ahead of time in case they are unable to approve at the time of positive diagnosis.
     * WARNING: Application should be in foreground to request the authorization
     */
    @Generated
    @Selector("preAuthorizeDiagnosisKeysWithCompletionHandler:")
    public native void preAuthorizeDiagnosisKeysWithCompletionHandler(
            @ObjCBlock(name = "call_preAuthorizeDiagnosisKeysWithCompletionHandler") Block_preAuthorizeDiagnosisKeysWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_preAuthorizeDiagnosisKeysWithCompletionHandler {
        @Generated
        void call_preAuthorizeDiagnosisKeysWithCompletionHandler(NSError arg0);
    }

    /**
     * Requests diagnosis keys after previously using preAuthorizeDiagnosisKeys successfully.
     * This will display a notification to the user for the user to know the keys will be returned.
     * Keys are returned by invoking diagnosisKeysAvailable, which must be set before calling this.
     */
    @Generated
    @Selector("requestPreAuthorizedDiagnosisKeysWithCompletionHandler:")
    public native void requestPreAuthorizedDiagnosisKeysWithCompletionHandler(
            @ObjCBlock(name = "call_requestPreAuthorizedDiagnosisKeysWithCompletionHandler") Block_requestPreAuthorizedDiagnosisKeysWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestPreAuthorizedDiagnosisKeysWithCompletionHandler {
        @Generated
        void call_requestPreAuthorizedDiagnosisKeysWithCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Invoked when the app is launched for an activity while it might not be running.
     * When the app is launched, it should create an ENManager instance, set this handler, and then activate the manager.
     */
    @Generated
    @Selector("setActivityHandler:")
    public native void setActivityHandler(@ObjCBlock(name = "call_setActivityHandler") Block_setActivityHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setActivityHandler {
        @Generated
        void call_setActivityHandler(int arg0);
    }

    /**
     * Invoked after requestPreAuthorizedDiagnosisKeys if user authorization is still valid.
     */
    @Generated
    @Selector("setDiagnosisKeysAvailableHandler:")
    public native void setDiagnosisKeysAvailableHandler(
            @ObjCBlock(name = "call_setDiagnosisKeysAvailableHandler") Block_setDiagnosisKeysAvailableHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setDiagnosisKeysAvailableHandler {
        @Generated
        void call_setDiagnosisKeysAvailableHandler(NSArray<? extends ENTemporaryExposureKey> arg0);
    }

    @Generated
    @Selector("setDispatchQueue:")
    public native void setDispatchQueue(NSObject value);

    /**
     * Enables or disables Exposure Notification.
     * If not previously authorized, this shows a user dialog for consent to enable Exposure Notification.
     * Note: Disabling stops Bluetooth advertising and scanning related to Exposure Notification, but the
     * Diagnosis Keys and data will remain.
     */
    @Generated
    @Selector("setExposureNotificationEnabled:completionHandler:")
    public native void setExposureNotificationEnabledCompletionHandler(boolean enabled,
            @ObjCBlock(name = "call_setExposureNotificationEnabledCompletionHandler") Block_setExposureNotificationEnabledCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setExposureNotificationEnabledCompletionHandler {
        @Generated
        void call_setExposureNotificationEnabledCompletionHandler(NSError arg0);
    }

    /**
     * Invoked exactly once when invalidation completes. This property is cleared before it's invoked to break retain cycles.
     */
    @Generated
    @Selector("setInvalidationHandler:")
    public native void setInvalidationHandler(
            @ObjCBlock(name = "call_setInvalidationHandler") Block_setInvalidationHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setInvalidationHandler {
        @Generated
        void call_setInvalidationHandler();
    }

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
}
