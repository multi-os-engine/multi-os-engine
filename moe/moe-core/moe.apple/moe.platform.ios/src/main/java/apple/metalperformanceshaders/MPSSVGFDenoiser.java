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

/**
 * @brief A convenience object which uses an MPSSVGF object to manage the denoising process
 * 
 * @discussion The MPSSVGF object can also be used directly to customize the denoising process.
 * This object keeps track of auxilary textures used by the MPSSVGF object, manages a temporal
 * history, and encodes the entire denoising process into a command buffer.
 * 
 * To use this class, first create and customize an MPSSVGF object. This object allows you to tweak
 * various aspect of the denoising process such as temporal reprojection and bilateral blur settings.
 * Then create a texture allocator object which will allocate temporary textures during denoising.
 * This can either be an object conforming to the MPSSVGFTextureAllocator protocol or an instance of
 * the MPSSVGFDefaultTextureAllocator class. Next, create an MPSSVGFDenoiser object. To perform
 * denoising, assign inputs textures to the denoiser object's properties and call
 * encodeToCommandBuffer:. Finally, read the output from the destinationTexture property. Note that
 * this class can denoise up to two independent textures simultaneously, e.g. specular and diffuse,
 * direct and indirect lighting, shadows and AO, etc.
 * 
 *     @code
 *     MPSSVGF *svgf = [[MPSSVGF alloc] initWithDevice:device];
 * 
 *     // configure svgf properties
 * 
 *     MPSSVGFDefaultTextureAllocator *allocator =
 *         [[MPSSVGFDefaultTextureAllocator alloc] initWithDevice:device];
 * 
 *     MPSSVGFDenoiser *denoiser = [[MPSSVGFDenoiser alloc] initWithSVGF:svgf
 *                                                      textureAllocator:allocator];
 * 
 *     // configure denoiser properties
 * 
 *     denoiser.sourceTexture = noisyTexture;
 *     denoiser.depthNormalTexture = depthNormalTexture;
 *     denoiser.previousDepthNormalTexture = depthNormalTextureFromPreviousFrame;
 *     denoiser.motionVectorTexture = motionVectorTexture;
 * 
 *     [denoiser encodeToCommandBuffer:commandBuffer];
 * 
 *     id <MTLTexture> cleanTexture = denoiser.destinationTexture;
 *     @endcode
 */
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

    /**
     * @brief The number of bilateral filter iterations to run. More iterations will improve quality at
     * the cost of performance. Defaults to 5. Must be at least 1.
     */
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

    /**
     * @brief Clear the temporal history. Reprojection and temporal accumulation will restart on the
     * next call to encodeToCommandBuffer:
     */
    @Generated
    @Selector("clearTemporalHistory")
    public native void clearTemporalHistory();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * @brief Encode denoising kernels to a command buffer
     * 
     * @discussion Simultaneously removes noise from the source texture and optional second source texture,
     * using the additional data in the motion vector, depth/normal, and previous depth/normal textures.
     * Returns the result through the destination texture pointers. The depth/normal texture should be
     * provided as the previous depth/normal texture for the next call to this method. This method will
     * also update an internally managed temporal history to aid the denoising process. To reset this
     * history, call the clearTemporalHistory method. This method will allocate and return several
     * textures from and to the texture allocator the MPSSVGFDenoiser was initialized with. The number
     * of iterations of the bilateral filter is controlled by the bilateralFilterIterations property.
     * Larger numbers of iterations will improve the quality but reduce performance. To configure other
     * parameters of the denoising process, modify the properties of the MPSSVGF object the
     * MPSSVGFDenoiser was initialized with.
     * 
     * @parameter commandBuffer              Command buffer to encode into
     * @parameter sourceTexture              Source image to denoiser
     * @parameter destinationTexture         Denoised output image
     * @parameter sourceTexture2             Optional second source image to denoise
     * @parameter destinationTexture2        Denoised second output image, if there is a second source image
     * @parameter motionVectorTexture        Motion vector texture describing how much each texel has moved,
     *                                       in texels, since the previous frame. See the MPSSVGF object for
     *                                       more details.
     * @parameter depthNormalTexture         Texture containing linear depth in the X component and signed
     *                                       normals in the YZW components. See the MPSSVGF object for more
     *                                       details.
     * @parameter previousDepthNormalTexture Depth/normal texture from the previous frame. See the MPSSVGF
     *                                       object for more details.
     */
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

    /**
     * @brief Encode denoising kernels to a command buffer
     * 
     * @discussion Removes noise from the source texture, using the additional data in the motion vector,
     * depth/normal, and previous depth/normal textures. Returns the resulting texture. The depth/normal
     * texture should be provided as the previous depth/normal texture for the next call to this method.
     * This method will also update an internally managed temporal history to aid the denoising process.
     * To reset this history, call the clearTemporalHistory method. This method will allocate and return
     * several textures from and to the texture allocator the MPSSVGFDenoiser was initialized with. The
     * number of iterations of the bilateral filter is controlled by the bilateralFilterIterations property.
     * Larger numbers of iterations will improve the quality but reduce performance. To configure other
     * parameters of the denoising process, modify the properties of the MPSSVGF object the
     * MPSSVGFDenoiser was initialized with.
     * 
     * @parameter commandBuffer              Command buffer to encode into
     * @parameter sourceTexture              Source image to denoiser
     * @parameter motionVectorTexture        Motion vector texture describing how much each texel has moved,
     *                                       in texels, since the previous frame. See the MPSSVGF object for
     *                                       more details.
     * @parameter depthNormalTexture         Texture containing linear depth in the X component and signed
     *                                       normals in the YZW components. See the MPSSVGF object for more
     *                                       details.
     * @parameter previousDepthNormalTexture Depth/normal texture from the previous frame. See the MPSSVGF
     *                                       object for more details.
     */
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

    /**
     * @brief Initialize the MPSSVGFDenoiser object
     * 
     * @parameter device The Metal device to use for denoising
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSSVGFDenoiser initWithDevice(@Mapped(ObjCObjectMapper.class) MTLDevice device);

    /**
     * @brief Initialize the MPSSVGFDenoiser object
     * 
     * @parameter svgf             MPSSVGF kernels to use for denoising. This object can be used to
     *                             configure temporal reprojection, bilateral blur settings, etc.
     * @parameter textureAllocator An object conforming to the MPSSVGFTextureAllocator protocol. This
     *                             object will be used to allocate temporary intermediate and output
     *                             textures. This can be a custom object or an instance of the
     *                             MPSSVGFDefaultTextureAllocator class.
     */
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

    /**
     * @brief Return any temporary textures to the texture allocator. Also clears the temporal history.
     * This should be called before resizing the source texture(s).
     */
    @Generated
    @Selector("releaseTemporaryTextures")
    public native void releaseTemporaryTextures();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * @brief The number of bilateral filter iterations to run. More iterations will improve quality at
     * the cost of performance. Defaults to 5. Must be at least 1.
     */
    @Generated
    @Selector("setBilateralFilterIterations:")
    public native void setBilateralFilterIterations(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * @brief The underlying MPSSVGF kernels object which will be used for denoising. Use this object
     * to customize the denoising process.
     */
    @Generated
    @Selector("svgf")
    public native MPSSVGF svgf();

    /**
     * @brief The object which will be used to allocate intermediate and output textures.
     */
    @Generated
    @Selector("textureAllocator")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSSVGFTextureAllocator textureAllocator();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}