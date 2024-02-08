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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * SCNAvoidOccluderConstraint
 * 
 * A SCNAvoidOccluderConstraint constraints place the receiver at a position that prevent nodes with the specified
 * category to occlude the target.
 * 
 * The target node and it's children are ignored as potential occluders.
 * 
 * API-Since: 11.0
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
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * avoidOccluderConstraintWithTarget
     * 
     * Creates and returns a SCNAvoidOccluderConstraint object.
     */
    @Generated
    @Selector("avoidOccluderConstraintWithTarget:")
    public static native SCNAvoidOccluderConstraint avoidOccluderConstraintWithTarget(@Nullable SCNNode target);

    /**
     * [@property] bias
     * 
     * Defines the bias the apply after moving the receiver to avoid occluders. Defaults to 10e-5.
     * 
     * A positive bias will move the receiver closer to the target.
     */
    @Generated
    @Selector("bias")
    @NFloat
    public native double bias();

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

    /**
     * [@property] delegate
     * 
     * The receiver's delegate
     */
    @NotNull
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
    public native SCNAvoidOccluderConstraint initWithCoder(@NotNull NSCoder coder);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native SCNAvoidOccluderConstraint new_objc();

    /**
     * [@property] occluderCategoryBitMask
     * 
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
     * 
     * Defines the bias the apply after moving the receiver to avoid occluders. Defaults to 10e-5.
     * 
     * A positive bias will move the receiver closer to the target.
     */
    @Generated
    @Selector("setBias:")
    public native void setBias(@NFloat double value);

    /**
     * [@property] delegate
     * 
     * The receiver's delegate
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @NotNull @Mapped(ObjCObjectMapper.class) SCNAvoidOccluderConstraintDelegate value);

    /**
     * [@property] delegate
     * 
     * The receiver's delegate
     */
    @Generated
    public void setDelegate(@NotNull @Mapped(ObjCObjectMapper.class) SCNAvoidOccluderConstraintDelegate value) {
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
     * 
     * Defines the category of node to consider as occluder. Defaults to 1.
     */
    @Generated
    @Selector("setOccluderCategoryBitMask:")
    public native void setOccluderCategoryBitMask(@NUInt long value);

    /**
     * [@property] target
     * 
     * Defines the target node
     */
    @Generated
    @Selector("setTarget:")
    public native void setTarget(@Nullable SCNNode value);

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
     * Defines the target node
     */
    @Nullable
    @Generated
    @Selector("target")
    public native SCNNode target();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
