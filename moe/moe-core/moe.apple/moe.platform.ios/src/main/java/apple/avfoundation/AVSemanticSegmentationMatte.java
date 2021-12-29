package apple.avfoundation;

import apple.NSObject;
import apple.corefoundation.opaque.CFStringRef;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSString;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVSemanticSegmentationMatte
 * <p>
 * An object wrapping a matting image for a particular semantic segmentation.
 * <p>
 * The pixel data in the matting image is represented in CVPixelBuffers as kCVPixelFormatType_OneComponent8 ('L008'). It is stored in image files as an auxiliary image, accessible using CGImageSourceCopyAuxiliaryDataInfoAtIndex using data types defined in <ImageIO/CGImageProperties.h>.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVSemanticSegmentationMatte extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVSemanticSegmentationMatte(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVSemanticSegmentationMatte alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVSemanticSegmentationMatte allocWithZone(VoidPtr zone);

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

    /**
     * dictionaryRepresentationForAuxiliaryDataType:
     * <p>
     * Returns a dictionary of primitive map information to be used when writing an image file with a semantic segmentation matte.
     * <p>
     * When using ImageIO framework's CGImageDestination API to write semantic segmentation matte information to a HEIF or JPEG file, you may use this method to generate a dictionary of primitive map information consumed by CGImageDestinationAddAuxiliaryDataInfo.
     *
     * @param outAuxDataType On output, the auxiliary data type to be used when calling CGImageDestinationAddAuxiliaryDataInfo. Currently supported auxiliary data types are enumerated in <ImageIO/CGImageProperties.h>
     * @return A dictionary of CGImageDestination compatible semantic segmentation matte information, or nil if the auxDataType is unsupported.
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
    public native AVSemanticSegmentationMatte init();

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

    /**
     * [@property] matteType
     * <p>
     * Specifies the receiver's semantic segmentation matting image type.
     * <p>
     * An AVSemanticSegmentationMatte's matteType is immutable for the life of the object.
     */
    @Generated
    @Selector("matteType")
    public native String matteType();

    /**
     * [@property] mattingImage
     * <p>
     * Provides access to the semantic segmentation matte's internal image.
     * <p>
     * The pixel format can be queried using the pixelFormatType property.
     */
    @Generated
    @Selector("mattingImage")
    public native CVBufferRef mattingImage();

    @Generated
    @Owned
    @Selector("new")
    public static native AVSemanticSegmentationMatte new_objc();

    /**
     * [@property] pixelFormatType
     * <p>
     * Specifies the pixel format type of this object's internal matting image.
     * <p>
     * Currently the only supported CV pixel format type for the matting image is kCVPixelFormatType_OneComponent8.
     */
    @Generated
    @Selector("pixelFormatType")
    public native int pixelFormatType();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * semanticSegmentationMatteByApplyingExifOrientation:
     * <p>
     * Returns a derivative AVSemanticSegmentationMatte instance in which the specified Exif orientation has been applied.
     * <p>
     * When applying simple 90 degree rotation or mirroring edits to media containing a semantic segmentation matte, you may use this initializer to create a derivative copy of the matte in which the specified orientation is applied. This method throws an NSInvalidArgumentException if you pass an unrecognized exifOrientation.
     *
     * @param exifOrientation One of the 8 standard Exif orientation tags expressing how the matte should be rotated / mirrored.
     * @return An AVSemanticSegmentationMatte's instance.
     */
    @Generated
    @Selector("semanticSegmentationMatteByApplyingExifOrientation:")
    public native AVSemanticSegmentationMatte semanticSegmentationMatteByApplyingExifOrientation(int exifOrientation);

    /**
     * semanticSegmentationMatteByReplacingSemanticSegmentationMatteWithPixelBuffer:error:
     * <p>
     * Returns an AVSemanticSegmentationMatte instance wrapping the replacement pixel buffer.
     * <p>
     * When applying complex edits to media containing a semantic segmentation matte, you may create a derivative matte with arbitrary transforms applied to it, then use this initializer to create a new AVSemanticSegmentationMatte.
     *
     * @param pixelBuffer A pixel buffer containing a semantic segmentation matting image, represented as kCVPixelFormatType_OneComponent8 with a kCVImageBufferTransferFunction_Linear transfer function.
     * @param outError    On return, if the AVSemanticSegmentationMatte cannot be created, points to an NSError describing the problem.
     * @return An AVSemanticSegmentationMatte instance, or nil if the pixel buffer is malformed.
     */
    @Generated
    @Selector("semanticSegmentationMatteByReplacingSemanticSegmentationMatteWithPixelBuffer:error:")
    public native AVSemanticSegmentationMatte semanticSegmentationMatteByReplacingSemanticSegmentationMatteWithPixelBufferError(
            CVBufferRef pixelBuffer, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * semanticSegmentationMatteFromDictionaryRepresentation:error:
     * <p>
     * Returns an AVSemanticSegmentationMatte instance from auxiliary image information in an image file.
     * <p>
     * When using ImageIO framework's CGImageSource API to read from a HEIF or JPEG file containing a semantic segmentation matte, AVSemanticSegmentationMatte can be instantiated using the result of CGImageSourceCopyAuxiliaryDataInfoAtIndex, which returns a CFDictionary of primitive segmentation matte information.
     *
     * @param imageSourceAuxiliaryDataType           The kCGImageAuxiliaryDataType constant corresponding to the semantic segmentation matte being created (see <ImageIO/CGImageProperties.h>.
     * @param imageSourceAuxiliaryDataInfoDictionary A dictionary of primitive semantic segmentation matte related information obtained from CGImageSourceCopyAuxiliaryDataInfoAtIndex.
     * @param outError                               On return, if the semantic segmentation matte cannot be created, points to an NSError describing the problem.
     * @return An AVSemanticSegmentationMatte instance, or nil if the auxiliary data info dictionary was malformed.
     */
    @Generated
    @Selector("semanticSegmentationMatteFromImageSourceAuxiliaryDataType:dictionaryRepresentation:error:")
    public static native AVSemanticSegmentationMatte semanticSegmentationMatteFromImageSourceAuxiliaryDataTypeDictionaryRepresentationError(
            CFStringRef imageSourceAuxiliaryDataType, NSDictionary<?, ?> imageSourceAuxiliaryDataInfoDictionary,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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
