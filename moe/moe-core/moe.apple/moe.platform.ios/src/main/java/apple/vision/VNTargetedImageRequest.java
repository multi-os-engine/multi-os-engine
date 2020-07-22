package apple.vision;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.coreimage.CIImage;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
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
import org.moe.natj.general.ann.MappedReturn;
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

@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNTargetedImageRequest extends VNImageBasedRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected VNTargetedImageRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNTargetedImageRequest alloc();

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
    @Selector("init")
    public native VNTargetedImageRequest init();

    @Generated
    @Selector("initWithCompletionHandler:")
    public native VNTargetedImageRequest initWithCompletionHandler(
            @ObjCBlock(name = "call_initWithCompletionHandler") VNRequest.Block_initWithCompletionHandler completionHandler);

    @Generated
    @Selector("initWithTargetedCGImage:options:")
    public native VNTargetedImageRequest initWithTargetedCGImageOptions(CGImageRef cgImage,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCGImage:options:completionHandler:")
    public native VNTargetedImageRequest initWithTargetedCGImageOptionsCompletionHandler(CGImageRef cgImage,
            NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_initWithTargetedCGImageOptionsCompletionHandler") Block_initWithTargetedCGImageOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTargetedCGImageOptionsCompletionHandler {
        @Generated
        void call_initWithTargetedCGImageOptionsCompletionHandler(VNRequest request, NSError error);
    }

    @Generated
    @Selector("initWithTargetedCGImage:orientation:options:")
    public native VNTargetedImageRequest initWithTargetedCGImageOrientationOptions(CGImageRef cgImage, int orientation,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCGImage:orientation:options:completionHandler:")
    public native VNTargetedImageRequest initWithTargetedCGImageOrientationOptionsCompletionHandler(CGImageRef cgImage,
            int orientation, NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_initWithTargetedCGImageOrientationOptionsCompletionHandler") Block_initWithTargetedCGImageOrientationOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTargetedCGImageOrientationOptionsCompletionHandler {
        @Generated
        void call_initWithTargetedCGImageOrientationOptionsCompletionHandler(VNRequest request, NSError error);
    }

    @Generated
    @Selector("initWithTargetedCIImage:options:")
    public native VNTargetedImageRequest initWithTargetedCIImageOptions(CIImage ciImage,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCIImage:options:completionHandler:")
    public native VNTargetedImageRequest initWithTargetedCIImageOptionsCompletionHandler(CIImage ciImage,
            NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_initWithTargetedCIImageOptionsCompletionHandler") Block_initWithTargetedCIImageOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTargetedCIImageOptionsCompletionHandler {
        @Generated
        void call_initWithTargetedCIImageOptionsCompletionHandler(VNRequest request, NSError error);
    }

    @Generated
    @Selector("initWithTargetedCIImage:orientation:options:")
    public native VNTargetedImageRequest initWithTargetedCIImageOrientationOptions(CIImage ciImage, int orientation,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCIImage:orientation:options:completionHandler:")
    public native VNTargetedImageRequest initWithTargetedCIImageOrientationOptionsCompletionHandler(CIImage ciImage,
            int orientation, NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_initWithTargetedCIImageOrientationOptionsCompletionHandler") Block_initWithTargetedCIImageOrientationOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTargetedCIImageOrientationOptionsCompletionHandler {
        @Generated
        void call_initWithTargetedCIImageOrientationOptionsCompletionHandler(VNRequest request, NSError error);
    }

    @Generated
    @Selector("initWithTargetedCVPixelBuffer:options:")
    public native VNTargetedImageRequest initWithTargetedCVPixelBufferOptions(CVBufferRef pixelBuffer,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCVPixelBuffer:options:completionHandler:")
    public native VNTargetedImageRequest initWithTargetedCVPixelBufferOptionsCompletionHandler(CVBufferRef pixelBuffer,
            NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_initWithTargetedCVPixelBufferOptionsCompletionHandler") Block_initWithTargetedCVPixelBufferOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTargetedCVPixelBufferOptionsCompletionHandler {
        @Generated
        void call_initWithTargetedCVPixelBufferOptionsCompletionHandler(VNRequest request, NSError error);
    }

    @Generated
    @Selector("initWithTargetedCVPixelBuffer:orientation:options:")
    public native VNTargetedImageRequest initWithTargetedCVPixelBufferOrientationOptions(CVBufferRef pixelBuffer,
            int orientation, NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedCVPixelBuffer:orientation:options:completionHandler:")
    public native VNTargetedImageRequest initWithTargetedCVPixelBufferOrientationOptionsCompletionHandler(
            CVBufferRef pixelBuffer, int orientation, NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_initWithTargetedCVPixelBufferOrientationOptionsCompletionHandler") Block_initWithTargetedCVPixelBufferOrientationOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTargetedCVPixelBufferOrientationOptionsCompletionHandler {
        @Generated
        void call_initWithTargetedCVPixelBufferOrientationOptionsCompletionHandler(VNRequest request, NSError error);
    }

    @Generated
    @Selector("initWithTargetedImageData:options:")
    public native VNTargetedImageRequest initWithTargetedImageDataOptions(NSData imageData,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedImageData:options:completionHandler:")
    public native VNTargetedImageRequest initWithTargetedImageDataOptionsCompletionHandler(NSData imageData,
            NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_initWithTargetedImageDataOptionsCompletionHandler") Block_initWithTargetedImageDataOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTargetedImageDataOptionsCompletionHandler {
        @Generated
        void call_initWithTargetedImageDataOptionsCompletionHandler(VNRequest request, NSError error);
    }

    @Generated
    @Selector("initWithTargetedImageData:orientation:options:")
    public native VNTargetedImageRequest initWithTargetedImageDataOrientationOptions(NSData imageData, int orientation,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedImageData:orientation:options:completionHandler:")
    public native VNTargetedImageRequest initWithTargetedImageDataOrientationOptionsCompletionHandler(NSData imageData,
            int orientation, NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_initWithTargetedImageDataOrientationOptionsCompletionHandler") Block_initWithTargetedImageDataOrientationOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTargetedImageDataOrientationOptionsCompletionHandler {
        @Generated
        void call_initWithTargetedImageDataOrientationOptionsCompletionHandler(VNRequest request, NSError error);
    }

    @Generated
    @Selector("initWithTargetedImageURL:options:")
    public native VNTargetedImageRequest initWithTargetedImageURLOptions(NSURL imageURL,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedImageURL:options:completionHandler:")
    public native VNTargetedImageRequest initWithTargetedImageURLOptionsCompletionHandler(NSURL imageURL,
            NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_initWithTargetedImageURLOptionsCompletionHandler") Block_initWithTargetedImageURLOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTargetedImageURLOptionsCompletionHandler {
        @Generated
        void call_initWithTargetedImageURLOptionsCompletionHandler(VNRequest request, NSError error);
    }

    @Generated
    @Selector("initWithTargetedImageURL:orientation:options:")
    public native VNTargetedImageRequest initWithTargetedImageURLOrientationOptions(NSURL imageURL, int orientation,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTargetedImageURL:orientation:options:completionHandler:")
    public native VNTargetedImageRequest initWithTargetedImageURLOrientationOptionsCompletionHandler(NSURL imageURL,
            int orientation, NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_initWithTargetedImageURLOrientationOptionsCompletionHandler") Block_initWithTargetedImageURLOrientationOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTargetedImageURLOrientationOptionsCompletionHandler {
        @Generated
        void call_initWithTargetedImageURLOrientationOptionsCompletionHandler(VNRequest request, NSError error);
    }

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

    @Generated
    @Selector("supportedRevisions")
    public static native NSIndexSet supportedRevisions();
}