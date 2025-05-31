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
 * Cluster Time Synchronization
 * Accurate time is required for a number of reasons, including scheduling, display and validating security materials.
 * 
 * API-Since: 18.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterTimeSynchronization extends MTRGenericCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterTimeSynchronization(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterTimeSynchronization alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterTimeSynchronization allocWithZone(VoidPtr zone);

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
    public native MTRClusterTimeSynchronization init();

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterTimeSynchronization initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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
    public static native MTRClusterTimeSynchronization new_objc();

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
    @Selector("readAttributeAttributeListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAttributeListWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeDSTOffsetListMaxSizeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDSTOffsetListMaxSizeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeDSTOffsetWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDSTOffsetWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeDefaultNTPWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDefaultNTPWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeGranularityWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeGranularityWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeLocalTimeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLocalTimeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeNTPServerAvailableWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNTPServerAvailableWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeSupportsDNSResolveWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSupportsDNSResolveWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeTimeSourceWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTimeSourceWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeTimeZoneDatabaseWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTimeZoneDatabaseWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeTimeZoneListMaxSizeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTimeZoneListMaxSizeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeTimeZoneWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTimeZoneWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeTrustedTimeSourceWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTrustedTimeSourceWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeUTCTimeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeUTCTimeWithParams(@Nullable MTRReadParams params);

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
    @Selector("setDSTOffsetWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setDSTOffsetWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRTimeSynchronizationClusterSetDSTOffsetParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_setDSTOffsetWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_setDSTOffsetWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setDSTOffsetWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_setDSTOffsetWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setDefaultNTPWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setDefaultNTPWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRTimeSynchronizationClusterSetDefaultNTPParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_setDefaultNTPWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_setDefaultNTPWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setDefaultNTPWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_setDefaultNTPWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setTimeZoneWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setTimeZoneWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRTimeSynchronizationClusterSetTimeZoneParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_setTimeZoneWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_setTimeZoneWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setTimeZoneWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_setTimeZoneWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRTimeSynchronizationClusterSetTimeZoneResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setTrustedTimeSourceWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setTrustedTimeSourceWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRTimeSynchronizationClusterSetTrustedTimeSourceParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_setTrustedTimeSourceWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_setTrustedTimeSourceWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setTrustedTimeSourceWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_setTrustedTimeSourceWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setUTCTimeWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setUTCTimeWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRTimeSynchronizationClusterSetUTCTimeParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_setUTCTimeWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_setUTCTimeWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setUTCTimeWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_setUTCTimeWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
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