package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
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
 * AVCaptureIndexPicker
 * 
 * An `AVCaptureControl` for selecting from a set of mutually exclusive values by index.
 * 
 * `AVCaptureIndexPicker` is ideal when the set of values is provided by an indexed container like `NSArray`, `Array`,
 * or `Sequence`. Controls may be added to an `AVCaptureSession` using `-[AVCaptureSession addControl:]`.
 * 
 * `AVCaptureIndexPicker` uses zero-based indexing.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureIndexPicker extends AVCaptureControl {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureIndexPicker(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * [@property] accessibilityIdentifier
     * 
     * A string that identifies the picker.
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
    public static native AVCaptureIndexPicker alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCaptureIndexPicker allocWithZone(VoidPtr zone);

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
    public native AVCaptureIndexPicker init();

    /**
     * initWithLocalizedTitle:symbolName:localizedIndexTitles:
     * 
     * Initializes an `AVCaptureIndexPicker` to pick between `localizedIndexTitles.count` values.
     * 
     * Suitable when you already have an array containing a title for each picked value.
     * 
     * API-Since: 18.0
     * 
     * @param localizedTitle
     *                             A localized string that describes the picker's `action`.
     * @param symbolName
     *                             The name of a symbol to represent the picker.
     * @param localizedIndexTitles
     *                             The titles to use for each index. `localizedIndexTitles` must be greater than 0,
     *                             otherwise an `NSInvalidArgumentException` is thrown.
     * @return
     *         An `AVCaptureIndexPicker` instance that picks between `localizedIndexTitles.count` values.
     */
    @Generated
    @Selector("initWithLocalizedTitle:symbolName:localizedIndexTitles:")
    public native AVCaptureIndexPicker initWithLocalizedTitleSymbolNameLocalizedIndexTitles(
            @NotNull String localizedTitle, @NotNull String symbolName, @NotNull NSArray<String> localizedIndexTitles);

    /**
     * initWithLocalizedTitle:symbolName:numberOfIndexes:
     * 
     * Initializes an `AVCaptureIndexPicker` to pick between `numberOfIndexes` values.
     * 
     * Suitable when your picked values don't need titles.
     * 
     * API-Since: 18.0
     * 
     * @param localizedTitle
     *                        A localized string that describes the picker's `action`.
     * @param symbolName
     *                        The name of a symbol to represent the picker.
     * @param numberOfIndexes
     *                        The number of indexes to pick between. `numberOfIndexes` must be greater than 0, otherwise
     *                        an `NSInvalidArgumentException` is thrown.
     * @return
     *         An `AVCaptureIndexPicker` instance that picks between `numberOfIndexes` values.
     */
    @Generated
    @Selector("initWithLocalizedTitle:symbolName:numberOfIndexes:")
    public native AVCaptureIndexPicker initWithLocalizedTitleSymbolNameNumberOfIndexes(@NotNull String localizedTitle,
            @NotNull String symbolName, @NInt long numberOfIndexes);

    /**
     * initWithLocalizedTitle:symbolName:numberOfIndexes:localizedTitleTransform:
     * 
     * Initializes an `AVCaptureIndexPicker` to pick between `numberOfIndexes` values.
     * 
     * Suitable when you want to provide a title for each picked value lazily.
     * 
     * API-Since: 18.0
     * 
     * @param localizedTitle
     *                                A localized string that describes the picker's `action`.
     * @param symbolName
     *                                The name of a symbol to represent the picker.
     * @param numberOfIndexes
     *                                The number of indexes to pick between. `numberOfIndexes` must be greater than 0,
     *                                otherwise an `NSInvalidArgumentException` is thrown.
     * @param localizedTitleTransform
     *                                A transformation from index to localized title.
     * @return
     *         An `AVCaptureIndexPicker` instance that picks between `numberOfIndexes` values with a transformation from
     *         index to localized title.
     */
    @Generated
    @Selector("initWithLocalizedTitle:symbolName:numberOfIndexes:localizedTitleTransform:")
    public native AVCaptureIndexPicker initWithLocalizedTitleSymbolNameNumberOfIndexesLocalizedTitleTransform(
            @NotNull String localizedTitle, @NotNull String symbolName, @NInt long numberOfIndexes,
            @ObjCBlock(name = "call_initWithLocalizedTitleSymbolNameNumberOfIndexesLocalizedTitleTransform") @NotNull Block_initWithLocalizedTitleSymbolNameNumberOfIndexesLocalizedTitleTransform localizedTitleTransform);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithLocalizedTitleSymbolNameNumberOfIndexesLocalizedTitleTransform {
        @Generated
        @NotNull
        String call_initWithLocalizedTitleSymbolNameNumberOfIndexesLocalizedTitleTransform(@NInt long index);
    }

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
     * [@property] localizedIndexTitles
     * 
     * The titles used for each index.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("localizedIndexTitles")
    @NotNull
    public native NSArray<String> localizedIndexTitles();

    /**
     * [@property] localizedTitle
     * 
     * A localized string that describes the picker's `action`.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("localizedTitle")
    @NotNull
    public native String localizedTitle();

    @Generated
    @Owned
    @Selector("new")
    public static native AVCaptureIndexPicker new_objc();

    /**
     * [@property] numberOfIndexes
     * 
     * The number of indexes to pick between.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("numberOfIndexes")
    @NInt
    public native long numberOfIndexes();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] selectedIndex
     * 
     * The currently selected index.
     * 
     * Because the camera system may be independent from the main thread or `@MainActor`, `selectedIndex` must be
     * changed on `actionQueue` – the queue provided to `setActionQueue:action:`. The default value is 0. An index may
     * only be set if it is greater than 0 or less than `numberOfIndexes`, otherwise an `NSInvalidArgumentException` is
     * thrown.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("selectedIndex")
    @NInt
    public native long selectedIndex();

    /**
     * [@property] accessibilityIdentifier
     * 
     * A string that identifies the picker.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setAccessibilityIdentifier:")
    public native void setAccessibilityIdentifier(@Nullable String value);

    /**
     * setActionQueue:action:
     * 
     * Configures the picker's `action` which is called on `actionQueue` whenever the index of the picker is changed.
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
     *                    An action called on `actionQueue` whenever the selected index of the picker is changed.
     */
    @Generated
    @Selector("setActionQueue:action:")
    public native void setActionQueueAction(@NotNull dispatch_queue_t actionQueue,
            @ObjCBlock(name = "call_setActionQueueAction") @NotNull Block_setActionQueueAction action);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setActionQueueAction {
        @Generated
        void call_setActionQueueAction(@NInt long selectedIndex);
    }

    /**
     * [@property] selectedIndex
     * 
     * The currently selected index.
     * 
     * Because the camera system may be independent from the main thread or `@MainActor`, `selectedIndex` must be
     * changed on `actionQueue` – the queue provided to `setActionQueue:action:`. The default value is 0. An index may
     * only be set if it is greater than 0 or less than `numberOfIndexes`, otherwise an `NSInvalidArgumentException` is
     * thrown.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setSelectedIndex:")
    public native void setSelectedIndex(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] symbolName
     * 
     * The name of a symbol to represent the picker.
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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}