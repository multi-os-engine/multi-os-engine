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
import apple.metal.protocol.MTLBuffer;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLTexture;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSImageHistogramEqualization
 * <p>
 * The MPSImageHistogramEqualization performs equalizes the histogram of an image.
 * The process is divided into three steps.
 * <p>
 * -# Call -initWithDevice:histogramInfo:   This creates a MPSImageHistogramEqualization
 * object.   It is done when the method returns.
 * <p>
 * -# Call -encodeTransform:sourceTexture:histogram:histogramOffset:  This creates a privately held
 * image transform (i.e. a cumulative distribution function of the histogram) which will be used to
 * equalize the distribution of the histogram of the source image. This process runs on a MTLCommandBuffer
 * when it is committed to a MTLCommandQueue. It must complete before the next step can be run.
 * It may be performed on the same MTLCommandBuffer.  The histogram argument specifies the histogram
 * buffer which contains the histogram values for sourceTexture.  The sourceTexture argument is used by
 * encodeTransform to determine the number of channels and therefore which histogram data in histogram
 * buffer to use. The histogram for sourceTexture must have been computed either on the CPU or using
 * the MPSImageHistogram kernel
 * <p>
 * -# Call -encodeToCommandBuffer:sourceTexture:destinationTexture: to read data from
 * sourceTexture, apply the equalization transform to it and write to destination texture.
 * This step is also done on the GPU on a MTLCommandQueue.
 * <p>
 * You can reuse the same equalization transform on other images to perform the
 * same transform on those images. (Since their distribution is probably different,
 * they will probably not be equalized by it.) This filter usually will not be able
 * to work in place.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImageHistogramEqualization extends MPSUnaryImageKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImageHistogramEqualization(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImageHistogramEqualization alloc();

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

    /**
     * Encode the transform function to a command buffer using a MTLComputeCommandEncoder.
     * The transform function computes the equalization lookup table.
     * <p>
     * The transform function will not begin to execute until after the command
     * buffer has been enqueued and committed.  This step will need to be repeated
     * with the new MPSKernel if -copyWithZone:device or -copyWithZone: is called.
     * The transform is stored as internal state to the object. You still need to
     * call -encodeToCommandBuffer:sourceTexture:destinationTexture: afterward
     * to apply the transform to produce a result texture.
     *
     * @param commandBuffer   A valid MTLCommandBuffer.
     * @param source          A valid MTLTexture containing the source image for the filter.
     * @param histogram       A valid MTLBuffer containing the histogram results for an image.  This filter
     *                        will use these histogram results to generate the cumulative histogram for equalizing
     *                        the image.  The histogram results / channel are stored together.  The number of channels
     *                        for which histogram results are stored is determined by the number of channels in the image.
     *                        If histogramInfo.histogramForAlpha is false and the source image is RGBA then only histogram
     *                        results for RGB channels are stored.
     * @param histogramOffset A byte offset into the histogram MTLBuffer where the histogram starts. Must conform to
     *                        alignment requirements for [MTLComputeCommandEncoder setBuffer:offset:atIndex:] offset
     *                        parameter.
     */
    @Generated
    @Selector("encodeTransformToCommandBuffer:sourceTexture:histogram:histogramOffset:")
    public native void encodeTransformToCommandBufferSourceTextureHistogramHistogramOffset(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @Mapped(ObjCObjectMapper.class) MTLTexture source, @Mapped(ObjCObjectMapper.class) MTLBuffer histogram,
            @NUInt long histogramOffset);

    @Generated
    @Selector("init")
    public native MPSImageHistogramEqualization init();

    @Generated
    @Selector("initWithDevice:")
    public native MPSImageHistogramEqualization initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Specifies information about the histogram for the channels of an image.
     *
     * @param device        The device the filter will run on
     * @param histogramInfo Pointer to the MPSHistogramInfo struct
     * @return A valid MPSImageHistogramEqualization object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:histogramInfo:")
    public native MPSImageHistogramEqualization initWithDeviceHistogramInfo(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, VoidPtr histogramInfo);

    @Generated
    @Selector("initWithCoder:")
    public native MPSImageHistogramEqualization initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * <p>
     * While the standard NSSecureCoding/NSCoding method
     * -initWithCoder: should work, since the file can't
     * know which device your data is allocated on, we
     * have to guess and may guess incorrectly.  To avoid
     * that problem, use initWithCoder:device instead.
     *
     * @param aDecoder The NSCoder subclass with your serialized MPSKernel
     * @param device   The MTLDevice on which to make the MPSKernel
     * @return A new MPSKernel object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSImageHistogramEqualization initWithCoderDevice(NSCoder aDecoder,
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
