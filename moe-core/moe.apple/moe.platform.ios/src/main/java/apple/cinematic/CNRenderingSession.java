package apple.cinematic;

import apple.NSObject;
import apple.corefoundation.struct.CGAffineTransform;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLCommandQueue;
import apple.metal.protocol.MTLTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
 * API-Since: 17.0
 */
@Generated
@Library("Cinematic")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNRenderingSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CNRenderingSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CNRenderingSession alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CNRenderingSession allocWithZone(VoidPtr zone);

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
    @Selector("commandQueue")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native MTLCommandQueue commandQueue();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The pixel format types supported for the output destination.
     * 
     * Use with kCVPixelBufferPixelFormatTypeKey in the video compositor's requiredPixelBufferAttributesForRenderContext
     * dictionary when implementing AVVideoCompositing.
     */
    @Generated
    @Selector("destinationPixelFormatTypes")
    @NotNull
    public static native NSArray<? extends NSNumber> destinationPixelFormatTypes();

    /**
     * Encode a command to render a shallow depth of field (SDoF) image to a pixel buffer.
     * - Parameters:
     * - commandBuffer: the metal command buffer on which to encode the command
     * - frameAttributes: controls the focus distance and aperture of the rendering
     * - sourceImage: a pixel buffer read from the cinematicVideoTrack
     * - sourceDisparity: a pixel buffer read from the cinematicDisparityTrack
     * - destinationImage: the pixel buffer to which the SDoF image is rendered
     * - Returns: whether encoding the render command was successful
     */
    @Generated
    @Selector("encodeRenderToCommandBuffer:frameAttributes:sourceImage:sourceDisparity:destinationImage:")
    public native boolean encodeRenderToCommandBufferFrameAttributesSourceImageSourceDisparityDestinationImage(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLCommandBuffer commandBuffer,
            @NotNull CNRenderingSessionFrameAttributes frameAttributes, @NotNull CVBufferRef sourceImage,
            @NotNull CVBufferRef sourceDisparity, @NotNull CVBufferRef destinationImage);

    /**
     * Encode a command to render a shallow depth of field (SDoF) image to two metal textures as luma and chroma.
     * - Parameters:
     * - commandBuffer: the metal command buffer on which to encode the command
     * - frameAttributes: controls the focus distance and aperture of the rendering
     * - sourceImage: a pixel buffer read from the cinematicVideoTrack
     * - sourceDisparity: a pixel buffer read from the cinematicDisparityTrack
     * - destinationLuma: a metal texture to which the luma of the SDoF image is rendered
     * - destinationChroma: a metal texture to which the chroma of the SDoF image is rendered
     * - Returns: whether encoding the render command was successful
     */
    @Generated
    @Selector("encodeRenderToCommandBuffer:frameAttributes:sourceImage:sourceDisparity:destinationLuma:destinationChroma:")
    public native boolean encodeRenderToCommandBufferFrameAttributesSourceImageSourceDisparityDestinationLumaDestinationChroma(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLCommandBuffer commandBuffer,
            @NotNull CNRenderingSessionFrameAttributes frameAttributes, @NotNull CVBufferRef sourceImage,
            @NotNull CVBufferRef sourceDisparity, @Mapped(ObjCObjectMapper.class) @NotNull MTLTexture destinationLuma,
            @Mapped(ObjCObjectMapper.class) @NotNull MTLTexture destinationChroma);

    /**
     * Encode a command to render a shallow depth of field (SDoF) image to a metal texture as RGBA.
     * - Parameters:
     * - commandBuffer: the metal command buffer on which to encode the command
     * - frameAttributes: controls the focus distance and aperture of the rendering
     * - sourceImage: a pixel buffer read from the cinematicVideoTrack
     * - sourceDisparity: a pixel buffer read from the cinematicDisparityTrack
     * - destinationRGBA: a metal texture to which the SDoF image is rendered in RGBA format
     * - Returns: whether encoding the render command was successful
     */
    @Generated
    @Selector("encodeRenderToCommandBuffer:frameAttributes:sourceImage:sourceDisparity:destinationRGBA:")
    public native boolean encodeRenderToCommandBufferFrameAttributesSourceImageSourceDisparityDestinationRGBA(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLCommandBuffer commandBuffer,
            @NotNull CNRenderingSessionFrameAttributes frameAttributes, @NotNull CVBufferRef sourceImage,
            @NotNull CVBufferRef sourceDisparity, @Mapped(ObjCObjectMapper.class) @NotNull MTLTexture destinationRGBA);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CNRenderingSession init();

    @Generated
    @Selector("initWithCommandQueue:sessionAttributes:preferredTransform:quality:")
    public native CNRenderingSession initWithCommandQueueSessionAttributesPreferredTransformQuality(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLCommandQueue commandQueue,
            @NotNull CNRenderingSessionAttributes sessionAttributes, @ByValue CGAffineTransform preferredTransform,
            @NInt long quality);

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
    public static native CNRenderingSession new_objc();

    @Generated
    @Selector("preferredTransform")
    @ByValue
    public native CGAffineTransform preferredTransform();

    @Generated
    @Selector("quality")
    @NInt
    public native long quality();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("sessionAttributes")
    @NotNull
    public native CNRenderingSessionAttributes sessionAttributes();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The pixel format types supported for the input source.
     * 
     * Use with kCVPixelBufferPixelFormatTypeKey in the video compositor's sourcePixelBufferAttributes dictionary when
     * implementing AVVideoCompositing.
     */
    @Generated
    @Selector("sourcePixelFormatTypes")
    @NotNull
    public static native NSArray<? extends NSNumber> sourcePixelFormatTypes();

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