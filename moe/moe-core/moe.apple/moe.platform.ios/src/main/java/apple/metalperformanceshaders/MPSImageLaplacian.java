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

package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSImageLaplacian
 * <p>
 * The MPSImageLaplacian is an optimized variant of the MPSImageConvolution filter provided primarily for ease of use.
 * This filter uses an optimized convolution filter with a 3 x 3 kernel with the following weights:
 * [ 0 1 0
 * 1 -4 1
 * 0 1 0 ]
 * <p>
 * The optimized convolution filter used by MPSImageLaplacian can also be used by creating a MPSImageConvolution
 * object with kernelWidth = 3, kernelHeight = 3 and weights as specified above.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImageLaplacian extends MPSUnaryImageKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImageLaplacian(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImageLaplacian alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSImageLaplacian allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSImageLaplacian new_objc();

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
     * [@property] bias
     * <p>
     * The bias is a value to be added to convolved pixel before it is converted back to the storage format.
     * It can be used to convert negative values into a representable range for a unsigned MTLPixelFormat.
     * For example, many edge detection filters produce results in the range [-k,k]. By scaling the filter
     * weights by 0.5/k and adding 0.5, the results will be in range [0,1] suitable for use with unorm formats.
     * It can be used in combination with renormalization of the filter weights to do video ranging as part
     * of the convolution effect. It can also just be used to increase the brightness of the image.
     * <p>
     * Default value is 0.0f.
     */
    @Generated
    @Selector("bias")
    public native float bias();

    @Generated
    @Selector("init")
    public native MPSImageLaplacian init();

    @Generated
    @Selector("initWithDevice:")
    public native MPSImageLaplacian initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * [@property] bias
     * <p>
     * The bias is a value to be added to convolved pixel before it is converted back to the storage format.
     * It can be used to convert negative values into a representable range for a unsigned MTLPixelFormat.
     * For example, many edge detection filters produce results in the range [-k,k]. By scaling the filter
     * weights by 0.5/k and adding 0.5, the results will be in range [0,1] suitable for use with unorm formats.
     * It can be used in combination with renormalization of the filter weights to do video ranging as part
     * of the convolution effect. It can also just be used to increase the brightness of the image.
     * <p>
     * Default value is 0.0f.
     */
    @Generated
    @Selector("setBias:")
    public native void setBias(float value);

    @Generated
    @Selector("initWithCoder:")
    public native MPSImageLaplacian initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSImageLaplacian initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
