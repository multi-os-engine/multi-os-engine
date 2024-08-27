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
 * Cluster Network Commissioning
 * Functionality to configure, enable, disable network credentials and access on a Matter device.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterNetworkCommissioning extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterNetworkCommissioning(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("addOrUpdateThreadNetworkWithParams:expectedValues:expectedValueInterval:completion:")
    public native void addOrUpdateThreadNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRNetworkCommissioningClusterAddOrUpdateThreadNetworkParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_addOrUpdateThreadNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_addOrUpdateThreadNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addOrUpdateThreadNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_addOrUpdateThreadNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRNetworkCommissioningClusterNetworkConfigResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * addOrUpdateThreadNetworkWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("addOrUpdateThreadNetworkWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void addOrUpdateThreadNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRNetworkCommissioningClusterAddOrUpdateThreadNetworkParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_addOrUpdateThreadNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_addOrUpdateThreadNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addOrUpdateThreadNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_addOrUpdateThreadNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRNetworkCommissioningClusterNetworkConfigResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("addOrUpdateWiFiNetworkWithParams:expectedValues:expectedValueInterval:completion:")
    public native void addOrUpdateWiFiNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRNetworkCommissioningClusterAddOrUpdateWiFiNetworkParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_addOrUpdateWiFiNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_addOrUpdateWiFiNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addOrUpdateWiFiNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_addOrUpdateWiFiNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRNetworkCommissioningClusterNetworkConfigResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use addOrUpdateWiFiNetworkWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("addOrUpdateWiFiNetworkWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void addOrUpdateWiFiNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRNetworkCommissioningClusterAddOrUpdateWiFiNetworkParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_addOrUpdateWiFiNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_addOrUpdateWiFiNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addOrUpdateWiFiNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_addOrUpdateWiFiNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRNetworkCommissioningClusterNetworkConfigResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterNetworkCommissioning alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterNetworkCommissioning allocWithZone(VoidPtr zone);

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

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("connectNetworkWithParams:expectedValues:expectedValueInterval:completion:")
    public native void connectNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRNetworkCommissioningClusterConnectNetworkParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_connectNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_connectNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_connectNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_connectNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRNetworkCommissioningClusterConnectNetworkResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use connectNetworkWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("connectNetworkWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void connectNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRNetworkCommissioningClusterConnectNetworkParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_connectNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_connectNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_connectNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_connectNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRNetworkCommissioningClusterConnectNetworkResponseParams data, @Nullable NSError error);
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
    public native MTRClusterNetworkCommissioning init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpoindID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRClusterNetworkCommissioning initWithDeviceEndpointQueue(@NotNull MTRDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterNetworkCommissioning initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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

    @Generated
    @Owned
    @Selector("new")
    public static native MTRClusterNetworkCommissioning new_objc();

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
    @Selector("readAttributeConnectMaxTimeSecondsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeConnectMaxTimeSecondsWithParams(@Nullable MTRReadParams params);

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

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeInterfaceEnabledWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInterfaceEnabledWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeLastConnectErrorValueWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLastConnectErrorValueWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeLastNetworkIDWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLastNetworkIDWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeLastNetworkingStatusWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLastNetworkingStatusWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMaxNetworksWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMaxNetworksWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeNetworksWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNetworksWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeScanMaxTimeSecondsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeScanMaxTimeSecondsWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("removeNetworkWithParams:expectedValues:expectedValueInterval:completion:")
    public native void removeNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRNetworkCommissioningClusterRemoveNetworkParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_removeNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_removeNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_removeNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRNetworkCommissioningClusterNetworkConfigResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use removeNetworkWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("removeNetworkWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void removeNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRNetworkCommissioningClusterRemoveNetworkParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_removeNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_removeNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_removeNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRNetworkCommissioningClusterNetworkConfigResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("reorderNetworkWithParams:expectedValues:expectedValueInterval:completion:")
    public native void reorderNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRNetworkCommissioningClusterReorderNetworkParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_reorderNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_reorderNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reorderNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_reorderNetworkWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRNetworkCommissioningClusterNetworkConfigResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use reorderNetworkWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("reorderNetworkWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void reorderNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRNetworkCommissioningClusterReorderNetworkParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_reorderNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_reorderNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reorderNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_reorderNetworkWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRNetworkCommissioningClusterNetworkConfigResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("scanNetworksWithParams:expectedValues:expectedValueInterval:completion:")
    public native void scanNetworksWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRNetworkCommissioningClusterScanNetworksParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_scanNetworksWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_scanNetworksWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scanNetworksWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_scanNetworksWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRNetworkCommissioningClusterScanNetworksResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use scanNetworksWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("scanNetworksWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void scanNetworksWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRNetworkCommissioningClusterScanNetworksParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_scanNetworksWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_scanNetworksWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scanNetworksWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_scanNetworksWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRNetworkCommissioningClusterScanNetworksResponseParams data, @Nullable NSError error);
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

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeInterfaceEnabledWithValue:expectedValueInterval:")
    public native void writeAttributeInterfaceEnabledWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeInterfaceEnabledWithValue:expectedValueInterval:params:")
    public native void writeAttributeInterfaceEnabledWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);
}