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
import org.jetbrains.annotations.NotNull;

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

    /**
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatARGB8();

    @Generated
    @CVariable()
    public static native int kCIFormatBGRA8();

    @Generated
    @CVariable()
    public static native int kCIFormatRGBA8();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatABGR8();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatRGBAf();

    /**
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatRGBAh();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatA8();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatA16();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatAh();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatAf();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatR8();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatR16();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatRh();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatRf();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatRG8();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatRG16();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatRGh();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatRGf();

    /**
     * A CGColorSpaceRef defining the color space of the image. This value
     * overrides the image's implicit color space.
     * If [NSNull null] then dont color manage the image.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageColorSpace();

    /**
     * A NSDictionary of metadata properties to pass to CIImage initialization methods.
     * When used with imageWithCGImage:options:, initWithCGImage:options:, imageWithData:options:, initWithData:options:
     * If this option is not specified, the properties will be set to CGImageSourceCopyPropertiesAtIndex.
     * If this option is [NSNull null], the properties will be set to nil.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageProperties();

    /**
     * If CFBoolean value is false then dont attempt to apply enhancement filters.
     * If not specified, the option is assumed to be present and true.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAutoAdjustEnhance();

    /**
     * If CFBoolean value is false then dont attempt to apply red eye filter.
     * If not specified, the option is assumed to be present and true.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAutoAdjustRedEye();

    /**
     * If value is an array of detected CIFeatures, then use these features
     * to determine the AutoAdjustEnhance and or AutoAdjustRedEye filters.
     * If not specified, receiver will call CIDetector.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAutoAdjustFeatures();

    /**
     * If CFBoolean value is false then don't attempt to apply crop filter.
     * If not specified, the option is assumed to be present and false.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAutoAdjustCrop();

    /**
     * If CFBoolean value is false then don't attempt to apply auto-level.
     * If not specified, the option is assumed to be present and false.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAutoAdjustLevel();

    /**
     * A CGColorSpaceRef object defining the color space that images are
     * converted to before rendering into the context.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextOutputColorSpace();

    /**
     * A CGColorSpaceRef object defining the color space in which all
     * intermediate operations are performed.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextWorkingColorSpace();

    /**
     * An NSNumber with a CIFormat value defining the pixel format to use for intermediate buffers.
     * On iOS the supported values for this key are RGBA8 and RGBAh. If not specified:
     * RGBA8 is used if app is linked against iOS 12 SDK or earlier.
     * RGBAh is used if app is linked against iOS 13 SDK or later.
     * On OSX the supported values for this key are RGBA8, RGBAh and RGBAf. If not specified, RGBAh is used.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextWorkingFormat();

    /**
     * A boolean NSNumber controlling the quality of affine downsample operations.
     * [@YES] implies that more quality is desired.
     * On iOS the default value is @NO.
     * On OSX the default value is @YES.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextHighQualityDownsample();

    /**
     * A boolean NSNumber controlling whether output renders produce alpha-premultiplied pixels.
     * The default value is @YES.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextOutputPremultiplied();

    /**
     * A boolean NSNumber controlling how intermediate buffers are cached.
     * If @NO, the context will empty intermediates during and after renders.
     * The default value is @YES.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextCacheIntermediates();

    /**
     * An NSNumber with a boolean value. When @YES the context will use
     * software rendering on macOS.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextUseSoftwareRenderer();

    /**
     * An NSNumber with a boolean value. When @YES the context will use
     * low priority rendering on the GPU.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextPriorityRequestLow();

    /**
     * Name of the filter
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeFilterName();

    /**
     * Name of the filter intended for UI display (eg. localized)
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeFilterDisplayName();

    /**
     * Description of the filter intended for UI display (eg. localized)
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeDescription();

    /**
     * The version of OS X and iOS a filter was first available in.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeFilterAvailable_Mac();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeFilterAvailable_iOS();

    /**
     * URL for the reference documentation of the filter. See localizedReferenceDocumentationForFilterName.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeReferenceDocumentation();

    /**
     * Array of filter category names (see below)
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeFilterCategories();

    /**
     * Class name of the filter.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeClass();

    /**
     * The type of the attribute e.g. scalar, time, distance, etc.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeType();

    /**
     * Minimum value for the attribute.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeMin();

    /**
     * Maximum value for the attribute.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeMax();

    /**
     * Minimum value for the slider.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeSliderMin();

    /**
     * Maximum value for the slider.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeSliderMax();

    /**
     * Default value for the slider.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeDefault();

    /**
     * The identity value is the value at which the filter has no effect.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeIdentity();

    /**
     * The non-localized name of the attribute.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeName();

    /**
     * The localized name of the attribute to be used for display to the user.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeDisplayName();

    /**
     * Key to request the desired set of controls in a filter UIView. The defined values for this key are:
     * CIUISetBasic, CIUISetIntermediate, CIUISetAdvanced and CIUISetDevelopment.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIUIParameterSet();

    /**
     * Constant for requesting controls that are appropiate in an basic user scenario, meaning the bare minimum of
     * settings to control the filter.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIUISetBasic();

    /**
     * Constant for requesting controls that are appropiate in an intermediate user scenario.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIUISetIntermediate();

    /**
     * Constant for requesting controls that are appropiate in an advanced user scenario.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIUISetAdvanced();

    /**
     * Constant for requesting controls that should only be visible for development purposes.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIUISetDevelopment();

    /**
     * Types for numbers
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeTime();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeScalar();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeDistance();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeAngle();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeBoolean();

    /**
     * Indicates that the key uses integer values.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeInteger();

    /**
     * Indicates that the key uses non negative integer values.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeCount();

    /**
     * Types for 2-element vectors
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypePosition();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeOffset();

    /**
     * Types for 3-element vectors
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypePosition3();

    /**
     * Types for 4-element vectors
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeRectangle();

    /**
     * Types for colors
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeOpaqueColor();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeColor();

    /**
     * Types for images
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeGradient();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeImage();

    /**
     * Types for NSValue of CGAffineTransform
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIAttributeTypeTransform();

    /**
     * Categories
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryDistortionEffect();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryGeometryAdjustment();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryCompositeOperation();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryHalftoneEffect();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryColorAdjustment();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryColorEffect();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryTransition();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryTileEffect();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryGenerator();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryReduction();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryGradient();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryStylize();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategorySharpen();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryBlur();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryVideo();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryStillImage();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryInterlaced();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryNonSquarePixels();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryHighDynamicRange();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryBuiltIn();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCICategoryFilterGenerator();

    /**
     * common filter parameter keys
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIOutputImageKey();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputBackgroundImageKey();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputImageKey();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputTimeKey();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputTransformKey();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputScaleKey();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputAspectRatioKey();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputCenterKey();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputRadiusKey();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputAngleKey();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputRefractionKey();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputWidthKey();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputSharpnessKey();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputIntensityKey();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputEVKey();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputSaturationKey();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputColorKey();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputBrightnessKey();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputContrastKey();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputBiasKey();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputWeightsKey();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputGradientImageKey();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputMaskImageKey();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputShadingImageKey();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputTargetImageKey();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputExtentKey();

    /**
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputVersionKey();

    /**
     * Specifies a detector type for face recognition.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorTypeFace();

    /**
     * Specifies a detector type for rectangle detection.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorTypeRectangle();

    /**
     * Specifies a detector type for barcode detection.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorTypeQRCode();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorTypeText();

    /**
     * The key in the options dictionary used to specify a accuracy / performance tradeoff to be used.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorAccuracy();

    /**
     * Lower accuracy, higher performance
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorAccuracyLow();

    /**
     * Lower performance, higher accuracy
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorAccuracyHigh();

    /**
     * The key in the options dictionary used to specify that feature tracking should be used.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorTracking();

    /**
     * For text detector, the value for this key is an float NSNumber
     * from 0.0 ... 1.0 that represents a percentage of height of an input image.
     * valid values range: 0.0 <= CIDetectorMinFeatureSize <= 1.0. The default value is 10/(height of input image).
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorMinFeatureSize();

    /**
     * For rectangle detector, the value for this key is an integer NSNumber
     * from 1 ... 256 that represents the maximum number of features to return.
     * valid value range: 1 <= CIDetectorMaxFeatureCount <= 256. The default value is 1.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorMaxFeatureCount();

    /**
     * The key in the options dictionary used to specify number of angles, the value for this key is one of 1, 3, 5, 7,
     * 9, 11.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorNumberOfAngles();

    /**
     * The value for this key is an integer NSNumber from 1..8 such as that
     * found in kCGImagePropertyOrientation. If present, the detection will be done
     * based on that orientation but the coordinates in the returned features will
     * still be based on those of the image.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorImageOrientation();

    /**
     * The value for this key is a bool NSNumber. If true, facial expressions, such as blinking and closed eyes are
     * extracted
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorEyeBlink();

    /**
     * The value for this key is a bool NSNumber. If true, facial expressions, such as smile are extracted
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorSmile();

    /**
     * The value for this key is a float NSNumber. Specifies the per frame focal length.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorFocalLength();

    /**
     * The value for this key is a float NSNumber. Specifies the aspect ratio of the rectangle detected.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorAspectRatio();

    /**
     * The value for this key is a bool NSNumber. Controls whether the text detector should detect subfeatures or not.
     * The default value is NO
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorReturnSubFeatures();

    /**
     * Specifies the type of a feature that is a face.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIFeatureTypeFace();

    /**
     * Specifies the type of a feature that is a rectangle.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIFeatureTypeRectangle();

    /**
     * Specifies the type of a feature that is a QR code.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIFeatureTypeQRCode();

    /**
     * Specifies the type of a feature that is a text.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIFeatureTypeText();

    /**
     * Specifies the the tile size that the provideImageData: method will be called for.
     * If the value is:
     * An NSNumber, then the value specifies a square tile size.
     * 
     * An NSArray or CIVector with two values, then it specifies a rectangular tile width and height.
     * 
     * Not specified, then provideImageData: will be called for the entire image.
     * 
     * NSNull, then provideImageData: can be called for any possible origin and size.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageProviderTileSize();

    /**
     * The object passed when the provideImageData: method is called.
     * It is retained until the image is deallocated.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageProviderUserInfo();

    /**
     * Sampler options.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCISamplerAffineMatrix();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCISamplerWrapMode();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCISamplerFilterMode();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCISamplerWrapBlack();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCISamplerWrapClamp();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCISamplerFilterNearest();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCISamplerFilterLinear();

    /**
     * If used, the value of the kCISamplerColorSpace key be must be an RGB CGColorSpaceRef.
     * Using this option specifies that samples should be converted to this color space before being passed to a kernel.
     * If not specified, samples will be passed to the kernel in the working color space of the rendering CIContext.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCISamplerColorSpace();

    /**
     * NSNumber (BOOL) : Setting Draft Mode to YES can improve image decoding speed without minimal loss of quality.
     * The default value is NO.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputAllowDraftModeKey();

    /**
     * NSString: Version string representing the decoder version to be used. A newly initialized object defaults to the
     * newest available decoder version for the given image type. User can request an alternative, older version in
     * order to maintain compatibility with older releases. Must be one of kCISupportedDecoderVersions (below),
     * otherwise a nil output image will be generated.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputDecoderVersionKey();

    /**
     * NSArray : Array of all supported decoder versions for the given image type, sorted in increasingly newer order.
     * Each entry is a NSString. All entries would represent a valid version identifier to be passed in for
     * kCIInputDecoderVersion. This value can be only read; setting this value will raise an exception.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCISupportedDecoderVersionsKey();

    /**
     * NSNumber (float) : A value controlling the amount of baseline exposure applied to the image.
     * A value of 0 indicates no baseline exposure, i.e. linear response. Default varies from with camera settings.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputBaselineExposureKey();

    /**
     * NSNumber (float) : A value in the range of 0...1, controlling the amount of boost applied to the image.
     * A value of 0 indicates no boost, i.e. linear response. Default is 1, full boost.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputBoostKey();

    /**
     * NSNumber (float) : The amount to boost the shadow areas of the image. Can be used to lighten details in shadows.
     * Has no effect if the image used for initialization was not RAW.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputBoostShadowAmountKey();

    /**
     * NSNumber (BOOL) : Setting DisableGamutMap to YES disables gamut mapping.
     * The default value is NO.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputDisableGamutMapKey();

    /**
     * NSNumber (float): The X value of the chromaticity. You can always query this value and you'll get the current X
     * value for neutral X,Y.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputNeutralChromaticityXKey();

    /**
     * NSNumber (float): The Y value of the chromaticity. You can always query this value and you'll get the current Y
     * value for neutral X,Y.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputNeutralChromaticityYKey();

    /**
     * NSNumber (float) : The color temperature to be considered neutral. You can always query this value and you'll get
     * the current value for temperature.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputNeutralTemperatureKey();

    /**
     * NSNumber (float) : The tint to be considered neutral. You can always query this value and you'll get the current
     * value for tint.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputNeutralTintKey();

    /**
     * CIVector : (x, y) location in geometric coordinates of the unrotated output image that should be used as neutral.
     * You can't query this value - it's undefined for reading.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputNeutralLocationKey();

    /**
     * NSNumber (float) : The desired scale factor at which the image will be eventually drawn. Setting this value can
     * greatly improve the drawing performance. A value of 1 would mean identity, values smaller than 1 will result in a
     * smaller output image. Changing the Scale Factor with enabled Draft Mode may also improve performance.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputScaleFactorKey();

    /**
     * NSNumber (BOOL) : Normally, an image is loaded in its proper orientation, given the associated metadata gives an
     * indication about the orientation. For special purposes it may be useful to load the image in its physical
     * orientation. The exact meaning of this is dependent on the image in question. The default value is NO.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputIgnoreImageOrientationKey();

    /**
     * NSNumber (int) : Overriding this value allows the user to change the orientation of the image. The valid values
     * are in range 1...8 and follow the EXIF specification. Changing this value makes for instance rotation in
     * 90-degree increments easy. The value is disregarded when the kCIInputIgnoreImageOrientationKey flag is set.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputImageOrientationKey();

    /**
     * NSNumber (BOOL) : Determines if the default sharpening should be on. default = YES. Has no effect if the image
     * used for initialization was not RAW.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputEnableSharpeningKey();

    /**
     * NSNumber (BOOL) : Determines if progressive chromatic noise tracking (based on ISO and exposure time) should be
     * used. default = YES. Has no effect if the image used for initialization was not RAW.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputEnableChromaticNoiseTrackingKey();

    /**
     * NSNumber (double) : The amount of noise reduction applied. Range is 0 to 1.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputNoiseReductionAmountKey();

    /**
     * NSNumber (BOOL) : Determines if the default vendor lens correction be on. default = YES if raw image used for
     * initialization contains lens distortion parameters.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputEnableVendorLensCorrectionKey();

    /**
     * NSNumber (double) : The amount of luminance noise reduction applied. Range is 0 to 1.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputLuminanceNoiseReductionAmountKey();

    /**
     * NSNumber (double) : The amount of color noise reduction applied. Range is 0 to 1.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputColorNoiseReductionAmountKey();

    /**
     * NSNumber (double) : The amount of noise reduction sharpness applied. Range is 0 to 1.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputNoiseReductionSharpnessAmountKey();

    /**
     * NSNumber (double) : The amount of noise reduction contrast applied. Range is 0 to 1.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputNoiseReductionContrastAmountKey();

    /**
     * NSNumber (double) : The amount of noise reduction detail applied. Range is 0 to 1.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputNoiseReductionDetailAmountKey();

    /**
     * CIFilter (id) : CIFilter to be applied to the RAW image while it is in linear space.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputLinearSpaceFilter();

    /**
     * CIVector containing the full native size of the unscaled image. The vector's X value is the width, Y is the
     * height.
     * This is not affected by changing either kCIInputIgnoreImageOrientationKey or kCIInputImageOrientationKey.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIOutputNativeSizeKey();

    /**
     * Read-only NSSet containing a list of keys that affect the output image.
     * Depending on the RAW decoder version (kCIInputDecoderVersionKey) and the input image type,
     * some input keys might have no effect.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIActiveKeys();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatRGBA16();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatL8();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatL16();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatLh();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatLf();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatLA8();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatLA16();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatLAh();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatLAf();

    /**
     * A boolean value specifying whether the image should sampled using "nearest neighbor"
     * behavior. If not specified, the image will be sampled using "linear sampling"
     * 
     * API-Since: 11.0
     */
    @NotNull
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
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageApplyOrientationProperty();

    /**
     * The kCIImageAuxiliaryDepth or kCIImageAuxiliaryDisparity or kCIImageAuxiliaryPortraitEffectsMatte keys can be
     * passed to the methods:
     * + [CIImage imageWithContentsOfURL:options:]
     * + [CIImage imageWithData:options:]
     * If the value of one of these keys is @YES, the auxiliary image be returned instead of the primary image.
     * If an auxiliary image is not present, then nil will be returned.
     * The returned image will be a half float monochrome image.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAuxiliaryDepth();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAuxiliaryDisparity();

    /**
     * The value for kCIImageRepresentationAVDepthData should be an AVDepthData object.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationAVDepthData();

    /**
     * The value for kCIImageRepresentationDepthImage should be a monochome CIImage object.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationDepthImage();

    /**
     * The value for kCIImageRepresentationDisparityImage should be a monochome CIImage object.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationDisparityImage();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputDepthImageKey();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputDisparityImageKey();

    /**
     * NSNumber (double) : The amount of moire reduction applied. Range is 0 to 1.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputMoireAmountKey();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAuxiliaryPortraitEffectsMatte();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAuxiliarySemanticSegmentationSkinMatte();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAuxiliarySemanticSegmentationHairMatte();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAuxiliarySemanticSegmentationTeethMatte();

    /**
     * A boolean value specifying whether or not to allow use of low-power devices for GPU rendering.
     * If @YES, the context will use a low power GPU if available and the high power device is not already in use.
     * The default value is @NO which instructs the context to use the highest power/performance device.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextAllowLowPower();

    /**
     * The value for kCIImageRepresentationAVPortraitEffectsMatte should be an AVPortraitEffectsMatte object.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationAVPortraitEffectsMatte();

    /**
     * The value for kCIImageRepresentationPortraitEffectsMatteImage should be a monochome CIImage object.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationPortraitEffectsMatteImage();

    /**
     * The value for kCIImageRepresentationAVSemanticSegmentationMattes should be an array of
     * AVSemanticSegmentationMatte objects.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationAVSemanticSegmentationMattes();

    /**
     * The value for kCIImageRepresentationSemanticSegmentationSkinMatteImage should be a monochome CIImage object.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationSemanticSegmentationSkinMatteImage();

    /**
     * The value for kCIImageRepresentationSemanticSegmentationHairMatteImage should be a monochome CIImage object.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationSemanticSegmentationHairMatteImage();

    /**
     * The value for kCIImageRepresentationSemanticSegmentationTeethMatteImage should be a monochome CIImage object.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationSemanticSegmentationTeethMatteImage();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputAmountKey();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputMatteImageKey();

    /**
     * NSNumber (BOOL) : Allows the output to have an Extended Dynamic Range with values greater than 1 possible
     * 
     * API-Since: 12.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputEnableEDRModeKey();

    /**
     * An NSString specifying a client-provided name for a context.
     * This name will be used in QuickLook graphs and the output of CI_PRINT_TREE.
     * 
     * API-Since: 12.0
     */
    @NotNull
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
     * If the value for this option is @NO, then the HDR input image will be linearized to unclamped working space.
     * If this option is not specified, then it will behave as if @NO was specified.
     * 
     * API-Since: 14.1
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageToneMapHDRtoSDR();

    /**
     * API-Since: 14.1
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAuxiliarySemanticSegmentationGlassesMatte();

    /**
     * The value for kCIImageRepresentationSemanticSegmentationGlassesMatteImage should be a monochome CIImage object.
     * 
     * API-Since: 14.1
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationSemanticSegmentationGlassesMatteImage();

    /**
     * API-Since: 14.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageAuxiliarySemanticSegmentationSkyMatte();

    /**
     * The value for kCIImageRepresentationSemanticSegmentationSkyMatteImage should be a monochome CIImage object.
     * 
     * API-Since: 14.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationSemanticSegmentationSkyMatteImage();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIRAWDecoderVersionNone();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIRAWDecoderVersion8();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIRAWDecoderVersion8DNG();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIRAWDecoderVersion7();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIRAWDecoderVersion7DNG();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIRAWDecoderVersion6();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIRAWDecoderVersion6DNG();

    /**
     * NSNumber (double): The amount of the local tone map. Range is 0 to 1. Default is 1
     * 
     * API-Since: 14.3
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputLocalToneMapAmountKey();

    /**
     * Read-only NSDictionary containing properties for the output image.
     * 
     * API-Since: 15.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIPropertiesKey();

    @Generated public static final double COREIMAGE_SUPPORTS_IOSURFACE = 1.0;
    @Generated public static final double UNIFIED_CORE_IMAGE = 1.0;
}
