package apple.scenekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.scenekit.protocol.SCNCameraControllerDelegate;
import apple.scenekit.struct.SCNVector3;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGSize;

/**
 * API-Since: 11.0
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNCameraController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNCameraController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNCameraController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNCameraController allocWithZone(VoidPtr zone);

    /**
     * Automatically update the target in beginInteraction
     * Defaults to NO
     */
    @Generated
    @Selector("automaticTarget")
    public native boolean automaticTarget();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Begin/Continue/End interaction using an input location relative to viewport.
     * The behavior depends on the current interactionMode.
     */
    @Generated
    @Selector("beginInteraction:withViewport:")
    public native void beginInteractionWithViewport(@ByValue CGPoint location, @ByValue CGSize viewport);

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

    /**
     * clear the camera roll if any
     */
    @Generated
    @Selector("clearRoll")
    public native void clearRoll();

    @Generated
    @Selector("continueInteraction:withViewport:sensitivity:")
    public native void continueInteractionWithViewportSensitivity(@ByValue CGPoint location, @ByValue CGSize viewport,
            @NFloat double sensitivity);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native SCNCameraControllerDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Zoom by moving the camera along the axis by a screen space point.
     */
    @Generated
    @Selector("dollyBy:onScreenPoint:viewport:")
    public native void dollyByOnScreenPointViewport(float delta, @ByValue CGPoint point, @ByValue CGSize viewport);

    /**
     * Zoom by moving the camera along the axis from the camera position to the target.
     */
    @Generated
    @Selector("dollyToTarget:")
    public native void dollyToTarget(float delta);

    @Generated
    @Selector("endInteraction:withViewport:velocity:")
    public native void endInteractionWithViewportVelocity(@ByValue CGPoint location, @ByValue CGSize viewport,
            @ByValue CGPoint velocity);

    /**
     * Move the camera to a position where the bounding sphere of all nodes is fully visible.
     * Also set the camera target as the center of the bounding sphere.
     */
    @Generated
    @Selector("frameNodes:")
    public native void frameNodes(NSArray<? extends SCNNode> nodes);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Set to YES to enable inertia on endInteraction.
     * Defaults to NO.
     */
    @Generated
    @Selector("inertiaEnabled")
    public native boolean inertiaEnabled();

    /**
     * The friction coefficient applied to the inertia.
     * Defaults to 0.05.
     */
    @Generated
    @Selector("inertiaFriction")
    public native float inertiaFriction();

    @Generated
    @Selector("init")
    public native SCNCameraController init();

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
    @Selector("interactionMode")
    @NInt
    public native long interactionMode();

    /**
     * Returns YES if inertia is running.
     */
    @Generated
    @Selector("isInertiaRunning")
    public native boolean isInertiaRunning();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("maximumHorizontalAngle")
    public native float maximumHorizontalAngle();

    @Generated
    @Selector("maximumVerticalAngle")
    public native float maximumVerticalAngle();

    /**
     * Minimum and maximum horizontal view angles in degrees for SCNInteractionModeFly and
     * SCNInteractionModeOrbitTurntable.
     * The angle constraints is not enforced if both horizontal angle properties values are set to 0.
     * The angle constraints will not be enforced if the initial orientation is outside the given range.
     * The minimum angle must be inferior to the maximum angle.
     * Angles are in world space and within the range [-180, 180].
     * Defaults to 0.0.
     */
    @Generated
    @Selector("minimumHorizontalAngle")
    public native float minimumHorizontalAngle();

    /**
     * Minimum and maximum vertical view angles in degrees for SCNInteractionModeFly and
     * SCNInteractionModeOrbitTurntable.
     * The angle constraints is not enforced if both vertical angle properties values are set to 0.
     * The angle constraints will not be enforced if the initial orientation is outside the given range.
     * The minimum angle must be inferior to the maximum angle.
     * Angles are in world space and within the range [-90, 90].
     * Defaults to 0.0.
     * For example: set to minimum to 0 and maximum to 90 to only allow orbit around the top hemisphere.
     */
    @Generated
    @Selector("minimumVerticalAngle")
    public native float minimumVerticalAngle();

    @Generated
    @Owned
    @Selector("new")
    public static native SCNCameraController new_objc();

    @Generated
    @Selector("pointOfView")
    public native SCNNode pointOfView();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Rotate the camera around the axis from the camera position to the target.
     * Delta is in degrees.
     */
    @Generated
    @Selector("rollAroundTarget:")
    public native void rollAroundTarget(float delta);

    /**
     * Rotate the camera around the given screen space point. Delta is in degrees.
     */
    @Generated
    @Selector("rollBy:aroundScreenPoint:viewport:")
    public native void rollByAroundScreenPointViewport(float delta, @ByValue CGPoint point, @ByValue CGSize viewport);

    /**
     * Rotate delta is in degrees.
     */
    @Generated
    @Selector("rotateByX:Y:")
    public native void rotateByXY(float deltaX, float deltaY);

    /**
     * Automatically update the target in beginInteraction
     * Defaults to NO
     */
    @Generated
    @Selector("setAutomaticTarget:")
    public native void setAutomaticTarget(boolean value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) SCNCameraControllerDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) SCNCameraControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Set to YES to enable inertia on endInteraction.
     * Defaults to NO.
     */
    @Generated
    @Selector("setInertiaEnabled:")
    public native void setInertiaEnabled(boolean value);

    /**
     * The friction coefficient applied to the inertia.
     * Defaults to 0.05.
     */
    @Generated
    @Selector("setInertiaFriction:")
    public native void setInertiaFriction(float value);

    @Generated
    @Selector("setInteractionMode:")
    public native void setInteractionMode(@NInt long value);

    @Generated
    @Selector("setMaximumHorizontalAngle:")
    public native void setMaximumHorizontalAngle(float value);

    @Generated
    @Selector("setMaximumVerticalAngle:")
    public native void setMaximumVerticalAngle(float value);

    /**
     * Minimum and maximum horizontal view angles in degrees for SCNInteractionModeFly and
     * SCNInteractionModeOrbitTurntable.
     * The angle constraints is not enforced if both horizontal angle properties values are set to 0.
     * The angle constraints will not be enforced if the initial orientation is outside the given range.
     * The minimum angle must be inferior to the maximum angle.
     * Angles are in world space and within the range [-180, 180].
     * Defaults to 0.0.
     */
    @Generated
    @Selector("setMinimumHorizontalAngle:")
    public native void setMinimumHorizontalAngle(float value);

    /**
     * Minimum and maximum vertical view angles in degrees for SCNInteractionModeFly and
     * SCNInteractionModeOrbitTurntable.
     * The angle constraints is not enforced if both vertical angle properties values are set to 0.
     * The angle constraints will not be enforced if the initial orientation is outside the given range.
     * The minimum angle must be inferior to the maximum angle.
     * Angles are in world space and within the range [-90, 90].
     * Defaults to 0.0.
     * For example: set to minimum to 0 and maximum to 90 to only allow orbit around the top hemisphere.
     */
    @Generated
    @Selector("setMinimumVerticalAngle:")
    public native void setMinimumVerticalAngle(float value);

    @Generated
    @Selector("setPointOfView:")
    public native void setPointOfView(SCNNode value);

    /**
     * The camera target in world space for orbit rotation.
     */
    @Generated
    @Selector("setTarget:")
    public native void setTarget(@ByValue SCNVector3 value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The up vector in world space used as reference for SCNInteractionModeFly and SCNInteractionModeOrbitTurntable
     * camera modes.
     * Defaults to (0, 1, 0).
     */
    @Generated
    @Selector("setWorldUp:")
    public native void setWorldUp(@ByValue SCNVector3 value);

    /**
     * Stop current inertia.
     */
    @Generated
    @Selector("stopInertia")
    public native void stopInertia();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The camera target in world space for orbit rotation.
     */
    @Generated
    @Selector("target")
    @ByValue
    public native SCNVector3 target();

    /**
     * Translate the camera along the local X/Y/Z axis.
     */
    @Generated
    @Selector("translateInCameraSpaceByX:Y:Z:")
    public native void translateInCameraSpaceByXYZ(float deltaX, float deltaY, float deltaZ);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The up vector in world space used as reference for SCNInteractionModeFly and SCNInteractionModeOrbitTurntable
     * camera modes.
     * Defaults to (0, 1, 0).
     */
    @Generated
    @Selector("worldUp")
    @ByValue
    public native SCNVector3 worldUp();
}
