package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.struct.MTLSize;
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
 * MPSCNNDropout
 * [@dependency] This depends on Metal.framework
 * 
 * Dropout is a regularization technique used to prevent neural networks from
 * overfitting during training. With probability keepProbability, this filter
 * outputs the input element scaled by 1 / keepProbability. Otherwise, it
 * outputs 0. Each input element is kept or dropped independently. The scaling
 * is performed to keep the energy of the output unchanged.
 * 
 * API-Since: 11.3
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNDropout extends MPSCNNKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNDropout(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNDropout alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNDropout allocWithZone(VoidPtr zone);

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
    @Selector("init")
    public native MPSCNNDropout init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNDropout initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * <NSSecureCoding> support
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNDropout initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNDropout initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Standard init with default properties per filter type.
     * 
     * @param device             The device that the filter will be used on.
     * @param keepProbability    The probability that each element in the input is kept.
     *                           The valid range is (0.0f, 1.0f).
     * @param seed               The seed used to generate random numbers.
     * @param maskStrideInPixels The mask stride in the x, y, and z dimensions, which
     *                           allows for the broadcasting of mask data. The only valid
     *                           values are 0 and 1 for each dimension. For no
     *                           broadcasting, set the values for each dimension to 1.
     *                           For broadcasting, set desired values to 0.
     * @return A valid MPSCNNDropout object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:keepProbability:seed:maskStrideInPixels:")
    public native MPSCNNDropout initWithDeviceKeepProbabilitySeedMaskStrideInPixels(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, float keepProbability, @NUInt long seed,
            @ByValue MTLSize maskStrideInPixels);

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
     * [@property] keepProbability
     * 
     * The probability that each element in the input is kept.
     * The valid range is (0.0f, 1.0f).
     */
    @Generated
    @Selector("keepProbability")
    public native float keepProbability();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] maskStrideInPixels
     * 
     * The mask stride in the x, y, and x dimensions, which
     * allows for the broadcasting the mask data.
     * 
     * The only valid values are 0 and 1 for each dimension.
     * For no broadcasting, set the values for each dimension
     * to 1. For broadcasting, set desired values to 0.
     */
    @Generated
    @Selector("maskStrideInPixels")
    @ByValue
    public native MTLSize maskStrideInPixels();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSCNNDropout new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Nullable
    @Generated
    @Selector("resultStateForSourceImage:sourceStates:destinationImage:")
    public native MPSCNNDropoutGradientState resultStateForSourceImageSourceStatesDestinationImage(
            @NotNull MPSImage sourceImage, @Nullable NSArray<? extends MPSState> sourceStates,
            @NotNull MPSImage destinationImage);

    /**
     * [@property] seed
     * 
     * The seed used to generate random numbers.
     */
    @Generated
    @Selector("seed")
    @NUInt
    public native long seed();

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

    @Nullable
    @Generated
    @Selector("temporaryResultStateForCommandBuffer:sourceImage:sourceStates:destinationImage:")
    public native MPSCNNDropoutGradientState temporaryResultStateForCommandBufferSourceImageSourceStatesDestinationImage(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NotNull MPSImage sourceImage,
            @Nullable NSArray<? extends MPSState> sourceStates, @NotNull MPSImage destinationImage);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
