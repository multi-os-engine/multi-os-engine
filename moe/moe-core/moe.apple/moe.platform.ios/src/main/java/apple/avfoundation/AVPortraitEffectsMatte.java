package apple.avfoundation;

import apple.NSObject;
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
 * AVPortraitEffectsMatte
 * <p>
 * An object wrapping a matting image used for high quality rendering of portrait style effects onto an image (i.e. shallow depth of field, stage lighting, etc).
 * <p>
 * The pixel data in the matting image is represented in CVPixelBuffers as kCVPixelFormatType_OneComponent8 ('L008'). It's stored in image files as an auxiliary image, accessible using CGImageSourceCopyAuxiliaryDataInfoAtIndex with the data type kCGImageAuxiliaryDataTypePortraitEffectsMatte (see <ImageIO/CGImageProperties.h>).
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPortraitEffectsMatte extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPortraitEffectsMatte(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPortraitEffectsMatte alloc();

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

    /**
     * dictionaryRepresentationForAuxiliaryDataType:
     * <p>
     * Returns a dictionary of primitive map information to be used when writing an image file with a portrait effects matte.
     * <p>
     * When using ImageIO framework's CGImageDestination API to write portrait effects matte information to a HEIF or JPEG file, you may use this method to generate a dictionary of primitive map information consumed by CGImageDestinationAddAuxiliaryDataInfo.
     *
     * @param outAuxDataType On output, the auxiliary data type to be used when calling CGImageDestinationAddAuxiliaryDataInfo. Currently the only supported auxiliary data type is kCGImageAuxiliaryDataTypePortraitEffectsMatte.
     * @return A dictionary of CGImageDestination compatible portrait effects matte information, or nil if the auxDataType is unsupported.
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
    public native AVPortraitEffectsMatte init();

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
     * [@property] mattingImage
     * <p>
     * Provides access to the portrait effects matte's internal image.
     * <p>
     * The pixel format can be queried using the pixelFormatType property.
     */
    @Generated
    @Selector("mattingImage")
    public native CVBufferRef mattingImage();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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

    /**
     * portraitEffectsMatteByApplyingExifOrientation:
     * <p>
     * Returns a derivative AVPortraitEffectsMatte instance in which the specified Exif orientation has been applied.
     * <p>
     * When applying simple 90 degree rotation or mirroring edits to media containing a portrait effects matte, you may use this initializer to create a derivative copy of the portrait effects matte in which the specified orientation is applied. This method throws an NSInvalidArgumentException if you pass an unrecognized exifOrientation.
     *
     * @param exifOrientation One of the 8 standard Exif orientation tags expressing how the portrait effects matte should be rotated / mirrored.
     * @return An AVPortraitEffectsMatte instance.
     */
    @Generated
    @Selector("portraitEffectsMatteByApplyingExifOrientation:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object portraitEffectsMatteByApplyingExifOrientation(int exifOrientation);

    /**
     * portraitEffectsMatteByReplacingPortraitEffectsMatteWithPixelBuffer:error:
     * <p>
     * Returns an AVPortraitEffectsMatte instance wrapping the replacement pixel buffer.
     * <p>
     * When applying complex edits to media containing a portrait effects matte, you may create a derivative matte with arbitrary transforms applied to it, then use this initializer to create a new AVPortraitEffectsMatte.
     *
     * @param pixelBuffer A pixel buffer containing a portrait effects matting image, represented as kCVPixelFormatType_OneComponent8 with a kCVImageBufferTransferFunction_Linear transfer function.
     * @param outError    On return, if the AVPortraitEffectsMatte cannot be created, points to an NSError describing the problem.
     * @return An AVPortraitEffectsMatte instance, or nil if the pixel buffer is malformed.
     */
    @Generated
    @Selector("portraitEffectsMatteByReplacingPortraitEffectsMatteWithPixelBuffer:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object portraitEffectsMatteByReplacingPortraitEffectsMatteWithPixelBufferError(
            CVBufferRef pixelBuffer, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * portraitEffectsMatteFromDictionaryRepresentation:error:
     * <p>
     * Returns an AVPortraitEffectsMatte instance from auxiliary image information in an image file.
     * <p>
     * When using ImageIO framework's CGImageSource API to read from a HEIF or JPEG file containing a portrait effects matte, AVPortraitEffectsMatte can be instantiated using the result of CGImageSourceCopyAuxiliaryDataInfoAtIndex, which returns a CFDictionary of primitive map information.
     *
     * @param imageSourceAuxDataInfoDictionary A dictionary of primitive portrait effects matte related information obtained from CGImageSourceCopyAuxiliaryDataInfoAtIndex.
     * @param outError                         On return, if the portrait effects matte cannot be created, points to an NSError describing the problem.
     * @return An AVPortraitEffectsMatte instance, or nil if the auxiliary data info dictionary was malformed.
     */
    @Generated
    @Selector("portraitEffectsMatteFromDictionaryRepresentation:error:")
    public static native AVPortraitEffectsMatte portraitEffectsMatteFromDictionaryRepresentationError(
            NSDictionary<?, ?> imageSourceAuxDataInfoDictionary,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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
