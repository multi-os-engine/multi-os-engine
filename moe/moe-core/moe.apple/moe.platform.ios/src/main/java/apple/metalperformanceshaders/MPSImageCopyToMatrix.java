package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.struct.MTLOrigin;
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

/**
 * MPSImageCopyToMatrix
 * <p>
 * The MPSImageCopyToMatrix copies image data to a MPSMatrix.
 * The image data is stored in a row of a matrix.  The dataLayout
 * specifies the order in which the feature channels in the MPSImage
 * get stored in the matrix.  If MPSImage stores a batch of images,
 * the images are copied into multiple rows, one row per image.
 * <p>
 * The number of elements in a row in the matrix must be >= image width *
 * image height * number of featureChannels in the image.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImageCopyToMatrix extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImageCopyToMatrix(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImageCopyToMatrix alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSImageCopyToMatrix allocWithZone(VoidPtr zone);

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

    /**
     * [@property]   dataLayout
     * <p>
     * The data layout to use
     * <p>
     * Returns the data layout.  When copying from a MPSImage to a MPSMatrix, this
     * describes the order in which the image values are stored in the buffer associated
     * with the MPSMatrix.
     * Default: MPSDataLayoutFeatureChannelsxHeightxWidth
     */
    @Generated
    @Selector("dataLayout")
    @NUInt
    public native long dataLayout();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property]   destinationMatrixBatchIndex
     * <p>
     * The index of the destination matrix in the batch.  This property is
     * modifiable and defaults to 0 at initialization time.
     */
    @Generated
    @Selector("destinationMatrixBatchIndex")
    @NUInt
    public native long destinationMatrixBatchIndex();

    /**
     * [@property]   destinationMatrixOrigin
     * <p>
     * The origin, relative to [0, 0] in the destination matrix, at which to
     * start writing results.  This property is modifiable and defaults
     * to [0, 0] at initialization time.  If a different origin is desired
     * then this should be modified prior to encoding the kernel.  The z
     * value must be 0.
     */
    @Generated
    @Selector("destinationMatrixOrigin")
    @ByValue
    public native MTLOrigin destinationMatrixOrigin();

    /**
     * Encode a kernel that copies a MPSImage to a MPSMatrix into a command buffer
     * using a MTLComputeCommandEncoder.
     * <p>
     * The kernel copies feature channels from sourceImage to the buffer
     * associated with destinationMatrix.  The kernel will not begin to execute until
     * after the command buffer has been enqueued and committed.
     * <p>
     * NOTE: The destinationMatrix.dataType must match the feature channel data type in sourceImage.
     *
     * @param commandBuffer     A valid MTLCommandBuffer.
     * @param sourceImage       A valid MPSImage describing the image to copy from.
     * @param destinationMatrix A valid MPSMatrix or MPSTemporaryMatrix object describing the matrix to copy to.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceImage:destinationMatrix:")
    public native void encodeToCommandBufferSourceImageDestinationMatrix(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage sourceImage,
            MPSMatrix destinationMatrix);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSImageCopyToMatrix init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSImageCopyToMatrix initWithCoder(NSCoder aDecoder);

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
    public native MPSImageCopyToMatrix initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSImageCopyToMatrix initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize a MPSMatrixCopy object on a device
     *
     * @param device     The device the kernel will run on
     * @param dataLayout The data layout
     * @return A valid MPSMatrixCopy object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:dataLayout:")
    public native MPSImageCopyToMatrix initWithDeviceDataLayout(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            @NUInt long dataLayout);

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
    public static native MPSImageCopyToMatrix new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property]   destinationMatrixBatchIndex
     * <p>
     * The index of the destination matrix in the batch.  This property is
     * modifiable and defaults to 0 at initialization time.
     */
    @Generated
    @Selector("setDestinationMatrixBatchIndex:")
    public native void setDestinationMatrixBatchIndex(@NUInt long value);

    /**
     * [@property]   destinationMatrixOrigin
     * <p>
     * The origin, relative to [0, 0] in the destination matrix, at which to
     * start writing results.  This property is modifiable and defaults
     * to [0, 0] at initialization time.  If a different origin is desired
     * then this should be modified prior to encoding the kernel.  The z
     * value must be 0.
     */
    @Generated
    @Selector("setDestinationMatrixOrigin:")
    public native void setDestinationMatrixOrigin(@ByValue MTLOrigin value);

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
