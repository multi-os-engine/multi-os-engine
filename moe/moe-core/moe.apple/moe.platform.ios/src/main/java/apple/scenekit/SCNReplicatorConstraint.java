package apple.scenekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.scenekit.struct.SCNVector3;
import apple.scenekit.struct.SCNVector4;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * SCNReplicatorConstraint
 * 
 * A SCNReplicatorConstraint replicates the position/orientation/scale of a target node
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNReplicatorConstraint extends SCNConstraint {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNReplicatorConstraint(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNReplicatorConstraint alloc();

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
    public native SCNReplicatorConstraint init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNReplicatorConstraint initWithCoder(NSCoder coder);

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

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * [@property] orientationOffset
     * 
     * Defines an addition orientation offset. Defaults to no offset. Animatable.
     */
    @Generated
    @Selector("orientationOffset")
    @ByValue
    public native SCNVector4 orientationOffset();

    /**
     * [@property] positionOffset
     * 
     * Defines an addition orientation offset. Defaults to no offset. Animatable.
     */
    @Generated
    @Selector("positionOffset")
    @ByValue
    public native SCNVector3 positionOffset();

    /**
     * [@property] replicatesOrientation
     * 
     * Defines whether or not the constraint should replicate the target orientation. Defaults to YES.
     */
    @Generated
    @Selector("replicatesOrientation")
    public native boolean replicatesOrientation();

    /**
     * [@property] replicatesPosition
     * 
     * Defines whether or not the constraint should replicate the target position. Defaults to YES.
     */
    @Generated
    @Selector("replicatesPosition")
    public native boolean replicatesPosition();

    /**
     * [@property] replicatesScale
     * 
     * Defines whether or not the constraint should replicate the target scale. Defaults to YES.
     */
    @Generated
    @Selector("replicatesScale")
    public native boolean replicatesScale();

    /**
     * replicatorWithTargetNode
     * 
     * Creates and returns a SCNReplicatorConstraint constraint.
     */
    @Generated
    @Selector("replicatorConstraintWithTarget:")
    public static native SCNReplicatorConstraint replicatorConstraintWithTarget(SCNNode target);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] scaleOffset
     * 
     * Defines an addition scale offset. Defaults to no offset. Animatable.
     */
    @Generated
    @Selector("scaleOffset")
    @ByValue
    public native SCNVector3 scaleOffset();

    /**
     * [@property] orientationOffset
     * 
     * Defines an addition orientation offset. Defaults to no offset. Animatable.
     */
    @Generated
    @Selector("setOrientationOffset:")
    public native void setOrientationOffset(@ByValue SCNVector4 value);

    /**
     * [@property] positionOffset
     * 
     * Defines an addition orientation offset. Defaults to no offset. Animatable.
     */
    @Generated
    @Selector("setPositionOffset:")
    public native void setPositionOffset(@ByValue SCNVector3 value);

    /**
     * [@property] replicatesOrientation
     * 
     * Defines whether or not the constraint should replicate the target orientation. Defaults to YES.
     */
    @Generated
    @Selector("setReplicatesOrientation:")
    public native void setReplicatesOrientation(boolean value);

    /**
     * [@property] replicatesPosition
     * 
     * Defines whether or not the constraint should replicate the target position. Defaults to YES.
     */
    @Generated
    @Selector("setReplicatesPosition:")
    public native void setReplicatesPosition(boolean value);

    /**
     * [@property] replicatesScale
     * 
     * Defines whether or not the constraint should replicate the target scale. Defaults to YES.
     */
    @Generated
    @Selector("setReplicatesScale:")
    public native void setReplicatesScale(boolean value);

    /**
     * [@property] scaleOffset
     * 
     * Defines an addition scale offset. Defaults to no offset. Animatable.
     */
    @Generated
    @Selector("setScaleOffset:")
    public native void setScaleOffset(@ByValue SCNVector3 value);

    /**
     * [@property] target
     * 
     * Defines the target node to replicate
     */
    @Generated
    @Selector("setTarget:")
    public native void setTarget(SCNNode value);

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

    /**
     * [@property] target
     * 
     * Defines the target node to replicate
     */
    @Generated
    @Selector("target")
    public native SCNNode target();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}