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
 * A state created to record a MPSNDArrayGather kernel properties
 * at the time an -encode call was made.
 * 
 * Must be created with the appropriate MPSNDArray kernel method, for example:
 * 
 * MPSNDArrayGather* gather = [[MPSNDArrayGather alloc] initWithDevice: device];
 * MPSNDArrayGatherGradientState* state = [gather resultStateForSourceArrays:...];
 * 
 * API-Since: 13.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNDArrayGatherGradientState extends MPSNDArrayGradientState {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNDArrayGatherGradientState(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNDArrayGatherGradientState alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNDArrayGatherGradientState allocWithZone(VoidPtr zone);

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
    public native MPSNDArrayGatherGradientState init();

    @Generated
    @Selector("initWithDevice:bufferSize:")
    public native MPSNDArrayGatherGradientState initWithDeviceBufferSize(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long bufferSize);

    @Generated
    @Selector("initWithDevice:resourceList:")
    public native MPSNDArrayGatherGradientState initWithDeviceResourceList(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NotNull MPSStateResourceList resourceList);

    @Generated
    @Selector("initWithDevice:textureDescriptor:")
    public native MPSNDArrayGatherGradientState initWithDeviceTextureDescriptor(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NotNull MTLTextureDescriptor descriptor);

    @Generated
    @Selector("initWithResource:")
    public native MPSNDArrayGatherGradientState initWithResource(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLResource resource);

    @Generated
    @Selector("initWithResources:")
    public native MPSNDArrayGatherGradientState initWithResources(@Nullable NSArray<?> resources);

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
    public static native MPSNDArrayGatherGradientState new_objc();

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
    public static native MPSNDArrayGatherGradientState temporaryStateWithCommandBuffer(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf);

    @NotNull
    @Generated
    @Selector("temporaryStateWithCommandBuffer:bufferSize:")
    public static native MPSNDArrayGatherGradientState temporaryStateWithCommandBufferBufferSize(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, @NUInt long bufferSize);

    @NotNull
    @Generated
    @Selector("temporaryStateWithCommandBuffer:resourceList:")
    public static native MPSNDArrayGatherGradientState temporaryStateWithCommandBufferResourceList(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull MPSStateResourceList resourceList);

    @NotNull
    @Generated
    @Selector("temporaryStateWithCommandBuffer:textureDescriptor:")
    public static native MPSNDArrayGatherGradientState temporaryStateWithCommandBufferTextureDescriptor(
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
