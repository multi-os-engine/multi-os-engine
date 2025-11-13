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
     * If [NSNull null] then don't color manage the image.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageColorSpace();

    /**
     * A NSDictionary of metadata properties to pass to CIImage initialization methods.
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
     * A Core Image context option key to specify the default destination color space for rendering.
     * 
     * This option only affects how Core Image renders using the following methods:
     * * ``/CIContext/createCGImage:fromRect:``
     * * ``/CIContext/drawImage:atPoint:fromRect:``
     * * ``/CIContext/drawImage:inRect:fromRect:``
     * 
     * With all other render methods, the destination color space is either specified as a parameter
     * or can be determined from the object being rendered to.
     * 
     * The value of this option can be either:
     * * A `CGColorSpace` instance with an RGB or monochrome color model that supports output.
     * * An `NSNull` instance to indicate that the context should not match from the working space to the destination.
     * 
     * If this option is not specified, then the default output space is sRGB.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextOutputColorSpace();

    /**
     * A Core Image context option key to specify the working color space for rendering.
     * 
     * Contexts support automatic color management by performing all processing operations
     * in a working color space. This means that unless told otherwise:
     * * All input images are color matched from the input's color space to the working space.
     * * All renders are color matched from the working space to the destination's color space.
     * 
     * The default working space is the extended sRGB color space with linear gamma.
     * On macOS before 10.10, the default is extended Generic RGB with linear gamma.
     * 
     * The value of this option can be either:
     * * A `CGColorSpace` instance with an RGB color model that supports output.
     * * An `NSNull` instance to request that Core Image perform no color management.
     * 
     * If this option is not specified, then the default working space is used.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextWorkingColorSpace();

    /**
     * A Core Image context option key to specify the pixel format to for intermediate results when rendering.
     * 
     * The value for this key is an `NSNumber` instance containing a ``CIFormat`` value.
     * 
     * The supported values for the working pixel format are:
     * ``CIFormat`` | Notes
     * ------------------- | --------------
     * ``kCIFormatRGBA8`` | Uses less memory but has less precision an range
     * ``kCIFormatRGBAh`` | Uses 8 bytes per pixel, supports HDR
     * ``kCIFormatRGBAf`` | Only on macOS
     * 
     * If this option is not specified, then the default is ``kCIFormatRGBAh``.
     * 
     * (The default is ``kCIFormatRGBA8`` if your if app is linked against iOS 12 SDK or earlier.)
     * 
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextWorkingFormat();

    /**
     * A Boolean value to control the quality of image downsampling operations performed by the
     * Core Image context.
     * 
     * The higher quality behavior performs downsampling operations in multiple passes
     * in order to reduce aliasing artifacts.
     * 
     * The lower quality behavior performs downsampling operations a single pass
     * in order to improve performance.
     * 
     * If the value for this option is:
     * * True: The higher quality behavior will be used.
     * * False: The lower quality behavior will be used.
     * * Not specified: the default behavior is True on macOS and False on other platforms.
     * 
     * > Note:
     * > * This option does affect how ``/CIImage/imageByApplyingTransform:`` operations are performed by the context.
     * > * This option does not affect how ``/CIImage/imageByApplyingTransform:highQualityDownsample:`` behaves.
     * 
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextHighQualityDownsample();

    /**
     * A Boolean value to control how a Core Image context render produces alpha-premultiplied pixels.
     * 
     * This option only affects how a context is rendered when using methods where the destination's
     * alpha mode cannot be determined such as:
     * * ``/CIContext/render:toBitmap:rowBytes:bounds:format:colorSpace:``
     * * ``/CIContext/render:toCVPixelBuffer:``
     * * ``/CIContext/render:toIOSurface:bounds:colorSpace:``
     * * ``/CIContext/render:toMTLTexture:commandBuffer:bounds:colorSpace:``
     * * ``/CIContext/createCGImage:fromRect:``
     * 
     * If the value for this option is:
     * * True: The output will produce alpha-premultiplied pixels.
     * * False: The output will produce un-premultiplied pixels.
     * * Not specified: the default behavior True.
     * 
     * This option does not affect how a context is rendered to a ``CIRenderDestination`` because
     * that API allows you to set or override the alpha behavior using ``/CIRenderDestination/alphaMode``.
     * 
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextOutputPremultiplied();

    /**
     * A Boolean value to control how a Core Image context caches the contents of any intermediate image buffers it uses
     * during rendering.
     * 
     * If a context caches intermediate buffers, then subsequent renders of a similar image using the same context
     * may be able to render faster. If a context does not cache intermediate buffers, then it may use less memory.
     * 
     * If the value for this option is:
     * * True: The context will cache intermediate results for future renders using the same context.
     * * False: The context will not cache intermediate results.
     * * Not specified: the default behavior True.
     * 
     * > Note:
     * > * This option does affect how ``/CIImage/imageByInsertingIntermediate`` behaves.
     * > * This option does not affect how ``/CIImage/imageByInsertingIntermediate:`` behaves.
     * 
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextCacheIntermediates();

    /**
     * A Boolean value to control if a Core Image context will use a software renderer.
     * 
     * > Note: This option has no effect if the platform does not support OpenCL.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextUseSoftwareRenderer();

    /**
     * A Boolean value to control the priority Core Image context renders.
     * 
     * If this value is True, then rendering with the context from a background thread takes lower priority
     * than other GPU usage from the main thread. This allows your app to perform Core Image rendering without
     * disturbing the frame rate of UI animations.
     * 
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
     * Constant for requesting controls that are appropriate in a basic user scenario, meaning the bare minimum of
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
     * Constant for requesting controls that are appropriate in an intermediate user scenario.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIUISetIntermediate();

    /**
     * Constant for requesting controls that are appropriate in an advanced user scenario.
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
     * A key to get the output image of a Core Image filter.
     * 
     * The value for this key will be a ``CIImage`` instance.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIOutputImageKey();

    /**
     * A key to get or set the background image of a Core Image filter.
     * 
     * The value for this key needs to be a ``CIImage`` instance.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputBackgroundImageKey();

    /**
     * A key to get or set the input image of a Core Image filter.
     * 
     * The value for this key needs to be a ``CIImage`` instance.
     * For filters that also use a background image, this key refers to the foreground image.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputImageKey();

    /**
     * A key to get or set the scalar time value of a Core Image filter.
     * 
     * The value for this key needs to be an `NSNumber` instance.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputTimeKey();

    /**
     * A key to get or set the geometric 2x3 matrix transform value of a Core Image filter.
     * The value for this key needs to be an `NSAffineTransformStruct` or an `NSValue` instance.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputTransformKey();

    /**
     * A key to get or set the geometric scale value of a Core Image filter.
     * 
     * The value for this key needs to be an `NSNumber` instance.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputScaleKey();

    /**
     * A key to get or set the geometric aspect ratio value of a Core Image filter.
     * The value for this key needs to be an `NSNumber` instance containing the `horizontal/vertical` scale ratio .
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputAspectRatioKey();

    /**
     * A key to get or set the center value of a Core Image filter.
     * The value for this key needs to be a ``CIVector`` instance containing the `x,y` coordinate.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputCenterKey();

    /**
     * A key to get or set the geometric radius value of a Core Image filter.
     * 
     * The value for this key needs to be an `NSNumber` instance.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputRadiusKey();

    /**
     * A key to get or set the geometric angle value of a Core Image filter. Typically the angle is in radians.
     * 
     * The value for this key needs to be an `NSNumber` instance.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputAngleKey();

    /**
     * A key to get or set the scalar optical refraction value of a Core Image filter.
     * 
     * The value for this key needs to be an `NSNumber` instance.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputRefractionKey();

    /**
     * A key to get or set the geometric width value of a Core Image filter.
     * 
     * The value for this key needs to be an `NSNumber` instance.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputWidthKey();

    /**
     * A key to get or set the scalar sharpness value of a Core Image filter.
     * 
     * The value for this key needs to be an `NSNumber` instance.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputSharpnessKey();

    /**
     * A key to get or set the scalar intensity value of a Core Image filter.
     * 
     * The value for this key needs to be an `NSNumber` instance.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputIntensityKey();

    /**
     * A key to get or set the scalar EV value of a Core Image filter that specifies how many F-stops brighter or darker
     * to make the image.
     * 
     * The value for this key needs to be an `NSNumber` instance.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputEVKey();

    /**
     * A key to get or set the scalar saturation value of a Core Image filter.
     * 
     * The value for this key needs to be an `NSNumber` instance.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputSaturationKey();

    /**
     * A key to get or set the color value of a Core Image filter.
     * 
     * The value for this key needs to be a ``CIColor`` instance.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputColorKey();

    /**
     * A key to get or set the scalar brightness value of a Core Image filter.
     * 
     * The value for this key needs to be an `NSNumber` instance.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputBrightnessKey();

    /**
     * A key to get or set the scalar contrast value of a Core Image filter.
     * 
     * The value for this key needs to be an `NSNumber` instance.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputContrastKey();

    /**
     * A key to get or set the scalar bias value of a Core Image filter.
     * 
     * The value for this key needs to be an `NSNumber` instance.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputBiasKey();

    /**
     * A key to get or set the vector weights value of a convolution Core Image filter.
     * 
     * The value for this key needs to be a ``CIVector`` instance.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputWeightsKey();

    /**
     * A key to get or set the gradient map image of a Core Image filter that maps luminance to a color with alpha.
     * 
     * The value for this key needs to be a 1 pixel tall ``CIImage`` instance.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputGradientImageKey();

    /**
     * A key to get or set the mask image of a Core Image filter.
     * 
     * The value for this key needs to be a ``CIImage`` instance.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputMaskImageKey();

    /**
     * A key to get or set the environment map image of a Core Image filter that maps normal directions to a color with
     * alpha.
     * 
     * The value for this key needs to be a ``CIImage`` instance.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputShadingImageKey();

    /**
     * A key to get or set the target image for a transition Core Image filter.
     * 
     * The value for this key needs to be a ``CIImage`` instance.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputTargetImageKey();

    /**
     * A key to get or set the vector extent value of a Core Image filterthat defines the extent of the effect.
     * The value for this key needs to be a ``CIVector`` instance.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputExtentKey();

    /**
     * A key to get or set a coordinate value of a Core Image filter.
     * The value for this key needs to be a ``CIVector`` instance containing the `x,y` coordinate.
     * 
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
     * Specifies a detector type for text detection.
     * 
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
     * A dictionary key that configures a Core Image feature detection operation
     * to account for the orientation the image.
     * 
     * This option is used with ``/CIDetector/featuresInImage:options:``
     * 
     * The value of this key is an number object whose value is an integer between 1 and 8.
     * The TIFF and EXIF specifications define the orientation values that describe how the image should be displayed.
     * The default value is 1. For further details, see `CGImagePropertyOrientation`.
     * 
     * The ``CIDetectorTypeFace`` and ``CIDetectorTypeText`` can use this option to correctly find faces or text.
     * 
     * Regardless of the orientation values the ``/CIFeature/bounds-property`` which is always measured in
     * the cartesean coordinates system of the image that you pass to the detector.
     * 
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorImageOrientation();

    /**
     * A dictionary key that configures a Core Image face feature detection operation
     * to perform additional processing to recognize closed eyes in detected faces.
     * 
     * This option is used with ``/CIDetector/featuresInImage:options:``
     * 
     * If the value of the key is true, then facial expressions such as blinking and smiles are extracted.
     * This is needed for the ``/CIFaceFeature/leftEyeClosed-property`` and ``/CIFaceFeature/rightEyeClosed-property``
     * to function.
     * 
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorEyeBlink();

    /**
     * A dictionary key that configures a Core Image face feature detection operation
     * to perform additional processing to recognize smiles in detected faces.
     * 
     * This option is used with ``/CIDetector/featuresInImage:options:``
     * 
     * If the value of the key is true, then facial expressions such as blinking and smiles eyes are extracted.
     * This is needed for the ``/CIFaceFeature/hasSmile-property`` to function.
     * 
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorSmile();

    /**
     * A dictionary key that configures a Core Image rectangle feature detection operation
     * to account for the focal length of the camera used for the image.
     * 
     * This option is used with ``/CIDetector/featuresInImage:options:``
     * 
     * The value of this key is an NSNumber object whose value is a floating-point number. Use this option with the
     * CIDetectorTypeRectangle
     * detector type to control the effect of the CIDetectorAspectRatio option on feature detection.
     * 
     * This option’s value can be 0.0, -1.0, or any positive value:
     * * The special value of -1.0 (the default) disables the aspect ratio test for the returned rectangle.
     * * The special value of 0.0 enables a less precise test of aspect ratio that approximates an orthographic
     * (non-perspective) projection.
     * Use this value if you want to specify the aspect ratio of the rectangle via the CIDetectorAspectRatio option, but
     * have no means of
     * determining the value for the focal length in pixels. See below for a method to compute an approximate value for
     * the focal length in pixels.
     * * Any other value specifies the camera focal length, in pixels, allowing the aspect ratio specification to
     * account for perspective distortion
     * of rectangles in the input image.
     * 
     * If you know the diagonal field of view of the camera (the scene angle subtended by the diagonal corners of an
     * image), you can use the
     * following formula to compute an approximate focal length in pixels:
     * 
     * `focal_length_pixels = (image_diagonal_pixels/2)/tan(FOV/2)`
     * 
     * In this formula, `image_diagonal_pixels` is the length (in pixels) of the image diagonal of the maximum
     * resolution of the camera sensor.
     * For example, this value is:
     * * `4080` pixels for a `3264 x 2448` (8 megapixel) sensor
     * * `5000` pixels for a `4096 x 3024` (12 megapixel) sensor.
     * 
     * To measure diagonal field of view, put the camera on a tripod so that it is perpendicular to a surface and the
     * center of the image is
     * oriented on a mark on the surface. Measure the distance from the mark to one of the corner points of the image
     * (Y). Measure the distance
     * from the camera to the surface (Z). The field of view is then `2*arctan(Y/Z)`.
     * 
     * You must specify this value in terms of the maximum sensor resolution. If the supplied CIImage has been scaled
     * relative relative to the
     * maximum sensor resolution, the supplied focal length must also be similarly scaled.
     * 
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorFocalLength();

    /**
     * A dictionary key that configures a Core Image rectangle feature detection operation
     * to search for a rectangle of a desired aspect ratio (width divided by height).
     * 
     * This option is used with ``/CIDetector/featuresInImage:options:``
     * 
     * The value for this key needs to be is a positive float number.
     * Use this option with a ``CIDetectorTypeRectangle`` detector to fine-tune the accuracy of the detector.
     * 
     * For example, to more accurately find a business card (3.5 x 2 inches) in an image, specify an aspect ratio of
     * 1.75.
     * 
     * If this key is not specified, the a default value of 1.6 is used.
     * 
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorAspectRatio();

    /**
     * A dictionary key that configures a Core Image text feature detection operation
     * to return feature information for components of detected features.
     * 
     * This option is used with ``/CIDetector/featuresInImage:options:``
     * 
     * If the value for this option configures the ``CIDetectorTypeText`` detector as follows:
     * * False: detect only in regions likely to contain text.
     * * True: detect in regions likely to contain individual characters.
     * 
     * If this key is not specified, the a default is False.
     * 
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIDetectorReturnSubFeatures();

    /**
     * A Core Image feature type for person’s face.
     * 
     * To detect faces in an image or video, pass this to ``/CIDetector/detectorOfType:context:options:``
     * 
     * Use the ``CIFaceFeature`` class to find more information about the detected face.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIFeatureTypeFace();

    /**
     * A Core Image feature type for rectangular object.
     * 
     * To detect rectangles in an image or video, pass this to ``/CIDetector/detectorOfType:context:options:``
     * 
     * Use the ``CIRectangleFeature`` class to find more information about the detected rectangle.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIFeatureTypeRectangle();

    /**
     * A Core Image feature type for QR code object.
     * 
     * To detect QR codes in an image or video, pass this to ``/CIDetector/detectorOfType:context:options:``
     * 
     * Use the ``CIQRCodeFeature`` class to find more information about the detected QR code.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIFeatureTypeQRCode();

    /**
     * A Core Image feature type for text.
     * 
     * To detect text in an image or video, pass this to ``/CIDetector/detectorOfType:context:options:``
     * 
     * Use the ``CITextFeature`` class to find more information about the detected text.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CIFeatureTypeText();

    /**
     * Specifies the tile size that the Provide Image Data method will be called for.
     * 
     * This key and its value may be passed to:
     * * ``/CIImage/imageWithImageProvider:size::format:colorSpace:options:``
     * * ``/CIImage/initWithImageProvider:size::format:colorSpace:options:``
     * 
     * If the value of this key is:
     * Value | Behavior of sub-rect passed to ``provideImageData:bytesPerRow:origin::size::userData:``
     * -------------------------- | ----------------------------
     * Not specified | the entire image
     * `NSNumber` | square tiles of size x size
     * `NSArray` with 2 numbers | rectangular tiles of width x height.
     * ``CIVector`` with 2 values | rectangular tiles of width x height.
     * `NSNull` | can be called for any possible origin and size.
     * 
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageProviderTileSize();

    /**
     * A key for any data needed by the image provider object.
     * The associated value is an object that contains the needed data.
     * 
     * This key and its value may be passed to:
     * * ``/CIImage/imageWithImageProvider:size::format:colorSpace:options:``
     * * ``/CIImage/initWithImageProvider:size::format:colorSpace:options:``
     * 
     * The value object is retained until the image is deallocated.
     * 
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
     * A boolean value specifying how the image should sampled.
     * If this option value is @YES, then the image will be sampled using nearest neighbor sampling.
     * If this option value is @NO, then the image will be sampled using bilinear interpolation.
     * If this option is not specified, then it will behave as if @NO was specified.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageNearestSampling();

    /**
     * A boolean value specifying that the image should transformed according to orientation metadata.
     * This option is supported by:
     * imageWithContentsOfURL:options:, initWithContentsOfURL:options,
     * imageWithData:options:, initWithData:options:,
     * imageWithCGImageSource:options:, initWithCGImageSource:options:
     * when the image data contains orientation metadata or by any initialization method
     * if the kCIImageProperties option is also provided.
     * 
     * If this option value is @YES, the image will transformed according to the orientation metadata
     * and the orientation metadata will be be removed.
     * If this option value is @NO, then the image will not be transformed
     * and the orientation metadata will left unaltered.
     * If this option is not specified, then it will behave as if @NO was specified.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageApplyOrientationProperty();

    /**
     * The kCIImageAuxiliary keys specify that an auxiliary image be returned instead of the primary image.
     * These options are supported by:
     * imageWithContentsOfURL:options:, initWithContentsOfURL:options,
     * imageWithData:options:, initWithData:options:,
     * imageWithCGImageSource:options:, initWithCGImageSource:options:
     * 
     * If the value of any of these keys is @YES, the auxiliary image be returned if present.
     * The returned image will be a monochrome image.
     * 
     * The kCIImageAuxiliaryHDRGainMap option will return as a CIImage the auxiliary data returned
     * by either kCGImageAuxiliaryDataTypeHDRGainMap or kCGImageAuxiliaryDataTypeISOGainMap.
     * If the file contains both gain maps, then the kCGImageAuxiliaryDataTypeISOGainMap data is returned.
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
     * An optional key and value to save additional depth channel information to a JPEG or HEIF representations.
     * 
     * The value for this key needs to be an `AVDepthData` instance.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationAVDepthData();

    /**
     * An optional key and value to save additional depth channel information to a JPEG or HEIF.
     * 
     * The value for this key needs to be a monochrome depth ``CIImage`` instance.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationDepthImage();

    /**
     * An optional key and value to save additional depth channel information to a JPEG or HEIF.
     * 
     * The value for this key needs to be a monochrome disparity ``CIImage`` instance.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationDisparityImage();

    /**
     * A key to get or set the depth map image of a Core Image filter.
     * 
     * The value for this key needs to be a ``CIImage`` instance.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputDepthImageKey();

    /**
     * A key to get or set the disparity map image of a Core Image filter.
     * 
     * The value for this key needs to be a ``CIImage`` instance.
     * 
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
     * A Boolean value to control the power level of Core Image context renders.
     * 
     * This option only affects certain macOS devices with more than one available GPU device.
     * 
     * If this value is True, then rendering with the context will use a use allow power GPU device
     * if available and the high power device is not already in use.
     * 
     * Otherwise, the context will use the highest power/performance GPU device.
     * 
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIContextAllowLowPower();

    /**
     * An optional key and value to save a portrait matte channel information to a JPEG or HEIF.
     * 
     * The value for this key needs to be a an `AVPortraitEffectsMatte` instance.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationAVPortraitEffectsMatte();

    /**
     * An optional key and value to save a portrait matte channel to a JPEG or HEIF.
     * 
     * The value for this key needs to be a portrait matte ``CIImage`` instance where black pixels
     * represent the background region and white pixels represent the primary people in the image.
     * The image will be converted to monochrome before it is saved to the JPEG or HEIF.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationPortraitEffectsMatteImage();

    /**
     * An optional key and value to save one or more segmentation matte channels to a JPEG or HEIF.
     * 
     * The value for this key needs to be an array of AVSemanticSegmentationMatte instances.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationAVSemanticSegmentationMattes();

    /**
     * An optional key and value to save a skin segmentation channel to a JPEG or HEIF.
     * 
     * The value for this key needs to be a ``CIImage`` instance where white pixels
     * represent the areas of person's skin are found in the image.
     * The image will be converted to monochrome before it is saved to the JPEG or HEIF.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationSemanticSegmentationSkinMatteImage();

    /**
     * An optional key and value to save a skin segmentation channel to a JPEG or HEIF.
     * 
     * The value for this key needs to be a ``CIImage`` instance where white pixels
     * represent the areas of person's head and facial hair are found in the image.
     * The image will be converted to monochrome before it is saved to the JPEG or HEIF.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationSemanticSegmentationHairMatteImage();

    /**
     * An optional key and value to save a skin segmentation channel to a JPEG or HEIF.
     * 
     * The value for this key needs to be a ``CIImage`` instance where white pixels
     * represent the areas where a person's teeth are found in the image.
     * The image will be converted to monochrome before it is saved to the JPEG or HEIF.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIImageRepresentationSemanticSegmentationTeethMatteImage();

    /**
     * A key to get or set the scalar amount value of a Core Image filter.
     * 
     * The value for this key needs to be an `NSNumber` instance.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCIInputAmountKey();

    /**
     * A key to get or set the matte image of a Core Image filter.
     * 
     * The value for this key needs to be a ``CIImage`` instance.
     * 
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
     * A Boolean value to specify a client-provided name for a context.
     * 
     * This name will be used in QuickLook graphs and the output of CI_PRINT_TREE.
     * 
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
     * 
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
     * An optional key and value to save a skin segmentation channel to a JPEG or HEIF.
     * 
     * The value for this key needs to be a ``CIImage`` instance where white pixels
     * represent the areas where a person's glasses are found in the image.
     * The image will be converted to monochrome before it is saved to the JPEG or HEIF.
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
     * An optional key and value to save a skin segmentation channel to a JPEG or HEIF.
     * 
     * The value for this key needs to be a ``CIImage`` instance where white pixels
     * represent the areas where a person's skin are found in the image.
     * The image will be converted to monochrome before it is saved to the JPEG or HEIF.
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

    /**
     * API-Since: 14.2
     */
    @Generated
    @CVariable()
    public static native int kCIFormatRGBX16();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatRGBXh();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatRGBXf();

    /**
     * RGB101010 stored in little-endian 32bit int, 2 MSB are ignored, full-range (0-1024)
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    public static native int kCIFormatRGB10();

    /**
     * A boolean value specifying whether the image should be expanded to HDR if the image content support this.
     * This option is supported by:
     * imageWithContentsOfURL:options:, initWithContentsOfURL:options,
     * imageWithData:options:, initWithData:options:,
     * 
     * If this option value is @YES, the image will expanded to a HDR colorspace if supported.
     * If this option not present or the value is @NO, then the image will not be transformed.
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIImageExpandToHDR();

    /**
     * A boolean value specifying when the the image should be decoded.
     * This option is supported by:
     * imageWithContentsOfURL:options:, initWithContentsOfURL:options,
     * imageWithData:options:, initWithData:options:,
     * imageWithCGImage:options:, initWithCGImage:options:,
     * imageWithCGImageSource:options:, initWithCGImageSource:options:
     * 
     * If this option value is @YES, then if possible the image will be decoded into a non-volatile cache at
     * initialization time.
     * If this option value is @NO, then the image will be decoded into a volatile cache at render time.
     * If not specified, CoreImage will decide when the image should be decoded.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIImageCacheImmediately();

    /**
     * API-Since: 14.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIImageAuxiliaryHDRGainMap();

    /**
     * A number value to control the maximum memory in megabytes that the context allocates for render tasks.
     * 
     * Larger values could increase memory footprint while smaller values could reduce performance.
     * 
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIContextMemoryLimit();

    @Generated public static final double COREIMAGE_SUPPORTS_OPENGLES = 1.0;

    /**
     * A value for overriding the automatic behavior of the Content Headroom property
     * when creating an image.
     * 
     * The value for this key should be an `NSNumber` instance.
     * 
     * API-Since: 18.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIImageContentHeadroom();

    /**
     * An optional key and value to save a HDR image using the gain map channel to a JPEG or HEIF.
     * 
     * The value for this key needs to be a HDR CIImage instance.
     * 
     * When provided, Core Image will calculate a gain map auxiliary image
     * from the ratio of the HDR image to the primary SDR image.
     * 
     * If the the HDR ``CIImage`` instance has a ``/CIImage/contentHeadroom`` property,
     * then that will be used when calculating the HDRGainMap image and metadata.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIImageRepresentationHDRImage();

    /**
     * An optional key and value to save a gain map channel to a JPEG or HEIF.
     * 
     * The value for this key needs to be a monochrome ``CIImage`` instance.
     * 
     * If the ``kCIImageRepresentationHDRGainMapAsRGB`` option it true, then it needs to
     * be an RGB ``CIImage`` instance.
     * 
     * The ``/CIImage/properties`` should contain metadata information equivalent to what is returned when
     * initializing an image using ``kCIImageAuxiliaryHDRGainMap``.
     * 
     * 
     * API-Since: 14.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIImageRepresentationHDRGainMapImage();

    @Generated
    @CVariable()
    public static native int kCIFormatRGBX8();

    /**
     * A Boolean value to control whether an image created with a CVPixelBuffer or an IOSurface
     * should be cropped and offset according clean aperture attachments.
     * 
     * For a `CVPixelBuffer` this will use `kCVImageBufferPreferredCleanApertureKey`
     * or `kCVImageBufferCleanApertureKey`.
     * 
     * If the value for this option is:
     * * True: then image will be cropped and offset to the clean aperture.
     * * False: then the full image is returned.
     * * ``CIVector`` : then use it as a `CGRect` to crop and offset.
     * * Not specified : then it will behave as if False was specified.
     * 
     * 
     * API-Since: 19.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIImageApplyCleanAperture();

    /**
     * A value for overriding the automatic behavior of the Content Average Light Level property
     * when creating an image.
     * 
     * The value for this key should be an `NSNumber` instance.
     * 
     * API-Since: 19.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIImageContentAverageLightLevel();

    /**
     * A Core Video Metal texture cache object to improve the performance of Core Image context
     * renders that use Core Video pixel buffers.
     * 
     * Creating a Core Image context with this optional `CVMetalTextureCache` can improve the
     * performance of creating a Metal texture from a `CVPixelBuffer`. It is recommended
     * to specify this option if the context renders to or from pixel buffers that come
     * from a `CVPixelBufferPool`.
     * 
     * It is the client's responsibility to flush the cache when appropriate.
     * 
     * 
     * API-Since: 19.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIContextCVMetalTextureCache();

    /**
     * An optional key and value to request the gain map channel to be color instead of monochrome.
     * 
     * This key affects how the gain map image is calculated from the SDR receiver and
     * the ``kCIImageRepresentationHDRImage`` image value.
     * 
     * The value for this is a Boolean where:
     * * True: the gain map is created as a color ratio between the HDR and SDR images.
     * * False: the gain map is created as a brightness ratio between the HDR and SDR images.
     * * Not specified: the default behavior False.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIImageRepresentationHDRGainMapAsRGB();

    /**
     * A key to get or set the scalar count value of a Core Image filter.
     * 
     * The value for this key needs to be an integer `NSNumber` instance.
     * 
     * API-Since: 19.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIInputCountKey();

    /**
     * A key to get or set the scalar threshold value of a Core Image filter.
     * 
     * The value for this key needs to be an `NSNumber` instance.
     * 
     * API-Since: 19.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIInputThresholdKey();

    /**
     * A key to get or set the geometric radius value of a Core Image filter.
     * 
     * The value for this key needs to be an `NSNumber` instance.
     * 
     * API-Since: 19.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIInputRadius0Key();

    /**
     * A key to get or set the geometric radius value of a Core Image filter.
     * 
     * The value for this key needs to be an `NSNumber` instance.
     * 
     * API-Since: 19.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIInputRadius1Key();

    /**
     * A key to get or set a color value of a Core Image filter.
     * 
     * The value for this key needs to be a ``CIColor`` instance.
     * 
     * API-Since: 19.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIInputColor0Key();

    /**
     * A key to get or set a color value of a Core Image filter.
     * 
     * The value for this key needs to be a ``CIColor`` instance.
     * 
     * API-Since: 19.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIInputColor1Key();

    /**
     * A key to get or set a color space value of a Core Image filter.
     * 
     * The value for this key needs to be a `CGColorSpace` instance.
     * 
     * API-Since: 19.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIInputColorSpaceKey();

    /**
     * A key to get or set the boolean behavior of a Core Image filter that specifies if the filter should extrapolate a
     * table beyond the defined range.
     * 
     * The value for this key needs to be an `NSNumber` instance.
     * 
     * API-Since: 19.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIInputExtrapolateKey();

    /**
     * A key to get or set the boolean behavior of a Core Image filter that specifies if the filter should operate in
     * linear or perceptual colors.
     * 
     * The value for this key needs to be an `NSNumber` instance.
     * 
     * API-Since: 19.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIInputPerceptualKey();

    /**
     * A key to get or set the vector bias value of a Core Image filter.
     * 
     * The value for this key needs to be a ``CIVector`` instance.
     * 
     * API-Since: 19.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIInputBiasVectorKey();

    /**
     * A key to get or set the backside image for a transition Core Image filter.
     * 
     * The value for this key needs to be a ``CIImage`` instance.
     * 
     * API-Since: 19.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIInputBacksideImageKey();

    /**
     * A key to get or set the palette image for a Core Image filter.
     * 
     * The value for this key needs to be a 1 pixel tall ``CIImage`` instance.
     * 
     * API-Since: 19.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIInputPaletteImageKey();

    /**
     * A key to get or set the coordinate value of a Core Image filter.
     * The value for this key needs to be a ``CIVector`` instance containing the `x,y` coordinate.
     * 
     * API-Since: 19.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIInputPoint0Key();

    /**
     * A key to get or set a coordinate value of a Core Image filter.
     * The value for this key needs to be a ``CIVector`` instance containing the `x,y` coordinate.
     * 
     * API-Since: 19.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIInputPoint1Key();

    /**
     * Use Standard dynamic range.
     * 
     * Images with `contentHeadroom` metadata will be tone mapped to a maximum pixel value of 1.0.
     * 
     * API-Since: 19.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIDynamicRangeStandard();

    /**
     * Use extended dynamic range, but brightness is modulated to optimize for
     * co-existence with other composited content.
     * 
     * For best results, images should contain `contentAverageLightLevel` metadata.
     * 
     * API-Since: 19.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIDynamicRangeConstrainedHigh();

    /**
     * Use High dynamic range.
     * 
     * The provides the best HDR quality and needs to be reserved
     * for situations where the user is focused on the media, such as larger views in
     * an image editing/viewing app, or annotating/drawing with HDR colors
     * 
     * API-Since: 19.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String kCIDynamicRangeHigh();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String CIRAWDecoderVersion9();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String CIRAWDecoderVersion9DNG();
}
