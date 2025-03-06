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
 * Cluster Valve Configuration and Control
 * This cluster is used to configure a valve.
 * 
 * API-Since: 17.6
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterValveConfigurationAndControl extends MTRGenericCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterValveConfigurationAndControl(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterValveConfigurationAndControl alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterValveConfigurationAndControl allocWithZone(VoidPtr zone);

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
     * API-Since: 17.6
     */
    @Generated
    @Selector("closeWithExpectedValues:expectedValueInterval:completion:")
    public native void closeWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_closeWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_closeWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_closeWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_closeWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("closeWithParams:expectedValues:expectedValueInterval:completion:")
    public native void closeWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRValveConfigurationAndControlClusterCloseParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_closeWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_closeWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_closeWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_closeWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
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
    public native MTRClusterValveConfigurationAndControl init();

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterValveConfigurationAndControl initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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
    public static native MTRClusterValveConfigurationAndControl new_objc();

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("openWithExpectedValues:expectedValueInterval:completion:")
    public native void openWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_openWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_openWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_openWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_openWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("openWithParams:expectedValues:expectedValueInterval:completion:")
    public native void openWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRValveConfigurationAndControlClusterOpenParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_openWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_openWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_openWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_openWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeAcceptedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcceptedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeAttributeListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAttributeListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeAutoCloseTimeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAutoCloseTimeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeClusterRevisionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeClusterRevisionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeCurrentLevelWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentLevelWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeCurrentStateWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentStateWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeDefaultOpenDurationWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDefaultOpenDurationWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeDefaultOpenLevelWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDefaultOpenLevelWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeFeatureMapWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeFeatureMapWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeGeneratedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeGeneratedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeLevelStepWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLevelStepWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeOpenDurationWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOpenDurationWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeRemainingDurationWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRemainingDurationWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeTargetLevelWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTargetLevelWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeTargetStateWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTargetStateWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeValveFaultWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeValveFaultWithParams(@Nullable MTRReadParams params);

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

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("writeAttributeDefaultOpenDurationWithValue:expectedValueInterval:")
    public native void writeAttributeDefaultOpenDurationWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("writeAttributeDefaultOpenDurationWithValue:expectedValueInterval:params:")
    public native void writeAttributeDefaultOpenDurationWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("writeAttributeDefaultOpenLevelWithValue:expectedValueInterval:")
    public native void writeAttributeDefaultOpenLevelWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("writeAttributeDefaultOpenLevelWithValue:expectedValueInterval:params:")
    public native void writeAttributeDefaultOpenLevelWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);
}