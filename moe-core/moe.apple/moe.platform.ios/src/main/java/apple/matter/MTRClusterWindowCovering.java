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
 * Cluster Window Covering
 * Provides an interface for controlling and adjusting automatic window coverings.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterWindowCovering extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterWindowCovering(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterWindowCovering alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterWindowCovering allocWithZone(VoidPtr zone);

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
    @Selector("downOrCloseWithExpectedValues:expectedValueInterval:completion:")
    public native void downOrCloseWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_downOrCloseWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_downOrCloseWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downOrCloseWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_downOrCloseWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use downOrCloseWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("downOrCloseWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void downOrCloseWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_downOrCloseWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_downOrCloseWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downOrCloseWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_downOrCloseWithExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("downOrCloseWithParams:expectedValues:expectedValueInterval:completion:")
    public native void downOrCloseWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRWindowCoveringClusterDownOrCloseParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_downOrCloseWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_downOrCloseWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downOrCloseWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_downOrCloseWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use downOrCloseWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("downOrCloseWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void downOrCloseWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRWindowCoveringClusterDownOrCloseParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_downOrCloseWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_downOrCloseWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downOrCloseWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_downOrCloseWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("goToLiftPercentageWithParams:expectedValues:expectedValueInterval:completion:")
    public native void goToLiftPercentageWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRWindowCoveringClusterGoToLiftPercentageParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_goToLiftPercentageWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_goToLiftPercentageWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goToLiftPercentageWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_goToLiftPercentageWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use goToLiftPercentageWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("goToLiftPercentageWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void goToLiftPercentageWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRWindowCoveringClusterGoToLiftPercentageParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_goToLiftPercentageWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_goToLiftPercentageWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goToLiftPercentageWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_goToLiftPercentageWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("goToLiftValueWithParams:expectedValues:expectedValueInterval:completion:")
    public native void goToLiftValueWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRWindowCoveringClusterGoToLiftValueParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_goToLiftValueWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_goToLiftValueWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goToLiftValueWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_goToLiftValueWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use goToLiftValueWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("goToLiftValueWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void goToLiftValueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRWindowCoveringClusterGoToLiftValueParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_goToLiftValueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_goToLiftValueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goToLiftValueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_goToLiftValueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("goToTiltPercentageWithParams:expectedValues:expectedValueInterval:completion:")
    public native void goToTiltPercentageWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRWindowCoveringClusterGoToTiltPercentageParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_goToTiltPercentageWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_goToTiltPercentageWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goToTiltPercentageWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_goToTiltPercentageWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use goToTiltPercentageWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("goToTiltPercentageWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void goToTiltPercentageWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRWindowCoveringClusterGoToTiltPercentageParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_goToTiltPercentageWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_goToTiltPercentageWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goToTiltPercentageWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_goToTiltPercentageWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("goToTiltValueWithParams:expectedValues:expectedValueInterval:completion:")
    public native void goToTiltValueWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRWindowCoveringClusterGoToTiltValueParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_goToTiltValueWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_goToTiltValueWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goToTiltValueWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_goToTiltValueWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use goToTiltValueWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("goToTiltValueWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void goToTiltValueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRWindowCoveringClusterGoToTiltValueParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_goToTiltValueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_goToTiltValueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goToTiltValueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_goToTiltValueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRClusterWindowCovering init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpoindID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRClusterWindowCovering initWithDeviceEndpointQueue(@NotNull MTRDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterWindowCovering initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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
    public static native MTRClusterWindowCovering new_objc();

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
    @Selector("readAttributeConfigStatusWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeConfigStatusWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeCurrentPositionLiftPercent100thsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentPositionLiftPercent100thsWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeCurrentPositionLiftPercentageWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentPositionLiftPercentageWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeCurrentPositionLiftWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentPositionLiftWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeCurrentPositionTiltPercent100thsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentPositionTiltPercent100thsWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeCurrentPositionTiltPercentageWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentPositionTiltPercentageWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeCurrentPositionTiltWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentPositionTiltWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeEndProductTypeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeEndProductTypeWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeInstalledClosedLimitLiftWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInstalledClosedLimitLiftWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeInstalledClosedLimitTiltWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInstalledClosedLimitTiltWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeInstalledOpenLimitLiftWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInstalledOpenLimitLiftWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeInstalledOpenLimitTiltWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInstalledOpenLimitTiltWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeModeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeModeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeNumberOfActuationsLiftWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNumberOfActuationsLiftWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeNumberOfActuationsTiltWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNumberOfActuationsTiltWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOperationalStatusWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOperationalStatusWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePhysicalClosedLimitLiftWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePhysicalClosedLimitLiftWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePhysicalClosedLimitTiltWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePhysicalClosedLimitTiltWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeSafetyStatusWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSafetyStatusWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTargetPositionLiftPercent100thsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTargetPositionLiftPercent100thsWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTargetPositionTiltPercent100thsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTargetPositionTiltPercent100thsWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTypeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTypeWithParams(@Nullable MTRReadParams params);

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
    @Selector("stopMotionWithExpectedValues:expectedValueInterval:completion:")
    public native void stopMotionWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stopMotionWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_stopMotionWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopMotionWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_stopMotionWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use stopMotionWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("stopMotionWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void stopMotionWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stopMotionWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_stopMotionWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopMotionWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_stopMotionWithExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("stopMotionWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stopMotionWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRWindowCoveringClusterStopMotionParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stopMotionWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_stopMotionWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopMotionWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_stopMotionWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use stopMotionWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("stopMotionWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void stopMotionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRWindowCoveringClusterStopMotionParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stopMotionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_stopMotionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopMotionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_stopMotionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("upOrOpenWithExpectedValues:expectedValueInterval:completion:")
    public native void upOrOpenWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_upOrOpenWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_upOrOpenWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_upOrOpenWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_upOrOpenWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use upOrOpenWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("upOrOpenWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void upOrOpenWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_upOrOpenWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_upOrOpenWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_upOrOpenWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_upOrOpenWithExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("upOrOpenWithParams:expectedValues:expectedValueInterval:completion:")
    public native void upOrOpenWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRWindowCoveringClusterUpOrOpenParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_upOrOpenWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_upOrOpenWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_upOrOpenWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_upOrOpenWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use upOrOpenWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("upOrOpenWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void upOrOpenWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRWindowCoveringClusterUpOrOpenParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_upOrOpenWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_upOrOpenWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_upOrOpenWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_upOrOpenWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

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
    @Selector("writeAttributeModeWithValue:expectedValueInterval:")
    public native void writeAttributeModeWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeModeWithValue:expectedValueInterval:params:")
    public native void writeAttributeModeWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);
}