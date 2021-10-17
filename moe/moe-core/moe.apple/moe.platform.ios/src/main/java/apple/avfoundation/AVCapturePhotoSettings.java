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
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
 * AVCapturePhotoSettings
 * <p>
 * A mutable settings object encapsulating all the desired properties of a photo capture.
 * <p>
 * To take a picture, a client instantiates and configures an AVCapturePhotoSettings object, then calls AVCapturePhotoOutput's -capturePhotoWithSettings:delegate:, passing the settings and a delegate to be informed when events relating to the photo capture occur. Since AVCapturePhotoSettings has no reference to the AVCapturePhotoOutput instance with which it will be used, minimal validation occurs while you configure an AVCapturePhotoSettings instance. The bulk of the validation is executed when you call AVCapturePhotoOutput's -capturePhotoWithSettings:delegate:.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCapturePhotoSettings extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCapturePhotoSettings(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCapturePhotoSettings alloc();

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

    /**
     * photoSettings
     * <p>
     * Creates a default instance of AVCapturePhotoSettings.
     * <p>
     * A default AVCapturePhotoSettings object has a format of AVVideoCodecTypeJPEG, a fileType of AVFileTypeJPEG, and photoQualityPrioritization set to AVCapturePhotoQualityPrioritizationBalanced.
     *
     * @return An instance of AVCapturePhotoSettings.
     */
    @Generated
    @Selector("photoSettings")
    public static native AVCapturePhotoSettings photoSettings();

    /**
     * photoSettingsFromPhotoSettings:
     * <p>
     * Creates an instance of AVCapturePhotoSettings with a new uniqueID from an existing instance of AVCapturePhotoSettings.
     * <p>
     * Use this factory method to create a clone of an existing photo settings instance, but with a new uniqueID that can safely be passed to AVCapturePhotoOutput -capturePhotoWithSettings:delegate:.
     *
     * @param photoSettings An existing AVCapturePhotoSettings instance.
     * @return An new instance of AVCapturePhotoSettings with new uniqueID.
     */
    @Generated
    @Selector("photoSettingsFromPhotoSettings:")
    public static native AVCapturePhotoSettings photoSettingsFromPhotoSettings(AVCapturePhotoSettings photoSettings);

    /**
     * photoSettingsWithFormat:
     * <p>
     * Creates an instance of AVCapturePhotoSettings with a user-specified output format.
     * <p>
     * If you wish an uncompressed format, your dictionary must contain kCVPixelBufferPixelFormatTypeKey, and the format specified must be present in AVCapturePhotoOutput's -availablePhotoPixelFormatTypes array. kCVPixelBufferPixelFormatTypeKey is the only supported key when expressing uncompressed output. If you wish a compressed format, your dictionary must contain AVVideoCodecKey and the codec specified must be present in AVCapturePhotoOutput's -availablePhotoCodecTypes array. If you are specifying a compressed format, the AVVideoCompressionPropertiesKey is also supported, with a payload dictionary containing a single AVVideoQualityKey. Passing a nil format dictionary is analogous to calling +photoSettings.
     *
     * @param format A dictionary of Core Video pixel buffer attributes or AVVideoSettings, analogous to AVCaptureStillImageOutput's outputSettings property.
     * @return An instance of AVCapturePhotoSettings.
     */
    @Generated
    @Selector("photoSettingsWithFormat:")
    public static native AVCapturePhotoSettings photoSettingsWithFormat(NSDictionary<String, ?> format);

    /**
     * photoSettingsWithRawPixelFormatType:
     * <p>
     * Creates an instance of AVCapturePhotoSettings specifying RAW only output.
     * <p>
     * rawPixelFormatType must be one of the OSTypes contained in AVCapturePhotoOutput's -availableRawPhotoPixelFormatTypes array. See AVCapturePhotoOutput's -capturePhotoWithSettings:delegate: inline documentation for a discussion of restrictions on AVCapturePhotoSettings when requesting RAW capture.
     *
     * @param rawPixelFormatType A Bayer RAW or Apple ProRAW pixel format OSType (defined in CVPixelBuffer.h).
     * @return An instance of AVCapturePhotoSettings.
     */
    @Generated
    @Selector("photoSettingsWithRawPixelFormatType:")
    public static native AVCapturePhotoSettings photoSettingsWithRawPixelFormatType(int rawPixelFormatType);

    /**
     * photoSettingsWithRawPixelFormatType:processedFormat:
     * <p>
     * Creates an instance of AVCapturePhotoSettings specifying RAW + a processed format (such as JPEG).
     * <p>
     * rawPixelFormatType must be one of the OSTypes contained in AVCapturePhotoOutput's -availableRawPhotoPixelFormatTypes array. If you wish an uncompressed processedFormat, your dictionary must contain kCVPixelBufferPixelFormatTypeKey, and the processedFormat specified must be present in AVCapturePhotoOutput's -availablePhotoPixelFormatTypes array. kCVPixelBufferPixelFormatTypeKey is the only supported key when expressing uncompressed processedFormat. If you wish a compressed format, your dictionary must contain AVVideoCodecKey and the codec specified must be present in AVCapturePhotoOutput's -availablePhotoCodecTypes array. If you are specifying a compressed format, the AVVideoCompressionPropertiesKey is also supported, with a payload dictionary containing a single AVVideoQualityKey. Passing a nil processedFormat dictionary is analogous to calling +photoSettingsWithRawPixelFormatType:. See AVCapturePhotoOutput's -capturePhotoWithSettings:delegate: inline documentation for a discussion of restrictions on AVCapturePhotoSettings when requesting RAW capture.
     *
     * @param rawPixelFormatType A Bayer RAW or Apple ProRAW pixel format OSType (defined in CVPixelBuffer.h).
     * @param processedFormat    A dictionary of Core Video pixel buffer attributes or AVVideoSettings, analogous to AVCaptureStillImageOutput's outputSettings property.
     * @return An instance of AVCapturePhotoSettings.
     */
    @Generated
    @Selector("photoSettingsWithRawPixelFormatType:processedFormat:")
    public static native AVCapturePhotoSettings photoSettingsWithRawPixelFormatTypeProcessedFormat(
            int rawPixelFormatType, NSDictionary<String, ?> processedFormat);

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
     * [@property] availablePreviewPhotoPixelFormatTypes
     * <p>
     * An array of available kCVPixelBufferPixelFormatTypeKeys that may be used when specifying a previewPhotoFormat.
     * <p>
     * The array is sorted such that the preview format requiring the fewest conversions is presented first.
     */
    @Generated
    @Selector("availablePreviewPhotoPixelFormatTypes")
    public native NSArray<? extends NSNumber> availablePreviewPhotoPixelFormatTypes();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * [@property] flashMode
     * <p>
     * Specifies whether the flash should be on, off, or chosen automatically by AVCapturePhotoOutput.
     * <p>
     * flashMode takes the place of the deprecated AVCaptureDevice -flashMode API. Setting AVCaptureDevice.flashMode has no effect on AVCapturePhotoOutput, which only pays attention to the flashMode specified in your AVCapturePhotoSettings. The default value is AVCaptureFlashModeOff. Flash modes are defined in AVCaptureDevice.h. If you specify a flashMode of AVCaptureFlashModeOn, it wins over autoStillImageStabilizationEnabled=YES. When the device becomes very hot, the flash becomes temporarily unavailable until the device cools down (see AVCaptureDevice's -flashAvailable). While the flash is unavailable, AVCapturePhotoOutput's -supportedFlashModes property still reports AVCaptureFlashModeOn and AVCaptureFlashModeAuto as being available, thus allowing you to specify a flashMode of AVCaptureModeOn. You should always check the AVCaptureResolvedPhotoSettings provided to you in the AVCapturePhotoCaptureDelegate callbacks, as the resolved flashEnabled property will tell you definitively if the flash is being used.
     */
    @Generated
    @Selector("flashMode")
    @NInt
    public native long flashMode();

    /**
     * [@property] format
     * <p>
     * A dictionary of Core Video pixel buffer attributes or AVVideoSettings, analogous to AVCaptureStillImageOutput's outputSettings property.
     * <p>
     * The format dictionary you passed to one of the creation methods. May be nil if you've specified RAW-only capture.
     */
    @Generated
    @Selector("format")
    public native NSDictionary<String, ?> format();

    @Generated
    @Selector("init")
    public native AVCapturePhotoSettings init();

    /**
     * [@property] autoDualCameraFusionEnabled
     * <p>
     * Specifies whether DualCamera image fusion should be used automatically.
     * <p>
     * Default is YES unless you are capturing a RAW photo (RAW photos may not be processed by definition) or a bracket using AVCapturePhotoBracketSettings. When set to YES, and -[AVCapturePhotoOutput isDualCameraFusionSupported] is also YES, wide-angle and telephoto images may be fused to improve still image quality, depending on the current zoom factor, light levels, and focus position. You may determine whether DualCamera fusion is enabled for a particular capture request by inspecting the dualCameraFusionEnabled property of the AVCaptureResolvedPhotoSettings. Note that when using the deprecated AVCaptureStillImageOutput interface with the DualCamera, auto DualCamera fusion is always enabled and may not be turned off. As of iOS 13, this property is deprecated in favor of autoVirtualDeviceFusionEnabled.
     */
    @Generated
    @Selector("isAutoDualCameraFusionEnabled")
    public native boolean isAutoDualCameraFusionEnabled();

    /**
     * [@property] autoDualCameraFusionEnabled
     * <p>
     * Specifies whether DualCamera image fusion should be used automatically.
     * <p>
     * Default is YES unless you are capturing a RAW photo (RAW photos may not be processed by definition) or a bracket using AVCapturePhotoBracketSettings. When set to YES, and -[AVCapturePhotoOutput isDualCameraFusionSupported] is also YES, wide-angle and telephoto images may be fused to improve still image quality, depending on the current zoom factor, light levels, and focus position. You may determine whether DualCamera fusion is enabled for a particular capture request by inspecting the dualCameraFusionEnabled property of the AVCaptureResolvedPhotoSettings. Note that when using the deprecated AVCaptureStillImageOutput interface with the DualCamera, auto DualCamera fusion is always enabled and may not be turned off. As of iOS 13, this property is deprecated in favor of autoVirtualDeviceFusionEnabled.
     */
    @Generated
    @Selector("setAutoDualCameraFusionEnabled:")
    public native void setAutoDualCameraFusionEnabled(boolean value);

    /**
     * [@property] autoStillImageStabilizationEnabled
     * <p>
     * Specifies whether still image stabilization should be used automatically.
     * <p>
     * Default is YES unless you are capturing a Bayer RAW photo (Bayer RAW photos may not be processed by definition) or a bracket using AVCapturePhotoBracketSettings. When set to YES, still image stabilization is applied automatically in low light to counteract hand shake. If the device has optical image stabilization, autoStillImageStabilizationEnabled makes use of lens stabilization as well.
     * <p>
     * As of iOS 13 hardware, the AVCapturePhotoOutput is capable of applying a variety of multi-image fusion techniques to improve photo quality (reduce noise, preserve detail in low light, freeze motion, etc), all of which have been previously lumped under the stillImageStabilization moniker. This property should no longer be used as it no longer provides meaningful information about the techniques used to improve quality in a photo capture. Instead, you should use -photoQualityPrioritization to indicate your preferred quality vs speed.
     */
    @Generated
    @Selector("isAutoStillImageStabilizationEnabled")
    public native boolean isAutoStillImageStabilizationEnabled();

    /**
     * [@property] autoStillImageStabilizationEnabled
     * <p>
     * Specifies whether still image stabilization should be used automatically.
     * <p>
     * Default is YES unless you are capturing a Bayer RAW photo (Bayer RAW photos may not be processed by definition) or a bracket using AVCapturePhotoBracketSettings. When set to YES, still image stabilization is applied automatically in low light to counteract hand shake. If the device has optical image stabilization, autoStillImageStabilizationEnabled makes use of lens stabilization as well.
     * <p>
     * As of iOS 13 hardware, the AVCapturePhotoOutput is capable of applying a variety of multi-image fusion techniques to improve photo quality (reduce noise, preserve detail in low light, freeze motion, etc), all of which have been previously lumped under the stillImageStabilization moniker. This property should no longer be used as it no longer provides meaningful information about the techniques used to improve quality in a photo capture. Instead, you should use -photoQualityPrioritization to indicate your preferred quality vs speed.
     */
    @Generated
    @Selector("setAutoStillImageStabilizationEnabled:")
    public native void setAutoStillImageStabilizationEnabled(boolean value);

    /**
     * [@property] highResolutionPhotoEnabled
     * <p>
     * Specifies whether photos should be captured at the highest resolution supported by the source AVCaptureDevice's activeFormat.
     * <p>
     * Default is NO. By default, AVCapturePhotoOutput emits images with the same dimensions as its source AVCaptureDevice's activeFormat.formatDescription. However, if you set this property to YES, the AVCapturePhotoOutput emits images at its source AVCaptureDevice's activeFormat.highResolutionStillImageDimensions. Note that if you enable video stabilization (see AVCaptureConnection's preferredVideoStabilizationMode) for any output, the high resolution photos emitted by AVCapturePhotoOutput may be smaller by 10 or more percent. You may inspect your AVCaptureResolvedPhotoSettings in the delegate callbacks to discover the exact dimensions of the capture photo(s).
     * <p>
     * Starting in iOS 14.5 if you disable geometric distortion correction, the high resolution photo emitted by AVCapturePhotoOutput may be is smaller depending on the format.
     */
    @Generated
    @Selector("isHighResolutionPhotoEnabled")
    public native boolean isHighResolutionPhotoEnabled();

    /**
     * [@property] highResolutionPhotoEnabled
     * <p>
     * Specifies whether photos should be captured at the highest resolution supported by the source AVCaptureDevice's activeFormat.
     * <p>
     * Default is NO. By default, AVCapturePhotoOutput emits images with the same dimensions as its source AVCaptureDevice's activeFormat.formatDescription. However, if you set this property to YES, the AVCapturePhotoOutput emits images at its source AVCaptureDevice's activeFormat.highResolutionStillImageDimensions. Note that if you enable video stabilization (see AVCaptureConnection's preferredVideoStabilizationMode) for any output, the high resolution photos emitted by AVCapturePhotoOutput may be smaller by 10 or more percent. You may inspect your AVCaptureResolvedPhotoSettings in the delegate callbacks to discover the exact dimensions of the capture photo(s).
     * <p>
     * Starting in iOS 14.5 if you disable geometric distortion correction, the high resolution photo emitted by AVCapturePhotoOutput may be is smaller depending on the format.
     */
    @Generated
    @Selector("setHighResolutionPhotoEnabled:")
    public native void setHighResolutionPhotoEnabled(boolean value);

    /**
     * [@property] livePhotoMovieFileURL
     * <p>
     * Specifies that a Live Photo movie be captured to complement the still photo.
     * <p>
     * A Live Photo movie is a short movie (with audio, if you've added an audio input to your session) containing the moments right before and after the still photo. A QuickTime movie file will be written to disk at the URL specified if it is a valid file URL accessible to your app's sandbox. You may only set this property if AVCapturePhotoOutput's livePhotoCaptureSupported property is YES. When you specify a Live Photo, your AVCapturePhotoCaptureDelegate object must implement -captureOutput:didFinishProcessingLivePhotoToMovieFileAtURL:duration:photoDisplayTime:resolvedSettings:error:.
     */
    @Generated
    @Selector("livePhotoMovieFileURL")
    public native NSURL livePhotoMovieFileURL();

    /**
     * [@property] livePhotoMovieMetadata
     * <p>
     * Movie-level metadata to be written to the Live Photo movie.
     * <p>
     * An array of AVMetadataItems to be inserted into the top level of the Live Photo movie. The receiver makes immutable copies of the AVMetadataItems in the array. Live Photo movies always contain a AVMetadataQuickTimeMetadataKeyContentIdentifier which allow them to be paired with a similar identifier in the MakerNote of the photo complement. AVCapturePhotoSettings generates a unique content identifier for you. If you provide a metadata array containing an AVMetadataItem with keyspace = AVMetadataKeySpaceQuickTimeMetadata and key = AVMetadataQuickTimeMetadataKeyContentIdentifier, an NSInvalidArgumentException is thrown.
     */
    @Generated
    @Selector("livePhotoMovieMetadata")
    public native NSArray<? extends AVMetadataItem> livePhotoMovieMetadata();

    /**
     * [@property] previewPhotoFormat
     * <p>
     * A dictionary of Core Video pixel buffer attributes specifying the preview photo format to be delivered along with the RAW or processed photo.
     * <p>
     * A dictionary of pixel buffer attributes specifying a smaller version of the RAW or processed photo for preview purposes. The kCVPixelBufferPixelFormatTypeKey is required and must be present in the receiver's -availablePreviewPhotoPixelFormatTypes array. Optional keys are { kCVPixelBufferWidthKey | kCVPixelBufferHeightKey }. If you wish to specify dimensions, you must add both width and height. Width and height are only honored up to the display dimensions. If you specify a width and height whose aspect ratio differs from the RAW or processed photo, the larger of the two dimensions is honored and aspect ratio of the RAW or processed photo is always preserved.
     */
    @Generated
    @Selector("previewPhotoFormat")
    public native NSDictionary<String, ?> previewPhotoFormat();

    /**
     * [@property] rawPhotoPixelFormatType
     * <p>
     * A Bayer RAW or Apple ProRAW pixel format OSType (defined in CVPixelBuffer.h).
     * <p>
     * The rawPixelFormatType you specified in one of the creation methods. Returns 0 if you did not specify RAW capture. See AVCapturePhotoOutput's -capturePhotoWithSettings:delegate: inline documentation for a discussion of restrictions on AVCapturePhotoSettings when requesting RAW capture.
     */
    @Generated
    @Selector("rawPhotoPixelFormatType")
    public native int rawPhotoPixelFormatType();

    /**
     * [@property] flashMode
     * <p>
     * Specifies whether the flash should be on, off, or chosen automatically by AVCapturePhotoOutput.
     * <p>
     * flashMode takes the place of the deprecated AVCaptureDevice -flashMode API. Setting AVCaptureDevice.flashMode has no effect on AVCapturePhotoOutput, which only pays attention to the flashMode specified in your AVCapturePhotoSettings. The default value is AVCaptureFlashModeOff. Flash modes are defined in AVCaptureDevice.h. If you specify a flashMode of AVCaptureFlashModeOn, it wins over autoStillImageStabilizationEnabled=YES. When the device becomes very hot, the flash becomes temporarily unavailable until the device cools down (see AVCaptureDevice's -flashAvailable). While the flash is unavailable, AVCapturePhotoOutput's -supportedFlashModes property still reports AVCaptureFlashModeOn and AVCaptureFlashModeAuto as being available, thus allowing you to specify a flashMode of AVCaptureModeOn. You should always check the AVCaptureResolvedPhotoSettings provided to you in the AVCapturePhotoCaptureDelegate callbacks, as the resolved flashEnabled property will tell you definitively if the flash is being used.
     */
    @Generated
    @Selector("setFlashMode:")
    public native void setFlashMode(@NInt long value);

    /**
     * [@property] livePhotoMovieFileURL
     * <p>
     * Specifies that a Live Photo movie be captured to complement the still photo.
     * <p>
     * A Live Photo movie is a short movie (with audio, if you've added an audio input to your session) containing the moments right before and after the still photo. A QuickTime movie file will be written to disk at the URL specified if it is a valid file URL accessible to your app's sandbox. You may only set this property if AVCapturePhotoOutput's livePhotoCaptureSupported property is YES. When you specify a Live Photo, your AVCapturePhotoCaptureDelegate object must implement -captureOutput:didFinishProcessingLivePhotoToMovieFileAtURL:duration:photoDisplayTime:resolvedSettings:error:.
     */
    @Generated
    @Selector("setLivePhotoMovieFileURL:")
    public native void setLivePhotoMovieFileURL(NSURL value);

    /**
     * [@property] livePhotoMovieMetadata
     * <p>
     * Movie-level metadata to be written to the Live Photo movie.
     * <p>
     * An array of AVMetadataItems to be inserted into the top level of the Live Photo movie. The receiver makes immutable copies of the AVMetadataItems in the array. Live Photo movies always contain a AVMetadataQuickTimeMetadataKeyContentIdentifier which allow them to be paired with a similar identifier in the MakerNote of the photo complement. AVCapturePhotoSettings generates a unique content identifier for you. If you provide a metadata array containing an AVMetadataItem with keyspace = AVMetadataKeySpaceQuickTimeMetadata and key = AVMetadataQuickTimeMetadataKeyContentIdentifier, an NSInvalidArgumentException is thrown.
     */
    @Generated
    @Selector("setLivePhotoMovieMetadata:")
    public native void setLivePhotoMovieMetadata(NSArray<? extends AVMetadataItem> value);

    /**
     * [@property] previewPhotoFormat
     * <p>
     * A dictionary of Core Video pixel buffer attributes specifying the preview photo format to be delivered along with the RAW or processed photo.
     * <p>
     * A dictionary of pixel buffer attributes specifying a smaller version of the RAW or processed photo for preview purposes. The kCVPixelBufferPixelFormatTypeKey is required and must be present in the receiver's -availablePreviewPhotoPixelFormatTypes array. Optional keys are { kCVPixelBufferWidthKey | kCVPixelBufferHeightKey }. If you wish to specify dimensions, you must add both width and height. Width and height are only honored up to the display dimensions. If you specify a width and height whose aspect ratio differs from the RAW or processed photo, the larger of the two dimensions is honored and aspect ratio of the RAW or processed photo is always preserved.
     */
    @Generated
    @Selector("setPreviewPhotoFormat:")
    public native void setPreviewPhotoFormat(NSDictionary<String, ?> value);

    /**
     * [@property] uniqueID
     * <p>
     * A 64-bit number that uniquely identifies this instance.
     * <p>
     * When you create an instance of AVCapturePhotoSettings, a uniqueID is generated automatically. This uniqueID is guaranteed to be unique for the life time of your process.
     */
    @Generated
    @Selector("uniqueID")
    public native long uniqueID();

    /**
     * [@property] availableEmbeddedThumbnailPhotoCodecTypes
     * <p>
     * An array of available AVVideoCodecKeys that may be used when specifying an embeddedThumbnailPhotoFormat.
     * <p>
     * The array is sorted such that the thumbnail codec type that is most backward compatible is listed first.
     */
    @Generated
    @Selector("availableEmbeddedThumbnailPhotoCodecTypes")
    public native NSArray<String> availableEmbeddedThumbnailPhotoCodecTypes();

    /**
     * [@property] embeddedThumbnailPhotoFormat
     * <p>
     * A dictionary of AVVideoSettings keys specifying the thumbnail format to be written to the processed or RAW photo.
     * <p>
     * A dictionary of AVVideoSettings keys specifying a thumbnail (usually smaller) version of the processed photo to be embedded in that image before calling the AVCapturePhotoCaptureDelegate. This image is sometimes referred to as a "thumbnail image". The AVVideoCodecKey is required and must be present in the receiver's -availableEmbeddedThumbnailPhotoCodecTypes array. Optional keys are { AVVideoWidthKey | AVVideoHeightKey }. If you wish to specify dimensions, you must specify both width and height. If you specify a width and height whose aspect ratio differs from the processed photo, the larger of the two dimensions is honored and aspect ratio of the RAW or processed photo is always preserved. For RAW captures, use -rawEmbeddedThumbnailPhotoFormat to specify the thumbnail format you'd like to capture in the RAW image. For apps linked on or after iOS 12, the raw thumbnail format must be specified using the -rawEmbeddedThumbnailPhotoFormat API rather than -embeddedThumbnailPhotoFormat. Beginning in iOS 12, HEIC files may contain thumbnails up to the full resolution of the main image.
     */
    @Generated
    @Selector("embeddedThumbnailPhotoFormat")
    public native NSDictionary<String, ?> embeddedThumbnailPhotoFormat();

    /**
     * [@property] embedsDepthDataInPhoto
     * <p>
     * Specifies whether depth data included with this photo should be written to the photo's file structure.
     * <p>
     * Default is YES. When depthDataDeliveryEnabled is set to YES, this property specifies whether the included depth data should be written to the resulting photo's internal file structure. Depth data is currently only supported in HEIF and JPEG. This property is ignored if depthDataDeliveryEnabled is set to NO.
     */
    @Generated
    @Selector("embedsDepthDataInPhoto")
    public native boolean embedsDepthDataInPhoto();

    /**
     * [@property] cameraCalibrationDataDeliveryEnabled
     * <p>
     * Specifies whether AVCameraCalibrationData should be captured and delivered along with this photo.
     * <p>
     * Default is NO. Set to YES if you wish to receive camera calibration data with your photo. Camera calibration data is delivered as a property of an AVCapturePhoto, so if you are using the CMSampleBuffer delegate callbacks rather than -captureOutput:didFinishProcessingPhoto:error:, an exception is thrown. Also, you may only set this property to YES if your AVCapturePhotoOutput's cameraCalibrationDataDeliverySupported property is YES and 2 or more devices are selected for virtual device constituent photo delivery. When requesting virtual device constituent photo delivery plus camera calibration data, the photos for each constituent device each contain camera calibration data. Note that AVCameraCalibrationData can be delivered as a property of an AVCapturePhoto or an AVDepthData, thus your delegate must respond to the captureOutput:didFinishProcessingPhoto:error: selector.
     */
    @Generated
    @Selector("isCameraCalibrationDataDeliveryEnabled")
    public native boolean isCameraCalibrationDataDeliveryEnabled();

    /**
     * [@property] depthDataDeliveryEnabled
     * <p>
     * Specifies whether AVDepthData should be captured along with the photo.
     * <p>
     * Default is NO. Set to YES if you wish to receive depth data with your photo. Throws an exception if -[AVCapturePhotoOutput depthDataDeliveryEnabled] is not set to YES or your delegate does not respond to the captureOutput:didFinishProcessingPhoto:error: selector. Note that setting this property to YES may add significant processing time to the delivery of your didFinishProcessingPhoto: callback.
     * <p>
     * For best rendering results in Apple's Photos.app, portrait photos should be captured with both embedded depth data and a portrait effects matte (see portraitEffectsMatteDeliveryEnabled). When supported, it is recommended to opt in for both of these auxiliary images in your photo captures involving depth.
     */
    @Generated
    @Selector("isDepthDataDeliveryEnabled")
    public native boolean isDepthDataDeliveryEnabled();

    /**
     * [@property] depthDataFiltered
     * <p>
     * Specifies whether the depth data delivered with the photo should be filtered to fill invalid values.
     * <p>
     * Default is YES. This property is ignored unless depthDataDeliveryEnabled is set to YES. Depth data maps may contain invalid pixel values due to a variety of factors including occlusions and low light. When depthDataFiltered is set to YES, the photo output interpolates missing data, filling in all holes.
     */
    @Generated
    @Selector("isDepthDataFiltered")
    public native boolean isDepthDataFiltered();

    /**
     * [@property] dualCameraDualPhotoDeliveryEnabled
     * <p>
     * Specifies whether the DualCamera should return both the telephoto and wide image.
     * <p>
     * Default is NO. When set to YES, your captureOutput:didFinishProcessingPhoto:error: callback will receive twice the number of callbacks, as both the telephoto image(s) and wide-angle image(s) are delivered. You may only set this property to YES if you've set your AVCapturePhotoOutput's dualCameraDualPhotoDeliveryEnabled property to YES, and your delegate responds to the captureOutput:didFinishProcessingPhoto:error: selector. As of iOS 13, this property is deprecated in favor of virtualDeviceConstituentPhotoDeliveryEnabledDevices.
     */
    @Generated
    @Selector("isDualCameraDualPhotoDeliveryEnabled")
    public native boolean isDualCameraDualPhotoDeliveryEnabled();

    /**
     * [@property] livePhotoVideoCodecType
     * <p>
     * Specifies the video codec type to use when compressing video for the Live Photo movie complement.
     * <p>
     * Prior to iOS 11, all Live Photo movie video tracks are compressed using H.264. Beginning in iOS 11, you can select the Live Photo movie video compression format by specifying one of the strings present in AVCapturePhotoOutput's availableLivePhotoVideoCodecTypes array.
     */
    @Generated
    @Selector("livePhotoVideoCodecType")
    public native String livePhotoVideoCodecType();

    /**
     * [@property] metadata
     * <p>
     * A dictionary of metadata key/value pairs you'd like to have written to each photo in the capture request.
     * <p>
     * Valid metadata keys are found in <ImageIO/CGImageProperties.h>. AVCapturePhotoOutput inserts a base set of metadata into each photo it captures, such as kCGImagePropertyOrientation, kCGImagePropertyExifDictionary, and kCGImagePropertyMakerAppleDictionary. You may specify metadata keys and values that should be written to each photo in the capture request. If you've specified metadata that also appears in AVCapturePhotoOutput's base set, your value replaces the base value. An NSInvalidArgumentException is thrown if you specify keys other than those found in <ImageIO/CGImageProperties.h>.
     */
    @Generated
    @Selector("metadata")
    public native NSDictionary<String, ?> metadata();

    /**
     * photoSettingsWithRawPixelFormatType:processedFormat:fileType:
     * <p>
     * Creates an instance of AVCapturePhotoSettings specifying RAW + a processed format (such as JPEG) and a file container to which it will be written.
     * <p>
     * rawPixelFormatType must be one of the OSTypes contained in AVCapturePhotoOutput's -availableRawPhotoPixelFormatTypes array. Set rawPixelFormatType to 0 if you do not desire a RAW photo callback. If you are specifying a rawFileType, it must be present in AVCapturePhotoOutput's -availableRawPhotoFileTypes array. If you wish an uncompressed processedFormat, your dictionary must contain kCVPixelBufferPixelFormatTypeKey, and the processedFormat specified must be present in AVCapturePhotoOutput's -availablePhotoPixelFormatTypes array. kCVPixelBufferPixelFormatTypeKey is the only supported key when expressing uncompressed processedFormat. If you wish a compressed format, your dictionary must contain AVVideoCodecKey and the codec specified must be present in AVCapturePhotoOutput's -availablePhotoCodecTypes array. If you are specifying a compressed format, the AVVideoCompressionPropertiesKey is also supported, with a payload dictionary containing a single AVVideoQualityKey. If you are specifying a processedFileType, it must be present in AVCapturePhotoOutput's -availablePhotoFileTypes array. Pass a nil processedFormat dictionary if you only desire a RAW photo capture. See AVCapturePhotoOutput's -capturePhotoWithSettings:delegate: inline documentation for a discussion of restrictions on AVCapturePhotoSettings when requesting RAW capture.
     *
     * @param rawPixelFormatType A Bayer RAW or Apple ProRAW pixel format OSType (defined in CVPixelBuffer.h). Pass 0 if you do not desire a RAW photo callback.
     * @param rawFileType        The file container for which the RAW image should be formatted to be written. Pass nil if you have no preferred file container. A default container will be chosen for you.
     * @param processedFormat    A dictionary of Core Video pixel buffer attributes or AVVideoSettings, analogous to AVCaptureStillImageOutput's outputSettings property. Pass nil if you do not desire a processed photo callback.
     * @param processedFileType  The file container for which the processed image should be formatted to be written. Pass nil if you have no preferred file container. A default container will be chosen for you.
     * @return An instance of AVCapturePhotoSettings.
     */
    @Generated
    @Selector("photoSettingsWithRawPixelFormatType:rawFileType:processedFormat:processedFileType:")
    public static native AVCapturePhotoSettings photoSettingsWithRawPixelFormatTypeRawFileTypeProcessedFormatProcessedFileType(
            int rawPixelFormatType, String rawFileType, NSDictionary<String, ?> processedFormat,
            String processedFileType);

    /**
     * [@property] processedFileType
     * <p>
     * The file container for which the processed photo is formatted to be stored.
     * <p>
     * The formatting of data within a photo buffer is often dependent on the file format intended for storage. For instance, a JPEG encoded photo buffer intended for storage in a JPEG (JPEG File Interchange Format) file differs from JPEG to be stored in HEIF. The HEIF-containerized JPEG buffer is tiled for readback efficiency and partitioned into the box structure dictated by the HEIF file format. Some codecs are only supported by AVCapturePhotoOutput if containerized. For instance, the AVVideoCodecTypeHEVC is only supported with AVFileTypeHEIF and AVFileTypeHEIC formatting. To discover which photo pixel format types and video codecs are supported for a given file type, you may query AVCapturePhotoOutput's -supportedPhotoPixelFormatTypesForFileType:, or -supportedPhotoCodecTypesForFileType: respectively.
     */
    @Generated
    @Selector("processedFileType")
    public native String processedFileType();

    /**
     * [@property] rawFileType
     * <p>
     * The file container for which the RAW photo is formatted to be stored.
     * <p>
     * The formatting of data within a RAW photo buffer may be dependent on the file format intended for storage. To discover which RAW photo pixel format types are supported for a given file type, you may query AVCapturePhotoOutput's -supportedRawPhotoPixelFormatTypesForFileType:.
     */
    @Generated
    @Selector("rawFileType")
    public native String rawFileType();

    /**
     * [@property] cameraCalibrationDataDeliveryEnabled
     * <p>
     * Specifies whether AVCameraCalibrationData should be captured and delivered along with this photo.
     * <p>
     * Default is NO. Set to YES if you wish to receive camera calibration data with your photo. Camera calibration data is delivered as a property of an AVCapturePhoto, so if you are using the CMSampleBuffer delegate callbacks rather than -captureOutput:didFinishProcessingPhoto:error:, an exception is thrown. Also, you may only set this property to YES if your AVCapturePhotoOutput's cameraCalibrationDataDeliverySupported property is YES and 2 or more devices are selected for virtual device constituent photo delivery. When requesting virtual device constituent photo delivery plus camera calibration data, the photos for each constituent device each contain camera calibration data. Note that AVCameraCalibrationData can be delivered as a property of an AVCapturePhoto or an AVDepthData, thus your delegate must respond to the captureOutput:didFinishProcessingPhoto:error: selector.
     */
    @Generated
    @Selector("setCameraCalibrationDataDeliveryEnabled:")
    public native void setCameraCalibrationDataDeliveryEnabled(boolean value);

    /**
     * [@property] depthDataDeliveryEnabled
     * <p>
     * Specifies whether AVDepthData should be captured along with the photo.
     * <p>
     * Default is NO. Set to YES if you wish to receive depth data with your photo. Throws an exception if -[AVCapturePhotoOutput depthDataDeliveryEnabled] is not set to YES or your delegate does not respond to the captureOutput:didFinishProcessingPhoto:error: selector. Note that setting this property to YES may add significant processing time to the delivery of your didFinishProcessingPhoto: callback.
     * <p>
     * For best rendering results in Apple's Photos.app, portrait photos should be captured with both embedded depth data and a portrait effects matte (see portraitEffectsMatteDeliveryEnabled). When supported, it is recommended to opt in for both of these auxiliary images in your photo captures involving depth.
     */
    @Generated
    @Selector("setDepthDataDeliveryEnabled:")
    public native void setDepthDataDeliveryEnabled(boolean value);

    /**
     * [@property] depthDataFiltered
     * <p>
     * Specifies whether the depth data delivered with the photo should be filtered to fill invalid values.
     * <p>
     * Default is YES. This property is ignored unless depthDataDeliveryEnabled is set to YES. Depth data maps may contain invalid pixel values due to a variety of factors including occlusions and low light. When depthDataFiltered is set to YES, the photo output interpolates missing data, filling in all holes.
     */
    @Generated
    @Selector("setDepthDataFiltered:")
    public native void setDepthDataFiltered(boolean value);

    /**
     * [@property] dualCameraDualPhotoDeliveryEnabled
     * <p>
     * Specifies whether the DualCamera should return both the telephoto and wide image.
     * <p>
     * Default is NO. When set to YES, your captureOutput:didFinishProcessingPhoto:error: callback will receive twice the number of callbacks, as both the telephoto image(s) and wide-angle image(s) are delivered. You may only set this property to YES if you've set your AVCapturePhotoOutput's dualCameraDualPhotoDeliveryEnabled property to YES, and your delegate responds to the captureOutput:didFinishProcessingPhoto:error: selector. As of iOS 13, this property is deprecated in favor of virtualDeviceConstituentPhotoDeliveryEnabledDevices.
     */
    @Generated
    @Selector("setDualCameraDualPhotoDeliveryEnabled:")
    public native void setDualCameraDualPhotoDeliveryEnabled(boolean value);

    /**
     * [@property] embeddedThumbnailPhotoFormat
     * <p>
     * A dictionary of AVVideoSettings keys specifying the thumbnail format to be written to the processed or RAW photo.
     * <p>
     * A dictionary of AVVideoSettings keys specifying a thumbnail (usually smaller) version of the processed photo to be embedded in that image before calling the AVCapturePhotoCaptureDelegate. This image is sometimes referred to as a "thumbnail image". The AVVideoCodecKey is required and must be present in the receiver's -availableEmbeddedThumbnailPhotoCodecTypes array. Optional keys are { AVVideoWidthKey | AVVideoHeightKey }. If you wish to specify dimensions, you must specify both width and height. If you specify a width and height whose aspect ratio differs from the processed photo, the larger of the two dimensions is honored and aspect ratio of the RAW or processed photo is always preserved. For RAW captures, use -rawEmbeddedThumbnailPhotoFormat to specify the thumbnail format you'd like to capture in the RAW image. For apps linked on or after iOS 12, the raw thumbnail format must be specified using the -rawEmbeddedThumbnailPhotoFormat API rather than -embeddedThumbnailPhotoFormat. Beginning in iOS 12, HEIC files may contain thumbnails up to the full resolution of the main image.
     */
    @Generated
    @Selector("setEmbeddedThumbnailPhotoFormat:")
    public native void setEmbeddedThumbnailPhotoFormat(NSDictionary<String, ?> value);

    /**
     * [@property] embedsDepthDataInPhoto
     * <p>
     * Specifies whether depth data included with this photo should be written to the photo's file structure.
     * <p>
     * Default is YES. When depthDataDeliveryEnabled is set to YES, this property specifies whether the included depth data should be written to the resulting photo's internal file structure. Depth data is currently only supported in HEIF and JPEG. This property is ignored if depthDataDeliveryEnabled is set to NO.
     */
    @Generated
    @Selector("setEmbedsDepthDataInPhoto:")
    public native void setEmbedsDepthDataInPhoto(boolean value);

    /**
     * [@property] livePhotoVideoCodecType
     * <p>
     * Specifies the video codec type to use when compressing video for the Live Photo movie complement.
     * <p>
     * Prior to iOS 11, all Live Photo movie video tracks are compressed using H.264. Beginning in iOS 11, you can select the Live Photo movie video compression format by specifying one of the strings present in AVCapturePhotoOutput's availableLivePhotoVideoCodecTypes array.
     */
    @Generated
    @Selector("setLivePhotoVideoCodecType:")
    public native void setLivePhotoVideoCodecType(String value);

    /**
     * [@property] metadata
     * <p>
     * A dictionary of metadata key/value pairs you'd like to have written to each photo in the capture request.
     * <p>
     * Valid metadata keys are found in <ImageIO/CGImageProperties.h>. AVCapturePhotoOutput inserts a base set of metadata into each photo it captures, such as kCGImagePropertyOrientation, kCGImagePropertyExifDictionary, and kCGImagePropertyMakerAppleDictionary. You may specify metadata keys and values that should be written to each photo in the capture request. If you've specified metadata that also appears in AVCapturePhotoOutput's base set, your value replaces the base value. An NSInvalidArgumentException is thrown if you specify keys other than those found in <ImageIO/CGImageProperties.h>.
     */
    @Generated
    @Selector("setMetadata:")
    public native void setMetadata(NSDictionary<String, ?> value);

    /**
     * [@property] availableRawEmbeddedThumbnailPhotoCodecTypes
     * <p>
     * An array of available AVVideoCodecKeys that may be used when specifying a rawEmbeddedThumbnailPhotoFormat.
     * <p>
     * The array is sorted such that the thumbnail codec type that is most backward compatible is listed first.
     */
    @Generated
    @Selector("availableRawEmbeddedThumbnailPhotoCodecTypes")
    public native NSArray<String> availableRawEmbeddedThumbnailPhotoCodecTypes();

    /**
     * [@property] embedsPortraitEffectsMatteInPhoto
     * <p>
     * Specifies whether the portrait effects matte captured with this photo should be written to the photo's file structure.
     * <p>
     * Default is YES. When portraitEffectsMatteDeliveryEnabled is set to YES, this property specifies whether the included portrait effects matte should be written to the resulting photo's internal file structure. Portrait effects mattes are currently only supported in HEIF and JPEG. This property is ignored if portraitEffectsMatteDeliveryEnabled is set to NO.
     */
    @Generated
    @Selector("embedsPortraitEffectsMatteInPhoto")
    public native boolean embedsPortraitEffectsMatteInPhoto();

    /**
     * [@property] embedsSemanticSegmentationMattesInPhoto
     * <p>
     * Specifies whether enabledSemanticSegmentationMatteTypes captured with this photo should be written to the photo's file structure.
     * <p>
     * Default is YES. This property specifies whether the captured semantic segmentation mattes should be written to the resulting photo's internal file structure. Semantic segmentation mattes are currently only supported in HEIF and JPEG. This property is ignored if enabledSemanticSegmentationMatteTypes is set to an empty array.
     */
    @Generated
    @Selector("embedsSemanticSegmentationMattesInPhoto")
    public native boolean embedsSemanticSegmentationMattesInPhoto();

    /**
     * [@property] enabledSemanticSegmentationMatteTypes
     * <p>
     * Specifies which types of AVSemanticSegmentationMatte should be captured along with the photo.
     * <p>
     * Default is empty array. You may set this property to an array of AVSemanticSegmentationMatteTypes you'd like to capture. Throws an exception if -[AVCapturePhotoOutput enabledSemanticSegmentationMatteTypes] does not contain any of the AVSemanticSegmentationMatteTypes specified. In other words, when setting up a capture session, you opt in for the superset of segmentation matte types you might like to receive, and then on a shot-by-shot basis, you may opt in to all or a subset of the previously specified types by setting this property. An exception is also thrown during -[AVCapturePhotoOutput capturePhotoWithSettings:delegate:] if your delegate does not respond to the captureOutput:didFinishProcessingPhoto:error: selector. Setting this property to YES does not guarantee that the specified mattes will be present in the resulting AVCapturePhoto. If the photo's content lacks any persons, for instance, no hair, skin, or teeth mattes are generated, and the -[AVCapturePhoto semanticSegmentationMatteForType:] property returns nil. Note that setting this property to YES may add significant processing time to the delivery of your didFinishProcessingPhoto: callback.
     */
    @Generated
    @Selector("enabledSemanticSegmentationMatteTypes")
    public native NSArray<String> enabledSemanticSegmentationMatteTypes();

    /**
     * [@property] autoRedEyeReductionEnabled
     * <p>
     * Specifies whether red-eye reduction should be applied automatically on flash captures.
     * <p>
     * Default is YES on platforms that support automatic red-eye reduction unless you are capturing a bracket using AVCapturePhotoBracketSettings or a RAW photo without a processed photo.  For RAW photos with a processed photo the red-eye reduction will be applied to the processed photo only (RAW photos by definition are not processed). When set to YES, red-eye reduction is applied as needed for flash captures if the photo output's autoRedEyeReductionSupported property returns YES.
     */
    @Generated
    @Selector("isAutoRedEyeReductionEnabled")
    public native boolean isAutoRedEyeReductionEnabled();

    /**
     * [@property] autoVirtualDeviceFusionEnabled
     * <p>
     * Specifies whether virtual device image fusion should be used automatically.
     * <p>
     * Default is YES unless you are capturing a RAW photo (RAW photos may not be processed by definition) or a bracket using AVCapturePhotoBracketSettings. When set to YES, and -[AVCapturePhotoOutput isVirtualDeviceFusionSupported] is also YES, constituent camera images of a virtual device may be fused to improve still image quality, depending on the current zoom factor, light levels, and focus position. You may determine whether virtual device fusion is enabled for a particular capture request by inspecting the virtualDeviceFusionEnabled property of the AVCaptureResolvedPhotoSettings. Note that when using the deprecated AVCaptureStillImageOutput interface with a virtual device, autoVirtualDeviceFusionEnabled fusion is always enabled if supported, and may not be turned off.
     */
    @Generated
    @Selector("isAutoVirtualDeviceFusionEnabled")
    public native boolean isAutoVirtualDeviceFusionEnabled();

    /**
     * [@property] portraitEffectsMatteDeliveryEnabled
     * <p>
     * Specifies whether an AVPortraitEffectsMatte should be captured along with the photo.
     * <p>
     * Default is NO. Set to YES if you wish to receive a portrait effects matte with your photo. Throws an exception if -[AVCapturePhotoOutput portraitEffectsMatteDeliveryEnabled] is not set to YES or your delegate does not respond to the captureOutput:didFinishProcessingPhoto:error: selector. Portrait effects matte generation requires depth to be present, so if you wish to enable portrait effects matte delivery, you must set depthDataDeliveryEnabled to YES. Setting this property to YES does not guarantee that a portrait effects matte will be present in the resulting AVCapturePhoto. As the property name implies, the matte is primarily used to improve the rendering quality of portrait effects on the image. If the photo's content lacks a clear foreground subject, no portrait effects matte is generated, and the -[AVCapturePhoto portraitEffectsMatte] property returns nil. Note that setting this property to YES may add significant processing time to the delivery of your didFinishProcessingPhoto: callback.
     * <p>
     * For best rendering results in Apple's Photos.app, portrait photos should be captured with both embedded depth data (see depthDataDeliveryEnabled) and a portrait effects matte. When supported, it is recommended to opt in for both of these auxiliary images in your photo captures involving depth.
     */
    @Generated
    @Selector("isPortraitEffectsMatteDeliveryEnabled")
    public native boolean isPortraitEffectsMatteDeliveryEnabled();

    /**
     * [@property] photoQualityPrioritization
     * <p>
     * Indicates how photo quality should be prioritized against speed of photo delivery.
     * <p>
     * Default value is AVCapturePhotoQualityPrioritizationBalanced. The AVCapturePhotoOutput is capable of applying a variety of techniques to improve photo quality (reduce noise, preserve detail in low light, freeze motion, etc), depending on the source device's activeFormat. Some of these techniques can take significant processing time before the photo is returned to your delegate callback. The photoQualityPrioritization property allows you to specify your preferred quality vs speed of delivery. By default, speed and quality are considered to be of equal importance. When you specify AVCapturePhotoQualityPrioritizationSpeed, you indicate that speed should be prioritized at the expense of quality. Likewise, when you choose AVCapturePhotoQualityPrioritizationQuality, you signal your willingness to prioritize the very best quality at the expense of speed, and your readiness to wait (perhaps significantly) longer for the photo to be returned to your delegate.
     */
    @Generated
    @Selector("photoQualityPrioritization")
    @NInt
    public native long photoQualityPrioritization();

    /**
     * [@property] rawEmbeddedThumbnailPhotoFormat
     * <p>
     * A dictionary of AVVideoSettings keys specifying the thumbnail format to be written to the RAW photo in a RAW photo request.
     * <p>
     * A dictionary of AVVideoSettings keys specifying a thumbnail (usually smaller) version of the RAW photo to be embedded in that image's DNG before calling back the AVCapturePhotoCaptureDelegate. The AVVideoCodecKey is required and must be present in the receiver's -availableRawEmbeddedThumbnailPhotoCodecTypes array. Optional keys are { AVVideoWidthKey | AVVideoHeightKey }. If you wish to specify dimensions, you must specify both width and height. If you specify a width and height whose aspect ratio differs from the RAW or processed photo, the larger of the two dimensions is honored and aspect ratio of the RAW or processed photo is always preserved. For apps linked on or after iOS 12, the raw thumbnail format must be specified using the -rawEmbeddedThumbnailPhotoFormat API rather than -embeddedThumbnailPhotoFormat. Beginning in iOS 12, DNG files may contain thumbnails up to the full resolution of the RAW image.
     */
    @Generated
    @Selector("rawEmbeddedThumbnailPhotoFormat")
    public native NSDictionary<String, ?> rawEmbeddedThumbnailPhotoFormat();

    /**
     * [@property] autoRedEyeReductionEnabled
     * <p>
     * Specifies whether red-eye reduction should be applied automatically on flash captures.
     * <p>
     * Default is YES on platforms that support automatic red-eye reduction unless you are capturing a bracket using AVCapturePhotoBracketSettings or a RAW photo without a processed photo.  For RAW photos with a processed photo the red-eye reduction will be applied to the processed photo only (RAW photos by definition are not processed). When set to YES, red-eye reduction is applied as needed for flash captures if the photo output's autoRedEyeReductionSupported property returns YES.
     */
    @Generated
    @Selector("setAutoRedEyeReductionEnabled:")
    public native void setAutoRedEyeReductionEnabled(boolean value);

    /**
     * [@property] autoVirtualDeviceFusionEnabled
     * <p>
     * Specifies whether virtual device image fusion should be used automatically.
     * <p>
     * Default is YES unless you are capturing a RAW photo (RAW photos may not be processed by definition) or a bracket using AVCapturePhotoBracketSettings. When set to YES, and -[AVCapturePhotoOutput isVirtualDeviceFusionSupported] is also YES, constituent camera images of a virtual device may be fused to improve still image quality, depending on the current zoom factor, light levels, and focus position. You may determine whether virtual device fusion is enabled for a particular capture request by inspecting the virtualDeviceFusionEnabled property of the AVCaptureResolvedPhotoSettings. Note that when using the deprecated AVCaptureStillImageOutput interface with a virtual device, autoVirtualDeviceFusionEnabled fusion is always enabled if supported, and may not be turned off.
     */
    @Generated
    @Selector("setAutoVirtualDeviceFusionEnabled:")
    public native void setAutoVirtualDeviceFusionEnabled(boolean value);

    /**
     * [@property] embedsPortraitEffectsMatteInPhoto
     * <p>
     * Specifies whether the portrait effects matte captured with this photo should be written to the photo's file structure.
     * <p>
     * Default is YES. When portraitEffectsMatteDeliveryEnabled is set to YES, this property specifies whether the included portrait effects matte should be written to the resulting photo's internal file structure. Portrait effects mattes are currently only supported in HEIF and JPEG. This property is ignored if portraitEffectsMatteDeliveryEnabled is set to NO.
     */
    @Generated
    @Selector("setEmbedsPortraitEffectsMatteInPhoto:")
    public native void setEmbedsPortraitEffectsMatteInPhoto(boolean value);

    /**
     * [@property] embedsSemanticSegmentationMattesInPhoto
     * <p>
     * Specifies whether enabledSemanticSegmentationMatteTypes captured with this photo should be written to the photo's file structure.
     * <p>
     * Default is YES. This property specifies whether the captured semantic segmentation mattes should be written to the resulting photo's internal file structure. Semantic segmentation mattes are currently only supported in HEIF and JPEG. This property is ignored if enabledSemanticSegmentationMatteTypes is set to an empty array.
     */
    @Generated
    @Selector("setEmbedsSemanticSegmentationMattesInPhoto:")
    public native void setEmbedsSemanticSegmentationMattesInPhoto(boolean value);

    /**
     * [@property] enabledSemanticSegmentationMatteTypes
     * <p>
     * Specifies which types of AVSemanticSegmentationMatte should be captured along with the photo.
     * <p>
     * Default is empty array. You may set this property to an array of AVSemanticSegmentationMatteTypes you'd like to capture. Throws an exception if -[AVCapturePhotoOutput enabledSemanticSegmentationMatteTypes] does not contain any of the AVSemanticSegmentationMatteTypes specified. In other words, when setting up a capture session, you opt in for the superset of segmentation matte types you might like to receive, and then on a shot-by-shot basis, you may opt in to all or a subset of the previously specified types by setting this property. An exception is also thrown during -[AVCapturePhotoOutput capturePhotoWithSettings:delegate:] if your delegate does not respond to the captureOutput:didFinishProcessingPhoto:error: selector. Setting this property to YES does not guarantee that the specified mattes will be present in the resulting AVCapturePhoto. If the photo's content lacks any persons, for instance, no hair, skin, or teeth mattes are generated, and the -[AVCapturePhoto semanticSegmentationMatteForType:] property returns nil. Note that setting this property to YES may add significant processing time to the delivery of your didFinishProcessingPhoto: callback.
     */
    @Generated
    @Selector("setEnabledSemanticSegmentationMatteTypes:")
    public native void setEnabledSemanticSegmentationMatteTypes(NSArray<String> value);

    /**
     * [@property] photoQualityPrioritization
     * <p>
     * Indicates how photo quality should be prioritized against speed of photo delivery.
     * <p>
     * Default value is AVCapturePhotoQualityPrioritizationBalanced. The AVCapturePhotoOutput is capable of applying a variety of techniques to improve photo quality (reduce noise, preserve detail in low light, freeze motion, etc), depending on the source device's activeFormat. Some of these techniques can take significant processing time before the photo is returned to your delegate callback. The photoQualityPrioritization property allows you to specify your preferred quality vs speed of delivery. By default, speed and quality are considered to be of equal importance. When you specify AVCapturePhotoQualityPrioritizationSpeed, you indicate that speed should be prioritized at the expense of quality. Likewise, when you choose AVCapturePhotoQualityPrioritizationQuality, you signal your willingness to prioritize the very best quality at the expense of speed, and your readiness to wait (perhaps significantly) longer for the photo to be returned to your delegate.
     */
    @Generated
    @Selector("setPhotoQualityPrioritization:")
    public native void setPhotoQualityPrioritization(@NInt long value);

    /**
     * [@property] portraitEffectsMatteDeliveryEnabled
     * <p>
     * Specifies whether an AVPortraitEffectsMatte should be captured along with the photo.
     * <p>
     * Default is NO. Set to YES if you wish to receive a portrait effects matte with your photo. Throws an exception if -[AVCapturePhotoOutput portraitEffectsMatteDeliveryEnabled] is not set to YES or your delegate does not respond to the captureOutput:didFinishProcessingPhoto:error: selector. Portrait effects matte generation requires depth to be present, so if you wish to enable portrait effects matte delivery, you must set depthDataDeliveryEnabled to YES. Setting this property to YES does not guarantee that a portrait effects matte will be present in the resulting AVCapturePhoto. As the property name implies, the matte is primarily used to improve the rendering quality of portrait effects on the image. If the photo's content lacks a clear foreground subject, no portrait effects matte is generated, and the -[AVCapturePhoto portraitEffectsMatte] property returns nil. Note that setting this property to YES may add significant processing time to the delivery of your didFinishProcessingPhoto: callback.
     * <p>
     * For best rendering results in Apple's Photos.app, portrait photos should be captured with both embedded depth data (see depthDataDeliveryEnabled) and a portrait effects matte. When supported, it is recommended to opt in for both of these auxiliary images in your photo captures involving depth.
     */
    @Generated
    @Selector("setPortraitEffectsMatteDeliveryEnabled:")
    public native void setPortraitEffectsMatteDeliveryEnabled(boolean value);

    /**
     * [@property] rawEmbeddedThumbnailPhotoFormat
     * <p>
     * A dictionary of AVVideoSettings keys specifying the thumbnail format to be written to the RAW photo in a RAW photo request.
     * <p>
     * A dictionary of AVVideoSettings keys specifying a thumbnail (usually smaller) version of the RAW photo to be embedded in that image's DNG before calling back the AVCapturePhotoCaptureDelegate. The AVVideoCodecKey is required and must be present in the receiver's -availableRawEmbeddedThumbnailPhotoCodecTypes array. Optional keys are { AVVideoWidthKey | AVVideoHeightKey }. If you wish to specify dimensions, you must specify both width and height. If you specify a width and height whose aspect ratio differs from the RAW or processed photo, the larger of the two dimensions is honored and aspect ratio of the RAW or processed photo is always preserved. For apps linked on or after iOS 12, the raw thumbnail format must be specified using the -rawEmbeddedThumbnailPhotoFormat API rather than -embeddedThumbnailPhotoFormat. Beginning in iOS 12, DNG files may contain thumbnails up to the full resolution of the RAW image.
     */
    @Generated
    @Selector("setRawEmbeddedThumbnailPhotoFormat:")
    public native void setRawEmbeddedThumbnailPhotoFormat(NSDictionary<String, ?> value);

    /**
     * [@property] virtualDeviceConstituentPhotoDeliveryEnabledDevices
     * <p>
     * Specifies the constituent devices for which the virtual device should deliver photos.
     * <p>
     * Default is empty array. To opt in for constituent device photo delivery, you may set this property to any subset of 2 or more of the devices in virtualDevice.constituentDevices. Your captureOutput:didFinishProcessingPhoto:error: callback will be called n times -- one for each of the devices you include in the array. You may only set this property to a non-nil array if you've set your AVCapturePhotoOutput's virtualDeviceConstituentPhotoDeliveryEnabled property to YES, and your delegate responds to the captureOutput:didFinishProcessingPhoto:error: selector.
     */
    @Generated
    @Selector("setVirtualDeviceConstituentPhotoDeliveryEnabledDevices:")
    public native void setVirtualDeviceConstituentPhotoDeliveryEnabledDevices(NSArray<? extends AVCaptureDevice> value);

    /**
     * [@property] virtualDeviceConstituentPhotoDeliveryEnabledDevices
     * <p>
     * Specifies the constituent devices for which the virtual device should deliver photos.
     * <p>
     * Default is empty array. To opt in for constituent device photo delivery, you may set this property to any subset of 2 or more of the devices in virtualDevice.constituentDevices. Your captureOutput:didFinishProcessingPhoto:error: callback will be called n times -- one for each of the devices you include in the array. You may only set this property to a non-nil array if you've set your AVCapturePhotoOutput's virtualDeviceConstituentPhotoDeliveryEnabled property to YES, and your delegate responds to the captureOutput:didFinishProcessingPhoto:error: selector.
     */
    @Generated
    @Selector("virtualDeviceConstituentPhotoDeliveryEnabledDevices")
    public native NSArray<? extends AVCaptureDevice> virtualDeviceConstituentPhotoDeliveryEnabledDevices();

    /**
     * [@property] autoContentAwareDistortionCorrectionEnabled
     * <p>
     * Specifies whether the photo output should use content aware distortion correction on this photo request (at its discretion).
     * <p>
     * Default is NO. Set to YES if you wish content aware distortion correction to be performed on your AVCapturePhotos, when the photo output deems it necessary. Photos may or may not benefit from distortion correction. For instance, photos lacking faces may be left as is. Setting this property to YES does introduce a small additional amount of latency to the photo processing. You may check your AVCaptureResolvedPhotoSettings to see whether content aware distortion correction will be enabled for a given photo request. Throws an exception if -[AVCapturePhotoOutput contentAwareDistortionCorrectionEnabled] is not set to YES.
     */
    @Generated
    @Selector("isAutoContentAwareDistortionCorrectionEnabled")
    public native boolean isAutoContentAwareDistortionCorrectionEnabled();

    /**
     * [@property] autoContentAwareDistortionCorrectionEnabled
     * <p>
     * Specifies whether the photo output should use content aware distortion correction on this photo request (at its discretion).
     * <p>
     * Default is NO. Set to YES if you wish content aware distortion correction to be performed on your AVCapturePhotos, when the photo output deems it necessary. Photos may or may not benefit from distortion correction. For instance, photos lacking faces may be left as is. Setting this property to YES does introduce a small additional amount of latency to the photo processing. You may check your AVCaptureResolvedPhotoSettings to see whether content aware distortion correction will be enabled for a given photo request. Throws an exception if -[AVCapturePhotoOutput contentAwareDistortionCorrectionEnabled] is not set to YES.
     */
    @Generated
    @Selector("setAutoContentAwareDistortionCorrectionEnabled:")
    public native void setAutoContentAwareDistortionCorrectionEnabled(boolean value);
}
