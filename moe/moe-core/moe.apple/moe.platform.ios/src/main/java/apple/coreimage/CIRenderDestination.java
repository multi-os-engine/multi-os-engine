package apple.coreimage;

import apple.NSObject;
import apple.coregraphics.opaque.CGColorSpaceRef;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.iosurface.IOSurface;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLTexture;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIRenderDestination extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CIRenderDestination(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIRenderDestination alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("alphaMode")
    @NUInt
    public native long alphaMode();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("blendKernel")
    public native CIBlendKernel blendKernel();

    @Generated
    @Selector("blendsInDestinationColorSpace")
    public native boolean blendsInDestinationColorSpace();

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
    @Selector("colorSpace")
    public native CGColorSpaceRef colorSpace();

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
    @Selector("height")
    @NUInt
    public native long height();

    @Generated
    @Selector("init")
    public native CIRenderDestination init();

    @Generated
    @Selector("initWithBitmapData:width:height:bytesPerRow:format:")
    public native CIRenderDestination initWithBitmapDataWidthHeightBytesPerRowFormat(VoidPtr data, @NUInt long width,
            @NUInt long height, @NUInt long bytesPerRow, int format);

    @Generated
    @Selector("initWithGLTexture:target:width:height:")
    public native CIRenderDestination initWithGLTextureTargetWidthHeight(int texture, int target, @NUInt long width,
            @NUInt long height);

    @Generated
    @Selector("initWithIOSurface:")
    public native CIRenderDestination initWithIOSurface(IOSurface surface);

    @Generated
    @Selector("initWithMTLTexture:commandBuffer:")
    public native CIRenderDestination initWithMTLTextureCommandBuffer(
            @Mapped(ObjCObjectMapper.class) MTLTexture texture,
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer);

    @Generated
    @Selector("initWithPixelBuffer:")
    public native CIRenderDestination initWithPixelBuffer(CVBufferRef pixelBuffer);

    @Generated
    @Selector("initWithWidth:height:pixelFormat:commandBuffer:mtlTextureProvider:")
    public native CIRenderDestination initWithWidthHeightPixelFormatCommandBufferMtlTextureProvider(@NUInt long width,
            @NUInt long height, @NUInt long pixelFormat, @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @ObjCBlock(name = "call_initWithWidthHeightPixelFormatCommandBufferMtlTextureProvider") Block_initWithWidthHeightPixelFormatCommandBufferMtlTextureProvider block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithWidthHeightPixelFormatCommandBufferMtlTextureProvider {
        @Generated
        @MappedReturn(ObjCObjectMapper.class)
        Object call_initWithWidthHeightPixelFormatCommandBufferMtlTextureProvider();
    }

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
    @Selector("isClamped")
    public native boolean isClamped();

    @Generated
    @Selector("isDithered")
    public native boolean isDithered();

    @Generated
    @Selector("isFlipped")
    public native boolean isFlipped();

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
    @Selector("setAlphaMode:")
    public native void setAlphaMode(@NUInt long value);

    @Generated
    @Selector("setBlendKernel:")
    public native void setBlendKernel(CIBlendKernel value);

    @Generated
    @Selector("setBlendsInDestinationColorSpace:")
    public native void setBlendsInDestinationColorSpace(boolean value);

    @Generated
    @Selector("setClamped:")
    public native void setClamped(boolean value);

    @Generated
    @Selector("setColorSpace:")
    public native void setColorSpace(CGColorSpaceRef value);

    @Generated
    @Selector("setDithered:")
    public native void setDithered(boolean value);

    @Generated
    @Selector("setFlipped:")
    public native void setFlipped(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("width")
    @NUInt
    public native long width();
}