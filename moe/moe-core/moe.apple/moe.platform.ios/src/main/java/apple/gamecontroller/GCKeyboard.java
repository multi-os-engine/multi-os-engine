package apple.gamecontroller;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gamecontroller.protocol.GCDevice;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.opaque.dispatch_queue_t;

/**
 * GCKeyboard is available to an application that links to GameController.framework
 * There are 2 ways to access keyboard paired to the system:
 * 1: Querying for the coalescedKeyboard using [GCKeyboard coalescedKeyboard]
 * 2: Registering for Connection/Disconnection notifications from NSNotificationCenter
 * 
 * [@note] All connected keyboards are coalesced into one keyboard object, so notification about
 * connection/disconnection will only be delivered once.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GCKeyboard extends NSObject implements GCDevice {
    static {
        NatJ.register();
    }

    @Generated
    protected GCKeyboard(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GCKeyboard alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GCKeyboard allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

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

    /**
     * Keyboard object that represents all keyboards connected to the device
     * Should be used to query key states every time input needs to be handled
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("coalescedKeyboard")
    public static native GCKeyboard coalescedKeyboard();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @NotNull
    @Generated
    @Selector("handlerQueue")
    public native dispatch_queue_t handlerQueue();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native GCKeyboard init();

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
     * Unlike GCController GCKeyboard only has one input profile.
     * 
     * This profile allows you to query buttons and button state
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("keyboardInput")
    public native GCKeyboardInput keyboardInput();

    @Generated
    @Owned
    @Selector("new")
    public static native GCKeyboard new_objc();

    @NotNull
    @Deprecated
    @Generated
    @Selector("physicalInputProfile")
    public native GCPhysicalInputProfile physicalInputProfile();

    @NotNull
    @Generated
    @Selector("productCategory")
    public native String productCategory();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setHandlerQueue:")
    public native void setHandlerQueue(@NotNull dispatch_queue_t value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Nullable
    @Generated
    @Selector("vendorName")
    public native String vendorName();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
