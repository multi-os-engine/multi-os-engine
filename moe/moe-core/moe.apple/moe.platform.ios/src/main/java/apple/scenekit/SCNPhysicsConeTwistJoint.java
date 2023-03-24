package apple.scenekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.scenekit.struct.SCNMatrix4;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * SCNPhysicsConeTwistJoint
 * 
 * API-Since: 11.0
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNPhysicsConeTwistJoint extends SCNPhysicsBehavior {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNPhysicsConeTwistJoint(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNPhysicsConeTwistJoint alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNPhysicsConeTwistJoint allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * the first body attached to the slider joint
     */
    @NotNull
    @Generated
    @Selector("bodyA")
    public native SCNPhysicsBody bodyA();

    /**
     * the second body attached to the slider joint
     */
    @Nullable
    @Generated
    @Selector("bodyB")
    public native SCNPhysicsBody bodyB();

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
    @Selector("frameA")
    @ByValue
    public native SCNMatrix4 frameA();

    @Generated
    @Selector("frameB")
    @ByValue
    public native SCNMatrix4 frameB();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SCNPhysicsConeTwistJoint init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNPhysicsConeTwistJoint initWithCoder(@NotNull NSCoder coder);

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

    /**
     * Initializes and returns a physics cone-twist joint.
     * The joint attaches "body" to the 3d location specified by "frame" and relative to the node that owns the body.
     */
    @Generated
    @Selector("jointWithBody:frame:")
    public static native SCNPhysicsConeTwistJoint jointWithBodyFrame(@NotNull SCNPhysicsBody body,
            @ByValue SCNMatrix4 frame);

    /**
     * Initializes and returns a physics cone-twist joint.
     * The joint attaches bodyA and bodyB on frameA and frameB respectively.
     */
    @Generated
    @Selector("jointWithBodyA:frameA:bodyB:frameB:")
    public static native SCNPhysicsConeTwistJoint jointWithBodyAFrameABodyBFrameB(@NotNull SCNPhysicsBody bodyA,
            @ByValue SCNMatrix4 frameA, @NotNull SCNPhysicsBody bodyB, @ByValue SCNMatrix4 frameB);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * The maximum angular limits in radians in each cone tangent directions
     */
    @Generated
    @Selector("maximumAngularLimit1")
    @NFloat
    public native double maximumAngularLimit1();

    @Generated
    @Selector("maximumAngularLimit2")
    @NFloat
    public native double maximumAngularLimit2();

    /**
     * Maximum twist angle alon the cone axis
     */
    @Generated
    @Selector("maximumTwistAngle")
    @NFloat
    public native double maximumTwistAngle();

    @Generated
    @Owned
    @Selector("new")
    public static native SCNPhysicsConeTwistJoint new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setFrameA:")
    public native void setFrameA(@ByValue SCNMatrix4 value);

    @Generated
    @Selector("setFrameB:")
    public native void setFrameB(@ByValue SCNMatrix4 value);

    /**
     * The maximum angular limits in radians in each cone tangent directions
     */
    @Generated
    @Selector("setMaximumAngularLimit1:")
    public native void setMaximumAngularLimit1(@NFloat double value);

    @Generated
    @Selector("setMaximumAngularLimit2:")
    public native void setMaximumAngularLimit2(@NFloat double value);

    /**
     * Maximum twist angle alon the cone axis
     */
    @Generated
    @Selector("setMaximumTwistAngle:")
    public native void setMaximumTwistAngle(@NFloat double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
