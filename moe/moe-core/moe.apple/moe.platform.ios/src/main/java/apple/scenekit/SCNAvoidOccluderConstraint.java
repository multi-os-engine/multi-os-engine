package apple.scenekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.scenekit.protocol.SCNAvoidOccluderConstraintDelegate;
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
 * SCNAvoidOccluderConstraint
 * <p>
 * A SCNAvoidOccluderConstraint constraints place the receiver at a position that prevent nodes with the specified
 * category to occlude the target.
 * <p>
 * The target node and it's children are ignored as potential occluders.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNAvoidOccluderConstraint extends SCNConstraint {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNAvoidOccluderConstraint(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNAvoidOccluderConstraint alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNAvoidOccluderConstraint allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * avoidOccluderConstraintWithTarget
     * <p>
     * Creates and returns a SCNAvoidOccluderConstraint object.
     */
    @Generated
    @Selector("avoidOccluderConstraintWithTarget:")
    public static native SCNAvoidOccluderConstraint avoidOccluderConstraintWithTarget(SCNNode target);

    /**
     * [@property] bias
     * <p>
     * Defines the bias the apply after moving the receiver to avoid occluders. Defaults to 10e-5.
     * <p>
     * A positive bias will move the receiver closer to the target.
     */
    @Generated
    @Selector("bias")
    @NFloat
    public native double bias();

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

    /**
     * [@property] delegate
     * <p>
     * The receiver's delegate
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native SCNAvoidOccluderConstraintDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SCNAvoidOccluderConstraint init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNAvoidOccluderConstraint initWithCoder(NSCoder coder);

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
    public static native SCNAvoidOccluderConstraint new_objc();

    /**
     * [@property] occluderCategoryBitMask
     * <p>
     * Defines the category of node to consider as occluder. Defaults to 1.
     */
    @Generated
    @Selector("occluderCategoryBitMask")
    @NUInt
    public native long occluderCategoryBitMask();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] bias
     * <p>
     * Defines the bias the apply after moving the receiver to avoid occluders. Defaults to 10e-5.
     * <p>
     * A positive bias will move the receiver closer to the target.
     */
    @Generated
    @Selector("setBias:")
    public native void setBias(@NFloat double value);

    /**
     * [@property] delegate
     * <p>
     * The receiver's delegate
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) SCNAvoidOccluderConstraintDelegate value);

    /**
     * [@property] delegate
     * <p>
     * The receiver's delegate
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) SCNAvoidOccluderConstraintDelegate value) {
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
     * [@property] occluderCategoryBitMask
     * <p>
     * Defines the category of node to consider as occluder. Defaults to 1.
     */
    @Generated
    @Selector("setOccluderCategoryBitMask:")
    public native void setOccluderCategoryBitMask(@NUInt long value);

    /**
     * [@property] target
     * <p>
     * Defines the target node
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
     * <p>
     * Defines the target node
     */
    @Generated
    @Selector("target")
    public native SCNNode target();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
