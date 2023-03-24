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
 * In order to use a CIImageProcessorInput & CIImageProcessorOutput you must
 * subclass from a CIImageProcessorKernel and override the methods you need to
 * produce the desired output.
 * 
 * API-Since: 10.0
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
     * Call this method on your CIImageProcessorKernel subclass to create a new CIImage of the specified extent.
     * The inputs and arguments will be retained so that your subclass can be called when the image is drawn.
     * Arguments is a dictionary containing inmutable objects of type NSData, NSString, NSNumber,
     * CIVector or CIColor.
     * 
     * This method will return [CIImage emptyImage] if extent is empty.
     * 
     * This method will return nil and an error if:
     * * calling outputFormat on your subclass returns an unsupported format
     * * calling formatForInputAtIndex: on your subclass returns an unsupported format
     * * your subclass does not implement processWithInputs:arguments:output:error:
     */
    @Nullable
    @Generated
    @Selector("applyWithExtent:inputs:arguments:error:")
    public static native CIImage applyWithExtentInputsArgumentsError(@ByValue CGRect extent,
            @Nullable NSArray<? extends CIImage> inputs, @Nullable NSDictionary<String, ?> args,
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
     * Override this class method if you want your any of the inputs to be in a specific supported CIPixelFormat.
     * The format must be one of kCIFormatBGRA8, kCIFormatRGBAh, kCIFormatRGBAf or kCIFormatR8.
     * On iOS 12 and macOS 10.14, the formats kCIFormatRh and kCIFormatRf are also supported.
     * If the requested inputFormat is 0, then the input will be a supported format that best
     * matches the rendering context's workingFormat.
     * 
     * If a processor wants data in a colorspace other than the context workingspace,
     * then call imageByColorMatchingWorkingSpaceToColorSpace on the processor input.
     * If a processor wants it input as alpha-unpremultiplied RGBA data, then call
     * imageByUnpremultiplyingAlpha on the processor input.
     */
    @Generated
    @Selector("formatForInputAtIndex:")
    public static native int formatForInputAtIndex(int input);

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

    @Generated
    @Selector("outputFormat")
    public static native int outputFormat();

    /**
     * Override this class method to implement your processor's subclass of CIImageProcessorKernel.
     * The class method will be called to produce the requested region of the output image
     * given the required regions of the input images and other arguments.
     * 
     * The class method is passed two objects:
     * 'inputs’ An array of id<CIImageProcessorInput> that the block consumes to produces output.
     * The input.region may be larger than the rect returned by 'roiForInputAtIndex'.
     * 'output' The id<CIImageProcessorOutput> that the block must provide results to.
     * ‘arguments’ The arguments dictionary passed to applyWithExtent:inputs:arguments:error:
     * The contents of these objects are not valid outside the scope of this method.
     * 
     * Note that since this is a class method you cannot use or capture any state by accident.
     * All the parameters that affect the output results must be passed in ‘inputs’ and ‘arguments'.
     * This supports 0, 1, 2 or more input images.
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
     * Override this class method to implement your processor’s ROI callback, the default implementation would return
     * outputRect.
     * This will be called one or more times per render to determine what portion
     * of the input images are needed to render a given 'outputRect' of the output.
     * This will not be called if there are 0 input images.
     * 
     * Note that since this is a class method you cannot use or capture any state by accident.
     * All the parameters that affect the output results must be passed in ‘inputs’ and ‘arguments’.
     */
    @Generated
    @Selector("roiForInput:arguments:outputRect:")
    @ByValue
    public static native CGRect roiForInputArgumentsOutputRect(int input, @Nullable NSDictionary<String, ?> arguments,
            @ByValue CGRect outputRect);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

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
     * API-Since: 11.0
     */
    @Generated
    @Selector("outputIsOpaque")
    public static native boolean outputIsOpaque();
}
