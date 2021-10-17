package apple.soundanalysis;

import apple.NSObject;
import apple.coremedia.struct.CMTime;
import apple.coreml.MLModel;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.soundanalysis.protocol.SNRequest;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
 * Configure an analyzer to perform sound classification using the provided MLModel.
 * <p>
 * When a new classification result is produced, the results observer will be called with an SNClassificationResult. Audio buffers provided to SNAudioStreamAnalyzer may vary in size, and the analyzer will reblock the audio data to the block size expected by the MLModel. By default, analysis will occur on the first audio channel in the audio stream, and the analyzer will apply sample rate conversion if the provided audio does not match the sample rate required by the MLModel.
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
    public static native SNClassifySoundRequest allocWithZone(VoidPtr zone);

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
     * Initializes a sound classification request with the provided MLModel
     * <p>
     * The provided model must accept audio data as input, and output a classification dictionary containing the probability of each category.
     *
     * @param mlModel The CoreML audio classification model to be used with this request
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
    public static native SNClassifySoundRequest new_objc();

    /**
     * The overlap factor of the windows of audio data provided to the classifier, if the model operates on fixed audio block sizes.
     * <p>
     * When performing audio analysis on fixed audio block sizes, it is common for the analysis windows to overlap by some factor. Without overlapping the analysis windows (when the overlap factor is 0.0), a sound might be split across two analysis windows, which could negatively affect classification performance. Overlapping the analysis windows by 50% ensures each sound will fall near the center of at least one analysis window. The supported range is [0.0, 1.0), and the default value is 0.5. Increasing the overlap factor increases computational complexity, so values greater than 0.5 should be used with care.
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
     * The overlap factor of the windows of audio data provided to the classifier, if the model operates on fixed audio block sizes.
     * <p>
     * When performing audio analysis on fixed audio block sizes, it is common for the analysis windows to overlap by some factor. Without overlapping the analysis windows (when the overlap factor is 0.0), a sound might be split across two analysis windows, which could negatively affect classification performance. Overlapping the analysis windows by 50% ensures each sound will fall near the center of at least one analysis window. The supported range is [0.0, 1.0), and the default value is 0.5. Increasing the overlap factor increases computational complexity, so values greater than 0.5 should be used with care.
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

    /**
     * Initializes a sound classification request with a known classifier.
     * <p>
     * This initializer may be used to classify sounds using Apple-provided sound classifiers. Note that Apple may add new classifiers in the future, but it commits to ensuring the consistent performance of existing classifiers.
     *
     * @param classifierIdentifier An identifier identifying the particular classifier to use for labeling sounds.
     * @param error                An output parameter which, in the case of an error, will be populated with details about that error. Upon success, the contents of this output parameter are undefined. Please use the return value of this method to determine whether or not an error occurred before using the value assigned to this output parameter.
     * @return Upon failure, `nil`; upon success, an `SNClassifySoundRequest` instance which can be added to an analyzer to classify sounds using a recognized classifier.
     */
    @Generated
    @Selector("initWithClassifierIdentifier:error:")
    public native SNClassifySoundRequest initWithClassifierIdentifierError(String classifierIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Lists all labels that can be produced by this request.
     *
     * @return An array of strings containing all sound identifiers which can be produced by this request.
     */
    @Generated
    @Selector("knownClassifications")
    public native NSArray<String> knownClassifications();

    /**
     * The duration of a single analysis window.
     * <p>
     * When performing classification over an audio stream, a classifier computes each classification result based on a single 'analysis window' of audio. Analysis windows are uniformly-sized time intervals, where the size of any given window is considered that window's 'duration'. Some classifiers can operate over analysis windows which conform to one of several different duration options. Larger window durations allow classification to execute less frequently over larger contexts of audio, potentially improving classification performance. Smaller window durations allow classification to execute more frequently over smaller contexts of audio, producing results with sharper time resolution. Depending on the use-case, a larger or smaller window may be preferrable. When configuring the window duration, it is important to respect the capabilities of the classifier. A classifier's supported window durations can be discovered using the `windowDurationConstraint` property. If an unsupported window duration is selected, the window duration will be automatically rounded down to the nearest supported value if possible, else rounded up.
     */
    @Generated
    @Selector("setWindowDuration:")
    public native void setWindowDuration(@ByValue CMTime value);

    /**
     * The duration of a single analysis window.
     * <p>
     * When performing classification over an audio stream, a classifier computes each classification result based on a single 'analysis window' of audio. Analysis windows are uniformly-sized time intervals, where the size of any given window is considered that window's 'duration'. Some classifiers can operate over analysis windows which conform to one of several different duration options. Larger window durations allow classification to execute less frequently over larger contexts of audio, potentially improving classification performance. Smaller window durations allow classification to execute more frequently over smaller contexts of audio, producing results with sharper time resolution. Depending on the use-case, a larger or smaller window may be preferrable. When configuring the window duration, it is important to respect the capabilities of the classifier. A classifier's supported window durations can be discovered using the `windowDurationConstraint` property. If an unsupported window duration is selected, the window duration will be automatically rounded down to the nearest supported value if possible, else rounded up.
     */
    @Generated
    @Selector("windowDuration")
    @ByValue
    public native CMTime windowDuration();

    /**
     * The constraints governing permitted analysis window durations.
     * <p>
     * The analysis window duration is controlled using the `windowDuration` property. If an analysis window duration is selected which does not meet the necessary constraints, it will automatically be adjusted to meet these constraints (see `windowDuration` for more information regarding how this adjustment will be applied).
     */
    @Generated
    @Selector("windowDurationConstraint")
    public native SNTimeDurationConstraint windowDurationConstraint();
}
