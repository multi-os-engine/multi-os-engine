package apple.coreimage;

import apple.NSObject;
import apple.coreimage.protocol.CIFilterConstructor;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;

/**
 * API-Since: 15.0
 */
@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIRAWFilter extends CIFilter {
    static {
        NatJ.register();
    }

    @Generated
    protected CIRAWFilter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIRAWFilter alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CIRAWFilter allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * A value for baseline exposure applied to the image. Default value can vary based on the image.
     */
    @Generated
    @Selector("baselineExposure")
    public native float baselineExposure();

    /**
     * A value to control the amount of global tone curve to apply to the image.
     * A value of 0 indicates no global tone curve, i.e. linear response.
     * A value of 1 indicates full global tone curve.
     * The value should be the range of 0...1. The default value is 1.
     */
    @Generated
    @Selector("boostAmount")
    public native float boostAmount();

    /**
     * The amount to boost the shadow areas of the image. Can be used to lighten details in shadows. This has no effect
     * if the boostAmount is 0.
     * A value less than 1 will darken the shadows. A value greater than 1 will lighten the shadows.
     * The value should be the range of 0...2. The default value is 1.
     */
    @Generated
    @Selector("boostShadowAmount")
    public native float boostShadowAmount();

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
    @Selector("colorNoiseReductionAmount")
    public native float colorNoiseReductionAmount();

    @Generated
    @Selector("contrastAmount")
    public native float contrastAmount();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Version string representing the decoder version to be used. A newly initialized object defaults to the newest
     * available decoder version for the given image type. User can request an alternative, older version in order to
     * maintain compatibility with older releases. Must be one of supportedDecoderVersions (above), otherwise a nil
     * output image will be generated.
     */
    @Generated
    @Selector("decoderVersion")
    public native String decoderVersion();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("detailAmount")
    public native float detailAmount();

    /**
     * A value controlling the amount of exposure to apply to the image. Default value is 0.
     */
    @Generated
    @Selector("exposure")
    public native float exposure();

    /**
     * Allows the output to have an Extended Dynamic Range with values greater than 1 possible.
     * A value of 0 indicates no extended dynamic range output.
     * A value of 1 indicates default extended dynamic range output.
     * A value of 2 indicates maximum extended dynamic range output.
     * The value should be the range of 0...2. The default value is 0.
     */
    @Generated
    @Selector("extendedDynamicRangeAmount")
    public native float extendedDynamicRangeAmount();

    @Generated
    @Selector("filterArrayFromSerializedXMP:inputImageExtent:error:")
    public static native NSArray<? extends CIFilter> filterArrayFromSerializedXMPInputImageExtentError(NSData xmpData,
            @ByValue CGRect extent, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("filterNamesInCategories:")
    public static native NSArray<String> filterNamesInCategories(NSArray<String> categories);

    @Generated
    @Selector("filterNamesInCategory:")
    public static native NSArray<String> filterNamesInCategory(String category);

    @Generated
    @Selector("filterWithCVPixelBuffer:properties:")
    public static native CIRAWFilter filterWithCVPixelBufferProperties(CVBufferRef buffer,
            NSDictionary<?, ?> properties);

    @Deprecated
    @Generated
    @Selector("filterWithCVPixelBuffer:properties:options:")
    public static native CIFilter filterWithCVPixelBufferPropertiesOptions(CVBufferRef pixelBuffer,
            NSDictionary<?, ?> properties, NSDictionary<String, ?> options);

    @Generated
    @Selector("filterWithImageData:identifierHint:")
    public static native CIRAWFilter filterWithImageDataIdentifierHint(NSData data, String identifierHint);

    @Deprecated
    @Generated
    @Selector("filterWithImageData:options:")
    public static native CIFilter filterWithImageDataOptions(NSData data, NSDictionary<String, ?> options);

    @Generated
    @Selector("filterWithImageURL:")
    public static native CIRAWFilter filterWithImageURL(NSURL url);

    @Deprecated
    @Generated
    @Selector("filterWithImageURL:options:")
    public static native CIFilter filterWithImageURLOptions(NSURL url, NSDictionary<String, ?> options);

    @Generated
    @Selector("filterWithName:")
    public static native CIFilter filterWithName(String name);

    @Generated
    @Variadic()
    @Selector("filterWithName:keysAndValues:")
    public static native CIFilter filterWithNameKeysAndValues(String name, @Mapped(ObjCObjectMapper.class) Object key0,
            Object... varargs);

    @Generated
    @Selector("filterWithName:withInputParameters:")
    public static native CIFilter filterWithNameWithInputParameters(String name, NSDictionary<String, ?> params);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CIRAWFilter init();

    @Generated
    @Selector("initWithCoder:")
    public native CIRAWFilter initWithCoder(NSCoder coder);

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

    /**
     * A value to control the amount of chroma noise reduction to apply to the image.
     * A value of 0 indicates no chroma noise reduction.
     * A value of 1 indicates maximum chroma noise reduction.
     * The value should be the range of 0...1. The default value will vary per image.
     * The 'isColorNoiseReductionSupported' property is false if the current image doesn't support this adjustment.
     */
    @Generated
    @Selector("isColorNoiseReductionSupported")
    public native boolean isColorNoiseReductionSupported();

    /**
     * A value to control the amount of local contrast to apply to the edges of the image.
     * A value of 0 indicates no contrast applied.
     * A value of 1 indicates maximum contrast applied.
     * The value should be the range of 0...1. The default value will vary per image.
     * The 'isContrastSupported' property is false if the current image doesn't support this adjustment.
     */
    @Generated
    @Selector("isContrastSupported")
    public native boolean isContrastSupported();

    /**
     * A value to control the amount of detail enhancement to apply to the edges of the image.
     * A value of 0 indicates no detail enhancement.
     * A value of 3 indicates maximum detail enhancement.
     * The value should be the range of 0...3. The default value will vary per image.
     * The 'isDetailSupported' property is false if the current image doesn't support this adjustment.
     */
    @Generated
    @Selector("isDetailSupported")
    public native boolean isDetailSupported();

    /**
     * Setting Draft Mode to true can improve image decoding speed with minimal loss of quality.
     */
    @Generated
    @Selector("isDraftModeEnabled")
    public native boolean isDraftModeEnabled();

    /**
     * A boolean value to control if gamut mapping is enabled or not.
     * The default value is true.
     */
    @Generated
    @Selector("isGamutMappingEnabled")
    public native boolean isGamutMappingEnabled();

    @Generated
    @Selector("isLensCorrectionEnabled")
    public native boolean isLensCorrectionEnabled();

    /**
     * A boolean value to control if gamut mapping is enabled or not.
     * The default value can vary based on the image.
     * The 'isLensCorrectionSupported' property is false if the current image doesn't support this setting.
     */
    @Generated
    @Selector("isLensCorrectionSupported")
    public native boolean isLensCorrectionSupported();

    /**
     * A value to control the amount of local tone curve to apply to the image.
     * A value of 0 indicates no local tone curve, i.e. linear response.
     * A value of 1 indicates full global tone curve.
     * The value should be the range of 0...1. The default value will vary per image.
     * The 'isLocalToneMapSupported' property is false if the current image doesn't support this adjustment.
     */
    @Generated
    @Selector("isLocalToneMapSupported")
    public native boolean isLocalToneMapSupported();

    /**
     * A value to control the amount of luminance noise reduction to apply to the image.
     * A value of 0 indicates no luminance noise reduction.
     * A value of 1 indicates maximum luminance noise reduction.
     * The value should be the range of 0...1. The default value will vary per image.
     * The 'isLuminanceNoiseReductionSupported' property is false if the current image doesn't support this adjustment.
     */
    @Generated
    @Selector("isLuminanceNoiseReductionSupported")
    public native boolean isLuminanceNoiseReductionSupported();

    /**
     * A value to control the amount of moire artifact reduction to apply to high frequency areas of the image.
     * A value of 0 indicates no moire reduction.
     * A value of 3 indicates maximum moire reduction.
     * The value should be the range of 0...1. The default value will vary per image.
     * The 'isMoireReductionSupported' property is false if the current image doesn't support this adjustment.
     */
    @Generated
    @Selector("isMoireReductionSupported")
    public native boolean isMoireReductionSupported();

    /**
     * A value to control the amount of sharpness to apply to the edges of the image.
     * A value of 0 indicates no sharpness applied.
     * A value of 1 indicates maximum sharpness applied.
     * The value should be the range of 0...1. The default value will vary per image.
     * The 'isSharpnessSupported' property is false if the current image doesn't support this adjustment.
     */
    @Generated
    @Selector("isSharpnessSupported")
    public native boolean isSharpnessSupported();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * An optional CIFilter to be applied to the RAW image while it is in linear space.
     */
    @Generated
    @Selector("linearSpaceFilter")
    public native CIFilter linearSpaceFilter();

    @Generated
    @Selector("localToneMapAmount")
    public native float localToneMapAmount();

    @Generated
    @Selector("localizedDescriptionForFilterName:")
    public static native String localizedDescriptionForFilterName(String filterName);

    @Generated
    @Selector("localizedNameForCategory:")
    public static native String localizedNameForCategory(String category);

    @Generated
    @Selector("localizedNameForFilterName:")
    public static native String localizedNameForFilterName(String filterName);

    @Generated
    @Selector("localizedReferenceDocumentationForFilterName:")
    public static native NSURL localizedReferenceDocumentationForFilterName(String filterName);

    @Generated
    @Selector("luminanceNoiseReductionAmount")
    public native float luminanceNoiseReductionAmount();

    @Generated
    @Selector("moireReductionAmount")
    public native float moireReductionAmount();

    /**
     * The full native size of the unscaled image. This is not affected by changing orientation
     */
    @Generated
    @Selector("nativeSize")
    @ByValue
    public native CGSize nativeSize();

    /**
     * These properties provide differnet was to query or modify the image white balance
     * Use 'neutralChromaticity' to query or change white balance based on x,y chromaticity values in the range (0..1)
     * Use 'neutralTemperature' and 'neutralTemperature' to query or change white balance based temp/tint values in the
     * ranges (2000K..50000K, -150..150)
     * Use 'neutralLocation' to change the white balance based on an x,y pixel coordiniates in the image.
     */
    @Generated
    @Selector("neutralChromaticity")
    @ByValue
    public native CGPoint neutralChromaticity();

    @Generated
    @Selector("neutralLocation")
    @ByValue
    public native CGPoint neutralLocation();

    @Generated
    @Selector("neutralTemperature")
    public native float neutralTemperature();

    @Generated
    @Selector("neutralTint")
    public native float neutralTint();

    @Generated
    @Owned
    @Selector("new")
    public static native CIRAWFilter new_objc();

    /**
     * Changing this value allows the user to change the orientation of the image.
     * The valid values are in range 1...8 and follow the EXIF specification.
     */
    @Generated
    @Selector("orientation")
    public native int orientation();

    @Generated
    @Selector("portraitEffectsMatte")
    public native CIImage portraitEffectsMatte();

    /**
     * Properties for auxiliary images that may be present in the file
     */
    @Generated
    @Selector("previewImage")
    public native CIImage previewImage();

    /**
     * Metadata properties CIRAWFilter instance
     * This is a dictionary with the same contents as CGImageSourceCopyProperties.
     */
    @Generated
    @Selector("properties")
    public native NSDictionary<?, ?> properties();

    @Generated
    @Selector("registerFilterName:constructor:classAttributes:")
    public static native void registerFilterNameConstructorClassAttributes(String name,
            @Mapped(ObjCObjectMapper.class) CIFilterConstructor anObject, NSDictionary<String, ?> attributes);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The desired scale factor at which the image will be eventually drawn. Setting this value can greatly improve the
     * drawing performance.
     * A value of 1.0 results in a full size output image, values smaller than 1 will result in a smaller output image.
     * The value should be the range of 0...1. Default value is 1
     */
    @Generated
    @Selector("scaleFactor")
    public native float scaleFactor();

    @Generated
    @Selector("semanticSegmentationGlassesMatte")
    public native CIImage semanticSegmentationGlassesMatte();

    @Generated
    @Selector("semanticSegmentationHairMatte")
    public native CIImage semanticSegmentationHairMatte();

    @Generated
    @Selector("semanticSegmentationSkinMatte")
    public native CIImage semanticSegmentationSkinMatte();

    @Generated
    @Selector("semanticSegmentationSkyMatte")
    public native CIImage semanticSegmentationSkyMatte();

    @Generated
    @Selector("semanticSegmentationTeethMatte")
    public native CIImage semanticSegmentationTeethMatte();

    @Generated
    @Selector("serializedXMPFromFilters:inputImageExtent:")
    public static native NSData serializedXMPFromFiltersInputImageExtent(NSArray<? extends CIFilter> filters,
            @ByValue CGRect extent);

    /**
     * A value for baseline exposure applied to the image. Default value can vary based on the image.
     */
    @Generated
    @Selector("setBaselineExposure:")
    public native void setBaselineExposure(float value);

    /**
     * A value to control the amount of global tone curve to apply to the image.
     * A value of 0 indicates no global tone curve, i.e. linear response.
     * A value of 1 indicates full global tone curve.
     * The value should be the range of 0...1. The default value is 1.
     */
    @Generated
    @Selector("setBoostAmount:")
    public native void setBoostAmount(float value);

    /**
     * The amount to boost the shadow areas of the image. Can be used to lighten details in shadows. This has no effect
     * if the boostAmount is 0.
     * A value less than 1 will darken the shadows. A value greater than 1 will lighten the shadows.
     * The value should be the range of 0...2. The default value is 1.
     */
    @Generated
    @Selector("setBoostShadowAmount:")
    public native void setBoostShadowAmount(float value);

    @Generated
    @Selector("setColorNoiseReductionAmount:")
    public native void setColorNoiseReductionAmount(float value);

    @Generated
    @Selector("setContrastAmount:")
    public native void setContrastAmount(float value);

    /**
     * Version string representing the decoder version to be used. A newly initialized object defaults to the newest
     * available decoder version for the given image type. User can request an alternative, older version in order to
     * maintain compatibility with older releases. Must be one of supportedDecoderVersions (above), otherwise a nil
     * output image will be generated.
     */
    @Generated
    @Selector("setDecoderVersion:")
    public native void setDecoderVersion(String value);

    @Generated
    @Selector("setDetailAmount:")
    public native void setDetailAmount(float value);

    /**
     * Setting Draft Mode to true can improve image decoding speed with minimal loss of quality.
     */
    @Generated
    @Selector("setDraftModeEnabled:")
    public native void setDraftModeEnabled(boolean value);

    /**
     * A value controlling the amount of exposure to apply to the image. Default value is 0.
     */
    @Generated
    @Selector("setExposure:")
    public native void setExposure(float value);

    /**
     * Allows the output to have an Extended Dynamic Range with values greater than 1 possible.
     * A value of 0 indicates no extended dynamic range output.
     * A value of 1 indicates default extended dynamic range output.
     * A value of 2 indicates maximum extended dynamic range output.
     * The value should be the range of 0...2. The default value is 0.
     */
    @Generated
    @Selector("setExtendedDynamicRangeAmount:")
    public native void setExtendedDynamicRangeAmount(float value);

    /**
     * A boolean value to control if gamut mapping is enabled or not.
     * The default value is true.
     */
    @Generated
    @Selector("setGamutMappingEnabled:")
    public native void setGamutMappingEnabled(boolean value);

    @Generated
    @Selector("setLensCorrectionEnabled:")
    public native void setLensCorrectionEnabled(boolean value);

    /**
     * An optional CIFilter to be applied to the RAW image while it is in linear space.
     */
    @Generated
    @Selector("setLinearSpaceFilter:")
    public native void setLinearSpaceFilter(CIFilter value);

    @Generated
    @Selector("setLocalToneMapAmount:")
    public native void setLocalToneMapAmount(float value);

    @Generated
    @Selector("setLuminanceNoiseReductionAmount:")
    public native void setLuminanceNoiseReductionAmount(float value);

    @Generated
    @Selector("setMoireReductionAmount:")
    public native void setMoireReductionAmount(float value);

    /**
     * These properties provide differnet was to query or modify the image white balance
     * Use 'neutralChromaticity' to query or change white balance based on x,y chromaticity values in the range (0..1)
     * Use 'neutralTemperature' and 'neutralTemperature' to query or change white balance based temp/tint values in the
     * ranges (2000K..50000K, -150..150)
     * Use 'neutralLocation' to change the white balance based on an x,y pixel coordiniates in the image.
     */
    @Generated
    @Selector("setNeutralChromaticity:")
    public native void setNeutralChromaticity(@ByValue CGPoint value);

    @Generated
    @Selector("setNeutralLocation:")
    public native void setNeutralLocation(@ByValue CGPoint value);

    @Generated
    @Selector("setNeutralTemperature:")
    public native void setNeutralTemperature(float value);

    @Generated
    @Selector("setNeutralTint:")
    public native void setNeutralTint(float value);

    /**
     * Changing this value allows the user to change the orientation of the image.
     * The valid values are in range 1...8 and follow the EXIF specification.
     */
    @Generated
    @Selector("setOrientation:")
    public native void setOrientation(int value);

    /**
     * The desired scale factor at which the image will be eventually drawn. Setting this value can greatly improve the
     * drawing performance.
     * A value of 1.0 results in a full size output image, values smaller than 1 will result in a smaller output image.
     * The value should be the range of 0...1. Default value is 1
     */
    @Generated
    @Selector("setScaleFactor:")
    public native void setScaleFactor(float value);

    /**
     * A value controlling an amount to subtract from shadows the image. Default value can vary based on the image.
     */
    @Generated
    @Selector("setShadowBias:")
    public native void setShadowBias(float value);

    @Generated
    @Selector("setSharpnessAmount:")
    public native void setSharpnessAmount(float value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * A value controlling an amount to subtract from shadows the image. Default value can vary based on the image.
     */
    @Generated
    @Selector("shadowBias")
    public native float shadowBias();

    @Generated
    @Selector("sharpnessAmount")
    public native float sharpnessAmount();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Returns a NSArray containing the names of all supported camera models.
     */
    @Generated
    @Selector("supportedCameraModels")
    public static native NSArray<String> supportedCameraModels();

    /**
     * Array of all supported decoder versions for the given image type, sorted in increasingly newer order. All entries
     * would represent a valid version identifier set to 'decoderVersion'.
     */
    @Generated
    @Selector("supportedDecoderVersions")
    public native NSArray<String> supportedDecoderVersions();

    @Deprecated
    @Generated
    @Selector("supportedRawCameraModels")
    public static native NSArray<String> supportedRawCameraModels();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
