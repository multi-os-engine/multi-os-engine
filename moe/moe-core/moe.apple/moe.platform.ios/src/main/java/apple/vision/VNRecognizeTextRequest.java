package apple.vision;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSIndexSet;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.vision.protocol.VNRequestProgressProviding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A request that will detect regions of text and recognize the containing text in an image.
 * <p>
 * This request will generate VNRecognizedTextObservation objects describing the locations of text and the actual text recognized.
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNRecognizeTextRequest extends VNImageBasedRequest implements VNRequestProgressProviding {
    static {
        NatJ.register();
    }

    @Generated
    protected VNRecognizeTextRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNRecognizeTextRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNRecognizeTextRequest allocWithZone(VoidPtr zone);

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
    @Selector("currentRevision")
    @NUInt
    public static native long currentRevision();

    /**
     * An array of strings that will be used at the word recognition stage in addition to the recognition languages. The customWords list takes precedence over the standard lexicon.
     */
    @Generated
    @Selector("customWords")
    public native NSArray<String> customWords();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("defaultRevision")
    @NUInt
    public static native long defaultRevision();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("indeterminate")
    public native boolean indeterminate();

    @Generated
    @Selector("init")
    public native VNRecognizeTextRequest init();

    @Generated
    @Selector("initWithCompletionHandler:")
    public native VNRecognizeTextRequest initWithCompletionHandler(
            @ObjCBlock(name = "call_initWithCompletionHandler") VNRequest.Block_initWithCompletionHandler completionHandler);

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
     * Minimum height of the text expected to be recognized, relative to the image height (e.g. for half of the image height, use 0.5). Increasing the size will reduce the memory consumption and speed up the recognition with the trade-off that text smaller than the minimum height may not be recognized properly. If the minimum height is set to 0.0 the image gets processed at the highest possible resolution with no downscaling. With that the processing time will be the longest and the memory usage the highest but the smallest technically readable text will be recognized. The default value for this is 0.0.
     */
    @Generated
    @Selector("minimumTextHeight")
    public native float minimumTextHeight();

    @Generated
    @Owned
    @Selector("new")
    public static native VNRecognizeTextRequest new_objc();

    @Generated
    @Selector("progressHandler")
    @ObjCBlock(name = "call_progressHandler_ret")
    public native VNRequestProgressProviding.Block_progressHandler_ret progressHandler();

    /**
     * Specify the languages used for the detection. The order of the languages in the array defines the order in which languages will be used during the language processing.
     * The languages are specified as ISO language codes.
     */
    @Generated
    @Selector("recognitionLanguages")
    public native NSArray<String> recognitionLanguages();

    /**
     * The recognition level selects which techniques will be used during the text recognition. There are trade-offs between performance and accuracy.
     */
    @Generated
    @Selector("recognitionLevel")
    @NInt
    public native long recognitionLevel();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * An array of strings that will be used at the word recognition stage in addition to the recognition languages. The customWords list takes precedence over the standard lexicon.
     */
    @Generated
    @Selector("setCustomWords:")
    public native void setCustomWords(NSArray<String> value);

    /**
     * Minimum height of the text expected to be recognized, relative to the image height (e.g. for half of the image height, use 0.5). Increasing the size will reduce the memory consumption and speed up the recognition with the trade-off that text smaller than the minimum height may not be recognized properly. If the minimum height is set to 0.0 the image gets processed at the highest possible resolution with no downscaling. With that the processing time will be the longest and the memory usage the highest but the smallest technically readable text will be recognized. The default value for this is 0.0.
     */
    @Generated
    @Selector("setMinimumTextHeight:")
    public native void setMinimumTextHeight(float value);

    @Generated
    @Selector("setProgressHandler:")
    public native void setProgressHandler(
            @ObjCBlock(name = "call_setProgressHandler") VNRequestProgressProviding.Block_setProgressHandler value);

    /**
     * Specify the languages used for the detection. The order of the languages in the array defines the order in which languages will be used during the language processing.
     * The languages are specified as ISO language codes.
     */
    @Generated
    @Selector("setRecognitionLanguages:")
    public native void setRecognitionLanguages(NSArray<String> value);

    /**
     * The recognition level selects which techniques will be used during the text recognition. There are trade-offs between performance and accuracy.
     */
    @Generated
    @Selector("setRecognitionLevel:")
    public native void setRecognitionLevel(@NInt long value);

    /**
     * Determines whether language correction should be applied during the recognition process. Disabling this will return the raw recognition results providing performance benefits but less accurate results.
     */
    @Generated
    @Selector("setUsesLanguageCorrection:")
    public native void setUsesLanguageCorrection(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Returns all the supported languages for a given text recognition level. Note that a language supported in one recognition level might not be available in another.
     */
    @Generated
    @Selector("supportedRecognitionLanguagesForTextRecognitionLevel:revision:error:")
    public static native NSArray<String> supportedRecognitionLanguagesForTextRecognitionLevelRevisionError(
            @NInt long recognitionLevel, @NUInt long requestRevision,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("supportedRevisions")
    public static native NSIndexSet supportedRevisions();

    /**
     * Determines whether language correction should be applied during the recognition process. Disabling this will return the raw recognition results providing performance benefits but less accurate results.
     */
    @Generated
    @Selector("usesLanguageCorrection")
    public native boolean usesLanguageCorrection();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * VNRecognizedTextObservation results.
     */
    @Generated
    @Selector("results")
    public native NSArray<? extends VNRecognizedTextObservation> results();

    /**
     * Obtain the collection of supported recognition languages.
     * <p>
     * This method will return the collection of all possible language identifiers that are recognized by the target request based on its current state of configuration at the time of the call.
     *
     * @param error The address of the variable that will be populated with the error if the call fails.
     * @return The collection of language identifiers, or nil if a failure occurs.
     */
    @Generated
    @Selector("supportedRecognitionLanguagesAndReturnError:")
    public native NSArray<String> supportedRecognitionLanguagesAndReturnError(
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}
