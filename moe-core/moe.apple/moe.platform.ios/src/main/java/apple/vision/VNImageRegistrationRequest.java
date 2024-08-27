package apple.vision;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.coreimage.CIImage;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSIndexSet;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A request that will calculate a transformation for morphing a "floating" image onto an unchanging "reference" image.
 * 
 * The request is created with the targeted image acting as the floating image. Processing the request will calculate
 * the transformations that morph the floating image onto the reference image.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNImageRegistrationRequest extends VNTargetedImageRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected VNImageRegistrationRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNImageRegistrationRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNImageRegistrationRequest allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("init")
    public native VNImageRegistrationRequest init();

    @Generated
    @Selector("initWithCompletionHandler:")
    public native VNImageRegistrationRequest initWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_initWithCompletionHandler") VNRequest.Block_initWithCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCGImage:options:")
    public native VNImageRegistrationRequest initWithTargetedCGImageOptions(@NotNull CGImageRef cgImage,
            @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCGImage:options:completionHandler:")
    public native VNImageRegistrationRequest initWithTargetedCGImageOptionsCompletionHandler(
            @NotNull CGImageRef cgImage, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCGImageOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCGImageOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCGImage:orientation:options:")
    public native VNImageRegistrationRequest initWithTargetedCGImageOrientationOptions(@NotNull CGImageRef cgImage,
            int orientation, @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCGImage:orientation:options:completionHandler:")
    public native VNImageRegistrationRequest initWithTargetedCGImageOrientationOptionsCompletionHandler(
            @NotNull CGImageRef cgImage, int orientation, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCGImageOrientationOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCGImageOrientationOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCIImage:options:")
    public native VNImageRegistrationRequest initWithTargetedCIImageOptions(@NotNull CIImage ciImage,
            @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCIImage:options:completionHandler:")
    public native VNImageRegistrationRequest initWithTargetedCIImageOptionsCompletionHandler(@NotNull CIImage ciImage,
            @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCIImageOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCIImageOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCIImage:orientation:options:")
    public native VNImageRegistrationRequest initWithTargetedCIImageOrientationOptions(@NotNull CIImage ciImage,
            int orientation, @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCIImage:orientation:options:completionHandler:")
    public native VNImageRegistrationRequest initWithTargetedCIImageOrientationOptionsCompletionHandler(
            @NotNull CIImage ciImage, int orientation, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCIImageOrientationOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCIImageOrientationOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCVPixelBuffer:options:")
    public native VNImageRegistrationRequest initWithTargetedCVPixelBufferOptions(@NotNull CVBufferRef pixelBuffer,
            @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCVPixelBuffer:options:completionHandler:")
    public native VNImageRegistrationRequest initWithTargetedCVPixelBufferOptionsCompletionHandler(
            @NotNull CVBufferRef pixelBuffer, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCVPixelBufferOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCVPixelBufferOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCVPixelBuffer:orientation:options:")
    public native VNImageRegistrationRequest initWithTargetedCVPixelBufferOrientationOptions(
            @NotNull CVBufferRef pixelBuffer, int orientation, @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCVPixelBuffer:orientation:options:completionHandler:")
    public native VNImageRegistrationRequest initWithTargetedCVPixelBufferOrientationOptionsCompletionHandler(
            @NotNull CVBufferRef pixelBuffer, int orientation, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCVPixelBufferOrientationOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCVPixelBufferOrientationOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedImageData:options:")
    public native VNImageRegistrationRequest initWithTargetedImageDataOptions(@NotNull NSData imageData,
            @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedImageData:options:completionHandler:")
    public native VNImageRegistrationRequest initWithTargetedImageDataOptionsCompletionHandler(
            @NotNull NSData imageData, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedImageDataOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedImageDataOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedImageData:orientation:options:")
    public native VNImageRegistrationRequest initWithTargetedImageDataOrientationOptions(@NotNull NSData imageData,
            int orientation, @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedImageData:orientation:options:completionHandler:")
    public native VNImageRegistrationRequest initWithTargetedImageDataOrientationOptionsCompletionHandler(
            @NotNull NSData imageData, int orientation, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedImageDataOrientationOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedImageDataOrientationOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedImageURL:options:")
    public native VNImageRegistrationRequest initWithTargetedImageURLOptions(@NotNull NSURL imageURL,
            @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedImageURL:options:completionHandler:")
    public native VNImageRegistrationRequest initWithTargetedImageURLOptionsCompletionHandler(@NotNull NSURL imageURL,
            @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedImageURLOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedImageURLOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedImageURL:orientation:options:")
    public native VNImageRegistrationRequest initWithTargetedImageURLOrientationOptions(@NotNull NSURL imageURL,
            int orientation, @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedImageURL:orientation:options:completionHandler:")
    public native VNImageRegistrationRequest initWithTargetedImageURLOrientationOptionsCompletionHandler(
            @NotNull NSURL imageURL, int orientation, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedImageURLOrientationOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedImageURLOrientationOptionsCompletionHandler completionHandler);

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
    public static native VNImageRegistrationRequest new_objc();

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

    @Generated
    @Selector("currentRevision")
    @NUInt
    public static native long currentRevision();

    @Generated
    @Selector("defaultRevision")
    @NUInt
    public static native long defaultRevision();

    @NotNull
    @Generated
    @Selector("supportedRevisions")
    public static native NSIndexSet supportedRevisions();

    @Generated
    @Selector("initWithTargetedCMSampleBuffer:options:")
    public native VNImageRegistrationRequest initWithTargetedCMSampleBufferOptions(
            @NotNull CMSampleBufferRef sampleBuffer, @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCMSampleBuffer:options:completionHandler:")
    public native VNImageRegistrationRequest initWithTargetedCMSampleBufferOptionsCompletionHandler(
            @NotNull CMSampleBufferRef sampleBuffer, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCMSampleBufferOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCMSampleBufferOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCMSampleBuffer:orientation:options:")
    public native VNImageRegistrationRequest initWithTargetedCMSampleBufferOrientationOptions(
            @NotNull CMSampleBufferRef sampleBuffer, int orientation, @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCMSampleBuffer:orientation:options:completionHandler:")
    public native VNImageRegistrationRequest initWithTargetedCMSampleBufferOrientationOptionsCompletionHandler(
            @NotNull CMSampleBufferRef sampleBuffer, int orientation, @NotNull NSDictionary<String, ?> options,
            @Nullable @ObjCBlock(name = "call_initWithTargetedCMSampleBufferOrientationOptionsCompletionHandler") VNTargetedImageRequest.Block_initWithTargetedCMSampleBufferOrientationOptionsCompletionHandler completionHandler);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
