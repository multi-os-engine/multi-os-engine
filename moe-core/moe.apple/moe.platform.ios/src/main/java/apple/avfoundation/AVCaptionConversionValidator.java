package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVCaptionConversionValidator
 * 
 * Performs a validation of captions for a conversion operation and warns about problems that are encountered.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptionConversionValidator extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptionConversionValidator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptionConversionValidator alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCaptionConversionValidator allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    /**
     * captionConversionValidatorWithCaptions:startTime:conversionSettings:
     * 
     * Returns an instance of AVCaptionConversionValidator that can validate an array of captions for a specific
     * conversion operation and warn about problems that are encountered.
     * 
     * This method throws an exception if the conversion setting's AVCaptionMediaTypeKey is not equal to
     * AVMediaTypeClosedCaption, or if its AVCaptionMediaSubTypeKey is not equal to kCMClosedCaptionFormatType_CEA608.
     * 
     * API-Since: 18.0
     * 
     * @param captions
     *                           The array of captions to be validated.
     * @param timeRange
     *                           The timeRange of the media timeline into which the specified captions must be
     *                           integrated. See the timeRange property for further details.
     * @param conversionSettings
     *                           Describes the conversion operation for which the captions are to be validated.
     * @return A new instance of AVCaptionConversionValidator configured to perform the specified validation.
     */
    @Generated
    @Selector("captionConversionValidatorWithCaptions:timeRange:conversionSettings:")
    public static native AVCaptionConversionValidator captionConversionValidatorWithCaptionsTimeRangeConversionSettings(
            @NotNull NSArray<? extends AVCaption> captions, @ByValue CMTimeRange timeRange,
            @NotNull NSDictionary<String, ?> conversionSettings);

    /**
     * [@property] captions
     * 
     * The array of captions to be validated for the specified conversion operation.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("captions")
    @NotNull
    public native NSArray<? extends AVCaption> captions();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
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
    public native AVCaptionConversionValidator init();

    /**
     * initWithCaptions:startTime:conversionSettings:
     * 
     * Returns an instance of AVCaptionConversionValidator that can validate an array of captions for a specific
     * conversion operation and warn about problems that are encountered.
     * 
     * @param captions
     *                           The array of captions for which the validation is requested.
     * @param timeRange
     *                           The timeRange of the media timeline into which the specified captions must be
     *                           integrated. See the timeRange property for further details.
     * @param conversionSettings
     *                           Describes the conversion operation for which the captions are to be validated.
     * @return A new instance of AVCaptionConversionValidator configured to perform the specified validation.
     * 
     *         API-Since: 18.0
     */
    @Generated
    @Selector("initWithCaptions:timeRange:conversionSettings:")
    public native AVCaptionConversionValidator initWithCaptionsTimeRangeConversionSettings(
            @NotNull NSArray<? extends AVCaption> captions, @ByValue CMTimeRange timeRange,
            @NotNull NSDictionary<String, ?> conversionSettings);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVCaptionConversionValidator new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] status
     * 
     * Indicates the status of the validation.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("status")
    @NInt
    public native long status();

    /**
     * stopValidating
     * 
     * Stops validation and changes the value of status to AVCaptionConversionValidatorStatusStopped.
     * 
     * You can call this method at any time, even within your warning handler.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("stopValidating")
    public native void stopValidating();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] timeRange
     * 
     * The timeRange of the media timeline into which the specified captions must be integrated.
     * 
     * The start of this timeRange may be less than the start of the timeRange of the initial caption in the captions
     * array, if the captions are to appear only after the start of accompanying video or audio. If no definite duration
     * for the media timeline is known, the timeRange can have a duration of kCMTimePositiveInfinity. However, in order
     * to perform a comprehensive validation of a conversion to closed captions, setting the duration of the timeRange
     * to the duration of accompanying video media is recommended.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("timeRange")
    @ByValue
    public native CMTimeRange timeRange();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * validateCaptionConversionWithWarningHandler:
     * 
     * Initiates the specified validation and changes the value of status to
     * AVCaptionConversionValidatorStatusValidating.
     * 
     * It is an error to invoke this method when the value of status is greater than
     * AVCaptionConversionValidatorStatusUnknown.
     * If you wish to stop a validation operation in progress before it has been completed, send the message
     * stopValidating to the receiver.
     * When the validation is complete and all warnings have been reported, the block will be executed once with a value
     * of nil for its warning parameter. When this occurs, the value of status will have been changed to
     * AVCaptionConversionValidatorStatusCompleted.
     * 
     * API-Since: 18.0
     * 
     * @param handler
     *                Specifies a block to be executed in order to warn you of a specific problem.
     */
    @Generated
    @Selector("validateCaptionConversionWithWarningHandler:")
    public native void validateCaptionConversionWithWarningHandler(
            @ObjCBlock(name = "call_validateCaptionConversionWithWarningHandler") @NotNull Block_validateCaptionConversionWithWarningHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_validateCaptionConversionWithWarningHandler {
        @Generated
        void call_validateCaptionConversionWithWarningHandler(@Nullable AVCaptionConversionWarning warning);
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] warnings
     * 
     * Provides the collection of warnings for problems that have been encountered. While the value of status is
     * AVCaptionConversionValidatorStatusValidating, the count of warnings may increase.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("warnings")
    @NotNull
    public native NSArray<? extends AVCaptionConversionWarning> warnings();
}