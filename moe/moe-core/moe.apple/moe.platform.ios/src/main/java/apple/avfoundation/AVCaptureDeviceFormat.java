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
import org.moe.natj.general.ann.MappedReturn;
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

/**
 * @class AVCaptureDeviceFormat
 * @abstract
 *    An AVCaptureDeviceFormat wraps a CMFormatDescription and other format-related information, such as min and max framerate.
 * 
 * @discussion
 *    An AVCaptureDevice exposes an array of formats, and its current activeFormat may be queried. The payload for the formats property is an array of AVCaptureDeviceFormat objects and the activeFormat property payload is an AVCaptureDeviceFormat. AVCaptureDeviceFormat is a thin wrapper around a CMFormatDescription, and can carry associated device format information that doesn't go in a CMFormatDescription, such as min and max frame rate. An AVCaptureDeviceFormat object is immutable. Its values do not change for the life of the object.
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
     * @property autoFocusSystem
     * @abstract
     *    A property indicating the autofocus system.
     * 
     * @discussion
     *    This read-only property indicates the autofocus system.
     */
    @Generated
    @Selector("autoFocusSystem")
    @NInt
    public native long autoFocusSystem();

    /**
     * @property formatDescription
     * @abstract
     *    A CMFormatDescription describing an AVCaptureDevice active or supported format.
     * 
     * @discussion
     *    A CMFormatDescription describing an AVCaptureDevice active or supported format. This is a read-only property. The caller assumes no ownership of the returned value and should not CFRelease it.
     */
    @Generated
    @Selector("formatDescription")
    public native CMFormatDescriptionRef formatDescription();

    /**
     * @property highResolutionStillImageDimensions
     * @abstract
     *    CMVideoDimensions indicating the highest resolution still image that can be produced by this format.
     * 
     * @discussion
     *    By default, AVCapturePhotoOutput and AVCaptureStillImageOutput emit images with the same dimensions as their source AVCaptureDevice's activeFormat.formatDescription property. Some device formats support high resolution photo output. That is, they can stream video to an AVCaptureVideoDataOutput or AVCaptureMovieFileOutput at one resolution while outputting photos to AVCapturePhotoOutput at a higher resolution. You may query this property to discover a video format's supported high resolution still image dimensions. See -[AVCapturePhotoOutput highResolutionPhotoEnabled], -[AVCapturePhotoSettings highResolutionPhotoEnabled], and -[AVCaptureStillImageOutput highResolutionStillImageOutputEnabled].
     * 
     *    AVCaptureDeviceFormats of type AVMediaTypeDepthData may also support the delivery of a higher resolution depth data map to an AVCapturePhotoOutput. Chief differences are:
     *       - Depth data accompanying still images is not supported by AVCaptureStillImageOutput. You must use AVCapturePhotoOutput.
     *       - By opting in for depth data ( -[AVCapturePhotoSettings setDepthDataDeliveryEnabled:YES] ), you implicitly opt in for high resolution depth data if it's available. You may query the -[AVCaptureDevice activeDepthDataFormat]'s highResolutionStillImageDimensions to discover the depth data resolution that will be delivered with captured photos.
     */
    @Generated
    @Selector("highResolutionStillImageDimensions")
    @ByValue
    public native CMVideoDimensions highResolutionStillImageDimensions();

    @Generated
    @Selector("init")
    public native AVCaptureDeviceFormat init();

    /**
     * @property videoBinned
     * @abstract
     *    A property indicating whether the format is binned.
     * 
     * @discussion
     *    videoBinned is a BOOL indicating whether the format is a binned format. Binning is a pixel-combining process which can result in greater low light sensitivity at the cost of reduced resolution.
     */
    @Generated
    @Selector("isVideoBinned")
    public native boolean isVideoBinned();

    /**
     * @property videoHDRSupported
     * @abstract
     *    A property indicating whether the format supports high dynamic range streaming.
     * 
     * @discussion
     *    videoHDRSupported is a BOOL indicating whether the format supports high dynamic range streaming, also known as Extended Dynamic Range (EDR). When enabled, the device streams at twice the published frame rate, capturing an under-exposed frame and correctly exposed frame for each frame time at the published rate. Portions of the under-exposed frame are combined with the correctly exposed frame to recover detail in darker areas of the scene. EDR is a separate and distinct feature from 10-bit HDR video (first seen in 2020 iPhones). 10-bit formats have greater dynamic range by virtue of their expanded bit depth and HLG BT2020 color space, and when captured in movies, contain Dolby Vision metadata. They are, in effect, "always on" HDR formats and thus their videoHDRSupported property is always NO, since HDR cannot be enabled or disabled. To enable videoHDR (EDR), set the AVCaptureDevice.videoHDREnabled property.
     */
    @Generated
    @Selector("isVideoHDRSupported")
    public native boolean isVideoHDRSupported();

    /**
     * @method isVideoStabilizationModeSupported
     * @abstract
     *    Returns whether the format supports the given video stabilization mode.
     * 
     * @param videoStabilizationMode
     *    An AVCaptureVideoStabilizationMode to be checked.
     * 
     * @discussion
     *    isVideoStabilizationModeSupported: returns a boolean value indicating whether the format can be stabilized using the given mode with -[AVCaptureConnection setPreferredVideoStabilizationMode:].
     */
    @Generated
    @Selector("isVideoStabilizationModeSupported:")
    public native boolean isVideoStabilizationModeSupported(@NInt long videoStabilizationMode);

    /**
     * @property videoStabilizationSupported
     * @abstract
     *    A property indicating whether the format supports video stabilization.
     * 
     * @discussion
     *    videoStabilizationSupported is a BOOL indicating whether the format can be stabilized using AVCaptureConnection -setEnablesVideoStabilizationWhenAvailable. This property is deprecated. Use isVideoStabilizationModeSupported: instead.
     */
    @Generated
    @Deprecated
    @Selector("isVideoStabilizationSupported")
    public native boolean isVideoStabilizationSupported();

    /**
     * @property maxExposureDuration
     * @abstract
     *    A CMTime indicating the maximum supported exposure duration.
     * 
     * @discussion
     *    This read-only property indicates the maximum supported exposure duration.
     */
    @Generated
    @Selector("maxExposureDuration")
    @ByValue
    public native CMTime maxExposureDuration();

    /**
     * @property maxISO
     * @abstract
     *    An float indicating the maximum supported exposure ISO value.
     * 
     * @discussion
     *    This read-only property indicates the maximum supported exposure ISO value.
     */
    @Generated
    @Selector("maxISO")
    public native float maxISO();

    /**
     * @property mediaType
     * @abstract
     *    An NSString describing the media type of an AVCaptureDevice active or supported format.
     * 
     * @discussion
     *    Supported mediaTypes are listed in AVMediaFormat.h. This is a read-only property. The caller assumes no ownership of the returned value and should not CFRelease it.
     */
    @Generated
    @Selector("mediaType")
    public native String mediaType();

    /**
     * @property minExposureDuration
     * @abstract
     *    A CMTime indicating the minimum supported exposure duration.
     * 
     * @discussion
     *    This read-only property indicates the minimum supported exposure duration.
     */
    @Generated
    @Selector("minExposureDuration")
    @ByValue
    public native CMTime minExposureDuration();

    /**
     * @property minISO
     * @abstract
     *    A float indicating the minimum supported exposure ISO value.
     * 
     * @discussion
     *    This read-only property indicates the minimum supported exposure ISO value.
     */
    @Generated
    @Selector("minISO")
    public native float minISO();

    /**
     * @property supportedColorSpaces
     * @abstract
     *    A property indicating the receiver's supported color spaces.
     * 
     * @discussion
     *    This read-only property indicates the receiver's supported color spaces as an array of AVCaptureColorSpace constants sorted from narrow to wide color.
     */
    @Generated
    @Selector("supportedColorSpaces")
    public native NSArray<? extends NSNumber> supportedColorSpaces();

    /**
     * @property videoFieldOfView
     * @abstract
     *    A property indicating the format's horizontal field of view.
     * 
     * @discussion
     *    videoFieldOfView is a float value indicating the receiver's field of view in degrees. If field of view is unknown, a value of 0 is returned.
     */
    @Generated
    @Selector("videoFieldOfView")
    public native float videoFieldOfView();

    /**
     * @property videoMaxZoomFactor
     * @abstract
     *    Indicates the maximum zoom factor available for the AVCaptureDevice's videoZoomFactor property.
     * 
     * @discussion
     *    If the device's videoZoomFactor property is assigned a larger value, an NSRangeException will be thrown. A maximum zoom factor of 1 indicates no zoom is available.
     */
    @Generated
    @Selector("videoMaxZoomFactor")
    @NFloat
    public native double videoMaxZoomFactor();

    /**
     * @property videoSupportedFrameRateRanges
     * @abstract
     *    A property indicating the format's supported frame rate ranges.
     * 
     * @discussion
     *    videoSupportedFrameRateRanges is an array of AVFrameRateRange objects, one for each of the format's supported video frame rate ranges.
     */
    @Generated
    @Selector("videoSupportedFrameRateRanges")
    public native NSArray<? extends AVFrameRateRange> videoSupportedFrameRateRanges();

    /**
     * @property videoZoomFactorUpscaleThreshold
     * @abstract
     *    Indicates the value of AVCaptureDevice's videoZoomFactor property at which the image output begins to require upscaling.
     * 
     * @discussion
     *    In some cases the image sensor's dimensions are larger than the dimensions reported by the video AVCaptureDeviceFormat. As long as the sensor crop is larger than the reported dimensions of the AVCaptureDeviceFormat, the image will be downscaled. Setting videoZoomFactor to the value of videoZoomFactorUpscalingThreshold will provide a center crop of the sensor image data without any scaling. If a greater zoom factor is used, then the sensor data will be upscaled to the device format's dimensions.
     */
    @Generated
    @Selector("videoZoomFactorUpscaleThreshold")
    @NFloat
    public native double videoZoomFactorUpscaleThreshold();

    /**
     * @property supportedDepthDataFormats
     * @abstract
     *    Indicates this format's companion depth data formats.
     * 
     * @discussion
     *    If no depth data formats are supported by the receiver, an empty array is returned. On virtual devices, the supportedDepthDataFormats list items always match the aspect ratio of their paired video format. When the receiver is set as the device's activeFormat, you may set the device's activeDepthDataFormat to one of these supported depth data formats.
     */
    @Generated
    @Selector("supportedDepthDataFormats")
    public native NSArray<? extends AVCaptureDeviceFormat> supportedDepthDataFormats();

    /**
     * @property unsupportedCaptureOutputClasses
     * @abstract
     *    A property indicating AVCaptureOutput subclasses the receiver does not support.
     * 
     * @discussion
     *    As a rule, AVCaptureDeviceFormats of a given mediaType are available for use with all AVCaptureOutputs that accept that media type, but there are exceptions. For instance, on apps linked against iOS versions earlier than 12.0, the photo resolution video formats may not be used as sources for AVCaptureMovieFileOutput due to bandwidth limitations. On DualCamera devices, AVCaptureDepthDataOutput is not supported when outputting full resolution (i.e. 12 MP) video due to bandwidth limitations. In order to stream depth data plus video data from a photo format, ensure that your AVCaptureVideoDataOutput's deliversPreviewSizedOutputBuffers property is set to YES. Likewise, to stream depth data while capturing video to a movie file using AVCaptureMovieFileOutput, call -[AVCaptureSession setSessionPreset:AVCaptureSessionPresetPhoto]. When using the photo preset, video is captured at preview resolution rather than the full sensor resolution.
     */
    @Generated
    @Selector("unsupportedCaptureOutputClasses")
    public native NSArray<? extends Class> unsupportedCaptureOutputClasses();

    /**
     * @property videoMaxZoomFactorForDepthDataDelivery
     * @abstract
     *    Indicates the maximum zoom factor available for the AVCaptureDevice's videoZoomFactor property when delivering depth data to one or more outputs.
     * 
     * @discussion
     *    Virtual devices support a limited zoom range when delivering depth data to any output. If this device format has no -supportedDepthDataFormats, this property returns videoMaxZoomFactor.
     */
    @Generated
    @Selector("videoMaxZoomFactorForDepthDataDelivery")
    @NFloat
    public native double videoMaxZoomFactorForDepthDataDelivery();

    /**
     * @property videoMinZoomFactorForDepthDataDelivery
     * @abstract
     *    Indicates the minimum zoom factor available for the AVCaptureDevice's videoZoomFactor property when delivering depth data to one or more outputs.
     * 
     * @discussion
     *    Virtual devices support a limited zoom range when delivering depth data to any output. If this device format has no -supportedDepthDataFormats, this property returns 1.0.
     */
    @Generated
    @Selector("videoMinZoomFactorForDepthDataDelivery")
    @NFloat
    public native double videoMinZoomFactorForDepthDataDelivery();

    /**
     * @property geometricDistortionCorrectedVideoFieldOfView
     * @abstract
     *    A property indicating the format's horizontal field of view post geometric distortion correction.
     * 
     * @discussion
     *    If the receiver's AVCaptureDevice does not support GDC, geometricDistortionCorrectedVideoFieldOfView matches the videoFieldOfView property.
     */
    @Generated
    @Selector("geometricDistortionCorrectedVideoFieldOfView")
    public native float geometricDistortionCorrectedVideoFieldOfView();

    /**
     * @property globalToneMappingSupported
     * @abstract
     *    A property indicating whether the format supports global tone mapping.
     * 
     * @discussion
     *    globalToneMappingSupported is a BOOL indicating whether the format supports global tone mapping. See AVCaptureDevice's globalToneMappingEnabled property.
     */
    @Generated
    @Selector("isGlobalToneMappingSupported")
    public native boolean isGlobalToneMappingSupported();

    /**
     * @property highestPhotoQualitySupported
     * @abstract
     *    A boolean value specifying whether this format supports the highest possible photo quality that can be delivered on the current platform.
     * 
     * @discussion
     *    Of the many formats supported by an AVCaptureDevice, only a few of them are designated as "photo" formats which can produce the highest possible quality, such as still image stabilization and Live Photos. If you intend to connect an AVCaptureDeviceInput to an AVCapturePhotoOutput and receive the best possible images, you should ensure that you are either using the AVCaptureSessionPresetPhoto as your preset, or if using the parallel AVCaptureDevice activeFormat API, select as your activeFormat one for which this property is YES.
     */
    @Generated
    @Selector("isHighestPhotoQualitySupported")
    public native boolean isHighestPhotoQualitySupported();

    /**
     * @property multiCamSupported
     * @abstract
     *    A property indicating whether this format is supported in an AVCaptureMultiCamSession.
     * 
     * @discussion
     *   When using an AVCaptureSession (single camera capture), any of the formats in the device's -formats array may be set as the -activeFormat. However, when used with an AVCaptureMultiCamSession, the device's -activeFormat may only be set to one of the formats for which multiCamSupported answers YES. This limited subset of capture formats are known to run sustainably in a multi camera capture scenario.
     */
    @Generated
    @Selector("isMultiCamSupported")
    public native boolean isMultiCamSupported();

    /**
     * @property portraitEffectsMatteStillImageDeliverySupported
     * @abstract
     *    Indicates whether this depth format supports the delivery of a portrait effects matte.
     * 
     * @discussion
     *    Some depth formats are capable of producing an auxiliary matting image (similar to an auxiliary depth image) tuned for high quality portrait effects rendering (see AVPortraitEffectsMatte.h). If this property's value is YES, you may request portrait effects matte delivery in your photos using the AVCapturePhotoOutput, provided this format is selected as the activeDepthDataFormat.
     */
    @Generated
    @Selector("isPortraitEffectsMatteStillImageDeliverySupported")
    public native boolean isPortraitEffectsMatteStillImageDeliverySupported();
}
