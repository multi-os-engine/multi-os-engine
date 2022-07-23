package apple.arkit;

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
 * A configuration for running face tracking.
 * <p>
 * Face tracking uses the front facing camera to track the face in 3D providing details on the topology and expression
 * of the face.
 * A detected face will be added to the session as an ARFaceAnchor object which contains information about head pose,
 * mesh, eye pose, and blend shape
 * coefficients. If light estimation is enabled the detected face will be treated as a light probe and used to estimate
 * the direction of incoming light.
 */
@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ARFaceTrackingConfiguration extends ARConfiguration {
    static {
        NatJ.register();
    }

    @Generated
    protected ARFaceTrackingConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ARFaceTrackingConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ARFaceTrackingConfiguration allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ARFaceTrackingConfiguration init();

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
    @Selector("isSupported")
    public static native boolean isSupported();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native ARFaceTrackingConfiguration new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Enable or disable World Tracking. Disabled by default.
     * <p>
     * When enabled, ARSession uses the back facing camera to track the device's orientation and position in the world.
     * The camera transform and the ARFaceAnchor transform will be in the world coordinate space.
     */
    @Generated
    @Selector("isWorldTrackingEnabled")
    public native boolean isWorldTrackingEnabled();

    /**
     * Maximum number of faces to track simultaneously.
     * <p>
     * Setting the maximum number of tracked faces will limit the number of faces that can be tracked in a given frame.
     * If more than the maximum is visible, only the faces already being tracked will continue to track until tracking
     * is lost or another face is removed.
     * Default value is one.
     */
    @Generated
    @Selector("maximumNumberOfTrackedFaces")
    @NInt
    public native long maximumNumberOfTrackedFaces();

    /**
     * Maximum number of faces to track simultaneously.
     * <p>
     * Setting the maximum number of tracked faces will limit the number of faces that can be tracked in a given frame.
     * If more than the maximum is visible, only the faces already being tracked will continue to track until tracking
     * is lost or another face is removed.
     * Default value is one.
     */
    @Generated
    @Selector("setMaximumNumberOfTrackedFaces:")
    public native void setMaximumNumberOfTrackedFaces(@NInt long value);

    /**
     * Enable or disable World Tracking. Disabled by default.
     * <p>
     * When enabled, ARSession uses the back facing camera to track the device's orientation and position in the world.
     * The camera transform and the ARFaceAnchor transform will be in the world coordinate space.
     */
    @Generated
    @Selector("setWorldTrackingEnabled:")
    public native void setWorldTrackingEnabled(boolean value);

    /**
     * Maximum number of faces which can be tracked simultaneously.
     */
    @Generated
    @Selector("supportedNumberOfTrackedFaces")
    @NInt
    public static native long supportedNumberOfTrackedFaces();

    @Generated
    @Selector("supportedVideoFormats")
    public static native NSArray<? extends ARVideoFormat> supportedVideoFormats();

    @Generated
    @Selector("supportsFrameSemantics:")
    public static native boolean supportsFrameSemantics(@NUInt long frameSemantics);

    /**
     * Indicates whether world tracking can be enabled on this device.
     */
    @Generated
    @Selector("supportsWorldTracking")
    public static native boolean supportsWorldTracking();
}
