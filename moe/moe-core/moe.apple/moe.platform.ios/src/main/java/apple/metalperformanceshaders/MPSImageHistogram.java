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
import apple.metal.struct.MTLRegion;
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
 * MPSImageHistogram
 * 
 * The MPSImageHistogram computes the histogram of an image.
 * 
 * 
 * API-Since: 9.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImageHistogram extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImageHistogram(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImageHistogram alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSImageHistogram allocWithZone(VoidPtr zone);

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
    public static native MPSImageHistogram new_objc();

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
     * [@property] clipRectSource
     * 
     * The source rectangle to use when reading data.
     * 
     * A MTLRegion that indicates which part of the source to read. If the clipRectSource does not lie
     * completely within the source image, the intersection of the image bounds and clipRectSource will
     * be used. The clipRectSource replaces the MPSUnaryImageKernel offset parameter for this filter.
     * The latter is ignored. Default: MPSRectNoClip, use the entire source texture.
     */
    @Generated
    @Selector("clipRectSource")
    @ByValue
    public native MTLRegion clipRectSource();

    /**
     * Encode the filter to a command buffer using a MTLComputeCommandEncoder.
     * 
     * The filter will not begin to execute until after the command
     * buffer has been enqueued and committed.
     * 
     * @param commandBuffer   A valid MTLCommandBuffer.
     * @param source          A valid MTLTexture containing the source image for the filter
     * @param histogram       A valid MTLBuffer to receive the histogram results.
     * @param histogramOffset Byte offset into histogram buffer at which to write the histogram results. Must be a
     *                        multiple of 32 bytes.
     *                        The histogram results / channel are stored together. The number of channels for which
     *                        histogram results are stored is determined by the number of channels in the image.
     *                        If histogramInfo.histogramForAlpha is false and the source image is RGBA then only
     *                        histogram
     *                        results for RGB channels are stored.
     * 
     *                        The histogram results are stored in the histogram buffer as follows:
     *                        - histogram results for the R channel for all bins followed by
     *                        - histogram results for the G channel for all bins followed by
     *                        - histogram results for the B channel for all bins followed by
     *                        - histogram results for the A channel for all bins
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceTexture:histogram:histogramOffset:")
    public native void encodeToCommandBufferSourceTextureHistogramHistogramOffset(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture source,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer histogram, @NUInt long histogramOffset);

    /**
     * The amount of space in the output MTLBuffer the histogram will take up.
     * 
     * This convenience function calculates the minimum amount of space
     * needed in the output histogram for the results. The MTLBuffer should
     * be at least this length, longer if histogramOffset is non-zero.
     * 
     * @param sourceFormat The MTLPixelFormat of the source image. This is
     *                     the source parameter of -encodeToCommandBuffer:
     *                     sourceTexture:histogram:histogramOffset
     * @return The number of bytes needed to store the result histograms.
     */
    @Generated
    @Selector("histogramSizeForSourceFormat:")
    @NUInt
    public native long histogramSizeForSourceFormat(@NUInt long sourceFormat);

    @Generated
    @Selector("init")
    public native MPSImageHistogram init();

    @Generated
    @Selector("initWithDevice:")
    public native MPSImageHistogram initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Specifies information to compute the histogram for channels of an image.
     * 
     * @param device        The device the filter will run on
     * @param histogramInfo Pointer to the MPSHistogramInfo struct
     * @return A valid MPSImageHistogram object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:histogramInfo:")
    public native MPSImageHistogram initWithDeviceHistogramInfo(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NotNull VoidPtr histogramInfo);

    /**
     * [@property] clipRectSource
     * 
     * The source rectangle to use when reading data.
     * 
     * A MTLRegion that indicates which part of the source to read. If the clipRectSource does not lie
     * completely within the source image, the intersection of the image bounds and clipRectSource will
     * be used. The clipRectSource replaces the MPSUnaryImageKernel offset parameter for this filter.
     * The latter is ignored. Default: MPSRectNoClip, use the entire source texture.
     */
    @Generated
    @Selector("setClipRectSource:")
    public native void setClipRectSource(@ByValue MTLRegion value);

    /**
     * [@property] zeroHistogram
     * 
     * Zero-initalize the histogram results
     * 
     * Indicates that the memory region in which the histogram results are to be written in the
     * histogram buffer are to be zero-initialized or not. Default: YES.
     */
    @Generated
    @Selector("setZeroHistogram:")
    public native void setZeroHistogram(boolean value);

    /**
     * [@property] zeroHistogram
     * 
     * Zero-initalize the histogram results
     * 
     * Indicates that the memory region in which the histogram results are to be written in the
     * histogram buffer are to be zero-initialized or not. Default: YES.
     */
    @Generated
    @Selector("zeroHistogram")
    public native boolean zeroHistogram();

    @Generated
    @Selector("initWithCoder:")
    public native MPSImageHistogram initWithCoder(@NotNull NSCoder aDecoder);

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
    public native MPSImageHistogram initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
