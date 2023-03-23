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
import apple.avfoundation.protocol.AVCapturePhotoCaptureDelegate;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import apple.coremedia.struct.CMVideoDimensions;
import org.moe.natj.general.ann.ByValue;

/**
 * AVCapturePhotoOutput
 * 
 * AVCapturePhotoOutput is a concrete subclass of AVCaptureOutput that supersedes AVCaptureStillImageOutput as the
 * preferred interface for capturing photos. In addition to capturing all flavors of still image supported by
 * AVCaptureStillImageOutput, it supports Live Photo capture, preview-sized image delivery, wide color, RAW, RAW+JPG and
 * RAW+DNG formats.
 * 
 * Taking a photo is multi-step process. Clients wishing to build a responsive UI need to know about the progress of a
 * photo capture request as it advances from capture to processing to finished delivery. AVCapturePhotoOutput informs
 * clients of photo capture progress through a delegate protocol. To take a picture, a client instantiates and
 * configures an AVCapturePhotoSettings object, then calls AVCapturePhotoOutput's -capturePhotoWithSettings:delegate:,
 * passing a delegate to be informed when events relating to the photo capture occur (e.g., the photo is about to be
 * captured, the photo has been captured but not processed yet, the Live Photo movie is ready, etc.).
 * 
 * Some AVCapturePhotoSettings properties can be set to "Auto", such as flashMode. When set to AVCaptureFlashModeAuto,
 * the photo output decides at capture time whether the current scene and lighting conditions require use of the flash.
 * Thus the client doesn't know with certainty which features will be enabled when making the capture request. With the
 * first and each subsequent delegate callback, the client is provided an AVCaptureResolvedPhotoSettings instance that
 * indicates the settings that were applied to the capture. All "Auto" features have now been resolved to on or off. The
 * AVCaptureResolvedPhotoSettings object passed in the client's delegate callbacks has a uniqueID identical to the
 * AVCapturePhotoSettings request. This uniqueID allows clients to pair unresolved and resolved settings objects. See
 * AVCapturePhotoCaptureDelegate below for a detailed discussion of the delegate callbacks.
 * 
 * Enabling certain photo features (Live Photo capture and high resolution capture) requires a reconfiguration of the
 * capture render pipeline. Clients wishing to opt in for these features should call -setLivePhotoCaptureEnabled: and/or
 * -setHighResolutionCaptureEnabled: before calling -startRunning on the AVCaptureSession. Changing any of these
 * properties while the session is running requires a disruptive reconfiguration of the capture render pipeline. Live
 * Photo captures in progress will be ended immediately; unfulfilled photo requests will be aborted; video preview will
 * temporarily freeze. If you wish to capture Live Photos containing sound, you must add an audio AVCaptureDeviceInput
 * to your AVCaptureSession.
 * 
 * Simultaneous Live Photo capture and MovieFileOutput capture is not supported. If an AVCaptureMovieFileOutput is added
 * to your session, AVCapturePhotoOutput's livePhotoCaptureSupported property returns NO. Note that simultaneous Live
 * Photo capture and AVCaptureVideoDataOutput is supported.
 * 
 * AVCaptureStillImageOutput and AVCapturePhotoOutput may not both be added to a capture session. You must use one or
 * the other. If you add both to a session, a NSInvalidArgumentException is thrown.
 * 
 * AVCapturePhotoOutput implicitly supports wide color photo capture, following the activeColorSpace of the source
 * AVCaptureDevice. If the source device's activeColorSpace is AVCaptureColorSpace_P3_D65, photos are encoded with wide
 * color information, unless you've specified an output format of '420v', which does not support wide color.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCapturePhotoOutput extends AVCaptureOutput {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCapturePhotoOutput(Pointer peer) {
        super(peer);
    }

    /**
     * DNGPhotoDataRepresentationForRawSampleBuffer:previewPhotoSampleBuffer:
     * 
     * A class method that writes a RAW sample buffer to an NSData containing bits in the DNG file format.
     * 
     * AVCapturePhotoOutput's deprecated
     * -captureOutput:didFinishProcessingRawPhotoSampleBuffer:previewPhotoSampleBuffer:resolvedSettings:bracketSettings:error:
     * callback delivers RAW photos to clients as CMSampleBuffers. To re-package these buffers in a data format suitable
     * for writing to a DNG file, you may call this class method, optionally inserting your own metadata into the RAW
     * CMSampleBuffer first, and optionally passing a preview image to be written to the DNG file format as a thumbnail
     * image. Only RAW images from Apple built-in cameras are supported.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     * 
     * @param rawSampleBuffer
     *                                 A CMSampleBuffer containing Bayer RAW data.
     * @param previewPhotoSampleBuffer
     *                                 An optional CMSampleBuffer containing pixel buffer image data to be written as a
     *                                 thumbnail image.
     * @return
     *         An NSData containing bits in the DNG file format. May return nil if the re-packaging process fails.
     */
    @Deprecated
    @Generated
    @Selector("DNGPhotoDataRepresentationForRawSampleBuffer:previewPhotoSampleBuffer:")
    public static native NSData DNGPhotoDataRepresentationForRawSampleBufferPreviewPhotoSampleBuffer(
            CMSampleBufferRef rawSampleBuffer, CMSampleBufferRef previewPhotoSampleBuffer);

    /**
     * JPEGPhotoDataRepresentationForJPEGSampleBuffer:previewPhotoSampleBuffer:
     * 
     * A class method that writes a JPEG sample buffer to an NSData in the JPEG file format.
     * 
     * AVCapturePhotoOutput's depecrated
     * -captureOutput:didFinishProcessingPhotoSampleBuffer:previewPhotoSampleBuffer:resolvedSettings:bracketSettings:error:
     * callback delivers JPEG photos to clients as CMSampleBuffers. To re-package these buffers in a data format
     * suitable for writing to a JPEG file, you may call this class method, optionally inserting your own metadata into
     * the JPEG CMSampleBuffer first, and optionally passing a preview image to be written to the JPEG file format as a
     * thumbnail image.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     * 
     * @param JPEGSampleBuffer
     *                                 A CMSampleBuffer containing JPEG compressed data.
     * @param previewPhotoSampleBuffer
     *                                 An optional CMSampleBuffer containing pixel buffer image data to be written as a
     *                                 thumbnail image.
     * @return
     *         An NSData containing bits in the JPEG file format. May return nil if the re-packaging process fails.
     */
    @Deprecated
    @Generated
    @Selector("JPEGPhotoDataRepresentationForJPEGSampleBuffer:previewPhotoSampleBuffer:")
    public static native NSData JPEGPhotoDataRepresentationForJPEGSampleBufferPreviewPhotoSampleBuffer(
            CMSampleBufferRef JPEGSampleBuffer, CMSampleBufferRef previewPhotoSampleBuffer);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCapturePhotoOutput alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVCapturePhotoOutput allocWithZone(VoidPtr zone);

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
    public static native AVCapturePhotoOutput new_objc();

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
     * [@property] availablePhotoCodecTypes
     * 
     * An array of AVVideoCodecKey values that are currently supported by the receiver.
     * 
     * If you wish to capture a photo in a compressed format, such as JPEG, you must ensure that the format you want is
     * present in the receiver's availablePhotoCodecTypes array. If you've not yet added your receiver to an
     * AVCaptureSession with a video source, no codec types are available. This property is key-value observable.
     */
    @Generated
    @Selector("availablePhotoCodecTypes")
    public native NSArray<String> availablePhotoCodecTypes();

    /**
     * [@property] availablePhotoPixelFormatTypes
     * 
     * An array of kCVPixelBufferPixelFormatTypeKey values that are currently supported by the receiver.
     * 
     * If you wish to capture a photo in an uncompressed format, such as 420f, 420v, or BGRA, you must ensure that the
     * format you want is present in the receiver's availablePhotoPixelFormatTypes array. If you've not yet added your
     * receiver to an AVCaptureSession with a video source, no pixel format types are available. This property is
     * key-value observable.
     */
    @Generated
    @Selector("availablePhotoPixelFormatTypes")
    public native NSArray<? extends NSNumber> availablePhotoPixelFormatTypes();

    /**
     * [@property] availableRawPhotoPixelFormatTypes
     * 
     * An array of RAW CVPixelBufferPixelFormatTypeKey values that are currently supported by the receiver.
     * 
     * If you wish to capture a RAW photo, you must ensure that the RAW format you want is present in the receiver's
     * availableRawPhotoPixelFormatTypes array. If you've not yet added your receiver to an AVCaptureSession with a
     * video source, no RAW formats are available. See AVCapturePhotoOutput.appleProRAWEnabled on how to enable support
     * for partially processed RAW formats. This property is key-value observable. RAW capture is not supported on all
     * platforms.
     */
    @Generated
    @Selector("availableRawPhotoPixelFormatTypes")
    public native NSArray<? extends NSNumber> availableRawPhotoPixelFormatTypes();

    /**
     * capturePhotoWithSettings:delegate:
     * 
     * Method for initiating a photo capture request with progress monitoring through the supplied delegate.
     * 
     * This method initiates a photo capture. The receiver copies your provided settings to prevent unintentional
     * mutation. It is illegal to re-use settings. The receiver throws a NSInvalidArgumentException if your
     * settings.uniqueID matches that of any previously used settings. This method is used to initiate all flavors of
     * photo capture: single photo, RAW capture with or without a processed image (such as a JPEG), bracketed capture,
     * and Live Photo.
     * 
     * Clients need not wait for a capture photo request to complete before issuing another request. This is true for
     * single photo captures as well as Live Photos, where movie complements of adjacent photo captures are allowed to
     * overlap.
     * 
     * This method validates your settings and enforces the following rules in order to ensure deterministic behavior.
     * If any of these rules are violated, a NSInvalidArgumentException is thrown.
     * RAW rules:
     * See +isBayerRAWPixelFormat: and +isAppleProRAWPixelFormat: on the difference between Bayer RAW and Apple ProRAW
     * pixel formats.
     * Common RAW rules:
     * - If rawPhotoPixelFormatType is non-zero, it must be present in the receiver's -availableRawPhotoPixelFormatTypes
     * array.
     * - If rawPhotoPixelFormatType is non-zero, your delegate must respond to
     * -captureOutput:didFinishProcessingRawPhotoSampleBuffer:previewPhotoSampleBuffer:resolvedSettings:bracketSettings:error:.
     * - If rawPhotoPixelFormatType is non-zero, highResolutionPhotoEnabled may be YES or NO, but the setting only
     * applies to the processed image, if you've specified one.
     * - If rawFileType is specified, it must be present in -availableRawPhotoFileTypes and must support the
     * rawPhotoPixelFormatType specified using -supportedRawPhotoPixelFormatTypesForFileType:.
     * Bayer RAW rules (isBayerRAWPixelFormat: returns yes for rawPhotoPixelFormatType):
     * - photoQualityPrioritization must be set to AVCapturePhotoQualityPrioritizationSpeed (deprecated
     * autoStillImageStabilizationEnabled must be set to NO).
     * - the videoZoomFactor of the source device and the videoScaleAndCropFactor of the photo output's video connection
     * must both be 1.0. Ensure no zoom is applied before requesting a RAW capture, and don't change the zoom during RAW
     * capture.
     * Apple ProRAW rules (isAppleProRAWPixelFormat: returns yes for rawPhotoPixelFormatType):
     * - livePhotoMovieFileURL must be nil in AVCapturePhotoSettings settings
     * - autoContentAwareDistortionCorrectionEnabled will automatically be disabled in AVCapturePhotoSettings
     * - autoRedEyeReductionEnabled will automatically be disabled in AVCapturePhotoSettings
     * - portraitEffectsMatteDeliveryEnabled will automatically be disabled in AVCapturePhotoSettings
     * - enabledSemanticSegmentationMatteTypes will automatically be cleared in AVCapturePhotoSettings
     * Processed Format rules:
     * - If format is non-nil, a kCVPixelBufferPixelFormatTypeKey or AVVideoCodecKey must be present, and both may not
     * be present.
     * - If format has a kCVPixelBufferPixelFormatTypeKey, its value must be present in the receiver's
     * -availablePhotoPixelFormatTypes array.
     * - If format has a AVVideoCodecKey, its value must be present in the receiver's -availablePhotoCodecTypes array.
     * - If format is non-nil, your delegate must respond to
     * -captureOutput:didFinishProcessingPhotoSampleBuffer:previewPhotoSampleBuffer:resolvedSettings:bracketSettings:error:.
     * - If processedFileType is specified, it must be present in -availablePhotoFileTypes and must support the format's
     * specified kCVPixelBufferPixelFormatTypeKey (using -supportedPhotoPixelFormatTypesForFileType:) or AVVideoCodecKey
     * (using -supportedPhotoCodecTypesForFileType:).
     * - The photoQualityPrioritization you specify may not be a greater number than the photo output's
     * maxPhotoQualityPrioritization. You must set your AVCapturePhotoOutput maxPhotoQualityPrioritization up front.
     * Flash rules:
     * - The specified flashMode must be present in the receiver's -supportedFlashModes array.
     * Live Photo rules:
     * - The receiver's livePhotoCaptureEnabled must be YES if settings.livePhotoMovieURL is non-nil.
     * - If settings.livePhotoMovieURL is non-nil, the receiver's livePhotoCaptureSuspended property must be set to NO.
     * - If settings.livePhotoMovieURL is non-nil, it must be a file URL that's accessible to your app's sandbox.
     * - If settings.livePhotoMovieURL is non-nil, your delegate must respond to
     * -captureOutput:didFinishProcessingLivePhotoToMovieFileAtURL:duration:photoDisplayTime:resolvedSettings:error:.
     * Bracketed capture rules:
     * - bracketedSettings.count must be <= the receiver's maxBracketedCapturePhotoCount property.
     * - For manual exposure brackets, ISO value must be within the source device activeFormat's minISO and maxISO
     * values.
     * - For manual exposure brackets, exposureDuration value must be within the source device activeFormat's
     * minExposureDuration and maxExposureDuration values.
     * - For auto exposure brackets, exposureTargetBias value must be within the source device's minExposureTargetBias
     * and maxExposureTargetBias values.
     * 
     * @param settings
     *                 An AVCapturePhotoSettings object you have configured. May not be nil.
     * @param delegate
     *                 An object conforming to the AVCapturePhotoCaptureDelegate protocol. This object's delegate
     *                 methods are called back as the photo advances from capture to processing to finished delivery.
     *                 May not be nil.
     */
    @Generated
    @Selector("capturePhotoWithSettings:delegate:")
    public native void capturePhotoWithSettingsDelegate(AVCapturePhotoSettings settings,
            @Mapped(ObjCObjectMapper.class) AVCapturePhotoCaptureDelegate delegate);

    @Generated
    @Selector("init")
    public native AVCapturePhotoOutput init();

    /**
     * [@property] dualCameraFusionSupported
     * 
     * Indicates whether the DualCamera image fusion feature is supported by the receiver.
     * 
     * This property may change as the session's -sessionPreset or source device's -activeFormat change. When using the
     * AVCaptureDevice with deviceType AVCaptureDeviceTypeBuiltInDualCamera, the wide-angle and telephoto camera images
     * can be fused together to improve image quality in some configurations. When DualCamera image fusion is not
     * supported by the current configuration, your capture requests always resolve dualCameraFusionEnabled to NO. This
     * property is key-value observable. As of iOS 13, this property is deprecated in favor of
     * virtualDeviceFusionSupported.
     * 
     * API-Since: 10.2
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("isDualCameraFusionSupported")
    public native boolean isDualCameraFusionSupported();

    /**
     * [@property] isFlashScene
     * 
     * Indicates whether the current scene is dark enough to warrant use of the flash.
     * 
     * This property reports whether the current scene being previewed by the camera is dark enough to need the flash.
     * If -supportedFlashModes only contains AVCaptureFlashModeOff, isFlashScene always reports NO. You can influence
     * this property's answers by setting the photoSettingsForSceneMonitoring property, indicating the flashMode you
     * wish to monitor. If you set flashMode to AVCaptureFlashModeOff, isFlashScene always reports NO. If you set it to
     * AVCaptureFlashModeAuto or AVCaptureFlashModeOn, isFlashScene answers YES or NO based on the current scene's
     * lighting conditions. By default, this property always returns NO unless you set photoSettingsForSceneMonitoring
     * to a non-nil value. Note that there is some overlap in the light level ranges that benefit from still image
     * stabilization and flash. If your photoSettingsForSceneMonitoring indicate that both still image stabilization and
     * flash scenes should be monitored, still image stabilization takes precedence, and isFlashScene becomes YES at
     * lower overall light levels. This property may be key-value observed.
     */
    @Generated
    @Selector("isFlashScene")
    public native boolean isFlashScene();

    /**
     * [@property] highResolutionCaptureEnabled
     * 
     * Indicates whether the photo render pipeline should be configured to deliver high resolution still images.
     * 
     * Some AVCaptureDeviceFormats support outputting higher resolution stills than their streaming resolution (See
     * AVCaptureDeviceFormat.highResolutionStillImageDimensions). Under some conditions, AVCaptureSession needs to set
     * up the photo render pipeline differently to support high resolution still image capture. If you intend to take
     * high resolution still images at all, you should set this property to YES before calling -[AVCaptureSession
     * startRunning]. Once you've opted in for high resolution capture, you are free to issue photo capture requests
     * with or without highResolutionCaptureEnabled in the AVCapturePhotoSettings. If you have not set this property to
     * YES and call capturePhotoWithSettings:delegate: with settings.highResolutionCaptureEnabled set to YES, an
     * NSInvalidArgumentException will be thrown.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Use maxPhotoDimensions instead.
     */
    @Deprecated
    @Generated
    @Selector("isHighResolutionCaptureEnabled")
    public native boolean isHighResolutionCaptureEnabled();

    /**
     * [@property] highResolutionCaptureEnabled
     * 
     * Indicates whether the photo render pipeline should be configured to deliver high resolution still images.
     * 
     * Some AVCaptureDeviceFormats support outputting higher resolution stills than their streaming resolution (See
     * AVCaptureDeviceFormat.highResolutionStillImageDimensions). Under some conditions, AVCaptureSession needs to set
     * up the photo render pipeline differently to support high resolution still image capture. If you intend to take
     * high resolution still images at all, you should set this property to YES before calling -[AVCaptureSession
     * startRunning]. Once you've opted in for high resolution capture, you are free to issue photo capture requests
     * with or without highResolutionCaptureEnabled in the AVCapturePhotoSettings. If you have not set this property to
     * YES and call capturePhotoWithSettings:delegate: with settings.highResolutionCaptureEnabled set to YES, an
     * NSInvalidArgumentException will be thrown.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Use maxPhotoDimensions instead.
     */
    @Deprecated
    @Generated
    @Selector("setHighResolutionCaptureEnabled:")
    public native void setHighResolutionCaptureEnabled(boolean value);

    /**
     * [@property] lensStabilizationDuringBracketedCaptureSupported
     * 
     * Indicates whether the receiver supports lens stabilization during bracketed captures.
     * 
     * The AVCapturePhotoBracketSettings lensStabilizationEnabled property may only be set if this property returns YES.
     * Its value may change as the session's -sessionPreset or input device's -activeFormat changes. This read-only
     * property is key-value observable.
     */
    @Generated
    @Selector("isLensStabilizationDuringBracketedCaptureSupported")
    public native boolean isLensStabilizationDuringBracketedCaptureSupported();

    /**
     * [@property] livePhotoAutoTrimmingEnabled
     * 
     * Indicates whether Live Photo movies are trimmed in real time to avoid excessive movement.
     * 
     * This property defaults to YES when livePhotoCaptureSupported is YES. Changing this property's value while your
     * session is running will cause a lengthy reconfiguration of the session. You should set
     * livePhotoAutoTrimmingEnabled to YES or NO before calling -[AVCaptureSession startRunning]. When set to YES, Live
     * Photo movies are analyzed in real time and trimmed if there's excessive movement before or after the photo is
     * taken. Nominally, Live Photos are approximately 3 seconds long. With trimming enabled, they may be shorter,
     * depending on movement. This feature prevents common problems such as Live Photo movies containing shoe or pocket
     * shots.
     */
    @Generated
    @Selector("isLivePhotoAutoTrimmingEnabled")
    public native boolean isLivePhotoAutoTrimmingEnabled();

    /**
     * [@property] livePhotoAutoTrimmingEnabled
     * 
     * Indicates whether Live Photo movies are trimmed in real time to avoid excessive movement.
     * 
     * This property defaults to YES when livePhotoCaptureSupported is YES. Changing this property's value while your
     * session is running will cause a lengthy reconfiguration of the session. You should set
     * livePhotoAutoTrimmingEnabled to YES or NO before calling -[AVCaptureSession startRunning]. When set to YES, Live
     * Photo movies are analyzed in real time and trimmed if there's excessive movement before or after the photo is
     * taken. Nominally, Live Photos are approximately 3 seconds long. With trimming enabled, they may be shorter,
     * depending on movement. This feature prevents common problems such as Live Photo movies containing shoe or pocket
     * shots.
     */
    @Generated
    @Selector("setLivePhotoAutoTrimmingEnabled:")
    public native void setLivePhotoAutoTrimmingEnabled(boolean value);

    /**
     * [@property] livePhotoCaptureEnabled
     * 
     * Indicates whether the receiver is configured for Live Photo capture.
     * 
     * Default value is NO. This property may only be set to YES if livePhotoCaptureSupported is YES. Live Photo capture
     * requires a lengthy reconfiguration of the capture render pipeline, so if you intend to do any Live Photo captures
     * at all, you should set livePhotoCaptureEnabled to YES before calling -[AVCaptureSession startRunning].
     */
    @Generated
    @Selector("isLivePhotoCaptureEnabled")
    public native boolean isLivePhotoCaptureEnabled();

    /**
     * [@property] livePhotoCaptureEnabled
     * 
     * Indicates whether the receiver is configured for Live Photo capture.
     * 
     * Default value is NO. This property may only be set to YES if livePhotoCaptureSupported is YES. Live Photo capture
     * requires a lengthy reconfiguration of the capture render pipeline, so if you intend to do any Live Photo captures
     * at all, you should set livePhotoCaptureEnabled to YES before calling -[AVCaptureSession startRunning].
     */
    @Generated
    @Selector("setLivePhotoCaptureEnabled:")
    public native void setLivePhotoCaptureEnabled(boolean value);

    /**
     * [@property] livePhotoCaptureSupported
     * 
     * Indicates whether the receiver supports Live Photo capture.
     * 
     * Live Photo capture is only supported for certain AVCaptureSession sessionPresets and AVCaptureDevice
     * activeFormats. When switching cameras or formats this property may change. When this property changes from YES to
     * NO, livePhotoCaptureEnabled also reverts to NO. If you've previously opted in for Live Photo capture and then
     * change configurations, you may need to set livePhotoCaptureEnabled = YES again.
     */
    @Generated
    @Selector("isLivePhotoCaptureSupported")
    public native boolean isLivePhotoCaptureSupported();

    /**
     * [@property] livePhotoCaptureSuspended
     * 
     * Indicates whether Live Photo capture is enabled, but currently suspended.
     * 
     * This property allows you to cut current Live Photo movie captures short (for instance, if you suddenly need to do
     * something that you don't want to show up in the Live Photo movie, such as take a non Live Photo capture that
     * makes a shutter sound). By default, livePhotoCaptureSuspended is NO. When you set livePhotoCaptureSuspended =
     * YES, any Live Photo movie captures in progress are trimmed to the current time. Likewise, when you toggle
     * livePhotoCaptureSuspended from YES to NO, subsequent Live Photo movie captures will not contain any samples
     * earlier than the time you un-suspended Live Photo capture. Setting this property to YES throws an
     * NSInvalidArgumentException if livePhotoCaptureEnabled is NO. By default, this property resets to NO when the
     * AVCaptureSession stops. This behavior can be prevented by setting preservesLivePhotoCaptureSuspendedOnSessionStop
     * to YES before stopping the session.
     */
    @Generated
    @Selector("isLivePhotoCaptureSuspended")
    public native boolean isLivePhotoCaptureSuspended();

    /**
     * [@property] livePhotoCaptureSuspended
     * 
     * Indicates whether Live Photo capture is enabled, but currently suspended.
     * 
     * This property allows you to cut current Live Photo movie captures short (for instance, if you suddenly need to do
     * something that you don't want to show up in the Live Photo movie, such as take a non Live Photo capture that
     * makes a shutter sound). By default, livePhotoCaptureSuspended is NO. When you set livePhotoCaptureSuspended =
     * YES, any Live Photo movie captures in progress are trimmed to the current time. Likewise, when you toggle
     * livePhotoCaptureSuspended from YES to NO, subsequent Live Photo movie captures will not contain any samples
     * earlier than the time you un-suspended Live Photo capture. Setting this property to YES throws an
     * NSInvalidArgumentException if livePhotoCaptureEnabled is NO. By default, this property resets to NO when the
     * AVCaptureSession stops. This behavior can be prevented by setting preservesLivePhotoCaptureSuspendedOnSessionStop
     * to YES before stopping the session.
     */
    @Generated
    @Selector("setLivePhotoCaptureSuspended:")
    public native void setLivePhotoCaptureSuspended(boolean value);

    /**
     * [@property] isStillImageStabilizationScene
     * 
     * Indicates whether the current scene is dark enough to warrant use of still image stabilization.
     * 
     * This property reports whether the current scene being previewed by the camera is dark enough to benefit from
     * still image stabilization. You can influence this property's answers by setting the
     * photoSettingsForSceneMonitoring property, indicating whether autoStillImageStabilization monitoring should be on
     * or off. If you set autoStillImageStabilization to NO, isStillImageStabilizationScene always reports NO. If you
     * set it to YES, this property returns YES or NO depending on the current scene's lighting conditions. Note that
     * some very dark scenes do not benefit from still image stabilization, but do benefit from flash. By default, this
     * property always returns NO unless you set photoSettingsForSceneMonitoring to a non-nil value. This property may
     * be key-value observed.
     * 
     * As of iOS 13 hardware, the AVCapturePhotoOutput is capable of applying a variety of multi-image fusion techniques
     * to improve photo quality (reduce noise, preserve detail in low light, freeze motion, etc), all of which have been
     * previously lumped under the stillImageStabilization moniker. This property should no longer be used as it no
     * longer provides meaningful information about the techniques used to improve quality in a photo capture. Instead,
     * you should use -maxPhotoQualityPrioritization to indicate the highest quality prioritization level you might
     * request in a photo capture, understanding that the higher the quality, the longer the potential wait. You may
     * also use AVCapturePhotoSettings' photoQualityPrioritization property to specify a prioritization level for a
     * particular photo capture, and then query the AVCaptureResolvedPhotoSettings photoProcessingTimeRange property to
     * find out how long it might take to receive the resulting photo in your delegate callback.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("isStillImageStabilizationScene")
    public native boolean isStillImageStabilizationScene();

    /**
     * [@property] stillImageStabilizationSupported
     * 
     * Indicates whether the still image stabilization feature is supported by the receiver.
     * 
     * This property may change as the session's -sessionPreset or source device's -activeFormat change. When still
     * image stabilization is not supported, your capture requests always resolve stillImageStabilizationEnabled to NO.
     * This property is key-value observable.
     * 
     * As of iOS 13 hardware, the AVCapturePhotoOutput is capable of applying a variety of multi-image fusion techniques
     * to improve photo quality (reduce noise, preserve detail in low light, freeze motion, etc), all of which have been
     * previously lumped under the stillImageStabilization moniker. This property should no longer be used as it no
     * longer provides meaningful information about the techniques used to improve quality in a photo capture. Instead,
     * you should use -maxPhotoQualityPrioritization to indicate the highest quality prioritization level you might
     * request in a photo capture, understanding that the higher the quality, the longer the potential wait. You may
     * also use AVCapturePhotoSettings' photoQualityPrioritization property to specify a prioritization level for a
     * particular photo capture, and then query the AVCaptureResolvedPhotoSettings photoProcessingTimeRange property to
     * find out how long it might take to receive the resulting photo in your delegate callback.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("isStillImageStabilizationSupported")
    public native boolean isStillImageStabilizationSupported();

    /**
     * [@property] maxBracketedCapturePhotoCount
     * 
     * Specifies the maximum number of photos that may be taken in a single bracket.
     * 
     * AVCapturePhotoOutput can only satisfy a limited number of image requests in a single bracket without exhausting
     * system resources. The maximum number of photos that may be taken in a single bracket depends on the size and
     * format of the images being captured, and consequently may vary with AVCaptureSession -sessionPreset and
     * AVCaptureDevice -activeFormat. Some formats do not support bracketed capture at all, and thus this property may
     * return a value of 0. This read-only property is key-value observable. If you call
     * -capturePhotoWithSettings:delegate: with a bracketedSettings whose count exceeds -maxBracketedCapturePhotoCount,
     * an NSInvalidArgumentException is thrown.
     */
    @Generated
    @Selector("maxBracketedCapturePhotoCount")
    @NUInt
    public native long maxBracketedCapturePhotoCount();

    /**
     * [@property] photoSettingsForSceneMonitoring
     * 
     * Settings that govern the behavior of isFlashScene and isStillImageStabilizationScene.
     * 
     * You can influence the return values of isFlashScene and isStillImageStabilizationScene by setting this property,
     * indicating the flashMode and photoQualityPrioritization values that should be considered for scene monitoring.
     * For instance, if you set flashMode to AVCaptureFlashModeOff, isFlashScene always reports NO. If you set it to
     * AVCaptureFlashModeAuto or AVCaptureFlashModeOn, isFlashScene answers YES or NO based on the current scene's
     * lighting conditions. Note that there is some overlap in the light level ranges that benefit from still image
     * stabilization and flash. If your photoSettingsForSceneMonitoring indicate that both still image stabilization and
     * flash scenes should be monitored, still image stabilization takes precedence, and isFlashScene becomes YES at
     * lower overall light levels. The default value for this property is nil. See isStillImageStabilizationScene and
     * isFlashScene for further discussion.
     */
    @Generated
    @Selector("photoSettingsForSceneMonitoring")
    public native AVCapturePhotoSettings photoSettingsForSceneMonitoring();

    /**
     * [@property] preparedPhotoSettingsArray
     * 
     * An array of AVCapturePhotoSettings instances for which the receiver is prepared to capture.
     * 
     * See also setPreparedPhotoSettingsArray:completionHandler:
     * Some types of photo capture, such as bracketed captures and RAW captures, require the receiver to allocate
     * additional buffers or prepare other resources. To prevent photo capture requests from executing slowly due to
     * lazy resource allocation, you may call -setPreparedPhotoSettingsArray:completionHandler: with an array of
     * settings objects representative of the types of capture you will be performing (e.g., settings for a bracketed
     * capture, RAW capture, and/or still image stabilization capture). By default, the receiver prepares sufficient
     * resources to capture photos with default settings, +[AVCapturePhotoSettings photoSettings].
     */
    @Generated
    @Selector("preparedPhotoSettingsArray")
    public native NSArray<? extends AVCapturePhotoSettings> preparedPhotoSettingsArray();

    /**
     * [@property] photoSettingsForSceneMonitoring
     * 
     * Settings that govern the behavior of isFlashScene and isStillImageStabilizationScene.
     * 
     * You can influence the return values of isFlashScene and isStillImageStabilizationScene by setting this property,
     * indicating the flashMode and photoQualityPrioritization values that should be considered for scene monitoring.
     * For instance, if you set flashMode to AVCaptureFlashModeOff, isFlashScene always reports NO. If you set it to
     * AVCaptureFlashModeAuto or AVCaptureFlashModeOn, isFlashScene answers YES or NO based on the current scene's
     * lighting conditions. Note that there is some overlap in the light level ranges that benefit from still image
     * stabilization and flash. If your photoSettingsForSceneMonitoring indicate that both still image stabilization and
     * flash scenes should be monitored, still image stabilization takes precedence, and isFlashScene becomes YES at
     * lower overall light levels. The default value for this property is nil. See isStillImageStabilizationScene and
     * isFlashScene for further discussion.
     */
    @Generated
    @Selector("setPhotoSettingsForSceneMonitoring:")
    public native void setPhotoSettingsForSceneMonitoring(AVCapturePhotoSettings value);

    /**
     * setPreparedPhotoSettingsArray:completionHandler:
     * 
     * Method allowing the receiver to prepare resources in advance for future -capturePhotoWithSettings:delegate:
     * requests.
     * 
     * Some types of photo capture, such as bracketed captures and RAW captures, require the receiver to allocate
     * additional buffers or prepare other resources. To prevent photo capture requests from executing slowly due to
     * lazy resource allocation, you may call this method with an array of settings objects representative of the types
     * of capture you will be performing (e.g., settings for a bracketed capture, RAW capture, and/or still image
     * stabilization capture). You may call this method even before calling -[AVCaptureSession startRunning] in order to
     * hint the receiver up front which features you'll be utilizing. Each time you call this method with an array of
     * settings, the receiver evaluates what additional resources it needs to allocate, as well as existing resources
     * that can be reclaimed, and calls back your completionHandler when it has finished preparing (and possibly
     * reclaiming) needed resources. By default, the receiver prepares sufficient resources to capture photos with
     * default settings, +[AVCapturePhotoSettings photoSettings]. If you wish to reclaim all possible resources, you may
     * call this method with an empty array.
     * 
     * Preparation for photo capture is always optional. You may call -capturePhotoWithSettings:delegate: without first
     * calling -setPreparedPhotoSettingsArray:completionHandler:, but be advised that some of your photo captures may
     * execute slowly as additional resources are allocated just-in-time.
     * 
     * If you call this method while your AVCaptureSession is not running, your completionHandler does not fire
     * immediately. It only fires once you've called -[AVCaptureSession startRunning], and the needed resources have
     * actually been prepared. If you call -setPreparedPhotoSettingsArray:completionHandler: with an array of settings,
     * and then call it a second time, your first prepare call's completionHandler fires immediately with prepared ==
     * NO.
     * 
     * Prepared settings persist across session starts/stops and committed configuration changes. This property
     * participates in -[AVCaptureSession beginConfiguration] / -[AVCaptureSession commitConfiguration] deferred work
     * behavior. That is, if you call -[AVCaptureSession beginConfiguration], change your session's input/output
     * topology, and call this method, preparation is deferred until you call -[AVCaptureSession commitConfiguration],
     * enabling you to atomically commit a new configuration as well as prepare to take photos in that new
     * configuration.
     * 
     * @param preparedPhotoSettingsArray
     *                                   An array of AVCapturePhotoSettings instances indicating the types of capture
     *                                   for which the receiver should prepare resources.
     * @param completionHandler
     *                                   A completion block to be fired on a serial dispatch queue once the receiver has
     *                                   finished preparing. You may pass nil to indicate you do not wish to be called
     *                                   back when preparation is complete.
     */
    @Generated
    @Selector("setPreparedPhotoSettingsArray:completionHandler:")
    public native void setPreparedPhotoSettingsArrayCompletionHandler(
            NSArray<? extends AVCapturePhotoSettings> preparedPhotoSettingsArray,
            @ObjCBlock(name = "call_setPreparedPhotoSettingsArrayCompletionHandler") Block_setPreparedPhotoSettingsArrayCompletionHandler completionHandler);

    /**
     * [@property] supportedFlashModes
     * 
     * An array of AVCaptureFlashMode constants for the current capture session configuration.
     * 
     * This property supersedes AVCaptureDevice's isFlashModeSupported: It returns an array of AVCaptureFlashMode
     * constants. To test whether a particular flash mode is supported, use NSArray's containsObject API:
     * [photoOutput.supportedFlashModes containsObject:@(AVCaptureFlashModeAuto)]. This property is key-value
     * observable.
     */
    @Generated
    @Selector("supportedFlashModes")
    public native NSArray<? extends NSNumber> supportedFlashModes();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPreparedPhotoSettingsArrayCompletionHandler {
        @Generated
        void call_setPreparedPhotoSettingsArrayCompletionHandler(boolean prepared, NSError error);
    }

    /**
     * [@property] availableLivePhotoVideoCodecTypes
     * 
     * An array of AVVideoCodecKey values that are currently supported by the receiver for use in the movie complement
     * of a Live Photo.
     * 
     * Prior to iOS 11, all Live Photo movie video tracks are compressed using H.264. Beginning in iOS 11, you can
     * select the Live Photo movie video compression format using one of the AVVideoCodecKey strings presented in this
     * property. The system's default (preferred) video codec is always presented first in the list. If you've not yet
     * added your receiver to an AVCaptureSession with a video source, no codecs are available. This property is
     * key-value observable.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("availableLivePhotoVideoCodecTypes")
    public native NSArray<String> availableLivePhotoVideoCodecTypes();

    /**
     * [@property] availablePhotoFileTypes
     * 
     * An array of AVFileType values that are currently supported by the receiver.
     * 
     * If you wish to capture a photo that is formatted for a particular file container, such as HEIF, you must ensure
     * that the fileType you desire is present in the receiver's availablePhotoFileTypes array. If you've not yet added
     * your receiver to an AVCaptureSession with a video source, no file types are available. This property is key-value
     * observable.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("availablePhotoFileTypes")
    public native NSArray<String> availablePhotoFileTypes();

    /**
     * [@property] availableRawPhotoFileTypes
     * 
     * An array of AVFileType values that are currently supported by the receiver for RAW capture.
     * 
     * If you wish to capture a RAW photo that is formatted for a particular file container, such as DNG, you must
     * ensure that the fileType you desire is present in the receiver's availableRawPhotoFileTypes array. If you've not
     * yet added your receiver to an AVCaptureSession with a video source, no file types are available. This property is
     * key-value observable.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("availableRawPhotoFileTypes")
    public native NSArray<String> availableRawPhotoFileTypes();

    /**
     * [@property] cameraCalibrationDataDeliverySupported
     * 
     * Specifies whether the photo output's current configuration supports delivery of AVCameraCalibrationData in the
     * resultant AVCapturePhoto.
     * 
     * Camera calibration data delivery (intrinsics, extrinsics, lens distortion characteristics, etc.) is only
     * supported if virtualDeviceConstituentPhotoDeliveryEnabled is YES and contentAwareDistortionCorrectionEnabled is
     * NO and the source device's geometricDistortionCorrectionEnabled property is set to NO. This property is key-value
     * observable.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("isCameraCalibrationDataDeliverySupported")
    public native boolean isCameraCalibrationDataDeliverySupported();

    /**
     * [@property] depthDataDeliveryEnabled
     * 
     * A BOOL specifying whether the photo render pipeline is prepared for depth data delivery.
     * 
     * Default is NO. Set to YES if you wish depth data to be delivered with your AVCapturePhotos. This property may
     * only be set to YES if depthDataDeliverySupported is YES. Enabling depth data delivery requires a lengthy
     * reconfiguration of the capture render pipeline, so if you intend to capture depth data, you should set this
     * property to YES before calling -[AVCaptureSession startRunning].
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("isDepthDataDeliveryEnabled")
    public native boolean isDepthDataDeliveryEnabled();

    /**
     * [@property] depthDataDeliverySupported
     * 
     * A BOOL value specifying whether depth data delivery is supported.
     * 
     * Some cameras and configurations support the delivery of depth data (e.g. disparity maps) along with the photo.
     * This property returns YES if the session's current configuration allows photos to be captured with depth data,
     * from which depth-related filters may be applied. When switching cameras or formats this property may change. When
     * this property changes from YES to NO, depthDataDeliveryEnabled also reverts to NO. If you've previously opted in
     * for depth data delivery and then change configurations, you may need to set depthDataDeliveryEnabled = YES again.
     * This property is key-value observable.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("isDepthDataDeliverySupported")
    public native boolean isDepthDataDeliverySupported();

    /**
     * [@property] dualCameraDualPhotoDeliveryEnabled
     * 
     * Indicates whether the photo output is configured for delivery of both the telephoto and wide images from the
     * DualCamera.
     * 
     * Default value is NO. This property may only be set to YES if dualCameraDualPhotoDeliverySupported is YES.
     * DualCamera dual photo delivery requires a lengthy reconfiguration of the capture render pipeline, so if you
     * intend to do any dual photo delivery captures, you should set this property to YES before calling
     * -[AVCaptureSession startRunning]. See also -[AVCapturePhotoSettings dualCameraDualPhotoDeliveryEnabled]. As of
     * iOS 13, this property is deprecated in favor of virtualDeviceConstituentPhotoDeliveryEnabled.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("isDualCameraDualPhotoDeliveryEnabled")
    public native boolean isDualCameraDualPhotoDeliveryEnabled();

    /**
     * [@property] dualCameraDualPhotoDeliverySupported
     * 
     * Specifies whether the photo output's current configuration supports delivery of both telephoto and wide images
     * from the DualCamera.
     * 
     * DualCamera dual photo delivery is only supported for certain AVCaptureSession sessionPresets and AVCaptureDevice
     * activeFormats. When switching cameras or formats this property may change. When this property changes from YES to
     * NO, dualCameraDualPhotoDeliveryEnabled also reverts to NO. If you've previously opted in for DualCamera dual
     * photo delivery and then change configurations, you may need to set dualCameraDualPhotoDeliveryEnabled = YES
     * again. This property is key-value observable. As of iOS 13, this property is deprecated in favor of
     * virtualDeviceConstituentPhotoDeliverySupported.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("isDualCameraDualPhotoDeliverySupported")
    public native boolean isDualCameraDualPhotoDeliverySupported();

    /**
     * [@property] depthDataDeliveryEnabled
     * 
     * A BOOL specifying whether the photo render pipeline is prepared for depth data delivery.
     * 
     * Default is NO. Set to YES if you wish depth data to be delivered with your AVCapturePhotos. This property may
     * only be set to YES if depthDataDeliverySupported is YES. Enabling depth data delivery requires a lengthy
     * reconfiguration of the capture render pipeline, so if you intend to capture depth data, you should set this
     * property to YES before calling -[AVCaptureSession startRunning].
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setDepthDataDeliveryEnabled:")
    public native void setDepthDataDeliveryEnabled(boolean value);

    /**
     * [@property] dualCameraDualPhotoDeliveryEnabled
     * 
     * Indicates whether the photo output is configured for delivery of both the telephoto and wide images from the
     * DualCamera.
     * 
     * Default value is NO. This property may only be set to YES if dualCameraDualPhotoDeliverySupported is YES.
     * DualCamera dual photo delivery requires a lengthy reconfiguration of the capture render pipeline, so if you
     * intend to do any dual photo delivery captures, you should set this property to YES before calling
     * -[AVCaptureSession startRunning]. See also -[AVCapturePhotoSettings dualCameraDualPhotoDeliveryEnabled]. As of
     * iOS 13, this property is deprecated in favor of virtualDeviceConstituentPhotoDeliveryEnabled.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("setDualCameraDualPhotoDeliveryEnabled:")
    public native void setDualCameraDualPhotoDeliveryEnabled(boolean value);

    /**
     * supportedPhotoCodecTypesForFileType:
     * 
     * An array of AVVideoCodecKey values that are currently supported by the receiver for a particular file container.
     * 
     * If you wish to capture a photo for storage in a particular file container, such as HEIF, you must ensure that the
     * photo codec type you request is valid for that file type. If no codec types are supported for a given fileType,
     * an empty array is returned. If you've not yet added your receiver to an AVCaptureSession with a video source, no
     * codec types are supported.
     * 
     * API-Since: 11.0
     * 
     * @param fileType
     *                 The AVFileType container type intended for storage of a photo.
     * @return
     *         An array of AVVideoCodecKey values supported by the receiver for the file type in question.
     */
    @Generated
    @Selector("supportedPhotoCodecTypesForFileType:")
    public native NSArray<String> supportedPhotoCodecTypesForFileType(String fileType);

    /**
     * supportedPhotoPixelFormatTypesForFileType:
     * 
     * An array of pixel format type values that are currently supported by the receiver for a particular file
     * container.
     * 
     * If you wish to capture a photo for storage in a particular file container, such as TIFF, you must ensure that the
     * photo pixel format type you request is valid for that file type. If no pixel format types are supported for a
     * given fileType, an empty array is returned. If you've not yet added your receiver to an AVCaptureSession with a
     * video source, no pixel format types are supported.
     * 
     * API-Since: 11.0
     * 
     * @param fileType
     *                 The AVFileType container type intended for storage of a photo.
     * @return
     *         An array of CVPixelBufferPixelFormatTypeKey values supported by the receiver for the file type in
     *         question.
     */
    @Generated
    @Selector("supportedPhotoPixelFormatTypesForFileType:")
    public native NSArray<? extends NSNumber> supportedPhotoPixelFormatTypesForFileType(String fileType);

    /**
     * supportedRawPhotoPixelFormatTypesForFileType:
     * 
     * An array of CVPixelBufferPixelFormatType values that are currently supported by the receiver for a particular
     * file container.
     * 
     * If you wish to capture a photo for storage in a particular file container, such as DNG, you must ensure that the
     * RAW pixel format type you request is valid for that file type. If no RAW pixel format types are supported for a
     * given fileType, an empty array is returned. If you've not yet added your receiver to an AVCaptureSession with a
     * video source, no pixel format types are supported.
     * 
     * API-Since: 11.0
     * 
     * @param fileType
     *                 The AVFileType container type intended for storage of a photo.
     * @return
     *         An array of CVPixelBufferPixelFormatType values supported by the receiver for the file type in question.
     */
    @Generated
    @Selector("supportedRawPhotoPixelFormatTypesForFileType:")
    public native NSArray<? extends NSNumber> supportedRawPhotoPixelFormatTypesForFileType(String fileType);

    /**
     * [@property] availableSemanticSegmentationMatteTypes
     * 
     * An array of supported semantic segmentation matte types that may be captured and delivered along with your
     * AVCapturePhotos.
     * 
     * Some cameras and configurations support the delivery of semantic segmentation matting images (e.g. segmentations
     * of the hair, skin, or teeth in the photo). This property returns an array of AVSemanticSegmentationMatteTypes
     * available given the session's current configuration. When switching cameras or formats this property may change.
     * When this property changes, enabledSemanticSegmentationMatteTypes reverts to an empty array. If you've previously
     * opted in for delivery of one or more semantic segmentation mattes and then change configurations, you need to set
     * up your enabledSemanticSegmentationMatteTypes again. This property is key-value observable.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("availableSemanticSegmentationMatteTypes")
    public native NSArray<String> availableSemanticSegmentationMatteTypes();

    /**
     * [@property] enabledSemanticSegmentationMatteTypes
     * 
     * An array of semantic segmentation matte types which the photo render pipeline is prepared to deliver.
     * 
     * Default is empty array. You may set this to the array of matte types you'd like to be delivered with your
     * AVCapturePhotos. The array may only contain values present in availableSemanticSegmentationMatteTypes. Enabling
     * semantic segmentation matte delivery requires a lengthy reconfiguration of the capture render pipeline, so if you
     * intend to capture semantic segmentation mattes, you should set this property to YES before calling
     * -[AVCaptureSession startRunning].
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("enabledSemanticSegmentationMatteTypes")
    public native NSArray<String> enabledSemanticSegmentationMatteTypes();

    /**
     * [@property] autoRedEyeReductionSupported
     * 
     * Indicates whether the receiver supports automatic red-eye reduction for flash captures.
     * 
     * Flash images may cause subjects' eyes to appear red, golden, or white. Automatic red-eye reduction detects and
     * corrects for reflected light in eyes, at the cost of additional processing time per image. This property may
     * change as the session's -sessionPreset or source device's -activeFormat change. When red-eye reduction is not
     * supported, your capture requests always resolve redEyeReductionEnabled to NO. This property is key-value
     * observable.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("isAutoRedEyeReductionSupported")
    public native boolean isAutoRedEyeReductionSupported();

    /**
     * [@property] portraitEffectsMatteDeliveryEnabled
     * 
     * A BOOL specifying whether the photo render pipeline is prepared for portrait effects matte delivery.
     * 
     * Default is NO. Set to YES if you wish portrait effects mattes to be delivered with your AVCapturePhotos. This
     * property may only be set to YES if portraitEffectsMatteDeliverySupported is YES. Portrait effects matte
     * generation requires depth to be present, so when enabling portrait effects matte delivery, you must also set
     * depthDataDeliveryEnabled to YES. Enabling portrait effects matte delivery requires a lengthy reconfiguration of
     * the capture render pipeline, so if you intend to capture portrait effects mattes, you should set this property to
     * YES before calling -[AVCaptureSession startRunning].
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("isPortraitEffectsMatteDeliveryEnabled")
    public native boolean isPortraitEffectsMatteDeliveryEnabled();

    /**
     * [@property] portraitEffectsMatteDeliverySupported
     * 
     * A BOOL value specifying whether portrait effects matte delivery is supported.
     * 
     * Some cameras and configurations support the delivery of a matting image to augment depth data and aid in high
     * quality portrait effect rendering (see AVPortraitEffectsMatte.h). This property returns YES if the session's
     * current configuration allows photos to be captured with a portrait effects matte. When switching cameras or
     * formats this property may change. When this property changes from YES to NO, portraitEffectsMatteDeliveryEnabled
     * also reverts to NO. If you've previously opted in for portrait effects matte delivery and then change
     * configurations, you may need to set portraitEffectsMatteDeliveryEnabled = YES again. This property is key-value
     * observable.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("isPortraitEffectsMatteDeliverySupported")
    public native boolean isPortraitEffectsMatteDeliverySupported();

    /**
     * [@property] virtualDeviceConstituentPhotoDeliveryEnabled
     * 
     * Indicates whether the photo output is configured for delivery of photos from constituent cameras of a virtual
     * device.
     * 
     * Default value is NO. This property may only be set to YES if virtualDeviceConstituentPhotoDeliverySupported is
     * YES. Virtual device constituent photo delivery requires a lengthy reconfiguration of the capture render pipeline,
     * so if you intend to do any constituent photo delivery captures, you should set this property to YES before
     * calling -[AVCaptureSession startRunning]. See also -[AVCapturePhotoSettings
     * virtualDeviceConstituentPhotoDeliveryEnabledDevices].
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("isVirtualDeviceConstituentPhotoDeliveryEnabled")
    public native boolean isVirtualDeviceConstituentPhotoDeliveryEnabled();

    /**
     * [@property] virtualDeviceConstituentPhotoDeliverySupported
     * 
     * Specifies whether the photo output's current configuration supports delivery of photos from constituent cameras
     * of a virtual device.
     * 
     * Virtual device constituent photo delivery is only supported for certain AVCaptureSession sessionPresets and
     * AVCaptureDevice activeFormats. When switching cameras or formats this property may change. When this property
     * changes from YES to NO, virtualDeviceConstituentPhotoDeliveryEnabled also reverts to NO. If you've previously
     * opted in for virtual device constituent photo delivery and then change configurations, you may need to set
     * virtualDeviceConstituentPhotoDeliveryEnabled = YES again. This property is key-value observable.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("isVirtualDeviceConstituentPhotoDeliverySupported")
    public native boolean isVirtualDeviceConstituentPhotoDeliverySupported();

    /**
     * [@property] virtualDeviceFusionSupported
     * 
     * Indicates whether the virtual device image fusion feature is supported by the receiver.
     * 
     * This property may change as the session's -sessionPreset or source device's -activeFormat change. When using a
     * virtual AVCaptureDevice, its constituent camera images can be fused together to improve image quality when this
     * property answers YES. When virtual device fusion is not supported by the current configuration, your capture
     * requests always resolve virtualDeviceFusionEnabled to NO. This property is key-value observable.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("isVirtualDeviceFusionSupported")
    public native boolean isVirtualDeviceFusionSupported();

    /**
     * [@property] maxPhotoQualityPrioritization
     * 
     * Indicates the highest quality the receiver should be prepared to output on a capture-by-capture basis.
     * 
     * Default value is AVCapturePhotoQualityPrioritizationBalanced when attached to an AVCaptureSession, and
     * AVCapturePhotoQualityPrioritizationSpeed when attached to an AVCaptureMultiCamSession. The AVCapturePhotoOutput
     * is capable of applying a variety of techniques to improve photo quality (reduce noise, preserve detail in low
     * light, freeze motion, etc). Some techniques improve image quality at the expense of speed (shot-to-shot time).
     * Before starting your session, you may set this property to indicate the highest quality prioritization you intend
     * to request when calling -capturePhotoWithSettings:delegate:. When configuring an AVCapturePhotoSettings object,
     * you may not exceed this quality prioritization level, but you may select a lower (speedier) prioritization level.
     * 
     * Changing the maxPhotoQualityPrioritization while the session is running can result in a lengthy rebuild of the
     * session in which video preview is disrupted.
     * 
     * Setting the maxPhotoQualityPrioritization to .quality will turn on optical image stabilization if the
     * -isHighPhotoQualitySupported of the source device's -activeFormat is true.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("maxPhotoQualityPrioritization")
    @NInt
    public native long maxPhotoQualityPrioritization();

    /**
     * [@property] enabledSemanticSegmentationMatteTypes
     * 
     * An array of semantic segmentation matte types which the photo render pipeline is prepared to deliver.
     * 
     * Default is empty array. You may set this to the array of matte types you'd like to be delivered with your
     * AVCapturePhotos. The array may only contain values present in availableSemanticSegmentationMatteTypes. Enabling
     * semantic segmentation matte delivery requires a lengthy reconfiguration of the capture render pipeline, so if you
     * intend to capture semantic segmentation mattes, you should set this property to YES before calling
     * -[AVCaptureSession startRunning].
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setEnabledSemanticSegmentationMatteTypes:")
    public native void setEnabledSemanticSegmentationMatteTypes(NSArray<String> value);

    /**
     * [@property] maxPhotoQualityPrioritization
     * 
     * Indicates the highest quality the receiver should be prepared to output on a capture-by-capture basis.
     * 
     * Default value is AVCapturePhotoQualityPrioritizationBalanced when attached to an AVCaptureSession, and
     * AVCapturePhotoQualityPrioritizationSpeed when attached to an AVCaptureMultiCamSession. The AVCapturePhotoOutput
     * is capable of applying a variety of techniques to improve photo quality (reduce noise, preserve detail in low
     * light, freeze motion, etc). Some techniques improve image quality at the expense of speed (shot-to-shot time).
     * Before starting your session, you may set this property to indicate the highest quality prioritization you intend
     * to request when calling -capturePhotoWithSettings:delegate:. When configuring an AVCapturePhotoSettings object,
     * you may not exceed this quality prioritization level, but you may select a lower (speedier) prioritization level.
     * 
     * Changing the maxPhotoQualityPrioritization while the session is running can result in a lengthy rebuild of the
     * session in which video preview is disrupted.
     * 
     * Setting the maxPhotoQualityPrioritization to .quality will turn on optical image stabilization if the
     * -isHighPhotoQualitySupported of the source device's -activeFormat is true.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setMaxPhotoQualityPrioritization:")
    public native void setMaxPhotoQualityPrioritization(@NInt long value);

    /**
     * [@property] portraitEffectsMatteDeliveryEnabled
     * 
     * A BOOL specifying whether the photo render pipeline is prepared for portrait effects matte delivery.
     * 
     * Default is NO. Set to YES if you wish portrait effects mattes to be delivered with your AVCapturePhotos. This
     * property may only be set to YES if portraitEffectsMatteDeliverySupported is YES. Portrait effects matte
     * generation requires depth to be present, so when enabling portrait effects matte delivery, you must also set
     * depthDataDeliveryEnabled to YES. Enabling portrait effects matte delivery requires a lengthy reconfiguration of
     * the capture render pipeline, so if you intend to capture portrait effects mattes, you should set this property to
     * YES before calling -[AVCaptureSession startRunning].
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setPortraitEffectsMatteDeliveryEnabled:")
    public native void setPortraitEffectsMatteDeliveryEnabled(boolean value);

    /**
     * [@property] virtualDeviceConstituentPhotoDeliveryEnabled
     * 
     * Indicates whether the photo output is configured for delivery of photos from constituent cameras of a virtual
     * device.
     * 
     * Default value is NO. This property may only be set to YES if virtualDeviceConstituentPhotoDeliverySupported is
     * YES. Virtual device constituent photo delivery requires a lengthy reconfiguration of the capture render pipeline,
     * so if you intend to do any constituent photo delivery captures, you should set this property to YES before
     * calling -[AVCaptureSession startRunning]. See also -[AVCapturePhotoSettings
     * virtualDeviceConstituentPhotoDeliveryEnabledDevices].
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setVirtualDeviceConstituentPhotoDeliveryEnabled:")
    public native void setVirtualDeviceConstituentPhotoDeliveryEnabled(boolean value);

    /**
     * [@property] contentAwareDistortionCorrectionEnabled
     * 
     * A BOOL value specifying whether the photo render pipeline is set up to perform content aware distortion
     * correction.
     * 
     * Default is NO. Set to YES if you wish content aware distortion correction to be performed on your
     * AVCapturePhotos. This property may only be set to YES if contentAwareDistortionCorrectionSupported is YES. Note
     * that warping the photos to preserve more natural looking content may result in a small change in field of view
     * compared to what you see in the AVCaptureVideoPreviewLayer. The amount of field of view lost or gained is content
     * specific and may vary from photo to photo. Enabling this property requires a lengthy reconfiguration of the
     * capture render pipeline, so you should set this property to YES before calling -[AVCaptureSession startRunning].
     * 
     * API-Since: 14.1
     */
    @Generated
    @Selector("isContentAwareDistortionCorrectionEnabled")
    public native boolean isContentAwareDistortionCorrectionEnabled();

    /**
     * [@property] contentAwareDistortionCorrectionSupported
     * 
     * A BOOL value specifying whether content aware distortion correction is supported.
     * 
     * The rectilinear model used in optical design and by geometric distortion correction only preserves lines but not
     * area, angles, or distance. Thus the wider the field of view of a lens, the greater the areal distortion at the
     * edges of images. Content aware distortion correction, when enabled, intelligently corrects distortions by taking
     * content into consideration, such as faces near the edges of the image. This property returns YES if the session's
     * current configuration allows photos to be captured with content aware distortion correction. When switching
     * cameras or formats or enabling depth data delivery this property may change. When this property changes from YES
     * to NO, contentAwareDistortionCorrectionEnabled also reverts to NO. This property is key-value observable.
     * 
     * API-Since: 14.1
     */
    @Generated
    @Selector("isContentAwareDistortionCorrectionSupported")
    public native boolean isContentAwareDistortionCorrectionSupported();

    /**
     * [@property] contentAwareDistortionCorrectionEnabled
     * 
     * A BOOL value specifying whether the photo render pipeline is set up to perform content aware distortion
     * correction.
     * 
     * Default is NO. Set to YES if you wish content aware distortion correction to be performed on your
     * AVCapturePhotos. This property may only be set to YES if contentAwareDistortionCorrectionSupported is YES. Note
     * that warping the photos to preserve more natural looking content may result in a small change in field of view
     * compared to what you see in the AVCaptureVideoPreviewLayer. The amount of field of view lost or gained is content
     * specific and may vary from photo to photo. Enabling this property requires a lengthy reconfiguration of the
     * capture render pipeline, so you should set this property to YES before calling -[AVCaptureSession startRunning].
     * 
     * API-Since: 14.1
     */
    @Generated
    @Selector("setContentAwareDistortionCorrectionEnabled:")
    public native void setContentAwareDistortionCorrectionEnabled(boolean value);

    /**
     * [@property] appleProRAWEnabled
     * 
     * Indicates whether the photo output is configured for delivery of Apple ProRAW pixel formats as well as Bayer RAW
     * formats.
     * 
     * Setting this property to YES will enable support for taking photos in Apple ProRAW pixel formats. These formats
     * will be added to -availableRawPhotoPixelFormatTypes after any existing Bayer RAW formats. Compared to photos
     * taken with a Bayer RAW format, these photos will be demosaiced and partially processed. They are still
     * scene-referred, and allow capturing RAW photos in modes where there is no traditional sensor/Bayer RAW available.
     * Examples are any modes that rely on fusion of multiple captures. Use +isBayerRAWPixelFormat: to determine if a
     * pixel format in -availableRawPhotoPixelFormatTypes is a Bayer RAW format, and +isAppleProRAWPixelFormat: to
     * determine if it is an Apple ProRAW format. When writing an Apple ProRAW buffer to a DNG file, the resulting file
     * is known as "Linear DNG". Apple ProRAW formats are not supported on all platforms and devices. This property may
     * only be set to YES if appleProRAWSupported returns YES. This property is key-value observable.
     * 
     * Enabling this property requires a lengthy reconfiguration of the capture render pipeline, so you should set this
     * property to YES before calling -[AVCaptureSession startRunning].
     * 
     * API-Since: 14.3
     */
    @Generated
    @Selector("isAppleProRAWEnabled")
    public native boolean isAppleProRAWEnabled();

    /**
     * isAppleProRAWPixelFormat:
     * 
     * Returns YES if the given pixel format is an Apple ProRAW format.
     * 
     * May be used to distinguish Bayer RAW from Apple ProRAW pixel formats in -availableRawPhotoPixelFormatTypes once
     * appleProRAWEnabled has been set to YES.
     * 
     * See appleProRAWEnabled for more information on Apple ProRAW.
     * 
     * API-Since: 14.3
     */
    @Generated
    @Selector("isAppleProRAWPixelFormat:")
    public static native boolean isAppleProRAWPixelFormat(int pixelFormat);

    /**
     * [@property] appleProRAWSupported
     * 
     * Indicates whether the current configuration supports Apple ProRAW pixel formats.
     * 
     * The AVCapturePhotoSettings appleProRAWEnabled property may only be set to YES if this property returns YES. This
     * property is key-value observable.
     * 
     * API-Since: 14.3
     */
    @Generated
    @Selector("isAppleProRAWSupported")
    public native boolean isAppleProRAWSupported();

    /**
     * isBayerRAWPixelFormat:
     * 
     * Returns YES if the given pixel format is a Bayer RAW format.
     * 
     * May be used to distinguish Bayer RAW from Apple ProRAW pixel formats in -availableRawPhotoPixelFormatTypes once
     * appleProRAWEnabled has been set to YES.
     * 
     * API-Since: 14.3
     */
    @Generated
    @Selector("isBayerRAWPixelFormat:")
    public static native boolean isBayerRAWPixelFormat(int pixelFormat);

    /**
     * [@property] appleProRAWEnabled
     * 
     * Indicates whether the photo output is configured for delivery of Apple ProRAW pixel formats as well as Bayer RAW
     * formats.
     * 
     * Setting this property to YES will enable support for taking photos in Apple ProRAW pixel formats. These formats
     * will be added to -availableRawPhotoPixelFormatTypes after any existing Bayer RAW formats. Compared to photos
     * taken with a Bayer RAW format, these photos will be demosaiced and partially processed. They are still
     * scene-referred, and allow capturing RAW photos in modes where there is no traditional sensor/Bayer RAW available.
     * Examples are any modes that rely on fusion of multiple captures. Use +isBayerRAWPixelFormat: to determine if a
     * pixel format in -availableRawPhotoPixelFormatTypes is a Bayer RAW format, and +isAppleProRAWPixelFormat: to
     * determine if it is an Apple ProRAW format. When writing an Apple ProRAW buffer to a DNG file, the resulting file
     * is known as "Linear DNG". Apple ProRAW formats are not supported on all platforms and devices. This property may
     * only be set to YES if appleProRAWSupported returns YES. This property is key-value observable.
     * 
     * Enabling this property requires a lengthy reconfiguration of the capture render pipeline, so you should set this
     * property to YES before calling -[AVCaptureSession startRunning].
     * 
     * API-Since: 14.3
     */
    @Generated
    @Selector("setAppleProRAWEnabled:")
    public native void setAppleProRAWEnabled(boolean value);

    /**
     * [@property] maxPhotoDimensions
     * 
     * Indicates the maximum resolution of the requested photo.
     * 
     * Set this property to enable requesting of images up to as large as the specified dimensions. Images returned by
     * AVCapturePhotoOutput may be smaller than these dimensions but will never be larger. Once set, images can be
     * requested with any valid maximum photo dimensions by setting AVCapturePhotoSettings.maxPhotoDimensions on a per
     * photo basis. The dimensions set must match one of the dimensions returned by
     * AVCaptureDeviceFormat.supportedMaxPhotoDimensions for the current active format. Changing this property may
     * trigger a lengthy reconfiguration of the capture render pipeline so it is recommended that this is set before
     * calling -[AVCaptureSession startRunning].
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("maxPhotoDimensions")
    @ByValue
    public native CMVideoDimensions maxPhotoDimensions();

    /**
     * [@property] preservesLivePhotoCaptureSuspendedOnSessionStop
     * 
     * By default, Live Photo capture is resumed when the session stops. This property allows clients to opt out of this
     * and preserve the value of livePhotoCaptureSuspended.
     * 
     * Defaults to NO.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("preservesLivePhotoCaptureSuspendedOnSessionStop")
    public native boolean preservesLivePhotoCaptureSuspendedOnSessionStop();

    /**
     * [@property] maxPhotoDimensions
     * 
     * Indicates the maximum resolution of the requested photo.
     * 
     * Set this property to enable requesting of images up to as large as the specified dimensions. Images returned by
     * AVCapturePhotoOutput may be smaller than these dimensions but will never be larger. Once set, images can be
     * requested with any valid maximum photo dimensions by setting AVCapturePhotoSettings.maxPhotoDimensions on a per
     * photo basis. The dimensions set must match one of the dimensions returned by
     * AVCaptureDeviceFormat.supportedMaxPhotoDimensions for the current active format. Changing this property may
     * trigger a lengthy reconfiguration of the capture render pipeline so it is recommended that this is set before
     * calling -[AVCaptureSession startRunning].
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setMaxPhotoDimensions:")
    public native void setMaxPhotoDimensions(@ByValue CMVideoDimensions value);

    /**
     * [@property] preservesLivePhotoCaptureSuspendedOnSessionStop
     * 
     * By default, Live Photo capture is resumed when the session stops. This property allows clients to opt out of this
     * and preserve the value of livePhotoCaptureSuspended.
     * 
     * Defaults to NO.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setPreservesLivePhotoCaptureSuspendedOnSessionStop:")
    public native void setPreservesLivePhotoCaptureSuspendedOnSessionStop(boolean value);
}
