package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNDArrayMultiaryKernel extends MPSNDArrayMultiaryBase {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNDArrayMultiaryKernel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNDArrayMultiaryKernel alloc();

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
     * Inference encode calls
     * <p>
     * Encode a simple inference NDArray kernel and return a NDArray to hold the result
     *
     * @param cmdBuf       The command buffer into which to encode the kernel
     * @param sourceArrays The list of sources for the filter in a NSArray.
     *                     Ordering to be defined by subclass
     * @return A newly allocated MPSNDArray that will contain the result of the calculation
     * when the command buffer completes successfully.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceArrays:")
    public native MPSNDArray encodeToCommandBufferSourceArrays(@Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf,
            NSArray<? extends MPSNDArray> sourceArrays);

    /**
     * Encode a simple inference NDArray kernel and return a NDArray to hold the result
     *
     * @param cmdBuf       The command buffer into which to encode the kernel
     * @param sourceArrays The list of sources for the filter in a NSArray.
     *                     Ordering to be defined by subclass
     * @param destination  The NDArray to receive the result
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceArrays:destinationArray:")
    public native void encodeToCommandBufferSourceArraysDestinationArray(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, NSArray<? extends MPSNDArray> sourceArrays,
            MPSNDArray destination);

    /**
     * Encode a simple inference NDArray kernel and return a NDArray to hold the result
     *
     * @param cmdBuf           The command buffer into which to encode the kernel
     * @param sourceArrays     The list of sources for the filter in a NSArray.
     *                         Ordering to be defined by subclass
     * @param outGradientState The output gradient state to record the operation for later use by gradient
     * @param destination      A destination array to contain the result of the calculation
     *                         when the command buffer completes successfully.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceArrays:resultState:destinationArray:")
    public native void encodeToCommandBufferSourceArraysResultStateDestinationArray(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, NSArray<? extends MPSNDArray> sourceArrays,
            MPSState outGradientState, MPSNDArray destination);

    /**
     * Forward training encode calls
     * <p>
     * Encode a simple inference NDArray kernel and return a NDArray to hold the result
     *
     * @param cmdBuf                 The command buffer into which to encode the kernel
     * @param sourceArrays           The list of sources for the filter in a NSArray.
     *                               Ordering to be defined by subclass
     * @param outGradientState       If non-nil, the address output gradient state is written to this address
     * @param outputStateIsTemporary If YES, the state if any will be allocated to contain temporary textures and buffers as needed
     * @return A newly allocated MPSNDArray that will contain the result of the calculation
     * when the command buffer completes successfully.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceArrays:resultState:outputStateIsTemporary:")
    public native MPSNDArray encodeToCommandBufferSourceArraysResultStateOutputStateIsTemporary(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, NSArray<? extends MPSNDArray> sourceArrays,
            @ReferenceInfo(type = MPSState.class) Ptr<MPSState> outGradientState, boolean outputStateIsTemporary);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNDArrayMultiaryKernel init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNDArrayMultiaryKernel initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding support
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNDArrayMultiaryKernel initWithCoderDevice(NSCoder coder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSNDArrayMultiaryKernel initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:sourceCount:")
    public native MPSNDArrayMultiaryKernel initWithDeviceSourceCount(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            @NUInt long count);

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
