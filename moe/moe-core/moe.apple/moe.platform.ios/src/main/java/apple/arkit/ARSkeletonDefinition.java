package apple.arkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
 * Definition of a skeleton.
 * <p>
 * A skeleton consists of a set of labeled joints that are defined in a certain hierarchy, i.e. joints are parented to other joints.
 * One may use the parentIndices property to identify the hierarchy for a given skeleton definition.
 */
@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ARSkeletonDefinition extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ARSkeletonDefinition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ARSkeletonDefinition alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ARSkeletonDefinition allocWithZone(VoidPtr zone);

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

    /**
     * Default skeleton definition for bodies defined in 2D.
     *
     * @see ARBody2D
     */
    @Generated
    @Selector("defaultBody2DSkeletonDefinition")
    public static native ARSkeletonDefinition defaultBody2DSkeletonDefinition();

    /**
     * Default skeleton definition for bodies defined in 3D.
     * [@note] The default height of this skeleton, measured from lowest to highest joint in standing position, is defined to be 1.71 meters.
     *
     * @see ARSkeleton3D
     */
    @Generated
    @Selector("defaultBody3DSkeletonDefinition")
    public static native ARSkeletonDefinition defaultBody3DSkeletonDefinition();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Returns the index for a given joint identifier.
     * <p>
     * This function returns NSNotFound if an invalid joint name is passed.
     *
     * @param jointName Name of a given joint.
     * @return Joint index.
     */
    @Generated
    @Selector("indexForJointName:")
    @NUInt
    public native long indexForJointName(String jointName);

    @Generated
    @Selector("init")
    public native ARSkeletonDefinition init();

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
     * The number of joints.
     */
    @Generated
    @Selector("jointCount")
    @NUInt
    public native long jointCount();

    /**
     * The joint names.
     */
    @Generated
    @Selector("jointNames")
    public native NSArray<String> jointNames();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * The 3D skeleton in neutral pose.
     * <p>
     * The neutral skeleton pose assumes a standardized size of the skeleton in meters. The neutral pose is defined as the skeleton's T-pose.
     */
    @Generated
    @Selector("neutralBodySkeleton3D")
    public native ARSkeleton3D neutralBodySkeleton3D();

    @Generated
    @Owned
    @Selector("new")
    public static native ARSkeletonDefinition new_objc();

    /**
     * The parent index for each joint.
     * <p>
     * This property may be used to identify the hierarchical dependency between joints. If a line is drawn for every joint and its parent joint
     * the result is a visualization of the underlying skeleton. The joint with no parent is denoted as the root joint. The root joint's parent index has
     * a value of -1.
     */
    @Generated
    @Selector("parentIndices")
    public native NSArray<? extends NSNumber> parentIndices();

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
}
