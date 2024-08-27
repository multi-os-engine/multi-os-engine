package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.quartzcore.CALayer;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVCaptureDeviceRotationCoordinator
 * 
 * The AVCaptureDeviceRotationCoordinator allows clients to monitor rotations of a given AVCaptureDevice instance and be
 * provided the video rotation angle that should be applied for horizon-level preview and capture relative to gravity.
 * 
 * Each instance of AVCaptureDeviceRotationCoordinator allows a client to coordinate with changes to the rotation of an
 * AVCaptureDevice to ensure the camera's video preview and captured output are horizon-level. The coordinator delivers
 * key-value updates on the main queue.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureDeviceRotationCoordinator extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureDeviceRotationCoordinator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureDeviceRotationCoordinator alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCaptureDeviceRotationCoordinator allocWithZone(VoidPtr zone);

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
     * [@property] device
     * 
     * The the device for which the coordinator provides video rotation angles.
     * 
     * The value of this property is the AVCaptureDevice instance that was used to create the coordinator. The
     * coordinator holds a weak reference to the device.
     */
    @Generated
    @Selector("device")
    @Nullable
    public native AVCaptureDevice device();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVCaptureDeviceRotationCoordinator init();

    /**
     * initWithDevice:previewLayer:
     * 
     * Returns an AVCaptureDeviceRotationCoordinator instance that provides updates to the amount of rotation that
     * should be applied for horizon-level preview and capture relative to gravity.
     * 
     * An AVCaptureDeviceRotationCoordinator is only applicable to video devices. The given device and layer determine
     * the amount of rotation that should be applied for horizon-level preview and capture.
     * 
     * @param device
     *                     The device for which to monitor rotation.
     * @param previewLayer
     *                     A layer displaying the camera's video preview. If nil, the coordinator will return 0 degrees
     *                     of rotation for horizon-level preview.
     * @return
     *         An AVCaptureDeviceRotationCoordinator from which rotation angles for preview and capture can be obtained.
     */
    @Generated
    @Selector("initWithDevice:previewLayer:")
    public native AVCaptureDeviceRotationCoordinator initWithDevicePreviewLayer(@NotNull AVCaptureDevice device,
            @Nullable CALayer previewLayer);

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
    public static native AVCaptureDeviceRotationCoordinator new_objc();

    /**
     * [@property] previewLayer
     * 
     * The CALayer for which the coordinator calculates video rotation angles for horizon-level preview.
     * 
     * The value of this property is the CALayer instance that was used to create the coordinator. Clients may specify
     * an AVCaptureVideoPreviewLayer or other CALayer instance that displays a camera's video preview. The coordinator
     * holds a weak reference to the layer. The coordinator will return 0 degrees of rotation from
     * -videoRotationAngleForHorizonLevelPreview if a layer was not specified at initialization, the layer is not in a
     * view hierarchy, or the layer has been deallocated.
     */
    @Generated
    @Selector("previewLayer")
    @Nullable
    public native CALayer previewLayer();

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

    /**
     * [@property] videoRotationAngleForHorizonLevelCapture
     * 
     * Returns a video rotation angle in degrees for horizon-level capture from this camera.
     * 
     * The video rotation angle represents by how much the photos or movies captured from the camera should be rotated
     * to be horizon-level relative to gravity. A video rotation angle of 0 degrees means that the output will be in the
     * camera's unrotated, native sensor orientation. The video rotation angle for capture may differ between cameras.
     * For example when an iOS device is held in portrait orientation, photos and movies captured from built-in cameras
     * may need to be rotated by 90 degrees while the photos and movies from an external camera should not be rotated.
     * External cameras return 0 degrees of rotation even if they physically rotate when their position in physical
     * space is unknown. The video rotation angle returned from this property is distinct from the angle returned by
     * -videoRotationAngleForHorizonLevelPreview because in certain combinations of device and interface orientations,
     * the video rotation angle needed for horizon-level preview may not match the amount of rotation needed for
     * horizon-level capture. This property is key-value observable and delivers updates on the main queue.
     */
    @Generated
    @Selector("videoRotationAngleForHorizonLevelCapture")
    @NFloat
    public native double videoRotationAngleForHorizonLevelCapture();

    /**
     * [@property] videoRotationAngleForHorizonLevelPreview
     * 
     * Returns a video rotation angle in degrees for displaying the camera's video preview in the given CALayer.
     * 
     * The video rotation angle represents by how much the camera's video preview should be rotated for display in the
     * CALayer to be horizon-level relative to gravity. An angle of 0 degrees means that video will be output in the
     * camera's unrotated, native sensor orientation. The video rotation angle for preview may differ between cameras at
     * different positions. For example when an iOS device is held in portrait orientation, the video preview for
     * built-in cameras may need to be rotated by 90 degrees while the video preview for an external camera should not
     * be rotated. External cameras return 0 degrees of rotation even if they physically rotate when their position in
     * physical space is unknown. This property is key-value observable and delivers updates on the main queue.
     */
    @Generated
    @Selector("videoRotationAngleForHorizonLevelPreview")
    @NFloat
    public native double videoRotationAngleForHorizonLevelPreview();
}