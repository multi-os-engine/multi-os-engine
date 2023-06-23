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
 * MPSCNNGroupNormalizationGradientState
 * [@dependency] This depends on Metal.framework
 * 
 * A state to hold information necessary to execute a gradient
 * pass for MPSCNNGroupNormalization. Gradient states should
 * be created by using the forward kernel's methods. This will
 * ensure that the state captures all information necessary to
 * execute the corresponding gradient pass.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNGroupNormalizationGradientState extends MPSNNGradientState {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNGroupNormalizationGradientState(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNGroupNormalizationGradientState alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNGroupNormalizationGradientState allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Return an MTLBuffer object with the state's current beta values..
     */
    @Nullable
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
     * Return an MTLBuffer object with the state's current gamma values.
     */
    @Nullable
    @Generated
    @Selector("gamma")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer gamma();

    /**
     * [@property] The MTLBuffer containing the gradient values for beta.
     */
    @NotNull
    @Generated
    @Selector("gradientForBeta")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer gradientForBeta();

    /**
     * [@property] The MTLBuffer containing the gradient values for gamma.
     */
    @NotNull
    @Generated
    @Selector("gradientForGamma")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer gradientForGamma();

    /**
     * The MPSCNNGroupNormalization object that created this state object.
     */
    @NotNull
    @Generated
    @Selector("groupNormalization")
    public native MPSCNNGroupNormalization groupNormalization();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNGroupNormalizationGradientState init();

    @Generated
    @Selector("initWithDevice:bufferSize:")
    public native MPSCNNGroupNormalizationGradientState initWithDeviceBufferSize(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long bufferSize);

    @Generated
    @Selector("initWithDevice:resourceList:")
    public native MPSCNNGroupNormalizationGradientState initWithDeviceResourceList(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NotNull MPSStateResourceList resourceList);

    @Generated
    @Selector("initWithDevice:textureDescriptor:")
    public native MPSCNNGroupNormalizationGradientState initWithDeviceTextureDescriptor(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NotNull MTLTextureDescriptor descriptor);

    @Generated
    @Selector("initWithResource:")
    public native MPSCNNGroupNormalizationGradientState initWithResource(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLResource resource);

    @Generated
    @Selector("initWithResources:")
    public native MPSCNNGroupNormalizationGradientState initWithResources(@Nullable NSArray<?> resources);

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
    public static native MPSCNNGroupNormalizationGradientState new_objc();

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
    public static native MPSCNNGroupNormalizationGradientState temporaryStateWithCommandBuffer(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf);

    @NotNull
    @Generated
    @Selector("temporaryStateWithCommandBuffer:bufferSize:")
    public static native MPSCNNGroupNormalizationGradientState temporaryStateWithCommandBufferBufferSize(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, @NUInt long bufferSize);

    @NotNull
    @Generated
    @Selector("temporaryStateWithCommandBuffer:resourceList:")
    public static native MPSCNNGroupNormalizationGradientState temporaryStateWithCommandBufferResourceList(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull MPSStateResourceList resourceList);

    @NotNull
    @Generated
    @Selector("temporaryStateWithCommandBuffer:textureDescriptor:")
    public static native MPSCNNGroupNormalizationGradientState temporaryStateWithCommandBufferTextureDescriptor(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, @NotNull MTLTextureDescriptor descriptor);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
