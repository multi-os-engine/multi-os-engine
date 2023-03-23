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

package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.opaque.CMFormatDescriptionRef;
import apple.coremedia.struct.CMTime;
import apple.coremedia.struct.CMVideoDimensions;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
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
import apple.foundation.NSValue;

/**
 * AVCaptureDeviceFormat
 * 
 * An AVCaptureDeviceFormat wraps a CMFormatDescription and other format-related information, such as min and max
 * framerate.
 * 
 * An AVCaptureDevice exposes an array of formats, and its current activeFormat may be queried. The payload for the
 * formats property is an array of AVCaptureDeviceFormat objects and the activeFormat property payload is an
 * AVCaptureDeviceFormat. AVCaptureDeviceFormat is a thin wrapper around a CMFormatDescription, and can carry associated
 * device format information that doesn't go in a CMFormatDescription, such as min and max frame rate. An
 * AVCaptureDeviceFormat object is immutable. Its values do not change for the life of the object.
 * 
 * API-Since: 7.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureDeviceFormat extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureDeviceFormat(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureDeviceFormat alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVCaptureDeviceFormat allocWithZone(VoidPtr zone);

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
    public static native AVCaptureDeviceFormat new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

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
     * [@property] autoFocusSystem
     * 
     * A property indicating the autofocus system.
     * 
     * This read-only property indicates the autofocus system.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("autoFocusSystem")
    @NInt
    public native long autoFocusSystem();

    /**
     * [@property] formatDescription
     * 
     * A CMFormatDescription describing an AVCaptureDevice active or supported format.
     * 
     * A CMFormatDescription describing an AVCaptureDevice active or supported format. This is a read-only property. The
     * caller assumes no ownership of the returned value and should not CFRelease it.
     */
    @Generated
    @Selector("formatDescription")
    public native CMFormatDescriptionRef formatDescription();

    /**
     * [@property] highResolutionStillImageDimensions
     * 
     * CMVideoDimensions indicating the highest resolution still image that can be produced by this format.
     * 
     * By default, AVCapturePhotoOutput and AVCaptureStillImageOutput emit images with the same dimensions as their
     * source AVCaptureDevice's activeFormat.formatDescription property. Some device formats support high resolution
     * photo output. That is, they can stream video to an AVCaptureVideoDataOutput or AVCaptureMovieFileOutput at one
     * resolution while outputting photos to AVCapturePhotoOutput at a higher resolution. You may query this property to
     * discover a video format's supported high resolution still image dimensions. See -[AVCapturePhotoOutput
     * highResolutionPhotoEnabled], -[AVCapturePhotoSettings highResolutionPhotoEnabled], and
     * -[AVCaptureStillImageOutput highResolutionStillImageOutputEnabled].
     * 
     * AVCaptureDeviceFormats of type AVMediaTypeDepthData may also support the delivery of a higher resolution depth
     * data map to an AVCapturePhotoOutput. Chief differences are:
     * - Depth data accompanying still images is not supported by AVCaptureStillImageOutput. You must use
     * AVCapturePhotoOutput.
     * - By opting in for depth data ( -[AVCapturePhotoSettings setDepthDataDeliveryEnabled:YES] ), you implicitly opt
     * in for high resolution depth data if it's available. You may query the -[AVCaptureDevice activeDepthDataFormat]'s
     * highResolutionStillImageDimensions to discover the depth data resolution that will be delivered with captured
     * photos.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Use supportedMaxPhotoDimensions instead.
     */
    @Deprecated
    @Generated
    @Selector("highResolutionStillImageDimensions")
    @ByValue
    public native CMVideoDimensions highResolutionStillImageDimensions();

    @Generated
    @Selector("init")
    public native AVCaptureDeviceFormat init();

    /**
     * [@property] videoBinned
     * 
     * A property indicating whether the format is binned.
     * 
     * videoBinned is a BOOL indicating whether the format is a binned format. Binning is a pixel-combining process
     * which can result in greater low light sensitivity at the cost of reduced resolution.
     */
    @Generated
    @Selector("isVideoBinned")
    public native boolean isVideoBinned();

    /**
     * [@property] videoHDRSupported
     * 
     * A property indicating whether the format supports high dynamic range streaming.
     * 
     * videoHDRSupported is a BOOL indicating whether the format supports high dynamic range streaming, also known as
     * Extended Dynamic Range (EDR). When enabled, the device streams at twice the published frame rate, capturing an
     * under-exposed frame and correctly exposed frame for each frame time at the published rate. Portions of the
     * under-exposed frame are combined with the correctly exposed frame to recover detail in darker areas of the scene.
     * EDR is a separate and distinct feature from 10-bit HDR video (first seen in 2020 iPhones). 10-bit formats with
     * HLG BT2020 color space have greater dynamic range by virtue of their expanded bit depth and HLG transfer
     * function, and when captured in movies, contain Dolby Vision metadata. They are, in effect, "always on" HDR. And
     * thus the videoHDRSupported property is always NO for 10-bit formats only supporting HLG BT2020 colorspace, since
     * HDR cannot be enabled or disabled. To enable videoHDR (EDR), set the AVCaptureDevice.videoHDREnabled property.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("isVideoHDRSupported")
    public native boolean isVideoHDRSupported();

    /**
     * isVideoStabilizationModeSupported
     * 
     * Returns whether the format supports the given video stabilization mode.
     * 
     * isVideoStabilizationModeSupported: returns a boolean value indicating whether the format can be stabilized using
     * the given mode with -[AVCaptureConnection setPreferredVideoStabilizationMode:].
     * 
     * API-Since: 8.0
     * 
     * @param videoStabilizationMode
     *                               An AVCaptureVideoStabilizationMode to be checked.
     */
    @Generated
    @Selector("isVideoStabilizationModeSupported:")
    public native boolean isVideoStabilizationModeSupported(@NInt long videoStabilizationMode);

    /**
     * [@property] videoStabilizationSupported
     * 
     * A property indicating whether the format supports video stabilization.
     * 
     * videoStabilizationSupported is a BOOL indicating whether the format can be stabilized using AVCaptureConnection
     * -setEnablesVideoStabilizationWhenAvailable. This property is deprecated. Use isVideoStabilizationModeSupported:
     * instead.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use isVideoStabilizationModeSupported: instead.
     */
    @Generated
    @Deprecated
    @Selector("isVideoStabilizationSupported")
    public native boolean isVideoStabilizationSupported();

    /**
     * [@property] maxExposureDuration
     * 
     * A CMTime indicating the maximum supported exposure duration.
     * 
     * This read-only property indicates the maximum supported exposure duration.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("maxExposureDuration")
    @ByValue
    public native CMTime maxExposureDuration();

    /**
     * [@property] maxISO
     * 
     * An float indicating the maximum supported exposure ISO value.
     * 
     * This read-only property indicates the maximum supported exposure ISO value.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("maxISO")
    public native float maxISO();

    /**
     * [@property] mediaType
     * 
     * An NSString describing the media type of an AVCaptureDevice active or supported format.
     * 
     * Supported mediaTypes are listed in AVMediaFormat.h. This is a read-only property. The caller assumes no ownership
     * of the returned value and should not CFRelease it.
     */
    @Generated
    @Selector("mediaType")
    public native String mediaType();

    /**
     * [@property] minExposureDuration
     * 
     * A CMTime indicating the minimum supported exposure duration.
     * 
     * This read-only property indicates the minimum supported exposure duration.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("minExposureDuration")
    @ByValue
    public native CMTime minExposureDuration();

    /**
     * [@property] minISO
     * 
     * A float indicating the minimum supported exposure ISO value.
     * 
     * This read-only property indicates the minimum supported exposure ISO value.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("minISO")
    public native float minISO();

    /**
     * [@property] supportedColorSpaces
     * 
     * A property indicating the receiver's supported color spaces.
     * 
     * This read-only property indicates the receiver's supported color spaces as an array of AVCaptureColorSpace
     * constants sorted from narrow to wide color.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("supportedColorSpaces")
    public native NSArray<? extends NSNumber> supportedColorSpaces();

    /**
     * [@property] videoFieldOfView
     * 
     * A property indicating the format's horizontal field of view.
     * 
     * videoFieldOfView is a float value indicating the receiver's field of view in degrees. If field of view is
     * unknown, a value of 0 is returned.
     */
    @Generated
    @Selector("videoFieldOfView")
    public native float videoFieldOfView();

    /**
     * [@property] videoMaxZoomFactor
     * 
     * Indicates the maximum zoom factor available for the AVCaptureDevice's videoZoomFactor property.
     * 
     * If the device's videoZoomFactor property is assigned a larger value, an NSRangeException will be thrown. A
     * maximum zoom factor of 1 indicates no zoom is available.
     */
    @Generated
    @Selector("videoMaxZoomFactor")
    @NFloat
    public native double videoMaxZoomFactor();

    /**
     * [@property] videoSupportedFrameRateRanges
     * 
     * A property indicating the format's supported frame rate ranges.
     * 
     * videoSupportedFrameRateRanges is an array of AVFrameRateRange objects, one for each of the format's supported
     * video frame rate ranges.
     */
    @Generated
    @Selector("videoSupportedFrameRateRanges")
    public native NSArray<? extends AVFrameRateRange> videoSupportedFrameRateRanges();

    /**
     * [@property] videoZoomFactorUpscaleThreshold
     * 
     * Indicates the value of AVCaptureDevice's videoZoomFactor property at which the image output begins to require
     * upscaling.
     * 
     * In some cases the image sensor's dimensions are larger than the dimensions reported by the video
     * AVCaptureDeviceFormat. As long as the sensor crop is larger than the reported dimensions of the
     * AVCaptureDeviceFormat, the image will be downscaled. Setting videoZoomFactor to the value of
     * videoZoomFactorUpscalingThreshold will provide a center crop of the sensor image data without any scaling. If a
     * greater zoom factor is used, then the sensor data will be upscaled to the device format's dimensions.
     */
    @Generated
    @Selector("videoZoomFactorUpscaleThreshold")
    @NFloat
    public native double videoZoomFactorUpscaleThreshold();

    /**
     * [@property] supportedDepthDataFormats
     * 
     * Indicates this format's companion depth data formats.
     * 
     * If no depth data formats are supported by the receiver, an empty array is returned. On virtual devices, the
     * supportedDepthDataFormats list items always match the aspect ratio of their paired video format. When the
     * receiver is set as the device's activeFormat, you may set the device's activeDepthDataFormat to one of these
     * supported depth data formats.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("supportedDepthDataFormats")
    public native NSArray<? extends AVCaptureDeviceFormat> supportedDepthDataFormats();

    /**
     * [@property] unsupportedCaptureOutputClasses
     * 
     * A property indicating AVCaptureOutput subclasses the receiver does not support.
     * 
     * As a rule, AVCaptureDeviceFormats of a given mediaType are available for use with all AVCaptureOutputs that
     * accept that media type, but there are exceptions. For instance, on apps linked against iOS versions earlier than
     * 12.0, the photo resolution video formats may not be used as sources for AVCaptureMovieFileOutput due to bandwidth
     * limitations. On DualCamera devices, AVCaptureDepthDataOutput is not supported when outputting full resolution
     * (i.e. 12 MP) video due to bandwidth limitations. In order to stream depth data plus video data from a photo
     * format, ensure that your AVCaptureVideoDataOutput's deliversPreviewSizedOutputBuffers property is set to YES.
     * Likewise, to stream depth data while capturing video to a movie file using AVCaptureMovieFileOutput, call
     * -[AVCaptureSession setSessionPreset:AVCaptureSessionPresetPhoto]. When using the photo preset, video is captured
     * at preview resolution rather than the full sensor resolution.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("unsupportedCaptureOutputClasses")
    public native NSArray<? extends Class> unsupportedCaptureOutputClasses();

    /**
     * [@property] videoMaxZoomFactorForDepthDataDelivery
     * 
     * A deprecated property. Please use supportedVideoZoomFactorsForDepthDataDelivery instead
     * 
     * API-Since: 11.0
     * Deprecated-Since: 16.0
     */
    @Deprecated
    @Generated
    @Selector("videoMaxZoomFactorForDepthDataDelivery")
    @NFloat
    public native double videoMaxZoomFactorForDepthDataDelivery();

    /**
     * [@property] videoMinZoomFactorForDepthDataDelivery
     * 
     * A deprecated property. Please use supportedVideoZoomFactorsForDepthDataDelivery instead
     * 
     * API-Since: 11.0
     * Deprecated-Since: 16.0
     */
    @Deprecated
    @Generated
    @Selector("videoMinZoomFactorForDepthDataDelivery")
    @NFloat
    public native double videoMinZoomFactorForDepthDataDelivery();

    /**
     * [@property] geometricDistortionCorrectedVideoFieldOfView
     * 
     * A property indicating the format's horizontal field of view post geometric distortion correction.
     * 
     * If the receiver's AVCaptureDevice does not support GDC, geometricDistortionCorrectedVideoFieldOfView matches the
     * videoFieldOfView property.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("geometricDistortionCorrectedVideoFieldOfView")
    public native float geometricDistortionCorrectedVideoFieldOfView();

    /**
     * [@property] globalToneMappingSupported
     * 
     * A property indicating whether the format supports global tone mapping.
     * 
     * globalToneMappingSupported is a BOOL indicating whether the format supports global tone mapping. See
     * AVCaptureDevice's globalToneMappingEnabled property.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("isGlobalToneMappingSupported")
    public native boolean isGlobalToneMappingSupported();

    /**
     * [@property] highestPhotoQualitySupported
     * 
     * A boolean value specifying whether this format supports the highest possible photo quality that can be delivered
     * on the current platform.
     * 
     * Of the many formats supported by an AVCaptureDevice, only a few of them are designated as "photo" formats which
     * can produce the highest possible quality, such as still image stabilization and Live Photos. If you intend to
     * connect an AVCaptureDeviceInput to an AVCapturePhotoOutput and receive the best possible images, you should
     * ensure that you are either using the AVCaptureSessionPresetPhoto as your preset, or if using the parallel
     * AVCaptureDevice activeFormat API, select as your activeFormat one for which this property is YES.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("isHighestPhotoQualitySupported")
    public native boolean isHighestPhotoQualitySupported();

    /**
     * [@property] multiCamSupported
     * 
     * A property indicating whether this format is supported in an AVCaptureMultiCamSession.
     * 
     * When using an AVCaptureSession (single camera capture), any of the formats in the device's -formats array may be
     * set as the -activeFormat. However, when used with an AVCaptureMultiCamSession, the device's -activeFormat may
     * only be set to one of the formats for which multiCamSupported answers YES. This limited subset of capture formats
     * are known to run sustainably in a multi camera capture scenario.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("isMultiCamSupported")
    public native boolean isMultiCamSupported();

    /**
     * [@property] portraitEffectsMatteStillImageDeliverySupported
     * 
     * Indicates whether this depth format supports the delivery of a portrait effects matte.
     * 
     * Some depth formats are capable of producing an auxiliary matting image (similar to an auxiliary depth image)
     * tuned for high quality portrait effects rendering (see AVPortraitEffectsMatte.h). If this property's value is
     * YES, you may request portrait effects matte delivery in your photos using the AVCapturePhotoOutput, provided this
     * format is selected as the activeDepthDataFormat.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("isPortraitEffectsMatteStillImageDeliverySupported")
    public native boolean isPortraitEffectsMatteStillImageDeliverySupported();

    /**
     * [@property] centerStageSupported
     * 
     * Indicates whether the format supports the Center Stage feature.
     * 
     * This property returns YES if the format supports "Center Stage", which automatically adjusts the camera to keep
     * people optimally framed within the field of view. See +AVCaptureDevice.centerStageEnabled for a detailed
     * discussion.
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("isCenterStageSupported")
    public native boolean isCenterStageSupported();

    /**
     * [@property] highPhotoQualitySupported
     * 
     * A boolean value specifying whether this format supports high photo quality when selecting an
     * AVCapturePhotoQualityPrioritization of .balanced or .quality.
     * 
     * If an AVCaptureDeviceFormat's highPhotoQualitySupported property is YES, the format produces higher image quality
     * when selecting .balanced or .quality AVCapturePhotoQualityPrioritization compared to .speed. Such formats adhere
     * to the following rules:
     * - Photo requests with a prioritization of .speed produce the fastest image result (suitable for burst captures).
     * - Photo requests with a prioritization of .balanced produce higher image quality without dropping frames if a
     * video recording is underway.
     * - Photo requests with a prioritization of .quality produce high image quality and may cause frame drops if a
     * video recording is underway. For maximum backward compatibility, photo requests on high photo quality formats set
     * to .quality only cause video frame drops if your app is linked on or after iOS 15.
     * Formats that don't support high photo quality produce the same image quality whether you select .speed,
     * .balanced, or .quality. Note that high photo quality is only attainable when using the AVCapturePhotoOutput with
     * these supported formats.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("isHighPhotoQualitySupported")
    public native boolean isHighPhotoQualitySupported();

    /**
     * [@property] portraitEffectSupported
     * 
     * Indicates whether the format supports the Portrait Effect feature.
     * 
     * This property returns YES if the format supports Portrait Effect, the application of a shallow depth of field
     * effect to objects in the background. See +AVCaptureDevice.portraitEffectEnabled for a detailed discussion.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("isPortraitEffectSupported")
    public native boolean isPortraitEffectSupported();

    /**
     * [@property] videoFrameRateRangeForCenterStage
     * 
     * Indicates the minimum / maximum frame rates available when centerStageActive is YES.
     * 
     * Devices may support a limited frame rate range when Center Stage is active. If this device format does not
     * support Center Stage, this property returns nil.
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("videoFrameRateRangeForCenterStage")
    public native AVFrameRateRange videoFrameRateRangeForCenterStage();

    /**
     * [@property] videoFrameRateRangeForPortraitEffect
     * 
     * Indicates the minimum / maximum frame rates available when portraitEffectActive is YES.
     * 
     * Devices may support a limited frame rate range when Portrait Effect is active. If this device format does not
     * support Portrait Effect, this property returns nil.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("videoFrameRateRangeForPortraitEffect")
    public native AVFrameRateRange videoFrameRateRangeForPortraitEffect();

    /**
     * [@property] videoMaxZoomFactorForCenterStage
     * 
     * Indicates the maximum zoom factor available for the AVCaptureDevice's videoZoomFactor property when
     * centerStageActive is YES.
     * 
     * Devices support a limited zoom range when Center Stage is active. If this device format does not support Center
     * Stage, this property returns videoMaxZoomFactor.
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("videoMaxZoomFactorForCenterStage")
    @NFloat
    public native double videoMaxZoomFactorForCenterStage();

    /**
     * [@property] videoMinZoomFactorForCenterStage
     * 
     * Indicates the minimum zoom factor available for the AVCaptureDevice's videoZoomFactor property when
     * centerStageActive is YES.
     * 
     * Devices support a limited zoom range when Center Stage is active. If this device format does not support Center
     * Stage, this property returns 1.0.
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("videoMinZoomFactorForCenterStage")
    @NFloat
    public native double videoMinZoomFactorForCenterStage();

    /**
     * [@property] studioLightSupported
     * 
     * Indicates whether the format supports the Studio Light feature.
     * 
     * This property returns YES if the format supports Studio Light (artificial re-lighting of the subject's face). See
     * +AVCaptureDevice.studioLightEnabled.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("isStudioLightSupported")
    public native boolean isStudioLightSupported();

    /**
     * [@property] secondaryNativeResolutionZoomFactors
     * 
     * Indicates zoom factors at which this device transitions to secondary native resolution modes.
     * 
     * Devices with this property have the means to switch their pixel sampling mode on the fly to produce a
     * high-fidelity, non-upsampled images at a fixed zoom factor beyond 1.0x.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("secondaryNativeResolutionZoomFactors")
    public native NSArray<? extends NSNumber> secondaryNativeResolutionZoomFactors();

    /**
     * [@property] supportedMaxPhotoDimensions
     * 
     * This property lists all of the supported maximum photo dimensions for this format. The array contains
     * CMVideoDimensions structs encoded as NSValues.
     * 
     * Enumerate all supported resolution settings for which this format may be configured to capture photos. Use these
     * values to set AVCapturePhotoOutput.maxPhotoDimensions and AVCapturePhotoSettings.maxPhotoDimensions.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("supportedMaxPhotoDimensions")
    public native NSArray<? extends NSValue> supportedMaxPhotoDimensions();

    /**
     * [@property] supportedVideoZoomFactorsForDepthDataDelivery
     * 
     * Indicates the sorted zoom factors available for the AVCaptureDevice's videoZoomFactor property when delivering
     * depth data to one or more outputs.
     * 
     * Virtual devices support limited zoom factors when delivering depth data to any output. If this device format has
     * no -supportedDepthDataFormats, this property returns an empty array.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("supportedVideoZoomFactorsForDepthDataDelivery")
    public native NSArray<? extends NSNumber> supportedVideoZoomFactorsForDepthDataDelivery();

    /**
     * [@property] videoFrameRateRangeForStudioLight
     * 
     * Indicates the minimum / maximum frame rates available when studioLight is YES.
     * 
     * Devices may support a limited frame rate range when Studio Light is active. If this device format does not
     * support Studio Light, this property returns nil.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("videoFrameRateRangeForStudioLight")
    public native AVFrameRateRange videoFrameRateRangeForStudioLight();
}
