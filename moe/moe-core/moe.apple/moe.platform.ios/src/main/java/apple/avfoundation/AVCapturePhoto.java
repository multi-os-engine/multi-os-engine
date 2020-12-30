package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.protocol.AVCapturePhotoFileDataRepresentationCustomizer;
import apple.coregraphics.opaque.CGImageRef;
import apple.coremedia.struct.CMTime;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
 * AVCapturePhoto
 * 
 *    An object representing a photo in memory, produced by the -captureOutput:didFinishingProcessingPhoto:error: in the AVCapturePhotoCaptureDelegate protocol method.
 * 
 *    Beginning in iOS 11, AVCapturePhotoOutput's AVCapturePhotoCaptureDelegate supports a simplified callback for delivering image data, namely -captureOutput:didFinishingProcessingPhoto:error:. This callback presents each image result for your capture request as an AVCapturePhoto object, an immutable wrapper from which various properties of the photo capture may be queried, such as the photo's preview pixel buffer, metadata, depth data, camera calibration data, and image bracket specific properties. AVCapturePhoto can wrap file-containerized photo results, such as HEVC encoded image data, containerized in the HEIC file format. CMSampleBufferRef, on the other hand, may only be used to express non file format containerized photo data. For this reason, the AVCapturePhotoCaptureDelegate protocol methods that return CMSampleBuffers have been deprecated in favor of -captureOutput:didFinishingProcessingPhoto:error:. A AVCapturePhoto wraps a single image result. For instance, if you've requested a bracketed capture of 3 images, your callback is called 3 times, each time delivering an AVCapturePhoto.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCapturePhoto extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCapturePhoto(Pointer peer) {
        super(peer);
    }

    /**
     * CGImageRepresentation
     * 
     *    Utility method that converts the AVCapturePhoto's primary photo to a CGImage.
     * 
     *    Each time you access this method, AVCapturePhoto generates a new CGImageRef. When backed by a compressed container (such as HEIC), the CGImageRepresentation is decoded lazily as needed. When backed by an uncompressed format such as BGRA, it is copied into a separate backing buffer whose lifetime is not tied to that of the AVCapturePhoto. For a 12 megapixel image, a BGRA CGImage represents ~48 megabytes per call. If you only intend to use the CGImage for on-screen rendering, use the previewCGImageRepresentation instead. Note that the physical rotation of the CGImageRef matches that of the main image. Exif orientation has not been applied. If you wish to apply rotation when working with UIImage, you can do so by querying the photo's metadata[kCGImagePropertyOrientation] value, and passing it as the orientation parameter to +[UIImage imageWithCGImage:scale:orientation:]. RAW images always return a CGImageRepresentation of nil. If you wish to make a CGImageRef from a RAW image, use CIRAWFilter in the CoreImage framework.
     * 
     * @return
     *    A CGImageRef, or nil if the conversion process fails.
     */
    @Generated
    @Selector("CGImageRepresentation")
    public native CGImageRef CGImageRepresentation();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCapturePhoto alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property] bracketSettings
     * 
     *    The AVCaptureBracketedStillImageSettings associated with this photo.
     * 
     *    When specifying a bracketed capture using AVCapturePhotoBracketSettings, you specify an array of AVCaptureBracketedStillImageSettings -- one per image in the bracket. This property indicates the AVCaptureBracketedStillImageSettings associated with this particular photo, or nil if this photo is not part of a bracketed capture.
     */
    @Generated
    @Selector("bracketSettings")
    public native AVCaptureBracketedStillImageSettings bracketSettings();

    /**
     * [@property] cameraCalibrationData
     * 
     *    An AVCameraCalibrationData object representing the calibration information for the camera providing the photo.
     * 
     *    Camera calibration data is only present if you set AVCapturePhotoSettings.setCameraCalibrationDataDeliveryEnabled to YES. When requesting virtual device constituent photo delivery plus cameraCalibrationDataDeliveryEnabled, camera calibration information is delivered with all resultant photos and is specific to the constituent device producing that photo.
     */
    @Generated
    @Selector("cameraCalibrationData")
    public native AVCameraCalibrationData cameraCalibrationData();

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

    /**
     * [@property] depthData
     * 
     *    An AVDepthData object wrapping a disparity/depth map associated with this photo.
     * 
     *    If you requested depth data delivery by calling -[AVCapturePhotoSettings setDepthDataDeliveryEnabled:YES], this property offers access to the resulting AVDepthData object. Nil is returned if you did not request depth data delivery. Note that the depth data is only embedded in the photo's internal file format container if you set -[AVCapturePhotoSettings setEmbedsDepthDataInPhoto:YES].
     */
    @Generated
    @Selector("depthData")
    public native AVDepthData depthData();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] embeddedThumbnailPhotoFormat
     * 
     *    The format of the embedded thumbnail contained in this AVCapturePhoto.
     * 
     *    If you requested an embedded thumbnail image by calling -[AVCapturePhotoSettings setEmbeddedThumbnailPhotoFormat:] with a non-nil value, this property offers access to the resolved embedded thumbnail AVVideoSettings dictionary. Nil is returned if you did not request an embedded thumbnail image.
     */
    @Generated
    @Selector("embeddedThumbnailPhotoFormat")
    public native NSDictionary<String, ?> embeddedThumbnailPhotoFormat();

    /**
     * fileDataRepresentation
     * 
     *    Flattens the AVCapturePhoto to an NSData using the file container format (processedFileType or rawFileType) specified in the AVCapturePhotoSettings (e.g. JFIF, HEIF, DNG).
     * 
     * @return
     *    An NSData containing bits in the file container's format, or nil if the flattening process fails.
     */
    @Generated
    @Selector("fileDataRepresentation")
    public native NSData fileDataRepresentation();

    /**
     * fileDataRepresentationWithReplacementMetadata:replacementEmbeddedThumbnailPhotoFormat:replacementEmbeddedThumbnailPixelBuffer:replacementDepthData:
     * 
     *    Flattens the AVCapturePhoto to an NSData using the file container format (processedFileType or rawFileType) specified in the AVCapturePhotoSettings (e.g. JFIF, HEIF, DNG), and allows you to replace metadata, thumbnail, and depth data in the process.
     * 
     * @param replacementMetadata
     *    A dictionary of keys and values from <ImageIO/CGImageProperties.h>. To preserve existing metadata to the file, pass self.metadata. To strip existing metadata, pass nil. To replace metadata, pass a replacement dictionary.
     * @param replacementEmbeddedThumbnailPhotoFormat
     *    A dictionary of keys and values from <AVFoundation/AVVideoSettings.h>. If you pass a non-nil dictionary, AVVideoCodecKey is required, with AVVideoWidthKey and AVVideoHeightKey being optional. To preserve the existing embedded thumbnail photo to the file, pass self.embeddedThumbnailPhotoFormat and pass nil as your replacementEmbeddedThumbnailPixelBuffer parameter. To strip the existing embedded thumbnail, pass nil for both replacementEmbeddedThumbnailPhotoFormat and replacementEmbeddedThumbnailPixelBuffer. To replace the existing embedded thumbnail photo, pass both a non-nil replacementThumbnailPixelBuffer and replacementEmbeddedThumbnailPhotoFormat dictionary.
     * @param replacementEmbeddedThumbnailPixelBuffer
     *    A pixel buffer containing a source image to be encoded to the file as the replacement thumbnail image. To preserve the existing embedded thumbnail photo to the file, pass self.embeddedThumbnailPhotoFormat as your replacementEmbeddedThumbnailPhotoFormat parameter and nil as your replacementEmbeddedThumbnailPixelBuffer parameter. To strip the existing embedded thumbnail, pass nil for both replacementEmbeddedThumbnailPhotoFormat and replacementEmbeddedThumbnailPixelBuffer. To replace the existing embedded thumbnail photo, pass both a non-nil replacementThumbnailPixelBuffer and replacementEmbeddedThumbnailPhotoFormat dictionary.
     * @param replacementDepthData
     *    Replacement depth data to be written to the flattened file container. To preserve existing depth data to the file, pass self.depthData. To strip it, pass nil. To replace it, pass a new AVDepthData instance.
     * @return
     *    An NSData containing bits in the file container's format, or nil if the flattening process fails.
     */
    @Generated
    @Selector("fileDataRepresentationWithReplacementMetadata:replacementEmbeddedThumbnailPhotoFormat:replacementEmbeddedThumbnailPixelBuffer:replacementDepthData:")
    public native NSData fileDataRepresentationWithReplacementMetadataReplacementEmbeddedThumbnailPhotoFormatReplacementEmbeddedThumbnailPixelBufferReplacementDepthData(
            NSDictionary<String, ?> replacementMetadata,
            NSDictionary<String, ?> replacementEmbeddedThumbnailPhotoFormat,
            CVBufferRef replacementEmbeddedThumbnailPixelBuffer, AVDepthData replacementDepthData);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVCapturePhoto init();

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
     * [@property] rawPhoto
     * 
     *    This property returns YES if this photo is a RAW image.
     * 
     *    Your AVCapturePhotoCaptureDelegate's -captureOutput:didFinishingProcessingPhoto:error: method may be called one or more times with image results, including RAW or non-RAW images. This property distinguishes RAW from non-RAW image results, for instance, if you've requested a RAW + JPEG capture.
     */
    @Generated
    @Selector("isRawPhoto")
    public native boolean isRawPhoto();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * [@property] lensStabilizationStatus
     * 
     *    The status of the lens stabilization module during capture of this photo.
     * 
     *    In configurations where lens stabilization (OIS) is unsupported, AVCaptureLensStabilizationStatusUnsupported is returned. If lens stabilization is supported, but this photo is not part of a bracketed capture in which -[AVCapturePhotoBracketSettings setLensStabilizationEnabled:YES] was called, AVCaptureLensStabilizationStatusOff is returned. Otherwise a lens stabilization status is returned indicating how lens stabilization was applied during the capture.
     */
    @Generated
    @Selector("lensStabilizationStatus")
    @NInt
    public native long lensStabilizationStatus();

    /**
     * [@property] metadata
     * 
     *    An ImageIO property style dictionary of metadata associated with this photo.
     * 
     *    Valid metadata keys are found in <ImageIO/CGImageProperties.h>, such as kCGImagePropertyOrientation, kCGImagePropertyExifDictionary, kCGImagePropertyMakerAppleDictionary, etc.
     */
    @Generated
    @Selector("metadata")
    public native NSDictionary<String, ?> metadata();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * [@property] photoCount
     * 
     *    This photo's index (1-based) in the total expected photo count.
     * 
     *    The resolvedSettings.expectedPhotoCount property indicates the total number of images that will be returned for a given capture request. This property indicates this photo's index (1-based). When you receive a -captureOutput:didFinishProcessingPhoto:error: callback with a photo whose photoCount matches resolvedSettings.expectedPhotoCount, you know you've received the last one for the given capture request.
     */
    @Generated
    @Selector("photoCount")
    @NInt
    public native long photoCount();

    /**
     * [@property] pixelBuffer
     * 
     *    For uncompressed or RAW captures, this property offers access to the pixel data.
     * 
     *    Uncompressed captures, such as '420f' or 'BGRA', or RAW captures, such as 'bgg4', present pixel data as a CVPixelBuffer. This property is analogous to CMSampleBufferGetImageBuffer(). The pixel buffer contains only the minimal attachments required for correct display. Compressed captures, such as 'jpeg', return nil.
     */
    @Generated
    @Selector("pixelBuffer")
    public native CVBufferRef pixelBuffer();

    /**
     * CGImageRepresentation
     * 
     *    Utility method that converts the AVCapturePhoto's preview photo to a CGImage.
     * 
     *    Each time you access this method, AVCapturePhoto generates a new CGImageRef. This CGImageRepresentation is a RGB rendering of the previewPixelBuffer property. If you did not request a preview photo by setting the -[AVCapturePhotoSettings previewPhotoFormat] property, this method returns nil. Note that the physical rotation of the CGImageRef matches that of the main image. Exif orientation has not been applied. If you wish to apply rotation when working with UIImage, you can do so by querying the photo's metadata[kCGImagePropertyOrientation] value, and passing it as the orientation parameter to +[UIImage imageWithCGImage:scale:orientation:].
     * 
     * @return
     *    A CGImageRef, or nil if the conversion process fails, or if you did not request a preview photo.
     */
    @Generated
    @Selector("previewCGImageRepresentation")
    public native CGImageRef previewCGImageRepresentation();

    /**
     * [@property] previewPixelBuffer
     * 
     *    This property offers access to the preview image pixel data if you've requested it.
     * 
     *    If you requested a preview image by calling -[AVCapturePhotoSettings setPreviewPhotoFormat:] with a non-nil value, this property offers access to the resulting preview image pixel data, and is analogous to CMSampleBufferGetImageBuffer(). The pixel buffer contains only the minimal attachments required for correct display. Nil is returned if you did not request a preview image.
     */
    @Generated
    @Selector("previewPixelBuffer")
    public native CVBufferRef previewPixelBuffer();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] resolvedSettings
     * 
     *    The AVCaptureResolvedPhotoSettings associated with all photo results for a given -[AVCapturePhotoOutput capturePhotoWithSettings:delegate:] request.
     * 
     *    Even in the event of an error, the resolved settings are always non nil.
     */
    @Generated
    @Selector("resolvedSettings")
    public native AVCaptureResolvedPhotoSettings resolvedSettings();

    /**
     * [@property] sequenceCount
     * 
     *    1-based sequence count of the photo.
     * 
     *    If this photo is part of a bracketed capture (invoked using AVCapturePhotoBracketSettings), this property indicates the current result's count in the sequence, starting with 1 for the first result, or 0 if this photo is not part of a bracketed capture.
     */
    @Generated
    @Selector("sequenceCount")
    @NInt
    public native long sequenceCount();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] sourceDeviceType
     * 
     *    The device type of the source camera providing the photo.
     * 
     *    When taking a virtual device constituent photo capture, you may query this property to find out the source type of the photo. For instance, on a DualCamera, resulting photos will be of sourceDeviceType AVCaptureDeviceTypeBuiltInWideCamera, or AVCaptureDeviceTypeBuiltInTelephotoCamera. For all other types of capture, the source device type is equal to the -[AVCaptureDevice deviceType] of the AVCaptureDevice to which the AVCapturePhotoOutput is connected. Returns nil if the source of the photo is not an AVCaptureDevice.
     */
    @Generated
    @Selector("sourceDeviceType")
    public native String sourceDeviceType();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] timestamp
     * 
     *    The time at which this image was captured, synchronized to the masterClock of the AVCaptureSession
     * 
     *    The timestamp property indicates the time the image was captured, and is analogous to CMSampleBufferGetPresentationTimeStamp(). If an error was provided in the -captureOutput:didFinishingProcessingPhoto:error: callback, timestamp returns kCMTimeInvalid.
     */
    @Generated
    @Selector("timestamp")
    @ByValue
    public native CMTime timestamp();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * fileDataRepresentationWithCustomizer:
     * 
     *    Flattens the AVCapturePhoto to an NSData using the file container format (processedFileType or rawFileType) specified in the AVCapturePhotoSettings (e.g. JFIF, HEIF, DNG), and allows you to strip or replace various pieces of metadata in the process.
     * 
     * @param customizer
     *    An object conforming to the AVCapturePhotoFileDataRepresentationCustomizer protocol that will be called synchronously to provide customization of metadata written to the container format. An NSInvalidArgumentException is thrown if you pass nil.
     * @return
     *    An NSData containing bits in the file container's format, or nil if the flattening process fails.
     */
    @Generated
    @Selector("fileDataRepresentationWithCustomizer:")
    public native NSData fileDataRepresentationWithCustomizer(
            @Mapped(ObjCObjectMapper.class) AVCapturePhotoFileDataRepresentationCustomizer customizer);

    /**
     * [@property] portraitEffectsMatte
     * 
     *    An AVPortraitEffectsMatte object wrapping a matte associated with this photo.
     * 
     *    If you requested portrait effects matte delivery by calling -[AVCapturePhotoSettings setPortraitEffectsMatteDeliveryEnabled:YES], this property offers access to the resulting AVPortraitEffectsMatte object. Nil is returned if you did not request portrait effects matte delivery. Note that the portrait effects matte is only embedded in the photo's internal file format container if you set -[AVCapturePhotoSettings setEmbedsPortraitEffectsMatteInPhoto:YES].
     */
    @Generated
    @Selector("portraitEffectsMatte")
    public native AVPortraitEffectsMatte portraitEffectsMatte();

    /**
     * semanticSegmentationMatteForType:
     * 
     *    An accessor for semantic segmentation mattes associated with this photo.
     * 
     *    If you requested one or more semantic segmentation mattes by calling -[AVCapturePhotoSettings setEnabledSemanticSegmentationMatteTypes:] with a non-empty array of types, this property offers access to the resulting AVSemanticSegmentationMatte objects. Nil is returned if you did not request semantic segmentation matte delivery, or if no mattes of the specified type are available. Note that semantic segmentation mattes are only embedded in the photo's internal file format container if you call -[AVCapturePhotoSettings setEmbedsSemanticSegmentationMattesInPhoto:YES].
     * 
     * @param semanticSegmentationMatteType
     *    The matte type of interest (hair, skin, etc).
     * @return
     *    An instance of AVSemanticSegmentationMatte, or nil if none could be found for the specified type.
     */
    @Generated
    @Selector("semanticSegmentationMatteForType:")
    public native AVSemanticSegmentationMatte semanticSegmentationMatteForType(String semanticSegmentationMatteType);
}