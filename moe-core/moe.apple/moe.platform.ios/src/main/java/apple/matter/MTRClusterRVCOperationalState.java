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
 * Cluster RVC Operational State
 * This cluster supports remotely monitoring and, where supported, changing the operational state of a Robotic Vacuum.
 * 
 * API-Since: 17.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterRVCOperationalState extends MTRGenericCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterRVCOperationalState(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterRVCOperationalState alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterRVCOperationalState allocWithZone(VoidPtr zone);

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
    public native MTRClusterRVCOperationalState init();

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterRVCOperationalState initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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
    public static native MTRClusterRVCOperationalState new_objc();

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
                @Nullable MTRRVCOperationalStateClusterOperationalCommandResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("pauseWithParams:expectedValues:expectedValueInterval:completion:")
    public native void pauseWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRRVCOperationalStateClusterPauseParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_pauseWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_pauseWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pauseWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_pauseWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRRVCOperationalStateClusterOperationalCommandResponseParams data, @Nullable NSError error);
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
                @Nullable MTRRVCOperationalStateClusterOperationalCommandResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("resumeWithParams:expectedValues:expectedValueInterval:completion:")
    public native void resumeWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRRVCOperationalStateClusterResumeParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_resumeWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_resumeWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resumeWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_resumeWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRRVCOperationalStateClusterOperationalCommandResponseParams data, @Nullable NSError error);
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
     * API-Since: 18.4
     */
    @Generated
    @Selector("goHomeWithExpectedValues:expectedValueInterval:completion:")
    public native void goHomeWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_goHomeWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_goHomeWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goHomeWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_goHomeWithExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRRVCOperationalStateClusterOperationalCommandResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("goHomeWithParams:expectedValues:expectedValueInterval:completion:")
    public native void goHomeWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRRVCOperationalStateClusterGoHomeParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_goHomeWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_goHomeWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goHomeWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_goHomeWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRRVCOperationalStateClusterOperationalCommandResponseParams data, @Nullable NSError error);
    }
}