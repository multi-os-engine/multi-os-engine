package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
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
 * AVCaptureSlider
 * 
 * An `AVCaptureControl` for selecting a value from a bounded range of values.
 * 
 * `AVCaptureSlider` is ideal when your control only needs a single float value. Controls may be added to an
 * `AVCaptureSession` using `-[AVCaptureSession addControl:]`.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureSlider extends AVCaptureControl {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureSlider(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * [@property] accessibilityIdentifier
     * 
     * A string that identifies the slider.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("accessibilityIdentifier")
    @Nullable
    public native String accessibilityIdentifier();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureSlider alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCaptureSlider allocWithZone(VoidPtr zone);

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
    public native AVCaptureSlider init();

    /**
     * initWithLocalizedTitle:symbolName:minValue:maxValue:
     * 
     * Initializes an `AVCaptureSlider` as a continuous slider between `minValue` and `maxValue`.
     * 
     * Continuous sliders are used when any value in the range `minValue...maxValue` is supported.
     * 
     * API-Since: 18.0
     * 
     * @param localizedTitle
     *                       A localized string that describes the slider's `action`.
     * @param symbolName
     *                       The name of a symbol to represent the slider.
     * @param minValue
     *                       The minimum value the slider can have. `minValue` must be less than `maxValue`, otherwise
     *                       an `NSInvalidArgumentException` is thrown.
     * @param maxValue
     *                       The maximum value the slider can have. `maxValue` must be greater than `minValue`,
     *                       otherwise an `NSInvalidArgumentException` is thrown.
     * @return
     *         An `AVCaptureSlider` instance as a continuous slider between `minValue` and `maxValue`.
     */
    @Generated
    @Selector("initWithLocalizedTitle:symbolName:minValue:maxValue:")
    public native AVCaptureSlider initWithLocalizedTitleSymbolNameMinValueMaxValue(@NotNull String localizedTitle,
            @NotNull String symbolName, float minValue, float maxValue);

    /**
     * initWithLocalizedTitle:symbolName:minValue:maxValue:step:
     * 
     * Initializes an `AVCaptureSlider` as a discrete slider where the valid values are between `minValue` and
     * `maxValue` with `step` distance between each value.
     * 
     * Discrete sliders are used when only specific values are valid.
     * 
     * API-Since: 18.0
     * 
     * @param localizedTitle
     *                       A localized string that describes the slider's `action`.
     * @param symbolName
     *                       The name of a symbol to represent the slider.
     * @param minValue
     *                       The minimum value the slider can have. `minValue` must be less than `maxValue`, otherwise
     *                       an `NSInvalidArgumentException` is thrown.
     * @param maxValue
     *                       The maximum value the slider can have. `maxValue` must be greater than `minValue`,
     *                       otherwise an `NSInvalidArgumentException` is thrown.
     * @param step
     *                       The distance between each valid value. `step` must be greater than 0, otherwise an
     *                       `NSInvalidArgumentException` is thrown.
     * @return
     *         An `AVCaptureSlider` instance as a discrete slider where the valid values are between `minValue` and
     *         `maxValue` with `step` distance between each value.
     */
    @Generated
    @Selector("initWithLocalizedTitle:symbolName:minValue:maxValue:step:")
    public native AVCaptureSlider initWithLocalizedTitleSymbolNameMinValueMaxValueStep(@NotNull String localizedTitle,
            @NotNull String symbolName, float minValue, float maxValue, float step);

    /**
     * initWithLocalizedTitle:symbolName:values:
     * 
     * Initializes an `AVCaptureSlider` as a discrete slider where `values` contains the valid values.
     * 
     * Discrete sliders are used when only specific values are valid.
     * 
     * API-Since: 18.0
     * 
     * @param localizedTitle
     *                       A localized string that describes the slider's `action`.
     * @param symbolName
     *                       The name of a symbol to represent the slider.
     * @param values
     *                       The only values the slider can have.
     * @return
     *         An `AVCaptureSlider` instance as a discrete slider where `values` contains the valid values.
     */
    @Generated
    @Selector("initWithLocalizedTitle:symbolName:values:")
    public native AVCaptureSlider initWithLocalizedTitleSymbolNameValues(@NotNull String localizedTitle,
            @NotNull String symbolName, @NotNull NSArray<? extends NSNumber> values);

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
     * [@property] localizedTitle
     * 
     * A localized string that describes the slider's `action`.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("localizedTitle")
    @NotNull
    public native String localizedTitle();

    /**
     * [@property] localizedValueFormat
     * 
     * A localized string defining the presentation of the slider's value.
     * 
     * To modify the presentation of the slider's value, set `localizedValueFormat` to a format string to display the
     * slider's value with any annotation.
     * 
     * The format string may only contain `%@` and no other placeholders like `%d`, `%s`, etc. Invalid format strings
     * will result in the value's default presentation.
     * 
     * Examples of valid format strings are:
     * - `%@%%` for "40%"
     * - `%@ fps` for "60 fps"
     * - `+ %@` for "+ 20"
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("localizedValueFormat")
    @Nullable
    public native String localizedValueFormat();

    @Generated
    @Owned
    @Selector("new")
    public static native AVCaptureSlider new_objc();

    /**
     * [@property] prominentValues
     * 
     * Values in this array may receive unique visual representations or behaviors.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("prominentValues")
    @NotNull
    public native NSArray<? extends NSNumber> prominentValues();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] accessibilityIdentifier
     * 
     * A string that identifies the slider.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setAccessibilityIdentifier:")
    public native void setAccessibilityIdentifier(@Nullable String value);

    /**
     * setActionQueue:action:
     * 
     * Configures the slider's `action` which is called on `actionQueue` whenever the value of the slider is changed.
     * 
     * Because the camera system may be independent from the main thread or `@MainActor`, `action` is always called on
     * an internal `DispatchSerialQueue` targeted at `actionQueue`.
     * 
     * If `action` modifies a property of the camera system, `actionQueue` must represent the same exclusive execution
     * context as the camera system (see `isSameExclusiveExecutionContext`).
     * 
     * API-Since: 18.0
     * 
     * @param actionQueue
     *                    A queue for the `action` to be called.
     * @param action
     *                    An action called on `actionQueue` whenever the value of the slider is changed.
     */
    @Generated
    @Selector("setActionQueue:action:")
    public native void setActionQueueAction(@NotNull dispatch_queue_t actionQueue,
            @ObjCBlock(name = "call_setActionQueueAction") @NotNull Block_setActionQueueAction action);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setActionQueueAction {
        @Generated
        void call_setActionQueueAction(float newValue);
    }

    /**
     * [@property] localizedValueFormat
     * 
     * A localized string defining the presentation of the slider's value.
     * 
     * To modify the presentation of the slider's value, set `localizedValueFormat` to a format string to display the
     * slider's value with any annotation.
     * 
     * The format string may only contain `%@` and no other placeholders like `%d`, `%s`, etc. Invalid format strings
     * will result in the value's default presentation.
     * 
     * Examples of valid format strings are:
     * - `%@%%` for "40%"
     * - `%@ fps` for "60 fps"
     * - `+ %@` for "+ 20"
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setLocalizedValueFormat:")
    public native void setLocalizedValueFormat(@Nullable String value);

    /**
     * [@property] prominentValues
     * 
     * Values in this array may receive unique visual representations or behaviors.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setProminentValues:")
    public native void setProminentValues(@NotNull NSArray<? extends NSNumber> value);

    /**
     * [@property] value
     * 
     * The current value of the slider.
     * 
     * Because the camera system may be independent from the main thread or `@MainActor`, `value` must be changed on
     * `actionQueue` – the queue provided to `setActionQueue:action:`. The default value is the slider's minimum value.
     * A value may only be set if it is within the slider's minimum and maximum values, otherwise an
     * `NSInvalidArgumentException` is thrown.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setValue:")
    public native void setValue(float value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] symbolName
     * 
     * The name of a symbol to represent the slider.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("symbolName")
    @NotNull
    public native String symbolName();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * [@property] value
     * 
     * The current value of the slider.
     * 
     * Because the camera system may be independent from the main thread or `@MainActor`, `value` must be changed on
     * `actionQueue` – the queue provided to `setActionQueue:action:`. The default value is the slider's minimum value.
     * A value may only be set if it is within the slider's minimum and maximum values, otherwise an
     * `NSInvalidArgumentException` is thrown.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("value")
    public native float value();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}