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
 * MPSMatrixCopyToImage
 * 
 * The MPSMatrixCopyToImage copies matrix data to a MPSImage.
 *             The operation is the reverse of MPSImageCopyToMatrix.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixCopyToImage extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixCopyToImage(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixCopyToImage alloc();

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

    /**
     * [@property]   dataLayout
     * 
     * The data layout to use
     * 
     * Returns the data layout.  When copying from a MPSMatrix to a MPSImage, this
     *             describes the order in which the image values are to be stored in the buffer associated
     *             with the MPSMatrix.
     *             Default: MPSDataLayoutFeatureChannelsxHeightxWidth
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
     * Encode a kernel that copies a MPSMatrix to a MPSImage into a command buffer
     *           using a MTLComputeCommandEncoder.
     * 
     * The kernel copies feature channels from sourceMatrix to the destinationImage.
     *             The kernel will not begin to execute until
     *             after the command buffer has been enqueued and committed.
     * 
     *             NOTE: The sourceMatrix.dataType must match the feature channel data type in destinationImage.
     * 
     * @param  commandBuffer       A valid MTLCommandBuffer.
     * @param  sourceMatrix        A valid MPSMatrix or MPSTemporaryMatrix object describing the source matrix.
     * @param  destinationImage    A valid MPSImage describing the image to copy to.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceMatrix:destinationImage:")
    public native void encodeToCommandBufferSourceMatrixDestinationImage(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSMatrix sourceMatrix,
            MPSImage destinationImage);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSMatrixCopyToImage init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSMatrixCopyToImage initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * While the standard NSSecureCoding/NSCoding method
     *             -initWithCoder: should work, since the file can't
     *             know which device your data is allocated on, we
     *             have to guess and may guess incorrectly.  To avoid
     *             that problem, use initWithCoder:device instead.
     * 
     * @param      aDecoder    The NSCoder subclass with your serialized MPSKernel
     * @param      device      The MTLDevice on which to make the MPSKernel
     * @return     A new MPSKernel object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSMatrixCopyToImage initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSMatrixCopyToImage initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize a MPSMatrixCopyToImage object on a device
     * 
     * @param    device        The device the kernel will run on
     * @param    dataLayout    The data layout
     * @return   A valid MPSMatrixCopyToImage object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:dataLayout:")
    public native MPSMatrixCopyToImage initWithDeviceDataLayout(@Mapped(ObjCObjectMapper.class) MTLDevice device,
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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property]   sourceMatrixBatchIndex
     * 
     * The index of the source matrix in the batch.  This property is
     *             modifiable and defaults to 0 at initialization time.
     */
    @Generated
    @Selector("setSourceMatrixBatchIndex:")
    public native void setSourceMatrixBatchIndex(@NUInt long value);

    /**
     * [@property]   sourceMatrixOrigin
     * 
     * The origin, relative to [0, 0] in the source matrix.
     *             This property is modifiable and defaults
     *             to [0, 0] at initialization time.  If a different origin is desired
     *             then this should be modified prior to encoding the kernel.  The z
     *             value must be 0.
     */
    @Generated
    @Selector("setSourceMatrixOrigin:")
    public native void setSourceMatrixOrigin(@ByValue MTLOrigin value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property]   sourceMatrixBatchIndex
     * 
     * The index of the source matrix in the batch.  This property is
     *             modifiable and defaults to 0 at initialization time.
     */
    @Generated
    @Selector("sourceMatrixBatchIndex")
    @NUInt
    public native long sourceMatrixBatchIndex();

    /**
     * [@property]   sourceMatrixOrigin
     * 
     * The origin, relative to [0, 0] in the source matrix.
     *             This property is modifiable and defaults
     *             to [0, 0] at initialization time.  If a different origin is desired
     *             then this should be modified prior to encoding the kernel.  The z
     *             value must be 0.
     */
    @Generated
    @Selector("sourceMatrixOrigin")
    @ByValue
    public native MTLOrigin sourceMatrixOrigin();

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