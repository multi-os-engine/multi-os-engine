package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Reduces aliasing in an image by accumulating samples over multiple frames
 * 
 * The color for the previous frame will be sampled using the provided motion vector
 * texture and blended with the current frame according to the blendFactor property. The colors
 * from the previous frame will be clamped to the color-space bounding box formed by the center
 * pixel's neighbors to avoid reprojection artifacts, and the motion vector texture will be
 * dilated to avoid aliased silhouette edges under motion.
 * 
 * For the best result, the sample positions produced by the renderer should be jittered every
 * frame, ideally using a low discrepency sequence. This will ensure that different sample
 * positions along edges will be visited over time even if the camera is not moving. This will
 * also reduce aliasing due to textures and high-frequency shading.
 * 
 * For reference, see "High-Quality Temporal Supersampling" by Karis.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSTemporalAA extends MPSKernel implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSTemporalAA(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSTemporalAA alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSTemporalAA allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * How much to blend the current frame with the previous frame during temporal antialiasing.
     * The final value is given by
     * current * blendFactor + previous * (1 - blendFactor). Must be between zero
     * and one, inclusive. Defaults to 0.1.
     */
    @Generated
    @Selector("blendFactor")
    public native float blendFactor();

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:device:")
    public native MPSTemporalAA copyWithZoneDevice(@Nullable VoidPtr zone,
            @Nullable @Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Encode temporal antialiasing a command buffer
     * 
     * The motion vector texture must be at least a two channel texture representing how
     * many texels each texel in the source image(s) have moved since the previous frame. The remaining
     * channels will be ignored if present. This texture may be nil, in which case the motion vector is
     * assumed to be zero, which is suitable for static images.
     * 
     * The depth texture must contain the depth values for directly visible geometry for the current
     * frame for each pixel. The first channel must store the depth value from zero to infinity.
     * The depth texture may be nil, but this will prevent motion vectors from being dilated and
     * may introduce aliasing along silhouette edges.
     * 
     * The destination texture should be used as the previous texture in the next frame.
     * 
     * @param commandBuffer       Command buffer to encode into
     * @param sourceTexture       Current frame to denoise
     * @param previousTexture     Previous denoised frame to reproject into current
     *                            frame
     * @param destinationTexture  Output blended image
     * @param motionVectorTexture Motion vector texture
     * @param depthTexture        The depth values for the current frame
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceTexture:previousTexture:destinationTexture:motionVectorTexture:depthTexture:")
    public native void encodeToCommandBufferSourceTexturePreviousTextureDestinationTextureMotionVectorTextureDepthTexture(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture previousTexture,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture,
            @Nullable @Mapped(ObjCObjectMapper.class) MTLTexture motionVectorTexture,
            @Nullable @Mapped(ObjCObjectMapper.class) MTLTexture depthTexture);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSTemporalAA init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSTemporalAA initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSTemporalAA initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSTemporalAA initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

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
    public static native MPSTemporalAA new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * How much to blend the current frame with the previous frame during temporal antialiasing.
     * The final value is given by
     * current * blendFactor + previous * (1 - blendFactor). Must be between zero
     * and one, inclusive. Defaults to 0.1.
     */
    @Generated
    @Selector("setBlendFactor:")
    public native void setBlendFactor(float value);

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
