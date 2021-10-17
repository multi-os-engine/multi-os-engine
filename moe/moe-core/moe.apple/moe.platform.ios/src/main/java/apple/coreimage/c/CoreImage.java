/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.coreimage.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("CoreImage")
@Runtime(CRuntime.class)
public final class CoreImage {
    static {
        NatJ.register();
    }

    @Generated
    private CoreImage() {
    }

    @Generated
    @CVariable()
    public static native int kCIFormatARGB8();

    @Generated
    @CVariable()
    public static native int kCIFormatBGRA8();

    @Generated
    @CVariable()
    public static native int kCIFormatRGBA8();

    @Generated
    @CVariable()
    public static native int kCIFormatABGR8();

    @Generated
    @CVariable()
    public static native int kCIFormatRGBAf();

    @Generated
    @CVariable()
    public static native int kCIFormatRGBAh();

    @Generated
    @CVariable()
    public static native int kCIFormatA8();

    @Generated
    @CVariable()
    public static native int kCIFormatA16();

    @Generated
    @CVariable()
    public static native int kCIFormatAh();

    @Generated
    @CVariable()
    public static native int kCIFormatAf();

    @Generated
    @CVariable()
    public static native int kCIFormatR8();

    @Generated
    @CVariable()
    public static native int kCIFormatR16();

    @Generated
    @CVariable()
    public static native int kCIFormatRh();

    @Generated
    @CVariable()
    public static native int kCIFormatRf();

    @Generated
    @CVariable()
    public static native int kCIFormatRG8();

    @Generated
    @CVariable()
    public static native int kCIFormatRG16();

    @Generated
    @CVariable()
    public static native int kCIFormatRGh();

    @Generated
    @CVariable()
    public static native int kCIFormatRGf();

