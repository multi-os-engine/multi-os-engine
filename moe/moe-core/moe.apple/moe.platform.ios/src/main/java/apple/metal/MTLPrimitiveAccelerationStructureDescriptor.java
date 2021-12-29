package apple.metal;

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
 * Descriptor for a primitive acceleration structure
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLPrimitiveAccelerationStructureDescriptor extends MTLAccelerationStructureDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLPrimitiveAccelerationStructureDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLPrimitiveAccelerationStructureDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTLPrimitiveAccelerationStructureDescriptor allocWithZone(VoidPtr zone);

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
    @Selector("descriptor")
    public static native MTLPrimitiveAccelerationStructureDescriptor descriptor();

    /**
     * Array of geometry descriptors. If motionKeyframeCount is greater than one all geometryDescriptors
     * must be motion versions and have motionKeyframeCount of primitive buffers.
     */
    @Generated
    @Selector("geometryDescriptors")
    public native NSArray<? extends MTLAccelerationStructureGeometryDescriptor> geometryDescriptors();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTLPrimitiveAccelerationStructureDescriptor init();

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
    public static native MTLPrimitiveAccelerationStructureDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Array of geometry descriptors. If motionKeyframeCount is greater than one all geometryDescriptors
     * must be motion versions and have motionKeyframeCount of primitive buffers.
     */
    @Generated
    @Selector("setGeometryDescriptors:")
    public native void setGeometryDescriptors(NSArray<? extends MTLAccelerationStructureGeometryDescriptor> value);

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
     * Motion border mode describing what happens if acceleration structure is sampled after
     * motionEndTime. If not set defaults to MTLMotionBorderModeClamp.
     */
    @Generated
    @Selector("motionEndBorderMode")
    public native int motionEndBorderMode();

    /**
     * Motion end time of this geometry. If not set defaults to 1.0f.
     */
    @Generated
    @Selector("motionEndTime")
    public native float motionEndTime();

    /**
     * Motion keyframe count. Is 1 by default which means no motion.
     */
    @Generated
    @Selector("motionKeyframeCount")
    @NUInt
    public native long motionKeyframeCount();

    /**
     * Motion border mode describing what happens if acceleration structure is sampled before
     * motionStartTime. If not set defaults to MTLMotionBorderModeClamp.
     */
    @Generated
    @Selector("motionStartBorderMode")
    public native int motionStartBorderMode();

    /**
     * Motion start time of this geometry. If not set defaults to 0.0f.
     */
    @Generated
    @Selector("motionStartTime")
    public native float motionStartTime();

    /**
     * Motion border mode describing what happens if acceleration structure is sampled after
     * motionEndTime. If not set defaults to MTLMotionBorderModeClamp.
     */
    @Generated
    @Selector("setMotionEndBorderMode:")
    public native void setMotionEndBorderMode(int value);

    /**
     * Motion end time of this geometry. If not set defaults to 1.0f.
     */
    @Generated
    @Selector("setMotionEndTime:")
    public native void setMotionEndTime(float value);

    /**
     * Motion keyframe count. Is 1 by default which means no motion.
     */
    @Generated
    @Selector("setMotionKeyframeCount:")
    public native void setMotionKeyframeCount(@NUInt long value);

    /**
     * Motion border mode describing what happens if acceleration structure is sampled before
     * motionStartTime. If not set defaults to MTLMotionBorderModeClamp.
     */
    @Generated
    @Selector("setMotionStartBorderMode:")
    public native void setMotionStartBorderMode(int value);

    /**
     * Motion start time of this geometry. If not set defaults to 0.0f.
     */
    @Generated
    @Selector("setMotionStartTime:")
    public native void setMotionStartTime(float value);
}
