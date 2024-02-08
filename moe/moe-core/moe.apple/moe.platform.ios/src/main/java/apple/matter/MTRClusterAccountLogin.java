package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.opaque.dispatch_queue_t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * Cluster Account Login
 * This cluster provides commands that facilitate user account login on a Content App or a node. For example, a Content
 * App running on a Video Player device, which is represented as an endpoint (see [TV Architecture]), can use this
 * cluster to help make the user account on the Content App match the user account on the Client.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterAccountLogin extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterAccountLogin(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterAccountLogin alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterAccountLogin allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("getSetupPINWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getSetupPINWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRAccountLoginClusterGetSetupPINParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getSetupPINWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_getSetupPINWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getSetupPINWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_getSetupPINWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRAccountLoginClusterGetSetupPINResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use getSetupPINWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("getSetupPINWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void getSetupPINWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRAccountLoginClusterGetSetupPINParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getSetupPINWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_getSetupPINWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getSetupPINWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_getSetupPINWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRAccountLoginClusterGetSetupPINResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRClusterAccountLogin init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpoindID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRClusterAccountLogin initWithDeviceEndpointQueue(@NotNull MTRDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterAccountLogin initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
            @NotNull NSNumber endpointID, @NotNull dispatch_queue_t queue);

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

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("loginWithParams:expectedValues:expectedValueInterval:completion:")
    public native void loginWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRAccountLoginClusterLoginParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_loginWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_loginWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loginWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_loginWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use loginWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("loginWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void loginWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRAccountLoginClusterLoginParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_loginWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_loginWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loginWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_loginWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("logoutWithExpectedValues:expectedValueInterval:completion:")
    public native void logoutWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_logoutWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_logoutWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_logoutWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_logoutWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use logoutWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("logoutWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void logoutWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_logoutWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_logoutWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_logoutWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_logoutWithExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("logoutWithParams:expectedValues:expectedValueInterval:completion:")
    public native void logoutWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRAccountLoginClusterLogoutParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_logoutWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_logoutWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_logoutWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_logoutWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use logoutWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("logoutWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void logoutWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRAccountLoginClusterLogoutParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_logoutWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_logoutWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_logoutWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_logoutWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native MTRClusterAccountLogin new_objc();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcceptedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcceptedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAttributeListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAttributeListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeClusterRevisionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeClusterRevisionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeFeatureMapWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeFeatureMapWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeGeneratedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeGeneratedCommandListWithParams(@Nullable MTRReadParams params);

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}