    /**
     * A CGColorSpaceRef defining the color space of the image. This value
     * overrides the image's implicit color space.
     * If [NSNull null] then dont color manage the image.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageColorSpace();

    /**
     * A NSDictionary of metadata properties to pass to CIImage initialization methods.
     * When used with imageWithCGImage:options:, initWithCGImage:options:, imageWithData:options:, initWithData:options:
     * If this option is not specified, the properties will be set to CGImageSourceCopyPropertiesAtIndex.
     * If this option is [NSNull null], the properties will be set to nil.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageProperties();

    /**
     * If CFBoolean value is false then dont attempt to apply enhancement filters.
     * If not specified, the option is assumed to be present and true.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAutoAdjustEnhance();

    /**
     * If CFBoolean value is false then dont attempt to apply red eye filter.
     * If not specified, the option is assumed to be present and true.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAutoAdjustRedEye();

    /**
     * If value is an array of detected CIFeatures, then use these features
     * to determine the AutoAdjustEnhance and or AutoAdjustRedEye filters.
     * If not specified, receiver will call CIDetector.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAutoAdjustFeatures();

    /**
     * If CFBoolean value is false then don't attempt to apply crop filter.
     * If not specified, the option is assumed to be present and false.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAutoAdjustCrop();

    /**
     * If CFBoolean value is false then don't attempt to apply auto-level.
     * If not specified, the option is assumed to be present and false.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAutoAdjustLevel();

    /**
     * A CGColorSpaceRef object defining the color space that images are
     * converted to before rendering into the context.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextOutputColorSpace();

    /**
     * A CGColorSpaceRef object defining the color space in which all
     * intermediate operations are performed.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextWorkingColorSpace();

    /**
     * An NSNumber with a CIFormat value defining the pixel format to use for intermediate buffers.
     * On iOS the supported values for this key are RGBA8 and RGBAh. If not specified:
     * RGBA8 is used if app is linked against OSX 10.12 SDK or earlier.
     * RGBAh is used if app is linked against OSX 10.13 SDK or later.
     * On OSX the supported values for this key are RGBA8, RGBAh and RGBAf. If not specified, RGBAh is used.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextWorkingFormat();

    /**
     * A boolean NSNumber controlling the quality of affine downsample operations.
     * [@YES] implies that more quality is desired.
     * On iOS the default value is @NO.
     * On OSX the default value is @YES.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextHighQualityDownsample();

    /**
     * A boolean NSNumber controlling whether output renders produce alpha-premultiplied pixels.
     * The default value is @YES.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextOutputPremultiplied();

    /**
     * A boolean NSNumber controlling how intermediate buffers are cached.
     * If @NO, the context will empty intermediates during and after renders.
     * The default value is @YES.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextCacheIntermediates();

    /**
     * An NSNumber with a boolean value. When @YES the context will use
     * software rendering on macOS.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextUseSoftwareRenderer();

    /**
     * An NSNumber with a boolean value. When @YES the context will use
     * low priority rendering on the GPU.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextPriorityRequestLow();

    /**
     * Name of the filter
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeFilterName();

    /**
     * Name of the filter intended for UI display (eg. localized)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeFilterDisplayName();

    /**
     * Description of the filter intended for UI display (eg. localized)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeDescription();

    /**
     * The version of OS X and iOS a filter was first available in.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeFilterAvailable_Mac();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeFilterAvailable_iOS();

    /**
     * URL for the reference documentation of the filter. See localizedReferenceDocumentationForFilterName.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeReferenceDocumentation();

    /**
     * Array of filter category names (see below)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeFilterCategories();

    /**
     * Class name of the filter.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeClass();

    /**
     * The type of the attribute e.g. scalar, time, distance, etc.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeType();

    /**
     * Minimum value for the attribute.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeMin();

    /**
     * Maximum value for the attribute.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeMax();

    /**
     * Minimum value for the slider.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeSliderMin();

    /**
     * Maximum value for the slider.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeSliderMax();

    /**
     * Default value for the slider.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeDefault();

    /**
     * The identity value is the value at which the filter has no effect.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeIdentity();

    /**
     * The non-localized name of the attribute.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeName();

    /**
     * The localized name of the attribute to be used for display to the user.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeDisplayName();

    /**
     * Key to request the desired set of controls in a filter UIView. The defined values for this key are:
     * CIUISetBasic, CIUISetIntermediate, CIUISetAdvanced and CIUISetDevelopment.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIUIParameterSet();

    /**
     * Constant for requesting controls that are appropiate in an basic user scenario, meaning the bare minimum of settings to control the filter.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIUISetBasic();

    /**
     * Constant for requesting controls that are appropiate in an intermediate user scenario.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIUISetIntermediate();

    /**
     * Constant for requesting controls that are appropiate in an advanced user scenario.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIUISetAdvanced();

    /**
     * Constant for requesting controls that should only be visible for development purposes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIUISetDevelopment();

    /**
     * Types for numbers
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeTime();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeScalar();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeDistance();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeAngle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeBoolean();

    /**
     * Indicates that the key uses integer values.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeInteger();

    /**
     * Indicates that the key uses non negative integer values.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeCount();

    /**
     * Types for 2-element vectors
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypePosition();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeOffset();

    /**
     * Types for 3-element vectors
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypePosition3();

    /**
     * Types for 4-element vectors
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeRectangle();

    /**
     * Types for colors
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeOpaqueColor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeColor();

    /**
     * Types for images
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeGradient();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeImage();

    /**
     * Types for NSValue of CGAffineTransform
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeTransform();

    /**
     * Categories
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryDistortionEffect();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryGeometryAdjustment();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryCompositeOperation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryHalftoneEffect();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryColorAdjustment();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryColorEffect();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryTransition();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryTileEffect();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryGenerator();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryReduction();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryGradient();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryStylize();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategorySharpen();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryBlur();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryVideo();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryStillImage();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryInterlaced();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryNonSquarePixels();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryHighDynamicRange();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryBuiltIn();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryFilterGenerator();

    /**
     * common filter parameter keys
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIOutputImageKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputBackgroundImageKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputImageKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputTimeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputTransformKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputScaleKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputAspectRatioKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputCenterKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputRadiusKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputAngleKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputRefractionKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputWidthKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputSharpnessKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputIntensityKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputEVKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputSaturationKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputColorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputBrightnessKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputContrastKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputBiasKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputWeightsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputGradientImageKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputMaskImageKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputShadingImageKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputTargetImageKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputExtentKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputVersionKey();

    /**
     * Specifies a detector type for face recognition.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorTypeFace();

    /**
     * Specifies a detector type for rectangle detection.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorTypeRectangle();

    /**
     * Specifies a detector type for barcode detection.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorTypeQRCode();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorTypeText();

    /**
     * The key in the options dictionary used to specify a accuracy / performance tradeoff to be used.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorAccuracy();

    /**
     * Lower accuracy, higher performance
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorAccuracyLow();

    /**
     * Lower performance, higher accuracy
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorAccuracyHigh();

    /**
     * The key in the options dictionary used to specify that feature tracking should be used.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorTracking();

    /**
     * For text detector, the value for this key is an float NSNumber
     * from 0.0 ... 1.0 that represents a percentage of height of an input image.
     * valid values range: 0.0 <= CIDetectorMinFeatureSize <= 1.0. The default value is 10/(height of input image).
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorMinFeatureSize();

    /**
     * For rectangle detector, the value for this key is an integer NSNumber
     * from 1 ... 256 that represents the maximum number of features to return.
     * valid value range: 1 <= CIDetectorMaxFeatureCount <= 256. The default value is 1.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorMaxFeatureCount();

    /**
     * The key in the options dictionary used to specify number of angles, the value for this key is one of 1, 3, 5, 7, 9, 11.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorNumberOfAngles();

    /**
     * The value for this key is an integer NSNumber from 1..8 such as that
     * found in kCGImagePropertyOrientation.  If present, the detection will be done
     * based on that orientation but the coordinates in the returned features will
     * still be based on those of the image.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorImageOrientation();

    /**
     * The value for this key is a bool NSNumber. If true, facial expressions, such as blinking and closed eyes are extracted
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorEyeBlink();

    /**
     * The value for this key is a bool NSNumber. If true, facial expressions, such as smile are extracted
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorSmile();

    /**
     * The value for this key is a float NSNumber. Specifies the per frame focal length.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorFocalLength();

    /**
     * The value for this key is a float NSNumber. Specifies the aspect ratio of the rectangle detected.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorAspectRatio();

    /**
     * The value for this key is a bool NSNumber. Controls whether the text detector should detect subfeatures or not. The default value is NO
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorReturnSubFeatures();

    /**
     * Specifies the type of a feature that is a face.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIFeatureTypeFace();

    /**
     * Specifies the type of a feature that is a rectangle.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIFeatureTypeRectangle();

    /**
     * Specifies the type of a feature that is a QR code.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIFeatureTypeQRCode();

    /**
     * Specifies the type of a feature that is a text.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIFeatureTypeText();

    /**
     * Specifies the the tile size that the provideImageData: method will be called for.
     * If the value is:
     * An NSNumber, then the value specifies a square tile size.
     * <p>
     * An NSArray or CIVector with two values, then it specifies a rectangular tile width and height.
     * <p>
     * Not specified, then provideImageData: will be called for the entire image.
     * <p>
     * NSNull, then provideImageData: can be called for any possible origin and size.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageProviderTileSize();

    /**
     * The object passed when the provideImageData: method is called.
     * It is retained until the image is deallocated.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageProviderUserInfo();

    /**
     * Sampler options.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCISamplerAffineMatrix();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCISamplerWrapMode();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCISamplerFilterMode();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCISamplerWrapBlack();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCISamplerWrapClamp();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCISamplerFilterNearest();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCISamplerFilterLinear();

    /**
     * If used, the value of the kCISamplerColorSpace key be must be an RGB CGColorSpaceRef.
     * Using this option specifies that samples should be converted to this color space before being passed to a kernel.
     * If not specified, samples will be passed to the kernel in the working color space of the rendering CIContext.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCISamplerColorSpace();

    /**
     * NSNumber (BOOL) : Setting Draft Mode to YES can improve image decoding speed without minimal loss of quality.
     * The default value is NO.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputAllowDraftModeKey();

    /**
     * NSString: Version string representing the decoder version to be used. A newly initialized object defaults to the newest available decoder version for the given image type. User can request an alternative, older version in order to maintain compatibility with older releases. Must be one of kCISupportedDecoderVersions (below), otherwise a nil output image will be generated.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputDecoderVersionKey();

    /**
     * NSArray : Array of all supported decoder versions for the given image type, sorted in increasingly newer order. Each entry is a NSString. All entries would represent a valid version identifier to be passed in for kCIInputDecoderVersion. This value can be only read; setting this value will raise an exception.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCISupportedDecoderVersionsKey();

    /**
     * NSNumber (float) : A value controlling the amount of baseline exposure applied to the image.
     * A value of 0 indicates no baseline exposure, i.e. linear response. Default varies from with camera settings.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputBaselineExposureKey();

    /**
     * NSNumber (float) : A value in the range of 0...1, controlling the amount of boost applied to the image.
     * A value of 0 indicates no boost, i.e. linear response. Default is 1, full boost.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputBoostKey();

    /**
     * NSNumber (float) : The amount to boost the shadow areas of the image. Can be used to lighten details in shadows.
     * Has no effect if the image used for initialization was not RAW.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputBoostShadowAmountKey();

    /**
     * NSNumber (BOOL) : Setting DisableGamutMap to YES disables gamut mapping.
     * The default value is NO.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputDisableGamutMapKey();

    /**
     * NSNumber (float): The X value of the chromaticity. You can always query this value and you'll get the current X value for neutral X,Y.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputNeutralChromaticityXKey();

    /**
     * NSNumber (float): The Y value of the chromaticity. You can always query this value and you'll get the current Y value for neutral X,Y.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputNeutralChromaticityYKey();

    /**
     * NSNumber (float) : The color temperature to be considered neutral. You can always query this value and you'll get the current value for temperature.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputNeutralTemperatureKey();

    /**
     * NSNumber (float) : The tint to be considered neutral. You can always query this value and you'll get the current value for tint.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputNeutralTintKey();

    /**
     * CIVector : (x, y) location in geometric coordinates of the unrotated output image that should be used as neutral.
     * You can't query this value - it's undefined for reading.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputNeutralLocationKey();

    /**
     * NSNumber (float) : The desired scale factor at which the image will be eventually drawn. Setting this value can greatly improve the drawing performance. A value of 1 would mean identity, values smaller than 1 will result in a smaller output image. Changing the Scale Factor with enabled Draft Mode may also improve performance.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputScaleFactorKey();

    /**
     * NSNumber (BOOL) : Normally, an image is loaded in its proper orientation, given the associated metadata gives an indication about the orientation. For special purposes it may be useful to load the image in its physical orientation. The exact meaning of this is dependent on the image in question. The default value is NO.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputIgnoreImageOrientationKey();

    /**
     * NSNumber (int) : Overriding this value allows the user to change the orientation of the image. The valid values are in range 1...8 and follow the EXIF specification. Changing this value makes for instance rotation in 90-degree increments easy. The value is disregarded when the kCIInputIgnoreImageOrientationKey flag is set.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputImageOrientationKey();

    /**
     * NSNumber (BOOL) : Determines if the default sharpening should be on. default = YES. Has no effect if the image used for initialization was not RAW.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputEnableSharpeningKey();

    /**
     * NSNumber (BOOL) : Determines if progressive chromatic noise tracking (based on ISO and exposure time) should be used. default = YES. Has no effect if the image used for initialization was not RAW.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputEnableChromaticNoiseTrackingKey();

    /**
     * NSNumber (double) : The amount of noise reduction applied. Range is 0 to 1.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputNoiseReductionAmountKey();

    /**
     * NSNumber (BOOL) : Determines if the default vendor lens correction be on. default = YES if raw image used for initialization contains lens distortion parameters.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputEnableVendorLensCorrectionKey();

    /**
     * NSNumber (double) : The amount of luminance noise reduction applied. Range is 0 to 1.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputLuminanceNoiseReductionAmountKey();

    /**
     * NSNumber (double) : The amount of color noise reduction applied. Range is 0 to 1.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputColorNoiseReductionAmountKey();

    /**
     * NSNumber (double) : The amount of noise reduction sharpness applied. Range is 0 to 1.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputNoiseReductionSharpnessAmountKey();

    /**
     * NSNumber (double) : The amount of noise reduction contrast applied. Range is 0 to 1.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputNoiseReductionContrastAmountKey();

    /**
     * NSNumber (double) : The amount of noise reduction detail applied. Range is 0 to 1.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputNoiseReductionDetailAmountKey();

    /**
     * CIFilter (id) : CIFilter to be applied to the RAW image while it is in linear space.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputLinearSpaceFilter();

    /**
     * CIVector containing the full native size of the unscaled image. The vector's X value is the width, Y is the height.
     * This is not affected by changing either kCIInputIgnoreImageOrientationKey or kCIInputImageOrientationKey.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIOutputNativeSizeKey();

    /**
     * Read-only NSSet containing a list of keys that affect the output image.
     * Depending on the RAW decoder version (kCIInputDecoderVersionKey) and the input image type,
     * some input keys might have no effect.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIActiveKeys();

    @Generated
    @CVariable()
    public static native int kCIFormatRGBA16();

    @Generated
    @CVariable()
    public static native int kCIFormatL8();

    @Generated
    @CVariable()
    public static native int kCIFormatL16();

    @Generated
    @CVariable()
    public static native int kCIFormatLh();

    @Generated
    @CVariable()
    public static native int kCIFormatLf();

    @Generated
    @CVariable()
    public static native int kCIFormatLA8();

    @Generated
    @CVariable()
    public static native int kCIFormatLA16();

    @Generated
    @CVariable()
    public static native int kCIFormatLAh();

    @Generated
    @CVariable()
    public static native int kCIFormatLAf();

    /**
     * A boolean value specifying whether the image should sampled using "nearest neighbor"
     * behavior.  If not specified, the image will be sampled using "linear sampling"
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageNearestSampling();

    /**
     * A boolean value specifying whether the image should transformed according to orientation metadata properties.
     * This can be used with imageWithContentsOfURL: or initWithData: when the image contains orientation metadata
     * or with any of the initWith:options: method if the kCIImageProperties option is also provided.
     * If this option value is @YES, the image will transformed according to the orientation metadata
     * and the orientation metadata will be be removed.
     * If this option not present or the value is @NO, then the image will not be transformed
     * and the orientation metadata will left unaltered.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageApplyOrientationProperty();

    /**
     * The kCIImageAuxiliaryDepth or kCIImageAuxiliaryDisparity or kCIImageAuxiliaryPortraitEffectsMatte keys can be passed to the methods:
     * + [CIImage imageWithContentsOfURL:options:]
     * + [CIImage imageWithData:options:]
     * If the value of one of these keys is @YES, the auxiliary image be returned instead of the primary image.
     * If an auxiliary image is not present, then nil will be returned.
     * The returned image will be a half float monochrome image.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAuxiliaryDepth();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAuxiliaryDisparity();

    /**
     * The value for kCIImageRepresentationAVDepthData should be an AVDepthData object.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationAVDepthData();

    /**
     * The value for kCIImageRepresentationDepthImage should be a monochome CIImage object.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationDepthImage();

    /**
     * The value for kCIImageRepresentationDisparityImage should be a monochome CIImage object.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationDisparityImage();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputDepthImageKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputDisparityImageKey();

    /**
     * NSNumber (double) : The amount of moire reduction applied. Range is 0 to 1.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputMoireAmountKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAuxiliaryPortraitEffectsMatte();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAuxiliarySemanticSegmentationSkinMatte();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAuxiliarySemanticSegmentationHairMatte();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAuxiliarySemanticSegmentationTeethMatte();

    /**
     * A boolean value specifying whether or not to allow use of low-power devices for GPU rendering.
     * If @YES, the context will use a low power GPU if available and the high power device is not already in use.
     * The default value is @NO which instructs the context to use the highest power/performance device.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextAllowLowPower();

    /**
     * The value for kCIImageRepresentationAVPortraitEffectsMatte should be an AVPortraitEffectsMatte object.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationAVPortraitEffectsMatte();

    /**
     * The value for kCIImageRepresentationPortraitEffectsMatteImage should be a monochome CIImage object.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationPortraitEffectsMatteImage();

    /**
     * The value for kCIImageRepresentationAVSemanticSegmentationMattes should be an array of AVSemanticSegmentationMatte objects.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationAVSemanticSegmentationMattes();

    /**
     * The value for kCIImageRepresentationSemanticSegmentationSkinMatteImage should be a monochome CIImage object.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationSemanticSegmentationSkinMatteImage();

    /**
     * The value for kCIImageRepresentationSemanticSegmentationHairMatteImage should be a monochome CIImage object.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationSemanticSegmentationHairMatteImage();

    /**
     * The value for kCIImageRepresentationSemanticSegmentationTeethMatteImage should be a monochome CIImage object.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationSemanticSegmentationTeethMatteImage();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputAmountKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputMatteImageKey();

    /**
     * NSNumber (BOOL) : Allows the output to have an Extended Dynamic Range with values greater than 1 possible
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputEnableEDRModeKey();

    /**
     * An NSString specifying a client-provided name for a context.
     * This name will be used in QuickLook graphs and the output of CI_PRINT_TREE.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextName();

    /**
     * A boolean value specifying whether an image returned by [CIImage with...] should have kernels
     * applied that will tone map to standard dynamic range (SDR).
     * The option will only have an effect if the image has a CGColorSpace that is high dynamic range (HDR).
     * This option can be useful if further usage of an image is not prepared for HDR values.
     * If the value for this option is @YES, then the HDR input image will be tone mapped to working space SDR.
     * If the value for this option is @NO, then the HDR  input image will be linearized to unclamped working space.
     * If this option is not specified, then it will behave as if @NO was specified.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageToneMapHDRtoSDR();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAuxiliarySemanticSegmentationGlassesMatte();

    /**
     * The value for kCIImageRepresentationSemanticSegmentationGlassesMatteImage should be a monochome CIImage object.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationSemanticSegmentationGlassesMatteImage();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAuxiliarySemanticSegmentationSkyMatte();

    /**
     * The value for kCIImageRepresentationSemanticSegmentationSkyMatteImage should be a monochome CIImage object.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationSemanticSegmentationSkyMatteImage();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIRAWDecoderVersionNone();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIRAWDecoderVersion8();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIRAWDecoderVersion8DNG();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIRAWDecoderVersion7();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIRAWDecoderVersion7DNG();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIRAWDecoderVersion6();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIRAWDecoderVersion6DNG();

    /**
     * NSNumber (double): The amount of the local tone map. Range is 0 to 1. Default is 1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputLocalToneMapAmountKey();

    /**
     * Read-only NSDictionary containing properties for the output image.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIPropertiesKey();
}
