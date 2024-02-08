package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.MTLTextureDescriptor;
import apple.metal.protocol.MTLBuffer;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLResource;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSCNNNormalizationGammaAndBetaState
 * [@description] A state which contains gamma and beta terms used to apply a scale
 * and bias in either an MPSCNNInstanceNormalization or MPSCNNBatchNormalization
 * operation.
 * 
 * API-Since: 11.3
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNNormalizationGammaAndBetaState extends MPSState {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNNormalizationGammaAndBetaState(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNNormalizationGammaAndBetaState alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNNormalizationGammaAndBetaState allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] beta
     * 
     * A MTLBuffer containing the beta terms.
     */
    @NotNull
    @Generated
    @Selector("beta")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer beta();

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

    /**
     * [@property] gamma
     * 
     * A MTLBuffer containing the gamma terms.
     */
    @NotNull
    @Generated
    @Selector("gamma")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer gamma();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNNormalizationGammaAndBetaState init();

    @Generated
    @Selector("initWithDevice:bufferSize:")
    public native MPSCNNNormalizationGammaAndBetaState initWithDeviceBufferSize(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long bufferSize);

    @Generated
    @Selector("initWithDevice:resourceList:")
    public native MPSCNNNormalizationGammaAndBetaState initWithDeviceResourceList(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NotNull MPSStateResourceList resourceList);

    @Generated
    @Selector("initWithDevice:textureDescriptor:")
    public native MPSCNNNormalizationGammaAndBetaState initWithDeviceTextureDescriptor(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NotNull MTLTextureDescriptor descriptor);

    /**
     * Initialize a MPSCNNNormalizationGammaAndBetaState object using values
     * contained in MTLBuffers.
     * 
     * @param gamma The MTLBuffer containing gamma terms.
     * 
     * @param beta  The MTLBuffer containing beta terms.
     */
    @Generated
    @Selector("initWithGamma:beta:")
    public native MPSCNNNormalizationGammaAndBetaState initWithGammaBeta(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer gamma,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer beta);

    @Generated
    @Selector("initWithResource:")
    public native MPSCNNNormalizationGammaAndBetaState initWithResource(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLResource resource);

    @Generated
    @Selector("initWithResources:")
    public native MPSCNNNormalizationGammaAndBetaState initWithResources(@Nullable NSArray<?> resources);

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
    public static native MPSCNNNormalizationGammaAndBetaState new_objc();

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

    @NotNull
    @Generated
    @Selector("temporaryStateWithCommandBuffer:")
    public static native MPSCNNNormalizationGammaAndBetaState temporaryStateWithCommandBuffer(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf);

    @NotNull
    @Generated
    @Selector("temporaryStateWithCommandBuffer:bufferSize:")
    public static native MPSCNNNormalizationGammaAndBetaState temporaryStateWithCommandBufferBufferSize(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, @NUInt long bufferSize);

    /**
     * Create a temporary MPSCNNNormalizationGammaAndBetaState suitable
     * for a normalization operation on images containing no more than
     * the specified number of feature channels.
     * 
     * @param commandBuffer           The command buffer on which the temporary state will
     *                                be used.
     * 
     * @param numberOfFeatureChannels The number of feature channels used to size the
     *                                state.
     */
    @NotNull
    @Generated
    @Selector("temporaryStateWithCommandBuffer:numberOfFeatureChannels:")
    public static native MPSCNNNormalizationGammaAndBetaState temporaryStateWithCommandBufferNumberOfFeatureChannels(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NUInt long numberOfFeatureChannels);

    @NotNull
    @Generated
    @Selector("temporaryStateWithCommandBuffer:resourceList:")
    public static native MPSCNNNormalizationGammaAndBetaState temporaryStateWithCommandBufferResourceList(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull MPSStateResourceList resourceList);

    @NotNull
    @Generated
    @Selector("temporaryStateWithCommandBuffer:textureDescriptor:")
    public static native MPSCNNNormalizationGammaAndBetaState temporaryStateWithCommandBufferTextureDescriptor(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, @NotNull MTLTextureDescriptor descriptor);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
