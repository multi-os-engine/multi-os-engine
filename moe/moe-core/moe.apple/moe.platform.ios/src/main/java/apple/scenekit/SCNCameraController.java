package apple.scenekit;

import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGSize;
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticTarget")
    public native boolean automaticTarget();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

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

    @Generated
    @Selector("dollyBy:onScreenPoint:viewport:")
    public native void dollyByOnScreenPointViewport(float delta, @ByValue CGPoint point, @ByValue CGSize viewport);

    @Generated
    @Selector("dollyToTarget:")
    public native void dollyToTarget(float delta);

    @Generated
    @Selector("endInteraction:withViewport:velocity:")
    public native void endInteractionWithViewportVelocity(@ByValue CGPoint location, @ByValue CGSize viewport,
            @ByValue CGPoint velocity);

    @Generated
    @Selector("frameNodes:")
    public native void frameNodes(NSArray<? extends SCNNode> nodes);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("inertiaEnabled")
    public native boolean inertiaEnabled();

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

    @Generated
    @Selector("minimumHorizontalAngle")
    public native float minimumHorizontalAngle();

    @Generated
    @Selector("minimumVerticalAngle")
    public native float minimumVerticalAngle();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("pointOfView")
    public native SCNNode pointOfView();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("rollAroundTarget:")
    public native void rollAroundTarget(float delta);

    @Generated
    @Selector("rollBy:aroundScreenPoint:viewport:")
    public native void rollByAroundScreenPointViewport(float delta, @ByValue CGPoint point, @ByValue CGSize viewport);

    @Generated
    @Selector("rotateByX:Y:")
    public native void rotateByXY(float deltaX, float deltaY);

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

    @Generated
    @Selector("setInertiaEnabled:")
    public native void setInertiaEnabled(boolean value);

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

    @Generated
    @Selector("setMinimumHorizontalAngle:")
    public native void setMinimumHorizontalAngle(float value);

    @Generated
    @Selector("setMinimumVerticalAngle:")
    public native void setMinimumVerticalAngle(float value);

    @Generated
    @Selector("setPointOfView:")
    public native void setPointOfView(SCNNode value);

    @Generated
    @Selector("setTarget:")
    public native void setTarget(@ByValue SCNVector3 value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("setWorldUp:")
    public native void setWorldUp(@ByValue SCNVector3 value);

    @Generated
    @Selector("stopInertia")
    public native void stopInertia();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("target")
    @ByValue
    public native SCNVector3 target();

    @Generated
    @Selector("translateInCameraSpaceByX:Y:Z:")
    public native void translateInCameraSpaceByXYZ(float deltaX, float deltaY, float deltaZ);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("worldUp")
    @ByValue
    public native SCNVector3 worldUp();
}