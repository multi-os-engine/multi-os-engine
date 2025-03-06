package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLDevice;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * MPSNDArrayQuantizedMatrixMultiplication
 * 
 * [@dependency] This depends on Metal.framework.
 * 
 * A quantized matrix multiplication kernel: C = AB, where each input A and B can be quantized.
 * 
 * The kernel works with 2-8 inputs, order of inputs: First all LHS inputs, then all RHS inputs.
 * The order of inputs for LUT based LHS or RHS: 1) quantized input 2) Lookup Table.
 * The order of inputs for affine LHS or RHS: 1) quantized input 2) scale 3) zeropoint 4) minValue.
 * The full order of inputs for the encode methods is:
 * `[LHS, RHS, <LHS quantization inputs>, <RHS quantization inputs>]`,
 * where `LHS` is the left input (quantized or float) `RHS` is the right input (quantized or float) and
 * `<LHS quantization inputs>` are the auxiliary quantization inputs for the LHS array (scales, zeropoints etc).
 * and `<RHS quantization inputs>` are the auxiliary quantization input for the RHS array.
 * The inputs are provided as a compacted `NSArray<MPSNDArray *>`, for example for computing
 * `C = A * B^T` where `A` is quantized with a LUT and `B` is quantized with affine quantization that
 * uses scale and minValue the array of inputs is:
 * ` [ Aq, Bq^T, ALUT, BScale^T, BMin^T ] `.
 * NOTE: For affine scale, zeropoint and minValue must have same transposes as quantized input.
 * 
 * 
 * API-Since: 18.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNDArrayQuantizedMatrixMultiplication extends MPSNDArrayMatrixMultiplication {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNDArrayQuantizedMatrixMultiplication(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNDArrayQuantizedMatrixMultiplication alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MPSNDArrayQuantizedMatrixMultiplication allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
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
    public native MPSNDArrayQuantizedMatrixMultiplication init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNDArrayQuantizedMatrixMultiplication initWithCoder(@NotNull NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNDArrayQuantizedMatrixMultiplication initWithCoderDevice(@NotNull NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) @NotNull Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSNDArrayQuantizedMatrixMultiplication initWithDevice(
            @Mapped(ObjCObjectMapper.class) @NotNull Object device);

    /**
     * Initializes a quantized matrix multiplication kernel.
     * 
     * @param leftQuantizationDescriptor  The quantization definition for the LHS input.
     * @param rightQuantizationDescriptor The quantization definition for the RHS input.
     * @return A new valid quantized matrix multiplication kernel.
     * 
     * 
     *         API-Since: 18.0
     */
    @Generated
    @Selector("initWithDevice:leftQuantizationDescriptor:rightQuantizationDescriptor:")
    public native MPSNDArrayQuantizedMatrixMultiplication initWithDeviceLeftQuantizationDescriptorRightQuantizationDescriptor(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device,
            @Nullable MPSNDArrayQuantizationDescriptor leftQuantizationDescriptor,
            @Nullable MPSNDArrayQuantizationDescriptor rightQuantizationDescriptor);

    @Generated
    @Selector("initWithDevice:sourceCount:")
    public native MPSNDArrayQuantizedMatrixMultiplication initWithDeviceSourceCount(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device, @NUInt long count);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSNDArrayQuantizedMatrixMultiplication new_objc();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}