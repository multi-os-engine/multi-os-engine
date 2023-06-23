package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metalperformanceshaders.protocol.MPSCNNInstanceNormalizationDataSource;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSCNNInstanceNormalization
 * [@dependency] This depends on Metal.framework
 * 
 * This kernel normalizes each image, on a per-channel basis, to
 * have zero mean and unit variance:
 * 
 * for each image:
 * for each channel:
 * y = (x - mean) * gamma / sqrt(variance + epsilon) + beta;
 * 
 * API-Since: 11.3
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNInstanceNormalization extends MPSCNNKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNInstanceNormalization(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNInstanceNormalization alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNInstanceNormalization allocWithZone(VoidPtr zone);

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

    /**
     * The data source that the object was initialized with
     */
    @NotNull
    @Generated
    @Selector("dataSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNInstanceNormalizationDataSource dataSource();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] epsilon
     * 
     * The epsilon value used to bias the variance when normalizing.
     */
    @Generated
    @Selector("epsilon")
    public native float epsilon();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNInstanceNormalization init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNInstanceNormalization initWithCoder(@NotNull NSCoder aDecoder);

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
     * @return A new MPSCNNInstanceNormalization object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNInstanceNormalization initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNInstanceNormalization initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize a MPSCNNInstanceNormalization kernel on a device.
     * 
     * @param dataSource An object conforming to the MPSCNNInstanceNormalizationDataSource
     *                   protocol which
     */
    @Generated
    @Selector("initWithDevice:dataSource:")
    public native MPSCNNInstanceNormalization initWithDeviceDataSource(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @NotNull @Mapped(ObjCObjectMapper.class) MPSCNNInstanceNormalizationDataSource dataSource);

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
    public static native MPSCNNInstanceNormalization new_objc();

    /**
     * Reload data using a data source.
     * 
     * @param dataSource The data source which will provide the gamma and beta terms
     *                   to scale and bias the normalized result respectively.
     * 
     *                   API-Since: 11.3
     *                   Deprecated-Since: 12.0
     */
    @Deprecated
    @Generated
    @Selector("reloadDataSource:")
    public native void reloadDataSource(
            @NotNull @Mapped(ObjCObjectMapper.class) MPSCNNInstanceNormalizationDataSource dataSource);

    /**
     * Reinitialize the filter using the data source provided at kernel initialization.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("reloadGammaAndBetaFromDataSource")
    public native void reloadGammaAndBetaFromDataSource();

    /**
     * Reload data using new gamma and beta terms contained within an
     * MPSCNNInstanceNormalizationGradientState object.
     * 
     * @param commandBuffer     The command buffer on which to encode the reload.
     * 
     * @param gammaAndBetaState The state containing the updated weights which are to
     *                          be reloaded.
     */
    @Generated
    @Selector("reloadGammaAndBetaWithCommandBuffer:gammaAndBetaState:")
    public native void reloadGammaAndBetaWithCommandBufferGammaAndBetaState(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull MPSCNNNormalizationGammaAndBetaState gammaAndBetaState);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Return a MPSCNNInstanceNormalizationGradientState object for the provided
     * source image, source states, and destination image.
     */
    @Nullable
    @Generated
    @Selector("resultStateForSourceImage:sourceStates:destinationImage:")
    public native MPSCNNInstanceNormalizationGradientState resultStateForSourceImageSourceStatesDestinationImage(
            @NotNull MPSImage sourceImage, @Nullable NSArray<? extends MPSState> sourceStates,
            @NotNull MPSImage destinationImage);

    /**
     * [@property] epsilon
     * 
     * The epsilon value used to bias the variance when normalizing.
     */
    @Generated
    @Selector("setEpsilon:")
    public native void setEpsilon(float value);

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

    /**
     * Return a temporary MPSCNNInstanceNormalizationGradientState object which may be used with
     * a MPSCNNInstanceNormalization filter.
     */
    @Nullable
    @Generated
    @Selector("temporaryResultStateForCommandBuffer:sourceImage:sourceStates:destinationImage:")
    public native MPSCNNInstanceNormalizationGradientState temporaryResultStateForCommandBufferSourceImageSourceStatesDestinationImage(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NotNull MPSImage sourceImage,
            @Nullable NSArray<? extends MPSState> sourceStates, @NotNull MPSImage destinationImage);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
