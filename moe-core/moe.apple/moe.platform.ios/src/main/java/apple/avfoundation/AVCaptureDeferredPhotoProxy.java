package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVCaptureDeferredPhotoProxy
 * 
 * A lightly-processed photo whose data may be used to process and fetch a higher-resolution asset at a later time.
 * 
 * An AVCaptureDeferredPhotoProxy behaves like a normal AVCapturePhoto, and approximates the look of the final rendered
 * image. This object represents intermediate data that can be rendered into a final image and ingested into the user's
 * photo library via PHAsset APIs. The intermediate data are not accessible by the calling process.
 * 
 * Use a PHAssetCreationRequest with a resourceType of PHAssetResourceTypePhotoProxy using the fileDataRepresentation of
 * this object. Image processing to finalize the asset will occur either on-demand when accessing the image data via
 * PHImageManager or PHAssetResource, or will execute in the background when the system has determined that it's a good
 * time to process based on thermals, battery level, and other conditions. If the data provided to the
 * PHAssetCreationRequest does not come from an AVCaptureDeferredPhotoProxy, then PHAssetCreationRequest will fail and a
 * PHPhotosErrorInvalidResource error will be returned.
 * 
 * Below is a discussion of how the superclass properties behave on an AVCaptureDeferredPhotoProxy.
 * 
 * @property(readonly) CMTime timestamp;
 *                     The time of the capture; proxy and final photos will have the same timestamp.
 * 
 * @property(readonly) NSDictionary<NSString *, id> *metadata;
 *                     The metadata of the proxy image may differ slightly from the final photo's metadata where some
 *                     fields may be updated.
 * 
 * @property(readonly, getter=isRawPhoto) BOOL rawPhoto;
 *                     Always NO, as deferred processing isn't available for raw photos.
 * 
 * @property(nullable, readonly) NSDictionary<NSString *, id> *embeddedThumbnailPhotoFormat;
 *                     Describes the embedded thumbnail format of both the proxy and the final photo which have the same
 *                     dimensions and codec.
 * 
 * @property(readonly) AVCaptureResolvedPhotoSettings *resolvedSettings;
 *                     Describes the resolved settings of the whole capture, including the proxy and final photo. See
 *                     AVCaptureResolvedPhotoSettings.deferredPhotoProxyDimensions.
 * 
 * @property(readonly) NSInteger photoCount;
 *                     Same for both proxy and final.
 * 
 * @property(nullable, readonly) AVCaptureDeviceType sourceDeviceType;
 *                     Same for both proxy and final.
 * 
 * @property(nullable, readonly) AVCaptureBracketedStillImageSettings *bracketSettings;
 *                     Same for both proxy and final.
 * 
 * @property(readonly) NSInteger sequenceCount;
 *                     Same for both proxy and final.
 * 
 * @property(readonly) AVCaptureLensStabilizationStatus lensStabilizationStatus;
 *                     Same for both proxy and final.
 * 
 *                     Superclass properties/methods that behave differently than a typical AVCapturePhoto:
 * @property(nullable, readonly) CVPixelBufferRef pixelBuffer NS_RETURNS_INNER_POINTER;
 * @property(nullable, readonly) CVPixelBufferRef previewPixelBuffer NS_RETURNS_INNER_POINTER;
 *                     - (nullable CGImageRef)CGImageRepresentation;
 *                     - (nullable CGImageRef)previewCGImageRepresentation;
 *                     All of the above properties return the same proxy image, either as a pixel buffer or CGImageRef.
 * 
 *                     - (nullable NSData *)fileDataRepresentation;
 *                     - (nullable NSData
 *                     *)fileDataRepresentationWithCustomizer:(id<AVCapturePhotoFileDataRepresentationCustomizer>)customizer;
 *                     You may call either of the above two methods to create a NSData representation of the image, but
 *                     note that it is only the proxy image quality being packaged.
 * 
 *                     API-Since: 17.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureDeferredPhotoProxy extends AVCapturePhoto {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureDeferredPhotoProxy(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureDeferredPhotoProxy alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCaptureDeferredPhotoProxy allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
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
    @Selector("init")
    public native AVCaptureDeferredPhotoProxy init();

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVCaptureDeferredPhotoProxy new_objc();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}