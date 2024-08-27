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
 * Cluster Application Launcher
 * This cluster provides an interface for launching content on a media player device such as a TV or Speaker.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterApplicationLauncher extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterApplicationLauncher(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterApplicationLauncher alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterApplicationLauncher allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("hideAppWithParams:expectedValues:expectedValueInterval:completion:")
    public native void hideAppWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRApplicationLauncherClusterHideAppParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_hideAppWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_hideAppWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_hideAppWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_hideAppWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRApplicationLauncherClusterLauncherResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use hideAppWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("hideAppWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void hideAppWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRApplicationLauncherClusterHideAppParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_hideAppWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_hideAppWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_hideAppWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_hideAppWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRApplicationLauncherClusterLauncherResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Selector("init")
    public native MTRClusterApplicationLauncher init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpoindID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRClusterApplicationLauncher initWithDeviceEndpointQueue(@NotNull MTRDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterApplicationLauncher initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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
    @Selector("launchAppWithParams:expectedValues:expectedValueInterval:completion:")
    public native void launchAppWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRApplicationLauncherClusterLaunchAppParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_launchAppWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_launchAppWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_launchAppWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_launchAppWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRApplicationLauncherClusterLauncherResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use launchAppWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("launchAppWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void launchAppWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRApplicationLauncherClusterLaunchAppParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_launchAppWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_launchAppWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_launchAppWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_launchAppWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRApplicationLauncherClusterLauncherResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native MTRClusterApplicationLauncher new_objc();

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
    @Selector("readAttributeCatalogListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCatalogListWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeCurrentAppWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentAppWithParams(@Nullable MTRReadParams params);

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

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("stopAppWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stopAppWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRApplicationLauncherClusterStopAppParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stopAppWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_stopAppWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopAppWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_stopAppWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRApplicationLauncherClusterLauncherResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use stopAppWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("stopAppWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void stopAppWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRApplicationLauncherClusterStopAppParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stopAppWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_stopAppWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopAppWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_stopAppWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRApplicationLauncherClusterLauncherResponseParams data, @Nullable NSError error);
    }

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

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeCurrentAppWithValue:expectedValueInterval:")
    public native void writeAttributeCurrentAppWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeCurrentAppWithValue:expectedValueInterval:params:")
    public native void writeAttributeCurrentAppWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);
}