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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSImageHistogramSpecification
 * 
 * The MPSImageHistogramSpecification performs a histogram specification operation on an image.
 * It is a generalized version of histogram equalization operation. The histogram specificaiton filter
 * converts the image so that its histogram matches the desired histogram.
 * 
 * 
 * API-Since: 9.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImageHistogramSpecification extends MPSUnaryImageKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImageHistogramSpecification(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImageHistogramSpecification alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSImageHistogramSpecification allocWithZone(VoidPtr zone);

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
    public static native MPSImageHistogramSpecification new_objc();

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
     * The transform function computes the specification lookup table.
     * 
     * The transform function will not begin to execute until after the command
     * buffer has been enqueued and committed. This step will need to be repeated
     * with the new MPSKernel if -copyWithZone:device or -copyWithZone: is called.
     * 
     * @param commandBuffer          A valid MTLCommandBuffer.
     * @param source                 A valid MTLTexture containing the source image for the filter.
     * @param sourceHistogram        A valid MTLBuffer containing the histogram results for the source image. This
     *                               filter
     *                               will use these histogram results to generate the cumulative histogram for
     *                               equalizing
     *                               the image. The histogram results / channel are stored together. The number of
     *                               channels
     *                               for which histogram results are stored is determined by the number of channels in
     *                               the image.
     *                               If histogramInfo.histogramForAlpha is false and the source image is RGBA then only
     *                               histogram
     *                               results for RGB channels are stored.
     * @param sourceHistogramOffset  A byte offset into the sourceHistogram MTLBuffer where the histogram starts. Must
     *                               conform to
     *                               alignment requirements for [MTLComputeCommandEncoder setBuffer:offset:atIndex:]
     *                               offset
     *                               parameter.
     * @param desiredHistogram       A valid MTLBuffer containing the desired histogram results for the source image.
     *                               The histogram results / channel are stored together. The number of channels
     *                               for which histogram results are stored is determined by the number of channels in
     *                               the image.
     *                               If histogramInfo.histogramForAlpha is false and the source image is RGBA then only
     *                               histogram
     *                               results for RGB channels are stored.
     * @param desiredHistogramOffset A byte offset into the desiredHistogram MTLBuffer where the histogram starts. Must
     *                               conform to
     *                               alignment requirements for [MTLComputeCommandEncoder setBuffer:offset:atIndex:]
     *                               offset
     *                               parameter.
     */
    @Generated
    @Selector("encodeTransformToCommandBuffer:sourceTexture:sourceHistogram:sourceHistogramOffset:desiredHistogram:desiredHistogramOffset:")
    public native void encodeTransformToCommandBufferSourceTextureSourceHistogramSourceHistogramOffsetDesiredHistogramDesiredHistogramOffset(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture source,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer sourceHistogram, @NUInt long sourceHistogramOffset,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer desiredHistogram, @NUInt long desiredHistogramOffset);

    @Generated
    @Selector("init")
    public native MPSImageHistogramSpecification init();

    @Generated
    @Selector("initWithDevice:")
    public native MPSImageHistogramSpecification initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Specifies information about the histogram for the channels of an image.
     * 
     * The MPSImageHistogramSpecification applies a transfor to convert the histogram
     * to a specified histogram. The process is divided into three steps:
     * 
     * -# Call -initWithDevice:histogramInfo: This creates a MPSImageHistogramSpecification
     * object. It is done when the method returns.
     * 
     * -# Call -encodeTransform:sourceTexture:sourceHistogram:sourceHistogramOffset:desiredHistogram:
     * desiredHistogramOffset: This creates a privately held image transform which will convert the
     * the distribution of the source histogram to the desired histogram. This process runs on a
     * MTLCommandBuffer when it is committed to a MTLCommandQueue. It must complete before the next
     * step can be run. It may be performed on the same MTLCommandBuffer. The sourceTexture argument
     * is used by encodeTransform to determine the number of channels and therefore which histogram data
     * in sourceHistogram buffer to use. The sourceHistogram and desiredHistogram must have been computed
     * either on the CPU or using the MPSImageHistogram kernel
     * 
     * -# Call -encodeToCommandBuffer:sourceTexture:destinationTexture: to read data from
     * sourceTexture, apply the transform to it and write to destination texture.
     * This step is also done on the GPU on a MTLCommandQueue.
     * 
     * You can reuse the same specification transform on other images to perform the
     * same transform on those images. (Since their starting distribution is probably
     * different, they will probably not arrive at the same distribution as the desired
     * histogram.) This filter usually will not be able to work in place.
     * 
     * @param device        The device the filter will run on
     * @param histogramInfo Pointer to the MPSHistogramInfo struct
     * @return A valid MPSImageHistogramSpecification object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:histogramInfo:")
    public native MPSImageHistogramSpecification initWithDeviceHistogramInfo(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NotNull VoidPtr histogramInfo);

    @Generated
    @Selector("initWithCoder:")
    public native MPSImageHistogramSpecification initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * While the standard NSSecureCoding/NSCoding method
     * -initWithCoder: should work, since the file can't
     * know which device your data is allocated on, we
     * have to guess and may guess incorrectly. To avoid
     * that problem, use initWithCoder:device instead.
     * 
     * @param aDecoder The NSCoder subclass with your serialized MPSKernel
     * @param device   The MTLDevice on which to make the MPSKernel
     * @return A new MPSKernel object, or nil if failure.
     * 
     *         API-Since: 11.0
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSImageHistogramSpecification initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
