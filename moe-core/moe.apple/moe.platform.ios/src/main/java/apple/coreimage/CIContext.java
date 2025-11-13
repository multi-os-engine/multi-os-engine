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
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The Core Image context class provides an evaluation context for Core Image processing with Metal, OpenGL, or OpenCL.
 * 
 * You use a `CIContext` instance to render a ``CIImage`` instance which represents a graph of image processing
 * operations
 * which are built using other Core Image classes, such as ``CIFilter-class``, ``CIKernel``, ``CIColor`` and
 * ``CIImage``.
 * You can also use a `CIContext` with the ``CIDetector`` class to analyze images — for example, to detect faces
 * or barcodes.
 * 
 * Contexts support automatic color management by performing all processing operations in a working color space.
 * This means that unless told otherwise:
 * * All input images are color matched from the input's color space to the working space.
 * * All renders are color matched from the working space to the destination space.
 * (For more information on `CGColorSpace` see <doc://com.apple.documentation/documentation/coregraphics/cgcolorspace>)
 * 
 * `CIContext` and ``CIImage`` instances are immutable, so multiple threads can use the same ``CIContext`` instance
 * to render ``CIImage`` instances. However, ``CIFilter-class`` instances are mutable and thus cannot be shared safely
 * among
 * threads. Each thread must take case not to access or modify a ``CIFilter-class`` instance while it is being used by
 * another thread.
 * 
 * The `CIContext` manages various internal state such as `MTLCommandQueue` and caches for compiled kernels
 * and intermediate buffers. For this reason it is not recommended to create many `CIContext` instances. As a rule,
 * it recommended that you create one `CIContext` instance for each view that renders ``CIImage`` or each background
 * task.
 */
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

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("context")
    public static native CIContext context();

    /**
     * Create a context specifying a destination CGContext.
     * 
     * Core Image will use an internal destination context when methods such
     * as [context render:to...] or [context createCGImage:...] are called.
     * 
     * The [context drawImage:...] render methods will render to the CGContext.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("contextWithCGContext:options:")
    public static native CIContext contextWithCGContextOptions(@NotNull CGContextRef cgctx,
            @Nullable NSDictionary<String, ?> options);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: Core Image OpenGLES API deprecated. (Define CI_SILENCE_GL_DEPRECATION to silence these
     * warnings)
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("contextWithEAGLContext:")
    public static native CIContext contextWithEAGLContext(@NotNull EAGLContext eaglContext);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: Core Image OpenGLES API deprecated. (Define CI_SILENCE_GL_DEPRECATION to silence these
     * warnings)
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("contextWithEAGLContext:options:")
    public static native CIContext contextWithEAGLContextOptions(@NotNull EAGLContext eaglContext,
            @Nullable NSDictionary<String, ?> options);

    /**
     * If a system has more than one MTLDevice, then you can create a CIContext
     * that uses a specific device. If a client wishes to use the default MTLDevice
     * then call [CIContext contextWithOptions:] instead.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("contextWithMTLDevice:")
    public static native CIContext contextWithMTLDevice(@NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device);

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("contextWithMTLDevice:options:")
    public static native CIContext contextWithMTLDeviceOptions(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @Nullable NSDictionary<String, ?> options);

    /**
     * Create a context without specifying a destination CG/GL/Metal context.
     * 
     * Core Image will use an internal destination context when methods such
     * as [context render:to...] or [context createCGImage:...] are called.
     * 
     * The [context drawImage:...] render methods will not operate on this type
     * of context.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("contextWithOptions:")
    public static native CIContext contextWithOptions(@Nullable NSDictionary<String, ?> options);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

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
     * kCGImageDestinationEmbedThumbnail, and the depth, disparity, and matte options.
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("JPEGRepresentationOfImage:colorSpace:options:")
    public native NSData JPEGRepresentationOfImageColorSpaceOptions(@NotNull CIImage image,
            @NotNull CGColorSpaceRef colorSpace, @NotNull NSDictionary<String, ?> options);

    /**
     * Render a CIImage to TIFF data. Image must have a finite non-empty extent.
     * The CGColorSpace must be kCGColorSpaceModelRGB or kCGColorSpaceModelMonochrome
     * and must match the specified CIFormat.
     * No options keys are supported at this time.
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("TIFFRepresentationOfImage:format:colorSpace:options:")
    public native NSData TIFFRepresentationOfImageFormatColorSpaceOptions(@NotNull CIImage image, int format,
            @NotNull CGColorSpaceRef colorSpace, @NotNull NSDictionary<String, ?> options);

    /**
     * Frees any cached data (such as temporary images) associated with the
     * context. This also runs the garbage collector.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("clearCaches")
    public native void clearCaches();

    /**
     * Creates a Core Graphics image from a region of a Core Image image instance.
     * 
     * The color space of the created `CGImage` will be sRGB unless the receiving ``CIContext``
     * was created with a `kCIContextOutputColorSpace` option.
     * 
     * Normally the pixel format of the created CGImage will be 8 bits-per-component.
     * It will be 16 bits-per-component float if the above color space is HDR.
     * 
     * - Parameters:
     * - image: A ``CIImage`` image instance for which to create a `CGImage`.
     * - fromRect: The `CGRect` region of the `image` to use.
     * This region relative to the cartesean coordinate system of `image`.
     * This region will be intersected with integralized and intersected with `image.extent`.
     * 
     * - Returns:
     * Returns a new `CGImage` instance.
     * You are responsible for releasing the returned image when you no longer need it.
     * The returned value will be `null` if the extent is empty or too big.
     */
    @Nullable
    @Generated
    @Selector("createCGImage:fromRect:")
    public native CGImageRef createCGImageFromRect(@NotNull CIImage image, @ByValue CGRect fromRect);

    /**
     * Creates a Core Graphics image from a region of a Core Image image instance
     * with an option for controlling the pixel format and color space of the `CGImage`.
     * 
     * - Parameters:
     * - image: A ``CIImage`` image instance for which to create a `CGImage`.
     * - fromRect: The `CGRect` region of the `image` to use.
     * This region relative to the cartesean coordinate system of `image`.
     * This region will be intersected with integralized and intersected with `image.extent`.
     * - format: A ``CIFormat`` to specify the pixel format of the created `CGImage`.
     * For example, if `kCIFormatRGBX16` is specified, then the created `CGImage` will
     * be 16 bits-per-component and opaque.
     * - colorSpace: The `CGColorSpace` for the output image.
     * This color space must have either `CGColorSpaceModel.rgb` or `CGColorSpaceModel.monochrome`
     * and be compatible with the specified pixel format.
     * 
     * - Returns:
     * Returns a new `CGImage` instance.
     * You are responsible for releasing the returned image when you no longer need it.
     * The returned value will be `null` if the extent is empty or too big.
     */
    @Nullable
    @Generated
    @Selector("createCGImage:fromRect:format:colorSpace:")
    public native CGImageRef createCGImageFromRectFormatColorSpace(@NotNull CIImage image, @ByValue CGRect fromRect,
            int format, @Nullable CGColorSpaceRef colorSpace);

    /**
     * Creates a Core Graphics image from a region of a Core Image image instance
     * with an option for controlling when the image is rendered.
     * 
     * - Parameters:
     * - image: A ``CIImage`` image instance for which to create a `CGImage`.
     * - fromRect: The `CGRect` region of the `image` to use.
     * This region relative to the cartesean coordinate system of `image`.
     * This region will be intersected with integralized and intersected with `image.extent`.
     * - format: A ``CIFormat`` to specify the pixel format of the created `CGImage`.
     * For example, if `kCIFormatRGBX16` is specified, then the created `CGImage` will
     * be 16 bits-per-component and opaque.
     * - colorSpace: The `CGColorSpace` for the output image.
     * This color space must have either `CGColorSpaceModel.rgb` or `CGColorSpaceModel.monochrome`
     * and be compatible with the specified pixel format.
     * - deferred: Controls when Core Image renders `image`.
     * * True: rendering of `image` is deferred until the created `CGImage` rendered.
     * * False: the `image` is rendered immediately.
     * 
     * - Returns:
     * Returns a new `CGImage` instance.
     * You are responsible for releasing the returned image when you no longer need it.
     * The returned value will be `null` if the extent is empty or too big.
     * 
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("createCGImage:fromRect:format:colorSpace:deferred:")
    public native CGImageRef createCGImageFromRectFormatColorSpaceDeferred(@NotNull CIImage image,
            @ByValue CGRect fromRect, int format, @Nullable CGColorSpaceRef colorSpace, boolean deferred);

    /**
     * DEPRECATED, please use drawImage:inRect:fromRect: instead.
     * Render the subregion 'fromRect' of 'image' to point 'atPoint' in the context's destination.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 6.0
     */
    @Generated
    @Deprecated
    @Selector("drawImage:atPoint:fromRect:")
    public native void drawImageAtPointFromRect(@NotNull CIImage image, @ByValue CGPoint atPoint,
            @ByValue CGRect fromRect);

    /**
     * Render the rectangle 'fromRect' of 'image' to the rectangle 'inRect' in the
     * context's destination.
     */
    @Generated
    @Selector("drawImage:inRect:fromRect:")
    public native void drawImageInRectFromRect(@NotNull CIImage image, @ByValue CGRect inRect,
            @ByValue CGRect fromRect);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("init")
    public native CIContext init();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("initWithOptions:")
    public native CIContext initWithOptions(@Nullable NSDictionary<String, ?> options);

    /**
     * Returns the maximum dimension for input images that can be processed
     * on the context.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("inputImageMaximumSize")
    @ByValue
    public native CGSize inputImageMaximumSize();

    /**
     * Returns the maximum dimension for image that can be rendered
     * on the context.
     * 
     * API-Since: 5.0
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
    public native void renderToBitmapRowBytesBoundsFormatColorSpace(@NotNull CIImage image, @NotNull VoidPtr data,
            @NInt long rowBytes, @ByValue CGRect bounds, int format, @Nullable CGColorSpaceRef colorSpace);

    /**
     * Render 'image' into the given CVPixelBuffer.
     * In OS X 10.11.3 and iOS 9.3 and later
     * CI will color match to the colorspace of the buffer.
     * otherwise
     * CI will color match to the context's output colorspace.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("render:toCVPixelBuffer:")
    public native void renderToCVPixelBuffer(@NotNull CIImage image, @NotNull CVBufferRef buffer);

    /**
     * Render 'image' to the given CVPixelBufferRef.
     * Point (0,0) in the image coordinate system will align to the lower left corner of 'buffer'.
     * The 'bounds' parameter acts as a clip rect to limit what region of 'buffer' is modified.
     * If 'colorSpace' is nil, CI will not color match to the destination.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("render:toCVPixelBuffer:bounds:colorSpace:")
    public native void renderToCVPixelBufferBoundsColorSpace(@NotNull CIImage image, @NotNull CVBufferRef buffer,
            @ByValue CGRect bounds, @Nullable CGColorSpaceRef colorSpace);

    /**
     * Render 'bounds' of 'image' to a Metal texture, optionally specifying what command buffer to use.
     * Texture type must be MTLTexture2D.
     * NOTE: Rendering to a texture initialized with a commandBuffer requires encoding all the commands to render an
     * image into the specified buffer.
     * This may impact system responsiveness and may result in higher memory usage if the image requires many passes to
     * render.
     * To avoid this impact, it is recommended to create a context using [CIContext contextWithMTLCommandQueue:].
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("render:toMTLTexture:commandBuffer:bounds:colorSpace:")
    public native void renderToMTLTextureCommandBufferBoundsColorSpace(@NotNull CIImage image,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture texture,
            @Nullable @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @ByValue CGRect bounds,
            @NotNull CGColorSpaceRef colorSpace);

    /**
     * The working color space of the CIContext.
     * 
     * The working color space determines the color space used when executing filter kernels.
     * You specify a working color space using the ``kCIContextWorkingColorSpace`` option when creating a ``CIContext``.
     * * All input images are color matched from the input's color space to the working space.
     * * All renders are color matched from the working space to the destination space.
     * 
     * The property will be `null` if the context was created with color management disabled.
     * 
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("workingColorSpace")
    public native CGColorSpaceRef workingColorSpace();

    /**
     * The working pixel format that the CIContext uses for intermediate buffers.
     * 
     * The working format determines the pixel format that Core Image uses to create intermediate buffers for rendering
     * images.
     * You specify a working pixel format using the ``kCIContextWorkingFormat`` option when creating a ``CIContext``.
     * 
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("workingFormat")
    public native int workingFormat();

    /**
     * Render a CIImage to JPEG file. Image must have a finite non-empty extent.
     * The CGColorSpace must be kCGColorSpaceModelRGB or kCGColorSpaceModelMonochrome.
     * Supported options keys are kCGImageDestinationLossyCompressionQuality,
     * kCGImageDestinationEmbedThumbnail, and the depth, disparity, and matte options.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("writeJPEGRepresentationOfImage:toURL:colorSpace:options:error:")
    public native boolean writeJPEGRepresentationOfImageToURLColorSpaceOptionsError(@NotNull CIImage image,
            @NotNull NSURL url, @NotNull CGColorSpaceRef colorSpace, @NotNull NSDictionary<String, ?> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    /**
     * Render a CIImage to TIFF file. Image must have a finite non-empty extent.
     * The CGColorSpace must be kCGColorSpaceModelRGB or kCGColorSpaceModelMonochrome
     * and must match the specified CIFormat.
     * No options keys are supported at this time.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("writeTIFFRepresentationOfImage:toURL:format:colorSpace:options:error:")
    public native boolean writeTIFFRepresentationOfImageToURLFormatColorSpaceOptionsError(@NotNull CIImage image,
            @NotNull NSURL url, int format, @NotNull CGColorSpaceRef colorSpace,
            @NotNull NSDictionary<String, ?> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    /**
     * Render a CIImage to HEIF data. Image must have a finite non-empty extent.
     * The CGColorSpace must be kCGColorSpaceModelRGB or kCGColorSpaceModelMonochrome
     * and must match the specified CIFormat.
     * Supported options keys are kCGImageDestinationLossyCompressionQuality,
     * kCGImageDestinationEmbedThumbnail,and the depth, disparity, and matte options.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("HEIFRepresentationOfImage:format:colorSpace:options:")
    public native NSData HEIFRepresentationOfImageFormatColorSpaceOptions(@NotNull CIImage image, int format,
            @NotNull CGColorSpaceRef colorSpace, @NotNull NSDictionary<String, ?> options);

    /**
     * Render a CIImage to PNG data. Image must have a finite non-empty extent.
     * The CGColorSpace must be kCGColorSpaceModelRGB or kCGColorSpaceModelMonochrome
     * and must match the specified CIFormat.
     * No options keys are supported at this time.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("PNGRepresentationOfImage:format:colorSpace:options:")
    public native NSData PNGRepresentationOfImageFormatColorSpaceOptions(@NotNull CIImage image, int format,
            @NotNull CGColorSpaceRef colorSpace, @NotNull NSDictionary<String, ?> options);

    /**
     * This is an optional call which can be used to "warm up" a CIContext so that
     * a subsequent call to render with the same arguments can be more efficient.
     * By making this call, Core Image will ensure that
     * - any needed kernels will be compiled
     * - any intermedate buffers are allocated and marked volatile
     * 
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("prepareRender:fromRect:toDestination:atPoint:error:")
    public native boolean prepareRenderFromRectToDestinationAtPointError(@NotNull CIImage image,
            @ByValue CGRect fromRect, @NotNull CIRenderDestination destination, @ByValue CGPoint atPoint,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Render 'image' to the given IOSurface.
     * Point (0,0) in the image coordinate system will align to the lower left corner of 'surface'.
     * The 'bounds' parameter acts as a clip rect to limit what region of 'surface' is modified.
     * If 'colorSpace' is nil, CI will not color match to the destination.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("render:toIOSurface:bounds:colorSpace:")
    public native void renderToIOSurfaceBoundsColorSpace(@NotNull CIImage image, @NotNull IOSurfaceRef surface,
            @ByValue CGRect bounds, @Nullable CGColorSpaceRef colorSpace);

    /**
     * Fill the entire destination with black (0,0,0,1) if its alphaMode is None
     * or clear (0,0,0,0) if its alphaMode is Premultiplied or Unpremultiplied.
     * 
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("startTaskToClear:error:")
    public native CIRenderTask startTaskToClearError(@NotNull CIRenderDestination destination,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Renders a portion of image to a point of destination
     * It renders as if 'image' is cropped to 'fromRect'
     * and the origin of the result is placed at 'atPoint'
     * 
     * If image.extent and fromRect are infinite, then it renders
     * so that point (0,0) of image is placed at 'atPoint'
     * 
     * MTLTexture-backed CIRenderDestinations are only supported by MTLTexture-backed CIContexts.
     * GLTexture-backed CIRenderDestinations are only supported by GLContext-backed CIContexts.
     * 
     * For contexts that are initialized with a command queue, this call will return as soon as all the work for the
     * render is enqueued on the
     * context's device.
     * Otherwise, it will return as soon as all the work is scheduled.
     * 
     * In many situations, after issuing a render, the client can use the destination
     * or its backing object without waiting for the enqueued work to complete.
     * For example, after rendering a surface CIRenderDestination, the surface can be passed
     * on for further processing by the GPU.
     * 
     * In other situations, the client may need to wait for the render to be complete.
     * For example, after rendering a surface CIRenderDestination, the surface can be accessed
     * by CPU code by calling IOSurfaceGetBytePointer only after the render is completed.
     * 
     * In this case the client can use the returned CIRenderTask like this:
     * CIRenderTask* task = [context render:...];
     * [task waitUntilCompletedAndReturnError:&error];
     * 
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("startTaskToRender:fromRect:toDestination:atPoint:error:")
    public native CIRenderTask startTaskToRenderFromRectToDestinationAtPointError(@NotNull CIImage image,
            @ByValue CGRect fromRect, @NotNull CIRenderDestination destination, @ByValue CGPoint atPoint,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Renders an image to a destination so that point (0,0) of image.
     * is placed at point (0,0) of the destination.
     * 
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("startTaskToRender:toDestination:error:")
    public native CIRenderTask startTaskToRenderToDestinationError(@NotNull CIImage image,
            @NotNull CIRenderDestination destination,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Render a CIImage to HEIF file. Image must have a finite non-empty extent.
     * The CGColorSpace must be kCGColorSpaceModelRGB or kCGColorSpaceModelMonochrome
     * and must match the specified CIFormat.
     * Supported options keys are kCGImageDestinationLossyCompressionQuality,
     * kCGImageDestinationEmbedThumbnail, and the depth, disparity, and matte options.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("writeHEIFRepresentationOfImage:toURL:format:colorSpace:options:error:")
    public native boolean writeHEIFRepresentationOfImageToURLFormatColorSpaceOptionsError(@NotNull CIImage image,
            @NotNull NSURL url, int format, @NotNull CGColorSpaceRef colorSpace,
            @NotNull NSDictionary<String, ?> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    /**
     * Render a CIImage to PNG file. Image must have a finite non-empty extent.
     * The CGColorSpace must be kCGColorSpaceModelRGB or kCGColorSpaceModelMonochrome
     * and must match the specified CIFormat.
     * No options keys are supported at this time.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("writePNGRepresentationOfImage:toURL:format:colorSpace:options:error:")
    public native boolean writePNGRepresentationOfImageToURLFormatColorSpaceOptionsError(@NotNull CIImage image,
            @NotNull NSURL url, int format, @NotNull CGColorSpaceRef colorSpace,
            @NotNull NSDictionary<String, ?> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    /**
     * Create a CIContext that commits commands to a specific queue.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("contextWithMTLCommandQueue:")
    public static native CIContext contextWithMTLCommandQueue(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandQueue commandQueue);

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("contextWithMTLCommandQueue:options:")
    public static native CIContext contextWithMTLCommandQueueOptions(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandQueue commandQueue,
            @Nullable NSDictionary<String, ?> options);

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("depthBlurEffectFilterForImage:disparityImage:portraitEffectsMatte:hairSemanticSegmentation:orientation:options:")
    public native CIFilter depthBlurEffectFilterForImageDisparityImagePortraitEffectsMatteHairSemanticSegmentationOrientationOptions(
            @NotNull CIImage image, @NotNull CIImage disparityImage, @Nullable CIImage portraitEffectsMatte,
            @Nullable CIImage hairSemanticSegmentation, int orientation, @Nullable NSDictionary<?, ?> options);

    /**
     * Create and CIFilter instance for 'image' that can be used to apply the CIDepthBlurEffect.
     * 
     * The receiver context is user to render the image in order to get the facial landmarks
     * 
     * The 'orientation' parameter should be CGImagePropertyOrientation enum value
     * as defined in the TIFF spec.
     * 
     * The 'options' parameter is a key value/pair reserved for future use.
     * 
     * 
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("depthBlurEffectFilterForImage:disparityImage:portraitEffectsMatte:orientation:options:")
    public native CIFilter depthBlurEffectFilterForImageDisparityImagePortraitEffectsMatteOrientationOptions(
            @NotNull CIImage image, @NotNull CIImage disparityImage, @Nullable CIImage portraitEffectsMatte,
            int orientation, @Nullable NSDictionary<?, ?> options);

    /**
     * This is the same as the method above expect it uses NSData to instantiate the image data
     * instead of the contents of a NSURL.
     * 
     * 
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("depthBlurEffectFilterForImageData:options:")
    public native CIFilter depthBlurEffectFilterForImageDataOptions(@NotNull NSData data,
            @Nullable NSDictionary<?, ?> options);

    /**
     * Create and CIFilter instance for 'image' that can be used to apply the CIDepthBlurEffect.
     * 
     * The receiver context is user to render the image in order to get the facial landmarks
     * 
     * The 'options' parameter is a key value/pair reserved for future use.
     * 
     * 
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("depthBlurEffectFilterForImageURL:options:")
    public native CIFilter depthBlurEffectFilterForImageURLOptions(@NotNull NSURL url,
            @Nullable NSDictionary<?, ?> options);

    /**
     * API-Since: 14.1
     */
    @Nullable
    @Generated
    @Selector("depthBlurEffectFilterForImage:disparityImage:portraitEffectsMatte:hairSemanticSegmentation:glassesMatte:gainMap:orientation:options:")
    public native CIFilter depthBlurEffectFilterForImageDisparityImagePortraitEffectsMatteHairSemanticSegmentationGlassesMatteGainMapOrientationOptions(
            @NotNull CIImage image, @NotNull CIImage disparityImage, @Nullable CIImage portraitEffectsMatte,
            @Nullable CIImage hairSemanticSegmentation, @Nullable CIImage glassesMatte, @Nullable CIImage gainMap,
            int orientation, @Nullable NSDictionary<?, ?> options);

    /**
     * Render a CIImage to HEIF data. Image must have a finite non-empty extent.
     * The CGColorSpace must be kCGColorSpaceModelRGB or kCGColorSpaceModelMonochrome.
     * Supported options keys are kCGImageDestinationLossyCompressionQuality,
     * and the depth, disparity, and matte options.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("HEIF10RepresentationOfImage:colorSpace:options:error:")
    public native NSData HEIF10RepresentationOfImageColorSpaceOptionsError(@NotNull CIImage image,
            @NotNull CGColorSpaceRef colorSpace, @NotNull NSDictionary<String, ?> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    /**
     * Render a CIImage to 10-bit deep HEIF file. Image must have a finite non-empty extent.
     * The CGColorSpace must be kCGColorSpaceModelRGB or kCGColorSpaceModelMonochrome.
     * Supported options keys are kCGImageDestinationLossyCompressionQuality,
     * and the depth, disparity, and matte options.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("writeHEIF10RepresentationOfImage:toURL:colorSpace:options:error:")
    public native boolean writeHEIF10RepresentationOfImageToURLColorSpaceOptionsError(@NotNull CIImage image,
            @NotNull NSURL url, @NotNull CGColorSpaceRef colorSpace, @NotNull NSDictionary<String, ?> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    /**
     * Render a CIImage to OpenEXR data. Image must have a finite non-empty extent.
     * No options keys are supported at this time.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("OpenEXRRepresentationOfImage:options:error:")
    @Nullable
    public native NSData OpenEXRRepresentationOfImageOptionsError(@NotNull CIImage image,
            @NotNull NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> errorPtr);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * Render a CIImage to OpenEXR file. Image must have a finite non-empty extent.
     * No options keys are supported at this time.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("writeOpenEXRRepresentationOfImage:toURL:options:error:")
    public native boolean writeOpenEXRRepresentationOfImageToURLOptionsError(@NotNull CIImage image, @NotNull NSURL url,
            @NotNull NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> errorPtr);

    /**
     * Given a Core Graphics image, use the receiving Core Image context to calculate its
     * HDR statistics (content headroom and content average light level)
     * and then return a new Core Graphics image that has the calculated values.
     * 
     * - Parameters:
     * - cgimage: An immutable `CGImage` for which to calculate statistics.
     * - Returns:
     * Returns a new `CGImage` instance that has the calculated statistics attached.
     * 
     * 
     * API-Since: 19.0
     */
    @Generated
    @Selector("calculateHDRStatsForCGImage:")
    @NotNull
    public native CGImageRef calculateHDRStatsForCGImage(@NotNull CGImageRef cgimage);

    /**
     * Given a CVPixelBuffer, use the receiving Core Image context to calculate its
     * HDR statistics (content headroom and content average light level)
     * and then update the buffers's attachments to store the values.
     * 
     * If the `CVPixelBuffer` has a Clean Aperture rectangle then only pixels within
     * that rectangle are considered.
     * 
     * - Parameters:
     * - buffer: A mutable `CVPixelBuffer` for which to calculate and attach statistics.
     * 
     * 
     * API-Since: 19.0
     */
    @Generated
    @Selector("calculateHDRStatsForCVPixelBuffer:")
    public native void calculateHDRStatsForCVPixelBuffer(@NotNull CVBufferRef buffer);

    /**
     * Given an IOSurface, use the receiving Core Image context to calculate its
     * HDR statistics (content headroom and content average light level)
     * and then update the surface's attachments to store the values.
     * 
     * If the `IOSurface` has a Clean Aperture rectangle then only pixels within
     * that rectangle are considered.
     * 
     * - Parameters:
     * - surface: A mutable `IOSurfaceRef` for which to calculate and attach statistics.
     * 
     * 
     * API-Since: 19.0
     */
    @Generated
    @Selector("calculateHDRStatsForIOSurface:")
    public native void calculateHDRStatsForIOSurface(@NotNull IOSurfaceRef surface);

    /**
     * Given a Core Image image, use the receiving Core Image context to calculate its
     * HDR statistics (content headroom and content average light level)
     * and then return a new Core Image image that has the calculated values.
     * 
     * If the image extent is not finite, then nil will be returned.
     * 
     * - Parameters:
     * - image: An immutable ``CIImage`` for which to calculate statistics.
     * - Returns:
     * Returns a new ``CIImage`` instance that has the calculated statistics attached.
     * 
     * 
     * API-Since: 19.0
     */
    @Generated
    @Selector("calculateHDRStatsForImage:")
    @Nullable
    public native CIImage calculateHDRStatsForImage(@NotNull CIImage image);

    /**
     * Creates a Core Graphics image from a region of a Core Image image instance
     * with an option for calculating HDR statistics.
     * 
     * - Parameters:
     * - image: A ``CIImage`` image instance for which to create a `CGImage`.
     * - fromRect: The `CGRect` region of the `image` to use.
     * This region relative to the cartesean coordinate system of `image`.
     * This region will be intersected with integralized and intersected with `image.extent`.
     * - format: A ``CIFormat`` to specify the pixel format of the created `CGImage`.
     * For example, if `kCIFormatRGBX16` is specified, then the created `CGImage` will
     * be 16 bits-per-component and opaque.
     * - colorSpace: The `CGColorSpace` for the output image.
     * This color space must have either `CGColorSpaceModel.rgb` or `CGColorSpaceModel.monochrome`
     * and be compatible with the specified pixel format.
     * - deferred: Controls when Core Image renders `image`.
     * * True: rendering of `image` is deferred until the created `CGImage` rendered.
     * * False: the `image` is rendered immediately.
     * - calculateHDRStats: Controls if Core Image calculates HDR statistics.
     * * True: Core Image will immediately render `image`, calculate the HDR statistics
     * and create a `CGImage` that has the calculated values.
     * * False: the created `CGImage` will not have any HDR statistics.
     * 
     * - Returns:
     * Returns a new `CGImage` instance.
     * You are responsible for releasing the returned image when you no longer need it.
     * The returned value will be `null` if the extent is empty or too big.
     * 
     * 
     * API-Since: 19.0
     */
    @Generated
    @Selector("createCGImage:fromRect:format:colorSpace:deferred:calculateHDRStats:")
    @Nullable
    public native CGImageRef createCGImageFromRectFormatColorSpaceDeferredCalculateHDRStats(@NotNull CIImage image,
            @ByValue CGRect fromRect, int format, @Nullable CGColorSpaceRef colorSpace, boolean deferred,
            boolean calculateHDRStats);
}
