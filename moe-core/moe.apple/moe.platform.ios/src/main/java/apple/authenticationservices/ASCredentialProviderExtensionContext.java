package apple.authenticationservices;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSExtensionContext;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * API-Since: 12.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASCredentialProviderExtensionContext extends NSExtensionContext {
    static {
        NatJ.register();
    }

    @Generated
    protected ASCredentialProviderExtensionContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASCredentialProviderExtensionContext alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ASCredentialProviderExtensionContext allocWithZone(VoidPtr zone);

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
     * Cancels the request.
     * 
     * The extension should call this method when the user cancels the action or a failure occurs.
     * 
     * @param error error's domain should be ASExtensionErrorDomain and the code should be a value of type
     *              ASExtensionErrorCode.
     */
    @Generated
    @Selector("cancelRequestWithError:")
    public native void cancelRequestWithError(@NotNull NSError error);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * Complete the request to configure the extension.
     * 
     * Calling this method will eventually dismiss the associated view controller.
     */
    @Generated
    @Selector("completeExtensionConfigurationRequest")
    public native void completeExtensionConfigurationRequest();

    /**
     * Complete the request by providing the user selected credential.
     * 
     * Calling this method will eventually dismiss the associated view controller.
     * 
     * @param credential        the credential that the user has selected.
     * @param completionHandler optionally contains any work which the extension may need to perform after the request
     *                          has been completed,
     *                          as a background-priority task. The `expired` parameter will be YES if the system decides
     *                          to prematurely terminate a previous
     *                          non-expiration invocation of the completionHandler.
     */
    @Generated
    @Selector("completeRequestWithSelectedCredential:completionHandler:")
    public native void completeRequestWithSelectedCredentialCompletionHandler(@NotNull ASPasswordCredential credential,
            @Nullable @ObjCBlock(name = "call_completeRequestWithSelectedCredentialCompletionHandler") Block_completeRequestWithSelectedCredentialCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_completeRequestWithSelectedCredentialCompletionHandler {
        @Generated
        void call_completeRequestWithSelectedCredentialCompletionHandler(boolean expired);
    }

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
    public native ASCredentialProviderExtensionContext init();

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

    @Generated
    @Owned
    @Selector("new")
    public static native ASCredentialProviderExtensionContext new_objc();

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
     * Complete the assertion request by providing the user selected passkey credential.
     * 
     * Calling this method will eventually dismiss the associated view controller.
     * 
     * API-Since: 17.0
     * 
     * @param credential        the credential that the user has selected. Includes assertion response.
     * @param completionHandler optionally contains any work which the extension may need to perform after the request
     *                          has been completed,
     *                          as a background-priority task. The `expired` parameter will be YES if the system decides
     *                          to prematurely terminate a previous
     *                          non-expiration invocation of the completionHandler.
     */
    @Generated
    @Selector("completeAssertionRequestWithSelectedPasskeyCredential:completionHandler:")
    public native void completeAssertionRequestWithSelectedPasskeyCredentialCompletionHandler(
            @NotNull ASPasskeyAssertionCredential credential,
            @ObjCBlock(name = "call_completeAssertionRequestWithSelectedPasskeyCredentialCompletionHandler") @Nullable Block_completeAssertionRequestWithSelectedPasskeyCredentialCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_completeAssertionRequestWithSelectedPasskeyCredentialCompletionHandler {
        @Generated
        void call_completeAssertionRequestWithSelectedPasskeyCredentialCompletionHandler(boolean expired);
    }

    /**
     * Complete the registration request by providing the newly created passkey credential.
     * 
     * Calling this method will eventually dismiss the associated view controller.
     * 
     * API-Since: 17.0
     * 
     * @param credential        the credential that was created in response to the registration request.
     * @param completionHandler optionally contains any work which the extension may need to perform after the request
     *                          has been completed,
     *                          as a background-priority task. The `expired` parameter will be YES if the system decides
     *                          to prematurely terminate a previous
     *                          non-expiration invocation of the completionHandler.
     */
    @Generated
    @Selector("completeRegistrationRequestWithSelectedPasskeyCredential:completionHandler:")
    public native void completeRegistrationRequestWithSelectedPasskeyCredentialCompletionHandler(
            @NotNull ASPasskeyRegistrationCredential credential,
            @ObjCBlock(name = "call_completeRegistrationRequestWithSelectedPasskeyCredentialCompletionHandler") @Nullable Block_completeRegistrationRequestWithSelectedPasskeyCredentialCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_completeRegistrationRequestWithSelectedPasskeyCredentialCompletionHandler {
        @Generated
        void call_completeRegistrationRequestWithSelectedPasskeyCredentialCompletionHandler(boolean expired);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
