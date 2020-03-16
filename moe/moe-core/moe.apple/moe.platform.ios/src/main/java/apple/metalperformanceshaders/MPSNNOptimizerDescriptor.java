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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNOptimizerDescriptor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNOptimizerDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNOptimizerDescriptor alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("applyGradientClipping")
    public native boolean applyGradientClipping();

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
    @Selector("gradientClipMax")
    public native float gradientClipMax();

    @Generated
    @Selector("gradientClipMin")
    public native float gradientClipMin();

    @Generated
    @Selector("gradientRescale")
    public native float gradientRescale();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNNOptimizerDescriptor init();

    @Generated
    @Selector("initWithLearningRate:gradientRescale:applyGradientClipping:gradientClipMax:gradientClipMin:regularizationType:regularizationScale:")
    public native MPSNNOptimizerDescriptor initWithLearningRateGradientRescaleApplyGradientClippingGradientClipMaxGradientClipMinRegularizationTypeRegularizationScale(
            float learningRate, float gradientRescale, boolean applyGradientClipping, float gradientClipMax,
            float gradientClipMin, @NUInt long regularizationType, float regularizationScale);

    @Generated
    @Selector("initWithLearningRate:gradientRescale:regularizationType:regularizationScale:")
    public native MPSNNOptimizerDescriptor initWithLearningRateGradientRescaleRegularizationTypeRegularizationScale(
            float learningRate, float gradientRescale, @NUInt long regularizationType, float regularizationScale);

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
    @Selector("learningRate")
    public native float learningRate();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("optimizerDescriptorWithLearningRate:gradientRescale:applyGradientClipping:gradientClipMax:gradientClipMin:regularizationType:regularizationScale:")
    public static native MPSNNOptimizerDescriptor optimizerDescriptorWithLearningRateGradientRescaleApplyGradientClippingGradientClipMaxGradientClipMinRegularizationTypeRegularizationScale(
            float learningRate, float gradientRescale, boolean applyGradientClipping, float gradientClipMax,
            float gradientClipMin, @NUInt long regularizationType, float regularizationScale);

    @Generated
    @Selector("optimizerDescriptorWithLearningRate:gradientRescale:regularizationType:regularizationScale:")
    public static native MPSNNOptimizerDescriptor optimizerDescriptorWithLearningRateGradientRescaleRegularizationTypeRegularizationScale(
            float learningRate, float gradientRescale, @NUInt long regularizationType, float regularizationScale);

    @Generated
    @Selector("regularizationScale")
    public native float regularizationScale();

    @Generated
    @Selector("regularizationType")
    @NUInt
    public native long regularizationType();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setApplyGradientClipping:")
    public native void setApplyGradientClipping(boolean value);

    @Generated
    @Selector("setGradientClipMax:")
    public native void setGradientClipMax(float value);

    @Generated
    @Selector("setGradientClipMin:")
    public native void setGradientClipMin(float value);

    @Generated
    @Selector("setGradientRescale:")
    public native void setGradientRescale(float value);

    @Generated
    @Selector("setLearningRate:")
    public native void setLearningRate(float value);

    @Generated
    @Selector("setRegularizationScale:")
    public native void setRegularizationScale(float value);

    @Generated
    @Selector("setRegularizationType:")
    public native void setRegularizationType(@NUInt long value);

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