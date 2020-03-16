package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLTexture;
import apple.metalperformanceshaders.protocol.MPSSVGFTextureAllocator;
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
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSSVGFDenoiser extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSSVGFDenoiser(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSSVGFDenoiser alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("bilateralFilterIterations")
    @NUInt
    public native long bilateralFilterIterations();

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
    @Selector("clearTemporalHistory")
    public native void clearTemporalHistory();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeToCommandBuffer:sourceTexture:destinationTexture:sourceTexture2:destinationTexture2:motionVectorTexture:depthNormalTexture:previousDepthNormalTexture:")
    public native void encodeToCommandBufferSourceTextureDestinationTextureSourceTexture2DestinationTexture2MotionVectorTextureDepthNormalTexturePreviousDepthNormalTexture(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture,
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> destinationTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture2,
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> destinationTexture2,
            @Mapped(ObjCObjectMapper.class) MTLTexture motionVectorTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture depthNormalTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture previousDepthNormalTexture);

    @Generated
    @Selector("encodeToCommandBuffer:sourceTexture:motionVectorTexture:depthNormalTexture:previousDepthNormalTexture:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture encodeToCommandBufferSourceTextureMotionVectorTextureDepthNormalTexturePreviousDepthNormalTexture(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture motionVectorTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture depthNormalTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture previousDepthNormalTexture);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSSVGFDenoiser init();

    @Generated
    @Selector("initWithDevice:")
    public native MPSSVGFDenoiser initWithDevice(@Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("initWithSVGF:textureAllocator:")
    public native MPSSVGFDenoiser initWithSVGFTextureAllocator(MPSSVGF svgf,
            @Mapped(ObjCObjectMapper.class) MPSSVGFTextureAllocator textureAllocator);

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
    @Selector("releaseTemporaryTextures")
    public native void releaseTemporaryTextures();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setBilateralFilterIterations:")
    public native void setBilateralFilterIterations(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("svgf")
    public native MPSSVGF svgf();

    @Generated
    @Selector("textureAllocator")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSSVGFTextureAllocator textureAllocator();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}