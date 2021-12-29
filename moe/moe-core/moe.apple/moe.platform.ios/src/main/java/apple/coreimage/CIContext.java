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

package apple.coreimage;

import apple.NSObject;
import apple.coregraphics.opaque.CGColorSpaceRef;
import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.opaque.CGImageRef;
import apple.coregraphics.opaque.IOSurfaceRef;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLCommandQueue;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLTexture;
import apple.opengles.EAGLContext;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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

@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIContext extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CIContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIContext alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CIContext allocWithZone(VoidPtr zone);

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
    @Selector("context")
    public static native CIContext context();

    /**
     * Create a context specifying a destination CGContext.
     * <p>
     * Core Image will use an internal destination context when methods such
     * as [context render:to...] or [context createCGImage:...] are called.
     * <p>
     * The [context drawImage:...] render methods will render to the CGContext.
     */
    @Generated
    @Selector("contextWithCGContext:options:")
    public static native CIContext contextWithCGContextOptions(CGContextRef cgctx, NSDictionary<String, ?> options);

    @Generated
    @Selector("contextWithEAGLContext:")
    public static native CIContext contextWithEAGLContext(EAGLContext eaglContext);

    @Generated
    @Selector("contextWithEAGLContext:options:")
    public static native CIContext contextWithEAGLContextOptions(EAGLContext eaglContext,
            NSDictionary<String, ?> options);

    /**
     * If a system has more than one MTLDevice, then you can create a CIContext
     * that uses a specific device. If a client wishes to use the default MTLDevice
     * then call [CIContext contextWithOptions:] instead.
     */
    @Generated
    @Selector("contextWithMTLDevice:")
    public static native CIContext contextWithMTLDevice(@Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("contextWithMTLDevice:options:")
    public static native CIContext contextWithMTLDeviceOptions(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            NSDictionary<String, ?> options);

    /**
     * Create a context without specifying a destination CG/GL/Metal context.
     * <p>
     * Core Image will use an internal destination context when methods such
     * as [context render:to...] or [context createCGImage:...] are called.
     * <p>
     * The [context drawImage:...] render methods will not operate on this type
     * of context.
     */
    @Generated
    @Selector("contextWithOptions:")
    public static native CIContext contextWithOptions(NSDictionary<String, ?> options);

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
    public static native CIContext new_objc();

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
     * Render a CIImage to JPEG data. Image must have a finite non-empty extent.
     * The CGColorSpace must be kCGColorSpaceModelRGB or kCGColorSpaceModelMonochrome.
     * Supported options keys are kCGImageDestinationLossyCompressionQuality,
     * and the depth, disparity, and matte options.
     */
    @Generated
    @Selector("JPEGRepresentationOfImage:colorSpace:options:")
    public native NSData JPEGRepresentationOfImageColorSpaceOptions(CIImage image, CGColorSpaceRef colorSpace,
            NSDictionary<String, ?> options);

    /**
     * Render a CIImage to TIFF data. Image must have a finite non-empty extent.
     * The CGColorSpace must be kCGColorSpaceModelRGB or kCGColorSpaceModelMonochrome
     * and must match the specified CIFormat.
     * No options keys are supported at this time.
     */
    @Generated
    @Selector("TIFFRepresentationOfImage:format:colorSpace:options:")
    public native NSData TIFFRepresentationOfImageFormatColorSpaceOptions(CIImage image, int format,
            CGColorSpaceRef colorSpace, NSDictionary<String, ?> options);

    /**
     * Frees any cached data (such as temporary images) associated with the
     * context. This also runs the garbage collector.
     */
    @Generated
    @Selector("clearCaches")
    public native void clearCaches();

    /**
     * Render the region 'fromRect' of image 'image' into a temporary buffer using
     * the context, then create and return a new CoreGraphics image with
     * the results. The caller is responsible for releasing the returned image.
     * The return value will be null if size is empty or too big.
     */
    @Generated
    @Selector("createCGImage:fromRect:")
    public native CGImageRef createCGImageFromRect(CIImage image, @ByValue CGRect fromRect);

    /**
     * Create a new CGImage from the specified subrect of the image. If
     * non-nil the new image will be created in the specified format and colorspace.
     * The CGColorSpace must be kCGColorSpaceModelRGB or kCGColorSpaceModelMonochrome
     * and must match the specified CIFormat.
     * This will return null if fromRect is empty or infinite or the format isn't supported.
     */
    @Generated
    @Selector("createCGImage:fromRect:format:colorSpace:")
    public native CGImageRef createCGImageFromRectFormatColorSpace(CIImage image, @ByValue CGRect fromRect, int format,
            CGColorSpaceRef colorSpace);

    /**
     * Create a new CGImage from the specified subrect of the image.
     * The new CGImageRef will be created in the specified format and colorspace.
     * The return value will be null if fromRect is empty or infinite.
     * The CGColorSpace must be kCGColorSpaceModelRGB or kCGColorSpaceModelMonochrome
     * and must match the specified CIFormat.
     * This will return null if fromRect is empty or infinite or the format isn't supported.
     * If deferred is NO, then the CIImage will be rendered once when this method is called.
     * If deferred is YES, then the CIImage will be rendered whenever the CGImage is rendered.
     */
    @Generated
    @Selector("createCGImage:fromRect:format:colorSpace:deferred:")
    public native CGImageRef createCGImageFromRectFormatColorSpaceDeferred(CIImage image, @ByValue CGRect fromRect,
            int format, CGColorSpaceRef colorSpace, boolean deferred);

    /**
     * DEPRECATED, please use drawImage:inRect:fromRect: instead.
     * Render the subregion 'fromRect' of 'image' to point 'atPoint' in the context's destination.
     */
    @Generated
    @Deprecated
    @Selector("drawImage:atPoint:fromRect:")
    public native void drawImageAtPointFromRect(CIImage image, @ByValue CGPoint atPoint, @ByValue CGRect fromRect);

    /**
     * Render the rectangle 'fromRect' of 'image' to the rectangle 'inRect' in the
     * context's destination.
     */
    @Generated
    @Selector("drawImage:inRect:fromRect:")
    public native void drawImageInRectFromRect(CIImage image, @ByValue CGRect inRect, @ByValue CGRect fromRect);

    @Generated
    @Selector("init")
    public native CIContext init();

    @Generated
    @Selector("initWithOptions:")
    public native CIContext initWithOptions(NSDictionary<String, ?> options);

    /**
     * Returns the maximum dimension for input images that can be processed
     * on the context.
     */
    @Generated
    @Selector("inputImageMaximumSize")
    @ByValue
    public native CGSize inputImageMaximumSize();

    /**
     * Returns the maximum dimension for image that can be rendered
     * on the context.
     */
    @Generated
    @Selector("outputImageMaximumSize")
    @ByValue
    public native CGSize outputImageMaximumSize();

    /**
     * Render 'image' to the given bitmap.
     * The 'data' parameter must point to at least rowBytes*floor(bounds.size.height) bytes.
     * The 'bounds' parameter has the following behavior:
     * The 'bounds' parameter acts to specify the region of 'image' to render.
     * This region (regardless of its origin) is rendered at upper-left corner of 'data'.
     * Passing a 'colorSpace' value of null means:
     * Disable output color management if app is linked against iOS SDK
     * Disable output color management if app is linked against OSX 10.11 SDK or later
     * Match to context's output color space if app is linked against OSX 10.10 SDK or earlier
     */
    @Generated
    @Selector("render:toBitmap:rowBytes:bounds:format:colorSpace:")
    public native void renderToBitmapRowBytesBoundsFormatColorSpace(CIImage image, VoidPtr data, @NInt long rowBytes,
            @ByValue CGRect bounds, int format, CGColorSpaceRef colorSpace);

    /**
     * Render 'image' into the given CVPixelBuffer.
     * In OS X 10.11.3 and iOS 9.3 and later
     * CI will color match to the colorspace of the buffer.
     * otherwise
     * CI will color match to the context's output colorspace.
     */
    @Generated
    @Selector("render:toCVPixelBuffer:")
    public native void renderToCVPixelBuffer(CIImage image, CVBufferRef buffer);

    /**
     * Render 'image' to the given CVPixelBufferRef.
     * The 'bounds' parameter has the following behavior:
     * In OS X and iOS 9 and later:  The 'image' is rendered into 'buffer' so that
     * point (0,0) of 'image' aligns to the lower left corner of 'buffer'.
     * The 'bounds' acts like a clip rect to limit what region of 'buffer' is modified.
     * In iOS 8 and earlier: The 'bounds' parameter acts to specify the region of 'image' to render.
     * This region (regardless of its origin) is rendered at upper-left corner of 'buffer'.
     * If 'colorSpace' is nil, CI will not color match to the destination.
     */
    @Generated
    @Selector("render:toCVPixelBuffer:bounds:colorSpace:")
    public native void renderToCVPixelBufferBoundsColorSpace(CIImage image, CVBufferRef buffer, @ByValue CGRect bounds,
            CGColorSpaceRef colorSpace);

    /**
     * Render 'bounds' of 'image' to a Metal texture, optionally specifying what command buffer to use.
     * Texture type must be MTLTexture2D.
     * NOTE: Rendering to a texture initialized with a commandBuffer requires encoding all the commands to render an image into the specified buffer.
     * This may impact system responsiveness and may result in higher memory usage if the image requires many passes to render.
     * To avoid this impact, it is recommended to create a context using [CIContext contextWithMTLCommandQueue:].
     */
    @Generated
    @Selector("render:toMTLTexture:commandBuffer:bounds:colorSpace:")
    public native void renderToMTLTextureCommandBufferBoundsColorSpace(CIImage image,
            @Mapped(ObjCObjectMapper.class) MTLTexture texture,
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @ByValue CGRect bounds,
            CGColorSpaceRef colorSpace);

    /**
     * The working color space of the CIContext
     * The property will be null if the context was created with color management disabled.
     */
    @Generated
    @Selector("workingColorSpace")
    public native CGColorSpaceRef workingColorSpace();

    /**
     * The working pixel format of the CIContext used for intermediate buffers
     */
    @Generated
    @Selector("workingFormat")
    public native int workingFormat();

    /**
     * Render a CIImage to JPEG file. Image must have a finite non-empty extent.
     * The CGColorSpace must be kCGColorSpaceModelRGB or kCGColorSpaceModelMonochrome.
     * Supported options keys are kCGImageDestinationLossyCompressionQuality,
     * and the depth, disparity, and matte options.
     */
    @Generated
    @Selector("writeJPEGRepresentationOfImage:toURL:colorSpace:options:error:")
    public native boolean writeJPEGRepresentationOfImageToURLColorSpaceOptionsError(CIImage image, NSURL url,
            CGColorSpaceRef colorSpace, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    /**
     * Render a CIImage to TIFF file. Image must have a finite non-empty extent.
     * The CGColorSpace must be kCGColorSpaceModelRGB or kCGColorSpaceModelMonochrome
     * and must match the specified CIFormat.
     * No options keys are supported at this time.
     */
    @Generated
    @Selector("writeTIFFRepresentationOfImage:toURL:format:colorSpace:options:error:")
    public native boolean writeTIFFRepresentationOfImageToURLFormatColorSpaceOptionsError(CIImage image, NSURL url,
            int format, CGColorSpaceRef colorSpace, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    /**
     * Render a CIImage to HEIF data. Image must have a finite non-empty extent.
     * The CGColorSpace must be kCGColorSpaceModelRGB or kCGColorSpaceModelMonochrome
     * and must match the specified CIFormat.
     * Supported options keys are kCGImageDestinationLossyCompressionQuality,
     * and the depth, disparity, and matte options.
     */
    @Generated
    @Selector("HEIFRepresentationOfImage:format:colorSpace:options:")
    public native NSData HEIFRepresentationOfImageFormatColorSpaceOptions(CIImage image, int format,
            CGColorSpaceRef colorSpace, NSDictionary<String, ?> options);

    /**
     * Render a CIImage to PNG data. Image must have a finite non-empty extent.
     * The CGColorSpace must be kCGColorSpaceModelRGB or kCGColorSpaceModelMonochrome
     * and must match the specified CIFormat.
     * No options keys are supported at this time.
     */
    @Generated
    @Selector("PNGRepresentationOfImage:format:colorSpace:options:")
    public native NSData PNGRepresentationOfImageFormatColorSpaceOptions(CIImage image, int format,
            CGColorSpaceRef colorSpace, NSDictionary<String, ?> options);

    /**
     * This is an optional call which can be used to "warm up" a CIContext so that
     * a subsequent call to render with the same arguments can be more efficient.
     * By making this call, Core Image will ensure that
     * - any needed kernels will be compiled
     * - any intermedate buffers are allocated and marked volatile
     */
    @Generated
    @Selector("prepareRender:fromRect:toDestination:atPoint:error:")
    public native boolean prepareRenderFromRectToDestinationAtPointError(CIImage image, @ByValue CGRect fromRect,
            CIRenderDestination destination, @ByValue CGPoint atPoint,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Render 'image' to the given IOSurface.
     * The 'bounds' parameter has the following behavior:
     * The 'image' is rendered into 'surface' so that
     * point (0,0) of 'image' aligns to the lower left corner of 'surface'.
     * The 'bounds' acts like a clip rect to limit what region of 'surface' is modified.
     */
    @Generated
    @Selector("render:toIOSurface:bounds:colorSpace:")
    public native void renderToIOSurfaceBoundsColorSpace(CIImage image, IOSurfaceRef surface, @ByValue CGRect bounds,
            CGColorSpaceRef colorSpace);

    /**
     * Fill the entire destination with black (0,0,0,1) if its alphaMode is None
     * or clear (0,0,0,0) if its alphaMode is Premultiplied or Unpremultiplied.
     */
    @Generated
    @Selector("startTaskToClear:error:")
    public native CIRenderTask startTaskToClearError(CIRenderDestination destination,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Renders a portion of image to a point of destination
     * It renders as if 'image' is cropped to 'fromRect'
     * and the origin of the result is placed at 'atPoint'
     * <p>
     * If image.extent and fromRect are infinite, then it renders
     * so that point (0,0) of image is placed at 'atPoint'
     * <p>
     * MTLTexture-backed CIRenderDestinations are only supported by MTLTexture-backed CIContexts.
     * GLTexture-backed CIRenderDestinations are only supported by GLContext-backed CIContexts.
     * <p>
     * For contexts that are initialized with a command queue, this call will return as soon as all the work for the render is enqueued on the
     * context's device.
     * Otherwise, it will return as soon as all the work is scheduled.
     * <p>
     * In many situations, after issuing a render, the client can use the destination
     * or its backing object without waiting for the enqueued work to complete.
     * For example, after rendering a surface CIRenderDestination, the surface can be passed
     * on for further processing by the GPU.
     * <p>
     * In other situations, the client may need to wait for the render to be complete.
     * For example, after rendering a surface CIRenderDestination, the surface can be accessed
     * by CPU code by calling IOSurfaceGetBytePointer only after the render is completed.
     * <p>
     * In this case the client can use the returned CIRenderTask like this:
     * CIRenderTask* task = [context render:...];
     * [task waitUntilCompletedAndReturnError:&error];
     */
    @Generated
    @Selector("startTaskToRender:fromRect:toDestination:atPoint:error:")
    public native CIRenderTask startTaskToRenderFromRectToDestinationAtPointError(CIImage image,
            @ByValue CGRect fromRect, CIRenderDestination destination, @ByValue CGPoint atPoint,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Renders an image to a destination so that point (0,0) of image.
     * is placed at point (0,0) of the destination.
     */
    @Generated
    @Selector("startTaskToRender:toDestination:error:")
    public native CIRenderTask startTaskToRenderToDestinationError(CIImage image, CIRenderDestination destination,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Render a CIImage to HEIF file. Image must have a finite non-empty extent.
     * The CGColorSpace must be kCGColorSpaceModelRGB or kCGColorSpaceModelMonochrome
     * and must match the specified CIFormat.
     * Supported options keys are kCGImageDestinationLossyCompressionQuality,
     * and the depth, disparity, and matte options.
     */
    @Generated
    @Selector("writeHEIFRepresentationOfImage:toURL:format:colorSpace:options:error:")
    public native boolean writeHEIFRepresentationOfImageToURLFormatColorSpaceOptionsError(CIImage image, NSURL url,
            int format, CGColorSpaceRef colorSpace, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    /**
     * Render a CIImage to PNG file. Image must have a finite non-empty extent.
     * The CGColorSpace must be kCGColorSpaceModelRGB or kCGColorSpaceModelMonochrome
     * and must match the specified CIFormat.
     * No options keys are supported at this time.
     */
    @Generated
    @Selector("writePNGRepresentationOfImage:toURL:format:colorSpace:options:error:")
    public native boolean writePNGRepresentationOfImageToURLFormatColorSpaceOptionsError(CIImage image, NSURL url,
            int format, CGColorSpaceRef colorSpace, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    /**
     * Create a CIContext that commits commands to a specific queue.
     */
    @Generated
    @Selector("contextWithMTLCommandQueue:")
    public static native CIContext contextWithMTLCommandQueue(
            @Mapped(ObjCObjectMapper.class) MTLCommandQueue commandQueue);

    @Generated
    @Selector("contextWithMTLCommandQueue:options:")
    public static native CIContext contextWithMTLCommandQueueOptions(
            @Mapped(ObjCObjectMapper.class) MTLCommandQueue commandQueue, NSDictionary<String, ?> options);

    @Generated
    @Selector("depthBlurEffectFilterForImage:disparityImage:portraitEffectsMatte:hairSemanticSegmentation:orientation:options:")
    public native CIFilter depthBlurEffectFilterForImageDisparityImagePortraitEffectsMatteHairSemanticSegmentationOrientationOptions(
            CIImage image, CIImage disparityImage, CIImage portraitEffectsMatte, CIImage hairSemanticSegmentation,
            int orientation, NSDictionary<?, ?> options);

    /**
     * Create and CIFilter instance for 'image' that can be used to apply the CIDepthBlurEffect.
     * <p>
     * The receiver context is user to render the image in order to get the facial landmarks
     * <p>
     * The 'orientation' parameter should be CGImagePropertyOrientation enum value
     * as defined in the TIFF spec.
     * <p>
     * The 'options' parameter is a key value/pair reserved for future use.
     */
    @Generated
    @Selector("depthBlurEffectFilterForImage:disparityImage:portraitEffectsMatte:orientation:options:")
    public native CIFilter depthBlurEffectFilterForImageDisparityImagePortraitEffectsMatteOrientationOptions(
            CIImage image, CIImage disparityImage, CIImage portraitEffectsMatte, int orientation,
            NSDictionary<?, ?> options);

    /**
     * This is the same as the method above expect it uses NSData to instantiate the image data
     * instead of the contents of a NSURL.
     */
    @Generated
    @Selector("depthBlurEffectFilterForImageData:options:")
    public native CIFilter depthBlurEffectFilterForImageDataOptions(NSData data, NSDictionary<?, ?> options);

    /**
     * Create and CIFilter instance for 'image' that can be used to apply the CIDepthBlurEffect.
     * <p>
     * The receiver context is user to render the image in order to get the facial landmarks
     * <p>
     * The 'options' parameter is a key value/pair reserved for future use.
     */
    @Generated
    @Selector("depthBlurEffectFilterForImageURL:options:")
    public native CIFilter depthBlurEffectFilterForImageURLOptions(NSURL url, NSDictionary<?, ?> options);

    @Generated
    @Selector("depthBlurEffectFilterForImage:disparityImage:portraitEffectsMatte:hairSemanticSegmentation:glassesMatte:gainMap:orientation:options:")
    public native CIFilter depthBlurEffectFilterForImageDisparityImagePortraitEffectsMatteHairSemanticSegmentationGlassesMatteGainMapOrientationOptions(
            CIImage image, CIImage disparityImage, CIImage portraitEffectsMatte, CIImage hairSemanticSegmentation,
            CIImage glassesMatte, CIImage gainMap, int orientation, NSDictionary<?, ?> options);

    /**
     * Render a CIImage to HEIF data. Image must have a finite non-empty extent.
     * The CGColorSpace must be kCGColorSpaceModelRGB or kCGColorSpaceModelMonochrome.
     * Supported options keys are kCGImageDestinationLossyCompressionQuality,
     * and the depth, disparity, and matte options.
     */
    @Generated
    @Selector("HEIF10RepresentationOfImage:colorSpace:options:error:")
    public native NSData HEIF10RepresentationOfImageColorSpaceOptionsError(CIImage image, CGColorSpaceRef colorSpace,
            NSDictionary<String, ?> options, @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    /**
     * Render a CIImage to 10-bit deep HEIF file. Image must have a finite non-empty extent.
     * The CGColorSpace must be kCGColorSpaceModelRGB or kCGColorSpaceModelMonochrome.
     * Supported options keys are kCGImageDestinationLossyCompressionQuality,
     * and the depth, disparity, and matte options.
     */
    @Generated
    @Selector("writeHEIF10RepresentationOfImage:toURL:colorSpace:options:error:")
    public native boolean writeHEIF10RepresentationOfImageToURLColorSpaceOptionsError(CIImage image, NSURL url,
            CGColorSpaceRef colorSpace, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);
}
