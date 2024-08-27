package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.MTLTextureDescriptor;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLResource;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSCNNConvolutionTransposeGradientState
 * 
 * The MPSCNNConvolutionTransposeGradientState is returned by resultStateForSourceImage:sourceStates method on
 * MPSCNNConvolutionTranspose object.
 * Note that resultStateForSourceImage:sourceStates:destinationImage creates the object on autoreleasepool.
 * It will be consumed by MPSCNNConvolutionTransposeGradient. It contains reference to MPSCNNConvolutionGradientState
 * object that connects
 * MPSCNNConvolution and its corresponding MPSCNNConvolutionTranspose in forward pass of autoencoder. In an autoencoder
 * forward pass, MPSCNNConvolutionGradientState is produced
 * by MPSCNNConvolution object and is used by corresponding MPSCNNConvolutionTraspose of forward pass that "undo" the
 * corresponding MPSCNNConvolution. It is used to correctly size
 * destination image that is returned on left hand side by encode call MPSCNNConvolutionTranspose as well as
 * automatically set kernelOffsetX/Y on MPSCNNConvolutionTranspose using
 * the offset and other properties of corresponding MPSCNNConvolution object. During training, same
 * MPSCNNConvolutionGradientState object will be consumed by MPSCNNConvolutionGradient
 * object and the MPSCNNConvolutionTransposeGradientState produced by MPSCNNConvolutionTranspose's
 * resultStateForSourceImage:sourceStates:destinationImage will be consumed by
 * MPSCNNConvolutionTransposeGradient object
 * 
 * Note that state objects are not usable across batches i.e. when batch is done you should nuke the state object and
 * create
 * new one for next batch.
 * Weights update process for MPSCNNConvolutionTranspose is same as explained above for MPSCNNConvolution. See comments
 * for MPSCNNConvolutionGradientState.
 * 
 * 
 * API-Since: 13.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNConvolutionTransposeGradientState extends MPSCNNConvolutionGradientState {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNConvolutionTransposeGradientState(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNConvolutionTransposeGradientState alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNConvolutionTransposeGradientState allocWithZone(VoidPtr zone);

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
     * [@property] convolutionTranspose
     * 
     * The convolutionTranspose filter that produced the state.
     */
    @NotNull
    @Generated
    @Selector("convolutionTranspose")
    public native MPSCNNConvolutionTranspose convolutionTranspose();

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
    public native MPSCNNConvolutionTransposeGradientState init();

    @Generated
    @Selector("initWithDevice:bufferSize:")
    public native MPSCNNConvolutionTransposeGradientState initWithDeviceBufferSize(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long bufferSize);

    @Generated
    @Selector("initWithDevice:resourceList:")
    public native MPSCNNConvolutionTransposeGradientState initWithDeviceResourceList(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NotNull MPSStateResourceList resourceList);

    @Generated
    @Selector("initWithDevice:textureDescriptor:")
    public native MPSCNNConvolutionTransposeGradientState initWithDeviceTextureDescriptor(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NotNull MTLTextureDescriptor descriptor);

    @Generated
    @Selector("initWithResource:")
    public native MPSCNNConvolutionTransposeGradientState initWithResource(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLResource resource);

    @Generated
    @Selector("initWithResources:")
    public native MPSCNNConvolutionTransposeGradientState initWithResources(@Nullable NSArray<?> resources);

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
    public static native MPSCNNConvolutionTransposeGradientState new_objc();

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
    public static native MPSCNNConvolutionTransposeGradientState temporaryStateWithCommandBuffer(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf);

    @NotNull
    @Generated
    @Selector("temporaryStateWithCommandBuffer:bufferSize:")
    public static native MPSCNNConvolutionTransposeGradientState temporaryStateWithCommandBufferBufferSize(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, @NUInt long bufferSize);

    @NotNull
    @Generated
    @Selector("temporaryStateWithCommandBuffer:resourceList:")
    public static native MPSCNNConvolutionTransposeGradientState temporaryStateWithCommandBufferResourceList(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull MPSStateResourceList resourceList);

    @NotNull
    @Generated
    @Selector("temporaryStateWithCommandBuffer:textureDescriptor:")
    public static native MPSCNNConvolutionTransposeGradientState temporaryStateWithCommandBufferTextureDescriptor(
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
