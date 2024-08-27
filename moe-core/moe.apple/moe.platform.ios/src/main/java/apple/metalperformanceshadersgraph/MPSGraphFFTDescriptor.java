package apple.metalperformanceshadersgraph;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * This class defines parameters for a fast Fourier transform (FFT) operation.
 * 
 * Use this descriptor with ``MPSGraph/fastFourierTransformWithTensor:axes:descriptor:name:``,
 * ``MPSGraph/realToHermiteanFFTWithTensor:axesTensor:descriptor:name:`` and
 * ``MPSGraph/HermiteanToRealFFTWithTensor:axesTensor:descriptor:name:`` methods.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphFFTDescriptor extends MPSGraphObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSGraphFFTDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSGraphFFTDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MPSGraphFFTDescriptor allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Creates a fast Fourier transform descriptor with default parameter values.
     */
    @Generated
    @Selector("descriptor")
    public static native MPSGraphFFTDescriptor descriptor();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSGraphFFTDescriptor init();

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

    /**
     * A boolean-valued parameter that defines the phase factor sign for Fourier transforms.
     * 
     * When set to `YES` MPSGraph uses the positive phase factor: `exp(+i 2Pi mu nu / n)`, when computing the (inverse)
     * Fourier transform.
     * Otherwise MPSGraph uses the negative phase factor: `exp(-i 2Pi mu nu / n)`, when computing the Fourier transform.
     * Default value: `NO`.
     */
    @Generated
    @Selector("inverse")
    public native boolean inverse();

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
    public static native MPSGraphFFTDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A parameter which controls how MPSGraph rounds the output tensor size for a Hermitean-to-real Fourier transform.
     * 
     * If set to `YES` then MPSGraph rounds the last output dimension of the result tensor in
     * ``MPSGraph/HermiteanToRealFFTWithTensor:axesTensor:descriptor:name:`` to an odd value.
     * Has no effect in the other Fourier transform operations.
     * Default value: `NO`.
     */
    @Generated
    @Selector("roundToOddHermitean")
    public native boolean roundToOddHermitean();

    /**
     * The scaling mode of the FFT operation.
     * 
     * Note that the scaling mode is independent from the phase factor. Default value: `MPSGraphFFTScalingModeNone`.
     */
    @Generated
    @Selector("scalingMode")
    @NUInt
    public native long scalingMode();

    /**
     * A boolean-valued parameter that defines the phase factor sign for Fourier transforms.
     * 
     * When set to `YES` MPSGraph uses the positive phase factor: `exp(+i 2Pi mu nu / n)`, when computing the (inverse)
     * Fourier transform.
     * Otherwise MPSGraph uses the negative phase factor: `exp(-i 2Pi mu nu / n)`, when computing the Fourier transform.
     * Default value: `NO`.
     */
    @Generated
    @Selector("setInverse:")
    public native void setInverse(boolean value);

    /**
     * A parameter which controls how MPSGraph rounds the output tensor size for a Hermitean-to-real Fourier transform.
     * 
     * If set to `YES` then MPSGraph rounds the last output dimension of the result tensor in
     * ``MPSGraph/HermiteanToRealFFTWithTensor:axesTensor:descriptor:name:`` to an odd value.
     * Has no effect in the other Fourier transform operations.
     * Default value: `NO`.
     */
    @Generated
    @Selector("setRoundToOddHermitean:")
    public native void setRoundToOddHermitean(boolean value);

    /**
     * The scaling mode of the FFT operation.
     * 
     * Note that the scaling mode is independent from the phase factor. Default value: `MPSGraphFFTScalingModeNone`.
     */
    @Generated
    @Selector("setScalingMode:")
    public native void setScalingMode(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}