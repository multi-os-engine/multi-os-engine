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
 * Cluster Operational State
 * This cluster supports remotely monitoring and, where supported, changing the operational state of any device where a
 * state machine is a part of the operation.
 * 
 * API-Since: 17.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterOperationalState extends MTRGenericCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterOperationalState(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterOperationalState alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterOperationalState allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("init")
    public native MTRClusterOperationalState init();

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterOperationalState initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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
    public static native MTRClusterOperationalState new_objc();

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("pauseWithExpectedValues:expectedValueInterval:completion:")
    public native void pauseWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_pauseWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_pauseWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pauseWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_pauseWithExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTROperationalStateClusterOperationalCommandResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("pauseWithParams:expectedValues:expectedValueInterval:completion:")
    public native void pauseWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTROperationalStateClusterPauseParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_pauseWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_pauseWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pauseWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_pauseWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTROperationalStateClusterOperationalCommandResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("readAttributeAcceptedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcceptedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("readAttributeAttributeListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAttributeListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("readAttributeClusterRevisionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeClusterRevisionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("readAttributeCountdownTimeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCountdownTimeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("readAttributeCurrentPhaseWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentPhaseWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("readAttributeFeatureMapWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeFeatureMapWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("readAttributeGeneratedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeGeneratedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("readAttributeOperationalErrorWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOperationalErrorWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("readAttributeOperationalStateListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOperationalStateListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("readAttributeOperationalStateWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOperationalStateWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("readAttributePhaseListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePhaseListWithParams(@Nullable MTRReadParams params);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("resumeWithExpectedValues:expectedValueInterval:completion:")
    public native void resumeWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_resumeWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_resumeWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resumeWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_resumeWithExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTROperationalStateClusterOperationalCommandResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("resumeWithParams:expectedValues:expectedValueInterval:completion:")
    public native void resumeWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTROperationalStateClusterResumeParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_resumeWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_resumeWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resumeWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_resumeWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTROperationalStateClusterOperationalCommandResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("startWithExpectedValues:expectedValueInterval:completion:")
    public native void startWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_startWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_startWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_startWithExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTROperationalStateClusterOperationalCommandResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("startWithParams:expectedValues:expectedValueInterval:completion:")
    public native void startWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTROperationalStateClusterStartParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_startWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_startWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_startWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTROperationalStateClusterOperationalCommandResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("stopWithExpectedValues:expectedValueInterval:completion:")
    public native void stopWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stopWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_stopWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_stopWithExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTROperationalStateClusterOperationalCommandResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("stopWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stopWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTROperationalStateClusterStopParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stopWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_stopWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_stopWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTROperationalStateClusterOperationalCommandResponseParams data, @Nullable NSError error);
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
}