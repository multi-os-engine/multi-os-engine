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

/**
 * This is a lightweight API to allow clients to specify all the
 * attributes of a render that pertain to the render's destination.
 * It is intended to be used for issuing renders that return to the
 * caller as soon as all the work has been issued but before it completes/
 */
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CIRenderDestination allocWithZone(VoidPtr zone);

    /**
     * This property will defualt to an appropriate value given
     * the object that the CIRenderDestination was initialized with.
     * This property can be set to a different value if desired.
     */
    @Generated
    @Selector("alphaMode")
    @NUInt
    public native long alphaMode();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Allow client to specify a CIBlendKernel (e.g. CIBlendKernel.sourceOver)
     * to be used on the destination.
     */
    @Generated
    @Selector("blendKernel")
    public native CIBlendKernel blendKernel();

    /**
     * If true, then the blendKernel is applied in the destination's colorSpace.
     * If false, then the blendKernel is applied in the CIContext's working colorspace.
     * This is false by default.
     */
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

    /**
     * This property will defualt to an appropriate value given
     * the object that the CIRenderDestination was initialized with.
     * This property can be set to a different colorSpace if desired.
     * This property can be set to nil to disable color matching
     * from the working space to the destination.
     */
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

    /**
     * Create a CIRenderDestination based on client-managed buffer.
     * <p>
     * The 'data' parameter must point to a buffer that is at least bytesPerRow * height bytes in size.
     * <p>
     * The destination's 'colorspace' property will default a CGColorSpace created with kCGColorSpaceSRGB,
     * kCGColorSpaceExtendedSRGB, or kCGColorSpaceGenericGrayGamma2_2.
     */
    @Generated
    @Selector("initWithBitmapData:width:height:bytesPerRow:format:")
    public native CIRenderDestination initWithBitmapDataWidthHeightBytesPerRowFormat(VoidPtr data, @NUInt long width,
            @NUInt long height, @NUInt long bytesPerRow, int format);

    /**
     * Create a CIRenderDestination based on an OpenGL texture.
     * <p>
     * Rendering to a GLTexture-backed CIRenderDestination is only supported by GLContext-backed CIContexts.
     * The texture id must be bound to a GLContext that is shared with that of the GLContext-backed CIContext.
     * <p>
     * The destination's 'colorspace' property will default a CGColorSpace created with kCGColorSpaceSRGB,
     * kCGColorSpaceExtendedSRGB, or kCGColorSpaceGenericGrayGamma2_2.
     */
    @Generated
    @Selector("initWithGLTexture:target:width:height:")
    public native CIRenderDestination initWithGLTextureTargetWidthHeight(int texture, int target, @NUInt long width,
            @NUInt long height);

    /**
     * Create a CIRenderDestination based on an IOSurface object.
     * <p>
     * The destination's 'colorspace' property will default a CGColorSpace created by,
     * querying the IOSurface attributes.
     */
    @Generated
    @Selector("initWithIOSurface:")
    public native CIRenderDestination initWithIOSurface(IOSurface surface);

    /**
     * A render to a MTLTexture-backed CIRenderDestination is only supported by MTLTexture-backed CIContexts.
     * The texture must have a MTLTextureType of MTLTextureType2D
     * <p>
     * An optional MTLCommandBuffer can be specified, with which to use for rendering to the MTLTexture.
     * NOTE: Rendering to a texture initialized with a commandBuffer requires encoding all the commands to render an
     * image into the specified buffer.
     * This may impact system responsiveness and may result in higher memory usage if the image requires many passes to
     * render.
     * To avoid this impact, it is recommended to create a context using [CIContext contextWithMTLCommandQueue:] and
     * create the CIRenderDestination without specifying a buffer.
     * <p>
     * The destination's 'colorspace' property will default a CGColorSpace created with kCGColorSpaceSRGB,
     * kCGColorSpaceExtendedSRGB, or kCGColorSpaceGenericGrayGamma2_2.
     */
    @Generated
    @Selector("initWithMTLTexture:commandBuffer:")
    public native CIRenderDestination initWithMTLTextureCommandBuffer(
            @Mapped(ObjCObjectMapper.class) MTLTexture texture,
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer);

    /**
     * Create a CIRenderDestination based on a CVPixelBufferRef object.
     * <p>
     * The destination's 'colorspace' property will default a CGColorSpace created by,
     * querying the CVPixelBufferRef attributes.
     */
    @Generated
    @Selector("initWithPixelBuffer:")
    public native CIRenderDestination initWithPixelBuffer(CVBufferRef pixelBuffer);

    /**
     * Create a CIRenderDestination based on a Metal texture.
     * <p>
     * Rendering to a MTLTexture-backed CIRenderDestination is only supported by MTLTexture-backed CIContexts.
     * The provider 'block' will be called lazily when the destination is rendered to.
     * The block must return a texture with a MTLTextureType of MTLTextureType2D.
     * The 'width', 'height' and 'pixelFormat' argument values should be the same as the
     * width, height and pixelFormat of the MTLTexture that will be returned by 'block'
     * <p>
     * An optional MTLCommandBuffer can be specified, with which to use for rendering to the MTLTexture.
     * NOTE: Rendering to a texture initialized with a commandBuffer requires encoding all the commands to render an
     * image into the specified buffer.
     * This may impact system responsiveness and may result in higher memory usage if the image requires many passes to
     * render.
     * To avoid this impact, it is recommended to create a context using [CIContext contextWithMTLCommandQueue:] and
     * create the CIRenderDestination without specifying a buffer.
     * <p>
     * The destination's 'colorspace' property will default a CGColorSpace created with kCGColorSpaceSRGB,
     * kCGColorSpaceExtendedSRGB, or kCGColorSpaceGenericGrayGamma2_2.
     */
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

    /**
     * If true, the render will clamp color channels
     * to 0..alpha if 'alphaMode' is premultiplied otherwise 0..1
     * This property is initialized to false if the destination's format supports extended range
     */
    @Generated
    @Selector("isClamped")
    public native boolean isClamped();

    /**
     * Instructs the render to add pseudo-random luma noise given the depth of the destination.
     * The magnitude of the noise is approximatly ±pow(2,-(bitPerComponent+1))
     */
    @Generated
    @Selector("isDithered")
    public native boolean isDithered();

    /**
     * The logical coordinate system of a CIRenderDestination is always cartesian:
     * (0,0) represents the lower-left corner
     * (0.5,0.5) represents the lower-left pixel center
     * (pixelsWide-0.5,pixelsHigh-0.5) represents the upper-right pixel center
     * (pixelsWide,pixelsHigh) represents the upper-right corner.
     * <p>
     * The 'flipped' property controls how pixels this logical coordinate system
     * are stored into the memory of the object backing the destination.
     * <p>
     * If 'flipped' is false, then the base address of the backing stores the
     * pixel centered on the logical coordinate (0.5,0.5)
     * <p>
     * If 'flipped' is true, then the base address of the backing stores the
     * pixel centered on the logical coordinate (0.5,height-0.5)
     */
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
    public static native CIRenderDestination new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * This property will defualt to an appropriate value given
     * the object that the CIRenderDestination was initialized with.
     * This property can be set to a different value if desired.
     */
    @Generated
    @Selector("setAlphaMode:")
    public native void setAlphaMode(@NUInt long value);

    /**
     * Allow client to specify a CIBlendKernel (e.g. CIBlendKernel.sourceOver)
     * to be used on the destination.
     */
    @Generated
    @Selector("setBlendKernel:")
    public native void setBlendKernel(CIBlendKernel value);

    /**
     * If true, then the blendKernel is applied in the destination's colorSpace.
     * If false, then the blendKernel is applied in the CIContext's working colorspace.
     * This is false by default.
     */
    @Generated
    @Selector("setBlendsInDestinationColorSpace:")
    public native void setBlendsInDestinationColorSpace(boolean value);

    /**
     * If true, the render will clamp color channels
     * to 0..alpha if 'alphaMode' is premultiplied otherwise 0..1
     * This property is initialized to false if the destination's format supports extended range
     */
    @Generated
    @Selector("setClamped:")
    public native void setClamped(boolean value);

    /**
     * This property will defualt to an appropriate value given
     * the object that the CIRenderDestination was initialized with.
     * This property can be set to a different colorSpace if desired.
     * This property can be set to nil to disable color matching
     * from the working space to the destination.
     */
    @Generated
    @Selector("setColorSpace:")
    public native void setColorSpace(CGColorSpaceRef value);

    /**
     * Instructs the render to add pseudo-random luma noise given the depth of the destination.
     * The magnitude of the noise is approximatly ±pow(2,-(bitPerComponent+1))
     */
    @Generated
    @Selector("setDithered:")
    public native void setDithered(boolean value);

    /**
     * The logical coordinate system of a CIRenderDestination is always cartesian:
     * (0,0) represents the lower-left corner
     * (0.5,0.5) represents the lower-left pixel center
     * (pixelsWide-0.5,pixelsHigh-0.5) represents the upper-right pixel center
     * (pixelsWide,pixelsHigh) represents the upper-right corner.
     * <p>
     * The 'flipped' property controls how pixels this logical coordinate system
     * are stored into the memory of the object backing the destination.
     * <p>
     * If 'flipped' is false, then the base address of the backing stores the
     * pixel centered on the logical coordinate (0.5,0.5)
     * <p>
     * If 'flipped' is true, then the base address of the backing stores the
     * pixel centered on the logical coordinate (0.5,height-0.5)
     */
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

    /**
     * MARK: Properties
     */
    @Generated
    @Selector("width")
    @NUInt
    public native long width();
}
