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
import apple.metalperformanceshaders.struct.MPSImageKeypointRangeInfo;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSImageFindKeypoints
 * <p>
 * The MPSImageFindKeypoints kernel is used to find a list of keypoints whose values are >= minimumPixelThresholdValue
 * in MPSImageKeypointRangeInfo. The keypoints are generated for a specified region in the image.
 * The pixel format of the source image must be MTLPixelFormatR8Unorm.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImageFindKeypoints extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImageFindKeypoints(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImageFindKeypoints alloc();

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

    /**
     * Encode the filter to a command buffer using a MTLComputeCommandEncoder.
     * <p>
     * The filter will not begin to execute until after the command
     * buffer has been enqueued and committed.
     *
     * @param commandBuffer             A valid MTLCommandBuffer.
     * @param source                    A valid MTLTexture containing the source image for the filter.
     * @param regions                   An array of rectangles that describe regions in the image.
     *                                  The list of keypoints is generated for each individual rectangle specifed.
     * @param keypointCountBuffer       The list of keypoints for each specified region
     * @param keypointCountBufferOffset Byte offset into keypointCountBufferOffset buffer at which to write the keypoint results.
     *                                  Must be a multiple of 32 bytes.
     * @param keypointDataBuffer        A valid MTLBuffer to receive the keypoint data results for each rectangle.
     *                                  The keypoint data for keypoints in each rectangle are stored consecutively.
     *                                  The keypoint data for each rectangle starts at the following offset:
     *                                  MPSImageKeypointRangeInfo.maximumKeyPoints * rectangle index
     * @param keypointDataBufferOffset  Byte offset into keypointData buffer at which to write the keypoint results.
     *                                  Must be a multiple of 32 bytes.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceTexture:regions:numberOfRegions:keypointCountBuffer:keypointCountBufferOffset:keypointDataBuffer:keypointDataBufferOffset:")
    public native void encodeToCommandBufferSourceTextureRegionsNumberOfRegionsKeypointCountBufferKeypointCountBufferOffsetKeypointDataBufferKeypointDataBufferOffset(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @Mapped(ObjCObjectMapper.class) MTLTexture source,
            @UncertainArgument("Options: reference, array Fallback: reference") MTLRegion regions,
            @NUInt long numberOfRegions, @Mapped(ObjCObjectMapper.class) MTLBuffer keypointCountBuffer,
            @NUInt long keypointCountBufferOffset, @Mapped(ObjCObjectMapper.class) MTLBuffer keypointDataBuffer,
            @NUInt long keypointDataBufferOffset);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSImageFindKeypoints init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSImageFindKeypoints initWithCoder(NSCoder aDecoder);

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
    public native MPSImageFindKeypoints initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSImageFindKeypoints initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Specifies information to find keypoints in an image.
     *
     * @param device The device the filter will run on
     * @param info   Pointer to the MPSImageKeypointRangeInfo struct
     * @return A valid MPSImageFindKeypoints object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:info:")
    public native MPSImageFindKeypoints initWithDeviceInfo(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            @UncertainArgument("Options: reference, array Fallback: reference") MPSImageKeypointRangeInfo info);

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

    /**
     * [@property]   keypointRangeInfo
     * <p>
     * Return a structure describing the keypoint range info
     * <p>
     * Returns a MPSImageKeypointRangeInfo structure
     */
    @Generated
    @Selector("keypointRangeInfo")
    @ByValue
    public native MPSImageKeypointRangeInfo keypointRangeInfo();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
