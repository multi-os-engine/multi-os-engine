package apple.soundanalysis;

import apple.NSObject;
import apple.coreml.MLModel;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.soundanalysis.protocol.SNRequest;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @brief Configure an analyzer to perform sound classification using the provided MLModel.
 * @discussion When a new classification result is produced, the results observer will be called with an SNClassificationResult. Audio buffers provided to SNAudioStreamAnalyzer may vary in size, and the analyzer will reblock the audio data to the block size expected by the MLModel. By default, analysis will occur on the first audio channel in the audio stream, and the analyzer will apply sample rate conversion if the provided audio does not match the sample rate required by the MLModel.
 */
@Generated
@Library("SoundAnalysis")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SNClassifySoundRequest extends NSObject implements SNRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected SNClassifySoundRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SNClassifySoundRequest alloc();

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
    public native SNClassifySoundRequest init();

    /**
     * @brief Initializes a sound classification request with the provided MLModel
     * @param mlModel The CoreML audio classification model to be used with this request
     * @discussion The provided model must accept audio data as input, and output a classification dictionary containing the probability of each category.
     */
    @Generated
    @Selector("initWithMLModel:error:")
    public native SNClassifySoundRequest initWithMLModelError(MLModel mlModel,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
     * @brief The overlap factor of the windows of audio data provided to the classifier, if the model operates on fixed audio block sizes.
     * @discussion When performing audio analysis on fixed audio block sizes, it is common for the analysis windows to overlap by some factor. Without overlapping the analysis windows (when the overlap factor is 0.0), a sound might be split across two analysis windows, which could negatively affect classification performance. Overlapping the analysis windows by 50% ensures each sound will fall near the center of at least one analysis window. The supported range is [0.0, 1.0), and the default value is 0.5. Increasing the overlap factor increases computational complexity, so values greater than 0.5 should be used with care.
     */
    @Generated
    @Selector("overlapFactor")
    public native double overlapFactor();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * @brief The overlap factor of the windows of audio data provided to the classifier, if the model operates on fixed audio block sizes.
     * @discussion When performing audio analysis on fixed audio block sizes, it is common for the analysis windows to overlap by some factor. Without overlapping the analysis windows (when the overlap factor is 0.0), a sound might be split across two analysis windows, which could negatively affect classification performance. Overlapping the analysis windows by 50% ensures each sound will fall near the center of at least one analysis window. The supported range is [0.0, 1.0), and the default value is 0.5. Increasing the overlap factor increases computational complexity, so values greater than 0.5 should be used with care.
     */
    @Generated
    @Selector("setOverlapFactor:")
    public native void setOverlapFactor(double value);

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