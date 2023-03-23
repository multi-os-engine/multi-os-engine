package apple.metalperformanceshaders;

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
 * virtual base class for basic arithmetic nodes
 * 
 * API-Since: 11.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNBinaryArithmeticNode extends MPSNNFilterNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNBinaryArithmeticNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNBinaryArithmeticNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNBinaryArithmeticNode allocWithZone(VoidPtr zone);

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
    public native MPSNNBinaryArithmeticNode init();

    /**
     * init an arithemtic node with two sources
     * 
     * @param left  the left operand
     * @param right the right operand
     */
    @Generated
    @Selector("initWithLeftSource:rightSource:")
    public native MPSNNBinaryArithmeticNode initWithLeftSourceRightSource(MPSNNImageNode left, MPSNNImageNode right);

    /**
     * init an arithemtic node with an array of sources
     * 
     * @param sourceNodes A valid NSArray containing two sources
     */
    @Generated
    @Selector("initWithSources:")
    public native MPSNNBinaryArithmeticNode initWithSources(NSArray<? extends MPSNNImageNode> sourceNodes);

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
    public static native MPSNNBinaryArithmeticNode new_objc();

    /**
     * create an autoreleased arithemtic node with two sources
     * 
     * @param left  the left operand
     * @param right the right operand
     */
    @Generated
    @Selector("nodeWithLeftSource:rightSource:")
    public static native MPSNNBinaryArithmeticNode nodeWithLeftSourceRightSource(MPSNNImageNode left,
            MPSNNImageNode right);

    /**
     * create an autoreleased arithemtic node with an array of sources
     * 
     * @param sourceNodes A valid NSArray containing two sources
     */
    @Generated
    @Selector("nodeWithSources:")
    public static native MPSNNBinaryArithmeticNode nodeWithSources(NSArray<? extends MPSNNImageNode> sourceNodes);

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

    @Generated
    @Selector("bias")
    public native float bias();

    @Generated
    @Selector("gradientClass")
    public native Class gradientClass();

    /**
     * create new arithmetic gradient nodes
     * 
     * Create two new arithmetic gradient nodes - one that computes the gradient for the primary
     * source image and one that computes the gradient for the secondary sourcefrom the inference pass.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("gradientFiltersWithSources:")
    public native NSArray<? extends MPSNNGradientFilterNode> gradientFiltersWithSources(
            NSArray<? extends MPSNNImageNode> gradientImages);

    @Generated
    @Selector("maximumValue")
    public native float maximumValue();

    @Generated
    @Selector("minimumValue")
    public native float minimumValue();

    @Generated
    @Selector("primaryScale")
    public native float primaryScale();

    @Generated
    @Selector("primaryStrideInFeatureChannels")
    @NUInt
    public native long primaryStrideInFeatureChannels();

    @Generated
    @Selector("primaryStrideInPixelsX")
    @NUInt
    public native long primaryStrideInPixelsX();

    @Generated
    @Selector("primaryStrideInPixelsY")
    @NUInt
    public native long primaryStrideInPixelsY();

    @Generated
    @Selector("secondaryScale")
    public native float secondaryScale();

    @Generated
    @Selector("secondaryStrideInFeatureChannels")
    @NUInt
    public native long secondaryStrideInFeatureChannels();

    @Generated
    @Selector("secondaryStrideInPixelsX")
    @NUInt
    public native long secondaryStrideInPixelsX();

    @Generated
    @Selector("secondaryStrideInPixelsY")
    @NUInt
    public native long secondaryStrideInPixelsY();

    @Generated
    @Selector("setBias:")
    public native void setBias(float value);

    @Generated
    @Selector("setMaximumValue:")
    public native void setMaximumValue(float value);

    @Generated
    @Selector("setMinimumValue:")
    public native void setMinimumValue(float value);

    @Generated
    @Selector("setPrimaryScale:")
    public native void setPrimaryScale(float value);

    @Generated
    @Selector("setPrimaryStrideInFeatureChannels:")
    public native void setPrimaryStrideInFeatureChannels(@NUInt long value);

    @Generated
    @Selector("setPrimaryStrideInPixelsX:")
    public native void setPrimaryStrideInPixelsX(@NUInt long value);

    @Generated
    @Selector("setPrimaryStrideInPixelsY:")
    public native void setPrimaryStrideInPixelsY(@NUInt long value);

    @Generated
    @Selector("setSecondaryScale:")
    public native void setSecondaryScale(float value);

    @Generated
    @Selector("setSecondaryStrideInFeatureChannels:")
    public native void setSecondaryStrideInFeatureChannels(@NUInt long value);

    @Generated
    @Selector("setSecondaryStrideInPixelsX:")
    public native void setSecondaryStrideInPixelsX(@NUInt long value);

    @Generated
    @Selector("setSecondaryStrideInPixelsY:")
    public native void setSecondaryStrideInPixelsY(@NUInt long value);
}
