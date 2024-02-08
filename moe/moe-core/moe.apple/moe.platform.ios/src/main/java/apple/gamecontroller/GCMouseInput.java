package apple.gamecontroller;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Mouse profile that represent a physical mouse object with two axis cursor, two axis scroll,
 * left button, optional right and middle buttons and optional set of auxiliary buttons.
 * 
 * It only provides information about raw mouse movement deltas. For the valid cursor position
 * at given point in time, use UIHoverGestureRecognizer and NSEvent.mouseLocation.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GCMouseInput extends GCPhysicalInputProfile {
    static {
        NatJ.register();
    }

    @Generated
    protected GCMouseInput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GCMouseInput alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GCMouseInput allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Nullable
    @Generated
    @Selector("auxiliaryButtons")
    public native NSArray<? extends GCControllerButtonInput> auxiliaryButtons();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
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
    public native GCMouseInput init();

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Mouse buttons that can be used only as digital inputs
     */
    @NotNull
    @Generated
    @Selector("leftButton")
    public native GCControllerButtonInput leftButton();

    @Nullable
    @Generated
    @Selector("middleButton")
    public native GCControllerButtonInput middleButton();

    @Nullable
    @Generated
    @Selector("mouseMovedHandler")
    @ObjCBlock(name = "call_mouseMovedHandler_ret")
    public native Block_mouseMovedHandler_ret mouseMovedHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_mouseMovedHandler_ret {
        @Generated
        void call_mouseMovedHandler_ret(@NotNull GCMouseInput mouse, float deltaX, float deltaY);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native GCMouseInput new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Nullable
    @Generated
    @Selector("rightButton")
    public native GCControllerButtonInput rightButton();

    /**
     * Scroll is a dpad with undefined range.
     */
    @NotNull
    @Generated
    @Selector("scroll")
    public native GCDeviceCursor scroll();

    @Generated
    @Selector("setMouseMovedHandler:")
    public native void setMouseMovedHandler(
            @Nullable @ObjCBlock(name = "call_setMouseMovedHandler") Block_setMouseMovedHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setMouseMovedHandler {
        @Generated
        void call_setMouseMovedHandler(@NotNull GCMouseInput mouse, float deltaX, float deltaY);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
