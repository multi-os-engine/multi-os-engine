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

    @Generated
    @Selector("bracketSettings")
    public native AVCaptureBracketedStillImageSettings bracketSettings();

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

    @Generated
    @Selector("depthData")
    public native AVDepthData depthData();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("embeddedThumbnailPhotoFormat")
    public native NSDictionary<String, ?> embeddedThumbnailPhotoFormat();

    @Generated
    @Selector("fileDataRepresentation")
    public native NSData fileDataRepresentation();

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

    @Generated
    @Selector("isRawPhoto")
    public native boolean isRawPhoto();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("lensStabilizationStatus")
    @NInt
    public native long lensStabilizationStatus();

    @Generated
    @Selector("metadata")
    public native NSDictionary<String, ?> metadata();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("photoCount")
    @NInt
    public native long photoCount();

    @Generated
    @Selector("pixelBuffer")
    public native CVBufferRef pixelBuffer();

    @Generated
    @Selector("previewCGImageRepresentation")
    public native CGImageRef previewCGImageRepresentation();

    @Generated
    @Selector("previewPixelBuffer")
    public native CVBufferRef previewPixelBuffer();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("resolvedSettings")
    public native AVCaptureResolvedPhotoSettings resolvedSettings();

    @Generated
    @Selector("sequenceCount")
    @NInt
    public native long sequenceCount();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("sourceDeviceType")
    public native String sourceDeviceType();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("timestamp")
    @ByValue
    public native CMTime timestamp();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("fileDataRepresentationWithCustomizer:")
    public native NSData fileDataRepresentationWithCustomizer(
            @Mapped(ObjCObjectMapper.class) AVCapturePhotoFileDataRepresentationCustomizer customizer);

    @Generated
    @Selector("portraitEffectsMatte")
    public native AVPortraitEffectsMatte portraitEffectsMatte();

    @Generated
    @Selector("semanticSegmentationMatteForType:")
    public native AVSemanticSegmentationMatte semanticSegmentationMatteForType(String semanticSegmentationMatteType);
}