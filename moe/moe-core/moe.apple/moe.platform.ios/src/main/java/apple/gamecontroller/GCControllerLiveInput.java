package apple.gamecontroller;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gamecontroller.protocol.GCDevice;
import apple.gamecontroller.protocol.GCDevicePhysicalInput;
import apple.gamecontroller.protocol.GCPhysicalInputElement;
import apple.opaque.dispatch_queue_t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
 * API-Since: 17.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GCControllerLiveInput extends GCControllerInputState implements GCDevicePhysicalInput {
    static {
        NatJ.register();
    }

    @Generated
    protected GCControllerLiveInput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GCControllerLiveInput alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native GCControllerLiveInput allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("axes")
    @NotNull
    public native GCPhysicalInputElementCollection<String, ?> axes();

    @Generated
    @Selector("buttons")
    @NotNull
    public native GCPhysicalInputElementCollection<String, ?> buttons();

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
    @Selector("capture")
    @NotNull
    public native GCControllerInputState capture();

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
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native GCDevice device();

    @Generated
    @Selector("dpads")
    @NotNull
    public native GCPhysicalInputElementCollection<String, ?> dpads();

    @Generated
    @Selector("elementValueDidChangeHandler")
    @ObjCBlock(name = "call_elementValueDidChangeHandler_ret")
    @Nullable
    public native GCDevicePhysicalInput.Block_elementValueDidChangeHandler_ret elementValueDidChangeHandler();

    @Generated
    @Selector("elements")
    @NotNull
    public native GCPhysicalInputElementCollection<String, ?> elements();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native GCControllerLiveInput init();

    @Generated
    @Selector("inputStateAvailableHandler")
    @ObjCBlock(name = "call_inputStateAvailableHandler_ret")
    @Nullable
    public native GCDevicePhysicalInput.Block_inputStateAvailableHandler_ret inputStateAvailableHandler();

    @Generated
    @Selector("inputStateQueueDepth")
    @NInt
    public native long inputStateQueueDepth();

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
    @Selector("lastEventLatency")
    public native double lastEventLatency();

    @Generated
    @Selector("lastEventTimestamp")
    public native double lastEventTimestamp();

    @Generated
    @Owned
    @Selector("new")
    public static native GCControllerLiveInput new_objc();

    @Generated
    @Selector("nextInputState")
    @Nullable
    public native GCControllerInputState nextInputState();

    @Generated
    @Selector("objectForKeyedSubscript:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native GCPhysicalInputElement objectForKeyedSubscript(@NotNull String key);

    @Generated
    @Selector("queue")
    @Nullable
    public native dispatch_queue_t queue();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setElementValueDidChangeHandler:")
    public native void setElementValueDidChangeHandler(
            @ObjCBlock(name = "call_setElementValueDidChangeHandler") @Nullable GCDevicePhysicalInput.Block_setElementValueDidChangeHandler value);

    @Generated
    @Selector("setInputStateAvailableHandler:")
    public native void setInputStateAvailableHandler(
            @ObjCBlock(name = "call_setInputStateAvailableHandler") @Nullable GCDevicePhysicalInput.Block_setInputStateAvailableHandler value);

    @Generated
    @Selector("setInputStateQueueDepth:")
    public native void setInputStateQueueDepth(@NInt long value);

    @Generated
    @Selector("setQueue:")
    public native void setQueue(@Nullable dispatch_queue_t value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("switches")
    @NotNull
    public native GCPhysicalInputElementCollection<String, ?> switches();

    /**
     * Get a view of the controller's input without any system-level control
     * remapping applied.
     * 
     * Developers should avoid implementing their own control remapping
     * functionality and to instead direct users to the system game controller
     * settings to remap controls. If you choose to implement your own
     * control remapping functionality, or if your app streams controller input
     * to a remote device that implements control remapping functionality, you
     * should access controller physical input through this interface.
     */
    @Generated
    @Selector("unmappedInput")
    @Nullable
    public native GCControllerLiveInput unmappedInput();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}