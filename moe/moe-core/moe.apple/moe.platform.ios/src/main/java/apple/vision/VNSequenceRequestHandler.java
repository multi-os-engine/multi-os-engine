package apple.vision;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.coreimage.CIImage;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Performs requests on a sequence of images.
 * 
 * The VNSequenceRequestHandler is created without any specific image source. The
 * -performRequests:on<ImageSource>:error: methods will retain the image source for no longer than the lifetime of the
 * call.
 * The VNSequenceRequestHandler can choose to also cache state information related to the previously-processed image
 * sources.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNSequenceRequestHandler extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected VNSequenceRequestHandler(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNSequenceRequestHandler alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNSequenceRequestHandler allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    /**
     * Creates a new object.
     */
    @Generated
    @Selector("init")
    public native VNSequenceRequestHandler init();

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native VNSequenceRequestHandler new_objc();

    /**
     * Perform requests on an image in a CGImageRef.
     * 
     * @param requests The VNRequests to be performed on the image.
     * 
     * @param image    The CGImageRef containing the image to be processed.
     * 
     * @param error    On input, a pointer to an error object. If an error occurs, this pointer is set to an actual
     *                 error object containing the error information. You may specify NULL for this parameter if you do
     *                 not want the error information.
     */
    @Generated
    @Selector("performRequests:onCGImage:error:")
    public native boolean performRequestsOnCGImageError(@NotNull NSArray<? extends VNRequest> requests,
            @NotNull CGImageRef image, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Perform requests on an image in a CGImageRef.
     * 
     * @param requests    The VNRequests to be performed on the image.
     * 
     * @param image       The CGImageRef containing the image to be processed.
     * 
     * @param orientation The orientation of the image.
     * 
     * @param error       On input, a pointer to an error object. If an error occurs, this pointer is set to an actual
     *                    error object containing the error information. You may specify NULL for this parameter if you
     *                    do not want the error information.
     */
    @Generated
    @Selector("performRequests:onCGImage:orientation:error:")
    public native boolean performRequestsOnCGImageOrientationError(@NotNull NSArray<? extends VNRequest> requests,
            @NotNull CGImageRef image, int orientation,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Perform requests on an image in a CIImage.
     * 
     * @param requests The VNRequests to be performed on the image.
     * 
     * @param image    The CIImage containing the image to be processed.
     * 
     * @param error    On input, a pointer to an error object. If an error occurs, this pointer is set to an actual
     *                 error object containing the error information. You may specify NULL for this parameter if you do
     *                 not want the error information.
     */
    @Generated
    @Selector("performRequests:onCIImage:error:")
    public native boolean performRequestsOnCIImageError(@NotNull NSArray<? extends VNRequest> requests,
            @NotNull CIImage image, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Perform requests on an image in a CIImage.
     * 
     * @param requests    The VNRequests to be performed on the image.
     * 
     * @param image       The CIImage containing the image to be processed.
     * 
     * @param orientation The orientation of the image.
     * 
     * @param error       On input, a pointer to an error object. If an error occurs, this pointer is set to an actual
     *                    error object containing the error information. You may specify NULL for this parameter if you
     *                    do not want the error information.
     */
    @Generated
    @Selector("performRequests:onCIImage:orientation:error:")
    public native boolean performRequestsOnCIImageOrientationError(@NotNull NSArray<? extends VNRequest> requests,
            @NotNull CIImage image, int orientation, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Perform requests on an image in a CVPixelBuffer.
     * 
     * @param requests    The VNRequests to be performed on the image.
     * 
     * @param pixelBuffer The CVPixelBuffer containing the image to be processed.
     * 
     * @param error       On input, a pointer to an error object. If an error occurs, this pointer is set to an actual
     *                    error object containing the error information. You may specify NULL for this parameter if you
     *                    do not want the error information.
     */
    @Generated
    @Selector("performRequests:onCVPixelBuffer:error:")
    public native boolean performRequestsOnCVPixelBufferError(@NotNull NSArray<? extends VNRequest> requests,
            @NotNull CVBufferRef pixelBuffer, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Perform requests on an image in a CVPixelBuffer.
     * 
     * @param requests    The VNRequests to be performed on the image.
     * 
     * @param pixelBuffer The CVPixelBuffer containing the image to be processed.
     * 
     * @param orientation The orientation of the image as it is captured in the pixel buffer.
     * 
     * @param error       On input, a pointer to an error object. If an error occurs, this pointer is set to an actual
     *                    error object containing the error information. You may specify NULL for this parameter if you
     *                    do not want the error information.
     */
    @Generated
    @Selector("performRequests:onCVPixelBuffer:orientation:error:")
    public native boolean performRequestsOnCVPixelBufferOrientationError(@NotNull NSArray<? extends VNRequest> requests,
            @NotNull CVBufferRef pixelBuffer, int orientation,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Perform requests on an image with its source format in memory.
     * 
     * @param requests  The VNRequests to be performed on the image.
     * 
     * @param imageData The data representing the source format of the image to be processed.
     * 
     * @param error     On input, a pointer to an error object. If an error occurs, this pointer is set to an actual
     *                  error object containing the error information. You may specify NULL for this parameter if you do
     *                  not want the error information.
     */
    @Generated
    @Selector("performRequests:onImageData:error:")
    public native boolean performRequestsOnImageDataError(@NotNull NSArray<? extends VNRequest> requests,
            @NotNull NSData imageData, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Perform requests on an image with its source format in memory.
     * 
     * @param requests    The VNRequests to be performed on the image.
     * 
     * @param imageData   The data representing the source format of the image to be processed.
     * 
     * @param orientation The orientation of the image.
     * 
     * @param error       On input, a pointer to an error object. If an error occurs, this pointer is set to an actual
     *                    error object containing the error information. You may specify NULL for this parameter if you
     *                    do not want the error information.
     */
    @Generated
    @Selector("performRequests:onImageData:orientation:error:")
    public native boolean performRequestsOnImageDataOrientationError(@NotNull NSArray<? extends VNRequest> requests,
            @NotNull NSData imageData, int orientation,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Perform requests on an image referenced by an URL.
     * 
     * @param requests The VNRequests to be performed on the image.
     * 
     * @param imageURL The URL of the image to be processed. If this is not a file-based URL, the method will fail.
     * 
     * @param error    On input, a pointer to an error object. If an error occurs, this pointer is set to an actual
     *                 error object containing the error information. You may specify NULL for this parameter if you do
     *                 not want the error information.
     */
    @Generated
    @Selector("performRequests:onImageURL:error:")
    public native boolean performRequestsOnImageURLError(@NotNull NSArray<? extends VNRequest> requests,
            @NotNull NSURL imageURL, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Perform requests on an image referenced by an URL.
     * 
     * @param requests    The VNRequests to be performed on the image.
     * 
     * @param imageURL    The URL of the image to be processed. If this is not a file-based URL, the method will fail.
     * 
     * @param orientation The orientation of the image.
     * 
     * @param error       On input, a pointer to an error object. If an error occurs, this pointer is set to an actual
     *                    error object containing the error information. You may specify NULL for this parameter if you
     *                    do not want the error information.
     */
    @Generated
    @Selector("performRequests:onImageURL:orientation:error:")
    public native boolean performRequestsOnImageURLOrientationError(@NotNull NSArray<? extends VNRequest> requests,
            @NotNull NSURL imageURL, int orientation,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
     * Perform requests on the image buffer contained in the CMSampleBufferRef.
     * 
     * @param requests     The VNRequests to be performed on the image.
     * 
     * @param sampleBuffer A CMSampleBuffer containing an image that will be used for performing the requests. Not all
     *                     types of sample buffers are supported. They need to contain a CVImageBuffer, be valid and
     *                     ready.
     * 
     * @param error        On input, a pointer to an error object. If an error occurs, this pointer is set to an actual
     *                     error object containing the error information. You may specify NULL for this parameter if you
     *                     do not want the error information.
     * 
     *                     API-Since: 14.0
     */
    @Generated
    @Selector("performRequests:onCMSampleBuffer:error:")
    public native boolean performRequestsOnCMSampleBufferError(@NotNull NSArray<? extends VNRequest> requests,
            @NotNull CMSampleBufferRef sampleBuffer, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Perform requests on the image buffer contained in the CMSampleBufferRef.
     * 
     * @param requests     The VNRequests to be performed on the image.
     * 
     * @param sampleBuffer A CMSampleBuffer containing an image that will be used for performing the requests. Not all
     *                     types of sample buffers are supported. They need to contain a CVImageBuffer, be valid and
     *                     ready.
     * 
     * @param orientation  The orientation of the image.
     * 
     * @param error        On input, a pointer to an error object. If an error occurs, this pointer is set to an actual
     *                     error object containing the error information. You may specify NULL for this parameter if you
     *                     do not want the error information.
     * 
     *                     API-Since: 14.0
     */
    @Generated
    @Selector("performRequests:onCMSampleBuffer:orientation:error:")
    public native boolean performRequestsOnCMSampleBufferOrientationError(
            @NotNull NSArray<? extends VNRequest> requests, @NotNull CMSampleBufferRef sampleBuffer, int orientation,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
