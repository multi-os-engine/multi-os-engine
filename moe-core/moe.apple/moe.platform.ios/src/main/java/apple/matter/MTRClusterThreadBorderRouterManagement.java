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
 * Cluster Thread Border Router Management
 * Manage the Thread network of Thread Border Router
 * 
 * API-Since: 18.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterThreadBorderRouterManagement extends MTRGenericCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterThreadBorderRouterManagement(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterThreadBorderRouterManagement alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterThreadBorderRouterManagement allocWithZone(VoidPtr zone);

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
     * API-Since: 18.4
     */
    @Generated
    @Selector("getActiveDatasetRequestWithExpectedValues:expectedValueInterval:completion:")
    public native void getActiveDatasetRequestWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getActiveDatasetRequestWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_getActiveDatasetRequestWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getActiveDatasetRequestWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_getActiveDatasetRequestWithExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRThreadBorderRouterManagementClusterDatasetResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("getActiveDatasetRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getActiveDatasetRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRThreadBorderRouterManagementClusterGetActiveDatasetRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getActiveDatasetRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_getActiveDatasetRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getActiveDatasetRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_getActiveDatasetRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRThreadBorderRouterManagementClusterDatasetResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("getPendingDatasetRequestWithExpectedValues:expectedValueInterval:completion:")
    public native void getPendingDatasetRequestWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getPendingDatasetRequestWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_getPendingDatasetRequestWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getPendingDatasetRequestWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_getPendingDatasetRequestWithExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRThreadBorderRouterManagementClusterDatasetResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("getPendingDatasetRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getPendingDatasetRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRThreadBorderRouterManagementClusterGetPendingDatasetRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getPendingDatasetRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_getPendingDatasetRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getPendingDatasetRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_getPendingDatasetRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRThreadBorderRouterManagementClusterDatasetResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRClusterThreadBorderRouterManagement init();

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterThreadBorderRouterManagement initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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
    public static native MTRClusterThreadBorderRouterManagement new_objc();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeAcceptedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcceptedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeActiveDatasetTimestampWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeActiveDatasetTimestampWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeAttributeListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAttributeListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeBorderAgentIDWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeBorderAgentIDWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeBorderRouterNameWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeBorderRouterNameWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeClusterRevisionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeClusterRevisionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeFeatureMapWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeFeatureMapWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeGeneratedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeGeneratedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeInterfaceEnabledWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInterfaceEnabledWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributePendingDatasetTimestampWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePendingDatasetTimestampWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeThreadVersionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeThreadVersionWithParams(@Nullable MTRReadParams params);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setActiveDatasetRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setActiveDatasetRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRThreadBorderRouterManagementClusterSetActiveDatasetRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_setActiveDatasetRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_setActiveDatasetRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setActiveDatasetRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_setActiveDatasetRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setPendingDatasetRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setPendingDatasetRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRThreadBorderRouterManagementClusterSetPendingDatasetRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_setPendingDatasetRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_setPendingDatasetRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPendingDatasetRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_setPendingDatasetRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable NSError error);
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