package apple.avfoundation;

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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVCaptureMultiCamSession
 * <p>
 * A subclass of AVCaptureSession which supports simultaneous capture from multiple inputs of the same media type.
 * <p>
 * AVCaptureMultiCamSession's sessionPreset is always AVCaptureSessionPresetInputPriority and may not be set to any other value. Each input's device.activeFormat must be set manually to achieve the desired quality of service.
 * <p>
 * AVCaptureMultiCamSession supports dynamic enabling and disabling of individual camera inputs without interrupting preview. In order to stop an individual camera input, set the enabled property on all of its connections or connected ports to NO. When the last active connection or port is disabled, the source camera stops streaming to save power and bandwidth. Other inputs streaming data through the session are unaffected.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureMultiCamSession extends AVCaptureSession {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureMultiCamSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureMultiCamSession alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVCaptureMultiCamSession allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] hardwareCost
     * <p>
     * Indicates the percentage of the session's available hardware budget currently in use.
     * <p>
     * The value of this property is a float from 0.0 => 1.0 indicating how much of the session's available hardware is in use as a percentage, given the currently connected inputs and outputs and the features for which you've opted in. When your hardwareCost is greater than 1.0, the capture session cannot run your desired configuration due to hardware constraints, so you receive an AVCaptureSessionRuntimeErrorNotification when attempting to start it running. Default value is 0.
     * <p>
     * Contributors to hardwareCost include:
     * - Whether the source devices' active formats use the full sensor (4:3) or a crop (16:9). Cropped formats require lower hardware bandwidth, and therefore lower the cost.
     * - The max frame rate supported by the source devices' active formats. The higher the max frame rate, the higher the cost.
     * - Whether the source devices' active formats are binned or not. Binned formats require substantially less hardware bandwidth, and therefore result in a lower cost.
     * - The number of sources configured to deliver streaming disparity / depth via AVCaptureDepthDataOutput. The higher the number of cameras configured to produce depth, the higher the cost.
     * In order to reduce hardwareCost, consider picking a sensor-cropped activeFormat, or a binned format. You may also use AVCaptureDeviceInput's videoMinFrameDurationOverride property to artificially limit the max frame rate (which is the reciprocal of the min frame duration) of a source device to a lower value. By doing so, you only pay the hardware cost for the max frame rate you intend to use.
     */
    @Generated
    @Selector("hardwareCost")
    public native float hardwareCost();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVCaptureMultiCamSession init();

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

    /**
     * [@property] multiCamSupported
     * Indicates whether multicam session is supported on this platform.
     * <p>
     * AVCaptureMultiCamSession is intended to be used with multiple cameras and is only supported on platforms with sufficient hardware bandwidth, system memory, and thermal performance. For single-camera use cases, AVCaptureSession should be used instead.
     */
    @Generated
    @Selector("isMultiCamSupported")
    public static native boolean isMultiCamSupported();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVCaptureMultiCamSession new_objc();

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

    /**
     * [@property] systemPressureCost
     * <p>
     * Indicates the system pressure cost of your current configuration.
     * <p>
     * The value of this property is a float whose nominal range is 0.0 => 1.0 indicating the system pressure cost of your current configuration. When your systemPressureCost is greater than 1.0, the capture session cannot run sustainably. It may be able to run for a brief period before needing to stop due to high system pressure. While running in an unsustainable configuration, you may monitor the session's systemPressureState and reduce pressure by reducing the frame rate, throttling your use of the GPU, etc. When the session reaches critical system pressure state, it must temporarily shut down, and you receive an AVCaptureSessionWasInterruptedNotification indicating the reason your session needed to stop. When system pressure alleviates, the session interruption ends.
     */
    @Generated
    @Selector("systemPressureCost")
    public native float systemPressureCost();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
