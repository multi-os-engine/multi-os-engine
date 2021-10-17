package apple.avfoundation;

import apple.NSObject;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSString;
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
 * AVDepthData
 * <p>
 * An object wrapping a map of disparity or depth pixel data, plus metadata.
 * <p>
 * "Depth Data" is a generic term for a map of pixel data containing depth-related information. AVDepthData wraps a disparity or depth map and provides conversion methods, focus information, and camera calibration data to aid in using the map for rendering or computer vision tasks. CoreVideo supports the following four depth data pixel formats:
 * kCVPixelFormatType_DisparityFloat16    = 'hdis'
 * kCVPixelFormatType_DisparityFloat32    = 'fdis'
 * kCVPixelFormatType_DepthFloat16        = 'hdep'
 * kCVPixelFormatType_DepthFloat32        = 'fdep'
 * <p>
 * The disparity formats describe normalized shift values when comparing two images. Units are 1/meters: ( pixelShift / (pixelFocalLength * baselineInMeters) ).
 * The depth formats describe the distance to an object in meters.
 * <p>
 * Disparity / depth maps are generated from camera images containing non-rectilinear data. Camera lenses have small imperfections that cause small distortions in their resultant images compared to a pinhole camera. AVDepthData maps contain non-rectilinear (non-distortion-corrected) data as well. Their values are warped to match the lens distortion characteristics present in their accompanying YUV image. Therefore an AVDepthData map can be used as a proxy for depth when rendering effects to its accompanying image, but not to correlate points in 3D space. In order to use AVDepthData for computer vision tasks, you should use its accompanying camera calibration data to rectify the depth data (see AVCameraCalibrationData).
 * <p>
 * When capturing depth data from a camera using AVCaptureDepthDataOutput, AVDepthData objects are delivered to your AVCaptureDepthDataOutputDelegate in a streaming fashion. When capturing depth data along with photos using AVCapturePhotoOutput, depth data is delivered to your AVCapturePhotoCaptureDelegate as a property of an AVCapturePhoto (see -[AVCapturePhotoCaptureDelegate captureOutput:didFinishProcessingPhoto:error:]). When working with image files containing depth information, AVDepthData may be instantiated using information obtained from ImageIO. When editing images containing depth information, derivative AVDepthData objects may be instantiated reflecting the edits that have been performed.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVDepthData extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVDepthData(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVDepthData alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property] availableDepthDataTypes
     * <p>
     * Specifies which depth data pixel formats may be used with depthDataByConvertingToDepthDataType:.
     * <p>
     * This property presents the available pixel format types as an array of NSNumbers, each wrapping an OSType (CV pixel format type).
     */
    @Generated
    @Selector("availableDepthDataTypes")
    public native NSArray<? extends NSNumber> availableDepthDataTypes();

    /**
     * [@property] cameraCalibrationData
     * <p>
     * The calibration data of the camera with which AVDepthData map's values are aligned.
     * <p>
     * See AVCameraCalibrationData for more information. This property may return nil if no camera calibration data is available for the depth data.
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
     * [@property] depthDataAccuracy
     * <p>
     * Specifies the accuracy of the units in the depth data map's values.
     * <p>
     * See AVDepthDataAccuracy documentation for more information.
     */
    @Generated
    @Selector("depthDataAccuracy")
    @NInt
    public native long depthDataAccuracy();

    /**
     * depthDataByApplyingExifOrientation:
     * <p>
     * Returns a derivative AVDepthData instance in which the specified Exif orientation has been applied.
     * <p>
     * When applying simple 90 degree rotation or mirroring edits to media containing depth data, you may use this initializer to create a derivative copy of the depth in which the specified orientation is applied to both the underlying pixel map data and the camera calibration data. This method throws an NSInvalidArgumentException if you pass an unrecognized exifOrientation.
     *
     * @param exifOrientation One of the 8 standard Exif orientation tags expressing how the depth data should be rotated / mirrored.
     * @return An AVDepthData instance.
     */
    @Generated
    @Selector("depthDataByApplyingExifOrientation:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object depthDataByApplyingExifOrientation(int exifOrientation);

    /**
     * depthDataByConvertingToDepthDataType:
     * <p>
     * Returns a converted, derivative AVDepthData instance in the specified depthDataType.
     * <p>
     * This method throws an NSInvalidArgumentException if you pass an unrecognized depthDataType. See
     *
     * @param depthDataType The OSType of depthData object to which you'd like to convert. Must be present in availableDepthDataTypes.
     * @return An AVDepthData instance.
     */
    @Generated
    @Selector("depthDataByConvertingToDepthDataType:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object depthDataByConvertingToDepthDataType(int depthDataType);

    /**
     * depthDataByReplacingDepthDataMapWithPixelBuffer:error:
     * <p>
     * Returns an AVDepthData instance wrapping the replacement depth data map pixel buffer.
     * <p>
     * When applying complex edits to media containing depth data, you may create a derivative map with arbitrary transforms applied to it, then use this initializer to create a new AVDepthData. Note that this new depth data object has no camera calibration data, so its cameraCalibrationData property always returns nil.
     *
     * @param pixelBuffer A pixel buffer containing depth data information in one of the 4 supported disparity / depth pixel formats.
     * @param outError    On return, if the depth data cannot be created, points to an NSError describing the problem.
     * @return An AVDepthData instance, or nil if the pixel buffer is malformed.
     */
    @Generated
    @Selector("depthDataByReplacingDepthDataMapWithPixelBuffer:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object depthDataByReplacingDepthDataMapWithPixelBufferError(CVBufferRef pixelBuffer,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * depthDataFromDictionaryRepresentation:error:
     * <p>
     * Returns an AVDepthData instance from depth information in an image file.
     * <p>
     * When using ImageIO framework's CGImageSource API to read from a HEIF or JPEG file containing depth data, AVDepthData can be instantiated using the result of CGImageSourceCopyAuxiliaryDataInfoAtIndex, which returns a CFDictionary of primitive map information.
     *
     * @param imageSourceAuxDataInfoDictionary A dictionary of primitive depth-related information obtained from CGImageSourceCopyAuxiliaryDataInfoAtIndex.
     * @param outError                         On return, if the depth data cannot be created, points to an NSError describing the problem.
     * @return An AVDepthData instance, or nil if the auxiliary data info dictionary was malformed.
     */
    @Generated
    @Selector("depthDataFromDictionaryRepresentation:error:")
    public static native AVDepthData depthDataFromDictionaryRepresentationError(
            NSDictionary<?, ?> imageSourceAuxDataInfoDictionary,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] depthDataMap
     * <p>
     * Provides access to the depth data object's internal map.
     * <p>
     * The depth data map's pixel format can be queried using the depthDataType property.
     */
    @Generated
    @Selector("depthDataMap")
    public native CVBufferRef depthDataMap();

    /**
     * [@property] depthDataQuality
     * <p>
     * Specifies the overall quality of the depth data map's values.
     * <p>
     * See AVDepthDataQuality documentation for more information.
     */
    @Generated
    @Selector("depthDataQuality")
    @NInt
    public native long depthDataQuality();

    /**
     * [@property] depthDataType
     * <p>
     * Specifies the pixel format type of this depth data object's internal map.
     * <p>
     * One of kCVPixelFormatType_DisparityFloat16, kCVPixelFormatType_DisparityFloat32, kCVPixelFormatType_DepthFloat16, or kCVPixelFormatType_DepthFloat32.
     */
    @Generated
    @Selector("depthDataType")
    public native int depthDataType();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * dictionaryRepresentationForAuxiliaryDataType:
     * <p>
     * Returns a dictionary of primitive map information to be used when writing an image file with depth data.
     * <p>
     * When using ImageIO framework's CGImageDestination API to write depth data to a HEIF or JPEG file, you may use this method to generate a dictionary of primitive map information consumed by CGImageDestinationAddAuxiliaryDataInfo.
     *
     * @param outAuxDataType On output, either kCGImageAuxiliaryDataTypeDisparity or kCGImageAuxiliaryDataTypeDepth, depending on the depth data's file.
     * @return A dictionary of CGImageDestination compatible depth information, or nil if the auxDataType is unsupported.
     */
    @Generated
    @Selector("dictionaryRepresentationForAuxiliaryDataType:")
    public native NSDictionary<?, ?> dictionaryRepresentationForAuxiliaryDataType(
            @ReferenceInfo(type = NSString.class) Ptr<NSString> outAuxDataType);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVDepthData init();

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
     * [@property] depthDataFiltered
     * <p>
     * Specifies whether the depth data pixel buffer map contains filtered (hole-filled) data.
     * <p>
     * By setting either AVCaptureDepthDataOutput's filteringEnabled property or AVCapturePhotoSettings' depthDataFiltered property to YES, the resulting depth data are filtered to remove invalid pixel values that may be present due to a variety of factors including low light and lens occlusion. If you've requested depth data filtering, all depth data holes are filled. Note that filtering the depth data makes it more usable for applying effects, but alters the data such that it may no longer be suitable for computer vision tasks. Unfiltered depth maps present missing data as NaN.
     */
    @Generated
    @Selector("isDepthDataFiltered")
    public native boolean isDepthDataFiltered();

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
}
