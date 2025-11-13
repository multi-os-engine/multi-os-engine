package apple.pencilkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * The state of PencilKit behavior related to a `UIResponder`.
 * 
 * Control the behavior of responders via the `UIResponder.pencilKitResponderState` property.
 * ```swift
 * view.pencilKitResponderState.activeToolPicker = PKToolPicker()
 * view.pencilKitResponderState.toolPickerVisibility = .visible
 * ```
 * 
 * API-Since: 26.0
 */
@Generated
@Library("PencilKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKResponderState extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKResponderState(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * The current tool picker.
     * 
     * Control tool picker visibility with the `toolPickerVisibility` property.
     * 
     * If `nil` the active tool picker is based on the next responder.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("activeToolPicker")
    @Nullable
    public native PKToolPicker activeToolPicker();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKResponderState alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native PKResponderState allocWithZone(VoidPtr zone);

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
    public native PKResponderState init();

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
    public static native PKResponderState new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The current tool picker.
     * 
     * Control tool picker visibility with the `toolPickerVisibility` property.
     * 
     * If `nil` the active tool picker is based on the next responder.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setActiveToolPicker:")
    public native void setActiveToolPicker(@Nullable PKToolPicker value);

    /**
     * The visibility state of the tool picker.
     * 
     * This controls the state of the tool picker that is provided by the `activeToolPicker` property.
     * 
     * If `PKToolPickerVisibilityInherited` tool picker visibility is based on the next responder. If no responder
     * provides a visibility, the default is `PKToolPickerVisibilityVisible`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setToolPickerVisibility:")
    public native void setToolPickerVisibility(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The visibility state of the tool picker.
     * 
     * This controls the state of the tool picker that is provided by the `activeToolPicker` property.
     * 
     * If `PKToolPickerVisibilityInherited` tool picker visibility is based on the next responder. If no responder
     * provides a visibility, the default is `PKToolPickerVisibilityVisible`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("toolPickerVisibility")
    @NInt
    public native long toolPickerVisibility();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}