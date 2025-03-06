package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVCaptionFormatConformer
 * 
 * Performs a conversion of canonical caption to conform to a specific format.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptionFormatConformer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptionFormatConformer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptionFormatConformer alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCaptionFormatConformer allocWithZone(VoidPtr zone);

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
     * captionFormatConformerWithConversionSettings:conversionSettings:
     * 
     * Returns an instance of AVCaptionFormatConformer that can convert a canonical caption to conform to a specific
     * format.
     * 
     * @param conversionSettings
     *                           Describes the conversion operation for which the caption is to be conformed.
     * @return A new instance of AVCaptionFormatConformer configured to perform the specified conversion.
     * 
     *         API-Since: 18.0
     */
    @Generated
    @Selector("captionFormatConformerWithConversionSettings:")
    public static native AVCaptionFormatConformer captionFormatConformerWithConversionSettings(
            @NotNull NSDictionary<String, ?> conversionSettings);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    /**
     * conformedCaptionForCaption:error:
     * 
     * Creates a format-compliant caption that conforms to a specific format by converting a given canonical caption.
     * 
     * @param caption
     *                 Specifies a canonical caption to be converted.
     * @param outError
     *                 A pointer where a NSError object may be returned.
     * @return A format-compliant caption that conforms to a specific format.
     * 
     *         API-Since: 18.0
     */
    @Generated
    @Selector("conformedCaptionForCaption:error:")
    @Nullable
    public native AVCaption conformedCaptionForCaptionError(@NotNull AVCaption caption,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> outError);

    /**
     * [@property] conformsCaptionsToTimeRange
     * 
     * Specifies whether to conform the time range of a given canonical caption as well.
     * 
     * When set to YES, conforms time range.
     * When set to NO, the time range of the conformed caption will be same as a given canonical caption.
     * In the case of conforming to CAE608 format, AVCaption is encoded so that each CAE608 control code (2 bytes) fits
     * into 1 frame duration (1001/30000).
     * When set to YES and if all the encoded data can not fit inside the canonical caption time range, the caption time
     * range will be extended to fit all the data and will be returned in the conformed AVCaption.
     * The default value is NO.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("conformsCaptionsToTimeRange")
    public native boolean conformsCaptionsToTimeRange();

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
    public native AVCaptionFormatConformer init();

    /**
     * initWithConversionSettings:conversionSettings:
     * 
     * Returns an instance of AVCaptionFormatConformer that can convert a canonical caption to conform to a specific
     * format.
     * 
     * This method throws an exception if the conversion setting's AVCaptionMediaTypeKey is not equal to
     * AVMediaTypeClosedCaption, or if its AVCaptionMediaSubTypeKey is not equal to kCMClosedCaptionFormatType_CEA608.
     * 
     * API-Since: 18.0
     * 
     * @param conversionSettings
     *                           Describes the conversion operation for which the caption is to be conformed.
     * @return A new instance of AVCaptionFormatConformer configured to perform the specified conversion.
     */
    @Generated
    @Selector("initWithConversionSettings:")
    public native AVCaptionFormatConformer initWithConversionSettings(
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
    public static native AVCaptionFormatConformer new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] conformsCaptionsToTimeRange
     * 
     * Specifies whether to conform the time range of a given canonical caption as well.
     * 
     * When set to YES, conforms time range.
     * When set to NO, the time range of the conformed caption will be same as a given canonical caption.
     * In the case of conforming to CAE608 format, AVCaption is encoded so that each CAE608 control code (2 bytes) fits
     * into 1 frame duration (1001/30000).
     * When set to YES and if all the encoded data can not fit inside the canonical caption time range, the caption time
     * range will be extended to fit all the data and will be returned in the conformed AVCaption.
     * The default value is NO.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setConformsCaptionsToTimeRange:")
    public native void setConformsCaptionsToTimeRange(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}