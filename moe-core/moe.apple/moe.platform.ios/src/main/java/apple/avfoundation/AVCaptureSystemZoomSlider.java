package apple.avfoundation;

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
import org.moe.natj.general.ann.NFloat;
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
 * AVCaptureSystemZoomSlider
 * 
 * The system's recommended continuous zoom control for `-[AVCaptureDevice videoZoomFactor]`.
 * 
 * `AVCaptureSystemZoomSlider` uses the range specified by the `systemRecommendedVideoZoomRange` on the `activeFormat`
 * from the `AVCaptureDevice` specified during initialization. As the device's `activeFormat` changes, the slider
 * updates its range with the new format's `systemRecommendedVideoZoomRange`.
 * 
 * Controls may be added to an `AVCaptureSession` using `-[AVCaptureSession addControl:]`.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureSystemZoomSlider extends AVCaptureControl {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureSystemZoomSlider(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureSystemZoomSlider alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCaptureSystemZoomSlider allocWithZone(VoidPtr zone);

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
    public native AVCaptureSystemZoomSlider init();

    /**
     * initWithDevice:
     * 
     * Initializes an `AVCaptureSystemZoomSlider` for controlling `device`.
     * 
     * `AVCaptureSystemZoomSlider` may only be initialized with `AVCaptureDevice` instances that support setting
     * `videoZoomFactor`, otherwise an `NSInvalidArgumentException` is thrown.
     * 
     * API-Since: 18.0
     * 
     * @param device
     *               The device to control.
     */
    @Generated
    @Selector("initWithDevice:")
    public native AVCaptureSystemZoomSlider initWithDevice(@NotNull AVCaptureDevice device);

    /**
     * initWithDevice:action
     * 
     * Initializes an `AVCaptureSystemZoomSlider` for controlling `device` with a `@MainActor` `action` for handling
     * `videoZoomFactor` changes.
     * 
     * `action` is **only** called when `videoZoomFactor` is changed by this control. Clients should not change
     * `videoZoomFactor` on the device when `action` is called.
     * 
     * If you need to react to other sources of `videoZoomFactor` changes like `rampToVideoZoomFactor:withRate:` you
     * will still need to use key-value observation.
     * 
     * `AVCaptureSystemZoomSlider` may only be initialized with `AVCaptureDevice` instances that support setting
     * `videoZoomFactor`, otherwise an `NSInvalidArgumentException` is thrown.
     * 
     * API-Since: 18.0
     * 
     * @param device
     *               The device to control.
     * @param action
     *               An action called on `@MainActor` to handle `videoZoomFactor` changes by
     *               `AVCaptureSystemZoomSlider`.
     */
    @Generated
    @Selector("initWithDevice:action:")
    public native AVCaptureSystemZoomSlider initWithDeviceAction(@NotNull AVCaptureDevice device,
            @ObjCBlock(name = "call_initWithDeviceAction") @NotNull Block_initWithDeviceAction action);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithDeviceAction {
        @Generated
        void call_initWithDeviceAction(@NFloat double videoZoomFactor);
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

    @Generated
    @Owned
    @Selector("new")
    public static native AVCaptureSystemZoomSlider new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

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