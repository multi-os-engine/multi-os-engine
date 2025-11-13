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
import apple.coreimage.protocol.CIImageProcessorOutput;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The abstract class you extend to create custom image processors that can integrate with Core Image workflows.
 * 
 * Unlike the ``CIKernel`` class and its other subclasses that allow you to create new image-processing effects
 * with the Core Image Kernel Language, the `CIImageProcessorKernel` class provides direct access to the underlying
 * bitmap image data for a step in the Core Image processing pipeline. As such, you can create subclasses of this
 * class to integrate other image-processing technologies—such as Metal compute shaders, Metal Performance Shaders,
 * Accelerate vImage operations, or your own CPU-based image-processing routines—with a Core Image filter chain.
 * 
 * Your custom image processing operation is invoked by your subclassed image processor kernel's
 * ``processWithInputs:arguments:output:error:`` method. The method can accept zero, one or more `input` objects.
 * Processors that generate imagery (such as a noise or pattern generator) need no inputs, while kernels that
 * composite source images together require multiple inputs. The `arguments` dictionary allows the caller to pass in
 * additional parameter values (such as the radius of a blur) and the `output` contains the destination for your
 * image processing code to write to.
 * 
 * The following code shows how you can subclass `CIImageProcessorKernel` to apply the Metal Performance Shader
 * <doc://com.apple.documentation/documentation/metalperformanceshaders/mpsimagethresholdbinary> kernel to a
 * ``CIImage``:
 * 
 * ```swift
 * class ThresholdImageProcessorKernel: CIImageProcessorKernel {
 * override class func process(with inputs: [CIImageProcessorInput]?, arguments: [String : Any]?, output:
 * CIImageProcessorOutput) throws {
 * guard
 * let commandBuffer = output.metalCommandBuffer,
 * let input = inputs?.first,
 * let sourceTexture = input.metalTexture,
 * let destinationTexture = output.metalTexture,
 * let thresholdValue = arguments?["thresholdValue"] as? Float else {
 * return
 * }
 * 
 * let threshold = MPSImageThresholdBinary(
 * device: commandBuffer.device,
 * thresholdValue: thresholdValue,
 * maximumValue: 1.0,
 * linearGrayColorTransform: nil)
 * 
 * threshold.encode(
 * commandBuffer: commandBuffer,
 * sourceTexture: sourceTexture,
 * destinationTexture: destinationTexture)
 * }
 * }
 * ```
 * 
 * To apply to kernel to an image, the calling side invokes the image processor's `apply(withExtent:inputs:arguments:)`
 * method. The following code generates a new ``CIImage`` object named `result` which contains a thresholded version of
 * the source image, `inputImage`.
 * 
 * ```swift
 * let result = try? ThresholdImageProcessorKernel.apply(
 * withExtent: inputImage.extent,
 * inputs: [inputImage],
 * arguments: ["thresholdValue": 0.25])
 * ```
 * 
 * > Important: Core Image will concatenate kernels in a render into as fewer programs as possible, avoiding the
 * creation
 * of intermediate buffers. However, it is unable to do this with image processor kernels. To get the best performance,
 * you should use `CIImageProcessorKernel` objects only when your algorithms can't be expressed as a ``CIKernel``.
 * 
 * ## Subclassing Notes
 * 
 * The `CIImageProcessorKernel` class is abstract; to create a custom image processor, you define a subclass of this
 * class.
 * 
 * You do not directly create instances of a custom `CIImageProcessorKernel` subclass. Image processors must not carry
 * or
 * use state specific to any single invocation of the processor, so all methods (and accessors for readonly properties)
 * of an image processor kernel class are class methods.
 * 
 * Your subclass should override at least the ``processWithInputs:arguments:output:error:`` method to perform its
 * image processing.
 * 
 * If your image processor needs to work with a larger or smaller region of interest in the input image than each
 * corresponding region of the output image (for example, a blur filter, which samples several input pixels for
 * each output pixel), you should also override the ``roiForInput:arguments:outputRect:`` method.
 * 
 * You can also override the formatForInputAtIndex: method and outputFormat property getter to customize the input
 * and output pixel formats for your processor (for example, as part of a multi-step workflow where you extract a
 * single channel from an RGBA image, apply an effect to that channel only, then recombine the channels).
 * 
 * ## Using a Custom Image Processor
 * 
 * To apply your custom image processor class to create a ``CIImage`` object, call the
 * ``applyWithExtent:inputs:arguments:error:`` class method. (Do not override this method.)
 */
