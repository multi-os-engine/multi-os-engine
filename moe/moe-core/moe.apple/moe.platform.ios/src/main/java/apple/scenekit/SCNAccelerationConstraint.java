package apple.scenekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * SCNAccelerationConstraint
 * <p>
 * A SCNAccelerationConstraint caps the acceleration and velocity of a node
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNAccelerationConstraint extends SCNConstraint {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNAccelerationConstraint(Pointer peer) {
        super(peer);
    }

    /**
     * accelerationConstraint
     * <p>
     * Creates and returns a SCNAccelerationConstraint object.
     */
    @Generated
    @Selector("accelerationConstraint")
    public static native SCNAccelerationConstraint accelerationConstraint();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNAccelerationConstraint alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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

    /**
     * [@property] damping
     * <p>
     * Specifies the damping factor of the receiver. Optionally reduce the body's linear velocity each frame to simulate fluid/air friction. Value should be zero or greater. Defaults to 0.1. Animatable.
     */
    @Generated
    @Selector("damping")
    @NFloat
    public native double damping();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * [@property] decelerationDistance
     * <p>
     * Controls the distance at which the node should start decelerating. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("decelerationDistance")
    @NFloat
    public native double decelerationDistance();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SCNAccelerationConstraint init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNAccelerationConstraint initWithCoder(NSCoder coder);

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * [@property] maximumLinearAcceleration
     * <p>
     * Controls the maximum linear acceleration. Defaults to MAXFLOAT. Animatable.
     * <p>
     * The maximum linear acceleration is in m.s^-2
     */
    @Generated
    @Selector("maximumLinearAcceleration")
    @NFloat
    public native double maximumLinearAcceleration();

    /**
     * [@property] maximumLinearVelocity
     * <p>
     * Controls the maximum linear velocity. Defaults to MAXFLOAT. Animatable.
     * <p>
     * The maximum linear velocity is in m.s
     */
    @Generated
    @Selector("maximumLinearVelocity")
    @NFloat
    public native double maximumLinearVelocity();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] damping
     * <p>
     * Specifies the damping factor of the receiver. Optionally reduce the body's linear velocity each frame to simulate fluid/air friction. Value should be zero or greater. Defaults to 0.1. Animatable.
     */
    @Generated
    @Selector("setDamping:")
    public native void setDamping(@NFloat double value);

    /**
     * [@property] decelerationDistance
     * <p>
     * Controls the distance at which the node should start decelerating. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("setDecelerationDistance:")
    public native void setDecelerationDistance(@NFloat double value);

    /**
     * [@property] maximumLinearAcceleration
     * <p>
     * Controls the maximum linear acceleration. Defaults to MAXFLOAT. Animatable.
     * <p>
     * The maximum linear acceleration is in m.s^-2
     */
    @Generated
    @Selector("setMaximumLinearAcceleration:")
    public native void setMaximumLinearAcceleration(@NFloat double value);

    /**
     * [@property] maximumLinearVelocity
     * <p>
     * Controls the maximum linear velocity. Defaults to MAXFLOAT. Animatable.
     * <p>
     * The maximum linear velocity is in m.s
     */
    @Generated
    @Selector("setMaximumLinearVelocity:")
    public native void setMaximumLinearVelocity(@NFloat double value);

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
