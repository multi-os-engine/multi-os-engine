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
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * CIKernel is an object that encapsulates a Core Image Kernel Language
 * routine that generates a new images based on input images and agruments.
 * <p>
 * General kernel functions are declared akin to this example:
 * kernel vec4 myColorKernel (sampler fore, sampler back, vec4 params)
 * <p>
 * The function must take a sampler argument for each input image.
 * Additional arguments can be of type float, vec2, vec3, vec4, or __color.
 * The destination pixel location is obtained by calling destCoord().
 * The kernel should call sample() with coordinates based on either
 * samplerCoord() or samplerTransform() to read pixel values from input images.
 * The function must return a vec4 pixel color.
 */
@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIKernel extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CIKernel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIKernel alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native CIKernel allocWithZone(VoidPtr zone);

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

    /**
     * The string argument should contain a program with one kernel.
     * On OSX 10.10 and before, this returns a CIKernel object.
     * On OSX after 10.10, this returns a CIKernel, CIColorKernel, or CIWarpKernel object.
     * On iOS this returns a CIKernel, CIColorKernel, or CIWarpKernel object.
     */
    @Generated
    @Selector("kernelWithString:")
    public static native CIKernel kernelWithString(String string);

    /**
     * The string argument should contain a program in the Core Image Kernel Language.
     * All the kernel functions in the program are converted to instances of a CIKernel objects
     * and returned in an array.
     * On OSX 10.10 and before, the array will contain instances of CIKernel class.
     * On OSX after 10.10, the array will contain instances of CIKernel, CIColorKernel or CIWarpKernel classes.
     * On iOS, the array will contain instances of CIKernel, CIColorKernel or CIWarpKernel classes.
     */
    @Generated
    @Selector("kernelsWithString:")
    public static native NSArray<? extends CIKernel> kernelsWithString(String string);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CIKernel new_objc();

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
     * Apply the receiver CIKernel to produce a new CIImage object.
     * <p>
     * The 'extent' is the bounding box of all non-clear pixels produced by the kernel.
     * <p>
     * The 'callback' is a block that should return the rectangle of each input image
     * that is needed to produce a given rectangle in the coordinate space of the
     * new image.
     * <p>
     * The 'args' is an array of parameters needed to describe the new image.
     * The object types of the items in the array correspond to the argument types of the
     * kernel function.  For example, if the first argument in the kernel is a sampler,
     * then the first object in the array must be a CIImage.
     */
    @Generated
    @Selector("applyWithExtent:roiCallback:arguments:")
    public native CIImage applyWithExtentRoiCallbackArguments(@ByValue CGRect extent,
            @ObjCBlock(name = "call_applyWithExtentRoiCallbackArguments") Block_applyWithExtentRoiCallbackArguments callback,
            NSArray<?> args);

    @Generated
    @Selector("init")
    public native CIKernel init();

    /**
     * The name of the kernel.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * Sets the selector used by Core Image to ask what rectangles of a kernel's input images
     * are needed to produce a desired rectangle of the kernel's output image.
     * <p>
     * Using setROISelector: is suppoted but not recommended.
     * The selector is only used if one the [CIFilter apply:...] methods is used.
     * Instead, use one of the [CIKernel applyWithExtent:roiCallback:...] methods.
     * <p>
     * The method should have one of the following signatures:
     * - (CGRect)regionOf:(int)samplerIndex destRect:(CGRect)r userInfo:obj;
     * - (CGRect)regionOf:(int)samplerIndex destRect:(CGRect)r;
     * <p>
     * 'samplerIndex' is the 0-based index specifying which of the kernel's input images is being queried.
     * 'destRect' is the extent rectangle of kernel's output image being queried.
     * 'userInfo' is the object associated with the kCIApplyOptionUserInfo when the kernel was applied.
     * <p>
     * The method should return the rectangle of the index'th input image that is needed to produce destRect.
     * Returning CGRectNull indicates that the index'th input image is not needed to produce destRect.
     */
    @Generated
    @Selector("setROISelector:")
    public native void setROISelector(SEL method);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applyWithExtentRoiCallbackArguments {
        @Generated
        @ByValue
        CGRect call_applyWithExtentRoiCallbackArguments(int index, @ByValue CGRect destRect);
    }

    /**
     * The data argument should represent a metallib file compiled with the Core Image Standard Library
     * and contain the given function written in the Metal Shading Language.
     * <p>
     * An optional output pixel format can be specified, and would be used if the output of the kernel
     * needs to be written to an intermediate texture.
     */
    @Generated
    @Selector("kernelWithFunctionName:fromMetalLibraryData:error:")
    public static native CIKernel kernelWithFunctionNameFromMetalLibraryDataError(String name, NSData data,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("kernelWithFunctionName:fromMetalLibraryData:outputPixelFormat:error:")
    public static native CIKernel kernelWithFunctionNameFromMetalLibraryDataOutputPixelFormatError(String name,
            NSData data, int format, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * This method will return an array of strings corresponding to names of all of the kernels
     * contained within the underlying Metal library in the associated NSData.
     */
    @Generated
    @Selector("kernelNamesFromMetalLibraryData:")
    public static native NSArray<String> kernelNamesFromMetalLibraryData(NSData data);

    /**
     * The string argument should contain a program in the Metal Language.
     * All the kernel functions in the program are converted to instances of a CIKernel objects
     * and returned in an array.
     * The array will contain instances of CIKernel, CIColorKernel or CIWarpKernel classes.
     * The kernels will only be usable on Metal-backed CIContext on a device that 'supportsDynamicLibraries'
     */
    @Generated
    @Selector("kernelsWithMetalString:error:")
    public static native NSArray<? extends CIKernel> kernelsWithMetalStringError(String source,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}