@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIImageProcessorKernel extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CIImageProcessorKernel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIImageProcessorKernel alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CIImageProcessorKernel allocWithZone(VoidPtr zone);

    /**
     * Call this method on your Core Image Processor Kernel subclass to create a new image of the specified extent.
     * 
     * The inputs and arguments will be retained so that your subclass can be called when the image is drawn.
     * 
     * This method will return `nil` and an error if:
     * * calling ``outputFormat`` on your subclass returns an unsupported format.
     * * calling ``formatForInputAtIndex:`` on your subclass returns an unsupported format.
     * * your subclass does not implement ``processWithInputs:arguments:output:error:``
     * 
     * - Parameters:
     * - extent: The bounding `CGRect` of pixels that the `CIImageProcessorKernel` can produce.
     * This method will return ``/CIImage/emptyImage`` if extent is empty.
     * - inputs: An array of ``CIImage`` objects to use as input.
     * - arguments: This dictionary contains any additional parameters that the processor needs to
     * produce its output. The argument objects can be of any type but in order for
     * CoreImage to cache intermediates, they must be of the following immutable types:
     * `NSArray`, `NSDictionary`, `NSNumber`, `NSValue`, `NSData`, `NSString`, `NSNull`,
     * ``CIVector``, ``CIColor``, `CGImage`, `CGColorSpace`, or `MLModel`.
     * - error: Pointer to the `NSError` object into which processing errors will be written.
     * - Returns:
     * An autoreleased ``CIImage``
     */
    @Nullable
    @Generated
    @Selector("applyWithExtent:inputs:arguments:error:")
    public static native CIImage applyWithExtentInputsArgumentsError(@ByValue CGRect extent,
            @Nullable NSArray<? extends CIImage> inputs, @Nullable NSDictionary<String, ?> arguments,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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

    /**
     * Override this class method if you want your any of the inputs to be in a specific pixel format.
     * 
     * The format must be one of `kCIFormatBGRA8`, `kCIFormatRGBAh`, `kCIFormatRGBAf` or `kCIFormatR8`.
     * On iOS 12 and macOS 10.14, the formats `kCIFormatRh` and `kCIFormatRf` are also supported.
     * 
     * If the requested inputFormat is `0`, then the input will be a supported format that best
     * matches the rendering context's ``/CIContext/workingFormat``.
     * 
     * If a processor wants data in a colorspace other than the context's working color space,
     * then call ``/CIImage/imageByColorMatchingWorkingSpaceToColorSpace:`` on the processor input.
     * If a processor wants it input as alpha-unpremultiplied RGBA data, then call
     * ``/CIImage/imageByUnpremultiplyingAlpha`` on the processor input.
     */
    @Generated
    @Selector("formatForInputAtIndex:")
    public static native int formatForInputAtIndex(int inputIndex);

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
    public static native CIImageProcessorKernel new_objc();

    /**
     * Override this class property if you want your processor's output to be in a specific pixel format.
     * 
     * The format must be one of `kCIFormatBGRA8`, `kCIFormatRGBAh`, `kCIFormatRGBAf` or `kCIFormatR8`.
     * On iOS 12 and macOS 10.14, the formats `kCIFormatRh` and `kCIFormatRf` are also supported.
     * 
     * If the outputFormat is `0`, then the output will be a supported format that best
     * matches the rendering context's ``/CIContext/workingFormat``.
     * 
     * If a processor returns data in a color space other than the context working color space,
     * then call ``/CIImage/imageByColorMatchingColorSpaceToWorkingSpace:`` on the processor output.
     * If a processor returns data as alpha-unpremultiplied RGBA data, then call,
     * ``/CIImage/imageByPremultiplyingAlpha`` on the processor output.
     */
    @Generated
    @Selector("outputFormat")
    public static native int outputFormat();

    /**
     * Override this class method to implement your Core Image Processor Kernel subclass.
     * 
     * When a `CIImage` containing your `CIImageProcessorKernel` class is rendered, your class' implementation of
     * this method will be called as needed for that render. The method may be called more than once if Core Image
     * needs to tile to limit memory usage.
     * 
     * When your implementation of this class method is called, use the provided `inputs` and `arguments` objects
     * to return processed pixel data to Core Image via `output`.
     * 
     * > Important: this is a class method so that you cannot use or capture any state by accident.
     * All the parameters that affect the output results must be passed to
     * ``applyWithExtent:inputs:arguments:error:``.
     * 
     * - Parameters:
     * - inputs: An array of `id<CIImageProcessorInput>` that the class consumes to produce its output.
     * The `input.region` may be larger than the rect returned by ``roiForInput:arguments:outputRect:``.
     * - arguments: the arguments dictionary that was passed to ``applyWithExtent:inputs:arguments:error:``.
     * - output: The `id<CIImageProcessorOutput>` that the `CIImageProcessorKernel` must provide results to.
     * - error: Pointer to the `NSError` object into which processing errors will be written.
     * - Returns:
     * Returns YES if processing succeeded, and NO if processing failed.
     */
    @Generated
    @Selector("processWithInputs:arguments:output:error:")
    public static native boolean processWithInputsArgumentsOutputError(@Nullable NSArray<?> inputs,
            @Nullable NSDictionary<String, ?> arguments,
            @NotNull @Mapped(ObjCObjectMapper.class) CIImageProcessorOutput output,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Override this class method to implement your processor’s ROI callback.
     * 
     * This will be called one or more times per render to determine what portion
     * of the input images are needed to render a given 'outputRect' of the output.
     * This will not be called if processor has no input images.
     * 
     * The default implementation would return outputRect.
     * 
     * > Important: this is a class method so that you cannot use or capture any state by accident.
     * All the parameters that affect the output results must be passed to
     * ``applyWithExtent:inputs:arguments:error:``.
     * 
     * - Parameters:
     * - inputIndex: the index that tells you which processor input for which to return the ROI rectangle.
     * - arguments: the arguments dictionary that was passed to ``applyWithExtent:inputs:arguments:error:``.
     * - outputRect: the output `CGRect` that processor will be asked to output.
     * - Returns:
     * The `CGRect` of the `inputIndex`th input that is required for the above `outputRect`
     */
    @Generated
    @Selector("roiForInput:arguments:outputRect:")
    @ByValue
    public static native CGRect roiForInputArgumentsOutputRect(int inputIndex,
            @Nullable NSDictionary<String, ?> arguments, @ByValue CGRect outputRect);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Override this class property to return false if you want your processor to be given
     * input objects that have not been synchronized for CPU access.
     * 
     * Generally, if your subclass uses the GPU your should override this method to return false.
     * If not overridden, true is returned.
     */
    @Generated
    @Selector("synchronizeInputs")
    public static native boolean synchronizeInputs();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("init")
    public native CIImageProcessorKernel init();

    /**
     * Override this class property if your processor's output stores 1.0 into the
     * alpha channel of all pixels within the output extent.
     * 
     * If not overridden, false is returned.
     * 
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("outputIsOpaque")
    public static native boolean outputIsOpaque();

    /**
     * Override this class method to implement your processor’s tiled ROI callback.
     * 
     * This will be called one or more times per render to determine what tiles
     * of the input images are needed to render a given `outputRect` of the output.
     * 
     * If the processor implements this method, then when rendered;
     * * as CoreImage prepares for a render, this method will be called for each input to return an ROI tile array.
     * * as CoreImage performs the render, the method ``processWithInputs:arguments:output:error:`` will be called once
     * for each tile.
     * 
     * > Important: this is a class method so that you cannot use or capture any state by accident.
     * All the parameters that affect the output results must be passed to
     * ``applyWithExtent:inputs:arguments:error:``.
     * 
     * - Parameters:
     * - inputIndex: the index that tells you which processor input for which to return the array of ROI rectangles
     * - arguments: the arguments dictionary that was passed to ``applyWithExtent:inputs:arguments:error:``.
     * - outputRect: the output `CGRect` that processor will be asked to output.
     * - Returns:
     * An array of ``CIVector`` that specify tile regions of the `inputIndex`'th input that is required for the above
     * `outputRect`
     * Each region tile in the array is a created by calling ``/CIVector/vectorWithCGRect:/``
     * The tiles may overlap but should fully cover the area of 'input' that is needed.
     * If a processor has multiple inputs, then each input should return the same number of region tiles.
     * 
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("roiTileArrayForInput:arguments:outputRect:")
    @NotNull
    public static native NSArray<? extends CIVector> roiTileArrayForInputArgumentsOutputRect(int inputIndex,
            @Nullable NSDictionary<String, ?> arguments, @ByValue CGRect outputRect);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * Call this method on your multiple-output Core Image Processor Kernel subclass
     * to create an array of new image objects given the specified array of extents.
     * 
     * The inputs and arguments will be retained so that your subclass can be called when the image is drawn.
     * 
     * This method will return `nil` and an error if:
     * * calling ``outputFormatAtIndex:arguments:`` on your subclass returns an unsupported format.
     * * calling ``formatForInputAtIndex:`` on your subclass returns an unsupported format.
     * * your subclass does not implement ``processWithInputs:arguments:output:error:``
     * 
     * - Parameters:
     * - extents: The array of bounding rectangles that the `CIImageProcessorKernel` can produce.
     * Each rectangle in the array is an object created using ``/CIVector/vectorWithCGRect:``
     * This method will return `CIImage.emptyImage` if a rectangle in the array is empty.
     * - inputs: An array of ``CIImage`` objects to use as input.
     * - arguments: This dictionary contains any additional parameters that the processor needs to
     * produce its output. The argument objects can be of any type but in order for
     * CoreImage to cache intermediates, they must be of the following immutable types:
     * `NSArray`, `NSDictionary`, `NSNumber`, `NSValue`, `NSData`, `NSString`, `NSNull`,
     * ``CIVector``, ``CIColor``, `CGImage`, `CGColorSpace`, or `MLModel`.
     * - error: Pointer to the `NSError` object into which processing errors will be written.
     * - Returns:
     * An autoreleased ``CIImage``
     * 
     * 
     * API-Since: 19.0
     */
    @Generated
    @Selector("applyWithExtents:inputs:arguments:error:")
    @Nullable
    public static native NSArray<? extends CIImage> applyWithExtentsInputsArgumentsError(
            @NotNull NSArray<? extends CIVector> extents, @Nullable NSArray<? extends CIImage> inputs,
            @Nullable NSDictionary<String, ?> arguments,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Override this class method if your processor has more than one output and
     * you want your processor's output to be in a specific supported `CIPixelFormat`.
     * 
     * The format must be one of `kCIFormatBGRA8`, `kCIFormatRGBAh`, `kCIFormatRGBAf` or `kCIFormatR8`.
     * On iOS 12 and macOS 10.14, the formats `kCIFormatRh` and `kCIFormatRf` are also supported.
     * 
     * If the outputFormat is `0`, then the output will be a supported format that best
     * matches the rendering context's ``/CIContext/workingFormat``.
     * 
     * - Parameters:
     * - outputIndex: the index that tells you which processor output for which to return the desired `CIPixelFormat`
     * - arguments: the arguments dictionary that was passed to ``applyWithExtent:inputs:arguments:error:``.
     * - Returns:
     * Return the desired `CIPixelFormat`
     * 
     * 
     * API-Since: 19.0
     */
    @Generated
    @Selector("outputFormatAtIndex:arguments:")
    public static native int outputFormatAtIndexArguments(int outputIndex, @Nullable NSDictionary<String, ?> arguments);

    /**
     * Override this class method of your Core Image Processor Kernel subclass if it needs to produce multiple outputs.
     * 
     * This supports 0, 1, 2 or more input images and 2 or more output images.
     * 
     * When a `CIImage` containing your `CIImageProcessorKernel` class is rendered, your class' implementation of
     * this method will be called as needed for that render. The method may be called more than once if Core Image
     * needs to tile to limit memory usage.
     * 
     * When your implementation of this class method is called, use the provided `inputs` and `arguments` objects
     * to return processed pixel data to Core Image via multiple `outputs`.
     * 
     * > Important: this is a class method so that you cannot use or capture any state by accident.
     * All the parameters that affect the output results must be passed to
     * ``applyWithExtent:inputs:arguments:error:``.
     * 
     * - Parameters:
     * - inputs: An array of `id<CIImageProcessorInput>` that the class consumes to produce its output.
     * The `input.region` may be larger than the rect returned by ``roiForInput:arguments:outputRect:``.
     * - arguments: the arguments dictionary that was passed to ``applyWithExtent:inputs:arguments:error:``.
     * - outputs: An array `id<CIImageProcessorOutput>` that the `CIImageProcessorKernel` must provide results to.
     * - error: Pointer to the `NSError` object into which processing errors will be written.
     * - Returns:
     * Returns YES if processing succeeded, and NO if processing failed.
     * 
     * 
     * API-Since: 19.0
     */
    @Generated
    @Selector("processWithInputs:arguments:outputs:error:")
    public static native boolean processWithInputsArgumentsOutputsError(@Nullable NSArray<?> inputs,
            @Nullable NSDictionary<String, ?> arguments, @NotNull NSArray<?> outputs,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);
}
