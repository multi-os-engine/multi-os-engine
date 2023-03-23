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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGRect;

/**
 * CIColorKernel is an object that encapsulates a Core Image Kernel Language
 * routine that processes only the color information in images.
 * 
 * Color kernel functions are declared akin to this example:
 * kernel vec4 myColorKernel (__sample fore, __sample back, vec4 params)
 * 
 * The function must take a __sample argument for each input image.
 * Additional arguments can be of type float, vec2, vec3, vec4, or __color.
 * The destination pixel location is obtained by calling destCoord().
 * The kernel should not call sample(), samplerCoord(), or samplerTransform().
 * The function must return a vec4 pixel color.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIColorKernel extends CIKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected CIColorKernel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIColorKernel alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CIColorKernel allocWithZone(VoidPtr zone);

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
     * The string argument should contain a program with one color kernel.
     * On iOS8 [CIColorKernel kernelWithString:] can return a CIKernel, CIColorKernel, or CIWarpKernel object.
     * On iOS9 [CIColorKernel kernelWithString:] will return a CIColorKernel object or nil.
     * On OS X [CIColorKernel kernelWithString:] will return a CIColorKernel object or nil.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: Core Image Kernel Language API deprecated. (Define CI_SILENCE_GL_DEPRECATION to silence these
     * warnings)
     */
    @Deprecated
    @Generated
    @Selector("kernelWithString:")
    public static native CIColorKernel kernelWithString(String string);

    @Deprecated
    @Generated
    @Selector("kernelsWithString:")
    public static native NSArray<? extends CIKernel> kernelsWithString(String string);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CIColorKernel new_objc();

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
     * Apply the receiver CIColorKernel to produce a new CIImage object.
     * 
     * The 'extent' is the bounding box of all non-clear pixels produced by the kernel.
     * 
     * The 'args' is an array of parameters needed to describe the new image.
     * The object types of the items in the array correspond to the argument types of the
     * kernel function. For example, if the first argument in the kernel is a __sample,
     * then the first object in the array must be a CIImage.
     */
    @Generated
    @Selector("applyWithExtent:arguments:")
    public native CIImage applyWithExtentArguments(@ByValue CGRect extent, NSArray<?> args);

    @Generated
    @Selector("init")
    public native CIColorKernel init();

    @Generated
    @Selector("kernelWithFunctionName:fromMetalLibraryData:error:")
    public static native CIColorKernel kernelWithFunctionNameFromMetalLibraryDataError(String name, NSData data,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("kernelWithFunctionName:fromMetalLibraryData:outputPixelFormat:error:")
    public static native CIColorKernel kernelWithFunctionNameFromMetalLibraryDataOutputPixelFormatError(String name,
            NSData data, int format, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("kernelNamesFromMetalLibraryData:")
    public static native NSArray<String> kernelNamesFromMetalLibraryData(NSData data);

    @Generated
    @Selector("kernelsWithMetalString:error:")
    public static native NSArray<? extends CIKernel> kernelsWithMetalStringError(String source,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}
